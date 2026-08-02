package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.CancellableDisposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import xsna.fw3;

/* compiled from: ObservableCreate.java */
/* loaded from: classes11.dex */
public final class q<T> extends io.reactivex.rxjava3.core.q<T> {
    public final io.reactivex.rxjava3.core.s<T> b;

    /* compiled from: ObservableCreate.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.r<T>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = -3434801548987643227L;
        final io.reactivex.rxjava3.core.v<? super T> observer;

        public a(io.reactivex.rxjava3.core.v<? super T> vVar) {
            this.observer = vVar;
        }

        @Override // io.reactivex.rxjava3.core.r
        public final void a(io.reactivex.rxjava3.functions.e eVar) {
            DisposableHelper.d(this, new CancellableDisposable(eVar));
        }

        @Override // io.reactivex.rxjava3.core.r
        public final boolean b(Throwable th) {
            if (th == null) {
                th = io.reactivex.rxjava3.internal.util.f.b("onError called with a null Throwable.");
            }
            if (h()) {
                return false;
            }
            try {
                this.observer.onError(th);
                DisposableHelper.a(this);
                return true;
            } catch (Throwable th2) {
                DisposableHelper.a(this);
                throw th2;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.core.r, io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.r
        public final void i(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.d(this, cVar);
        }

        @Override // io.reactivex.rxjava3.core.f
        public final void onComplete() {
            if (h()) {
                return;
            }
            try {
                this.observer.onComplete();
            } finally {
                DisposableHelper.a(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.f
        public final void onError(Throwable th) {
            if (b(th)) {
                return;
            }
            io.reactivex.rxjava3.plugins.a.a(th);
        }

        @Override // io.reactivex.rxjava3.core.f
        public final void onNext(T t) {
            if (t == null) {
                onError(io.reactivex.rxjava3.internal.util.f.b("onNext called with a null value."));
            } else {
                if (h()) {
                    return;
                }
                this.observer.onNext(t);
            }
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return fw3.c(a.class.getSimpleName(), "{", super.toString(), "}");
        }
    }

    public q(io.reactivex.rxjava3.core.s<T> sVar) {
        this.b = sVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        a aVar = new a(vVar);
        vVar.onSubscribe(aVar);
        try {
            this.b.subscribe(aVar);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            aVar.onError(th);
        }
    }
}
