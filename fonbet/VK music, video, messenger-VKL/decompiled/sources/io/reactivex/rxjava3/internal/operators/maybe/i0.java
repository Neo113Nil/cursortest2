package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeTimer.java */
/* loaded from: classes8.dex */
public final class i0 extends io.reactivex.rxjava3.core.k<Long> {
    public final long b;
    public final TimeUnit c;
    public final io.reactivex.rxjava3.core.w d;

    /* compiled from: MaybeTimer.java */
    public static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.disposables.c, Runnable {
        private static final long serialVersionUID = 2875964065294031672L;
        final io.reactivex.rxjava3.core.m<? super Long> downstream;

        public a(io.reactivex.rxjava3.core.m<? super Long> mVar) {
            this.downstream = mVar;
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
            this.downstream.onSuccess(0L);
        }
    }

    public i0(long j, TimeUnit timeUnit, io.reactivex.rxjava3.core.w wVar) {
        this.b = j;
        this.c = timeUnit;
        this.d = wVar;
    }

    @Override // io.reactivex.rxjava3.core.k
    public final void m(io.reactivex.rxjava3.core.m<? super Long> mVar) {
        a aVar = new a(mVar);
        mVar.onSubscribe(aVar);
        DisposableHelper.c(aVar, this.d.d(aVar, this.b, this.c));
    }
}
