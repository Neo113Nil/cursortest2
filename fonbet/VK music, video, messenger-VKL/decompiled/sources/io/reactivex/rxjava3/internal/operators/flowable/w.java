package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import xsna.axm0;

/* compiled from: FlowableFromCompletable.java */
/* loaded from: classes8.dex */
public final class w<T> extends io.reactivex.rxjava3.internal.fuseable.a<T> implements io.reactivex.rxjava3.core.c {
    public final axm0<? super T> b;
    public io.reactivex.rxjava3.disposables.c c;

    public w(axm0<? super T> axm0Var) {
        this.b = axm0Var;
    }

    @Override // xsna.jxm0
    public final void cancel() {
        this.c.dispose();
        this.c = DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.rxjava3.core.c
    public final void onComplete() {
        this.c = DisposableHelper.DISPOSED;
        this.b.onComplete();
    }

    @Override // io.reactivex.rxjava3.core.c
    public final void onError(Throwable th) {
        this.c = DisposableHelper.DISPOSED;
        this.b.onError(th);
    }

    @Override // io.reactivex.rxjava3.core.c
    public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
        if (DisposableHelper.f(this.c, cVar)) {
            this.c = cVar;
            this.b.onSubscribe(this);
        }
    }
}
