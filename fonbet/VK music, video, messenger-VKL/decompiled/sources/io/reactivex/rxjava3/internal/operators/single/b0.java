package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleObserveOn.java */
/* loaded from: classes11.dex */
public final class b0<T> extends io.reactivex.rxjava3.core.x<T> {
    public final io.reactivex.rxjava3.core.x b;
    public final io.reactivex.rxjava3.core.w c;

    /* compiled from: SingleObserveOn.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.z<T>, io.reactivex.rxjava3.disposables.c, Runnable {
        private static final long serialVersionUID = 3528003840217436037L;
        final io.reactivex.rxjava3.core.z<? super T> downstream;
        Throwable error;
        final io.reactivex.rxjava3.core.w scheduler;
        T value;

        public a(io.reactivex.rxjava3.core.z<? super T> zVar, io.reactivex.rxjava3.core.w wVar) {
            this.downstream = zVar;
            this.scheduler = wVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            this.error = th;
            DisposableHelper.c(this, this.scheduler.c(this));
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.e(this, cVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            this.value = t;
            DisposableHelper.c(this, this.scheduler.c(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.error;
            if (th != null) {
                this.downstream.onError(th);
            } else {
                this.downstream.onSuccess(this.value);
            }
        }
    }

    public b0(io.reactivex.rxjava3.core.x xVar, io.reactivex.rxjava3.core.w wVar) {
        this.b = xVar;
        this.c = wVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super T> zVar) {
        this.b.subscribe(new a(zVar, this.c));
    }
}
