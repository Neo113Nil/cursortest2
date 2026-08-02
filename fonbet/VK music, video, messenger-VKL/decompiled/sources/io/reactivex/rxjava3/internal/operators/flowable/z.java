package io.reactivex.rxjava3.internal.operators.flowable;

import xsna.axm0;
import xsna.jxm0;

/* compiled from: FlowableFromObservable.java */
/* loaded from: classes11.dex */
public final class z<T> extends io.reactivex.rxjava3.core.g<T> {
    public final io.reactivex.rxjava3.core.q c;

    public z(io.reactivex.rxjava3.core.q qVar) {
        this.c = qVar;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        this.c.subscribe(new a(axm0Var));
    }

    /* compiled from: FlowableFromObservable.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.v<T>, jxm0 {
        public final axm0<? super T> b;
        public io.reactivex.rxjava3.disposables.c c;

        public a(axm0<? super T> axm0Var) {
            this.b = axm0Var;
        }

        @Override // xsna.jxm0
        public final void cancel() {
            this.c.dispose();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            this.b.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            this.b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            this.b.onNext(t);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            this.c = cVar;
            this.b.onSubscribe(this);
        }

        @Override // xsna.jxm0
        public final void request(long j) {
        }
    }
}
