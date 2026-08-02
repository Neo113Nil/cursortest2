package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleTimer.java */
/* loaded from: classes8.dex */
public final class i0 extends io.reactivex.rxjava3.core.x<Long> {
    public final long b;
    public final TimeUnit c;
    public final io.reactivex.rxjava3.core.w d;

    /* compiled from: SingleTimer.java */
    public static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.disposables.c, Runnable {
        private static final long serialVersionUID = 8465401857522493082L;
        final io.reactivex.rxjava3.core.z<? super Long> downstream;

        public a(io.reactivex.rxjava3.core.z<? super Long> zVar) {
            this.downstream = zVar;
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

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super Long> zVar) {
        a aVar = new a(zVar);
        zVar.onSubscribe(aVar);
        DisposableHelper.c(aVar, this.d.d(aVar, this.b, this.c));
    }
}
