package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: MaybeIgnoreElementCompletable.java */
/* loaded from: classes8.dex */
public final class s<T> extends io.reactivex.rxjava3.core.a implements io.reactivex.rxjava3.internal.fuseable.e<T> {
    public final io.reactivex.rxjava3.internal.operators.maybe.a b;

    /* compiled from: MaybeIgnoreElementCompletable.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.m<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.c b;
        public io.reactivex.rxjava3.disposables.c c;

        public a(io.reactivex.rxjava3.core.c cVar) {
            this.b = cVar;
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

    public s(io.reactivex.rxjava3.internal.operators.maybe.a aVar) {
        this.b = aVar;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.e
    public final r a() {
        return new r(this.b);
    }

    @Override // io.reactivex.rxjava3.core.a
    public final void p(io.reactivex.rxjava3.core.c cVar) {
        this.b.subscribe(new a(cVar));
    }
}
