package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.ArrayListSupplier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import xsna.axm0;
import xsna.jxm0;

/* compiled from: FlowableBufferTimed.java */
/* loaded from: classes11.dex */
public final class d<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, U> {
    public final long d;
    public final long e;
    public final TimeUnit f;
    public final io.reactivex.rxjava3.core.w g;
    public final io.reactivex.rxjava3.functions.n<U> h;
    public final int i;

    /* compiled from: FlowableBufferTimed.java */
    /* loaded from: classes8.dex */
    public static final class a<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.internal.subscribers.c<T, U, U> implements jxm0, Runnable, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.functions.n<U> h;
        public final long i;
        public final TimeUnit j;
        public final int k;
        public final w.c l;
        public U m;
        public io.reactivex.rxjava3.disposables.c n;
        public jxm0 o;
        public long p;
        public long q;

        public a(io.reactivex.rxjava3.subscribers.a aVar, io.reactivex.rxjava3.functions.n nVar, long j, TimeUnit timeUnit, int i, w.c cVar) {
            super(aVar, new io.reactivex.rxjava3.internal.queue.a());
            this.h = nVar;
            this.i = j;
            this.j = timeUnit;
            this.k = i;
            this.l = cVar;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.c
        public final void a(Object obj, axm0 axm0Var) {
            axm0Var.onNext((Collection) obj);
        }

        @Override // xsna.jxm0
        public final void cancel() {
            if (this.f) {
                return;
            }
            this.f = true;
            dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            synchronized (this) {
                this.m = null;
            }
            this.o.cancel();
            this.l.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.l.h();
        }

        @Override // xsna.axm0
        public final void onComplete() {
            U u;
            synchronized (this) {
                u = this.m;
                this.m = null;
            }
            if (u != null) {
                this.e.offer(u);
                this.g = true;
                if (b()) {
                    io.reactivex.rxjava3.internal.util.i.c(this.e, this.d, this, this);
                }
                this.l.dispose();
            }
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            synchronized (this) {
                this.m = null;
            }
            this.d.onError(th);
            this.l.dispose();
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            synchronized (this) {
                try {
                    U u = this.m;
                    if (u == null) {
                        return;
                    }
                    u.add(t);
                    if (u.size() < this.k) {
                        return;
                    }
                    this.m = null;
                    this.p++;
                    d(u, this);
                    try {
                        U u2 = this.h.get();
                        Objects.requireNonNull(u2, "The supplied buffer is null");
                        U u3 = u2;
                        synchronized (this) {
                            this.m = u3;
                            this.q++;
                        }
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.a.b(th);
                        cancel();
                        this.d.onError(th);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // xsna.axm0
        public final void onSubscribe(jxm0 jxm0Var) {
            io.reactivex.rxjava3.subscribers.a aVar = this.d;
            if (SubscriptionHelper.f(this.o, jxm0Var)) {
                this.o = jxm0Var;
                try {
                    U u = this.h.get();
                    Objects.requireNonNull(u, "The supplied buffer is null");
                    this.m = u;
                    aVar.onSubscribe(this);
                    long j = this.i;
                    this.n = this.l.c(this, j, j, this.j);
                    jxm0Var.request(Long.MAX_VALUE);
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    this.l.dispose();
                    jxm0Var.cancel();
                    EmptySubscription.c(th, aVar);
                }
            }
        }

        @Override // xsna.jxm0
        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                io.reactivex.rxjava3.internal.util.b.a(this.c, j);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                U u = this.h.get();
                Objects.requireNonNull(u, "The supplied buffer is null");
                U u2 = u;
                synchronized (this) {
                    U u3 = this.m;
                    if (u3 != null && this.p == this.q) {
                        this.m = u2;
                        d(u3, this);
                    }
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                cancel();
                this.d.onError(th);
            }
        }
    }

    /* compiled from: FlowableBufferTimed.java */
    public static final class b<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.internal.subscribers.c<T, U, U> implements jxm0, Runnable, io.reactivex.rxjava3.disposables.c {
        public final io.reactivex.rxjava3.functions.n<U> h;
        public final long i;
        public final TimeUnit j;
        public final io.reactivex.rxjava3.core.w k;
        public jxm0 l;
        public U m;
        public final AtomicReference<io.reactivex.rxjava3.disposables.c> n;

        public b(io.reactivex.rxjava3.subscribers.a aVar, io.reactivex.rxjava3.functions.n nVar, long j, TimeUnit timeUnit, io.reactivex.rxjava3.core.w wVar) {
            super(aVar, new io.reactivex.rxjava3.internal.queue.a());
            this.n = new AtomicReference<>();
            this.h = nVar;
            this.i = j;
            this.j = timeUnit;
            this.k = wVar;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.c
        public final void a(Object obj, axm0 axm0Var) {
            this.d.onNext((Collection) obj);
        }

        @Override // xsna.jxm0
        public final void cancel() {
            this.f = true;
            this.l.cancel();
            DisposableHelper.a(this.n);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            cancel();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.n.get() == DisposableHelper.DISPOSED;
        }

        @Override // xsna.axm0
        public final void onComplete() {
            DisposableHelper.a(this.n);
            synchronized (this) {
                try {
                    U u = this.m;
                    if (u == null) {
                        return;
                    }
                    this.m = null;
                    this.e.offer(u);
                    this.g = true;
                    if (b()) {
                        io.reactivex.rxjava3.internal.util.i.c(this.e, this.d, null, this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            DisposableHelper.a(this.n);
            synchronized (this) {
                this.m = null;
            }
            this.d.onError(th);
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            synchronized (this) {
                try {
                    U u = this.m;
                    if (u != null) {
                        u.add(t);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // xsna.axm0
        public final void onSubscribe(jxm0 jxm0Var) {
            if (SubscriptionHelper.f(this.l, jxm0Var)) {
                this.l = jxm0Var;
                try {
                    U u = this.h.get();
                    Objects.requireNonNull(u, "The supplied buffer is null");
                    this.m = u;
                    this.d.onSubscribe(this);
                    if (!this.f) {
                        jxm0Var.request(Long.MAX_VALUE);
                        io.reactivex.rxjava3.core.w wVar = this.k;
                        long j = this.i;
                        io.reactivex.rxjava3.disposables.c e = wVar.e(this, j, j, this.j);
                        AtomicReference<io.reactivex.rxjava3.disposables.c> atomicReference = this.n;
                        while (!atomicReference.compareAndSet(null, e)) {
                            if (atomicReference.get() != null) {
                                e.dispose();
                                return;
                            }
                        }
                    }
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    cancel();
                    EmptySubscription.c(th, this.d);
                }
            }
        }

        @Override // xsna.jxm0
        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                io.reactivex.rxjava3.internal.util.b.a(this.c, j);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                U u = this.h.get();
                Objects.requireNonNull(u, "The supplied buffer is null");
                U u2 = u;
                synchronized (this) {
                    try {
                        U u3 = this.m;
                        if (u3 == null) {
                            return;
                        }
                        this.m = u2;
                        io.reactivex.rxjava3.subscribers.a aVar = this.d;
                        io.reactivex.rxjava3.internal.queue.a aVar2 = this.e;
                        AtomicInteger atomicInteger = this.b;
                        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
                            long j = this.c.get();
                            if (j == 0) {
                                cancel();
                                aVar.onError(new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                                return;
                            } else {
                                a(u3, aVar);
                                if (j != Long.MAX_VALUE) {
                                    this.c.addAndGet(-1L);
                                }
                                if (this.b.addAndGet(-1) == 0) {
                                    return;
                                }
                            }
                        } else {
                            aVar2.offer(u3);
                            if (!b()) {
                                return;
                            }
                        }
                        io.reactivex.rxjava3.internal.util.i.c(aVar2, aVar, this, this);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                cancel();
                this.d.onError(th2);
            }
        }
    }

    /* compiled from: FlowableBufferTimed.java */
    /* loaded from: classes8.dex */
    public static final class c<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.internal.subscribers.c<T, U, U> implements jxm0, Runnable {
        public final io.reactivex.rxjava3.functions.n<U> h;
        public final long i;
        public final long j;
        public final TimeUnit k;
        public final w.c l;
        public final LinkedList m;
        public jxm0 n;

        /* compiled from: FlowableBufferTimed.java */
        public final class a implements Runnable {
            public final U b;

            public a(U u) {
                this.b = u;
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (c.this) {
                    c.this.m.remove(this.b);
                }
                c cVar = c.this;
                cVar.d(this.b, cVar.l);
            }
        }

        public c(io.reactivex.rxjava3.subscribers.a aVar, io.reactivex.rxjava3.functions.n nVar, long j, long j2, TimeUnit timeUnit, w.c cVar) {
            super(aVar, new io.reactivex.rxjava3.internal.queue.a());
            this.h = nVar;
            this.i = j;
            this.j = j2;
            this.k = timeUnit;
            this.l = cVar;
            this.m = new LinkedList();
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.c
        public final void a(Object obj, axm0 axm0Var) {
            axm0Var.onNext((Collection) obj);
        }

        @Override // xsna.jxm0
        public final void cancel() {
            this.f = true;
            this.n.cancel();
            this.l.dispose();
            synchronized (this) {
                this.m.clear();
            }
        }

        @Override // xsna.axm0
        public final void onComplete() {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.m);
                this.m.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.e.offer((Collection) it.next());
            }
            this.g = true;
            if (b()) {
                io.reactivex.rxjava3.internal.util.i.c(this.e, this.d, this.l, this);
            }
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            this.g = true;
            this.l.dispose();
            synchronized (this) {
                this.m.clear();
            }
            this.d.onError(th);
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            synchronized (this) {
                try {
                    Iterator it = this.m.iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).add(t);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // xsna.axm0
        public final void onSubscribe(jxm0 jxm0Var) {
            w.c cVar = this.l;
            io.reactivex.rxjava3.subscribers.a aVar = this.d;
            if (SubscriptionHelper.f(this.n, jxm0Var)) {
                this.n = jxm0Var;
                try {
                    U u = this.h.get();
                    Objects.requireNonNull(u, "The supplied buffer is null");
                    U u2 = u;
                    this.m.add(u2);
                    aVar.onSubscribe(this);
                    jxm0Var.request(Long.MAX_VALUE);
                    long j = this.j;
                    this.l.c(this, j, j, this.k);
                    cVar.b(new a(u2), this.i, this.k);
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    cVar.dispose();
                    jxm0Var.cancel();
                    EmptySubscription.c(th, aVar);
                }
            }
        }

        @Override // xsna.jxm0
        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                io.reactivex.rxjava3.internal.util.b.a(this.c, j);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f) {
                return;
            }
            try {
                U u = this.h.get();
                Objects.requireNonNull(u, "The supplied buffer is null");
                U u2 = u;
                synchronized (this) {
                    try {
                        if (this.f) {
                            return;
                        }
                        this.m.add(u2);
                        this.l.b(new a(u2), this.i, this.k);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                cancel();
                this.d.onError(th2);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(io.reactivex.rxjava3.core.g gVar, io.reactivex.rxjava3.core.w wVar, ArrayListSupplier arrayListSupplier) {
        super(gVar);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.d = 100L;
        this.e = 100L;
        this.f = timeUnit;
        this.g = wVar;
        this.h = arrayListSupplier;
        this.i = Integer.MAX_VALUE;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super U> axm0Var) {
        long j = this.e;
        long j2 = this.d;
        io.reactivex.rxjava3.core.g<T> gVar = this.c;
        if (j2 == j && this.i == Integer.MAX_VALUE) {
            gVar.subscribe((io.reactivex.rxjava3.core.j) new b(new io.reactivex.rxjava3.subscribers.a(axm0Var), this.h, j2, this.f, this.g));
            return;
        }
        w.c a2 = this.g.a();
        long j3 = this.d;
        long j4 = this.e;
        if (j3 != j4) {
            gVar.subscribe((io.reactivex.rxjava3.core.j) new c(new io.reactivex.rxjava3.subscribers.a(axm0Var), this.h, j3, j4, this.f, a2));
            return;
        }
        gVar.subscribe((io.reactivex.rxjava3.core.j) new a(new io.reactivex.rxjava3.subscribers.a(axm0Var), this.h, j3, this.f, this.i, a2));
    }
}
