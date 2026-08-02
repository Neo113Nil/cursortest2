package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableRefCount.java */
/* loaded from: classes11.dex */
public final class x1<T> extends io.reactivex.rxjava3.core.q<T> {
    public final io.reactivex.rxjava3.observables.a<T> b;
    public final int c = 1;
    public final long d;
    public final TimeUnit e;
    public final io.reactivex.rxjava3.core.w f;
    public a g;

    /* compiled from: ObservableRefCount.java */
    public static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements Runnable, io.reactivex.rxjava3.functions.f<io.reactivex.rxjava3.disposables.c> {
        private static final long serialVersionUID = -4552101107598366241L;
        boolean connected;
        boolean disconnectedEarly;
        final x1<?> parent;
        long subscriberCount;
        io.reactivex.rxjava3.disposables.c timer;

        public a(x1<?> x1Var) {
            this.parent = x1Var;
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(io.reactivex.rxjava3.disposables.c cVar) throws Throwable {
            DisposableHelper.c(this, cVar);
            synchronized (this.parent) {
                try {
                    if (this.disconnectedEarly) {
                        this.parent.b.P0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.parent.N0(this);
        }
    }

    /* compiled from: ObservableRefCount.java */
    public static final class b<T> extends AtomicBoolean implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = -7419642935409022375L;
        final a connection;
        final io.reactivex.rxjava3.core.v<? super T> downstream;
        final x1<T> parent;
        io.reactivex.rxjava3.disposables.c upstream;

        public b(io.reactivex.rxjava3.core.v<? super T> vVar, x1<T> x1Var, a aVar) {
            this.downstream = vVar;
            this.parent = x1Var;
            this.connection = aVar;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.upstream.dispose();
            if (compareAndSet(false, true)) {
                x1<T> x1Var = this.parent;
                a aVar = this.connection;
                synchronized (x1Var) {
                    try {
                        a aVar2 = x1Var.g;
                        if (aVar2 != null && aVar2 == aVar) {
                            long j = aVar.subscriberCount - 1;
                            aVar.subscriberCount = j;
                            if (j == 0 && aVar.connected) {
                                if (x1Var.d == 0) {
                                    x1Var.N0(aVar);
                                    return;
                                }
                                SequentialDisposable sequentialDisposable = new SequentialDisposable();
                                aVar.timer = sequentialDisposable;
                                DisposableHelper.c(sequentialDisposable, x1Var.f.d(aVar, x1Var.d, x1Var.e));
                            }
                        }
                    } finally {
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.upstream.h();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            if (compareAndSet(false, true)) {
                this.parent.M0(this.connection);
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (!compareAndSet(false, true)) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                this.parent.M0(this.connection);
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.upstream, cVar)) {
                this.upstream = cVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public x1(io.reactivex.rxjava3.observables.a aVar, long j, TimeUnit timeUnit, io.reactivex.rxjava3.core.w wVar) {
        this.b = aVar;
        this.d = j;
        this.e = timeUnit;
        this.f = wVar;
    }

    public final void M0(a aVar) {
        synchronized (this) {
            try {
                if (this.g == aVar) {
                    io.reactivex.rxjava3.disposables.c cVar = aVar.timer;
                    if (cVar != null) {
                        cVar.dispose();
                        aVar.timer = null;
                    }
                    long j = aVar.subscriberCount - 1;
                    aVar.subscriberCount = j;
                    if (j == 0) {
                        this.g = null;
                        this.b.P0();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void N0(a aVar) {
        synchronized (this) {
            try {
                if (aVar.subscriberCount == 0 && aVar == this.g) {
                    this.g = null;
                    io.reactivex.rxjava3.disposables.c cVar = aVar.get();
                    DisposableHelper.a(aVar);
                    if (cVar == null) {
                        aVar.disconnectedEarly = true;
                    } else {
                        this.b.P0();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        a aVar;
        boolean z;
        io.reactivex.rxjava3.disposables.c cVar;
        synchronized (this) {
            try {
                aVar = this.g;
                if (aVar == null) {
                    aVar = new a(this);
                    this.g = aVar;
                }
                long j = aVar.subscriberCount;
                if (j == 0 && (cVar = aVar.timer) != null) {
                    cVar.dispose();
                }
                long j2 = j + 1;
                aVar.subscriberCount = j2;
                if (aVar.connected || j2 != this.c) {
                    z = false;
                } else {
                    z = true;
                    aVar.connected = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b.subscribe(new b(vVar, this, aVar));
        if (z) {
            this.b.N0(aVar);
        }
    }
}
