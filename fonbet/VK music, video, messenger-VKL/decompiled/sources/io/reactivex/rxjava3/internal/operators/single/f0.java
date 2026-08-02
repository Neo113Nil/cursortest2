package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleSubscribeOn.java */
/* loaded from: classes11.dex */
public final class f0<T> extends io.reactivex.rxjava3.core.x<T> {
    public final io.reactivex.rxjava3.core.x b;
    public final io.reactivex.rxjava3.core.w c;

    /* compiled from: SingleSubscribeOn.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.z<T>, io.reactivex.rxjava3.disposables.c, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        final io.reactivex.rxjava3.core.z<? super T> downstream;
        final io.reactivex.rxjava3.core.b0<? extends T> source;
        final SequentialDisposable task = new SequentialDisposable();

        public a(io.reactivex.rxjava3.core.x xVar, io.reactivex.rxjava3.core.z zVar) {
            this.downstream = zVar;
            this.source = xVar;
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

        @Override // io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.e(this, cVar);
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.source.subscribe(this);
        }
    }

    public f0(io.reactivex.rxjava3.core.x xVar, io.reactivex.rxjava3.core.w wVar) {
        this.b = xVar;
        this.c = wVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super T> zVar) {
        a aVar = new a(this.b, zVar);
        zVar.onSubscribe(aVar);
        io.reactivex.rxjava3.disposables.c c = this.c.c(aVar);
        SequentialDisposable sequentialDisposable = aVar.task;
        sequentialDisposable.getClass();
        DisposableHelper.c(sequentialDisposable, c);
    }
}
