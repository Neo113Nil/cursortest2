package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableSampleTimed.java */
/* loaded from: classes8.dex */
public final class d2<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {
    public final long c;
    public final TimeUnit d;
    public final io.reactivex.rxjava3.core.w e;
    public final boolean f;

    /* compiled from: ObservableSampleTimed.java */
    public static final class a<T> extends c<T> {
        private static final long serialVersionUID = -7139995637533111443L;
        final AtomicInteger wip;

        public a(io.reactivex.rxjava3.observers.e eVar, long j, TimeUnit timeUnit, io.reactivex.rxjava3.core.w wVar) {
            super(eVar, j, timeUnit, wVar);
            this.wip = new AtomicInteger(1);
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.d2.c
        public final void d() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.downstream.onNext(andSet);
            }
            if (this.wip.decrementAndGet() == 0) {
                this.downstream.onComplete();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.wip.incrementAndGet() == 2) {
                T andSet = getAndSet(null);
                if (andSet != null) {
                    this.downstream.onNext(andSet);
                }
                if (this.wip.decrementAndGet() == 0) {
                    this.downstream.onComplete();
                }
            }
        }
    }

    /* compiled from: ObservableSampleTimed.java */
    public static final class b<T> extends c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        @Override // io.reactivex.rxjava3.internal.operators.observable.d2.c
        public final void d() {
            this.downstream.onComplete();
        }

        @Override // java.lang.Runnable
        public final void run() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.downstream.onNext(andSet);
            }
        }
    }

    /* compiled from: ObservableSampleTimed.java */
    public static abstract class c<T> extends AtomicReference<T> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;
        final io.reactivex.rxjava3.core.v<? super T> downstream;
        final long period;
        final io.reactivex.rxjava3.core.w scheduler;
        final AtomicReference<io.reactivex.rxjava3.disposables.c> timer = new AtomicReference<>();
        final TimeUnit unit;
        io.reactivex.rxjava3.disposables.c upstream;

        public c(io.reactivex.rxjava3.observers.e eVar, long j, TimeUnit timeUnit, io.reactivex.rxjava3.core.w wVar) {
            this.downstream = eVar;
            this.period = j;
            this.unit = timeUnit;
            this.scheduler = wVar;
        }

        public abstract void d();

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            DisposableHelper.a(this.timer);
            this.upstream.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.upstream.h();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            DisposableHelper.a(this.timer);
            d();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            DisposableHelper.a(this.timer);
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            lazySet(t);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.upstream, cVar)) {
                this.upstream = cVar;
                this.downstream.onSubscribe(this);
                io.reactivex.rxjava3.core.w wVar = this.scheduler;
                long j = this.period;
                DisposableHelper.c(this.timer, wVar.e(this, j, j, this.unit));
            }
        }
    }

    public d2(io.reactivex.rxjava3.core.q qVar, long j, TimeUnit timeUnit, io.reactivex.rxjava3.core.w wVar, boolean z) {
        super(qVar);
        this.c = j;
        this.d = timeUnit;
        this.e = wVar;
        this.f = z;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        io.reactivex.rxjava3.observers.e eVar = new io.reactivex.rxjava3.observers.e(vVar);
        boolean z = this.f;
        io.reactivex.rxjava3.core.t<T> tVar = this.b;
        if (z) {
            tVar.subscribe(new a(eVar, this.c, this.d, this.e));
        } else {
            tVar.subscribe(new b(eVar, this.c, this.d, this.e));
        }
    }
}
