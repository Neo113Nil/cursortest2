package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.exceptions.CompositeException;

/* compiled from: SingleDoOnEvent.java */
/* loaded from: classes8.dex */
public final class m<T> extends io.reactivex.rxjava3.core.x<T> {
    public final io.reactivex.rxjava3.core.x b;
    public final io.reactivex.rxjava3.functions.b<? super T, ? super Throwable> c;

    /* compiled from: SingleDoOnEvent.java */
    public final class a implements io.reactivex.rxjava3.core.z<T> {
        public final io.reactivex.rxjava3.core.z<? super T> b;

        public a(io.reactivex.rxjava3.core.z<? super T> zVar) {
            this.b = zVar;
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            try {
                m.this.c.accept(null, th);
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
            io.reactivex.rxjava3.core.z<? super T> zVar = this.b;
            try {
                m.this.c.accept(t, null);
                zVar.onSuccess(t);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                zVar.onError(th);
            }
        }
    }

    public m(io.reactivex.rxjava3.core.x xVar, io.reactivex.rxjava3.functions.b bVar) {
        this.b = xVar;
        this.c = bVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super T> zVar) {
        this.b.subscribe(new a(zVar));
    }
}
