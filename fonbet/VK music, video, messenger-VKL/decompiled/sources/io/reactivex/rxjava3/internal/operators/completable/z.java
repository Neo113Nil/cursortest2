package io.reactivex.rxjava3.internal.operators.completable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: CompletableTimeout.java */
/* loaded from: classes8.dex */
public final class z extends io.reactivex.rxjava3.core.a {
    public final io.reactivex.rxjava3.core.a b;
    public final long c;
    public final TimeUnit d;
    public final io.reactivex.rxjava3.core.w e;

    /* compiled from: CompletableTimeout.java */
    public final class a implements Runnable {
        public final AtomicBoolean b;
        public final io.reactivex.rxjava3.disposables.b c;
        public final io.reactivex.rxjava3.core.c d;

        public a(AtomicBoolean atomicBoolean, io.reactivex.rxjava3.disposables.b bVar, io.reactivex.rxjava3.core.c cVar) {
            this.b = atomicBoolean;
            this.c = bVar;
            this.d = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.b.compareAndSet(false, true)) {
                this.c.e();
                z zVar = z.this;
                this.d.onError(new TimeoutException(io.reactivex.rxjava3.internal.util.f.e(zVar.c, zVar.d)));
            }
        }
    }

    /* compiled from: CompletableTimeout.java */
    public static final class b implements io.reactivex.rxjava3.core.c {
        public final io.reactivex.rxjava3.disposables.b b;
        public final AtomicBoolean c;
        public final io.reactivex.rxjava3.core.c d;

        public b(io.reactivex.rxjava3.core.c cVar, io.reactivex.rxjava3.disposables.b bVar, AtomicBoolean atomicBoolean) {
            this.b = bVar;
            this.c = atomicBoolean;
            this.d = cVar;
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onComplete() {
            if (this.c.compareAndSet(false, true)) {
                this.b.dispose();
                this.d.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onError(Throwable th) {
            if (!this.c.compareAndSet(false, true)) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                this.b.dispose();
                this.d.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            this.b.b(cVar);
        }
    }

    public z(io.reactivex.rxjava3.core.a aVar, io.reactivex.rxjava3.core.w wVar) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.b = aVar;
        this.c = 4L;
        this.d = timeUnit;
        this.e = wVar;
    }

    @Override // io.reactivex.rxjava3.core.a
    public final void p(io.reactivex.rxjava3.core.c cVar) {
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        cVar.onSubscribe(bVar);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        bVar.b(this.e.d(new a(atomicBoolean, bVar, cVar), this.c, this.d));
        this.b.subscribe(new b(cVar, bVar, atomicBoolean));
    }
}
