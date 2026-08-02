package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;

/* compiled from: ObservableTimeInterval.java */
/* loaded from: classes8.dex */
public final class u2<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, io.reactivex.rxjava3.schedulers.b<T>> {
    public final io.reactivex.rxjava3.core.w c;
    public final TimeUnit d;

    /* compiled from: ObservableTimeInterval.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.v<? super io.reactivex.rxjava3.schedulers.b<T>> b;
        public final TimeUnit c;
        public final io.reactivex.rxjava3.core.w d;
        public long e;
        public io.reactivex.rxjava3.disposables.c f;

        public a(io.reactivex.rxjava3.core.v<? super io.reactivex.rxjava3.schedulers.b<T>> vVar, TimeUnit timeUnit, io.reactivex.rxjava3.core.w wVar) {
            this.b = vVar;
            this.d = wVar;
            this.c = timeUnit;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.f.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.f.h();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            this.b.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            this.b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            this.d.getClass();
            TimeUnit timeUnit = this.c;
            long b = io.reactivex.rxjava3.core.w.b(timeUnit);
            long j = this.e;
            this.e = b;
            this.b.onNext(new io.reactivex.rxjava3.schedulers.b(t, b - j, timeUnit));
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.f, cVar)) {
                this.f = cVar;
                this.d.getClass();
                this.e = io.reactivex.rxjava3.core.w.b(this.c);
                this.b.onSubscribe(this);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.core.w wVar) {
        super(qVar);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.c = wVar;
        this.d = timeUnit;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super io.reactivex.rxjava3.schedulers.b<T>> vVar) {
        this.b.subscribe(new a(vVar, this.d, this.c));
    }
}
