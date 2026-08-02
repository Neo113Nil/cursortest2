package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.f;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import xsna.axm0;
import xsna.jxm0;

/* compiled from: UnicastProcessor.java */
/* loaded from: classes8.dex */
public final class e<T> extends io.reactivex.rxjava3.processors.a<T> {
    public volatile boolean f;
    public Throwable g;
    public volatile boolean i;
    public boolean m;
    public final io.reactivex.rxjava3.internal.queue.b<T> c = new io.reactivex.rxjava3.internal.queue.b<>(8);
    public final AtomicReference<Runnable> d = new AtomicReference<>(null);
    public final boolean e = true;
    public final AtomicReference<axm0<? super T>> h = new AtomicReference<>();
    public final AtomicBoolean j = new AtomicBoolean();
    public final a k = new a();
    public final AtomicLong l = new AtomicLong();

    /* compiled from: UnicastProcessor.java */
    public final class a extends BasicIntQueueSubscription<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        public a() {
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.h
        public final int a(int i) {
            e.this.m = true;
            return 2;
        }

        @Override // xsna.jxm0
        public final void cancel() {
            if (e.this.i) {
                return;
            }
            e.this.i = true;
            Runnable andSet = e.this.d.getAndSet(null);
            if (andSet != null) {
                andSet.run();
            }
            e.this.h.lazySet(null);
            if (e.this.k.getAndIncrement() == 0) {
                e.this.h.lazySet(null);
                e eVar = e.this;
                if (eVar.m) {
                    return;
                }
                eVar.c.clear();
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final void clear() {
            e.this.c.clear();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final boolean isEmpty() {
            return e.this.c.isEmpty();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final T poll() {
            return e.this.c.poll();
        }

        @Override // xsna.jxm0
        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                io.reactivex.rxjava3.internal.util.b.a(e.this.l, j);
                e.this.r();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super T> axm0Var) {
        if (this.j.get() || !this.j.compareAndSet(false, true)) {
            IllegalStateException illegalStateException = new IllegalStateException("This processor allows only a single Subscriber");
            axm0Var.onSubscribe(EmptySubscription.INSTANCE);
            axm0Var.onError(illegalStateException);
        } else {
            axm0Var.onSubscribe(this.k);
            this.h.set(axm0Var);
            if (this.i) {
                this.h.lazySet(null);
            } else {
                r();
            }
        }
    }

    @Override // xsna.axm0
    public final void onComplete() {
        if (this.f || this.i) {
            return;
        }
        this.f = true;
        Runnable andSet = this.d.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
        r();
    }

    @Override // xsna.axm0
    public final void onError(Throwable th) {
        f.c(th, "onError called with a null Throwable.");
        if (this.f || this.i) {
            io.reactivex.rxjava3.plugins.a.a(th);
            return;
        }
        this.g = th;
        this.f = true;
        Runnable andSet = this.d.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
        r();
    }

    @Override // xsna.axm0
    public final void onNext(T t) {
        f.c(t, "onNext called with a null value.");
        if (this.f || this.i) {
            return;
        }
        this.c.offer(t);
        r();
    }

    @Override // xsna.axm0
    public final void onSubscribe(jxm0 jxm0Var) {
        if (this.f || this.i) {
            jxm0Var.cancel();
        } else {
            jxm0Var.request(Long.MAX_VALUE);
        }
    }

    public final boolean q(boolean z, boolean z2, boolean z3, axm0<? super T> axm0Var, io.reactivex.rxjava3.internal.queue.b<T> bVar) {
        if (this.i) {
            bVar.clear();
            this.h.lazySet(null);
            return true;
        }
        if (!z2) {
            return false;
        }
        if (z && this.g != null) {
            bVar.clear();
            this.h.lazySet(null);
            axm0Var.onError(this.g);
            return true;
        }
        if (!z3) {
            return false;
        }
        Throwable th = this.g;
        this.h.lazySet(null);
        if (th != null) {
            axm0Var.onError(th);
            return true;
        }
        axm0Var.onComplete();
        return true;
    }

    public final void r() {
        boolean z;
        if (this.k.getAndIncrement() != 0) {
            return;
        }
        int i = 1;
        axm0<? super T> axm0Var = this.h.get();
        int i2 = 1;
        while (axm0Var == null) {
            i2 = this.k.addAndGet(-i2);
            if (i2 == 0) {
                return;
            } else {
                axm0Var = this.h.get();
            }
        }
        if (this.m) {
            io.reactivex.rxjava3.internal.queue.b<T> bVar = this.c;
            boolean z2 = this.e;
            while (!this.i) {
                boolean z3 = this.f;
                if (!z2 && z3 && this.g != null) {
                    bVar.clear();
                    this.h.lazySet(null);
                    axm0Var.onError(this.g);
                    return;
                }
                axm0Var.onNext(null);
                if (z3) {
                    this.h.lazySet(null);
                    Throwable th = this.g;
                    if (th != null) {
                        axm0Var.onError(th);
                        return;
                    } else {
                        axm0Var.onComplete();
                        return;
                    }
                }
                i = this.k.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
            this.h.lazySet(null);
            return;
        }
        io.reactivex.rxjava3.internal.queue.b<T> bVar2 = this.c;
        boolean z4 = !this.e;
        int i3 = 1;
        while (true) {
            long j = this.l.get();
            long j2 = 0;
            while (j != j2) {
                boolean z5 = this.f;
                T poll = bVar2.poll();
                boolean z6 = poll == null;
                if (q(z4, z5, z6, axm0Var, bVar2)) {
                    return;
                }
                if (z6) {
                    break;
                }
                axm0Var.onNext(poll);
                j2++;
            }
            if (j == j2) {
                z = z4;
                if (q(z4, this.f, bVar2.isEmpty(), axm0Var, bVar2)) {
                    return;
                }
            } else {
                z = z4;
            }
            if (j2 != 0 && j != Long.MAX_VALUE) {
                this.l.addAndGet(-j2);
            }
            i3 = this.k.addAndGet(-i3);
            if (i3 == 0) {
                return;
            } else {
                z4 = z;
            }
        }
    }
}
