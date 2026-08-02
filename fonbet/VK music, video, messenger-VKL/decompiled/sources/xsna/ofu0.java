package xsna;

/* compiled from: VkBrowserActionMenu.kt */
/* loaded from: classes6.dex */
public final class ofu0 implements iz20 {
    public final /* synthetic */ com.vk.superapp.browser.internal.ui.menu.action.n b;
    public final /* synthetic */ boolean c;

    public ofu0(com.vk.superapp.browser.internal.ui.menu.action.n nVar, boolean z) {
        this.b = nVar;
        this.c = z;
    }

    @Override // xsna.iz20
    public final void n(dw20 dw20Var) {
        com.vk.superapp.browser.internal.ui.menu.action.n nVar = this.b;
        dw20Var.Un(nVar);
        if (this.c) {
            com.vk.superapp.browser.internal.ui.menu.action.c cVar = nVar.i;
            cVar.j = true;
            cVar.f();
        }
    }
}
