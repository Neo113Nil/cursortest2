package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import xsna.axm0;
import xsna.jxm0;
import xsna.ka4;

/* compiled from: FlowableFlattenIterable.java */
/* loaded from: classes11.dex */
public final class u<T, R> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, R> {
    public final ka4 d;
    public final int e;

    /* compiled from: FlowableFlattenIterable.java */
    public static final class a<T, R> extends BasicIntQueueSubscription<R> implements io.reactivex.rxjava3.core.j<T> {
        private static final long serialVersionUID = -3096000382929934955L;
        volatile boolean cancelled;
        int consumed;
        Iterator<? extends R> current;
        volatile boolean done;
        final axm0<? super R> downstream;
        int fusionMode;
        final int limit;
        final io.reactivex.rxjava3.functions.l<? super T, ? extends Iterable<? extends R>> mapper;
        final int prefetch;
        io.reactivex.rxjava3.internal.fuseable.l<T> queue;
        jxm0 upstream;
        final AtomicReference<Throwable> error = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        public a(axm0<? super R> axm0Var, io.reactivex.rxjava3.functions.l<? super T, ? extends Iterable<? extends R>> lVar, int i) {
            this.downstream = axm0Var;
            this.mapper = lVar;
            this.prefetch = i;
            this.limit = i - (i >> 2);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.h
        public final int a(int i) {
            return this.fusionMode == 1 ? 1 : 0;
        }

        public final boolean b(boolean z, boolean z2, axm0<?> axm0Var, io.reactivex.rxjava3.internal.fuseable.l<?> lVar) {
            if (this.cancelled) {
                this.current = null;
                lVar.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.error.get() == null) {
                if (!z2) {
                    return false;
                }
                axm0Var.onComplete();
                return true;
            }
            Throwable d = io.reactivex.rxjava3.internal.util.f.d(this.error);
            this.current = null;
            lVar.clear();
            axm0Var.onError(d);
            return true;
        }

        @Override // xsna.jxm0
        public final void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final void clear() {
            this.current = null;
            this.queue.clear();
        }

        /* JADX WARN: Code restructure failed: missing block: B:61:0x014b, code lost:
        
            if (r6 == null) goto L80;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void d() {
            int i;
            if (getAndIncrement() != 0) {
                return;
            }
            axm0<?> axm0Var = this.downstream;
            io.reactivex.rxjava3.internal.fuseable.l<T> lVar = this.queue;
            boolean z = false;
            int i2 = 1;
            Object[] objArr = this.fusionMode != 1;
            Iterator<? extends R> it = this.current;
            int i3 = 1;
            while (true) {
                if (it == null) {
                    boolean z2 = this.done;
                    try {
                        T poll = lVar.poll();
                        if (b(z2, poll == null ? i2 : z ? 1 : 0, axm0Var, lVar)) {
                            return;
                        }
                        if (poll != null) {
                            try {
                                it = this.mapper.apply(poll).iterator();
                                if (it.hasNext()) {
                                    this.current = it;
                                } else {
                                    if (objArr != false) {
                                        int i4 = this.consumed + i2;
                                        if (i4 == this.limit) {
                                            this.consumed = z ? 1 : 0;
                                            this.upstream.request(i4);
                                        } else {
                                            this.consumed = i4;
                                        }
                                    }
                                    it = null;
                                }
                            } catch (Throwable th) {
                                io.reactivex.rxjava3.exceptions.a.b(th);
                                this.upstream.cancel();
                                io.reactivex.rxjava3.internal.util.f.a(this.error, th);
                                axm0Var.onError(io.reactivex.rxjava3.internal.util.f.d(this.error));
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.a.b(th2);
                        this.upstream.cancel();
                        io.reactivex.rxjava3.internal.util.f.a(this.error, th2);
                        Throwable d = io.reactivex.rxjava3.internal.util.f.d(this.error);
                        this.current = null;
                        lVar.clear();
                        axm0Var.onError(d);
                        return;
                    }
                }
                if (it != null) {
                    long j = this.requested.get();
                    long j2 = 0;
                    while (true) {
                        if (j2 == j) {
                            i = i2;
                            break;
                        }
                        if (b(this.done, z, axm0Var, lVar)) {
                            return;
                        }
                        try {
                            R next = it.next();
                            i = i2;
                            Objects.requireNonNull(next, "The iterator returned a null value");
                            axm0Var.onNext(next);
                            if (b(this.done, z, axm0Var, lVar)) {
                                return;
                            }
                            j2++;
                            try {
                                if (it.hasNext()) {
                                    i2 = i;
                                } else {
                                    if (objArr != false) {
                                        int i5 = this.consumed + 1;
                                        if (i5 == this.limit) {
                                            this.consumed = z ? 1 : 0;
                                            this.upstream.request(i5);
                                        } else {
                                            this.consumed = i5;
                                        }
                                    }
                                    this.current = null;
                                    it = null;
                                }
                            } catch (Throwable th3) {
                                io.reactivex.rxjava3.exceptions.a.b(th3);
                                this.current = null;
                                this.upstream.cancel();
                                io.reactivex.rxjava3.internal.util.f.a(this.error, th3);
                                axm0Var.onError(io.reactivex.rxjava3.internal.util.f.d(this.error));
                                return;
                            }
                        } catch (Throwable th4) {
                            io.reactivex.rxjava3.exceptions.a.b(th4);
                            this.current = null;
                            this.upstream.cancel();
                            io.reactivex.rxjava3.internal.util.f.a(this.error, th4);
                            axm0Var.onError(io.reactivex.rxjava3.internal.util.f.d(this.error));
                            return;
                        }
                    }
                    if (j2 == j) {
                        if (b(this.done, (lVar.isEmpty() && it == null) ? i : 0, axm0Var, lVar)) {
                            return;
                        }
                    }
                    if (j2 != 0 && j != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j2);
                    }
                } else {
                    i = i2;
                }
                i3 = addAndGet(-i3);
                if (i3 == 0) {
                    return;
                }
                i2 = i;
                z = false;
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final boolean isEmpty() {
            return this.current == null && this.queue.isEmpty();
        }

        @Override // xsna.axm0
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            d();
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            if (this.done || !io.reactivex.rxjava3.internal.util.f.a(this.error, th)) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                this.done = true;
                d();
            }
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            if (this.done) {
                return;
            }
            if (this.fusionMode != 0 || this.queue.offer(t)) {
                d();
            } else {
                onError(new MissingBackpressureException("Queue is full?!"));
            }
        }

        @Override // xsna.axm0
        public final void onSubscribe(jxm0 jxm0Var) {
            if (SubscriptionHelper.f(this.upstream, jxm0Var)) {
                this.upstream = jxm0Var;
                if (jxm0Var instanceof io.reactivex.rxjava3.internal.fuseable.i) {
                    io.reactivex.rxjava3.internal.fuseable.i iVar = (io.reactivex.rxjava3.internal.fuseable.i) jxm0Var;
                    int a = iVar.a(3);
                    if (a == 1) {
                        this.fusionMode = a;
                        this.queue = iVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                    if (a == 2) {
                        this.fusionMode = a;
                        this.queue = iVar;
                        this.downstream.onSubscribe(this);
                        jxm0Var.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                this.downstream.onSubscribe(this);
                jxm0Var.request(this.prefetch);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final R poll() throws Throwable {
            Iterator<? extends R> it = this.current;
            while (true) {
                if (it == null) {
                    T poll = this.queue.poll();
                    if (poll != null) {
                        it = this.mapper.apply(poll).iterator();
                        if (it.hasNext()) {
                            this.current = it;
                            break;
                        }
                        it = null;
                    } else {
                        return null;
                    }
                } else {
                    break;
                }
            }
            R next = it.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.current = null;
            }
            return next;
        }

        @Override // xsna.jxm0
        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                io.reactivex.rxjava3.internal.util.b.a(this.requested, j);
                d();
            }
        }
    }

    public u(d0 d0Var, ka4 ka4Var, int i) {
        super(d0Var);
        this.d = ka4Var;
        this.e = i;
    }

    public static <T, R> axm0<T> subscribe(axm0<? super R> axm0Var, io.reactivex.rxjava3.functions.l<? super T, ? extends Iterable<? extends R>> lVar, int i) {
        return new a(axm0Var, lVar, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super R> axm0Var) {
        io.reactivex.rxjava3.core.g<T> gVar = this.c;
        boolean z = gVar instanceof io.reactivex.rxjava3.functions.n;
        ka4 ka4Var = this.d;
        if (!z) {
            gVar.subscribe((io.reactivex.rxjava3.core.j) new a(axm0Var, ka4Var, this.e));
            return;
        }
        try {
            Object obj = ((io.reactivex.rxjava3.functions.n) gVar).get();
            if (obj == null) {
                EmptySubscription.b(axm0Var);
                return;
            }
            try {
                y.subscribe(axm0Var, ((Iterable) ka4Var.apply(obj)).iterator());
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                EmptySubscription.c(th, axm0Var);
            }
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.b(th2);
            EmptySubscription.c(th2, axm0Var);
        }
    }
}
