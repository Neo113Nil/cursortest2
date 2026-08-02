package io.reactivex.rxjava3.internal.operators.single;

/* compiled from: SingleDoOnSuccess.java */
/* loaded from: classes11.dex */
public final class o<T> extends io.reactivex.rxjava3.core.x<T> {
    public final io.reactivex.rxjava3.core.x b;
    public final io.reactivex.rxjava3.functions.f<? super T> c;

    /* compiled from: SingleDoOnSuccess.java */
    public final class a implements io.reactivex.rxjava3.core.z<T> {
        public final io.reactivex.rxjava3.core.z<? super T> b;

        public a(io.reactivex.rxjava3.core.z<? super T> zVar) {
            this.b = zVar;
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
            io.reactivex.rxjava3.core.z<? super T> zVar = this.b;
            try {
                o.this.c.accept(t);
                zVar.onSuccess(t);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                zVar.onError(th);
            }
        }
    }

    public o(io.reactivex.rxjava3.core.x xVar, io.reactivex.rxjava3.functions.f fVar) {
        this.b = xVar;
        this.c = fVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super T> zVar) {
        this.b.subscribe(new a(zVar));
    }
}
