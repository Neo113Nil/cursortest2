package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;

/* compiled from: ObservableReduceMaybe.java */
/* loaded from: classes8.dex */
public final class u1<T> extends io.reactivex.rxjava3.core.k<T> {
    public final io.reactivex.rxjava3.core.q b;
    public final io.reactivex.rxjava3.functions.c<T, T, T> c;

    /* compiled from: ObservableReduceMaybe.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.m<? super T> b;
        public final io.reactivex.rxjava3.functions.c<T, T, T> c;
        public boolean d;
        public T e;
        public io.reactivex.rxjava3.disposables.c f;

        public a(io.reactivex.rxjava3.core.m<? super T> mVar, io.reactivex.rxjava3.functions.c<T, T, T> cVar) {
            this.b = mVar;
            this.c = cVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.f.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.f.h();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            if (this.d) {
                return;
            }
            this.d = true;
            T t = this.e;
            this.e = null;
            io.reactivex.rxjava3.core.m<? super T> mVar = this.b;
            if (t != null) {
                mVar.onSuccess(t);
            } else {
                mVar.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (this.d) {
                io.reactivex.rxjava3.plugins.a.a(th);
                return;
            }
            this.d = true;
            this.e = null;
            this.b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            if (this.d) {
                return;
            }
            T t2 = this.e;
            if (t2 == null) {
                this.e = t;
                return;
            }
            try {
                T apply = this.c.apply(t2, t);
                Objects.requireNonNull(apply, "The reducer returned a null value");
                this.e = apply;
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.f.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.f, cVar)) {
                this.f = cVar;
                this.b.onSubscribe(this);
            }
        }
    }

    public u1(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.functions.c cVar) {
        this.b = qVar;
        this.c = cVar;
    }

    @Override // io.reactivex.rxjava3.core.k
    public final void m(io.reactivex.rxjava3.core.m<? super T> mVar) {
        this.b.subscribe(new a(mVar, this.c));
    }
}
