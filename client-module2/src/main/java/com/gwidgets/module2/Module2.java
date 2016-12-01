package com.gwidgets.module2;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.FontWeight;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class Module2 implements EntryPoint {
	public void onModuleLoad() {
		
		Label label = new Label("We are in module2");
		label.getElement().getStyle().setFontSize(24, Unit.PX);
		label.getElement().getStyle().setFontWeight(FontWeight.BOLD);
		
		RootPanel.get().add(label);
		
		
	}

}
