package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes6.dex */
public final class hc11 extends u0b {
    public final ixx0 V;
    public final ci70 W;
    public final d980 Z;
    public final zxs0 a0;
    public final lg21 b0;
    public final yvf0 c0;
    public final oep0 d0;
    public final i3y e0;
    public final cjw0 f0;

    public hc11(n0g n0gVar, ney neyVar, ixx0 ixx0Var, ci70 ci70Var, d980 d980Var, zxs0 zxs0Var, lg21 lg21Var, ic11 ic11Var, ove oveVar, oep0 oep0Var) {
        super(n0gVar, fc11.class, neyVar);
        this.V = ixx0Var;
        this.W = ci70Var;
        this.Z = d980Var;
        this.a0 = zxs0Var;
        this.b0 = lg21Var;
        this.c0 = oveVar;
        this.d0 = oep0Var;
        this.e0 = a.b(LazyThreadSafetyMode.NONE, new z411(19));
        gus gusVar = ic11Var.a;
        this.f0 = new cjw0(d980Var, (gs70) gusVar.a.get(), (o2y0) gusVar.b.get());
    }

    @Override // com.yandex.go.taxi.order.state.o, defpackage.l780, defpackage.qc5, defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.Z.e();
    }
}
