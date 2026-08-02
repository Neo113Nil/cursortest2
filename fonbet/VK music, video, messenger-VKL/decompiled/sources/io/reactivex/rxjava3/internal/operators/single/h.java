package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: SingleDoAfterSuccess.java */
/* loaded from: classes8.dex */
public final class h<T> extends io.reactivex.rxjava3.core.x<T> {
    public final io.reactivex.rxjava3.core.x b;
    public final io.reactivex.rxjava3.functions.f<? super T> c;

    /* compiled from: SingleDoAfterSuccess.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.z<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.z<? super T> b;
        public final io.reactivex.rxjava3.functions.f<? super T> c;
        public io.reactivex.rxjava3.disposables.c d;

        public a(io.reactivex.rxjava3.core.z<? super T> zVar, io.reactivex.rxjava3.functions.f<? super T> fVar) {
            this.b = zVar;
            this.c = fVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.d.h();
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            this.b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.d, cVar)) {
                this.d = cVar;
                this.b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            this.b.onSuccess(t);
            try {
                this.c.accept(t);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                io.reactivex.rxjava3.plugins.a.a(th);
            }
        }
    }

    public h(io.reactivex.rxjava3.core.x xVar, io.reactivex.rxjava3.functions.f fVar) {
        this.b = xVar;
        this.c = fVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super T> zVar) {
        this.b.subscribe(new a(zVar, this.c));
    }
}
