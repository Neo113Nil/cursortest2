package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public final class qs2 {
    public final rs2 a;

    public qs2(xl2 xl2Var) {
        this.a = xl2Var;
    }

    public final ps2 a(Context context, v9 v9Var, ov2 ov2Var, d4 d4Var) {
        rr2 rr2Var;
        if (v9Var != null && (rr2Var = v9Var.r) != null) {
            if (rr2Var.b) {
                cz2 cz2Var = rr2Var.d;
                if (cz2Var != null) {
                    return new az2(cz2Var, new za(context, ov2Var, d4Var));
                }
            } else {
                rv rvVar = rr2Var.c;
                if (rvVar != null) {
                    return new pv(this.a, new fx2(rvVar.b, rvVar.c));
                }
            }
        }
        return null;
    }
}
