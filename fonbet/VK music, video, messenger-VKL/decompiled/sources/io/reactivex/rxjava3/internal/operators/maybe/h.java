package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import xsna.s7;

/* compiled from: MaybeDoOnEvent.java */
/* loaded from: classes8.dex */
public final class h<T> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {
    public final s7 c;

    /* compiled from: MaybeDoOnEvent.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.m<T>, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.core.m<? super T> b;
        public final io.reactivex.rxjava3.functions.b<? super T, ? super Throwable> c;
        public io.reactivex.rxjava3.disposables.c d;

        public a(io.reactivex.rxjava3.core.m mVar, s7 s7Var) {
            this.b = mVar;
            this.c = s7Var;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.d.dispose();
            this.d = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.d.h();
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.c
        public final void onComplete() {
            io.reactivex.rxjava3.core.m<? super T> mVar = this.b;
            this.d = DisposableHelper.DISPOSED;
            try {
                this.c.accept(null, null);
                mVar.onComplete();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                mVar.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            this.d = DisposableHelper.DISPOSED;
            try {
                this.c.accept(null, th);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                th = new CompositeException(th, th2);
            }
            this.b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.d, cVar)) {
                this.d = cVar;
                this.b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            io.reactivex.rxjava3.core.m<? super T> mVar = this.b;
            this.d = DisposableHelper.DISPOSED;
            try {
                this.c.accept(t, null);
                mVar.onSuccess(t);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                mVar.onError(th);
            }
        }
    }

    public h(io.reactivex.rxjava3.internal.operators.single.c0 c0Var, s7 s7Var) {
        super(c0Var);
        this.c = s7Var;
    }

    @Override // io.reactivex.rxjava3.core.k
    public final void m(io.reactivex.rxjava3.core.m<? super T> mVar) {
        this.b.subscribe(new a(mVar, this.c));
    }
}
