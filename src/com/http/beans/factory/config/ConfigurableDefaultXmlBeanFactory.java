package com.http.beans.factory.config;

import com.http.beans.bean.XMLDefinition;
import com.http.beans.bean.XMLFormatElement;
import com.http.beans.factory.support.DefaultXmlBeanFactory;

/**
 *  
 * @Project:JDMHA
 * @file:ConfigurableDefaultXmlBeanFactory.java
 *
 * @Author:chenssy
 * @email:chenssy995812509@163.com
 * @url : <a href="http://cmsblogs.com">http://cmsblogs.com</a>
 * @qq : 122448894
 *
 * @data:2016年1月15日
 */
public class ConfigurableDefaultXmlBeanFactory {
	
	/**
	 * 注册Definition
	 * 
	 * @author:chenssy
	 * @data:2016年1月15日
	 *
	 * @param definition
	 */
	public static void registerXmlDefinition(XMLDefinition definition){
		DefaultXmlBeanFactory factory = DefaultXmlBeanFactory.getInstance();
		factory.registerXmlDefinition(definition);
	}
	
	/**
	 * 获取Definition
	 * @author:chenssy
	 * @data:2016年1月15日
	 *
	 * @param definitionName
	 * @return
	 */
	public static XMLDefinition getXmlDefinition(String definitionName){
		DefaultXmlBeanFactory factory = DefaultXmlBeanFactory.getInstance();
		return factory.getXmlDefinition(definitionName);
	}
	
	/**
	 * 获取模板文件XMLFormatElement
	 * @author:chenssy
	 * @data:2016年1月15日
	 *
	 * @param definitionName
	 * @return
	 */
	public static XMLFormatElement getXmlFormatElement(String definitionName){
		if(definitionName.endsWith("Send")){
			return getXmlDefinition(definitionName).getSentFormatElement();
		}else{
			return getXmlDefinition(definitionName).getReceiveFormatElement();
		}
	}
}
