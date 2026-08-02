package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;

/* compiled from: ObservableReduceSeedSingle.java */
/* loaded from: classes8.dex */
public final class v1<T, R> extends io.reactivex.rxjava3.core.x<R> {
    public final io.reactivex.rxjava3.core.q b;
    public final R c;
    public final io.reactivex.rxjava3.functions.c<R, ? super T, R> d;

    /* compiled from: ObservableReduceSeedSingle.java */
    public static final class a<T, R> implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.z<? super R> b;
        public final io.reactivex.rxjava3.functions.c<R, ? super T, R> c;
        public R d;
        public io.reactivex.rxjava3.disposables.c e;

        public a(io.reactivex.rxjava3.core.z<? super R> zVar, io.reactivex.rxjava3.functions.c<R, ? super T, R> cVar, R r) {
            this.b = zVar;
            this.d = r;
            this.c = cVar;
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
            R r = this.d;
            if (r != null) {
                this.d = null;
                this.b.onSuccess(r);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (this.d == null) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                this.d = null;
                this.b.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            R r = this.d;
            if (r != null) {
                try {
                    R apply = this.c.apply(r, t);
                    Objects.requireNonNull(apply, "The reducer returned a null value");
                    this.d = apply;
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    this.e.dispose();
                    onError(th);
                }
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

    /* JADX WARN: Multi-variable type inference failed */
    public v1(io.reactivex.rxjava3.core.q qVar, Object obj, io.reactivex.rxjava3.functions.c cVar) {
        this.b = qVar;
        this.c = obj;
        this.d = cVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super R> zVar) {
        this.b.subscribe(new a(zVar, this.d, this.c));
    }
}
