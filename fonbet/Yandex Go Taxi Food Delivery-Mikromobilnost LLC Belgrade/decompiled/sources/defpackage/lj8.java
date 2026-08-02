package defpackage;

import com.yandex.go.payments.cards.experiments.a;

/* loaded from: classes13.dex */
public final class lj8 extends h55 implements m950 {
    public final yvf0 D;
    public final yvf0 E;
    public final yvf0 F;
    public final pw G;
    public final v88 H;
    public final a I;

    public lj8(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, pw pwVar, v88 v88Var, a aVar) {
        super(null);
        this.D = yvf0Var;
        this.E = yvf0Var2;
        this.F = yvf0Var3;
        this.G = pwVar;
        this.H = v88Var;
        this.I = aVar;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        gj8 gj8Var = (gj8) obj;
        ej8 ej8Var = gj8Var.a;
        if (ej8Var instanceof cj8) {
            xqw xqwVar = ((cj8) ej8Var).a;
            if (xqwVar == null) {
                return;
            }
            A((m950) this.D.get(), new ma0(xqwVar, gj8Var.b), new hj8(this, gj8Var));
            return;
        }
        if (ej8Var instanceof dj8) {
            P(((dj8) ej8Var).a, true, gj8Var);
        } else {
            w511.b();
        }
    }

    public final void P(erw erwVar, boolean z, gj8 gj8Var) {
        A((m950) this.F.get(), new h3e(erwVar, z, gj8Var.b), new com.yandex.go.payments.cards.navigation.a(this, gj8Var));
    }
}
