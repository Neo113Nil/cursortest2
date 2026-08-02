package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ComputationScheduler.java */
/* loaded from: classes11.dex */
public final class b extends w {
    public static final C2157b c;
    public static final RxThreadFactory d;
    public static final int e;
    public static final c f;
    public final AtomicReference<C2157b> b;

    /* compiled from: ComputationScheduler.java */
    /* loaded from: classes8.dex */
    public static final class a extends w.c {
        public final io.reactivex.rxjava3.internal.disposables.a b;
        public final io.reactivex.rxjava3.disposables.b c;
        public final io.reactivex.rxjava3.internal.disposables.a d;
        public final c e;
        public volatile boolean f;

        public a(c cVar) {
            this.e = cVar;
            io.reactivex.rxjava3.internal.disposables.a aVar = new io.reactivex.rxjava3.internal.disposables.a();
            this.b = aVar;
            io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
            this.c = bVar;
            io.reactivex.rxjava3.internal.disposables.a aVar2 = new io.reactivex.rxjava3.internal.disposables.a();
            this.d = aVar2;
            aVar2.b(aVar);
            aVar2.b(bVar);
        }

        @Override // io.reactivex.rxjava3.core.w.c
        public final io.reactivex.rxjava3.disposables.c a(Runnable runnable) {
            return this.f ? EmptyDisposable.INSTANCE : this.e.d(runnable, 0L, TimeUnit.MILLISECONDS, this.b);
        }

        @Override // io.reactivex.rxjava3.core.w.c
        public final io.reactivex.rxjava3.disposables.c b(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.f ? EmptyDisposable.INSTANCE : this.e.d(runnable, j, timeUnit, this.c);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            if (this.f) {
                return;
            }
            this.f = true;
            this.d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.f;
        }
    }

    /* compiled from: ComputationScheduler.java */
    /* renamed from: io.reactivex.rxjava3.internal.schedulers.b$b, reason: collision with other inner class name */
    public static final class C2157b {
        public final int a;
        public final c[] b;
        public long c;

        public C2157b(int i, ThreadFactory threadFactory) {
            this.a = i;
            this.b = new c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.b[i2] = new c(threadFactory);
            }
        }

        public final c a() {
            int i = this.a;
            if (i == 0) {
                return b.f;
            }
            long j = this.c;
            this.c = 1 + j;
            return this.b[(int) (j % i)];
        }

        public final void b() {
            for (c cVar : this.b) {
                cVar.dispose();
            }
        }
    }

    /* compiled from: ComputationScheduler.java */
    public static final class c extends h {
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx3.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        e = availableProcessors;
        c cVar = new c(new RxThreadFactory("RxComputationShutdown"));
        f = cVar;
        cVar.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx3.computation-priority", 5).intValue())), true);
        d = rxThreadFactory;
        C2157b c2157b = new C2157b(0, rxThreadFactory);
        c = c2157b;
        c2157b.b();
    }

    public b() {
        C2157b c2157b = c;
        AtomicReference<C2157b> atomicReference = new AtomicReference<>(c2157b);
        this.b = atomicReference;
        C2157b c2157b2 = new C2157b(e, d);
        while (!atomicReference.compareAndSet(c2157b, c2157b2)) {
            if (atomicReference.get() != c2157b) {
                c2157b2.b();
                return;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.w
    public final w.c a() {
        return new a(this.b.get().a());
    }

    @Override // io.reactivex.rxjava3.core.w
    public final io.reactivex.rxjava3.disposables.c d(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.b.get().a().b;
        Objects.requireNonNull(runnable, "run is null");
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable);
        try {
            scheduledDirectTask.a(j <= 0 ? scheduledExecutorService.submit(scheduledDirectTask) : scheduledExecutorService.schedule(scheduledDirectTask, j, timeUnit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e2) {
            io.reactivex.rxjava3.plugins.a.a(e2);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // io.reactivex.rxjava3.core.w
    public final io.reactivex.rxjava3.disposables.c e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        c a2 = this.b.get().a();
        ScheduledExecutorService scheduledExecutorService = a2.b;
        if (j2 <= 0) {
            e eVar = new e(scheduledExecutorService, runnable);
            try {
                eVar.a(j <= 0 ? scheduledExecutorService.submit(eVar) : scheduledExecutorService.schedule(eVar, j, timeUnit));
                return eVar;
            } catch (RejectedExecutionException e2) {
                io.reactivex.rxjava3.plugins.a.a(e2);
                return EmptyDisposable.INSTANCE;
            }
        }
        ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnable);
        try {
            scheduledDirectPeriodicTask.a(a2.b.scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e3) {
            io.reactivex.rxjava3.plugins.a.a(e3);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // io.reactivex.rxjava3.core.w
    public final void f() {
        AtomicReference<C2157b> atomicReference = this.b;
        C2157b c2157b = c;
        C2157b andSet = atomicReference.getAndSet(c2157b);
        if (andSet != c2157b) {
            andSet.b();
        }
    }
}
