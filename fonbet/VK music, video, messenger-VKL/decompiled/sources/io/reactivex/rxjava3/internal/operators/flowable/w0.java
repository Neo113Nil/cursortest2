package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import xsna.axm0;
import xsna.ffe0;
import xsna.jxm0;
import xsna.qu50;

/* compiled from: FlowableSwitchMap.java */
/* loaded from: classes8.dex */
public final class w0<T, R> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, R> {
    public final qu50 d;
    public final int e;

    /* compiled from: FlowableSwitchMap.java */
    public static final class a<T, R> extends AtomicReference<jxm0> implements io.reactivex.rxjava3.core.j<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        final int bufferSize;
        volatile boolean done;
        int fusionMode;
        final long index;
        final b<T, R> parent;
        volatile io.reactivex.rxjava3.internal.fuseable.l<R> queue;

        public a(b<T, R> bVar, long j, int i) {
            this.parent = bVar;
            this.index = j;
            this.bufferSize = i;
        }

        @Override // xsna.axm0
        public final void onComplete() {
            b<T, R> bVar = this.parent;
            if (this.index == bVar.unique) {
                this.done = true;
                bVar.g();
            }
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            b<T, R> bVar = this.parent;
            if (this.index == bVar.unique) {
                AtomicThrowable atomicThrowable = bVar.errors;
                atomicThrowable.getClass();
                if (io.reactivex.rxjava3.internal.util.f.a(atomicThrowable, th)) {
                    if (!bVar.delayErrors) {
                        bVar.upstream.cancel();
                        bVar.done = true;
                    }
                    this.done = true;
                    bVar.g();
                    return;
                }
            }
            io.reactivex.rxjava3.plugins.a.a(th);
        }

        @Override // xsna.axm0
        public final void onNext(R r) {
            b<T, R> bVar = this.parent;
            if (this.index == bVar.unique) {
                if (this.fusionMode != 0 || this.queue.offer(r)) {
                    bVar.g();
                } else {
                    onError(new MissingBackpressureException("Queue full?!"));
                }
            }
        }

        @Override // xsna.axm0
        public final void onSubscribe(jxm0 jxm0Var) {
            if (SubscriptionHelper.d(this, jxm0Var)) {
                if (jxm0Var instanceof io.reactivex.rxjava3.internal.fuseable.i) {
                    io.reactivex.rxjava3.internal.fuseable.i iVar = (io.reactivex.rxjava3.internal.fuseable.i) jxm0Var;
                    int a = iVar.a(7);
                    if (a == 1) {
                        this.fusionMode = a;
                        this.queue = iVar;
                        this.done = true;
                        this.parent.g();
                        return;
                    }
                    if (a == 2) {
                        this.fusionMode = a;
                        this.queue = iVar;
                        jxm0Var.request(this.bufferSize);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.bufferSize);
                jxm0Var.request(this.bufferSize);
            }
        }
    }

    /* compiled from: FlowableSwitchMap.java */
    public static final class b<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.j<T>, jxm0 {
        public static final a<Object, Object> b;
        private static final long serialVersionUID = -3491074160481096299L;
        final int bufferSize;
        volatile boolean cancelled;
        volatile boolean done;
        final axm0<? super R> downstream;
        final io.reactivex.rxjava3.functions.l<? super T, ? extends ffe0<? extends R>> mapper;
        volatile long unique;
        jxm0 upstream;
        final AtomicReference<a<T, R>> active = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();
        final boolean delayErrors = false;
        final AtomicThrowable errors = new AtomicThrowable();

        static {
            a<Object, Object> aVar = new a<>(null, -1L, 1);
            b = aVar;
            SubscriptionHelper.a(aVar);
        }

        public b(axm0 axm0Var, qu50 qu50Var, int i) {
            this.downstream = axm0Var;
            this.mapper = qu50Var;
            this.bufferSize = i;
        }

        @Override // xsna.jxm0
        public final void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            d();
            this.errors.d();
        }

