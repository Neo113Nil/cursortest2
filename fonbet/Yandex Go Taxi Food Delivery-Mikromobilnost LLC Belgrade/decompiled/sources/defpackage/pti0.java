package defpackage;

import android.os.Looper;

/* loaded from: classes8.dex */
public final class pti0 implements e1k {
    public final uti0 a;
    public final /* synthetic */ qti0 b;

    public pti0(qti0 qti0Var, uti0 uti0Var) {
        this.b = qti0Var;
        z83.g(null, qti0Var.a, Looper.myLooper());
        this.a = uti0Var;
        qti0Var.b.b(uti0Var);
        if (qti0Var.d) {
            z83.g(null, (Looper) uti0Var.x.b, Looper.myLooper());
            uti0Var.a.post(new tti0(uti0Var, 1));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        qti0 qti0Var = this.b;
        z83.g(null, qti0Var.a, Looper.myLooper());
        qti0Var.b.d(this.a);
    }
}
