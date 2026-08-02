package io.reactivex.rxjava3.internal.operators.single;

/* compiled from: SingleFromUnsafeSource.java */
/* loaded from: classes8.dex */
public final class w<T> extends io.reactivex.rxjava3.core.x<T> {
    public final io.reactivex.rxjava3.core.b0<T> b;

    public w(io.reactivex.rxjava3.core.b0<T> b0Var) {
        this.b = b0Var;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super T> zVar) {
        this.b.subscribe(zVar);
    }
}
