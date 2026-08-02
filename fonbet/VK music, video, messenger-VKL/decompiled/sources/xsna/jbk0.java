package xsna;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SnapshotThreadLocal.kt */
/* loaded from: classes.dex */
public final class jbk0<T> {
    public final AtomicReference<fro0> a = new AtomicReference<>(yfb.a);
    public final Object b = new Object();
    public T c;

    public final T a() {
        long f = ey2.f();
        if (f == sro0.a) {
            return this.c;
        }
        fro0 fro0Var = this.a.get();
        int a = fro0Var.a(f);
        if (a >= 0) {
            return (T) fro0Var.c[a];
        }
        return null;
    }

    public final void b(T t) {
        long f = ey2.f();
        if (f == sro0.a) {
            this.c = t;
            return;
        }
        synchronized (this.b) {
            fro0 fro0Var = this.a.get();
            int a = fro0Var.a(f);
            if (a >= 0) {
                fro0Var.c[a] = t;
            } else {
                this.a.set(fro0Var.b(f, t));
                s3q0 s3q0Var = s3q0.a;
            }
        }
    }
}
