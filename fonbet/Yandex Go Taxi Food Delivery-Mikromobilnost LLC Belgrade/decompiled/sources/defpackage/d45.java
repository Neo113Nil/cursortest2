package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;

/* loaded from: classes10.dex */
public abstract class d45 implements xm10 {
    public xn10 A;
    public int B;
    public Context a;
    public Context b;
    public MenuBuilder c;
    public LayoutInflater w;
    public wm10 x;
    public int y;
    public int z;

    @Override // defpackage.xm10
    public final boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // defpackage.xm10
    public final boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // defpackage.xm10
    public final int getId() {
        return this.B;
    }
}
