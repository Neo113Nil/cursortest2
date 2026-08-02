package defpackage;

import android.os.Looper;

/* loaded from: classes15.dex */
public final class bbb implements e1k {
    public final ry10 a;
    public final /* synthetic */ cbb b;

    public bbb(cbb cbbVar, ry10 ry10Var) {
        this.b = cbbVar;
        this.a = ry10Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        x08 x08Var;
        cbb cbbVar = this.b;
        z83.g(null, cbbVar.b, Looper.myLooper());
        zq60 zq60Var = cbbVar.a;
        zq60Var.d(this);
        if (zq60Var.isEmpty() && (x08Var = cbbVar.j) != null) {
            x08Var.cancel();
            cbbVar.j = null;
        }
        cbbVar.h.clear();
    }
}
