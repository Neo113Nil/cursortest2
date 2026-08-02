package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public final class q12 {
    public final r12 a;
    public final n12 b;

    public q12(Context context, ov2 ov2Var, b22 b22Var, p12 p12Var, w5 w5Var, d4 d4Var, l12 l12Var, o12 o12Var) {
        this.a = p12Var;
        l12Var.getClass();
        w12 a = l12.a(context, d4Var, ov2Var, w5Var, this);
        o12Var.getClass();
        n12 a2 = o12.a(context, ov2Var, b22Var, d4Var, a, w5Var);
        this.b = a2;
        a.a(a2.e());
    }

    public final void a() {
        n12 n12Var = this.b;
        b22 b22Var = n12Var.w;
        g9 g9Var = b22Var.a;
        if (!b22Var.c.a()) {
            n12Var.b(h9.h);
            return;
        }
        n12Var.b.a(v5.e, null);
        n12Var.A.b(le1.b, n12Var);
        n12Var.c.j = Integer.valueOf(n12Var.w.d);
        n12Var.c.a(g9Var.a);
        d4 d4Var = n12Var.c;
        d4Var.f = n12Var.w.b;
        d4Var.m = g9Var.k;
        synchronized (n12Var) {
            n12Var.c(g9Var);
        }
    }

    public /* synthetic */ q12(Context context, ov2 ov2Var, b22 b22Var, p12 p12Var, e00 e00Var, int i) {
        this(context, ov2Var, b22Var, p12Var, new w5(), new d4((i & 32) != 0 ? e00.g : e00Var), new l12(), new o12());
    }
}
