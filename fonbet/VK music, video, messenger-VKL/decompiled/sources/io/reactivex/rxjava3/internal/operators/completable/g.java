package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CompletableDelay.java */
/* loaded from: classes8.dex */
public final class g extends io.reactivex.rxjava3.core.a {
    public final io.reactivex.rxjava3.core.a b;
    public final long c;
    public final TimeUnit d;
    public final io.reactivex.rxjava3.core.w e;

    /* compiled from: CompletableDelay.java */
    public static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.c, Runnable, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = 465972761105851022L;
        final long delay;
        final boolean delayError = false;
        final io.reactivex.rxjava3.core.c downstream;
        Throwable error;
        final io.reactivex.rxjava3.core.w scheduler;
        final TimeUnit unit;

        public a(io.reactivex.rxjava3.core.c cVar, long j, TimeUnit timeUnit, io.reactivex.rxjava3.core.w wVar) {
            this.downstream = cVar;
            this.delay = j;
            this.unit = timeUnit;
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
            DisposableHelper.c(this, this.scheduler.d(this, this.delay, this.unit));
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onError(Throwable th) {
            this.error = th;
            DisposableHelper.c(this, this.scheduler.d(this, this.delayError ? this.delay : 0L, this.unit));
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
            this.error = null;
            if (th != null) {
                this.downstream.onError(th);
            } else {
                this.downstream.onComplete();
            }
        }
    }

    public g(io.reactivex.rxjava3.core.a aVar, long j, TimeUnit timeUnit, io.reactivex.rxjava3.core.w wVar) {
        this.b = aVar;
        this.c = j;
        this.d = timeUnit;
        this.e = wVar;
    }

    @Override // io.reactivex.rxjava3.core.a
    public final void p(io.reactivex.rxjava3.core.c cVar) {
        this.b.subscribe(new a(cVar, this.c, this.d, this.e));
    }
}
