package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleScheduler.java */
/* loaded from: classes11.dex */
public final class j extends w {
    public static final RxThreadFactory c;
    public static final ScheduledExecutorService d;
    public final AtomicReference<ScheduledExecutorService> b;

    /* compiled from: SingleScheduler.java */
    /* loaded from: classes8.dex */
    public static final class a extends w.c {
        public final ScheduledExecutorService b;
        public final io.reactivex.rxjava3.disposables.b c = new io.reactivex.rxjava3.disposables.b();
        public volatile boolean d;

        public a(ScheduledExecutorService scheduledExecutorService) {
            this.b = scheduledExecutorService;
        }

        @Override // io.reactivex.rxjava3.core.w.c
        public final io.reactivex.rxjava3.disposables.c b(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.d) {
                return EmptyDisposable.INSTANCE;
            }
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(runnable, this.c);
            this.c.b(scheduledRunnable);
            try {
                scheduledRunnable.a(j <= 0 ? this.b.submit((Callable) scheduledRunnable) : this.b.schedule((Callable) scheduledRunnable, j, timeUnit));
                return scheduledRunnable;
            } catch (RejectedExecutionException e) {
                dispose();
                io.reactivex.rxjava3.plugins.a.a(e);
                return EmptyDisposable.INSTANCE;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            if (this.d) {
                return;
            }
            this.d = true;
            this.c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.d;
        }
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        d = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        c = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.single-priority", 5).intValue())), true);
    }

    public j() {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.b = atomicReference;
        boolean z = i.a;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, c);
        if (i.a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            i.d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        atomicReference.lazySet(newScheduledThreadPool);
    }

    @Override // io.reactivex.rxjava3.core.w
    public final w.c a() {
        return new a(this.b.get());
    }

    @Override // io.reactivex.rxjava3.core.w
    public final io.reactivex.rxjava3.disposables.c d(Runnable runnable, long j, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run is null");
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable);
        AtomicReference<ScheduledExecutorService> atomicReference = this.b;
        try {
            scheduledDirectTask.a(j <= 0 ? atomicReference.get().submit(scheduledDirectTask) : atomicReference.get().schedule(scheduledDirectTask, j, timeUnit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e) {
            io.reactivex.rxjava3.plugins.a.a(e);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // io.reactivex.rxjava3.core.w
    public final io.reactivex.rxjava3.disposables.c e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        AtomicReference<ScheduledExecutorService> atomicReference = this.b;
        if (j2 > 0) {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnable);
            try {
                scheduledDirectPeriodicTask.a(atomicReference.get().scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
                return scheduledDirectPeriodicTask;
            } catch (RejectedExecutionException e) {
                io.reactivex.rxjava3.plugins.a.a(e);
                return EmptyDisposable.INSTANCE;
            }
        }
        ScheduledExecutorService scheduledExecutorService = atomicReference.get();
        e eVar = new e(scheduledExecutorService, runnable);
        try {
            eVar.a(j <= 0 ? scheduledExecutorService.submit(eVar) : scheduledExecutorService.schedule(eVar, j, timeUnit));
            return eVar;
        } catch (RejectedExecutionException e2) {
            io.reactivex.rxjava3.plugins.a.a(e2);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // io.reactivex.rxjava3.core.w
    public final void f() {
        AtomicReference<ScheduledExecutorService> atomicReference = this.b;
        ScheduledExecutorService scheduledExecutorService = d;
        ScheduledExecutorService andSet = atomicReference.getAndSet(scheduledExecutorService);
        if (andSet != scheduledExecutorService) {
            andSet.shutdownNow();
        }
    }
}
