package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import xsna.axm0;

/* compiled from: SingleToFlowable.java */
/* loaded from: classes8.dex */
public final class j0<T> extends io.reactivex.rxjava3.core.g<T> {
    public final io.reactivex.rxjava3.core.x c;

    /* compiled from: SingleToFlowable.java */
    public static final class a<T> extends DeferredScalarSubscription<T> implements io.reactivex.rxjava3.core.z<T> {
        private static final long serialVersionUID = 187782011903685568L;
        io.reactivex.rxjava3.disposables.c upstream;

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, xsna.jxm0
        public final void cancel() {
            super.cancel();
            this.upstream.dispose();
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.upstream, cVar)) {
                this.upstream = cVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public j0(io.reactivex.rxjava3.core.x xVar) {
        this.c = xVar;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        this.c.subscribe(new a(axm0Var));
    }
}
