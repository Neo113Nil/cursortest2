package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* compiled from: ObservableSingleSingle.java */
/* loaded from: classes11.dex */
public final class i2<T> extends io.reactivex.rxjava3.core.x<T> {
    public final io.reactivex.rxjava3.core.t<? extends T> b;
    public final T c;

    /* compiled from: ObservableSingleSingle.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.z<? super T> b;
        public final T c;
        public io.reactivex.rxjava3.disposables.c d;
        public T e;
        public boolean f;

        public a(io.reactivex.rxjava3.core.z<? super T> zVar, T t) {
            this.b = zVar;
            this.c = t;
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
            if (this.f) {
                return;
            }
            this.f = true;
            T t = this.e;
            this.e = null;
            if (t == null) {
                t = this.c;
            }
            io.reactivex.rxjava3.core.z<? super T> zVar = this.b;
            if (t != null) {
                zVar.onSuccess(t);
            } else {
                zVar.onError(new NoSuchElementException());
            }
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
            if (this.e == null) {
                this.e = t;
                return;
            }
            this.f = true;
            this.d.dispose();
            this.b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.d, cVar)) {
                this.d = cVar;
                this.b.onSubscribe(this);
            }
        }
    }

    public i2(io.reactivex.rxjava3.core.t<? extends T> tVar, T t) {
        this.b = tVar;
        this.c = t;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super T> zVar) {
        this.b.subscribe(new a(zVar, this.c));
    }
}
