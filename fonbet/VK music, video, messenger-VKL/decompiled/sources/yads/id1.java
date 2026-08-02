package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public final class id1 extends gy0 {
    public final tl2 F;

    public id1(Context context, ov2 ov2Var, r5 r5Var, g9 g9Var, w5 w5Var, d4 d4Var, j22 j22Var, gd1 gd1Var, tl2 tl2Var) {
        super(context, d4Var, ov2Var, tl2Var, w5Var, gd1Var, j22Var);
        this.F = tl2Var;
        d4Var.a(g9Var);
        tl2Var.a(new hd1(r5Var, this));
        tl2Var.a(d4Var);
        tl2Var.a(j22Var);
    }

    @Override // yads.gy0
    public final cy0 a(dy0 dy0Var) {
        return dy0Var.c(this);
    }

    public final void a(w00 w00Var) {
        tl2 tl2Var = this.F;
        tl2Var.d = w00Var;
        tl2Var.c.a(w00Var);
    }
}
