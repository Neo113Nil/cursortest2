package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.internal.view.SupportSubMenu;
import defpackage.ycs0;

/* loaded from: classes10.dex */
public abstract class a {
    final Context mContext;
    private ycs0 mMenuItems;
    private ycs0 mSubMenus;

    public a(Context context) {
        this.mContext = context;
    }

    public final MenuItem getMenuItemWrapper(MenuItem menuItem) {
        if (!(menuItem instanceof SupportMenuItem)) {
            return menuItem;
        }
        SupportMenuItem supportMenuItem = (SupportMenuItem) menuItem;
        if (this.mMenuItems == null) {
            this.mMenuItems = new ycs0();
        }
        MenuItem menuItem2 = (MenuItem) this.mMenuItems.get(supportMenuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemWrapperICS menuItemWrapperICS = new MenuItemWrapperICS(this.mContext, supportMenuItem);
        this.mMenuItems.put(supportMenuItem, menuItemWrapperICS);
        return menuItemWrapperICS;
    }

    public final SubMenu getSubMenuWrapper(SubMenu subMenu) {
        if (!(subMenu instanceof SupportSubMenu)) {
            return subMenu;
        }
        SupportSubMenu supportSubMenu = (SupportSubMenu) subMenu;
        if (this.mSubMenus == null) {
            this.mSubMenus = new ycs0();
        }
        SubMenu subMenu2 = (SubMenu) this.mSubMenus.get(supportSubMenu);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuWrapperICS subMenuWrapperICS = new SubMenuWrapperICS(this.mContext, supportSubMenu);
        this.mSubMenus.put(supportSubMenu, subMenuWrapperICS);
        return subMenuWrapperICS;
    }

    public final void internalClear() {
        ycs0 ycs0Var = this.mMenuItems;
        if (ycs0Var != null) {
            ycs0Var.clear();
        }
        ycs0 ycs0Var2 = this.mSubMenus;
        if (ycs0Var2 != null) {
            ycs0Var2.clear();
        }
    }

    public final void internalRemoveGroup(int i) {
        if (this.mMenuItems == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            ycs0 ycs0Var = this.mMenuItems;
            if (i2 >= ycs0Var.c) {
                return;
            }
            if (((SupportMenuItem) ycs0Var.f(i2)).getGroupId() == i) {
                this.mMenuItems.h(i2);
                i2--;
            }
            i2++;
        }
    }

    public final void internalRemoveItem(int i) {
        if (this.mMenuItems == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            ycs0 ycs0Var = this.mMenuItems;
            if (i2 >= ycs0Var.c) {
                return;
            }
            if (((SupportMenuItem) ycs0Var.f(i2)).getItemId() == i) {
                this.mMenuItems.h(i2);
                return;
            }
            i2++;
        }
    }
}
