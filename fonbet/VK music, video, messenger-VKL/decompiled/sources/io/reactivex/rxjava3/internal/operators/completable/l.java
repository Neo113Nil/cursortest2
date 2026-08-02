package io.reactivex.rxjava3.internal.operators.completable;

/* compiled from: CompletableFromAction.java */
/* loaded from: classes11.dex */
public final class l extends io.reactivex.rxjava3.core.a {
    public final io.reactivex.rxjava3.functions.a b;

    public l(io.reactivex.rxjava3.functions.a aVar) {
        this.b = aVar;
    }

    @Override // io.reactivex.rxjava3.core.a
    public final void p(io.reactivex.rxjava3.core.c cVar) {
        io.reactivex.rxjava3.disposables.f fVar = new io.reactivex.rxjava3.disposables.f(io.reactivex.rxjava3.internal.functions.a.b);
        cVar.onSubscribe(fVar);
        if (fVar.h()) {
            return;
        }
        try {
            this.b.run();
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
