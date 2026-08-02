package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.exceptions.CompositeException;

/* compiled from: SingleDoOnTerminate.java */
/* loaded from: classes8.dex */
public final class p<T> extends io.reactivex.rxjava3.core.x<T> {
    public final io.reactivex.rxjava3.core.x b;
    public final io.reactivex.rxjava3.functions.a c;

    /* compiled from: SingleDoOnTerminate.java */
    public final class a implements io.reactivex.rxjava3.core.z<T> {
        public final io.reactivex.rxjava3.core.z<? super T> b;

        public a(io.reactivex.rxjava3.core.z<? super T> zVar) {
            this.b = zVar;
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            try {
                p.this.c.run();
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
                p.this.c.run();
                zVar.onSuccess(t);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                zVar.onError(th);
            }
        }
    }

    public p(io.reactivex.rxjava3.core.x xVar, io.reactivex.rxjava3.functions.a aVar) {
        this.b = xVar;
        this.c = aVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super T> zVar) {
        this.b.subscribe(new a(zVar));
    }
}
