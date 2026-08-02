package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CompletableObserveOn.java */
/* loaded from: classes11.dex */
public final class u extends io.reactivex.rxjava3.core.a {
    public final io.reactivex.rxjava3.core.a b;
    public final io.reactivex.rxjava3.core.w c;

    /* compiled from: CompletableObserveOn.java */
    public static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.c, io.reactivex.rxjava3.disposables.c, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;
        final io.reactivex.rxjava3.core.c downstream;
        Throwable error;
        final io.reactivex.rxjava3.core.w scheduler;

        public a(io.reactivex.rxjava3.core.c cVar, io.reactivex.rxjava3.core.w wVar) {
            this.downstream = cVar;
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

        @Override // io.reactivex.rxjava3.core.c
        public final void onComplete() {
            DisposableHelper.c(this, this.scheduler.c(this));
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onError(Throwable th) {
            this.error = th;
            DisposableHelper.c(this, this.scheduler.c(this));
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.e(this, cVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.error;
            if (th == null) {
                this.downstream.onComplete();
            } else {
                this.error = null;
                this.downstream.onError(th);
            }
        }
    }

    public u(io.reactivex.rxjava3.core.a aVar, io.reactivex.rxjava3.core.w wVar) {
        this.b = aVar;
        this.c = wVar;
    }

    @Override // io.reactivex.rxjava3.core.a
    public final void p(io.reactivex.rxjava3.core.c cVar) {
        this.b.subscribe(new a(cVar, this.c));
    }
}
