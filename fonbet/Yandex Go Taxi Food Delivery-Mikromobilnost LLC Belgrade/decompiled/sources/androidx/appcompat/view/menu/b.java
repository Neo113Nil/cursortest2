package androidx.appcompat.view.menu;

import defpackage.s19;

/* loaded from: classes10.dex */
public final class b implements Runnable {
    public final /* synthetic */ s19 a;
    public final /* synthetic */ MenuItemImpl b;
    public final /* synthetic */ MenuBuilder c;
    public final /* synthetic */ c w;

    public b(c cVar, s19 s19Var, MenuItemImpl menuItemImpl, MenuBuilder menuBuilder) {
        this.w = cVar;
        this.a = s19Var;
        this.b = menuItemImpl;
        this.c = menuBuilder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CascadingMenuPopup cascadingMenuPopup = this.w.a;
        s19 s19Var = this.a;
        if (s19Var != null) {
            cascadingMenuPopup.mShouldCloseImmediately = true;
            s19Var.b.close(false);
            cascadingMenuPopup.mShouldCloseImmediately = false;
        }
        MenuItemImpl menuItemImpl = this.b;
        if (menuItemImpl.isEnabled() && menuItemImpl.hasSubMenu()) {
            this.c.performItemAction(menuItemImpl, 4);
        }
    }
}
