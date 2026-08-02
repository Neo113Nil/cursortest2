package com.google.android.material.navigation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.MenuItemImpl;
import defpackage.jvh0;
import defpackage.q650;

/* loaded from: classes11.dex */
public class NavigationBarDividerView extends FrameLayout implements q650 {
    private boolean dividersEnabled;
    private boolean expanded;
    boolean onlyShowWhenExpanded;

    public NavigationBarDividerView(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(jvh0.m3_navigation_menu_divider, (ViewGroup) this, true);
        updateVisibility();
    }

    @Override // defpackage.wn10
    public MenuItemImpl getItemData() {
        return null;
    }

    @Override // defpackage.wn10
    public void initialize(MenuItemImpl menuItemImpl, int i) {
        updateVisibility();
    }

    public boolean isExpanded() {
        return this.expanded;
    }

    public boolean isOnlyVisibleWhenExpanded() {
        return this.onlyShowWhenExpanded;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // defpackage.wn10
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setDividersEnabled(boolean z) {
        this.dividersEnabled = z;
        updateVisibility();
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

    public void setTitle(CharSequence charSequence) {
    }

    public boolean showsIcon() {
        return false;
    }

    public void updateVisibility() {
        setVisibility((!this.dividersEnabled || (!this.expanded && this.onlyShowWhenExpanded)) ? 8 : 0);
    }
}
