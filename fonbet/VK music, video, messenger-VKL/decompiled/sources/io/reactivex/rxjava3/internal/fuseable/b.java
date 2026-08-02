package io.reactivex.rxjava3.internal.fuseable;

/* compiled from: CancellableQueueFuseable.java */
/* loaded from: classes8.dex */
public final class b<T> extends a<T> {
    public volatile boolean b;

    @Override // xsna.jxm0
    public final void cancel() {
        this.b = true;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.a, io.reactivex.rxjava3.disposables.c
    public final void dispose() {
        this.b = true;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.a, io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return this.b;
    }
}
