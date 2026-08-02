package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class p3t0 {
    public final AtomicReference a = new AtomicReference(jl40.e);
    public final Object b = new Object();
    public Object c;

    public final Object a() {
        long i = qke.i();
        if (i == hzy0.a) {
            return this.c;
        }
        eyy0 eyy0Var = (eyy0) this.a.get();
        int a = eyy0Var.a(i);
        if (a >= 0) {
            return eyy0Var.c[a];
        }
        return null;
    }

    public final void b(Object obj) {
        long i = qke.i();
        if (i == hzy0.a) {
            this.c = obj;
            return;
        }
        synchronized (this.b) {
            eyy0 eyy0Var = (eyy0) this.a.get();
            int a = eyy0Var.a(i);
            if (a < 0) {
                this.a.set(eyy0Var.b(i, obj));
            } else {
                eyy0Var.c[a] = obj;
            }
        }
    }
}
