package io.reactivex.rxjava3.internal.operators.observable;

import android.Manifest;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableConcatMap.java */
/* loaded from: classes11.dex */
public final class o<T, U> extends io.reactivex.rxjava3.internal.operators.observable.a<T, U> {
    public final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.t<? extends U>> c;
    public final int d;
    public final ErrorMode e;

    /* compiled from: ObservableConcatMap.java */
    public static final class a<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = -6951100001833242599L;
        volatile boolean active;
        final int bufferSize;
        volatile boolean cancelled;
        volatile boolean done;
        final io.reactivex.rxjava3.core.v<? super R> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.t<? extends R>> mapper;
        final C2144a<R> observer;
        io.reactivex.rxjava3.internal.fuseable.l<T> queue;
        int sourceMode;
        final boolean tillTheEnd;
        io.reactivex.rxjava3.disposables.c upstream;

        /* compiled from: ObservableConcatMap.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.o$a$a, reason: collision with other inner class name */
        public static final class C2144a<R> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.v<R> {
            private static final long serialVersionUID = 2620149119579502636L;
            final io.reactivex.rxjava3.core.v<? super R> downstream;
            final a<?, R> parent;

            public C2144a(io.reactivex.rxjava3.core.v<? super R> vVar, a<?, R> aVar) {
                this.downstream = vVar;
                this.parent = aVar;
            }

            @Override // io.reactivex.rxjava3.core.v
            public final void onComplete() {
                a<?, R> aVar = this.parent;
                aVar.active = false;
                aVar.d();
            }

            @Override // io.reactivex.rxjava3.core.v
            public final void onError(Throwable th) {
                a<?, R> aVar = this.parent;
                if (aVar.errors.a(th)) {
                    if (!aVar.tillTheEnd) {
                        aVar.upstream.dispose();
                    }
                    aVar.active = false;
                    aVar.d();
                }
            }

            @Override // io.reactivex.rxjava3.core.v
            public final void onNext(R r) {
                this.downstream.onNext(r);
            }

