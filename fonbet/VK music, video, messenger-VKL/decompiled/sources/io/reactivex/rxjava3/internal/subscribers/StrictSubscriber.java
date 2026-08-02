package io.reactivex.rxjava3.internal.subscribers;

import defpackage.k0;
import io.reactivex.rxjava3.core.j;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.g;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import xsna.axm0;
import xsna.jxm0;

/* loaded from: classes8.dex */
public class StrictSubscriber<T> extends AtomicInteger implements j<T>, jxm0 {
    private static final long serialVersionUID = -4945028590049415624L;
    volatile boolean done;
    final axm0<? super T> downstream;
    final AtomicThrowable error = new AtomicThrowable();
    final AtomicLong requested = new AtomicLong();
    final AtomicReference<jxm0> upstream = new AtomicReference<>();
    final AtomicBoolean once = new AtomicBoolean();

    public StrictSubscriber(axm0<? super T> axm0Var) {
        this.downstream = axm0Var;
    }

    @Override // xsna.jxm0
    public final void cancel() {
        if (this.done) {
            return;
        }
        SubscriptionHelper.a(this.upstream);
    }

    @Override // xsna.axm0
    public final void onComplete() {
        this.done = true;
        axm0<? super T> axm0Var = this.downstream;
        AtomicThrowable atomicThrowable = this.error;
        if (getAndIncrement() == 0) {
            atomicThrowable.g(axm0Var);
        }
    }

    @Override // xsna.axm0
    public final void onError(Throwable th) {
        this.done = true;
        axm0<? super T> axm0Var = this.downstream;
        AtomicThrowable atomicThrowable = this.error;
        if (atomicThrowable.a(th) && getAndIncrement() == 0) {
            atomicThrowable.g(axm0Var);
        }
    }

    @Override // xsna.axm0
    public final void onNext(T t) {
        g.d(this.downstream, t, this, this.error);
    }

    @Override // xsna.axm0
    public final void onSubscribe(jxm0 jxm0Var) {
        if (this.once.compareAndSet(false, true)) {
            this.downstream.onSubscribe(this);
            SubscriptionHelper.c(this.upstream, this.requested, jxm0Var);
        } else {
            jxm0Var.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // xsna.jxm0
    public final void request(long j) {
        if (j > 0) {
            SubscriptionHelper.b(this.upstream, this.requested, j);
        } else {
            cancel();
            onError(new IllegalArgumentException(k0.a(j, "§3.9 violated: positive request amount required but it was ")));
        }
    }
}
