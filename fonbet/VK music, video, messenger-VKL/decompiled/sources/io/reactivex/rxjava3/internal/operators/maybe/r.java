package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: MaybeIgnoreElement.java */
/* loaded from: classes8.dex */
public final class r<T> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {

    /* compiled from: MaybeIgnoreElement.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.m<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.m<? super T> b;
        public io.reactivex.rxjava3.disposables.c c;

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
            return this.c.h();
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.c
        public final void onComplete() {
            this.c = DisposableHelper.DISPOSED;
            this.b.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            this.c = DisposableHelper.DISPOSED;
            this.b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.c, cVar)) {
                this.c = cVar;
                this.b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            this.c = DisposableHelper.DISPOSED;
            this.b.onComplete();
        }
    }

    @Override // io.reactivex.rxjava3.core.k
    public final void m(io.reactivex.rxjava3.core.m<? super T> mVar) {
        this.b.subscribe(new a(mVar));
    }
}
