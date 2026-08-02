package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: Scheduler.java */
/* loaded from: classes11.dex */
public abstract class w {
    public static final long a = TimeUnit.MINUTES.toNanos(Long.getLong("rx3.scheduler.drift-tolerance", 15).longValue());

    /* compiled from: Scheduler.java */
    public static final class a implements io.reactivex.rxjava3.disposables.c, Runnable {
        public final Runnable b;
        public final c c;
        public Thread d;

        public a(Runnable runnable, c cVar) {
            this.b = runnable;
            this.c = cVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            if (this.d == Thread.currentThread()) {
                c cVar = this.c;
                if (cVar instanceof io.reactivex.rxjava3.internal.schedulers.h) {
                    io.reactivex.rxjava3.internal.schedulers.h hVar = (io.reactivex.rxjava3.internal.schedulers.h) cVar;
                    if (hVar.c) {
                        return;
                    }
                    hVar.c = true;
                    hVar.b.shutdown();
                    return;
                }
            }
            this.c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.c.h();
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.d = Thread.currentThread();
            try {
                this.b.run();
            } finally {
                dispose();
                this.d = null;
            }
        }
    }

    /* compiled from: Scheduler.java */
    public static final class b implements io.reactivex.rxjava3.disposables.c, Runnable {
        public final Runnable b;
        public final c c;
        public volatile boolean d;

        public b(Runnable runnable, c cVar) {
            this.b = runnable;
            this.c = cVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.d = true;
            this.c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.d;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.d) {
                return;
            }
            try {
                this.b.run();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.c.dispose();
                throw io.reactivex.rxjava3.internal.util.f.f(th);
            }
        }
    }

    /* compiled from: Scheduler.java */
    public static abstract class c implements io.reactivex.rxjava3.disposables.c {

        /* compiled from: Scheduler.java */
        public final class a implements Runnable {
            public final Runnable b;
            public final SequentialDisposable c;
            public final long d;
            public long e;
            public long f;
            public long g;

            public a(long j, Runnable runnable, long j2, SequentialDisposable sequentialDisposable, long j3) {
                this.b = runnable;
                this.c = sequentialDisposable;
                this.d = j3;
                this.f = j2;
                this.g = j;
            }

            @Override // java.lang.Runnable
            public final void run() {
                long j;
                this.b.run();
                SequentialDisposable sequentialDisposable = this.c;
                if (sequentialDisposable.h()) {
                    return;
                }
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                c cVar = c.this;
                cVar.getClass();
                long convert = timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
                long j2 = w.a;
                long j3 = convert + j2;
                long j4 = this.f;
                long j5 = this.d;
                if (j3 < j4 || convert >= j4 + j5 + j2) {
                    j = convert + j5;
                    long j6 = this.e + 1;
                    this.e = j6;
                    this.g = j - (j5 * j6);
                } else {
                    long j7 = this.g;
                    long j8 = this.e + 1;
                    this.e = j8;
                    j = (j8 * j5) + j7;
                }
                this.f = convert;
                DisposableHelper.c(sequentialDisposable, cVar.b(this, j - convert, timeUnit));
            }
        }

        public io.reactivex.rxjava3.disposables.c a(Runnable runnable) {
            return b(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public abstract io.reactivex.rxjava3.disposables.c b(Runnable runnable, long j, TimeUnit timeUnit);

        public final io.reactivex.rxjava3.disposables.c c(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            long nanos = timeUnit.toNanos(j2);
            long convert = TimeUnit.NANOSECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
            io.reactivex.rxjava3.disposables.c b = b(new a(timeUnit.toNanos(j) + convert, runnable, convert, sequentialDisposable2, nanos), j, timeUnit);
            if (b == EmptyDisposable.INSTANCE) {
                return b;
            }
            DisposableHelper.c(sequentialDisposable, b);
            return sequentialDisposable2;
        }
    }

    public static long b(TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    public abstract c a();

    public io.reactivex.rxjava3.disposables.c c(Runnable runnable) {
        return d(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public io.reactivex.rxjava3.disposables.c d(Runnable runnable, long j, TimeUnit timeUnit) {
        c a2 = a();
        Objects.requireNonNull(runnable, "run is null");
        a aVar = new a(runnable, a2);
        a2.b(aVar, j, timeUnit);
        return aVar;
    }

    public io.reactivex.rxjava3.disposables.c e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        c a2 = a();
        b bVar = new b(runnable, a2);
        io.reactivex.rxjava3.disposables.c c2 = a2.c(bVar, j, j2, timeUnit);
        return c2 == EmptyDisposable.INSTANCE ? c2 : bVar;
    }

    public void f() {
    }
}
