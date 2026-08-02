package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeSubscribeOn.java */
/* loaded from: classes8.dex */
public final class c0<T> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {
    public final io.reactivex.rxjava3.core.w c;

    /* compiled from: MaybeSubscribeOn.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.m<T>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = 8571289934935992137L;
        final io.reactivex.rxjava3.core.m<? super T> downstream;
        final SequentialDisposable task = new SequentialDisposable();

        public a(io.reactivex.rxjava3.core.m<? super T> mVar) {
            this.downstream = mVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            DisposableHelper.a(this);
            SequentialDisposable sequentialDisposable = this.task;
            sequentialDisposable.getClass();
            DisposableHelper.a(sequentialDisposable);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.c
        public final void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.e(this, cVar);
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }
    }

    /* compiled from: MaybeSubscribeOn.java */
    public static final class b<T> implements Runnable {
        public final a b;
        public final io.reactivex.rxjava3.core.o<T> c;

        public b(a aVar, io.reactivex.rxjava3.core.o oVar) {
            this.b = aVar;
            this.c = oVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.c.subscribe(this.b);
        }
    }

    public c0(io.reactivex.rxjava3.core.k kVar, io.reactivex.rxjava3.core.w wVar) {
        super(kVar);
        this.c = wVar;
    }

    @Override // io.reactivex.rxjava3.core.k
    public final void m(io.reactivex.rxjava3.core.m<? super T> mVar) {
        a aVar = new a(mVar);
        mVar.onSubscribe(aVar);
        SequentialDisposable sequentialDisposable = aVar.task;
        io.reactivex.rxjava3.disposables.c c = this.c.c(new b(aVar, this.b));
        sequentialDisposable.getClass();
        DisposableHelper.c(sequentialDisposable, c);
    }
}