            @Override // io.reactivex.rxjava3.core.v
            public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
                DisposableHelper.c(this, cVar);
            }
        }

        public a(io.reactivex.rxjava3.core.v<? super R> vVar, io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.t<? extends R>> lVar, int i, boolean z) {
            this.downstream = vVar;
            this.mapper = lVar;
            this.bufferSize = i;
            this.tillTheEnd = z;
            this.observer = new C2144a<>(vVar, this);
        }

        public final void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.core.v<? super R> vVar = this.downstream;
            io.reactivex.rxjava3.internal.fuseable.l<T> lVar = this.queue;
            AtomicThrowable atomicThrowable = this.errors;
            while (true) {
                if (!this.active) {
                    if (this.cancelled) {
                        lVar.clear();
                        return;
                    }
                    if (!this.tillTheEnd && atomicThrowable.get() != null) {
                        lVar.clear();
                        this.cancelled = true;
                        atomicThrowable.f(vVar);
                        return;
                    }
                    boolean z = this.done;
                    try {
                        T poll = lVar.poll();
                        boolean z2 = poll == null;
                        if (z && z2) {
                            this.cancelled = true;
                            atomicThrowable.f(vVar);
                            return;
                        }
                        if (!z2) {
                            try {
                                io.reactivex.rxjava3.core.t<? extends R> apply = this.mapper.apply(poll);
                                Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                                io.reactivex.rxjava3.core.t<? extends R> tVar = apply;
                                if (tVar instanceof io.reactivex.rxjava3.functions.n) {
                                    try {
                                        Manifest.permission_group permission_groupVar = (Object) ((io.reactivex.rxjava3.functions.n) tVar).get();
                                        if (permission_groupVar != null && !this.cancelled) {
                                            vVar.onNext(permission_groupVar);
                                        }
                                    } catch (Throwable th) {
                                        io.reactivex.rxjava3.exceptions.a.b(th);
                                        atomicThrowable.a(th);
                                    }
                                } else {
                                    this.active = true;
                                    tVar.subscribe(this.observer);
                                }
                            } catch (Throwable th2) {
                                io.reactivex.rxjava3.exceptions.a.b(th2);
                                this.cancelled = true;
                                this.upstream.dispose();
                                lVar.clear();
                                atomicThrowable.a(th2);
                                atomicThrowable.f(vVar);
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        io.reactivex.rxjava3.exceptions.a.b(th3);
                        this.cancelled = true;
                        this.upstream.dispose();
                        atomicThrowable.a(th3);
                        atomicThrowable.f(vVar);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            C2144a<R> c2144a = this.observer;
            c2144a.getClass();
            DisposableHelper.a(c2144a);
            this.errors.d();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.cancelled;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            this.done = true;
            d();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (this.errors.a(th)) {
                this.done = true;
                d();
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            if (this.sourceMode == 0) {
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
                        this.sourceMode = a;
                        this.queue = gVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        d();
                        return;
                    }
                    if (a == 2) {
                        this.sourceMode = a;
                        this.queue = gVar;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new io.reactivex.rxjava3.internal.queue.b(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }
    }

    /* compiled from: ObservableConcatMap.java */
    /* loaded from: classes8.dex */
    public static final class b<T, U> extends AtomicInteger implements io.reactivex.rxjava3.core.v<T>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = 8828587559905699186L;
        volatile boolean active;
        final int bufferSize;
        volatile boolean disposed;
        volatile boolean done;
        final io.reactivex.rxjava3.core.v<? super U> downstream;
        int fusionMode;
        final a<U> inner;
        final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.t<? extends U>> mapper;
        io.reactivex.rxjava3.internal.fuseable.l<T> queue;
        io.reactivex.rxjava3.disposables.c upstream;

        /* compiled from: ObservableConcatMap.java */
        public static final class a<U> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.v<U> {
            private static final long serialVersionUID = -7449079488798789337L;
            final io.reactivex.rxjava3.core.v<? super U> downstream;
            final b<?, ?> parent;

            public a(io.reactivex.rxjava3.observers.e eVar, b bVar) {
                this.downstream = eVar;
                this.parent = bVar;
            }

            @Override // io.reactivex.rxjava3.core.v
            public final void onComplete() {
                b<?, ?> bVar = this.parent;
                bVar.active = false;
                bVar.d();
            }

            @Override // io.reactivex.rxjava3.core.v
            public final void onError(Throwable th) {
                this.parent.dispose();
                this.downstream.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.v
            public final void onNext(U u) {
                this.downstream.onNext(u);
            }

            @Override // io.reactivex.rxjava3.core.v
            public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
                DisposableHelper.c(this, cVar);
            }
        }

        public b(io.reactivex.rxjava3.observers.e eVar, io.reactivex.rxjava3.functions.l lVar, int i) {
            this.downstream = eVar;
            this.mapper = lVar;
            this.bufferSize = i;
            this.inner = new a<>(eVar, this);
        }

        public final void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.disposed) {
                if (!this.active) {
                    boolean z = this.done;
                    try {
                        T poll = this.queue.poll();
                        boolean z2 = poll == null;
                        if (z && z2) {
                            this.disposed = true;
                            this.downstream.onComplete();
                            return;
                        }
                        if (!z2) {
                            try {
                                io.reactivex.rxjava3.core.t<? extends U> apply = this.mapper.apply(poll);
                                Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                                io.reactivex.rxjava3.core.t<? extends U> tVar = apply;
                                this.active = true;
                                tVar.subscribe(this.inner);
                            } catch (Throwable th) {
                                io.reactivex.rxjava3.exceptions.a.b(th);
                                dispose();
                                this.queue.clear();
                                this.downstream.onError(th);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.a.b(th2);
                        dispose();
                        this.queue.clear();
                        this.downstream.onError(th2);
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
            a<U> aVar = this.inner;
            aVar.getClass();
            DisposableHelper.a(aVar);
            this.upstream.dispose();
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
            if (this.done) {
                return;
            }
            this.done = true;
            d();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.a(th);
                return;
            }
            this.done = true;
            dispose();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            if (this.done) {
                return;
            }
            if (this.fusionMode == 0) {
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
                    int a2 = gVar.a(3);
                    if (a2 == 1) {
                        this.fusionMode = a2;
                        this.queue = gVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        d();
                        return;
                    }
                    if (a2 == 2) {
                        this.fusionMode = a2;
                        this.queue = gVar;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new io.reactivex.rxjava3.internal.queue.b(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }
    }

    public o(int i, io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.functions.l lVar, ErrorMode errorMode) {
        super(qVar);
        this.c = lVar;
        this.e = errorMode;
        this.d = Math.max(8, i);
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super U> vVar) {
        io.reactivex.rxjava3.core.t<T> tVar = this.b;
        io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.t<? extends U>> lVar = this.c;
        if (ObservableScalarXMap.a(tVar, vVar, lVar)) {
            return;
        }
        ErrorMode errorMode = ErrorMode.IMMEDIATE;
        int i = this.d;
        ErrorMode errorMode2 = this.e;
        if (errorMode2 == errorMode) {
            tVar.subscribe(new b(new io.reactivex.rxjava3.observers.e(vVar), lVar, i));
        } else {
            tVar.subscribe(new a(vVar, lVar, i, errorMode2 == ErrorMode.END));
        }
    }
}
