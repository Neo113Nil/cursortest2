package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public final class as2 extends gy0 {
    public final vl2 F;
    public final tr2 G;

    public as2(Context context, ov2 ov2Var, r5 r5Var, g9 g9Var, d4 d4Var, w5 w5Var, j22 j22Var, yr2 yr2Var, vl2 vl2Var, tr2 tr2Var) {
        super(context, d4Var, ov2Var, vl2Var, w5Var, yr2Var, j22Var);
        this.F = vl2Var;
        this.G = tr2Var;
        d4Var.a(g9Var);
        vl2Var.a(new zr2(r5Var, this));
        vl2Var.a(d4Var);
        vl2Var.a(j22Var);
    }

    @Override // yads.gy0
    public final cy0 a(dy0 dy0Var) {
        return dy0Var.b(this);
    }

    @Override // yads.gy0, yads.vq2
    public final void a(v9 v9Var) {
        rr2 rr2Var = v9Var.r;
        this.G.getClass();
        if (rr2Var != null && (!rr2Var.b ? rr2Var.c != null : rr2Var.d != null)) {
            super.a(v9Var);
        } else {
            b(h9.c);
        }
    }

    public final void a(q10 q10Var) {
        vl2 vl2Var = this.F;
        vl2Var.e = q10Var;
        vl2Var.c.a(q10Var);
    }
}
