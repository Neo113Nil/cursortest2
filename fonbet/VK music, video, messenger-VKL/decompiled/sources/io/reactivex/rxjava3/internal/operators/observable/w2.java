package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableTimer.java */
/* loaded from: classes11.dex */
public final class w2 extends io.reactivex.rxjava3.core.q<Long> {
    public final io.reactivex.rxjava3.core.w b;
    public final long c;
    public final TimeUnit d;

    /* compiled from: ObservableTimer.java */
    public static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.disposables.c, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        final io.reactivex.rxjava3.core.v<? super Long> downstream;

        public a(io.reactivex.rxjava3.core.v<? super Long> vVar) {
            this.downstream = vVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (h()) {
                return;
            }
            this.downstream.onNext(0L);
            lazySet(EmptyDisposable.INSTANCE);
            this.downstream.onComplete();
        }
    }

    public w2(long j, TimeUnit timeUnit, io.reactivex.rxjava3.core.w wVar) {
        this.c = j;
        this.d = timeUnit;
        this.b = wVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super Long> vVar) {
        a aVar = new a(vVar);
        vVar.onSubscribe(aVar);
        io.reactivex.rxjava3.disposables.c d = this.b.d(aVar, this.c, this.d);
        while (!aVar.compareAndSet(null, d)) {
            if (aVar.get() != null) {
                if (aVar.get() == DisposableHelper.DISPOSED) {
                    d.dispose();
                    return;
                }
                return;
            }
        }
    }
}
