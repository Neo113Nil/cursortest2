package defpackage;

import android.os.Looper;

/* loaded from: classes15.dex */
public final class jta0 implements e1k {
    public final ita0 a;
    public final hta0 b;
    public final /* synthetic */ kta0 c;

    public jta0(kta0 kta0Var, ita0 ita0Var, hta0 hta0Var) {
        this.c = kta0Var;
        this.a = ita0Var;
        this.b = hta0Var;
        kta0Var.c.b(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        kta0 kta0Var = this.c;
        z83.g(null, kta0Var.a, Looper.myLooper());
        kta0Var.c.d(this);
    }
}
