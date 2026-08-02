package io.reactivex.rxjava3.internal.operators.observable;

/* compiled from: ObservableIgnoreElements.java */
/* loaded from: classes8.dex */
public final class a1<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {
    public a1(io.reactivex.rxjava3.core.q qVar) {
        super(qVar);
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        this.b.subscribe(new a(vVar));
    }

    /* compiled from: ObservableIgnoreElements.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.v<? super T> b;
        public io.reactivex.rxjava3.disposables.c c;

        public a(io.reactivex.rxjava3.core.v<? super T> vVar) {
            this.b = vVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.c.h();
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
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            this.c = cVar;
            this.b.onSubscribe(this);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
        }
    }
}
