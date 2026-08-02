package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeDelayWithCompletable.java */
/* loaded from: classes8.dex */
public final class e<T> extends io.reactivex.rxjava3.core.k<T> {
    public final io.reactivex.rxjava3.core.o<T> b;
    public final io.reactivex.rxjava3.core.a c;

    /* compiled from: MaybeDelayWithCompletable.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.m<T> {
        public final b b;
        public final io.reactivex.rxjava3.core.m<? super T> c;

        public a(b bVar, io.reactivex.rxjava3.core.m mVar) {
            this.b = bVar;
            this.c = mVar;
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.c
        public final void onComplete() {
            this.c.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            this.c.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.c(this.b, cVar);
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            this.c.onSuccess(t);
        }
    }

    /* compiled from: MaybeDelayWithCompletable.java */
    public static final class b<T> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.c, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = 703409937383992161L;
        final io.reactivex.rxjava3.core.m<? super T> downstream;
        final io.reactivex.rxjava3.core.o<T> source;

        public b(io.reactivex.rxjava3.core.m<? super T> mVar, io.reactivex.rxjava3.core.o<T> oVar) {
            this.downstream = mVar;
            this.source = oVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onComplete() {
            this.source.subscribe(new a(this, this.downstream));
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.e(this, cVar)) {
                this.downstream.onSubscribe(this);
            }
        }
    }

    public e(io.reactivex.rxjava3.core.o oVar, io.reactivex.rxjava3.core.a aVar) {
        this.b = oVar;
        this.c = aVar;
    }

    @Override // io.reactivex.rxjava3.core.k
    public final void m(io.reactivex.rxjava3.core.m<? super T> mVar) {
        this.c.subscribe(new b(mVar, this.b));
    }
}
