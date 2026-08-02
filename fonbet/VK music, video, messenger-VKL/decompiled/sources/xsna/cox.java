package xsna;

import com.ironsource.X3;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;
import xsna.ksp0;

/* compiled from: InterruptibleTask.java */
/* loaded from: classes13.dex */
public abstract class cox<T> extends AtomicReference<Runnable> implements Runnable {
    public static final b b = new b();
    public static final b c = new b();

    public abstract T d() throws Exception;

    public abstract String g();

    public final void h(Thread thread) {
        Runnable runnable = get();
        a aVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof a;
            b bVar = c;
            if (!z2 && runnable != bVar) {
                break;
            }
            if (z2) {
                aVar = (a) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == bVar || compareAndSet(runnable, bVar)) {
                z = Thread.interrupted() || z;
                LockSupport.park(aVar);
            }
            runnable = get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        T t = null;
        if (compareAndSet(null, currentThread)) {
            ksp0.a aVar = (ksp0.a) this;
            boolean isDone = ksp0.this.isDone();
            b bVar = b;
            if (!isDone) {
                try {
                    t = d();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, bVar)) {
                            h(currentThread);
                        }
                        if (isDone) {
                            return;
                        }
                        ksp0.this.l(th);
                        return;
                    } finally {
                        if (!compareAndSet(currentThread, bVar)) {
                            h(currentThread);
                        }
                        if (!isDone) {
                            ksp0.this.k(null);
                        }
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == b) {
            str = "running=[DONE]";
        } else if (runnable instanceof a) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + X3.j.e;
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder b2 = ho8.b(str, ", ");
        b2.append(g());
        return b2.toString();
    }

    /* compiled from: InterruptibleTask.java */
    public static final class a extends AbstractOwnableSynchronizer implements Runnable {
        private final cox<?> task;

        public a() {
            throw null;
        }

        public a(ksp0.a aVar) {
            this.task = aVar;
        }

        public static void a(a aVar, Thread thread) {
            aVar.setExclusiveOwnerThread(thread);
        }

        public final String toString() {
            return this.task.toString();
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* compiled from: InterruptibleTask.java */
    public static final class b implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
        }
    }
}
