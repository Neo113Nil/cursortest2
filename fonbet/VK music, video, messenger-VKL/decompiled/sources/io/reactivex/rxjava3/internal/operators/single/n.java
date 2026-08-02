package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: SingleDoOnSubscribe.java */
/* loaded from: classes8.dex */
public final class n<T> extends io.reactivex.rxjava3.core.x<T> {
    public final io.reactivex.rxjava3.core.x b;
    public final io.reactivex.rxjava3.functions.f<? super io.reactivex.rxjava3.disposables.c> c;

    /* compiled from: SingleDoOnSubscribe.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.z<T> {
        public final io.reactivex.rxjava3.core.z<? super T> b;
        public final io.reactivex.rxjava3.functions.f<? super io.reactivex.rxjava3.disposables.c> c;
        public boolean d;

        public a(io.reactivex.rxjava3.core.z<? super T> zVar, io.reactivex.rxjava3.functions.f<? super io.reactivex.rxjava3.disposables.c> fVar) {
            this.b = zVar;
            this.c = fVar;
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            if (this.d) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                this.b.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            io.reactivex.rxjava3.core.z<? super T> zVar = this.b;
            try {
                this.c.accept(cVar);
                zVar.onSubscribe(cVar);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.d = true;
                cVar.dispose();
                zVar.onSubscribe(EmptyDisposable.INSTANCE);
                zVar.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            if (this.d) {
                return;
            }
            this.b.onSuccess(t);
        }
    }

    public n(io.reactivex.rxjava3.core.x xVar, io.reactivex.rxjava3.functions.f fVar) {
        this.b = xVar;
        this.c = fVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super T> zVar) {
        this.b.subscribe(new a(zVar, this.c));
    }
}
