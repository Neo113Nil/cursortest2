package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import defpackage.ny61;
import defpackage.unr0;
import defpackage.w511;
import defpackage.xvz;

/* loaded from: classes11.dex */
public final class NavigationBarMenu extends MenuBuilder {
    public static final int NO_MAX_ITEM_LIMIT = Integer.MAX_VALUE;
    private final int maxItemCount;
    private final boolean subMenuSupported;
    private final Class<?> viewClass;

    public NavigationBarMenu(Context context, Class<?> cls, int i, boolean z) {
        super(context);
        this.viewClass = cls;
        this.maxItemCount = i;
        this.subMenuSupported = z;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public MenuItem addInternal(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= this.maxItemCount) {
            stopDispatchingItemsChanged();
            MenuItem addInternal = super.addInternal(i, i2, i3, charSequence);
            startDispatchingItemsChanged();
            return addInternal;
        }
        String simpleName = this.viewClass.getSimpleName();
        ny61.g(xvz.h(this.maxItemCount, ". Limit can be checked with ", simpleName, "#getMaxItemCount()", unr0.x("Maximum number of items supported by ", simpleName, " is ")));
        return null;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        if (!this.subMenuSupported) {
            w511.x(this.viewClass.getSimpleName().concat(" does not support submenus"));
            return null;
        }
        MenuItemImpl menuItemImpl = (MenuItemImpl) addInternal(i, i2, i3, charSequence);
        NavigationBarSubMenu navigationBarSubMenu = new NavigationBarSubMenu(getContext(), this, menuItemImpl);
        menuItemImpl.setSubMenu(navigationBarSubMenu);
        return navigationBarSubMenu;
    }

    public int getMaxItemCount() {
        return this.maxItemCount;
    }
}
