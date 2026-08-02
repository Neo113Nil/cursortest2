package com.google.android.material.navigation;

import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.MenuBuilder;
import defpackage.unr0;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class a {
    public final MenuBuilder a;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public final ArrayList b = new ArrayList();

    public a(MenuBuilder menuBuilder) {
        this.a = menuBuilder;
        b();
    }

    public final MenuItem a(int i) {
        return (MenuItem) this.b.get(i);
    }

    public final void b() {
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.c = 0;
        this.d = 0;
        this.e = 0;
        int i = 0;
        while (true) {
            MenuBuilder menuBuilder = this.a;
            if (i >= menuBuilder.size()) {
                break;
            }
            MenuItem item = menuBuilder.getItem(i);
            if (item.hasSubMenu()) {
                if (!arrayList.isEmpty() && !(unr0.k(1, arrayList) instanceof DividerMenuItem) && item.isVisible()) {
                    arrayList.add(new DividerMenuItem());
                }
                arrayList.add(item);
                SubMenu subMenu = item.getSubMenu();
                for (int i2 = 0; i2 < subMenu.size(); i2++) {
                    MenuItem item2 = subMenu.getItem(i2);
                    if (!item.isVisible()) {
                        item2.setVisible(false);
                    }
                    arrayList.add(item2);
                    this.c++;
                    if (item2.isVisible()) {
                        this.d++;
                    }
                }
                arrayList.add(new DividerMenuItem());
            } else {
                arrayList.add(item);
                this.c++;
                if (item.isVisible()) {
                    this.d++;
                    this.e++;
                }
            }
            i++;
        }
        if (arrayList.isEmpty() || !(unr0.k(1, arrayList) instanceof DividerMenuItem)) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }
}
