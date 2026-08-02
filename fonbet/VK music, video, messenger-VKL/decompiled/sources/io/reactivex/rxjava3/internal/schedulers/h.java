package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: NewThreadWorker.java */
/* loaded from: classes11.dex */
public class h extends w.c {
    public final ScheduledExecutorService b;
    public volatile boolean c;

    public h(ThreadFactory threadFactory) {
        boolean z = i.a;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (i.a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            i.d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        this.b = newScheduledThreadPool;
    }

    @Override // io.reactivex.rxjava3.core.w.c
    public final io.reactivex.rxjava3.disposables.c a(Runnable runnable) {
        return b(runnable, 0L, null);
    }

    @Override // io.reactivex.rxjava3.core.w.c
    public final io.reactivex.rxjava3.disposables.c b(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.c ? EmptyDisposable.INSTANCE : d(runnable, j, timeUnit, null);
    }

    public final ScheduledRunnable d(Runnable runnable, long j, TimeUnit timeUnit, io.reactivex.rxjava3.disposables.d dVar) {
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(runnable, dVar);
        if (dVar != null && !dVar.b(scheduledRunnable)) {
            return scheduledRunnable;
        }
        ScheduledExecutorService scheduledExecutorService = this.b;
        try {
            scheduledRunnable.a(j <= 0 ? scheduledExecutorService.submit((Callable) scheduledRunnable) : scheduledExecutorService.schedule((Callable) scheduledRunnable, j, timeUnit));
            return scheduledRunnable;
        } catch (RejectedExecutionException e) {
            if (dVar != null) {
                dVar.a(scheduledRunnable);
            }
            io.reactivex.rxjava3.plugins.a.a(e);
            return scheduledRunnable;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.shutdownNow();
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return this.c;
    }
}
