package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.InnerQueuedObserver;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableConcatMapEager.java */
/* loaded from: classes8.dex */
public final class p<T, R> extends io.reactivex.rxjava3.internal.operators.observable.a<T, R> {
    public final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.t<? extends R>> c;
    public final ErrorMode d;
    public final int e;
    public final int f;

    /* compiled from: ObservableConcatMapEager.java */
    public static final class a<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c, io.reactivex.rxjava3.internal.observers.h<R> {
        private static final long serialVersionUID = 8080567949447303262L;
        int activeCount;
        volatile boolean cancelled;
        InnerQueuedObserver<R> current;
        volatile boolean done;
        final io.reactivex.rxjava3.core.v<? super R> downstream;
        final ErrorMode errorMode;
        final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.t<? extends R>> mapper;
        final int maxConcurrency;
        final int prefetch;
        io.reactivex.rxjava3.internal.fuseable.l<T> queue;
        int sourceMode;
        io.reactivex.rxjava3.disposables.c upstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final ArrayDeque<InnerQueuedObserver<R>> observers = new ArrayDeque<>();

        public a(io.reactivex.rxjava3.core.v<? super R> vVar, io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.t<? extends R>> lVar, int i, int i2, ErrorMode errorMode) {
            this.downstream = vVar;
            this.mapper = lVar;
            this.maxConcurrency = i;
            this.prefetch = i2;
            this.errorMode = errorMode;
        }

        public final void d() {
            InnerQueuedObserver<R> innerQueuedObserver = this.current;
            if (innerQueuedObserver != null) {
                DisposableHelper.a(innerQueuedObserver);
            }
            while (true) {
                InnerQueuedObserver<R> poll = this.observers.poll();
                if (poll == null) {
                    return;
                } else {
                    DisposableHelper.a(poll);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.dispose();
            this.errors.d();
            if (getAndIncrement() == 0) {
                do {
                    this.queue.clear();
                    d();
                } while (decrementAndGet() != 0);
            }
        }

        public final void g() {
            R poll;
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.internal.fuseable.l<T> lVar = this.queue;
            ArrayDeque<InnerQueuedObserver<R>> arrayDeque = this.observers;
            io.reactivex.rxjava3.core.v<? super R> vVar = this.downstream;
            ErrorMode errorMode = this.errorMode;
            int i = 1;
            while (true) {
                int i2 = this.activeCount;
                while (i2 != this.maxConcurrency) {
                    if (this.cancelled) {
                        lVar.clear();
                        d();
                        return;
                    }
                    if (errorMode == ErrorMode.IMMEDIATE && this.errors.get() != null) {
                        lVar.clear();
                        d();
                        this.errors.f(this.downstream);
                        return;
                    }
                    try {
                        T poll2 = lVar.poll();
                        if (poll2 == null) {
                            break;
                        }
                        io.reactivex.rxjava3.core.t<? extends R> apply = this.mapper.apply(poll2);
                        Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                        io.reactivex.rxjava3.core.t<? extends R> tVar = apply;
                        InnerQueuedObserver<R> innerQueuedObserver = new InnerQueuedObserver<>(this, this.prefetch);
                        arrayDeque.offer(innerQueuedObserver);
                        tVar.subscribe(innerQueuedObserver);
                        i2++;
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.a.b(th);
                        this.upstream.dispose();
                        lVar.clear();
                        d();
                        this.errors.a(th);
                        this.errors.f(this.downstream);
                        return;
                    }
                }
                this.activeCount = i2;
                if (this.cancelled) {
                    lVar.clear();
                    d();
                    return;
                }
                if (errorMode == ErrorMode.IMMEDIATE && this.errors.get() != null) {
                    lVar.clear();
                    d();
                    this.errors.f(this.downstream);
                    return;
                }
                InnerQueuedObserver<R> innerQueuedObserver2 = this.current;
                if (innerQueuedObserver2 == null) {
                    if (errorMode == ErrorMode.BOUNDARY && this.errors.get() != null) {
                        lVar.clear();
                        d();
                        this.errors.f(vVar);
                        return;
                    }
                    boolean z2 = this.done;
                    InnerQueuedObserver<R> poll3 = arrayDeque.poll();
                    boolean z3 = poll3 == null;
                    if (z2 && z3) {
                        if (this.errors.get() == null) {
                            vVar.onComplete();
                            return;
                        }
                        lVar.clear();
                        d();
                        this.errors.f(vVar);
                        return;
                    }
                    if (!z3) {
                        this.current = poll3;
                    }
                    innerQueuedObserver2 = poll3;
                }
                if (innerQueuedObserver2 != null) {
                    io.reactivex.rxjava3.internal.fuseable.l<R> g = innerQueuedObserver2.g();
                    while (!this.cancelled) {
                        boolean d = innerQueuedObserver2.d();
                        if (errorMode == ErrorMode.IMMEDIATE && this.errors.get() != null) {
                            lVar.clear();
                            d();
                            this.errors.f(vVar);
                            return;
                        }
                        try {
                            poll = g.poll();
                            z = poll == null;
                        } catch (Throwable th2) {
                            io.reactivex.rxjava3.exceptions.a.b(th2);
                            this.errors.a(th2);
                            this.current = null;
                            this.activeCount--;
                        }
                        if (d && z) {
                            this.current = null;
                            this.activeCount--;
                        } else if (!z) {
                            vVar.onNext(poll);
                        }
                    }
                    lVar.clear();
                    d();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.cancelled;
        }

        public final void i(InnerQueuedObserver<R> innerQueuedObserver, Throwable th) {
            if (this.errors.a(th)) {
                if (this.errorMode == ErrorMode.IMMEDIATE) {
                    this.upstream.dispose();
                }
                innerQueuedObserver.i();
                g();
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            this.done = true;
            g();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (this.errors.a(th)) {
                this.done = true;
                g();
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            if (this.sourceMode == 0) {
                this.queue.offer(t);
            }
            g();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.upstream, cVar)) {
                this.upstream = cVar;
                if (cVar instanceof io.reactivex.rxjava3.internal.fuseable.g) {
                    io.reactivex.rxjava3.internal.fuseable.g gVar = (io.reactivex.rxjava3.internal.fuseable.g) cVar;
                    int a = gVar.a(3);
                    if (a == 1) {
                        this.sourceMode = a;
                        this.queue = gVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        g();
                        return;
                    }
                    if (a == 2) {
                        this.sourceMode = a;
                        this.queue = gVar;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new io.reactivex.rxjava3.internal.queue.b(this.prefetch);
                this.downstream.onSubscribe(this);
            }
        }
    }

    public p(int i, io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.functions.l lVar, ErrorMode errorMode) {
        super(qVar);
        this.c = lVar;
        this.d = errorMode;
        this.e = Integer.MAX_VALUE;
        this.f = i;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super R> vVar) {
        this.b.subscribe(new a(vVar, this.c, this.e, this.f, this.d));
    }
}
