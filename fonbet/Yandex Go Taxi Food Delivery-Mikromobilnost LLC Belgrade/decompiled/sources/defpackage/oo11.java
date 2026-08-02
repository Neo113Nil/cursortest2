package defpackage;

import ru.yandex.taxi.cashback.router.f;

/* loaded from: classes5.dex */
public final class oo11 extends h55 {
    public final f D;
    public final yvf0 E;
    public final yvf0 F;
    public final gqc G;

    public oo11(f fVar, yvf0 yvf0Var, yvf0 yvf0Var2, gqc gqcVar) {
        super(null);
        this.D = fVar;
        this.E = yvf0Var;
        this.F = yvf0Var2;
        this.G = gqcVar;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        f fVar = this.D;
        pzt0 pzt0Var = fVar.d;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        fVar.d = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        this.D.b(new zr01(15, (jo11) obj, this));
    }

    public final void P(jo11 jo11Var) {
        A((m950) this.F.get(), new h59(jo11Var.b, jo11Var.c), new mo11(this, jo11Var));
    }

    public final void Q(jo11 jo11Var) {
        A((m950) this.E.get(), new u770(jo11Var.b), new mo11(this, jo11Var));
    }
}
