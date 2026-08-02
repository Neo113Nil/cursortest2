package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public final class yr2 implements my0 {
    public final Context a;
    public final ov2 b;

    public yr2(Context context, ov2 ov2Var) {
        this.a = context;
        this.b = ov2Var;
    }

    @Override // yads.my0
    public final ry0 a(v9 v9Var, d4 d4Var, cy0 cy0Var) {
        Context context = this.a;
        ov2 ov2Var = this.b;
        xl2 xl2Var = new xl2();
        return new xr2(context, v9Var, d4Var, ov2Var, cy0Var, xl2Var, new qs2(xl2Var), new j22(d4Var), new cu2(d4Var, ov2Var));
    }
}
