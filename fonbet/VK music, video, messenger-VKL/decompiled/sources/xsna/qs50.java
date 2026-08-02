package xsna;

import xsna.cxs;
import xsna.ijg0;
import xsna.j11;

/* compiled from: MyTargetRewardAd.kt */
/* loaded from: classes6.dex */
public final class qs50 implements ijg0.a {
    public final /* synthetic */ ss50 a;

    public qs50(ss50 ss50Var) {
        this.a = ss50Var;
    }

    @Override // xsna.ijg0.a
    public final void b() {
        cxs.a aVar = this.a.a;
        if (aVar != null) {
            aVar.onClick();
        }
    }

    @Override // xsna.ijg0.a
    public final void d() {
        cxs.a aVar = this.a.a;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // xsna.ijg0.a
    public final void e(iaz0 iaz0Var) {
        cxs.a aVar = this.a.a;
        if (aVar != null) {
            aVar.d(new j11.b(iaz0Var.a, iaz0Var.b));
        }
    }

    @Override // xsna.ijg0.a
    public final void h(ijg0 ijg0Var) {
        ss50 ss50Var = this.a;
        cxs.a aVar = ss50Var.a;
        if (aVar != null) {
            aVar.e(ss50Var);
        }
    }

    @Override // xsna.ijg0.a
    public final void i() {
        cxs.a aVar = this.a.a;
        if (aVar != null) {
            aVar.c(new j11.b(1309, "Failed to show ad"));
        }
    }

    @Override // xsna.ijg0.a
    public final void j() {
        cxs.a aVar = this.a.a;
        if (aVar != null) {
            aVar.onDismiss();
        }
    }

    @Override // xsna.ijg0.a
    public final void l(fvr fvrVar) {
        cxs.a aVar = this.a.a;
        if (aVar != null) {
            aVar.onCompleted();
        }
    }
}
