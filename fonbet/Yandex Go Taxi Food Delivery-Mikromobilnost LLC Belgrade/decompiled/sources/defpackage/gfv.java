package defpackage;

import com.yandex.images.NetworkUtils$ConnectionStrength;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes15.dex */
public final class gfv extends ThreadPoolExecutor implements AutoCloseable {
    public final void a(NetworkUtils$ConnectionStrength networkUtils$ConnectionStrength) {
        int i = efv.a[networkUtils$ConnectionStrength.ordinal()];
        int i2 = 2;
        if (i == 2) {
            i2 = 1;
        } else if (i != 3) {
            i2 = (i == 5 || i == 6) ? 4 : 3;
        }
        setCorePoolSize(i2);
        setMaximumPoolSize(i2);
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

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        ffv ffvVar = new ffv((v06) runnable);
        execute(ffvVar);
        return ffvVar;
    }
}
