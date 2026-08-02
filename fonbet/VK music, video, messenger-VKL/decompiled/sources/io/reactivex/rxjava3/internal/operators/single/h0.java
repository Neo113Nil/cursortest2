package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleTimeout.java */
/* loaded from: classes8.dex */
public final class h0<T> extends io.reactivex.rxjava3.core.x<T> {
    public final io.reactivex.rxjava3.core.x b;
    public final long c;
    public final TimeUnit d;
    public final io.reactivex.rxjava3.core.w e;
    public final io.reactivex.rxjava3.core.b0<? extends T> f;

    /* compiled from: SingleTimeout.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.z<T>, Runnable, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = 37497744973048446L;
        final io.reactivex.rxjava3.core.z<? super T> downstream;
        final C2154a<T> fallback;
        io.reactivex.rxjava3.core.b0<? extends T> other;
        final AtomicReference<io.reactivex.rxjava3.disposables.c> task = new AtomicReference<>();
        final long timeout;
        final TimeUnit unit;

        /* compiled from: SingleTimeout.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.single.h0$a$a, reason: collision with other inner class name */
        public static final class C2154a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.z<T> {
            private static final long serialVersionUID = 2071387740092105509L;
            final io.reactivex.rxjava3.core.z<? super T> downstream;

            public C2154a(io.reactivex.rxjava3.core.z<? super T> zVar) {
                this.downstream = zVar;
            }

            @Override // io.reactivex.rxjava3.core.z
            public final void onError(Throwable th) {
                this.downstream.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.z
            public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
                DisposableHelper.e(this, cVar);
            }

            @Override // io.reactivex.rxjava3.core.z
            public final void onSuccess(T t) {
                this.downstream.onSuccess(t);
            }
        }

        public a(io.reactivex.rxjava3.core.z<? super T> zVar, io.reactivex.rxjava3.core.b0<? extends T> b0Var, long j, TimeUnit timeUnit) {
            this.downstream = zVar;
            this.other = b0Var;
            this.timeout = j;
            this.unit = timeUnit;
            if (b0Var != null) {
                this.fallback = new C2154a<>(zVar);
            } else {
                this.fallback = null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            DisposableHelper.a(this);
            DisposableHelper.a(this.task);
            C2154a<T> c2154a = this.fallback;
            if (c2154a != null) {
                DisposableHelper.a(c2154a);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onError(Throwable th) {
            io.reactivex.rxjava3.disposables.c cVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (cVar == disposableHelper || !compareAndSet(cVar, disposableHelper)) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                DisposableHelper.a(this.task);
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            DisposableHelper.e(this, cVar);
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void onSuccess(T t) {
            io.reactivex.rxjava3.disposables.c cVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (cVar == disposableHelper || !compareAndSet(cVar, disposableHelper)) {
                return;
            }
            DisposableHelper.a(this.task);
            this.downstream.onSuccess(t);
        }

        @Override // java.lang.Runnable
        public final void run() {
            io.reactivex.rxjava3.disposables.c cVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (cVar == disposableHelper || !compareAndSet(cVar, disposableHelper)) {
                return;
            }
            if (cVar != null) {
                cVar.dispose();
            }
            io.reactivex.rxjava3.core.b0<? extends T> b0Var = this.other;
            if (b0Var == null) {
                this.downstream.onError(new TimeoutException(io.reactivex.rxjava3.internal.util.f.e(this.timeout, this.unit)));
            } else {
                this.other = null;
                b0Var.subscribe(this.fallback);
            }
        }
    }

    public h0(io.reactivex.rxjava3.core.x xVar, long j, TimeUnit timeUnit, io.reactivex.rxjava3.core.w wVar, io.reactivex.rxjava3.core.b0 b0Var) {
        this.b = xVar;
        this.c = j;
        this.d = timeUnit;
        this.e = wVar;
        this.f = b0Var;
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super T> zVar) {
        a aVar = new a(zVar, this.f, this.c, this.d);
        zVar.onSubscribe(aVar);
        DisposableHelper.c(aVar.task, this.e.d(aVar, this.c, this.d));
        this.b.subscribe(aVar);
    }
}
