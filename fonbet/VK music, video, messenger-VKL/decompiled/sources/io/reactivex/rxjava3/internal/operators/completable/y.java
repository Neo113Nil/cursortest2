package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CompletableSubscribeOn.java */
/* loaded from: classes11.dex */
public final class y extends io.reactivex.rxjava3.core.a {
    public final io.reactivex.rxjava3.core.a b;
    public final io.reactivex.rxjava3.core.w c;

    /* compiled from: CompletableSubscribeOn.java */
    public static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.c, io.reactivex.rxjava3.disposables.c, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        final io.reactivex.rxjava3.core.c downstream;
        final io.reactivex.rxjava3.core.e source;
        final SequentialDisposable task = new SequentialDisposable();

        public a(io.reactivex.rxjava3.core.a aVar, io.reactivex.rxjava3.core.c cVar) {
            this.downstream = cVar;
            this.source = aVar;
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

        @Override // io.reactivex.rxjava3.core.c
        public final void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.e(this, cVar);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.source.subscribe(this);
        }
    }

    public y(io.reactivex.rxjava3.core.a aVar, io.reactivex.rxjava3.core.w wVar) {
        this.b = aVar;
        this.c = wVar;
    }

    @Override // io.reactivex.rxjava3.core.a
    public final void p(io.reactivex.rxjava3.core.c cVar) {
        a aVar = new a(this.b, cVar);
        cVar.onSubscribe(aVar);
        io.reactivex.rxjava3.disposables.c c = this.c.c(aVar);
        SequentialDisposable sequentialDisposable = aVar.task;
        sequentialDisposable.getClass();
        DisposableHelper.c(sequentialDisposable, c);
    }
}
