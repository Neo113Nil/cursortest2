package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: ObservableSingleMaybe.java */
/* loaded from: classes8.dex */
public final class h2<T> extends io.reactivex.rxjava3.core.k<T> {
    public final b0 b;

    /* compiled from: ObservableSingleMaybe.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.m<? super T> b;
        public io.reactivex.rxjava3.disposables.c c;
        public T d;
        public boolean e;

        public a(io.reactivex.rxjava3.core.m<? super T> mVar) {
            this.b = mVar;
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
            if (this.e) {
                return;
            }
            this.e = true;
            T t = this.d;
            this.d = null;
            io.reactivex.rxjava3.core.m<? super T> mVar = this.b;
            if (t == null) {
                mVar.onComplete();
            } else {
                mVar.onSuccess(t);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (this.e) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                this.e = true;
                this.b.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            if (this.e) {
                return;
            }
            if (this.d == null) {
                this.d = t;
                return;
            }
            this.e = true;
            this.c.dispose();
            this.b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.c, cVar)) {
                this.c = cVar;
                this.b.onSubscribe(this);
            }
        }
    }

    public h2(b0 b0Var) {
        this.b = b0Var;
    }

    @Override // io.reactivex.rxjava3.core.k
    public final void m(io.reactivex.rxjava3.core.m<? super T> mVar) {
        this.b.subscribe(new a(mVar));
    }
}
