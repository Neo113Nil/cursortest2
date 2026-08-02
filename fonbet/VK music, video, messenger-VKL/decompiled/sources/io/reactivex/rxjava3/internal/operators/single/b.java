package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.CancellableDisposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import xsna.fw3;

/* compiled from: SingleCreate.java */
/* loaded from: classes11.dex */
public final class b<T> extends io.reactivex.rxjava3.core.x<T> {
    public final io.reactivex.rxjava3.core.a0<T> b;

    /* compiled from: SingleCreate.java */
    /* loaded from: classes8.dex */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.y<T>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = -2467358622224974244L;
        final io.reactivex.rxjava3.core.z<? super T> downstream;

        public a(io.reactivex.rxjava3.core.z<? super T> zVar) {
            this.downstream = zVar;
        }

        @Override // io.reactivex.rxjava3.core.y
        public final void a(io.reactivex.rxjava3.functions.e eVar) {
            DisposableHelper.d(this, new CancellableDisposable(eVar));
        }

        @Override // io.reactivex.rxjava3.core.y
        public final boolean b(Throwable th) {
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
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.core.y, io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.y
        public final void i(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.d(this, cVar);
        }

        @Override // io.reactivex.rxjava3.core.y
        public final void onError(Throwable th) {
            if (b(th)) {
                return;
            }
            io.reactivex.rxjava3.plugins.a.a(th);
        }

        @Override // io.reactivex.rxjava3.core.y
        public final void onSuccess(T t) {
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

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return fw3.c(a.class.getSimpleName(), "{", super.toString(), "}");
        }
    }

    public b(io.reactivex.rxjava3.core.a0<T> a0Var) {
        this.b = a0Var;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super T> zVar) {
        a aVar = new a(zVar);
        zVar.onSubscribe(aVar);
        try {
            this.b.subscribe(aVar);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            aVar.onError(th);
        }
    }
}
