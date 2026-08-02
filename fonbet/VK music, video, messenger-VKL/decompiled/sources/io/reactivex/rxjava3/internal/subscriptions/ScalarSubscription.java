package io.reactivex.rxjava3.internal.subscriptions;

import io.reactivex.rxjava3.internal.fuseable.i;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.axm0;

/* loaded from: classes8.dex */
public final class ScalarSubscription<T> extends AtomicInteger implements i<T> {
    private static final long serialVersionUID = -3830916580126663321L;
    final axm0<? super T> subscriber;
    final T value;

    /* JADX WARN: Multi-variable type inference failed */
    public ScalarSubscription(Object obj, axm0 axm0Var) {
        this.subscriber = axm0Var;
        this.value = obj;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.h
    public final int a(int i) {
        return 1;
    }

    @Override // xsna.jxm0
    public final void cancel() {
        lazySet(2);
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final void clear() {
        lazySet(1);
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final boolean isEmpty() {
        return get() != 0;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.value;
    }

    @Override // xsna.jxm0
    public final void request(long j) {
        if (SubscriptionHelper.e(j) && compareAndSet(0, 1)) {
            axm0<? super T> axm0Var = this.subscriber;
            axm0Var.onNext(this.value);
            if (get() != 2) {
                axm0Var.onComplete();
            }
        }
    }
}
