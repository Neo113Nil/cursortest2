package xsna;

import androidx.annotation.Nullable;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class kb01 extends dd01 {
    public static final AtomicLong n = new AtomicLong(Long.MIN_VALUE);

    @Nullable
    public jb01 f;

    @Nullable
    public jb01 g;
    public final PriorityBlockingQueue h;
    public final LinkedBlockingQueue i;
    public final hb01 j;
    public final hb01 k;
    public final Object l;
    public final Semaphore m;

    public kb01(mb01 mb01Var) {
        super(mb01Var);
        this.l = new Object();
        this.m = new Semaphore(2);
        this.h = new PriorityBlockingQueue();
        this.i = new LinkedBlockingQueue();
        this.j = new hb01(this, "Thread death: Uncaught exception on worker thread");
        this.k = new hb01(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // xsna.q1t
    public final void k() {
        if (Thread.currentThread() != this.f) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // xsna.dd01
    public final boolean l() {
        return false;
    }

    public final void o() {
        if (Thread.currentThread() != this.g) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Nullable
    public final Object p(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            kb01 kb01Var = ((mb01) this.b).k;
            mb01.k(kb01Var);
            kb01Var.s(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                k901 k901Var = ((mb01) this.b).j;
                mb01.k(k901Var);
                k901Var.l.a("Interrupted waiting for ".concat(str));
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            k901 k901Var2 = ((mb01) this.b).j;
            mb01.k(k901Var2);
            k901Var2.l.a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final ib01 q(Callable callable) throws IllegalStateException {
        m();
        ib01 ib01Var = new ib01(this, callable, false);
        if (Thread.currentThread() != this.f) {
            v(ib01Var);
            return ib01Var;
        }
        if (!this.h.isEmpty()) {
            k901 k901Var = ((mb01) this.b).j;
            mb01.k(k901Var);
            k901Var.l.a("Callable skipped the worker queue.");
        }
        ib01Var.run();
        return ib01Var;
    }

    public final void r(Runnable runnable) throws IllegalStateException {
        m();
        ib01 ib01Var = new ib01(this, runnable, false, "Task exception on network thread");
        synchronized (this.l) {
            try {
                this.i.add(ib01Var);
                jb01 jb01Var = this.g;
                if (jb01Var == null) {
                    jb01 jb01Var2 = new jb01(this, "Measurement Network", this.i);
                    this.g = jb01Var2;
                    jb01Var2.setUncaughtExceptionHandler(this.k);
                    this.g.start();
                } else {
                    synchronized (jb01Var.b) {
                        jb01Var.b.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s(Runnable runnable) throws IllegalStateException {
        m();
        v(new ib01(this, runnable, false, "Task exception on worker thread"));
    }

    public final void t(Runnable runnable) throws IllegalStateException {
        m();
        v(new ib01(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean u() {
        return Thread.currentThread() == this.f;
    }

    public final void v(ib01 ib01Var) {
        synchronized (this.l) {
            try {
                this.h.add(ib01Var);
                jb01 jb01Var = this.f;
                if (jb01Var == null) {
                    jb01 jb01Var2 = new jb01(this, "Measurement Worker", this.h);
                    this.f = jb01Var2;
                    jb01Var2.setUncaughtExceptionHandler(this.j);
                    this.f.start();
                } else {
                    synchronized (jb01Var.b) {
                        jb01Var.b.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
