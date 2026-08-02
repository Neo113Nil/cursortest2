package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;

/* compiled from: CompletableErrorSupplier.java */
/* loaded from: classes8.dex */
public final class k extends io.reactivex.rxjava3.core.a {
    public final io.reactivex.rxjava3.functions.n<? extends Throwable> b;

    public k(io.reactivex.rxjava3.functions.n<? extends Throwable> nVar) {
        this.b = nVar;
    }

    @Override // io.reactivex.rxjava3.core.a
    public final void p(io.reactivex.rxjava3.core.c cVar) {
        try {
            Throwable th = this.b.get();
            Objects.requireNonNull(th, "The error returned is null");
            th = th;
        } catch (Throwable th2) {
            th = th2;
            io.reactivex.rxjava3.exceptions.a.b(th);
        }
        cVar.onSubscribe(EmptyDisposable.INSTANCE);
        cVar.onError(th);
    }
}
