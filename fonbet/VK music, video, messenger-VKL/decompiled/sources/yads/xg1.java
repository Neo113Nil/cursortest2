package yads;

import android.content.Context;
import java.util.List;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class xg1 {
    public final Context a;
    public final d4 b;
    public final ah c;
    public final dv1 d;

    public /* synthetic */ xg1(Context context, d4 d4Var) {
        this(context, d4Var, new ah(context), dv1.e.a());
    }

    public final List a() {
        l4 a;
        l4 a2;
        try {
            this.c.a();
            a = null;
        } catch (xb1 e) {
            l4 l4Var = h9.a;
            a = h9.a(1, e.getMessage(), e.c);
        }
        try {
            dv1 dv1Var = this.d;
            Context context = this.a;
            if (dv1Var.b) {
                synchronized (dv1Var.a) {
                    try {
                        if (dv1Var.b) {
                            if (ub.a(context)) {
                                dv1Var.c.a(context);
                                dv1Var.d.getClass();
                                id2.a(context);
                            }
                            dv1Var.b = false;
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } finally {
                    }
                }
            }
            a2 = null;
        } catch (xb1 e2) {
            l4 l4Var2 = h9.a;
            a2 = h9.a(1, e2.getMessage(), e2.c);
        }
        d4 d4Var = this.b;
        return xsna.rl3.I(new l4[]{a, a2, d4Var.c.a == null ? h9.l : null, d4Var.e == null ? h9.i : null});
    }

    public xg1(Context context, d4 d4Var, ah ahVar, dv1 dv1Var) {
        this.a = context;
        this.b = d4Var;
        this.c = ahVar;
        this.d = dv1Var;
    }
}
