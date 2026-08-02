package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: SingleDoAfterTerminate.java */
/* loaded from: classes8.dex */
public final class i<T> extends io.reactivex.rxjava3.core.x<T> {
    public final io.reactivex.rxjava3.core.x b;
    public final io.reactivex.rxjava3.functions.a c;

    /* compiled from: SingleDoAfterTerminate.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.z<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.z<? super T> b;
        public final io.reactivex.rxjava3.functions.a c;
        public io.reactivex.rxjava3.disposables.c d;

        public a(io.reactivex.rxjava3.core.z<? super T> zVar, io.reactivex.rxjava3.functions.a aVar) {
            this.b = zVar;
            this.c = aVar;
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
            try {
                this.c.run();
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                io.reactivex.rxjava3.plugins.a.a(th2);
            }
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
                this.c.run();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                io.reactivex.rxjava3.plugins.a.a(th);
            }
        }
    }

    public i(io.reactivex.rxjava3.core.x xVar, io.reactivex.rxjava3.functions.a aVar) {
        this.b = xVar;
        this.c = aVar;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super T> zVar) {
        this.b.subscribe(new a(zVar, this.c));
    }
}
