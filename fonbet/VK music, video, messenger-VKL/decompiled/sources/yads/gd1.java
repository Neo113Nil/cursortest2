package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public final class gd1 implements my0 {
    public final Context a;
    public final ov2 b;

    public gd1(Context context, ov2 ov2Var) {
        this.a = context;
        this.b = ov2Var;
    }

    @Override // yads.my0
    public final ry0 a(v9 v9Var, d4 d4Var, cy0 cy0Var) {
        return new fd1(this.a, v9Var, d4Var, this.b, cy0Var, new j22(d4Var));
    }
}
