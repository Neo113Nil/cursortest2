package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.exceptions.CompositeException;

/* compiled from: SingleOnErrorReturn.java */
/* loaded from: classes11.dex */
public final class d0<T> extends io.reactivex.rxjava3.core.x<T> {
    public final io.reactivex.rxjava3.core.x b;
    public final io.reactivex.rxjava3.functions.l<? super Throwable, ? extends T> c;
    public final T d;

    /* compiled from: SingleOnErrorReturn.java */
    public final class a implements io.reactivex.rxjava3.core.z<T> {
        public final io.reactivex.rxjava3.core.z<? super T> b;

        public a(io.reactivex.rxjava3.core.z<? super T> zVar) {
            this.b = zVar;
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            T apply;
            d0 d0Var = d0.this;
            io.reactivex.rxjava3.functions.l<? super Throwable, ? extends T> lVar = d0Var.c;
            io.reactivex.rxjava3.core.z<? super T> zVar = this.b;
            if (lVar != null) {
                try {
                    apply = lVar.apply(th);
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.b(th2);
                    zVar.onError(new CompositeException(th, th2));
                    return;
                }
            } else {
                apply = d0Var.d;
            }
            if (apply != null) {
                zVar.onSuccess(apply);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
            nullPointerException.initCause(th);
            zVar.onError(nullPointerException);
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

    /* JADX WARN: Multi-variable type inference failed */
    public d0(io.reactivex.rxjava3.core.x xVar, io.reactivex.rxjava3.functions.l lVar, Object obj) {
        this.b = xVar;
        this.c = lVar;
        this.d = obj;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super T> zVar) {
        this.b.subscribe(new a(zVar));
    }
}
