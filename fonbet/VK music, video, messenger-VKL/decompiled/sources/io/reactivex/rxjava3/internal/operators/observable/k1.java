package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: ObservableMaterialize.java */
/* loaded from: classes11.dex */
public final class k1<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, io.reactivex.rxjava3.core.p<T>> {

    /* compiled from: ObservableMaterialize.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.v<? super io.reactivex.rxjava3.core.p<T>> b;
        public io.reactivex.rxjava3.disposables.c c;

        public a(io.reactivex.rxjava3.core.v<? super io.reactivex.rxjava3.core.p<T>> vVar) {
            this.b = vVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.c.h();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            io.reactivex.rxjava3.core.v<? super io.reactivex.rxjava3.core.p<T>> vVar = this.b;
            vVar.onNext(io.reactivex.rxjava3.core.p.b);
            vVar.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            io.reactivex.rxjava3.core.p a = io.reactivex.rxjava3.core.p.a(th);
            io.reactivex.rxjava3.core.v<? super io.reactivex.rxjava3.core.p<T>> vVar = this.b;
            vVar.onNext(a);
            vVar.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            this.b.onNext(io.reactivex.rxjava3.core.p.b(t));
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.c, cVar)) {
                this.c = cVar;
                this.b.onSubscribe(this);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super io.reactivex.rxjava3.core.p<T>> vVar) {
        this.b.subscribe(new a(vVar));
    }
}
