package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: ObservableTakeUntilPredicate.java */
/* loaded from: classes8.dex */
public final class q2<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {
    public final io.reactivex.rxjava3.functions.m<? super T> c;

    /* compiled from: ObservableTakeUntilPredicate.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.v<? super T> b;
        public final io.reactivex.rxjava3.functions.m<? super T> c;
        public io.reactivex.rxjava3.disposables.c d;
        public boolean e;

        public a(io.reactivex.rxjava3.core.v<? super T> vVar, io.reactivex.rxjava3.functions.m<? super T> mVar) {
            this.b = vVar;
            this.c = mVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.d.h();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            if (this.e) {
                return;
            }
            this.e = true;
            this.b.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (this.e) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                this.e = true;
                this.b.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            if (this.e) {
                return;
            }
            io.reactivex.rxjava3.core.v<? super T> vVar = this.b;
            vVar.onNext(t);
            try {
                if (this.c.test(t)) {
                    this.e = true;
                    this.d.dispose();
                    vVar.onComplete();
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.d.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.d, cVar)) {
                this.d = cVar;
                this.b.onSubscribe(this);
            }
        }
    }

    public q2(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.functions.m mVar) {
        super(qVar);
        this.c = mVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        this.b.subscribe(new a(vVar, this.c));
    }
}
