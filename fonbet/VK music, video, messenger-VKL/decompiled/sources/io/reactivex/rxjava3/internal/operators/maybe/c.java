package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import xsna.fw3;

/* compiled from: MaybeCreate.java */
/* loaded from: classes8.dex */
public final class c<T> extends io.reactivex.rxjava3.core.k<T> {
    public final io.reactivex.rxjava3.core.n<T> b;

    /* compiled from: MaybeCreate.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.l<T>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = -2467358622224974244L;
        final io.reactivex.rxjava3.core.m<? super T> downstream;

        public a(io.reactivex.rxjava3.core.m<? super T> mVar) {
            this.downstream = mVar;
        }

        public final void d() {
            io.reactivex.rxjava3.disposables.c andSet;
            io.reactivex.rxjava3.disposables.c cVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (cVar == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return;
            }
            try {
                this.downstream.onComplete();
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            DisposableHelper.a(this);
        }

        public final void e(Throwable th) {
            if (g(th)) {
                return;
            }
            io.reactivex.rxjava3.plugins.a.a(th);
        }

        public final void f(T t) {
            io.reactivex.rxjava3.disposables.c andSet;
            io.reactivex.rxjava3.disposables.c cVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (cVar == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return;
            }
            try {
                if (t == null) {
                    this.downstream.onError(io.reactivex.rxjava3.internal.util.f.b("onSuccess called with a null value."));
                } else {
                    this.downstream.onSuccess(t);
                }
                if (andSet != null) {
                    andSet.dispose();
                }
            } catch (Throwable th) {
                if (andSet != null) {
                    andSet.dispose();
                }
                throw th;
            }
        }

        public final boolean g(Throwable th) {
            io.reactivex.rxjava3.disposables.c andSet;
            if (th == null) {
                th = io.reactivex.rxjava3.internal.util.f.b("onError called with a null Throwable.");
            }
            io.reactivex.rxjava3.disposables.c cVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (cVar == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return false;
            }
            try {
                this.downstream.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return DisposableHelper.b(get());
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return fw3.c(a.class.getSimpleName(), "{", super.toString(), "}");
        }
    }

    public c(io.reactivex.rxjava3.core.n<T> nVar) {
        this.b = nVar;
    }

    @Override // io.reactivex.rxjava3.core.k
    public final void m(io.reactivex.rxjava3.core.m<? super T> mVar) {
        a aVar = new a(mVar);
        mVar.onSubscribe(aVar);
        try {
            this.b.subscribe(aVar);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            aVar.e(th);
        }
    }
}
