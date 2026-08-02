package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ObservableUnsubscribeOn.java */
/* loaded from: classes8.dex */
public final class z2<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {
    public final io.reactivex.rxjava3.core.w c;

    /* compiled from: ObservableUnsubscribeOn.java */
    public static final class a<T> extends AtomicBoolean implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = 1015244841293359600L;
        final io.reactivex.rxjava3.core.v<? super T> downstream;
        final io.reactivex.rxjava3.core.w scheduler;
        io.reactivex.rxjava3.disposables.c upstream;

        /* compiled from: ObservableUnsubscribeOn.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.z2$a$a, reason: collision with other inner class name */
        public final class RunnableC2151a implements Runnable {
            public RunnableC2151a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.upstream.dispose();
            }
        }

        public a(io.reactivex.rxjava3.core.v<? super T> vVar, io.reactivex.rxjava3.core.w wVar) {
            this.downstream = vVar;
            this.scheduler = wVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.scheduler.c(new RunnableC2151a());
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return get();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            if (get()) {
                return;
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (get()) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            if (get()) {
                return;
            }
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.upstream, cVar)) {
                this.upstream = cVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public z2(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.core.w wVar) {
        super(qVar);
        this.c = wVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        this.b.subscribe(new a(vVar, this.c));
    }
}
