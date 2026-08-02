package xsna;

import xsna.kxb0;
import xsna.oxb0;

/* compiled from: PopupSettingsFeature.kt */
/* loaded from: classes6.dex */
public final class mxb0 extends wk50<txb0, rxb0, kxb0, oxb0> {
    public final nxb0 f;

    public mxb0(nxb0 nxb0Var, qxb0 qxb0Var) {
        super(kxb0.b.b, qxb0Var);
        this.f = nxb0Var;
        this.e.b(nxb0Var.a.subscribe(new l8w(new fda0(this, 2), 16)));
    }

    @Override // xsna.wk50
    public final void N(rxb0 rxb0Var, kxb0 kxb0Var) {
        kxb0 kxb0Var2 = kxb0Var;
        boolean z = kxb0Var2 instanceof kxb0.b;
        nxb0 nxb0Var = this.f;
        if (z) {
            T(oxb0.b.b);
            nxb0Var.a(nxb0Var.d.b().h(new a960(new b810(nxb0Var, 17), 7)));
        } else if (kxb0Var2 instanceof kxb0.c) {
            boolean z2 = ((kxb0.c) kxb0Var2).b;
            nxb0Var.a(new io.reactivex.rxjava3.internal.operators.single.n(nxb0Var.d.a(z2), new tk40(new lv2(nxb0Var, z2, 4), 10)).h(new m5y(new mu0(nxb0Var, z2, 3), 18)));
        } else if (kxb0Var2 instanceof kxb0.d) {
            boolean z3 = ((kxb0.d) kxb0Var2).b;
            nxb0Var.a(new io.reactivex.rxjava3.internal.operators.single.n(nxb0Var.d.c(z3), new n240(new x4g(nxb0Var, z3, 1), 10)).h(new m3y(new f58(nxb0Var, z3, 5), 12)));
        }
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        nxb0 nxb0Var = this.f;
        nxb0Var.a.onComplete();
        nxb0Var.c.dispose();
    }
}
