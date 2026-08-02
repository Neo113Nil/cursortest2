package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableThrottleFirstTimed.java */
/* loaded from: classes11.dex */
public final class s2<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {
    public final long c;
    public final TimeUnit d;
    public final io.reactivex.rxjava3.core.w e;

    /* compiled from: ObservableThrottleFirstTimed.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c, Runnable {
        private static final long serialVersionUID = 786994795061867455L;
        final io.reactivex.rxjava3.core.v<? super T> downstream;
        volatile boolean gate;
        final long timeout;
        final TimeUnit unit;
        io.reactivex.rxjava3.disposables.c upstream;
        final w.c worker;

        public a(io.reactivex.rxjava3.observers.e eVar, long j, TimeUnit timeUnit, w.c cVar) {
            this.downstream = eVar;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = cVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.upstream.dispose();
            this.worker.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.worker.h();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            this.downstream.onComplete();
            this.worker.dispose();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            if (this.gate) {
                return;
            }
            this.gate = true;
            this.downstream.onNext(t);
            io.reactivex.rxjava3.disposables.c cVar = get();
            if (cVar != null) {
                cVar.dispose();
            }
            DisposableHelper.c(this, this.worker.b(this, this.timeout, this.unit));
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.upstream, cVar)) {
                this.upstream = cVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.gate = false;
        }
    }

    public s2(io.reactivex.rxjava3.core.q qVar, long j, TimeUnit timeUnit, io.reactivex.rxjava3.core.w wVar) {
        super(qVar);
        this.c = j;
        this.d = timeUnit;
        this.e = wVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        this.b.subscribe(new a(new io.reactivex.rxjava3.observers.e(vVar), this.c, this.d, this.e.a()));
    }
}
