package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.internal.disposables.CancellableDisposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import xsna.fw3;

/* compiled from: CompletableCreate.java */
/* loaded from: classes8.dex */
public final class e extends io.reactivex.rxjava3.core.a {
    public final io.reactivex.rxjava3.core.d b;

    /* compiled from: CompletableCreate.java */
    public static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.b, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = -2467358622224974244L;
        final io.reactivex.rxjava3.core.c downstream;

        public a(io.reactivex.rxjava3.core.c cVar) {
            this.downstream = cVar;
        }

        @Override // io.reactivex.rxjava3.core.b
        public final void a(io.reactivex.rxjava3.functions.e eVar) {
            DisposableHelper.d(this, new CancellableDisposable(eVar));
        }

        @Override // io.reactivex.rxjava3.core.b
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

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.b
        public final void onComplete() {
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

        @Override // io.reactivex.rxjava3.core.b
        public final void onError(Throwable th) {
            if (b(th)) {
                return;
            }
            io.reactivex.rxjava3.plugins.a.a(th);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return fw3.c(a.class.getSimpleName(), "{", super.toString(), "}");
        }
    }

    public e(io.reactivex.rxjava3.core.d dVar) {
        this.b = dVar;
    }

    @Override // io.reactivex.rxjava3.core.a
    public final void p(io.reactivex.rxjava3.core.c cVar) {
        a aVar = new a(cVar);
        cVar.onSubscribe(aVar);
        try {
            this.b.subscribe(aVar);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            aVar.onError(th);
        }
    }
}
