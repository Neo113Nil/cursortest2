package io.reactivex.rxjava3.internal.operators.observable;

/* compiled from: ObservableFromAction.java */
/* loaded from: classes8.dex */
public final class q0<T> extends io.reactivex.rxjava3.core.q<T> implements io.reactivex.rxjava3.functions.n<T> {
    public final io.reactivex.rxjava3.functions.a b;

    public q0(io.reactivex.rxjava3.functions.a aVar) {
        this.b = aVar;
    }

    @Override // io.reactivex.rxjava3.functions.n
    public final T get() throws Throwable {
        this.b.run();
        return null;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        io.reactivex.rxjava3.internal.fuseable.b bVar = new io.reactivex.rxjava3.internal.fuseable.b();
        vVar.onSubscribe(bVar);
        if (bVar.b) {
            return;
        }
        try {
            this.b.run();
            if (bVar.b) {
                return;
            }
            vVar.onComplete();
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            if (bVar.b) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                vVar.onError(th);
            }
        }
    }
}
