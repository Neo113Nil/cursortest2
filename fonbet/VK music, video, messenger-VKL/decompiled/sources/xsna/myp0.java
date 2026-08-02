package xsna;

import androidx.compose.ui.node.LayoutNode;

/* compiled from: UiApplier.android.kt */
/* loaded from: classes11.dex */
public final class myp0 extends oc {
    @Override // xsna.fd3
    public final void c() {
        androidx.compose.ui.node.p pVar = ((LayoutNode) this.a).o;
        if (pVar != null) {
            pVar.h();
        }
    }

    @Override // xsna.fd3
    public final void d() {
        ((LayoutNode) this.b).f();
    }

    @Override // xsna.fd3
    public final void e(int i, Object obj) {
        ((LayoutNode) this.b).N(i, (LayoutNode) obj);
    }

    @Override // xsna.fd3
    public final void g(int i, int i2) {
        ((LayoutNode) this.b).a0(i, i2);
    }

    @Override // xsna.fd3
    public final void h(int i, int i2, int i3) {
        ((LayoutNode) this.b).V(i, i2, i3);
    }

    @Override // xsna.fd3
    public final /* bridge */ /* synthetic */ void i(int i, Object obj) {
    }

    @Override // xsna.oc
    public final void s() {
        ((LayoutNode) this.a).Z();
    }
}
