package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.axm0;
import xsna.ffe0;
import xsna.jxm0;

/* compiled from: FlowableConcatMap.java */
/* loaded from: classes8.dex */
public final class i<T, R> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, R> {
    public final io.reactivex.rxjava3.functions.l<? super T, ? extends ffe0<? extends R>> d;
    public final int e;
    public final ErrorMode f;

    /* compiled from: FlowableConcatMap.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ErrorMode.values().length];
            a = iArr;
            try {
                iArr[ErrorMode.BOUNDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ErrorMode.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: FlowableConcatMap.java */
    public static abstract class b<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.j<T>, f<R>, jxm0 {
        private static final long serialVersionUID = -3511336836796789179L;
        volatile boolean active;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        final int limit;
        final io.reactivex.rxjava3.functions.l<? super T, ? extends ffe0<? extends R>> mapper;
        final int prefetch;
        io.reactivex.rxjava3.internal.fuseable.l<T> queue;
        int sourceMode;
        jxm0 upstream;
        final e<R> inner = new e<>(this);
        final AtomicThrowable errors = new AtomicThrowable();

        public b(io.reactivex.rxjava3.functions.l<? super T, ? extends ffe0<? extends R>> lVar, int i) {
            this.mapper = lVar;
            this.prefetch = i;
            this.limit = i - (i >> 2);
        }

        public abstract void d();

        public abstract void g();

        @Override // xsna.axm0
        public final void onComplete() {
            this.done = true;
            d();
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            if (this.sourceMode == 2 || this.queue.offer(t)) {
                d();
            } else {
                this.upstream.cancel();
                onError(new IllegalStateException("Queue full?!"));
            }
        }

