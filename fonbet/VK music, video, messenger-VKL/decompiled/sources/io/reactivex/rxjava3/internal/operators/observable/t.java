package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;

/* compiled from: ObservableDefer.java */
/* loaded from: classes11.dex */
public final class t<T> extends io.reactivex.rxjava3.core.q<T> {
    public final io.reactivex.rxjava3.functions.n<? extends io.reactivex.rxjava3.core.t<? extends T>> b;

    public t(io.reactivex.rxjava3.functions.n<? extends io.reactivex.rxjava3.core.t<? extends T>> nVar) {
        this.b = nVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        try {
            io.reactivex.rxjava3.core.t<? extends T> tVar = this.b.get();
            Objects.requireNonNull(tVar, "The supplier returned a null ObservableSource");
            tVar.subscribe(vVar);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            vVar.onSubscribe(EmptyDisposable.INSTANCE);
            vVar.onError(th);
        }
    }
}
