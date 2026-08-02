package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;
import xsna.gnw0;
import xsna.qu50;

/* compiled from: ObservableCollect.java */
/* loaded from: classes8.dex */
public final class l<T, U> extends io.reactivex.rxjava3.internal.operators.observable.a<T, U> {
    public final io.reactivex.rxjava3.functions.n<? extends U> c;
    public final io.reactivex.rxjava3.functions.b<? super U, ? super T> d;

    /* compiled from: ObservableCollect.java */
    public static final class a<T, U> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.v<? super U> b;
        public final io.reactivex.rxjava3.functions.b<? super U, ? super T> c;
        public final U d;
        public io.reactivex.rxjava3.disposables.c e;
        public boolean f;

        public a(io.reactivex.rxjava3.core.v<? super U> vVar, U u, io.reactivex.rxjava3.functions.b<? super U, ? super T> bVar) {
            this.b = vVar;
            this.c = bVar;
            this.d = u;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.e.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.e.h();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            if (this.f) {
                return;
            }
            this.f = true;
            U u = this.d;
            io.reactivex.rxjava3.core.v<? super U> vVar = this.b;
            vVar.onNext(u);
            vVar.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (this.f) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                this.f = true;
                this.b.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            if (this.f) {
                return;
            }
            try {
                this.c.accept(this.d, t);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.e.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.e, cVar)) {
                this.e = cVar;
                this.b.onSubscribe(this);
            }
        }
    }

    public l(io.reactivex.rxjava3.core.q qVar, gnw0 gnw0Var, qu50 qu50Var) {
        super(qVar);
        this.c = gnw0Var;
        this.d = qu50Var;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super U> vVar) {
        try {
            U u = this.c.get();
            Objects.requireNonNull(u, "The initialSupplier returned a null value");
            this.b.subscribe(new a(vVar, u, this.d));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            vVar.onSubscribe(EmptyDisposable.INSTANCE);
            vVar.onError(th);
        }
    }
}
