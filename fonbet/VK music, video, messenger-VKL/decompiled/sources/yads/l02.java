package yads;

import android.content.Context;
import xsna.myc0;

/* loaded from: classes10.dex */
public final class l02 implements Runnable {
    public final v9 b;
    public final e22 c;
    public final y02 d;
    public final i02 e;
    public final z30 f;
    public final /* synthetic */ n02 g;

    public l02(n02 n02Var, v9 v9Var, e22 e22Var, y02 y02Var, i02 i02Var, br2 br2Var) {
        d4 d4Var;
        Context context;
        ov2 ov2Var;
        this.g = n02Var;
        this.b = v9Var;
        this.c = e22Var;
        this.d = y02Var;
        this.e = i02Var;
        d4Var = n02Var.b;
        gp2 b = br2Var.b(v9Var, d4Var);
        context = n02Var.e;
        ov2Var = n02Var.a;
        this.f = new a40(context, ov2Var, b).a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            e22 e22Var = this.c;
            if (e22Var == null) {
                this.e.a(h9.c);
                return;
            }
            if (e22Var.a.isEmpty()) {
                this.e.a(h9.h);
                return;
            }
            e22 e22Var2 = this.c;
            v9 v9Var = this.b;
            n02 n02Var = this.g;
            sz1 sz1Var = new sz1(v9Var, n02Var.b, e22Var2);
            i02 i02Var = this.e;
            w5 w5Var = n02Var.c;
            k02 k02Var = new k02(this, i02Var, w5Var);
            w5Var.a(v5.n, null);
            n02 n02Var2 = this.g;
            r52 r52Var = n02Var2.g;
            Context context = n02Var2.e;
            d4 d4Var = n02Var2.b;
            z30 z30Var = this.f;
            i02 i02Var2 = this.e;
            r52Var.getClass();
            myc0.h(r52Var.a, new s52(i02Var2), null, new q52(context, i02Var2, k02Var, r52Var, d4Var, sz1Var, z30Var, null), 2);
        } catch (Exception unused) {
            this.e.a(h9.c);
        }
    }
}
