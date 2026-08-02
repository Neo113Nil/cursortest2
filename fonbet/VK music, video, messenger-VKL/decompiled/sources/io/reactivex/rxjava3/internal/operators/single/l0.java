package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleUnsubscribeOn.java */
/* loaded from: classes8.dex */
public final class l0<T> extends io.reactivex.rxjava3.core.x<T> {
    public final f0 b;
    public final io.reactivex.rxjava3.core.w c;

    /* compiled from: SingleUnsubscribeOn.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.z<T>, io.reactivex.rxjava3.disposables.c, Runnable {
        private static final long serialVersionUID = 3256698449646456986L;
        final io.reactivex.rxjava3.core.z<? super T> downstream;
        io.reactivex.rxjava3.disposables.c ds;
        final io.reactivex.rxjava3.core.w scheduler;

        public a(io.reactivex.rxjava3.core.z<? super T> zVar, io.reactivex.rxjava3.core.w wVar) {
            this.downstream = zVar;
            this.scheduler = wVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            io.reactivex.rxjava3.disposables.c andSet = getAndSet(disposableHelper);
            if (andSet != disposableHelper) {
                this.ds = andSet;
                this.scheduler.c(this);
            }
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
            if (DisposableHelper.e(this, cVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.ds.dispose();
        }
    }

    public l0(f0 f0Var, io.reactivex.rxjava3.core.w wVar) {
        this.b = f0Var;
        this.c = wVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super T> zVar) {
        this.b.subscribe(new a(zVar, this.c));
    }
}
