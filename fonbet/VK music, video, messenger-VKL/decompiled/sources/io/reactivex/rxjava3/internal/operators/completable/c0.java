package io.reactivex.rxjava3.internal.operators.completable;

/* compiled from: CompletableToSingle.java */
/* loaded from: classes8.dex */
public final class c0<T> extends io.reactivex.rxjava3.core.x<T> {
    public final io.reactivex.rxjava3.core.a b;
    public final io.reactivex.rxjava3.functions.n<? extends T> c;
    public final T d;

    /* compiled from: CompletableToSingle.java */
    public final class a implements io.reactivex.rxjava3.core.c {
        public final io.reactivex.rxjava3.core.z<? super T> b;

        public a(io.reactivex.rxjava3.core.z<? super T> zVar) {
            this.b = zVar;
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onComplete() {
            T t;
            c0 c0Var = c0.this;
            io.reactivex.rxjava3.functions.n<? extends T> nVar = c0Var.c;
            io.reactivex.rxjava3.core.z<? super T> zVar = this.b;
            if (nVar != null) {
                try {
                    t = nVar.get();
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    zVar.onError(th);
                    return;
                }
            } else {
                t = c0Var.d;
            }
            if (t == null) {
                zVar.onError(new NullPointerException("The value supplied is null"));
            } else {
                zVar.onSuccess(t);
            }
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onError(Throwable th) {
            this.b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            this.b.onSubscribe(cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c0(io.reactivex.rxjava3.core.a aVar, io.reactivex.rxjava3.functions.n nVar, Object obj) {
        this.b = aVar;
        this.d = obj;
        this.c = nVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super T> zVar) {
        this.b.subscribe(new a(zVar));
    }
}
