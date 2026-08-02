package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.observable.v1;
import xsna.as;
import xsna.kkl;

/* compiled from: ObservableReduceWithSingle.java */
/* loaded from: classes8.dex */
public final class w1<T, R> extends io.reactivex.rxjava3.core.x<R> {
    public final io.reactivex.rxjava3.core.q b;
    public final kkl c;
    public final as d;

    public w1(io.reactivex.rxjava3.core.q qVar, kkl kklVar, as asVar) {
        this.b = qVar;
        this.c = kklVar;
        this.d = asVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super R> zVar) {
        try {
            this.b.subscribe(new v1.a(zVar, this.d, this.c.get()));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            zVar.onSubscribe(EmptyDisposable.INSTANCE);
            zVar.onError(th);
        }
    }
}
