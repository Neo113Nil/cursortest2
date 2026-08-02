package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;

/* compiled from: MaybeToObservable.java */
/* loaded from: classes8.dex */
public final class k0<T> extends io.reactivex.rxjava3.core.q<T> {
    public final io.reactivex.rxjava3.core.o<T> b;

    /* compiled from: MaybeToObservable.java */
    public static final class a<T> extends DeferredScalarDisposable<T> implements io.reactivex.rxjava3.core.m<T> {
        private static final long serialVersionUID = 7603343402964826922L;
        io.reactivex.rxjava3.disposables.c upstream;

        @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            super.dispose();
            this.upstream.dispose();
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.upstream, cVar)) {
                this.upstream = cVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public k0(io.reactivex.rxjava3.core.k kVar) {
        this.b = kVar;
    }

    public static a M0(io.reactivex.rxjava3.core.v vVar) {
        return new a(vVar);
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        this.b.subscribe(new a(vVar));
    }
}
