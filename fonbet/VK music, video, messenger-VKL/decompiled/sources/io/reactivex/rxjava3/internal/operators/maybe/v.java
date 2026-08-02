package io.reactivex.rxjava3.internal.operators.maybe;

/* compiled from: MaybeMaterialize.java */
/* loaded from: classes8.dex */
public final class v<T> extends io.reactivex.rxjava3.core.x<io.reactivex.rxjava3.core.p<T>> {
    public final io.reactivex.rxjava3.core.k<T> b;

    public v(io.reactivex.rxjava3.core.k<T> kVar) {
        this.b = kVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super io.reactivex.rxjava3.core.p<T>> zVar) {
        this.b.subscribe(new io.reactivex.rxjava3.internal.operators.mixed.e(zVar));
    }
}