        @Override // xsna.axm0
        public final void onSubscribe(jxm0 jxm0Var) {
            if (SubscriptionHelper.f(this.upstream, jxm0Var)) {
                this.upstream = jxm0Var;
                if (jxm0Var instanceof io.reactivex.rxjava3.internal.fuseable.i) {
                    io.reactivex.rxjava3.internal.fuseable.i iVar = (io.reactivex.rxjava3.internal.fuseable.i) jxm0Var;
                    int a = iVar.a(7);
                    if (a == 1) {
                        this.sourceMode = a;
                        this.queue = iVar;
                        this.done = true;
                        g();
                        d();
                        return;
                    }
                    if (a == 2) {
                        this.sourceMode = a;
                        this.queue = iVar;
                        g();
                        jxm0Var.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                g();
                jxm0Var.request(this.prefetch);
            }
        }
    }

    /* compiled from: FlowableConcatMap.java */
    public static final class c<T, R> extends b<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;
        final axm0<? super R> downstream;
        final boolean veryEnd;

        public c(axm0<? super R> axm0Var, io.reactivex.rxjava3.functions.l<? super T, ? extends ffe0<? extends R>> lVar, int i, boolean z) {
            super(lVar, i);
            this.downstream = axm0Var;
            this.veryEnd = z;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.i.f
        public final void a(R r) {
            this.downstream.onNext(r);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.i.f
        public final void b(Throwable th) {
            if (this.errors.a(th)) {
                if (!this.veryEnd) {
                    this.upstream.cancel();
                    this.done = true;
                }
                this.active = false;
                d();
            }
        }

        @Override // xsna.jxm0
        public final void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.inner.cancel();
            this.upstream.cancel();
            this.errors.d();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.i.b
        public final void d() {
            Object obj;
            if (getAndIncrement() == 0) {
                while (!this.cancelled) {
                    if (!this.active) {
                        boolean z = this.done;
                        if (z && !this.veryEnd && this.errors.get() != null) {
                            this.errors.g(this.downstream);
                            return;
                        }
                        try {
                            T poll = this.queue.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                this.errors.g(this.downstream);
                                return;
                            }
                            if (!z2) {
                                try {
                                    ffe0<? extends R> apply = this.mapper.apply(poll);
                                    Objects.requireNonNull(apply, "The mapper returned a null Publisher");
                                    ffe0<? extends R> ffe0Var = apply;
                                    if (this.sourceMode != 1) {
                                        int i = this.consumed + 1;
                                        if (i == this.limit) {
                                            this.consumed = 0;
                                            this.upstream.request(i);
                                        } else {
                                            this.consumed = i;
                                        }
                                    }
                                    if (ffe0Var instanceof io.reactivex.rxjava3.functions.n) {
                                        try {
                                            obj = ((io.reactivex.rxjava3.functions.n) ffe0Var).get();
                                        } catch (Throwable th) {
                                            io.reactivex.rxjava3.exceptions.a.b(th);
                                            this.errors.a(th);
                                            if (!this.veryEnd) {
                                                this.upstream.cancel();
                                                this.errors.g(this.downstream);
                                                return;
                                            }
                                            obj = null;
                                        }
                                        if (obj == null) {
                                            continue;
                                        } else if (this.inner.h()) {
                                            this.downstream.onNext(obj);
                                        } else {
                                            this.active = true;
                                            e<R> eVar = this.inner;
                                            eVar.j(new g(obj, eVar));
                                        }
                                    } else {
                                        this.active = true;
                                        ffe0Var.subscribe(this.inner);
                                    }
                                } catch (Throwable th2) {
                                    io.reactivex.rxjava3.exceptions.a.b(th2);
                                    this.upstream.cancel();
                                    this.errors.a(th2);
                                    this.errors.g(this.downstream);
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            io.reactivex.rxjava3.exceptions.a.b(th3);
                            this.upstream.cancel();
                            this.errors.a(th3);
                            this.errors.g(this.downstream);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.i.b
        public final void g() {
            this.downstream.onSubscribe(this);
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            if (this.errors.a(th)) {
                this.done = true;
                d();
            }
        }

        @Override // xsna.jxm0
        public final void request(long j) {
            this.inner.request(j);
        }
    }

    /* compiled from: FlowableConcatMap.java */
    public static final class d<T, R> extends b<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;
        final axm0<? super R> downstream;
        final AtomicInteger wip;

        public d(axm0<? super R> axm0Var, io.reactivex.rxjava3.functions.l<? super T, ? extends ffe0<? extends R>> lVar, int i) {
            super(lVar, i);
            this.downstream = axm0Var;
            this.wip = new AtomicInteger();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.i.f
        public final void a(R r) {
            io.reactivex.rxjava3.internal.util.g.d(this.downstream, r, this, this.errors);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.i.f
        public final void b(Throwable th) {
            this.upstream.cancel();
            axm0<? super R> axm0Var = this.downstream;
            AtomicThrowable atomicThrowable = this.errors;
            if (atomicThrowable.a(th) && getAndIncrement() == 0) {
                atomicThrowable.g(axm0Var);
            }
        }

        @Override // xsna.jxm0
        public final void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.inner.cancel();
            this.upstream.cancel();
            this.errors.d();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.i.b
        public final void d() {
            if (this.wip.getAndIncrement() == 0) {
                while (!this.cancelled) {
                    if (!this.active) {
                        boolean z = this.done;
                        try {
                            T poll = this.queue.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                this.downstream.onComplete();
                                return;
                            }
                            if (!z2) {
                                try {
                                    ffe0<? extends R> apply = this.mapper.apply(poll);
                                    Objects.requireNonNull(apply, "The mapper returned a null Publisher");
                                    ffe0<? extends R> ffe0Var = apply;
                                    if (this.sourceMode != 1) {
                                        int i = this.consumed + 1;
                                        if (i == this.limit) {
                                            this.consumed = 0;
                                            this.upstream.request(i);
                                        } else {
                                            this.consumed = i;
                                        }
                                    }
                                    if (ffe0Var instanceof io.reactivex.rxjava3.functions.n) {
                                        try {
                                            Object obj = ((io.reactivex.rxjava3.functions.n) ffe0Var).get();
                                            if (obj == null) {
                                                continue;
                                            } else if (!this.inner.h()) {
                                                this.active = true;
                                                e<R> eVar = this.inner;
                                                eVar.j(new g(obj, eVar));
                                            } else if (!io.reactivex.rxjava3.internal.util.g.d(this.downstream, obj, this, this.errors)) {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            io.reactivex.rxjava3.exceptions.a.b(th);
                                            this.upstream.cancel();
                                            this.errors.a(th);
                                            this.errors.g(this.downstream);
                                            return;
                                        }
                                    } else {
                                        this.active = true;
                                        ffe0Var.subscribe(this.inner);
                                    }
                                } catch (Throwable th2) {
                                    io.reactivex.rxjava3.exceptions.a.b(th2);
                                    this.upstream.cancel();
                                    this.errors.a(th2);
                                    this.errors.g(this.downstream);
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            io.reactivex.rxjava3.exceptions.a.b(th3);
                            this.upstream.cancel();
                            this.errors.a(th3);
                            this.errors.g(this.downstream);
                            return;
                        }
                    }
                    if (this.wip.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.i.b
        public final void g() {
            this.downstream.onSubscribe(this);
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            this.inner.cancel();
            axm0<? super R> axm0Var = this.downstream;
            AtomicThrowable atomicThrowable = this.errors;
            if (atomicThrowable.a(th) && getAndIncrement() == 0) {
                atomicThrowable.g(axm0Var);
            }
        }

        @Override // xsna.jxm0
        public final void request(long j) {
            this.inner.request(j);
        }
    }

    /* compiled from: FlowableConcatMap.java */
    public static final class e<R> extends SubscriptionArbiter implements io.reactivex.rxjava3.core.j<R> {
        private static final long serialVersionUID = 897683679971470653L;
        final f<R> parent;
        long produced;

        public e(b bVar) {
            this.parent = bVar;
        }

        @Override // xsna.axm0
        public final void onComplete() {
            long j = this.produced;
            if (j != 0) {
                this.produced = 0L;
                i(j);
            }
            b bVar = (b) this.parent;
            bVar.active = false;
            bVar.d();
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            long j = this.produced;
            if (j != 0) {
                this.produced = 0L;
                i(j);
            }
            this.parent.b(th);
        }

        @Override // xsna.axm0
        public final void onNext(R r) {
            this.produced++;
            this.parent.a(r);
        }
    }

    /* compiled from: FlowableConcatMap.java */
    public interface f<T> {
        void a(T t);

        void b(Throwable th);
    }

    public i(io.reactivex.rxjava3.core.g gVar, io.reactivex.rxjava3.functions.l lVar, ErrorMode errorMode) {
        super(gVar);
        this.d = lVar;
        this.e = 2;
        this.f = errorMode;
    }

    public static <T, R> axm0<T> subscribe(axm0<? super R> axm0Var, io.reactivex.rxjava3.functions.l<? super T, ? extends ffe0<? extends R>> lVar, int i, ErrorMode errorMode) {
        int i2 = a.a[errorMode.ordinal()];
        return i2 != 1 ? i2 != 2 ? new d(axm0Var, lVar, i) : new c(axm0Var, lVar, i, true) : new c(axm0Var, lVar, i, false);
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super R> axm0Var) {
        io.reactivex.rxjava3.core.g<T> gVar = this.c;
        io.reactivex.rxjava3.functions.l<? super T, ? extends ffe0<? extends R>> lVar = this.d;
        if (s0.b(gVar, axm0Var, lVar)) {
            return;
        }
        gVar.subscribe(subscribe(axm0Var, lVar, this.e, this.f));
    }

    /* compiled from: FlowableConcatMap.java */
    public static final class g<T> implements jxm0 {
        public final axm0<? super T> b;
        public final T c;
        public boolean d;

        public g(T t, axm0<? super T> axm0Var) {
            this.c = t;
            this.b = axm0Var;
        }

        @Override // xsna.jxm0
        public final void request(long j) {
            if (j <= 0 || this.d) {
                return;
            }
            this.d = true;
            T t = this.c;
            axm0<? super T> axm0Var = this.b;
            axm0Var.onNext(t);
            axm0Var.onComplete();
        }

        @Override // xsna.jxm0
        public final void cancel() {
        }
    }
}
