package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import xsna.axm0;
import xsna.jxm0;

/* compiled from: FlowableObserveOn.java */
/* loaded from: classes11.dex */
public final class d0<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {
    public final io.reactivex.rxjava3.core.w d;
    public final int e;

    /* compiled from: FlowableObserveOn.java */
    public static abstract class a<T> extends BasicIntQueueSubscription<T> implements io.reactivex.rxjava3.core.j<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;
        volatile boolean cancelled;
        volatile boolean done;
        Throwable error;
        final int limit;
        boolean outputFused;
        final int prefetch;
        long produced;
        io.reactivex.rxjava3.internal.fuseable.l<T> queue;
        int sourceMode;
        jxm0 upstream;
        final w.c worker;
        final boolean delayError = false;
        final AtomicLong requested = new AtomicLong();

        public a(w.c cVar, int i) {
            this.worker = cVar;
            this.prefetch = i;
            this.limit = i - (i >> 2);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.h
        public final int a(int i) {
            this.outputFused = true;
            return 2;
        }

        public final boolean b(boolean z, boolean z2, axm0<?> axm0Var) {
            if (this.cancelled) {
                clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.delayError) {
                if (!z2) {
                    return false;
                }
                this.cancelled = true;
                Throwable th = this.error;
                if (th != null) {
                    axm0Var.onError(th);
                } else {
                    axm0Var.onComplete();
                }
                this.worker.dispose();
                return true;
            }
            Throwable th2 = this.error;
            if (th2 != null) {
                this.cancelled = true;
                clear();
                axm0Var.onError(th2);
                this.worker.dispose();
                return true;
            }
            if (!z2) {
                return false;
            }
            this.cancelled = true;
            axm0Var.onComplete();
            this.worker.dispose();
            return true;
        }

        @Override // xsna.jxm0
        public final void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            this.worker.dispose();
            if (this.outputFused || getAndIncrement() != 0) {
                return;
            }
            this.queue.clear();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final void clear() {
            this.queue.clear();
        }

        public abstract void d();

        public abstract void g();

        public abstract void h();

        public final void i() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.worker.a(this);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // xsna.axm0
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            i();
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.a(th);
                return;
            }
            this.error = th;
            this.done = true;
            i();
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            if (this.done) {
                return;
            }
            if (this.sourceMode == 2) {
                i();
                return;
            }
            if (!this.queue.offer(t)) {
                this.upstream.cancel();
                this.error = new MissingBackpressureException("Queue is full?!");
                this.done = true;
            }
            i();
        }

        @Override // xsna.jxm0
        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                io.reactivex.rxjava3.internal.util.b.a(this.requested, j);
                i();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.outputFused) {
                g();
            } else if (this.sourceMode == 1) {
                h();
            } else {
                d();
            }
        }
    }

    /* compiled from: FlowableObserveOn.java */
    /* loaded from: classes8.dex */
    public static final class b<T> extends a<T> {
        private static final long serialVersionUID = 644624475404284533L;
        long consumed;
        final io.reactivex.rxjava3.internal.fuseable.c<? super T> downstream;

        public b(io.reactivex.rxjava3.internal.fuseable.c cVar, w.c cVar2, int i) {
            super(cVar2, i);
            this.downstream = cVar;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.d0.a
        public final void d() {
            io.reactivex.rxjava3.internal.fuseable.c<? super T> cVar = this.downstream;
            io.reactivex.rxjava3.internal.fuseable.l<T> lVar = this.queue;
            long j = this.produced;
            long j2 = this.consumed;
            int i = 1;
            do {
                long j3 = this.requested.get();
                while (j != j3) {
                    boolean z = this.done;
                    try {
                        T poll = lVar.poll();
                        boolean z2 = poll == null;
                        if (b(z, z2, cVar)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        if (cVar.c(poll)) {
                            j++;
                        }
                        j2++;
                        if (j2 == this.limit) {
                            this.upstream.request(j2);
                            j2 = 0;
                        }
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.a.b(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        lVar.clear();
                        cVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (j == j3 && b(this.done, lVar.isEmpty(), cVar)) {
                    return;
                }
                this.produced = j;
                this.consumed = j2;
                i = addAndGet(-i);
            } while (i != 0);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.d0.a
        public final void g() {
            int i = 1;
            while (!this.cancelled) {
                boolean z = this.done;
                this.downstream.onNext(null);
                if (z) {
                    this.cancelled = true;
                    Throwable th = this.error;
                    if (th != null) {
                        this.downstream.onError(th);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.d0.a
        public final void h() {
            io.reactivex.rxjava3.internal.fuseable.c<? super T> cVar = this.downstream;
            io.reactivex.rxjava3.internal.fuseable.l<T> lVar = this.queue;
            long j = this.produced;
            int i = 1;
            do {
                long j2 = this.requested.get();
                while (j != j2) {
                    try {
                        T poll = lVar.poll();
                        if (this.cancelled) {
                            return;
                        }
                        if (poll == null) {
                            this.cancelled = true;
                            cVar.onComplete();
                            this.worker.dispose();
                            return;
                        } else if (cVar.c(poll)) {
                            j++;
                        }
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.a.b(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        cVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (this.cancelled) {
                    return;
                }
                if (lVar.isEmpty()) {
                    this.cancelled = true;
                    cVar.onComplete();
                    this.worker.dispose();
                    return;
                }
                this.produced = j;
                i = addAndGet(-i);
            } while (i != 0);
        }

        @Override // xsna.axm0
        public final void onSubscribe(jxm0 jxm0Var) {
            if (SubscriptionHelper.f(this.upstream, jxm0Var)) {
                this.upstream = jxm0Var;
                if (jxm0Var instanceof io.reactivex.rxjava3.internal.fuseable.i) {
                    io.reactivex.rxjava3.internal.fuseable.i iVar = (io.reactivex.rxjava3.internal.fuseable.i) jxm0Var;
                    int a = iVar.a(7);
                    if (a == 1) {
                        this.sourceMode = 1;
                        this.queue = iVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                    if (a == 2) {
                        this.sourceMode = 2;
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
        public final T poll() throws Throwable {
            T poll = this.queue.poll();
            if (poll != null && this.sourceMode != 1) {
                long j = this.consumed + 1;
                if (j == this.limit) {
                    this.consumed = 0L;
                    this.upstream.request(j);
                    return poll;
                }
                this.consumed = j;
            }
            return poll;
        }
    }

    /* compiled from: FlowableObserveOn.java */
    public static final class c<T> extends a<T> {
        private static final long serialVersionUID = -4547113800637756442L;
        final axm0<? super T> downstream;

        public c(axm0 axm0Var, w.c cVar, int i) {
            super(cVar, i);
            this.downstream = axm0Var;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.d0.a
        public final void d() {
            axm0<? super T> axm0Var = this.downstream;
            io.reactivex.rxjava3.internal.fuseable.l<T> lVar = this.queue;
            long j = this.produced;
            int i = 1;
            while (true) {
                long j2 = this.requested.get();
                while (j != j2) {
                    boolean z = this.done;
                    try {
                        T poll = lVar.poll();
                        boolean z2 = poll == null;
                        if (b(z, z2, axm0Var)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        axm0Var.onNext(poll);
                        j++;
                        if (j == this.limit) {
                            if (j2 != Long.MAX_VALUE) {
                                j2 = this.requested.addAndGet(-j);
                            }
                            this.upstream.request(j);
                            j = 0;
                        }
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.a.b(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        lVar.clear();
                        axm0Var.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (j == j2 && b(this.done, lVar.isEmpty(), axm0Var)) {
                    return;
                }
                int i2 = get();
                if (i == i2) {
                    this.produced = j;
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    i = i2;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.d0.a
        public final void g() {
            int i = 1;
            while (!this.cancelled) {
                boolean z = this.done;
                this.downstream.onNext(null);
                if (z) {
                    this.cancelled = true;
                    Throwable th = this.error;
                    if (th != null) {
                        this.downstream.onError(th);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.d0.a
        public final void h() {
            axm0<? super T> axm0Var = this.downstream;
            io.reactivex.rxjava3.internal.fuseable.l<T> lVar = this.queue;
            long j = this.produced;
            int i = 1;
            do {
                long j2 = this.requested.get();
                while (j != j2) {
                    try {
                        T poll = lVar.poll();
                        if (this.cancelled) {
                            return;
                        }
                        if (poll == null) {
                            this.cancelled = true;
                            axm0Var.onComplete();
                            this.worker.dispose();
                            return;
                        }
                        axm0Var.onNext(poll);
                        j++;
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.a.b(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        axm0Var.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (this.cancelled) {
                    return;
                }
                if (lVar.isEmpty()) {
                    this.cancelled = true;
                    axm0Var.onComplete();
                    this.worker.dispose();
                    return;
                }
                this.produced = j;
                i = addAndGet(-i);
            } while (i != 0);
        }

        @Override // xsna.axm0
        public final void onSubscribe(jxm0 jxm0Var) {
            if (SubscriptionHelper.f(this.upstream, jxm0Var)) {
                this.upstream = jxm0Var;
                if (jxm0Var instanceof io.reactivex.rxjava3.internal.fuseable.i) {
                    io.reactivex.rxjava3.internal.fuseable.i iVar = (io.reactivex.rxjava3.internal.fuseable.i) jxm0Var;
                    int a = iVar.a(7);
                    if (a == 1) {
                        this.sourceMode = 1;
                        this.queue = iVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                    if (a == 2) {
                        this.sourceMode = 2;
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
        public final T poll() throws Throwable {
            T poll = this.queue.poll();
            if (poll != null && this.sourceMode != 1) {
                long j = this.produced + 1;
                if (j == this.limit) {
                    this.produced = 0L;
                    this.upstream.request(j);
                    return poll;
                }
                this.produced = j;
            }
            return poll;
        }
    }

    public d0(io.reactivex.rxjava3.core.g gVar, io.reactivex.rxjava3.core.w wVar, int i) {
        super(gVar);
        this.d = wVar;
        this.e = i;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        w.c a2 = this.d.a();
        boolean z = axm0Var instanceof io.reactivex.rxjava3.internal.fuseable.c;
        int i = this.e;
        io.reactivex.rxjava3.core.g<T> gVar = this.c;
        if (z) {
            gVar.subscribe((io.reactivex.rxjava3.core.j) new b((io.reactivex.rxjava3.internal.fuseable.c) axm0Var, a2, i));
        } else {
            gVar.subscribe((io.reactivex.rxjava3.core.j) new c(axm0Var, a2, i));
        }
    }
}
