package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import xsna.axm0;
import xsna.jxm0;

/* compiled from: FlowableTimer.java */
/* loaded from: classes8.dex */
public final class c1 extends io.reactivex.rxjava3.core.g<Long> {
    public final io.reactivex.rxjava3.core.w c;
    public final long d;
    public final TimeUnit e;

    /* compiled from: FlowableTimer.java */
    public static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements jxm0, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        final axm0<? super Long> downstream;
        volatile boolean requested;

        public a(axm0<? super Long> axm0Var) {
            this.downstream = axm0Var;
        }

        @Override // xsna.jxm0
        public final void cancel() {
            DisposableHelper.a(this);
        }

        @Override // xsna.jxm0
        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                this.requested = true;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (get() != DisposableHelper.DISPOSED) {
                if (!this.requested) {
                    lazySet(EmptyDisposable.INSTANCE);
                    this.downstream.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
                } else {
                    this.downstream.onNext(0L);
                    lazySet(EmptyDisposable.INSTANCE);
                    this.downstream.onComplete();
                }
            }
        }
    }

    public c1(long j, TimeUnit timeUnit, io.reactivex.rxjava3.core.w wVar) {
        this.d = j;
        this.e = timeUnit;
        this.c = wVar;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super Long> axm0Var) {
        a aVar = new a(axm0Var);
        axm0Var.onSubscribe(aVar);
        io.reactivex.rxjava3.disposables.c d = this.c.d(aVar, this.d, this.e);
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
