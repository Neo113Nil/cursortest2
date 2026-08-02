package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.exceptions.CompositeException;

/* compiled from: SingleDoOnError.java */
/* loaded from: classes11.dex */
public final class l<T> extends io.reactivex.rxjava3.core.x<T> {
    public final io.reactivex.rxjava3.core.x b;
    public final io.reactivex.rxjava3.functions.f<? super Throwable> c;

    /* compiled from: SingleDoOnError.java */
    public final class a implements io.reactivex.rxjava3.core.z<T> {
        public final io.reactivex.rxjava3.core.z<? super T> b;

        public a(io.reactivex.rxjava3.core.z<? super T> zVar) {
            this.b = zVar;
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            try {
                l.this.c.accept(th);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                th = new CompositeException(th, th2);
            }
            this.b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            this.b.onSubscribe(cVar);
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            this.b.onSuccess(t);
        }
    }

    public l(io.reactivex.rxjava3.core.x xVar, io.reactivex.rxjava3.functions.f fVar) {
        this.b = xVar;
        this.c = fVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super T> zVar) {
        this.b.subscribe(new a(zVar));
    }
}
