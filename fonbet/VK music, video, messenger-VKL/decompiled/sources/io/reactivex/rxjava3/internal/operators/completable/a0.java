package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CompletableTimer.java */
/* loaded from: classes11.dex */
public final class a0 extends io.reactivex.rxjava3.core.a {
    public final long b;
    public final TimeUnit c;
    public final io.reactivex.rxjava3.core.w d;

    /* compiled from: CompletableTimer.java */
    public static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.disposables.c, Runnable {
        private static final long serialVersionUID = 3167244060586201109L;
        final io.reactivex.rxjava3.core.c downstream;

        public a(io.reactivex.rxjava3.core.c cVar) {
            this.downstream = cVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return DisposableHelper.b(get());
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.downstream.onComplete();
        }
    }

    public a0(long j, TimeUnit timeUnit, io.reactivex.rxjava3.core.w wVar) {
        this.b = j;
        this.c = timeUnit;
        this.d = wVar;
    }

    @Override // io.reactivex.rxjava3.core.a
    public final void p(io.reactivex.rxjava3.core.c cVar) {
        a aVar = new a(cVar);
        cVar.onSubscribe(aVar);
        DisposableHelper.c(aVar, this.d.d(aVar, this.b, this.c));
    }
}
