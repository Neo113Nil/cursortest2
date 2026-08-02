package io.reactivex.rxjava3.internal.operators.single;

import java.util.Objects;

/* compiled from: SingleMap.java */
/* loaded from: classes11.dex */
public final class y<T, R> extends io.reactivex.rxjava3.core.x<R> {
    public final io.reactivex.rxjava3.core.x b;
    public final io.reactivex.rxjava3.functions.l<? super T, ? extends R> c;

    /* compiled from: SingleMap.java */
    public static final class a<T, R> implements io.reactivex.rxjava3.core.z<T> {
        public final io.reactivex.rxjava3.core.z<? super R> b;
        public final io.reactivex.rxjava3.functions.l<? super T, ? extends R> c;

        public a(io.reactivex.rxjava3.core.z<? super R> zVar, io.reactivex.rxjava3.functions.l<? super T, ? extends R> lVar) {
            this.b = zVar;
            this.c = lVar;
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            this.b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            this.b.onSubscribe(cVar);
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            try {
                R apply = this.c.apply(t);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                this.b.onSuccess(apply);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                onError(th);
            }
        }
    }

    public y(io.reactivex.rxjava3.core.x xVar, io.reactivex.rxjava3.functions.l lVar) {
        this.b = xVar;
        this.c = lVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super R> zVar) {
        this.b.subscribe(new a(zVar, this.c));
    }
}
