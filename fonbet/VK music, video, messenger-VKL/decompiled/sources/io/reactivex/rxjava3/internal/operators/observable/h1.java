package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: ObservableLastMaybe.java */
/* loaded from: classes8.dex */
public final class h1<T> extends io.reactivex.rxjava3.core.k<T> {
    public final j1 b;

    /* compiled from: ObservableLastMaybe.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.m<? super T> b;
        public io.reactivex.rxjava3.disposables.c c;
        public T d;

        public a(io.reactivex.rxjava3.core.m<? super T> mVar) {
            this.b = mVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.c.dispose();
            this.c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.c == DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            this.c = DisposableHelper.DISPOSED;
            T t = this.d;
            io.reactivex.rxjava3.core.m<? super T> mVar = this.b;
            if (t == null) {
                mVar.onComplete();
            } else {
                this.d = null;
                mVar.onSuccess(t);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            this.c = DisposableHelper.DISPOSED;
            this.d = null;
            this.b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            this.d = t;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.c, cVar)) {
                this.c = cVar;
                this.b.onSubscribe(this);
            }
        }
    }

    public h1(j1 j1Var) {
        this.b = j1Var;
    }

    @Override // io.reactivex.rxjava3.core.k
    public final void m(io.reactivex.rxjava3.core.m<? super T> mVar) {
        this.b.subscribe(new a(mVar));
    }
}
