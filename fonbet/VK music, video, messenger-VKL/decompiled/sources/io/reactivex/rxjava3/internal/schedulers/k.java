package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: TrampolineScheduler.java */
/* loaded from: classes11.dex */
public final class k extends w {
    public static final /* synthetic */ int b = 0;

    /* compiled from: TrampolineScheduler.java */
    /* loaded from: classes8.dex */
    public static final class a implements Runnable {
        public final Runnable b;
        public final c c;
        public final long d;

        public a(Runnable runnable, c cVar, long j) {
            this.b = runnable;
            this.c = cVar;
            this.d = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.c.e) {
                return;
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long convert = timeUnit.convert(System.currentTimeMillis(), timeUnit);
            long j = this.d;
            if (j > convert) {
                try {
                    Thread.sleep(j - convert);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    io.reactivex.rxjava3.plugins.a.a(e);
                    return;
                }
            }
            if (this.c.e) {
                return;
            }
            this.b.run();
        }
    }

    /* compiled from: TrampolineScheduler.java */
    /* loaded from: classes8.dex */
    public static final class b implements Comparable<b> {
        public final Runnable b;
        public final long c;
        public final int d;
        public volatile boolean e;

        public b(Runnable runnable, Long l, int i) {
            this.b = runnable;
            this.c = l.longValue();
            this.d = i;
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            b bVar2 = bVar;
            int compare = Long.compare(this.c, bVar2.c);
            return compare == 0 ? Integer.compare(this.d, bVar2.d) : compare;
        }
    }

    /* compiled from: TrampolineScheduler.java */
    /* loaded from: classes8.dex */
    public static final class c extends w.c {
        public final PriorityBlockingQueue<b> b = new PriorityBlockingQueue<>();
        public final AtomicInteger c = new AtomicInteger();
        public final AtomicInteger d = new AtomicInteger();
        public volatile boolean e;

        /* compiled from: TrampolineScheduler.java */
        public final class a implements Runnable {
            public final b b;

            public a(b bVar) {
                this.b = bVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.b.e = true;
                c.this.b.remove(this.b);
            }
        }

        @Override // io.reactivex.rxjava3.core.w.c
        public final io.reactivex.rxjava3.disposables.c a(Runnable runnable) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return d(timeUnit.convert(System.currentTimeMillis(), timeUnit), runnable);
        }

        @Override // io.reactivex.rxjava3.core.w.c
        public final io.reactivex.rxjava3.disposables.c b(Runnable runnable, long j, TimeUnit timeUnit) {
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            long millis = timeUnit.toMillis(j) + timeUnit2.convert(System.currentTimeMillis(), timeUnit2);
            return d(millis, new a(runnable, this, millis));
        }

        public final io.reactivex.rxjava3.disposables.c d(long j, Runnable runnable) {
            if (this.e) {
                return EmptyDisposable.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j), this.d.incrementAndGet());
            this.b.add(bVar);
            if (this.c.getAndIncrement() != 0) {
                return new io.reactivex.rxjava3.disposables.f(new a(bVar));
            }
            int i = 1;
            while (!this.e) {
                b poll = this.b.poll();
                if (poll == null) {
                    i = this.c.addAndGet(-i);
                    if (i == 0) {
                        return EmptyDisposable.INSTANCE;
                    }
                } else if (!poll.e) {
                    poll.b.run();
                }
            }
            this.b.clear();
            return EmptyDisposable.INSTANCE;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.e = true;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.e;
        }
    }

    static {
        new k();
    }

    @Override // io.reactivex.rxjava3.core.w
    public final w.c a() {
        return new c();
    }

    @Override // io.reactivex.rxjava3.core.w
    public final io.reactivex.rxjava3.disposables.c c(Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        runnable.run();
        return EmptyDisposable.INSTANCE;
    }

    @Override // io.reactivex.rxjava3.core.w
    public final io.reactivex.rxjava3.disposables.c d(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            Objects.requireNonNull(runnable, "run is null");
            runnable.run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            io.reactivex.rxjava3.plugins.a.a(e);
        }
        return EmptyDisposable.INSTANCE;
    }
}
