package io.reactivex.rxjava3.internal.operators.observable;

/* compiled from: ObservableIgnoreElementsCompletable.java */
/* loaded from: classes11.dex */
public final class b1<T> extends io.reactivex.rxjava3.core.a implements io.reactivex.rxjava3.internal.fuseable.f<T> {
    public final io.reactivex.rxjava3.core.q b;

    public b1(io.reactivex.rxjava3.core.q qVar) {
        this.b = qVar;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.f
    public final io.reactivex.rxjava3.core.q<T> b() {
        return new a1(this.b);
    }

    @Override // io.reactivex.rxjava3.core.a
    public final void p(io.reactivex.rxjava3.core.c cVar) {
        this.b.subscribe(new a(cVar));
    }

    /* compiled from: ObservableIgnoreElementsCompletable.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.c b;
        public io.reactivex.rxjava3.disposables.c c;

        public a(io.reactivex.rxjava3.core.c cVar) {
            this.b = cVar;
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
