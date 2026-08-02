package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import xsna.ku5;

/* loaded from: classes10.dex */
public final class vl2 implements hy0 {
    public final fs2 a;
    public final Handler b;
    public final y5 c;
    public String d;
    public q10 e;
    public t5 f;

    public /* synthetic */ vl2(Context context, d4 d4Var, ov2 ov2Var, w5 w5Var, fs2 fs2Var) {
        this(fs2Var, new Handler(Looper.getMainLooper()), new y5(context, d4Var, ov2Var, w5Var));
    }

    @Override // yads.hy0
    public final void a(l4 l4Var) {
        this.c.a(l4Var.b, l4Var.c);
        this.b.post(new ku5(6, l4Var, this));
    }

    public vl2(fs2 fs2Var, Handler handler, y5 y5Var) {
        this.a = fs2Var;
        this.b = handler;
        this.c = y5Var;
    }

    public static final void a(l4 l4Var, vl2 vl2Var) {
        l4 l4Var2 = new l4(l4Var.a, l4Var.b, l4Var.c, vl2Var.d);
        q10 q10Var = vl2Var.e;
        if (q10Var != null) {
            q10Var.a(l4Var2);
        }
        t5 t5Var = vl2Var.f;
        if (t5Var != null) {
            t5Var.a();
        }
    }

    @Override // yads.hy0
    public final void a(xr2 xr2Var) {
        this.c.a();
        fs2 fs2Var = this.a;
        this.b.post(new xsna.js2(7, this, new es2(xr2Var, fs2Var.a, new si1(fs2Var.b), new ni1())));
    }

    public static final void a(vl2 vl2Var, es2 es2Var) {
        q10 q10Var = vl2Var.e;
        if (q10Var != null) {
            q10Var.a(es2Var);
        }
        t5 t5Var = vl2Var.f;
        if (t5Var != null) {
            t5Var.a();
        }
    }

    public final void a(d4 d4Var) {
        this.c.e = new j9(d4Var);
    }

    public final void a(t5 t5Var) {
        this.f = t5Var;
    }

    public final void a(gr2 gr2Var) {
        this.c.f = gr2Var;
    }
}
