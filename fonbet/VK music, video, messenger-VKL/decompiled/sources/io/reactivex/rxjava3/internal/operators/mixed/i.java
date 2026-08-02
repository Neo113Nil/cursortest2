package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.b0;
import io.reactivex.rxjava3.core.v;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableConcatMapSingle.java */
/* loaded from: classes8.dex */
public final class i<T, R> extends io.reactivex.rxjava3.core.q<R> {
    public final io.reactivex.rxjava3.core.q b;
    public final io.reactivex.rxjava3.functions.l<? super T, ? extends b0<? extends R>> c;
    public final ErrorMode d;
    public final int e = 2;

    /* compiled from: ObservableConcatMapSingle.java */
    public static final class a<T, R> extends AtomicInteger implements v<T>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = -9140123220065488293L;
        volatile boolean cancelled;
        volatile boolean done;
        final v<? super R> downstream;
        final ErrorMode errorMode;
        final AtomicThrowable errors = new AtomicThrowable();
        final C2136a<R> inner = new C2136a<>(this);
        R item;
        final io.reactivex.rxjava3.functions.l<? super T, ? extends b0<? extends R>> mapper;
        final io.reactivex.rxjava3.internal.fuseable.k<T> queue;
        volatile int state;
        io.reactivex.rxjava3.disposables.c upstream;

        /* compiled from: ObservableConcatMapSingle.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.mixed.i$a$a, reason: collision with other inner class name */
        public static final class C2136a<R> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements z<R> {
            private static final long serialVersionUID = -3051469169682093892L;
            final a<?, R> parent;

            public C2136a(a<?, R> aVar) {
                this.parent = aVar;
            }

            @Override // io.reactivex.rxjava3.core.z
            public final void onError(Throwable th) {
                a<?, R> aVar = this.parent;
                if (aVar.errors.a(th)) {
                    if (aVar.errorMode != ErrorMode.END) {
                        aVar.upstream.dispose();
                    }
                    aVar.state = 0;
                    aVar.d();
                }
            }

            @Override // io.reactivex.rxjava3.core.z
            public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
                DisposableHelper.c(this, cVar);
            }

            @Override // io.reactivex.rxjava3.core.z
            public final void onSuccess(R r) {
                a<?, R> aVar = this.parent;
                aVar.item = r;
                aVar.state = 2;
                aVar.d();
            }
        }

        public a(v<? super R> vVar, io.reactivex.rxjava3.functions.l<? super T, ? extends b0<? extends R>> lVar, int i, ErrorMode errorMode) {
            this.downstream = vVar;
            this.mapper = lVar;
            this.errorMode = errorMode;
            this.queue = new io.reactivex.rxjava3.internal.queue.b(i);
        }

        public final void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            v<? super R> vVar = this.downstream;
            ErrorMode errorMode = this.errorMode;
            io.reactivex.rxjava3.internal.fuseable.k<T> kVar = this.queue;
            AtomicThrowable atomicThrowable = this.errors;
            int i = 1;
            while (true) {
                if (this.cancelled) {
                    kVar.clear();
                    this.item = null;
                } else {
                    int i2 = this.state;
                    if (atomicThrowable.get() == null || (errorMode != ErrorMode.IMMEDIATE && (errorMode != ErrorMode.BOUNDARY || i2 != 0))) {
                        if (i2 == 0) {
                            boolean z = this.done;
                            T poll = kVar.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                atomicThrowable.f(vVar);
                                return;
                            }
                            if (!z2) {
                                try {
                                    b0<? extends R> apply = this.mapper.apply(poll);
                                    Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                                    b0<? extends R> b0Var = apply;
                                    this.state = 1;
                                    b0Var.subscribe(this.inner);
                                } catch (Throwable th) {
                                    io.reactivex.rxjava3.exceptions.a.b(th);
                                    this.upstream.dispose();
                                    kVar.clear();
                                    atomicThrowable.a(th);
                                    atomicThrowable.f(vVar);
                                    return;
                                }
                            }
                        } else if (i2 == 2) {
                            R r = this.item;
                            this.item = null;
                            vVar.onNext(r);
                            this.state = 0;
                        }
                    }
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
            kVar.clear();
            this.item = null;
            atomicThrowable.f(vVar);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            C2136a<R> c2136a = this.inner;
            c2136a.getClass();
            DisposableHelper.a(c2136a);
            this.errors.d();
            if (getAndIncrement() == 0) {
                this.queue.clear();
                this.item = null;
            }
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
                if (this.errorMode == ErrorMode.IMMEDIATE) {
                    C2136a<R> c2136a = this.inner;
                    c2136a.getClass();
                    DisposableHelper.a(c2136a);
                }
                this.done = true;
                d();
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            this.queue.offer(t);
            d();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.upstream, cVar)) {
                this.upstream = cVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public i(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.functions.l lVar, ErrorMode errorMode) {
        this.b = qVar;
        this.c = lVar;
        this.d = errorMode;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(v<? super R> vVar) {
        io.reactivex.rxjava3.core.q qVar = this.b;
        io.reactivex.rxjava3.functions.l<? super T, ? extends b0<? extends R>> lVar = this.c;
        if (p.c(qVar, lVar, vVar)) {
            return;
        }
        qVar.subscribe(new a(vVar, lVar, this.e, this.d));
    }
}
