package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.v;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.observable.y;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import xsna.dg1;

/* compiled from: ObservableConcatMapMaybe.java */
/* loaded from: classes8.dex */
public final class h<T, R> extends io.reactivex.rxjava3.core.q<R> {
    public final y b;
    public final dg1 c;
    public final ErrorMode d;
    public final int e = 2;

    /* compiled from: ObservableConcatMapMaybe.java */
    public static final class a<T, R> extends AtomicInteger implements v<T>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = -9140123220065488293L;
        volatile boolean cancelled;
        volatile boolean done;
        final v<? super R> downstream;
        final ErrorMode errorMode;
        final AtomicThrowable errors = new AtomicThrowable();
        final C2135a<R> inner = new C2135a<>(this);
        R item;
        final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.o<? extends R>> mapper;
        final io.reactivex.rxjava3.internal.fuseable.k<T> queue;
        volatile int state;
        io.reactivex.rxjava3.disposables.c upstream;

        /* compiled from: ObservableConcatMapMaybe.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.mixed.h$a$a, reason: collision with other inner class name */
        public static final class C2135a<R> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.m<R> {
            private static final long serialVersionUID = -3051469169682093892L;
            final a<?, R> parent;

            public C2135a(a<?, R> aVar) {
                this.parent = aVar;
            }

            @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.c
            public final void onComplete() {
                a<?, R> aVar = this.parent;
                aVar.state = 0;
                aVar.d();
            }

            @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
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

            @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
            public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
                DisposableHelper.c(this, cVar);
            }

            @Override // io.reactivex.rxjava3.core.m, io.reactivex.rxjava3.core.z
            public final void onSuccess(R r) {
                a<?, R> aVar = this.parent;
                aVar.item = r;
                aVar.state = 2;
                aVar.d();
            }
        }

        public a(v vVar, dg1 dg1Var, int i, ErrorMode errorMode) {
            this.downstream = vVar;
            this.mapper = dg1Var;
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
                                    io.reactivex.rxjava3.core.o<? extends R> apply = this.mapper.apply(poll);
                                    Objects.requireNonNull(apply, "The mapper returned a null MaybeSource");
                                    io.reactivex.rxjava3.core.o<? extends R> oVar = apply;
                                    this.state = 1;
                                    oVar.subscribe(this.inner);
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
            C2135a<R> c2135a = this.inner;
            c2135a.getClass();
            DisposableHelper.a(c2135a);
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
                    C2135a<R> c2135a = this.inner;
                    c2135a.getClass();
                    DisposableHelper.a(c2135a);
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

    public h(y yVar, dg1 dg1Var, ErrorMode errorMode) {
        this.b = yVar;
        this.c = dg1Var;
        this.d = errorMode;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(v<? super R> vVar) {
        y yVar = this.b;
        dg1 dg1Var = this.c;
        if (p.b(yVar, dg1Var, vVar)) {
            return;
        }
        yVar.subscribe(new a(vVar, dg1Var, this.e, this.d));
    }
}
