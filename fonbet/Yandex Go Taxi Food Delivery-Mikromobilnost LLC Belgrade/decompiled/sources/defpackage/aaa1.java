package defpackage;

import com.google.android.gms.measurement.internal.g;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class aaa1 extends mha1 {
    public static final AtomicLong E = new AtomicLong(Long.MIN_VALUE);
    public final f9a1 A;
    public final f9a1 B;
    public final Object C;
    public final Semaphore D;
    public t9a1 w;
    public t9a1 x;
    public final PriorityBlockingQueue y;
    public final LinkedBlockingQueue z;

    public aaa1(g gVar) {
        super(gVar);
        this.C = new Object();
        this.D = new Semaphore(2);
        this.y = new PriorityBlockingQueue();
        this.z = new LinkedBlockingQueue();
        this.A = new f9a1(this, "Thread death: Uncaught exception on worker thread");
        this.B = new f9a1(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // defpackage.r8
    public final void Gg() {
        if (Thread.currentThread() == this.w) {
            return;
        }
        ny61.r("Call expected from worker thread");
    }

    @Override // defpackage.mha1
    public final boolean Hg() {
        return false;
    }

    public final void Kg() {
        if (Thread.currentThread() == this.x) {
            return;
        }
        ny61.r("Call expected from network thread");
    }

    public final void Lg() {
        if (Thread.currentThread() != this.w) {
            return;
        }
        ny61.r("Call not expected from worker thread");
    }

    public final boolean Mg() {
        return Thread.currentThread() == this.w;
    }

    public final n9a1 Ng(Callable callable) {
        Ig();
        n9a1 n9a1Var = new n9a1(this, callable, false);
        if (Thread.currentThread() != this.w) {
            Tg(n9a1Var);
            return n9a1Var;
        }
        if (!this.y.isEmpty()) {
            y1a1 y1a1Var = ((g) this.b).y;
            g.g(y1a1Var);
            y1a1Var.C.a("Callable skipped the worker queue.");
        }
        n9a1Var.run();
        return n9a1Var;
    }

    public final n9a1 Og(Callable callable) {
        Ig();
        n9a1 n9a1Var = new n9a1(this, callable, true);
        if (Thread.currentThread() == this.w) {
            n9a1Var.run();
            return n9a1Var;
        }
        Tg(n9a1Var);
        return n9a1Var;
    }

    public final void Pg(Runnable runnable) {
        Ig();
        cvw.l(runnable);
        Tg(new n9a1(this, runnable, false, "Task exception on worker thread"));
    }

    public final Object Qg(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            aaa1 aaa1Var = ((g) this.b).z;
            g.g(aaa1Var);
            aaa1Var.Pg(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                y1a1 y1a1Var = ((g) this.b).y;
                g.g(y1a1Var);
                l1a1 l1a1Var = y1a1Var.C;
                StringBuilder sb = new StringBuilder(str.length() + 24);
                sb.append("Interrupted waiting for ");
                sb.append(str);
                l1a1Var.a(sb.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            y1a1 y1a1Var2 = ((g) this.b).y;
            g.g(y1a1Var2);
            y1a1Var2.C.a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void Rg(Runnable runnable) {
        Ig();
        Tg(new n9a1(this, runnable, true, "Task exception on worker thread"));
    }

    public final void Sg(Runnable runnable) {
        Ig();
        n9a1 n9a1Var = new n9a1(this, runnable, false, "Task exception on network thread");
        synchronized (this.C) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.z;
                linkedBlockingQueue.add(n9a1Var);
                t9a1 t9a1Var = this.x;
                if (t9a1Var == null) {
                    t9a1 t9a1Var2 = new t9a1(this, "Measurement Network", linkedBlockingQueue);
                    this.x = t9a1Var2;
                    t9a1Var2.setUncaughtExceptionHandler(this.B);
                    this.x.start();
                } else {
                    Object obj = t9a1Var.a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void Tg(n9a1 n9a1Var) {
        synchronized (this.C) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.y;
                priorityBlockingQueue.add(n9a1Var);
                t9a1 t9a1Var = this.w;
                if (t9a1Var == null) {
                    t9a1 t9a1Var2 = new t9a1(this, "Measurement Worker", priorityBlockingQueue);
                    this.w = t9a1Var2;
                    t9a1Var2.setUncaughtExceptionHandler(this.A);
                    this.w.start();
                } else {
                    Object obj = t9a1Var.a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
