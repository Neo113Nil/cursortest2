package io.reactivex.rxjava3.internal.subscriptions;

import xsna.axm0;

/* loaded from: classes8.dex */
public class DeferredScalarSubscription<T> extends BasicIntQueueSubscription<T> {
    private static final long serialVersionUID = -2151279923272604993L;
    protected final axm0<? super T> downstream;
    protected T value;

    public DeferredScalarSubscription(axm0<? super T> axm0Var) {
        this.downstream = axm0Var;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.h
    public final int a(int i) {
        lazySet(8);
        return 2;
    }

    public final void b(T t) {
        int i = get();
        while (i != 8) {
            if ((i & (-3)) != 0) {
                return;
            }
            if (i == 2) {
                lazySet(3);
                axm0<? super T> axm0Var = this.downstream;
                axm0Var.onNext(t);
                if (get() != 4) {
                    axm0Var.onComplete();
                    return;
                }
                return;
            }
            this.value = t;
            if (compareAndSet(0, 1)) {
                return;
            }
            i = get();
            if (i == 4) {
                this.value = null;
                return;
            }
        }
        this.value = t;
        lazySet(16);
        axm0<? super T> axm0Var2 = this.downstream;
        axm0Var2.onNext(t);
        if (get() != 4) {
            axm0Var2.onComplete();
        }
    }

    public void cancel() {
        set(4);
        this.value = null;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final void clear() {
        lazySet(32);
        this.value = null;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final boolean isEmpty() {
        return get() != 16;
    }

    public void onSuccess(T t) {
        b(t);
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t = this.value;
        this.value = null;
        return t;
    }

    @Override // xsna.jxm0
    public final void request(long j) {
        T t;
        if (SubscriptionHelper.e(j)) {
            do {
                int i = get();
                if ((i & (-2)) != 0) {
                    return;
                }
                if (i == 1) {
                    if (!compareAndSet(1, 3) || (t = this.value) == null) {
                        return;
                    }
                    this.value = null;
                    axm0<? super T> axm0Var = this.downstream;
                    axm0Var.onNext(t);
                    if (get() != 4) {
                        axm0Var.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }
}
