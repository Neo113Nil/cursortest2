package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public class itx0 {
    public boolean b;
    public final Object a = new Object();
    public final ArrayDeque c = new ArrayDeque();
    public final AtomicReference d = new AtomicReference();

    public final void a(Runnable runnable, Executor executor) {
        synchronized (this.a) {
            try {
                if (this.b) {
                    this.c.add(new aub1(runnable, executor));
                } else {
                    this.b = true;
                    c(runnable, executor);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.a) {
            try {
                if (this.c.isEmpty()) {
                    this.b = false;
                    return;
                }
                aub1 aub1Var = (aub1) this.c.remove();
                c(aub1Var.b, aub1Var.a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(new j6b1(1, this, runnable));
        } catch (RejectedExecutionException unused) {
            b();
        }
    }
}
