package io.reactivex.rxjava3.internal.operators.completable;

import java.util.concurrent.Callable;

/* compiled from: CompletableFromCallable.java */
/* loaded from: classes11.dex */
public final class m extends io.reactivex.rxjava3.core.a {
    public final Callable<?> b;

    public m(Callable<?> callable) {
        this.b = callable;
    }

    @Override // io.reactivex.rxjava3.core.a
    public final void p(io.reactivex.rxjava3.core.c cVar) {
        io.reactivex.rxjava3.disposables.f fVar = new io.reactivex.rxjava3.disposables.f(io.reactivex.rxjava3.internal.functions.a.b);
        cVar.onSubscribe(fVar);
        try {
            this.b.call();
            if (fVar.h()) {
                return;
            }
            cVar.onComplete();
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            if (fVar.h()) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                cVar.onError(th);
            }
        }
    }
}
