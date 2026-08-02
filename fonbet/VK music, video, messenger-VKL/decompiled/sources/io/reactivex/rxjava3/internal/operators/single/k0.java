package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;

/* compiled from: SingleToObservable.java */
/* loaded from: classes11.dex */
public final class k0<T> extends io.reactivex.rxjava3.core.q<T> {
    public final io.reactivex.rxjava3.core.x b;

    /* compiled from: SingleToObservable.java */
    public static final class a<T> extends DeferredScalarDisposable<T> implements io.reactivex.rxjava3.core.z<T> {
        private static final long serialVersionUID = 3786543492451018833L;
        io.reactivex.rxjava3.disposables.c upstream;

        @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            super.dispose();
            this.upstream.dispose();
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.upstream, cVar)) {
                this.upstream = cVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public k0(io.reactivex.rxjava3.core.x xVar) {
        this.b = xVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        this.b.subscribe(new a(vVar));
    }
}
