package io.reactivex.rxjava3.internal.operators.observable;

/* compiled from: ObservableDoOnLifecycle.java */
/* loaded from: classes11.dex */
public final class c0<T> extends a<T, T> {
    public final io.reactivex.rxjava3.functions.f<? super io.reactivex.rxjava3.disposables.c> c;
    public final io.reactivex.rxjava3.functions.a d;

    public c0(io.reactivex.rxjava3.core.q<T> qVar, io.reactivex.rxjava3.functions.f<? super io.reactivex.rxjava3.disposables.c> fVar, io.reactivex.rxjava3.functions.a aVar) {
        super(qVar);
        this.c = fVar;
        this.d = aVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        this.b.subscribe(new io.reactivex.rxjava3.internal.observers.e(vVar, this.c, this.d));
    }
}
