package xsna;

import android.view.SubMenu;

/* compiled from: BottomNavigationMenu.java */
/* loaded from: classes11.dex */
public final class t58 extends androidx.appcompat.view.menu.f {
    @Override // androidx.appcompat.view.menu.f
    public final androidx.appcompat.view.menu.h a(int i, int i2, int i3, CharSequence charSequence) {
        if (this.f.size() + 1 <= 6) {
            return super.a(i, i2, i3, charSequence);
        }
        throw new IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 6. Limit can be checked with BottomNavigationView#getMaxItemCount()");
    }

    @Override // androidx.appcompat.view.menu.f, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
    }
}
