package io.reactivex.rxjava3.internal.operators.single;

/* compiled from: SingleMaterialize.java */
/* loaded from: classes8.dex */
public final class z<T> extends io.reactivex.rxjava3.core.x<io.reactivex.rxjava3.core.p<T>> {
    public final io.reactivex.rxjava3.core.x<T> b;

    public z(io.reactivex.rxjava3.core.x<T> xVar) {
        this.b = xVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super io.reactivex.rxjava3.core.p<T>> zVar) {
        this.b.subscribe(new io.reactivex.rxjava3.internal.operators.mixed.e(zVar));
    }
}
