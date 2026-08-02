package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.MenuItemImpl;
import defpackage.jvh0;
import defpackage.leh0;
import defpackage.q650;

/* loaded from: classes11.dex */
public class NavigationBarSubheaderView extends FrameLayout implements q650 {
    private boolean expanded;
    private MenuItemImpl itemData;
    boolean onlyShowWhenExpanded;
    private final TextView subheaderLabel;
    private ColorStateList textColor;

    public NavigationBarSubheaderView(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(jvh0.m3_navigation_menu_subheader, (ViewGroup) this, true);
        this.subheaderLabel = (TextView) findViewById(leh0.navigation_menu_subheader_label);
    }

    private void updateVisibility() {
        MenuItemImpl menuItemImpl = this.itemData;
        if (menuItemImpl != null) {
            setVisibility((!menuItemImpl.isVisible() || (!this.expanded && this.onlyShowWhenExpanded)) ? 8 : 0);
        }
    }

    @Override // defpackage.wn10
    public MenuItemImpl getItemData() {
        return this.itemData;
    }

    @Override // defpackage.wn10
    public void initialize(MenuItemImpl menuItemImpl, int i) {
        this.itemData = menuItemImpl;
        menuItemImpl.setCheckable(false);
        this.subheaderLabel.setText(menuItemImpl.getTitle());
        updateVisibility();
    }

    public boolean isExpanded() {
        return this.expanded;
    }

    public boolean isOnlyVisibleWhenExpanded() {
        return this.onlyShowWhenExpanded;
    }

    @Override // defpackage.wn10
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
    }

    @Override // defpackage.q650
    public void setExpanded(boolean z) {
        this.expanded = z;
        updateVisibility();
    }

    public void setIcon(Drawable drawable) {
    }

    @Override // defpackage.q650
    public void setOnlyShowWhenExpanded(boolean z) {
        this.onlyShowWhenExpanded = z;
        updateVisibility();
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearance(int i) {
        this.subheaderLabel.setTextAppearance(i);
        ColorStateList colorStateList = this.textColor;
        if (colorStateList != null) {
            this.subheaderLabel.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.textColor = colorStateList;
        if (colorStateList != null) {
            this.subheaderLabel.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
    }

    public boolean showsIcon() {
        return false;
    }
}
