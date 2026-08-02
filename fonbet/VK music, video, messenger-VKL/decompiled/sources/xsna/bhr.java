package xsna;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: FinalizedThreadPoolExecutor.kt */
/* loaded from: classes.dex */
public final class bhr extends ThreadPoolExecutor implements AutoCloseable {
    public bhr(int i, int i2, long j, BlockingQueue blockingQueue, boolean z, ThreadFactory threadFactory) {
        super(i, i2, j, TimeUnit.MILLISECONDS, (BlockingQueue<Runnable>) blockingQueue, threadFactory);
        if (!z || j <= 0) {
            return;
        }
        allowCoreThreadTimeOut(true);
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

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void finalize() {
        shutdown();
    }
}
