package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import xsna.axm0;

/* compiled from: MaybeToFlowable.java */
/* loaded from: classes8.dex */
public final class j0<T> extends io.reactivex.rxjava3.core.g<T> {
    public final io.reactivex.rxjava3.core.o<T> c;

    /* compiled from: MaybeToFlowable.java */
    public static final class a<T> extends DeferredScalarSubscription<T> implements io.reactivex.rxjava3.core.m<T> {
        private static final long serialVersionUID = 7603343402964826922L;
        io.reactivex.rxjava3.disposables.c upstream;

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, xsna.jxm0
        public final void cancel() {
            super.cancel();
            this.upstream.dispose();
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.c
        public final void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.upstream, cVar)) {
                this.upstream = cVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public j0(io.reactivex.rxjava3.core.o<T> oVar) {
        this.c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        this.c.subscribe(new a(axm0Var));
    }
}
