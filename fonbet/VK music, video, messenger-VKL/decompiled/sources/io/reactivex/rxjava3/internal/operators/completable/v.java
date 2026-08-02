package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.exceptions.CompositeException;

/* compiled from: CompletableOnErrorComplete.java */
/* loaded from: classes8.dex */
public final class v extends io.reactivex.rxjava3.core.a {
    public final io.reactivex.rxjava3.core.a b;
    public final io.reactivex.rxjava3.functions.m<? super Throwable> c;

    /* compiled from: CompletableOnErrorComplete.java */
    public final class a implements io.reactivex.rxjava3.core.c {
        public final io.reactivex.rxjava3.core.c b;

        public a(io.reactivex.rxjava3.core.c cVar) {
            this.b = cVar;
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onComplete() {
            this.b.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onError(Throwable th) {
            io.reactivex.rxjava3.core.c cVar = this.b;
            try {
                if (v.this.c.test(th)) {
                    cVar.onComplete();
                } else {
                    cVar.onError(th);
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                cVar.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.c
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            this.b.onSubscribe(cVar);
        }
    }

    public v(io.reactivex.rxjava3.core.a aVar, io.reactivex.rxjava3.functions.m mVar) {
        this.b = aVar;
        this.c = mVar;
    }

    @Override // io.reactivex.rxjava3.core.a
    public final void p(io.reactivex.rxjava3.core.c cVar) {
        this.b.subscribe(new a(cVar));
    }
}
