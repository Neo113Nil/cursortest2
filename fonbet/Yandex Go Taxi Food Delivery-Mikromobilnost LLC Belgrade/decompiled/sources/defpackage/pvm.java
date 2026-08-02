package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;

/* loaded from: classes14.dex */
public final class pvm extends h55 {
    public final yvf0 D;
    public final yvf0 E;
    public final wiq0 F;
    public final h3y G;

    public pvm(yvf0 yvf0Var, yvf0 yvf0Var2, wiq0 wiq0Var, h3y h3yVar) {
        super(null);
        this.D = yvf0Var;
        this.E = yvf0Var2;
        this.F = wiq0Var;
        this.G = h3yVar;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        qvm qvmVar = (qvm) obj;
        pex0 m = ((k) this.F).m();
        fom0 fom0Var = m != null ? m.D0 : null;
        if (m == null || fom0Var == null) {
            P(qvmVar);
            return;
        }
        if (fom0Var.equals(dom0.a)) {
            Q(false, qvmVar);
            return;
        }
        if (fom0Var.equals(eom0.a)) {
            Q(true, qvmVar);
            return;
        }
        if (fom0Var instanceof bom0) {
            ((a60) ((y50) this.G.get())).c(((bom0) fom0Var).a, new v770(qvmVar.a.getValue()));
            r(new qu(9));
        } else if (fom0Var.equals(com0.a)) {
            P(qvmVar);
        } else {
            w511.b();
        }
    }

    public final void P(qvm qvmVar) {
        qvmVar.getClass();
        A((m950) this.E.get(), new vxm(qvmVar.a.getValue(), qxm.a, lxm.a), new wui(this, 4));
    }

    public final void Q(boolean z, qvm qvmVar) {
        qvmVar.getClass();
        A((m950) this.D.get(), new o1n(qvmVar.a.getValue(), f1n.a, ozm.c, new izm(z)), new ovm(this, 0));
    }
}