        public final void d() {
            AtomicReference<a<T, R>> atomicReference = this.active;
            a<Object, Object> aVar = b;
            a<Object, Object> aVar2 = (a) atomicReference.getAndSet(aVar);
            if (aVar2 == aVar || aVar2 == null) {
                return;
            }
            SubscriptionHelper.a(aVar2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:132:0x00de, code lost:
        
            r15 = false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void g() {
            long j;
            Object obj;
            if (getAndIncrement() != 0) {
                return;
            }
            axm0<? super R> axm0Var = this.downstream;
            int i = 1;
            while (!this.cancelled) {
                if (this.done) {
                    if (this.delayErrors) {
                        if (this.active.get() == null) {
                            this.errors.g(axm0Var);
                            return;
                        }
                    } else if (this.errors.get() != null) {
                        d();
                        this.errors.g(axm0Var);
                        return;
                    } else if (this.active.get() == null) {
                        axm0Var.onComplete();
                        return;
                    }
                }
                a<T, R> aVar = this.active.get();
                io.reactivex.rxjava3.internal.fuseable.l<R> lVar = aVar != null ? aVar.queue : null;
                if (lVar != null) {
                    long j2 = this.requested.get();
                    long j3 = 0;
                    while (true) {
                        if (j3 == j2) {
                            j = 0;
                            break;
                        }
                        if (!this.cancelled) {
                            boolean z = aVar.done;
                            try {
                                obj = lVar.poll();
                                j = 0;
                            } catch (Throwable th) {
                                io.reactivex.rxjava3.exceptions.a.b(th);
                                SubscriptionHelper.a(aVar);
                                j = 0;
                                this.errors.a(th);
                                z = true;
                                obj = null;
                            }
                            boolean z2 = obj == null;
                            if (aVar != this.active.get()) {
                                break;
                            }
                            if (z) {
                                if (this.delayErrors) {
                                    if (z2) {
                                        AtomicReference<a<T, R>> atomicReference = this.active;
                                        while (!atomicReference.compareAndSet(aVar, null) && atomicReference.get() == aVar) {
                                        }
                                    }
                                } else if (this.errors.get() != null) {
                                    this.errors.g(axm0Var);
                                    return;
                                } else if (z2) {
                                    AtomicReference<a<T, R>> atomicReference2 = this.active;
                                    while (!atomicReference2.compareAndSet(aVar, null) && atomicReference2.get() == aVar) {
                                    }
                                }
                            }
                            if (z2) {
                                break;
                            }
                            axm0Var.onNext(obj);
                            j3++;
                        } else {
                            return;
                        }
                    }
                    boolean z3 = true;
                    if (j3 == j2 && aVar.done) {
                        if (this.delayErrors) {
                            if (lVar.isEmpty()) {
                                AtomicReference<a<T, R>> atomicReference3 = this.active;
                                while (!atomicReference3.compareAndSet(aVar, null) && atomicReference3.get() == aVar) {
                                }
                            }
                        } else if (this.errors.get() != null) {
                            d();
                            this.errors.g(axm0Var);
                            return;
                        } else if (lVar.isEmpty()) {
                            AtomicReference<a<T, R>> atomicReference4 = this.active;
                            while (!atomicReference4.compareAndSet(aVar, null) && atomicReference4.get() == aVar) {
                            }
                        }
                    }
                    if (j3 != j && !this.cancelled) {
                        if (j2 != Long.MAX_VALUE) {
                            this.requested.addAndGet(-j3);
                        }
                        if (aVar.fusionMode != 1) {
                            aVar.get().request(j3);
                        }
                    }
                    if (z3) {
                        continue;
                    }
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        @Override // xsna.axm0
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            g();
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            if (!this.done) {
                AtomicThrowable atomicThrowable = this.errors;
                atomicThrowable.getClass();
                if (io.reactivex.rxjava3.internal.util.f.a(atomicThrowable, th)) {
                    if (!this.delayErrors) {
                        d();
                    }
                    this.done = true;
                    g();
                    return;
                }
            }
            io.reactivex.rxjava3.plugins.a.a(th);
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            if (this.done) {
                return;
            }
            long j = this.unique + 1;
            this.unique = j;
            a<T, R> aVar = this.active.get();
            if (aVar != null) {
                SubscriptionHelper.a(aVar);
            }
            try {
                ffe0<? extends R> apply = this.mapper.apply(t);
                Objects.requireNonNull(apply, "The publisher returned is null");
                ffe0<? extends R> ffe0Var = apply;
                a<T, R> aVar2 = new a<>(this, j, this.bufferSize);
                while (true) {
                    a<T, R> aVar3 = this.active.get();
                    if (aVar3 == b) {
                        return;
                    }
                    AtomicReference<a<T, R>> atomicReference = this.active;
                    while (!atomicReference.compareAndSet(aVar3, aVar2)) {
                        if (atomicReference.get() != aVar3) {
                            break;
                        }
                    }
                    ffe0Var.subscribe(aVar2);
                    return;
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.upstream.cancel();
                onError(th);
            }
        }

        @Override // xsna.axm0
        public final void onSubscribe(jxm0 jxm0Var) {
            if (SubscriptionHelper.f(this.upstream, jxm0Var)) {
                this.upstream = jxm0Var;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // xsna.jxm0
        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                io.reactivex.rxjava3.internal.util.b.a(this.requested, j);
                if (this.unique == 0) {
                    this.upstream.request(Long.MAX_VALUE);
                } else {
                    g();
                }
            }
        }
    }

    public w0(io.reactivex.rxjava3.core.g gVar, qu50 qu50Var, int i) {
        super(gVar);
        this.d = qu50Var;
        this.e = i;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super R> axm0Var) {
        io.reactivex.rxjava3.core.g<T> gVar = this.c;
        qu50 qu50Var = this.d;
        if (s0.b(gVar, axm0Var, qu50Var)) {
            return;
        }
        gVar.subscribe((io.reactivex.rxjava3.core.j) new b(axm0Var, qu50Var, this.e));
    }
}
