package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.v;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableConcatMapCompletable.java */
/* loaded from: classes8.dex */
public final class g<T> extends io.reactivex.rxjava3.core.a {
    public final io.reactivex.rxjava3.core.q<T> b;
    public final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.e> c;
    public final ErrorMode d;
    public final int e = 2;

    /* compiled from: ObservableConcatMapCompletable.java */
    public static final class a<T> extends AtomicInteger implements v<T>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = 3610901111000061034L;
        volatile boolean active;
        volatile boolean disposed;
        volatile boolean done;
        final io.reactivex.rxjava3.core.c downstream;
        final ErrorMode errorMode;
        final AtomicThrowable errors = new AtomicThrowable();
        final C2134a inner = new C2134a(this);
        final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.e> mapper;
        final int prefetch;
        io.reactivex.rxjava3.internal.fuseable.l<T> queue;
        io.reactivex.rxjava3.disposables.c upstream;

        /* compiled from: ObservableConcatMapCompletable.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.mixed.g$a$a, reason: collision with other inner class name */
        public static final class C2134a extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.c {
            private static final long serialVersionUID = 5638352172918776687L;
            final a<?> parent;

            public C2134a(a<?> aVar) {
                this.parent = aVar;
            }

            @Override // io.reactivex.rxjava3.core.c
            public final void onComplete() {
                a<?> aVar = this.parent;
                aVar.active = false;
                aVar.d();
            }

            @Override // io.reactivex.rxjava3.core.c
            public final void onError(Throwable th) {
                a<?> aVar = this.parent;
                if (aVar.errors.a(th)) {
                    if (aVar.errorMode != ErrorMode.IMMEDIATE) {
                        aVar.active = false;
                        aVar.d();
                        return;
                    }
                    aVar.disposed = true;
                    aVar.upstream.dispose();
                    aVar.errors.e(aVar.downstream);
                    if (aVar.getAndIncrement() == 0) {
                        aVar.queue.clear();
                    }
                }
            }

            @Override // io.reactivex.rxjava3.core.c
            public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
                DisposableHelper.c(this, cVar);
            }
        }

        public a(io.reactivex.rxjava3.core.c cVar, io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.e> lVar, ErrorMode errorMode, int i) {
            this.downstream = cVar;
            this.mapper = lVar;
            this.errorMode = errorMode;
            this.prefetch = i;
        }

        public final void d() {
            io.reactivex.rxjava3.core.e eVar;
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicThrowable atomicThrowable = this.errors;
            ErrorMode errorMode = this.errorMode;
            while (!this.disposed) {
                if (!this.active) {
                    if (errorMode == ErrorMode.BOUNDARY && atomicThrowable.get() != null) {
                        this.disposed = true;
                        this.queue.clear();
                        atomicThrowable.e(this.downstream);
                        return;
                    }
                    boolean z2 = this.done;
                    try {
                        T poll = this.queue.poll();
                        if (poll != null) {
                            io.reactivex.rxjava3.core.e apply = this.mapper.apply(poll);
                            Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                            eVar = apply;
                            z = false;
                        } else {
                            eVar = null;
                            z = true;
                        }
                        if (z2 && z) {
                            this.disposed = true;
                            atomicThrowable.e(this.downstream);
                            return;
                        } else if (!z) {
                            this.active = true;
                            eVar.subscribe(this.inner);
                        }
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.a.b(th);
                        this.disposed = true;
                        this.queue.clear();
                        this.upstream.dispose();
                        atomicThrowable.a(th);
                        atomicThrowable.e(this.downstream);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.queue.clear();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.disposed = true;
            this.upstream.dispose();
            C2134a c2134a = this.inner;
            c2134a.getClass();
            DisposableHelper.a(c2134a);
            this.errors.d();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.disposed;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            this.done = true;
            d();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (this.errors.a(th)) {
                if (this.errorMode != ErrorMode.IMMEDIATE) {
                    this.done = true;
                    d();
                    return;
                }
                this.disposed = true;
                C2134a c2134a = this.inner;
                c2134a.getClass();
                DisposableHelper.a(c2134a);
                this.errors.e(this.downstream);
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            if (t != null) {
                this.queue.offer(t);
            }
            d();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.upstream, cVar)) {
                this.upstream = cVar;
                if (cVar instanceof io.reactivex.rxjava3.internal.fuseable.g) {
                    io.reactivex.rxjava3.internal.fuseable.g gVar = (io.reactivex.rxjava3.internal.fuseable.g) cVar;
                    int a = gVar.a(3);
                    if (a == 1) {
                        this.queue = gVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        d();
                        return;
                    }
                    if (a == 2) {
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

    public g(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.functions.l lVar, ErrorMode errorMode) {
        this.b = qVar;
        this.c = lVar;
        this.d = errorMode;
    }

    @Override // io.reactivex.rxjava3.core.a
    public final void p(io.reactivex.rxjava3.core.c cVar) {
        io.reactivex.rxjava3.core.q<T> qVar = this.b;
        io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.e> lVar = this.c;
        if (p.a(qVar, lVar, cVar)) {
            return;
        }
        qVar.subscribe(new a(cVar, lVar, this.d, this.e));
    }
}
