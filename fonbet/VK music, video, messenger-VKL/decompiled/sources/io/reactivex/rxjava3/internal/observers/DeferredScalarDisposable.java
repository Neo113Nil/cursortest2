package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.v;

/* loaded from: classes11.dex */
public class DeferredScalarDisposable<T> extends BasicIntQueueDisposable<T> {
    private static final long serialVersionUID = -5502432239815349361L;
    protected final v<? super T> downstream;
    protected T value;

    public DeferredScalarDisposable(v<? super T> vVar) {
        this.downstream = vVar;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.h
    public final int a(int i) {
        lazySet(8);
        return 2;
    }

    public final void b(T t) {
        int i = get();
        if ((i & 54) != 0) {
            return;
        }
        v<? super T> vVar = this.downstream;
        if (i == 8) {
            this.value = t;
            lazySet(16);
            vVar.onNext(null);
        } else {
            lazySet(2);
            vVar.onNext(t);
        }
        if (get() != 4) {
            vVar.onComplete();
        }
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final void clear() {
        lazySet(32);
        this.value = null;
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public void dispose() {
        set(4);
        this.value = null;
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return get() == 4;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final boolean isEmpty() {
        return get() != 16;
    }

    public void onComplete() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.downstream.onComplete();
    }

    public void onError(Throwable th) {
        if ((get() & 54) != 0) {
            io.reactivex.rxjava3.plugins.a.a(th);
        } else {
            lazySet(2);
            this.downstream.onError(th);
        }
    }

    public void onSuccess(T t) {
        b(t);
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        T t = this.value;
        this.value = null;
        lazySet(32);
        return t;
    }
}
