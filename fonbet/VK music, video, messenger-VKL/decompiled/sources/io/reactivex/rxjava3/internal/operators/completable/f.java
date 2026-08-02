package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;

/* compiled from: CompletableDefer.java */
/* loaded from: classes11.dex */
public final class f extends io.reactivex.rxjava3.core.a {
    public final io.reactivex.rxjava3.functions.n<? extends io.reactivex.rxjava3.core.e> b;

    public f(io.reactivex.rxjava3.functions.n<? extends io.reactivex.rxjava3.core.e> nVar) {
        this.b = nVar;
    }

    @Override // io.reactivex.rxjava3.core.a
    public final void p(io.reactivex.rxjava3.core.c cVar) {
        try {
            io.reactivex.rxjava3.core.e eVar = this.b.get();
            Objects.requireNonNull(eVar, "The completableSupplier returned a null CompletableSource");
            eVar.subscribe(cVar);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            cVar.onSubscribe(EmptyDisposable.INSTANCE);
            cVar.onError(th);
        }
    }
}
