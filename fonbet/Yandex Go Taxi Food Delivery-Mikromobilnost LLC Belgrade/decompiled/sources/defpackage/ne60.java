package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ne60 extends AbstractExecutorService implements Executor, AutoCloseable {
    public final Executor a;

    public ne60(Executor executor) {
        this.a = executor;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return false;
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        if (this == ForkJoinPool.commonPool()) {
        } else {
            shutdown();
            while (true) {
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        xby.t(jst.e, "OkHttpDispatch", null, "OkHttp used shutdown() method from NonTerminatingExecutorService", 6);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        xby.t(jst.e, "OkHttpDispatch", null, "OkHttp used shutdownNow() method from NonTerminatingExecutorService", 6);
        return new ArrayList();
    }
}
