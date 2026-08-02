package defpackage;

import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.Choreographer;

/* loaded from: classes8.dex */
public final class edr {
    public final av20 a;
    public int f;
    public boolean d = true;
    public final SparseArray e = new SparseArray();
    public final Handler g = new Handler(Looper.getMainLooper());
    public final long b = 2000;
    public boolean c = false;

    public edr(av20 av20Var) {
        this.a = av20Var;
    }

    public final void a(long j, String str) {
        this.e.clear();
        lwa0 lwa0Var = new lwa0(j);
        this.c = true;
        Choreographer.getInstance().postFrameCallback(new ddr(this, lwa0Var, str));
    }

    public final void b(gfp0 gfp0Var) {
        int f = gfp0Var.f();
        this.f = f * f;
        int a = gfp0Var.b() == 5 ? gfp0Var.a() : 0;
        this.e.put(gfp0Var.e(a), new PointF(gfp0Var.g(a), gfp0Var.h(a)));
    }
}
