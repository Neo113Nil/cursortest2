package sg.bigo.ads.bh;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public final class e extends ThreadPoolExecutor implements AutoCloseable {
    public final AtomicInteger a;

    public e(String str, int i, int i2) {
        super(i2, i, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new c(str, false));
        this.a = new AtomicInteger(0);
    }

    public static void a(a aVar) {
        c.a(aVar);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        this.a.decrementAndGet();
        super.afterExecute(runnable, th);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean isTerminated;
        if (this == ForkJoinPool.commonPool() || (isTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = awaitTermination(1L, TimeUnit.DAYS);
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

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.incrementAndGet();
        super.execute(runnable);
    }

    public e(String str, int i, boolean z) {
        super(0, i, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new c(str, z));
        this.a = new AtomicInteger(0);
    }
}
