package io.reactivex.rxjava3.internal.operators.completable;

/* compiled from: CompletableFromUnsafeSource.java */
/* loaded from: classes8.dex */
public final class q extends io.reactivex.rxjava3.core.a {
    public final io.reactivex.rxjava3.core.e b;

    public q(io.reactivex.rxjava3.core.e eVar) {
        this.b = eVar;
    }

    @Override // io.reactivex.rxjava3.core.a
    public final void p(io.reactivex.rxjava3.core.c cVar) {
        this.b.subscribe(cVar);
    }
}
