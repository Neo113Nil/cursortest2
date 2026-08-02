package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: IoScheduler.java */
/* loaded from: classes11.dex */
public final class f extends w {
    public static final RxThreadFactory c;
    public static final RxThreadFactory d;
    public static final c g;
    public static final a h;
    public final AtomicReference<a> b;
    public static final TimeUnit f = TimeUnit.SECONDS;
    public static final long e = Long.getLong("rx3.io-keep-alive-time", 60).longValue();

    /* compiled from: IoScheduler.java */
    public static final class a implements Runnable {
        public final long b;
        public final ConcurrentLinkedQueue<c> c;
        public final io.reactivex.rxjava3.disposables.b d;
        public final ScheduledExecutorService e;
        public final ScheduledFuture f;
        public final ThreadFactory g;

        public a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            a aVar;
            ScheduledExecutorService scheduledExecutorService;
            ScheduledFuture<?> scheduledFuture;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.b = nanos;
            this.c = new ConcurrentLinkedQueue<>();
            this.d = new io.reactivex.rxjava3.disposables.b();
            this.g = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, f.d);
                aVar = this;
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(aVar, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                aVar = this;
                scheduledExecutorService = null;
                scheduledFuture = null;
            }
            aVar.e = scheduledExecutorService;
            aVar.f = scheduledFuture;
        }

        public final void a() {
            this.d.dispose();
            ScheduledFuture scheduledFuture = this.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.e;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            ConcurrentLinkedQueue<c> concurrentLinkedQueue = this.c;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            long nanoTime = System.nanoTime();
            Iterator<c> it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (next.d > nanoTime) {
                    return;
                }
                if (concurrentLinkedQueue.remove(next)) {
                    this.d.a(next);
                }
            }
        }
    }

    /* compiled from: IoScheduler.java */
    /* loaded from: classes8.dex */
    public static final class b extends w.c {
        public final a c;
        public final c d;
        public final AtomicBoolean e = new AtomicBoolean();
        public final io.reactivex.rxjava3.disposables.b b = new io.reactivex.rxjava3.disposables.b();

        public b(a aVar) {
            c cVar;
            c cVar2;
            this.c = aVar;
            if (aVar.d.c) {
                cVar2 = f.g;
            } else {
                while (true) {
                    if (aVar.c.isEmpty()) {
                        cVar = new c(aVar.g);
                        aVar.d.b(cVar);
                        break;
                    } else {
                        cVar = aVar.c.poll();
                        if (cVar != null) {
                            break;
                        }
                    }
                }
                cVar2 = cVar;
            }
            this.d = cVar2;
        }

        @Override // io.reactivex.rxjava3.core.w.c
        public final io.reactivex.rxjava3.disposables.c b(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.b.c ? EmptyDisposable.INSTANCE : this.d.d(runnable, j, timeUnit, this.b);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            if (this.e.compareAndSet(false, true)) {
                this.b.dispose();
                a aVar = this.c;
                aVar.getClass();
                long nanoTime = System.nanoTime() + aVar.b;
                c cVar = this.d;
                cVar.d = nanoTime;
                aVar.c.offer(cVar);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.e.get();
        }
    }

    /* compiled from: IoScheduler.java */
    public static final class c extends h {
        public long d;

        public c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.d = 0L;
        }
    }

    static {
        c cVar = new c(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        g = cVar;
        cVar.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx3.io-priority", 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxCachedThreadScheduler", max, false);
        c = rxThreadFactory;
        d = new RxThreadFactory("RxCachedWorkerPoolEvictor", max, false);
        a aVar = new a(0L, null, rxThreadFactory);
        h = aVar;
        aVar.a();
    }

    public f() {
        a aVar = h;
        AtomicReference<a> atomicReference = new AtomicReference<>(aVar);
        this.b = atomicReference;
        a aVar2 = new a(e, f, c);
        while (!atomicReference.compareAndSet(aVar, aVar2)) {
            if (atomicReference.get() != aVar) {
                aVar2.a();
                return;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.w
    public final w.c a() {
        return new b(this.b.get());
    }

    @Override // io.reactivex.rxjava3.core.w
    public final void f() {
        AtomicReference<a> atomicReference = this.b;
        a aVar = h;
        a andSet = atomicReference.getAndSet(aVar);
        if (andSet != aVar) {
            andSet.a();
        }
    }
}
