package yads;

import android.content.Context;
import xsna.myc0;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class u52 {
    public final qw2 a;
    public final n02 b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ u52(Context context, ov2 ov2Var, d4 d4Var, w5 w5Var) {
        this(d4Var, new qw2(ov2Var), new n02(context.getApplicationContext(), ov2Var, d4Var, w5Var, r6));
        yvj a = z10.a((sm0) ((mv3) ov2Var).a());
    }

    public final void a(v9 v9Var, t52 t52Var, ar2 ar2Var) {
        e22 e22Var = (e22) v9Var.t;
        if (e22Var == null) {
            t52Var.a(h9.c);
            ar2Var.a();
            return;
        }
        ar2Var.a(e22Var);
        y02 a = this.a.a(v9Var);
        z32 z32Var = new z32(t52Var);
        n02 n02Var = this.b;
        myc0.h(n02Var.d, null, null, new m02(n02Var, v9Var, e22Var, a, z32Var, null), 3);
    }

    public u52(d4 d4Var, qw2 qw2Var, n02 n02Var) {
        this.a = qw2Var;
        this.b = n02Var;
        w52 w52Var = w52.c;
        d4Var.e();
    }
}
