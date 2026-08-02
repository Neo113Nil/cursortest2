package xsna;

import com.ironsource.X3;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import xsna.je;
import xsna.m9s;

/* compiled from: MoreExecutors.java */
/* loaded from: classes13.dex */
public final class u830 extends t830 implements ScheduledExecutorService {
    public final ScheduledExecutorService c;

    /* compiled from: MoreExecutors.java */
    public static final class a<V> extends m9s.a<V> implements ScheduledFuture {
        public final ScheduledFuture<?> d;

        public a(je jeVar, ScheduledFuture scheduledFuture) {
            super(jeVar);
            this.d = scheduledFuture;
        }

        @Override // xsna.k9s, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            boolean cancel = super.cancel(z);
            if (cancel) {
                this.d.cancel(z);
            }
            return cancel;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Delayed delayed) {
            return this.d.compareTo(delayed);
        }

        @Override // java.util.concurrent.Delayed
        public final long getDelay(TimeUnit timeUnit) {
            return this.d.getDelay(timeUnit);
        }
    }

    /* compiled from: MoreExecutors.java */
    public static final class b extends je.i<Void> implements Runnable {
        public final Runnable i;

        public b(Runnable runnable) {
            runnable.getClass();
            this.i = runnable;
        }

        @Override // xsna.je
        public final String i() {
            return "task=[" + this.i + X3.j.e;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.i.run();
            } catch (Throwable th) {
                l(th);
                throw th;
            }
        }
    }

    public u830(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.c = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        ksp0 ksp0Var = new ksp0(callable);
        return new a(ksp0Var, this.c.schedule(ksp0Var, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        b bVar = new b(runnable);
        return new a(bVar, this.c.scheduleAtFixedRate(bVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        b bVar = new b(runnable);
        return new a(bVar, this.c.scheduleWithFixedDelay(bVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ksp0 ksp0Var = new ksp0(Executors.callable(runnable, null));
        return new a(ksp0Var, this.c.schedule(ksp0Var, j, timeUnit));
    }
}
