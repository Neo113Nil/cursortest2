package xsna;

import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: ScheduledExecutorServiceWatchdog.kt */
/* loaded from: classes17.dex */
public final class w7h0 extends n3q implements ScheduledExecutorService {
    public final sep0 m;

    public w7h0(sep0 sep0Var, p3q p3qVar) {
        super(sep0Var, p3qVar, null, false, 56);
        this.m = sep0Var;
    }

    @Override // xsna.n3q, java.lang.AutoCloseable
    public final void close() {
        pep0 pep0Var;
        boolean isTerminated;
        if (this == ForkJoinPool.commonPool() || (isTerminated = (pep0Var = this.b).isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = pep0Var.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.m.schedule(v(runnable, m()), j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.m.scheduleAtFixedRate(v(runnable, m()), j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.m.scheduleAtFixedRate(v(runnable, m()), j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        return this.m.schedule(s(callable, m()), j, timeUnit);
    }
}
