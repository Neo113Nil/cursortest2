package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeTimeoutMaybe.java */
/* loaded from: classes8.dex */
public final class h0<T, U> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {
    public final i0 c;
    public final io.reactivex.rxjava3.core.o<? extends T> d;

    /* compiled from: MaybeTimeoutMaybe.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.m<T> {
        private static final long serialVersionUID = 8663801314800248617L;
        final io.reactivex.rxjava3.core.m<? super T> downstream;

        public a(io.reactivex.rxjava3.core.m<? super T> mVar) {
            this.downstream = mVar;
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.c
        public final void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.e(this, cVar);
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }
    }

    /* compiled from: MaybeTimeoutMaybe.java */
    public static final class b<T, U> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.m<T>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = -5955289211445418871L;
        final io.reactivex.rxjava3.core.m<? super T> downstream;
        final io.reactivex.rxjava3.core.o<? extends T> fallback;
        final c<T, U> other = new c<>(this);
        final a<T> otherObserver;

        public b(io.reactivex.rxjava3.core.m<? super T> mVar, io.reactivex.rxjava3.core.o<? extends T> oVar) {
            this.downstream = mVar;
            this.fallback = oVar;
            this.otherObserver = oVar != null ? new a<>(mVar) : null;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            DisposableHelper.a(this);
            DisposableHelper.a(this.other);
            a<T> aVar = this.otherObserver;
            if (aVar != null) {
                DisposableHelper.a(aVar);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.c
        public final void onComplete() {
            DisposableHelper.a(this.other);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            DisposableHelper.a(this.other);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.downstream.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.a(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.e(this, cVar);
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            DisposableHelper.a(this.other);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.downstream.onSuccess(t);
            }
        }
    }

    /* compiled from: MaybeTimeoutMaybe.java */
    public static final class c<T, U> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.m<Object> {
        private static final long serialVersionUID = 8663801314800248617L;
        final b<T, U> parent;

        public c(b<T, U> bVar) {
            this.parent = bVar;
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.c
        public final void onComplete() {
            b<T, U> bVar = this.parent;
            bVar.getClass();
            if (DisposableHelper.a(bVar)) {
                io.reactivex.rxjava3.core.o<? extends T> oVar = bVar.fallback;
                if (oVar == null) {
                    bVar.downstream.onError(new TimeoutException());
                } else {
                    oVar.subscribe(bVar.otherObserver);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            b<T, U> bVar = this.parent;
            bVar.getClass();
            if (DisposableHelper.a(bVar)) {
                bVar.downstream.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.a(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.e(this, cVar);
        }

        @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
        public final void onSuccess(Object obj) {
            b<T, U> bVar = this.parent;
            bVar.getClass();
            if (DisposableHelper.a(bVar)) {
                io.reactivex.rxjava3.core.o<? extends T> oVar = bVar.fallback;
                if (oVar == null) {
                    bVar.downstream.onError(new TimeoutException());
                } else {
                    oVar.subscribe(bVar.otherObserver);
                }
            }
        }
    }

    public h0(io.reactivex.rxjava3.core.k kVar, i0 i0Var, k kVar2) {
        super(kVar);
        this.c = i0Var;
        this.d = kVar2;
    }

    @Override // io.reactivex.rxjava3.core.k
    public final void m(io.reactivex.rxjava3.core.m<? super T> mVar) {
        b bVar = new b(mVar, this.d);
        mVar.onSubscribe(bVar);
        this.c.subscribe(bVar.other);
        this.b.subscribe(bVar);
    }
}
