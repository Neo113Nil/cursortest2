package io.reactivex.rxjava3.internal.operators.completable;

/* compiled from: CompletableFromSingle.java */
/* loaded from: classes11.dex */
public final class p<T> extends io.reactivex.rxjava3.core.a {
    public final io.reactivex.rxjava3.core.x b;

    /* compiled from: CompletableFromSingle.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.z<T> {
        public final io.reactivex.rxjava3.core.c b;

        public a(io.reactivex.rxjava3.core.c cVar) {
            this.b = cVar;
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            this.b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            this.b.onSubscribe(cVar);
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            this.b.onComplete();
        }
    }

    public p(io.reactivex.rxjava3.core.x xVar) {
        this.b = xVar;
    }

    @Override // io.reactivex.rxjava3.core.a
    public final void p(io.reactivex.rxjava3.core.c cVar) {
        this.b.subscribe(new a(cVar));
    }
}
