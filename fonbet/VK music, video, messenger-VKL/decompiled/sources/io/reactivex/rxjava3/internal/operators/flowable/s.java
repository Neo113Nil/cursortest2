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

/* compiled from: FlowableFlatMap.java */
/* loaded from: classes8.dex */
public final class s<T, U> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, U> {
    public final io.reactivex.rxjava3.functions.l<? super T, ? extends ffe0<? extends U>> d;
    public final int e;
    public final int f;

    /* compiled from: FlowableFlatMap.java */
    public static final class a<T, U> extends AtomicReference<jxm0> implements io.reactivex.rxjava3.core.j<U>, io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = -4606175640614850599L;
        final int bufferSize;
        volatile boolean done;
        int fusionMode;
        final long id;
        final int limit;
        final b<T, U> parent;
        long produced;
        volatile io.reactivex.rxjava3.internal.fuseable.l<U> queue;

        public a(b<T, U> bVar, int i, long j) {
            this.id = j;
            this.parent = bVar;
            this.bufferSize = i;
            this.limit = i >> 2;
        }

        public final void a(long j) {
            if (this.fusionMode != 1) {
                long j2 = this.produced + j;
                if (j2 < this.limit) {
                    this.produced = j2;
                } else {
                    this.produced = 0L;
                    get().request(j2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            SubscriptionHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return get() == SubscriptionHelper.CANCELLED;
        }

        @Override // xsna.axm0
        public final void onComplete() {
            this.done = true;
            this.parent.g();
        }

        @Override // xsna.axm0
        public final void onError(Throwable th) {
            lazySet(SubscriptionHelper.CANCELLED);
            b<T, U> bVar = this.parent;
            if (bVar.errors.a(th)) {
                this.done = true;
                if (!bVar.delayErrors) {
                    bVar.upstream.cancel();
                    for (a<?, ?> aVar : bVar.subscribers.getAndSet(b.c)) {
                        aVar.getClass();
                        SubscriptionHelper.a(aVar);
                    }
                }
                bVar.g();
            }
        }

        @Override // xsna.axm0
        public final void onNext(U u) {
            if (this.fusionMode == 2) {
                this.parent.g();
                return;
            }
            b<T, U> bVar = this.parent;
            if (bVar.get() == 0 && bVar.compareAndSet(0, 1)) {
                long j = bVar.requested.get();
                io.reactivex.rxjava3.internal.fuseable.l lVar = this.queue;
                if (j == 0 || !(lVar == null || lVar.isEmpty())) {
                    if (lVar == null) {
                        lVar = new SpscArrayQueue(bVar.bufferSize);
                        this.queue = lVar;
                    }
                    if (!lVar.offer(u)) {
                        bVar.onError(new MissingBackpressureException("Inner queue full?!"));
                    }
                } else {
                    bVar.downstream.onNext(u);
                    if (j != Long.MAX_VALUE) {
                        bVar.requested.decrementAndGet();
                    }
                    a(1L);
                }
                if (bVar.decrementAndGet() == 0) {
                    return;
                }
            } else {
                io.reactivex.rxjava3.internal.fuseable.l lVar2 = this.queue;
                if (lVar2 == null) {
                    lVar2 = new SpscArrayQueue(bVar.bufferSize);
                    this.queue = lVar2;
                }
                if (!lVar2.offer(u)) {
                    bVar.onError(new MissingBackpressureException("Inner queue full?!"));
                    return;
                } else if (bVar.getAndIncrement() != 0) {
                    return;
                }
            }
            bVar.h();
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
                    }
                }
                jxm0Var.request(this.bufferSize);
            }
        }
    }

    /* compiled from: FlowableFlatMap.java */
    public static final class b<T, U> extends AtomicInteger implements io.reactivex.rxjava3.core.j<T>, jxm0 {
        public static final a<?, ?>[] b = new a[0];
        public static final a<?, ?>[] c = new a[0];
        private static final long serialVersionUID = -2117620485640801370L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final axm0<? super U> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        long lastId;
        int lastIndex;
        final io.reactivex.rxjava3.functions.l<? super T, ? extends ffe0<? extends U>> mapper;
        final int maxConcurrency;
        volatile io.reactivex.rxjava3.internal.fuseable.k<U> queue;
        final AtomicLong requested;
        int scalarEmitted;
        final int scalarLimit;
        final AtomicReference<a<?, ?>[]> subscribers;
        long uniqueId;
        jxm0 upstream;

        public b(axm0<? super U> axm0Var, io.reactivex.rxjava3.functions.l<? super T, ? extends ffe0<? extends U>> lVar, boolean z, int i, int i2) {
            AtomicReference<a<?, ?>[]> atomicReference = new AtomicReference<>();
            this.subscribers = atomicReference;
            this.requested = new AtomicLong();
            this.downstream = axm0Var;
            this.mapper = lVar;
            this.delayErrors = z;
            this.maxConcurrency = i;
            this.bufferSize = i2;
            this.scalarLimit = Math.max(1, i >> 1);
            atomicReference.lazySet(b);
        }

        @Override // xsna.jxm0
        public final void cancel() {
            io.reactivex.rxjava3.internal.fuseable.k<U> kVar;
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            AtomicReference<a<?, ?>[]> atomicReference = this.subscribers;
            a<?, ?>[] aVarArr = c;
            a<?, ?>[] andSet = atomicReference.getAndSet(aVarArr);
            if (andSet != aVarArr) {
                for (a<?, ?> aVar : andSet) {
                    aVar.getClass();
                    SubscriptionHelper.a(aVar);
                }
                this.errors.d();
            }
            if (getAndIncrement() != 0 || (kVar = this.queue) == null) {
                return;
            }
            kVar.clear();
        }

        public final boolean d() {
            if (this.cancelled) {
                io.reactivex.rxjava3.internal.fuseable.k<U> kVar = this.queue;
                if (kVar != null) {
                    kVar.clear();
                }
                return true;
            }
            if (this.delayErrors || this.errors.get() == null) {
                return false;
            }
            io.reactivex.rxjava3.internal.fuseable.k<U> kVar2 = this.queue;
            if (kVar2 != null) {
                kVar2.clear();
            }
            this.errors.g(this.downstream);
            return true;
        }

        public final void g() {
            if (getAndIncrement() == 0) {
                h();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x0091, code lost:
        
            if (r7[r0].id != r10) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0145, code lost:
        
            r3 = r12.done;
            r4 = r12.queue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0149, code lost:
        
            if (r3 == false) goto L103;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x014b, code lost:
        
            if (r4 == null) goto L99;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0151, code lost:
        
            if (r4.isEmpty() == false) goto L103;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x0153, code lost:
        
            j(r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x015a, code lost:
        
            if (d() == false) goto L102;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x015d, code lost:
        
            r15 = r15 + 1;
            r0 = r17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0163, code lost:
        
            if (r10 != r20) goto L106;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x0167, code lost:
        
            r5 = r5 + 1;
            r6 = r23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x016b, code lost:
        
            if (r5 != r8) goto L145;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x016d, code lost:
        
            r5 = 0;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void h() {
            boolean z;
            long j;
            int i;
            long j2;
            boolean z2;
            a<T, U>[] aVarArr;
            int i2;
            int i3;
            long j3;
            axm0<? super U> axm0Var = this.downstream;
            int i4 = 1;
            while (!d()) {
                io.reactivex.rxjava3.internal.fuseable.k<U> kVar = this.queue;
                long j4 = this.requested.get();
                boolean z3 = j4 == Long.MAX_VALUE;
                if (kVar != null) {
                    long j5 = 0;
                    j = 0;
                    while (true) {
                        if (j4 == 0) {
                            z = true;
                            break;
                        }
                        z = true;
                        U poll = kVar.poll();
                        if (d()) {
                            return;
                        }
                        if (poll == null) {
                            break;
                        }
                        axm0Var.onNext(poll);
                        j++;
                        j5++;
                        j4--;
                    }
                    if (j5 != 0) {
                        j4 = z3 ? Long.MAX_VALUE : this.requested.addAndGet(-j5);
                    }
                } else {
                    z = true;
                    j = 0;
                }
                boolean z4 = this.done;
                io.reactivex.rxjava3.internal.fuseable.k<U> kVar2 = this.queue;
                a<?, ?>[] aVarArr2 = this.subscribers.get();
                int length = aVarArr2.length;
                if (z4 && ((kVar2 == null || kVar2.isEmpty()) && length == 0)) {
                    this.errors.g(this.downstream);
                    return;
                }
                if (length != 0) {
                    long j6 = this.lastId;
                    int i5 = this.lastIndex;
                    if (length > i5) {
                        j2 = 0;
                    } else {
                        j2 = 0;
                    }
                    if (length <= i5) {
                        i5 = 0;
                    }
                    for (int i6 = 0; i6 < length && aVarArr2[i5].id != j6; i6++) {
                        i5++;
                        if (i5 == length) {
                            i5 = 0;
                        }
                    }
                    this.lastIndex = i5;
                    this.lastId = aVarArr2[i5].id;
                    long j7 = j4;
                    int i7 = 0;
                    int i8 = i5;
                    boolean z5 = false;
                    while (true) {
                        if (i7 >= length) {
                            i = i4;
                            aVarArr = aVarArr2;
                            break;
                        }
                        if (d()) {
                            return;
                        }
                        a<T, U> aVar = aVarArr2[i8];
                        U u = null;
                        while (true) {
                            io.reactivex.rxjava3.internal.fuseable.l<U> lVar = aVar.queue;
                            if (lVar == null) {
                                i = i4;
                                i2 = i7;
                                aVarArr = aVarArr2;
                                break;
                            }
                            i = i4;
                            long j8 = j2;
                            while (j7 != j2) {
                                if (d()) {
                                    return;
                                }
                                try {
                                    u = lVar.poll();
                                    if (u == null) {
                                        break;
                                    }
                                    axm0Var.onNext(u);
                                    j7--;
                                    j8++;
                                } catch (Throwable th) {
                                    io.reactivex.rxjava3.exceptions.a.b(th);
                                    SubscriptionHelper.a(aVar);
                                    this.errors.a(th);
                                    if (!this.delayErrors) {
                                        this.upstream.cancel();
                                    }
                                    if (d()) {
                                        return;
                                    }
                                    j(aVar);
                                    i3 = i7 + 1;
                                    aVarArr = aVarArr2;
                                    z5 = z;
                                }
                            }
                            if (j8 != j2) {
                                if (z3) {
                                    i2 = i7;
                                    aVarArr = aVarArr2;
                                    j3 = Long.MAX_VALUE;
                                } else {
                                    i2 = i7;
                                    aVarArr = aVarArr2;
                                    j3 = this.requested.addAndGet(-j8);
                                }
                                aVar.a(j8);
                                j7 = j3;
                            } else {
                                i2 = i7;
                                aVarArr = aVarArr2;
                            }
                            if (j7 == j2 || u == null) {
                                break;
                            }
                            aVarArr2 = aVarArr;
                            i4 = i;
                            i7 = i2;
                        }
                        i7 = i3 + 1;
                        aVarArr2 = aVarArr;
                        i4 = i;
                    }
                    z2 = z5;
                    this.lastIndex = i8;
                    this.lastId = aVarArr[i8].id;
                } else {
                    i = i4;
                    j2 = 0;
                    z2 = false;
                }
                long j9 = j;
                if (j9 != j2 && !this.cancelled) {
                    this.upstream.request(j9);
                }
                if (z2) {
                    i4 = i;
                } else {
                    i4 = addAndGet(-i);
                    if (i4 == 0) {
                        return;
                    }
                }
            }
        }

        public final io.reactivex.rxjava3.internal.fuseable.k i() {
            io.reactivex.rxjava3.internal.fuseable.k<U> kVar = this.queue;
            if (kVar == null) {
                kVar = this.maxConcurrency == Integer.MAX_VALUE ? new io.reactivex.rxjava3.internal.queue.b<>(this.bufferSize) : new SpscArrayQueue<>(this.maxConcurrency);
                this.queue = kVar;
            }
            return kVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void j(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            while (true) {
                a<?, ?>[] aVarArr2 = this.subscribers.get();
                int length = aVarArr2.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (aVarArr2[i] == aVar) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr = b;
                } else {
                    a<?, ?>[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr2, 0, aVarArr3, 0, i);
                    System.arraycopy(aVarArr2, i + 1, aVarArr3, i, (length - i) - 1);
                    aVarArr = aVarArr3;
                }
                AtomicReference<a<?, ?>[]> atomicReference = this.subscribers;
                while (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                    if (atomicReference.get() != aVarArr2) {
                        break;
                    }
                }
                return;
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
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.a(th);
                return;
            }
            if (this.errors.a(th)) {
                this.done = true;
                if (!this.delayErrors) {
                    for (a<?, ?> aVar : this.subscribers.getAndSet(c)) {
                        aVar.getClass();
                        SubscriptionHelper.a(aVar);
                    }
                }
                g();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.axm0
        public final void onNext(T t) {
            if (this.done) {
                return;
            }
            try {
                ffe0<? extends U> apply = this.mapper.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null Publisher");
                ffe0<? extends U> ffe0Var = apply;
                if (!(ffe0Var instanceof io.reactivex.rxjava3.functions.n)) {
                    int i = this.bufferSize;
                    long j = this.uniqueId;
                    this.uniqueId = 1 + j;
                    a<?, ?> aVar = new a<>(this, i, j);
                    while (true) {
                        a<?, ?>[] aVarArr = this.subscribers.get();
                        if (aVarArr == c) {
                            SubscriptionHelper.a(aVar);
                            return;
                        }
                        int length = aVarArr.length;
                        a<?, ?>[] aVarArr2 = new a[length + 1];
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                        aVarArr2[length] = aVar;
                        AtomicReference<a<?, ?>[]> atomicReference = this.subscribers;
                        while (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                            if (atomicReference.get() != aVarArr) {
                                break;
                            }
                        }
                        ffe0Var.subscribe(aVar);
                        return;
                    }
                }
                try {
                    Object obj = ((io.reactivex.rxjava3.functions.n) ffe0Var).get();
                    if (obj == null) {
                        if (this.maxConcurrency == Integer.MAX_VALUE || this.cancelled) {
                            return;
                        }
                        int i2 = this.scalarEmitted + 1;
                        this.scalarEmitted = i2;
                        int i3 = this.scalarLimit;
                        if (i2 == i3) {
                            this.scalarEmitted = 0;
                            this.upstream.request(i3);
                            return;
                        }
                        return;
                    }
                    if (get() == 0 && compareAndSet(0, 1)) {
                        long j2 = this.requested.get();
                        io.reactivex.rxjava3.internal.fuseable.k<U> kVar = this.queue;
                        if (j2 == 0 || !(kVar == 0 || kVar.isEmpty())) {
                            if (kVar == 0) {
                                kVar = (io.reactivex.rxjava3.internal.fuseable.k<U>) i();
                            }
                            if (!kVar.offer(obj)) {
                                onError(new MissingBackpressureException("Scalar queue full?!"));
                            }
                        } else {
                            this.downstream.onNext(obj);
                            if (j2 != Long.MAX_VALUE) {
                                this.requested.decrementAndGet();
                            }
                            if (this.maxConcurrency != Integer.MAX_VALUE && !this.cancelled) {
                                int i4 = this.scalarEmitted + 1;
                                this.scalarEmitted = i4;
                                int i5 = this.scalarLimit;
                                if (i4 == i5) {
                                    this.scalarEmitted = 0;
                                    this.upstream.request(i5);
                                }
                            }
                        }
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    } else if (!i().offer(obj)) {
                        onError(new MissingBackpressureException("Scalar queue full?!"));
                        return;
                    } else if (getAndIncrement() != 0) {
                        return;
                    }
                    h();
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    this.errors.a(th);
                    g();
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                this.upstream.cancel();
                onError(th2);
            }
        }

        @Override // xsna.axm0
        public final void onSubscribe(jxm0 jxm0Var) {
            if (SubscriptionHelper.f(this.upstream, jxm0Var)) {
                this.upstream = jxm0Var;
                this.downstream.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                int i = this.maxConcurrency;
                if (i == Integer.MAX_VALUE) {
                    jxm0Var.request(Long.MAX_VALUE);
                } else {
                    jxm0Var.request(i);
                }
            }
        }

        @Override // xsna.jxm0
        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                io.reactivex.rxjava3.internal.util.b.a(this.requested, j);
                g();
            }
        }
    }

    public s(io.reactivex.rxjava3.core.g gVar, io.reactivex.rxjava3.functions.l lVar, int i, int i2) {
        super(gVar);
        this.d = lVar;
        this.e = i;
        this.f = i2;
    }

    public static <T, U> io.reactivex.rxjava3.core.j<T> subscribe(axm0<? super U> axm0Var, io.reactivex.rxjava3.functions.l<? super T, ? extends ffe0<? extends U>> lVar, boolean z, int i, int i2) {
        return new b(axm0Var, lVar, z, i, i2);
    }

    @Override // io.reactivex.rxjava3.core.g
    public final void l(axm0<? super U> axm0Var) {
        io.reactivex.rxjava3.core.g<T> gVar = this.c;
        io.reactivex.rxjava3.functions.l<? super T, ? extends ffe0<? extends U>> lVar = this.d;
        if (s0.b(gVar, axm0Var, lVar)) {
            return;
        }
        gVar.subscribe((io.reactivex.rxjava3.core.j) subscribe(axm0Var, lVar, false, this.e, this.f));
    }
}
