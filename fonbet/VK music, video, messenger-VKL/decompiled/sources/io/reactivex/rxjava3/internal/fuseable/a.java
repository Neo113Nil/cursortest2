package io.reactivex.rxjava3.internal.fuseable;

/* compiled from: AbstractEmptyQueueFuseable.java */
/* loaded from: classes8.dex */
public abstract class a<T> implements i<T>, g<T> {
    @Override // io.reactivex.rxjava3.internal.fuseable.h
    public final int a(int i) {
        return 2;
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public boolean h() {
        return false;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final T poll() throws Throwable {
        return null;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final void clear() {
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public void dispose() {
    }

    @Override // xsna.jxm0
    public final void request(long j) {
    }
}
