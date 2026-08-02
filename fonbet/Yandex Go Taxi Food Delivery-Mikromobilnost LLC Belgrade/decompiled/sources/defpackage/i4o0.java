package defpackage;

import ru.yandex.taxi.layers.presentation.walkroute.simple.b;

/* loaded from: classes13.dex */
public final class i4o0 extends h55 {
    public final krl0 D;
    public final yvf0 E;
    public final yvf0 F;
    public final z8n0 G;
    public final h3y H;
    public final i7n0 I;

    public i4o0(krl0 krl0Var, yvf0 yvf0Var, yvf0 yvf0Var2, z8n0 z8n0Var, h3y h3yVar, i7n0 i7n0Var) {
        super(null);
        this.D = krl0Var;
        this.E = yvf0Var;
        this.F = yvf0Var2;
        this.G = z8n0Var;
        this.H = h3yVar;
        this.I = i7n0Var;
    }

    public static final void P(i4o0 i4o0Var) {
        h3y h3yVar = i4o0Var.H;
        b bVar = (b) h3yVar.get();
        g641 g641Var = bVar.d;
        if (g641Var != null) {
            g641Var.Lg();
        }
        bVar.e = null;
        krl0 krl0Var = i4o0Var.D;
        obn0 obn0Var = (obn0) krl0Var.b;
        obn0Var.b.l(null);
        obn0Var.a = 0;
        ((a3v) krl0Var.a).t4(wfz.P);
        ((b) h3yVar.get()).c.g(zy11.a);
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        o6n0 o6n0Var = (o6n0) obj;
        krl0 krl0Var = this.D;
        ((obn0) krl0Var.b).a++;
        b bVar = (b) this.H.get();
        bVar.e = krl0Var;
        g641 g641Var = bVar.d;
        if (g641Var != null) {
            g641Var.Ig(krl0Var);
        }
        A((m950) this.G.get(), new g0o0(null), sy60.Q2);
        A((m950) this.F.get(), new zro0(null), new h4o0(this, o6n0Var));
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        j(dpb.a);
    }
}
