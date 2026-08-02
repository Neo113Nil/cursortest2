package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import xsna.nl6;
import xsna.vv4;

/* loaded from: classes10.dex */
public final class tl2 implements hy0 {
    public final nd1 a;
    public final Handler b;
    public final y5 c;
    public w00 d;
    public t5 e;
    public String f;

    public /* synthetic */ tl2(Context context, d4 d4Var, ov2 ov2Var, w5 w5Var, nd1 nd1Var) {
        this(nd1Var, new Handler(Looper.getMainLooper()), new y5(context, d4Var, ov2Var, w5Var));
    }

    @Override // yads.hy0
    public final void a(l4 l4Var) {
        this.c.a(l4Var.b, l4Var.c);
        this.b.post(new vv4(7, this, new l4(l4Var.a, l4Var.b, l4Var.c, this.f)));
    }

    public tl2(nd1 nd1Var, Handler handler, y5 y5Var) {
        this.a = nd1Var;
        this.b = handler;
        this.c = y5Var;
    }

    public static final void a(tl2 tl2Var, l4 l4Var) {
        w00 w00Var = tl2Var.d;
        if (w00Var != null) {
            w00Var.a(l4Var);
        }
        t5 t5Var = tl2Var.e;
        if (t5Var != null) {
            t5Var.a();
        }
    }

    @Override // yads.hy0
    public final void a(fd1 fd1Var) {
        this.c.a();
        nd1 nd1Var = this.a;
        this.b.post(new nl6(7, this, new md1(fd1Var, nd1Var.a, new si1(nd1Var.b), new ni1())));
    }

    public static final void a(tl2 tl2Var, md1 md1Var) {
        w00 w00Var = tl2Var.d;
        if (w00Var != null) {
            w00Var.a(md1Var);
        }
        t5 t5Var = tl2Var.e;
        if (t5Var != null) {
            t5Var.a();
        }
    }

    public final void a(d4 d4Var) {
        this.c.e = new j9(d4Var);
    }

    public final void a(t5 t5Var) {
        this.e = t5Var;
    }

    public final void a(gr2 gr2Var) {
        this.c.f = gr2Var;
    }
}
