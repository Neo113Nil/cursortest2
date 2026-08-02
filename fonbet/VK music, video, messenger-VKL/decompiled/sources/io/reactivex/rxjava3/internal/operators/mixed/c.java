package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.b0;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import xsna.axm0;
import xsna.jxm0;

/* compiled from: FlowableConcatMapSingle.java */
/* loaded from: classes8.dex */
public final class c<T, R> extends io.reactivex.rxjava3.core.g<R> {
    public final io.reactivex.rxjava3.core.g<T> c;
    public final ErrorMode e;
    public final a.q d = io.reactivex.rxjava3.internal.functions.a.a;
    public final int f = 2;

    /* compiled from: FlowableConcatMapSingle.java */
    public static final class a<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.j<T>, jxm0 {
        private static final long serialVersionUID = -9140123220065488293L;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        final axm0<? super R> downstream;
        long emitted;
        final ErrorMode errorMode;
        R item;
        final io.reactivex.rxjava3.functions.l<? super T, ? extends b0<? extends R>> mapper;
        final int prefetch;
        final io.reactivex.rxjava3.internal.fuseable.k<T> queue;
        volatile int state;
        jxm0 upstream;
        final AtomicLong requested = new AtomicLong();
        final AtomicThrowable errors = new AtomicThrowable();
        final C2132a<R> inner = new C2132a<>(this);

        /* compiled from: FlowableConcatMapSingle.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.mixed.c$a$a, reason: collision with other inner class name */
        public static final class C2132a<R> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements z<R> {
            private static final long serialVersionUID = -3051469169682093892L;
            final a<?, R> parent;

            public C2132a(a<?, R> aVar) {
                this.parent = aVar;
            }

            @Override // io.reactivex.rxjava3.core.z
            public final void onError(Throwable th) {
                a<?, R> aVar = this.parent;
                if (aVar.errors.a(th)) {
                    if (aVar.errorMode != ErrorMode.END) {
                        aVar.upstream.cancel();
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

        public a(axm0 axm0Var, a.q qVar, int i, ErrorMode errorMode) {
            this.downstream = axm0Var;
            this.mapper = qVar;
            this.prefetch = i;
            this.errorMode = errorMode;
            this.queue = new SpscArrayQueue(i);
        }

        @Override // xsna.jxm0
        public final void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            C2132a<R> c2132a = this.inner;
            c2132a.getClass();
            DisposableHelper.a(c2132a);
            this.errors.d();
            if (getAndIncrement() == 0) {
                this.queue.clear();
                this.item = null;
            }
        }

        public final void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            axm0<? super R> axm0Var = this.downstream;
            ErrorMode errorMode = this.errorMode;
            io.reactivex.rxjava3.internal.fuseable.k<T> kVar = this.queue;
            AtomicThrowable atomicThrowable = this.errors;
            AtomicLong atomicLong = this.requested;
            int i = this.prefetch;
            int i2 = i - (i >> 1);
            int i3 = 1;
            while (true) {
                if (this.cancelled) {
                    kVar.clear();
                    this.item = null;
                } else {
                    int i4 = this.state;
                    if (atomicThrowable.get() == null || (errorMode != ErrorMode.IMMEDIATE && (errorMode != ErrorMode.BOUNDARY || i4 != 0))) {
                        if (i4 == 0) {
                            boolean z = this.done;
                            T poll = kVar.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                atomicThrowable.g(axm0Var);
                                return;
                            }
                            if (!z2) {
                                int i5 = this.consumed + 1;
                                if (i5 == i2) {
                                    this.consumed = 0;
                                    this.upstream.request(i2);
                                } else {
                                    this.consumed = i5;
                                }
                                try {
                                    b0<? extends R> apply = this.mapper.apply(poll);
                                    Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                                    b0<? extends R> b0Var = apply;
                                    this.state = 1;
                                    b0Var.subscribe(this.inner);
                                } catch (Throwable th) {
                                    io.reactivex.rxjava3.exceptions.a.b(th);
                                    this.upstream.cancel();
                                    kVar.clear();
                                    atomicThrowable.a(th);
                                    atomicThrowable.g(axm0Var);
                                    return;
                                }
                            }
                        } else if (i4 == 2) {
                            long j = this.emitted;
                            if (j != atomicLong.get()) {
                                R r = this.item;
                                this.item = null;
                                axm0Var.onNext(r);
                                this.emitted = j + 1;
                                this.state = 0;
                            }
                        }
                    }
                }
                i3 = addAndGet(-i3);
                if (i3 == 0) {
                    return;
                }
            }
            kVar.clear();
            this.item = null;
            atomicThrowable.g(axm0Var);
        }

        @Override // xsna.axm0
        public final void onComplete() {
            this.done = true;
            d();
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            if (this.errors.a(th)) {
                if (this.errorMode == ErrorMode.IMMEDIATE) {
                    C2132a<R> c2132a = this.inner;
                    c2132a.getClass();
                    DisposableHelper.a(c2132a);
                }
                this.done = true;
                d();
            }
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            if (this.queue.offer(t)) {
                d();
            } else {
                this.upstream.cancel();
                onError(new MissingBackpressureException("queue full?!"));
            }
        }

        @Override // xsna.axm0
        public final void onSubscribe(jxm0 jxm0Var) {
            if (SubscriptionHelper.f(this.upstream, jxm0Var)) {
                this.upstream = jxm0Var;
                this.downstream.onSubscribe(this);
                jxm0Var.request(this.prefetch);
            }
        }

        @Override // xsna.jxm0
        public final void request(long j) {
            io.reactivex.rxjava3.internal.util.b.a(this.requested, j);
            d();
        }
    }

    public c(io.reactivex.rxjava3.core.g gVar, ErrorMode errorMode) {
        this.c = gVar;
        this.e = errorMode;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super R> axm0Var) {
        this.c.subscribe((io.reactivex.rxjava3.core.j) new a(axm0Var, this.d, this.f, this.e));
    }
}
