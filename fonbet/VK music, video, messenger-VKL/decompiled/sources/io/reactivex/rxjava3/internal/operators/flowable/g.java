package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.flowable.c0;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import xsna.axm0;
import xsna.ffe0;
import xsna.jxm0;

/* compiled from: FlowableCombineLatest.java */
/* loaded from: classes8.dex */
public final class g<T, R> extends io.reactivex.rxjava3.core.g<R> {
    public final ffe0<? extends T>[] c;
    public final a.b d;
    public final int e;

    /* compiled from: FlowableCombineLatest.java */
    public static final class a<T, R> extends BasicIntQueueSubscription<R> {
        private static final long serialVersionUID = -5082275438355852221L;
        volatile boolean cancelled;
        final io.reactivex.rxjava3.functions.l<? super Object[], ? extends R> combiner;
        int completedSources;
        final boolean delayErrors;
        volatile boolean done;
        final axm0<? super R> downstream;
        final AtomicThrowable error;
        final Object[] latest;
        int nonEmptySources;
        boolean outputFused;
        final io.reactivex.rxjava3.internal.queue.b<Object> queue;
        final AtomicLong requested;
        final b<T>[] subscribers;

        public a(axm0 axm0Var, a.b bVar, int i, int i2) {
            this.downstream = axm0Var;
            this.combiner = bVar;
            b<T>[] bVarArr = new b[i];
            for (int i3 = 0; i3 < i; i3++) {
                bVarArr[i3] = new b<>(this, i3, i2);
            }
            this.subscribers = bVarArr;
            this.latest = new Object[i];
            this.queue = new io.reactivex.rxjava3.internal.queue.b<>(i2);
            this.requested = new AtomicLong();
            this.error = new AtomicThrowable();
            this.delayErrors = false;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.h
        public final int a(int i) {
            if ((i & 4) != 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        @Override // xsna.jxm0
        public final void cancel() {
            this.cancelled = true;
            d();
            g();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final void clear() {
            this.queue.clear();
        }

        public final void d() {
            for (b<T> bVar : this.subscribers) {
                bVar.getClass();
                SubscriptionHelper.a(bVar);
            }
        }

        public final boolean e(boolean z, boolean z2, axm0<?> axm0Var, io.reactivex.rxjava3.internal.queue.b<?> bVar) {
            if (this.cancelled) {
                d();
                bVar.clear();
                this.error.d();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.delayErrors) {
                if (!z2) {
                    return false;
                }
                d();
                this.error.g(axm0Var);
                return true;
            }
            Throwable d = io.reactivex.rxjava3.internal.util.f.d(this.error);
            if (d != null && d != io.reactivex.rxjava3.internal.util.f.a) {
                d();
                bVar.clear();
                axm0Var.onError(d);
                return true;
            }
            if (!z2) {
                return false;
            }
            d();
            axm0Var.onComplete();
            return true;
        }

        public final void g() {
            if (getAndIncrement() != 0) {
                return;
            }
            int i = 1;
            if (this.outputFused) {
                axm0<? super R> axm0Var = this.downstream;
                io.reactivex.rxjava3.internal.queue.b<Object> bVar = this.queue;
                while (!this.cancelled) {
                    Throwable th = this.error.get();
                    if (th != null) {
                        bVar.clear();
                        axm0Var.onError(th);
                        return;
                    }
                    boolean z = this.done;
                    boolean isEmpty = bVar.isEmpty();
                    if (!isEmpty) {
                        axm0Var.onNext(null);
                    }
                    if (z && isEmpty) {
                        axm0Var.onComplete();
                        return;
                    } else {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
                bVar.clear();
                return;
            }
            axm0<? super R> axm0Var2 = this.downstream;
            io.reactivex.rxjava3.internal.queue.b<?> bVar2 = this.queue;
            int i2 = 1;
            do {
                long j = this.requested.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z2 = this.done;
                    Object poll = bVar2.poll();
                    boolean z3 = poll == null;
                    if (e(z2, z3, axm0Var2, bVar2)) {
                        return;
                    }
                    if (z3) {
                        break;
                    }
                    try {
                        R apply = this.combiner.apply((Object[]) bVar2.poll());
                        Objects.requireNonNull(apply, "The combiner returned a null value");
                        axm0Var2.onNext(apply);
                        ((b) poll).d();
                        j2++;
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.a.b(th2);
                        d();
                        io.reactivex.rxjava3.internal.util.f.a(this.error, th2);
                        axm0Var2.onError(io.reactivex.rxjava3.internal.util.f.d(this.error));
                        return;
                    }
                }
                if (j2 == j && e(this.done, bVar2.isEmpty(), axm0Var2, bVar2)) {
                    return;
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j2);
                }
                i2 = addAndGet(-i2);
            } while (i2 != 0);
        }

        public final void h(int i) {
            synchronized (this) {
                try {
                    Object[] objArr = this.latest;
                    if (objArr[i] != null) {
                        int i2 = this.completedSources + 1;
                        if (i2 != objArr.length) {
                            this.completedSources = i2;
                            return;
                        }
                        this.done = true;
                    } else {
                        this.done = true;
                    }
                    g();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final R poll() throws Throwable {
            Object poll = this.queue.poll();
            if (poll == null) {
                return null;
            }
            R apply = this.combiner.apply((Object[]) this.queue.poll());
            Objects.requireNonNull(apply, "The combiner returned a null value");
            ((b) poll).d();
            return apply;
        }

        @Override // xsna.jxm0
        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                io.reactivex.rxjava3.internal.util.b.a(this.requested, j);
                g();
            }
        }

        public void subscribe(ffe0<? extends T>[] ffe0VarArr, int i) {
            b<T>[] bVarArr = this.subscribers;
            for (int i2 = 0; i2 < i && !this.done && !this.cancelled; i2++) {
                ffe0VarArr[i2].subscribe(bVarArr[i2]);
            }
        }
    }

    /* compiled from: FlowableCombineLatest.java */
    public static final class b<T> extends AtomicReference<jxm0> implements io.reactivex.rxjava3.core.j<T> {
        private static final long serialVersionUID = -8730235182291002949L;
        final int index;
        final int limit;
        final a<T, ?> parent;
        final int prefetch;
        int produced;

        public b(a<T, ?> aVar, int i, int i2) {
            this.parent = aVar;
            this.index = i;
            this.prefetch = i2;
            this.limit = i2 - (i2 >> 2);
        }

        public final void d() {
            int i = this.produced + 1;
            if (i != this.limit) {
                this.produced = i;
            } else {
                this.produced = 0;
                get().request(i);
            }
        }

        @Override // xsna.axm0
        public final void onComplete() {
            this.parent.h(this.index);
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            a<T, ?> aVar = this.parent;
            int i = this.index;
            if (!io.reactivex.rxjava3.internal.util.f.a(aVar.error, th)) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else {
                if (aVar.delayErrors) {
                    aVar.h(i);
                    return;
                }
                aVar.d();
                aVar.done = true;
                aVar.g();
            }
        }

        @Override // xsna.axm0
        public final void onNext(T t) {
            boolean z;
            a<T, ?> aVar = this.parent;
            int i = this.index;
            synchronized (aVar) {
                try {
                    Object[] objArr = aVar.latest;
                    int i2 = aVar.nonEmptySources;
                    if (objArr[i] == null) {
                        i2++;
                        aVar.nonEmptySources = i2;
                    }
                    objArr[i] = t;
                    if (objArr.length == i2) {
                        aVar.queue.b(aVar.subscribers[i], objArr.clone());
                        z = false;
                    } else {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                aVar.subscribers[i].d();
            } else {
                aVar.g();
            }
        }

        @Override // xsna.axm0
        public final void onSubscribe(jxm0 jxm0Var) {
            long j = this.prefetch;
            if (SubscriptionHelper.d(this, jxm0Var)) {
                jxm0Var.request(j);
            }
        }
    }

    /* compiled from: FlowableCombineLatest.java */
    public final class c implements io.reactivex.rxjava3.functions.l<T, R> {
        public c() {
        }

        @Override // io.reactivex.rxjava3.functions.l
        public final R apply(T t) throws Throwable {
            return (R) g.this.d.apply(new Object[]{t});
        }
    }

    public g(ffe0[] ffe0VarArr, a.b bVar, int i) {
        this.c = ffe0VarArr;
        this.d = bVar;
        this.e = i;
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super R> axm0Var) {
        ffe0<? extends T>[] ffe0VarArr = this.c;
        if (ffe0VarArr == null) {
            try {
                throw null;
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                axm0Var.onSubscribe(EmptySubscription.INSTANCE);
                axm0Var.onError(th);
                return;
            }
        }
        int length = ffe0VarArr.length;
        if (length == 0) {
            axm0Var.onSubscribe(EmptySubscription.INSTANCE);
            axm0Var.onComplete();
        } else {
            if (length == 1) {
                ffe0VarArr[0].subscribe(new c0.b(axm0Var, new c()));
                return;
            }
            a aVar = new a(axm0Var, this.d, length, this.e);
            axm0Var.onSubscribe(aVar);
            aVar.subscribe(ffe0VarArr, length);
        }
    }
}
