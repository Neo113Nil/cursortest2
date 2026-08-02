package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableFlatMap.java */
/* loaded from: classes11.dex */
public final class j0<T, U> extends io.reactivex.rxjava3.internal.operators.observable.a<T, U> {
    public final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.t<? extends U>> c;
    public final boolean d;
    public final int e;
    public final int f;

    /* compiled from: ObservableFlatMap.java */
    public static final class a<T, U> extends AtomicReference<io.reactivex.rxjava3.disposables.c> implements io.reactivex.rxjava3.core.v<U> {
        private static final long serialVersionUID = -4606175640614850599L;
        volatile boolean done;
        int fusionMode;
        final long id;
        final b<T, U> parent;
        volatile io.reactivex.rxjava3.internal.fuseable.l<U> queue;

        public a(b<T, U> bVar, long j) {
            this.id = j;
            this.parent = bVar;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            this.done = true;
            this.parent.i();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (this.parent.errors.a(th)) {
                b<T, U> bVar = this.parent;
                if (!bVar.delayErrors) {
                    bVar.g();
                }
                this.done = true;
                this.parent.i();
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(U u) {
            if (this.fusionMode != 0) {
                this.parent.i();
                return;
            }
            b<T, U> bVar = this.parent;
            if (bVar.get() == 0 && bVar.compareAndSet(0, 1)) {
                bVar.downstream.onNext(u);
                if (bVar.decrementAndGet() == 0) {
                    return;
                }
            } else {
                io.reactivex.rxjava3.internal.fuseable.l lVar = this.queue;
                if (lVar == null) {
                    lVar = new io.reactivex.rxjava3.internal.queue.b(bVar.bufferSize);
                    this.queue = lVar;
                }
                lVar.offer(u);
                if (bVar.getAndIncrement() != 0) {
                    return;
                }
            }
            bVar.j();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.e(this, cVar) && (cVar instanceof io.reactivex.rxjava3.internal.fuseable.g)) {
                io.reactivex.rxjava3.internal.fuseable.g gVar = (io.reactivex.rxjava3.internal.fuseable.g) cVar;
                int a = gVar.a(7);
                if (a == 1) {
                    this.fusionMode = a;
                    this.queue = gVar;
                    this.done = true;
                    this.parent.i();
                    return;
                }
                if (a == 2) {
                    this.fusionMode = a;
                    this.queue = gVar;
                }
            }
        }
    }

    /* compiled from: ObservableFlatMap.java */
    public static final class b<T, U> extends AtomicInteger implements io.reactivex.rxjava3.disposables.c, io.reactivex.rxjava3.core.v<T> {
        public static final a<?, ?>[] b = new a[0];
        public static final a<?, ?>[] c = new a[0];
        private static final long serialVersionUID = -2117620485640801370L;
        final int bufferSize;
        final boolean delayErrors;
        volatile boolean disposed;
        volatile boolean done;
        final io.reactivex.rxjava3.core.v<? super U> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        int lastIndex;
        final io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.t<? extends U>> mapper;
        final int maxConcurrency;
        final AtomicReference<a<?, ?>[]> observers;
        volatile io.reactivex.rxjava3.internal.fuseable.k<U> queue;
        Queue<io.reactivex.rxjava3.core.t<? extends U>> sources;
        long uniqueId;
        io.reactivex.rxjava3.disposables.c upstream;
        int wip;

        public b(io.reactivex.rxjava3.core.v<? super U> vVar, io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.t<? extends U>> lVar, boolean z, int i, int i2) {
            this.downstream = vVar;
            this.mapper = lVar;
            this.delayErrors = z;
            this.maxConcurrency = i;
            this.bufferSize = i2;
            if (i != Integer.MAX_VALUE) {
                this.sources = new ArrayDeque(i);
            }
            this.observers = new AtomicReference<>(b);
        }

        public final boolean d() {
            if (this.disposed) {
                return true;
            }
            Throwable th = this.errors.get();
            if (this.delayErrors || th == null) {
                return false;
            }
            g();
            this.errors.f(this.downstream);
            return true;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.disposed = true;
            if (g()) {
                this.errors.d();
            }
        }

        public final boolean g() {
            this.upstream.dispose();
            AtomicReference<a<?, ?>[]> atomicReference = this.observers;
            a<?, ?>[] aVarArr = c;
            a<?, ?>[] andSet = atomicReference.getAndSet(aVarArr);
            if (andSet == aVarArr) {
                return false;
            }
            for (a<?, ?> aVar : andSet) {
                aVar.getClass();
                DisposableHelper.a(aVar);
            }
            return true;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.disposed;
        }

        public final void i() {
            if (getAndIncrement() == 0) {
                j();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void j() {
            int i;
            int i2;
            io.reactivex.rxjava3.core.v<? super U> vVar = this.downstream;
            int i3 = 1;
            while (!d()) {
                io.reactivex.rxjava3.internal.fuseable.k<U> kVar = this.queue;
                int i4 = 0;
                if (kVar != null) {
                    while (!d()) {
                        U poll = kVar.poll();
                        if (poll != null) {
                            vVar.onNext(poll);
                            i4++;
                        }
                    }
                    return;
                }
                if (i4 == 0) {
                    boolean z = this.done;
                    io.reactivex.rxjava3.internal.fuseable.k<U> kVar2 = this.queue;
                    a<?, ?>[] aVarArr = this.observers.get();
                    int length = aVarArr.length;
                    if (this.maxConcurrency != Integer.MAX_VALUE) {
                        synchronized (this) {
                            i = this.sources.size();
                        }
                    } else {
                        i = 0;
                    }
                    if (z && ((kVar2 == null || kVar2.isEmpty()) && length == 0 && i == 0)) {
                        this.errors.f(this.downstream);
                        return;
                    }
                    if (length != 0) {
                        int min = Math.min(length - 1, this.lastIndex);
                        for (0; i2 < length; i2 + 1) {
                            if (d()) {
                                return;
                            }
                            a<T, U> aVar = aVarArr[min];
                            io.reactivex.rxjava3.internal.fuseable.l<U> lVar = aVar.queue;
                            if (lVar != null) {
                                do {
                                    try {
                                        U poll2 = lVar.poll();
                                        if (poll2 != null) {
                                            vVar.onNext(poll2);
                                        }
                                    } catch (Throwable th) {
                                        io.reactivex.rxjava3.exceptions.a.b(th);
                                        DisposableHelper.a(aVar);
                                        this.errors.a(th);
                                        if (d()) {
                                            return;
                                        }
                                        k(aVar);
                                        i4++;
                                        min++;
                                        if (min != length) {
                                        }
                                    }
                                } while (!d());
                                return;
                            }
                            boolean z2 = aVar.done;
                            io.reactivex.rxjava3.internal.fuseable.l<U> lVar2 = aVar.queue;
                            if (z2 && (lVar2 == null || lVar2.isEmpty())) {
                                k(aVar);
                                i4++;
                            }
                            min++;
                            i2 = min != length ? i2 + 1 : 0;
                            min = 0;
                        }
                        this.lastIndex = min;
                    }
                    if (i4 == 0) {
                        i3 = addAndGet(-i3);
                        if (i3 == 0) {
                            return;
                        }
                    } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                        m(i4);
                    }
                } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                    m(i4);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void k(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            while (true) {
                a<?, ?>[] aVarArr2 = this.observers.get();
                int length = aVarArr2.length;
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
                AtomicReference<a<?, ?>[]> atomicReference = this.observers;
                while (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                    if (atomicReference.get() != aVarArr2) {
                        break;
                    }
                }
                return;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
        
            if (decrementAndGet() == 0) goto L28;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v19 */
        /* JADX WARN: Type inference failed for: r3v20 */
        /* JADX WARN: Type inference failed for: r3v6, types: [io.reactivex.rxjava3.internal.fuseable.l] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void l(io.reactivex.rxjava3.core.t<? extends U> tVar) {
            boolean z;
            do {
                z = false;
                if (!(tVar instanceof io.reactivex.rxjava3.functions.n)) {
                    long j = this.uniqueId;
                    this.uniqueId = 1 + j;
                    a<?, ?> aVar = new a<>(this, j);
                    while (true) {
                        a<?, ?>[] aVarArr = this.observers.get();
                        if (aVarArr == c) {
                            DisposableHelper.a(aVar);
                            return;
                        }
                        int length = aVarArr.length;
                        a<?, ?>[] aVarArr2 = new a[length + 1];
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                        aVarArr2[length] = aVar;
                        AtomicReference<a<?, ?>[]> atomicReference = this.observers;
                        while (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                            if (atomicReference.get() != aVarArr) {
                                break;
                            }
                        }
                        tVar.subscribe(aVar);
                        return;
                    }
                }
                try {
                    Object obj = ((io.reactivex.rxjava3.functions.n) tVar).get();
                    if (obj != null) {
                        if (get() == 0 && compareAndSet(0, 1)) {
                            this.downstream.onNext(obj);
                        } else {
                            io.reactivex.rxjava3.internal.fuseable.k<U> kVar = this.queue;
                            ?? r3 = kVar;
                            if (kVar == false) {
                                io.reactivex.rxjava3.internal.fuseable.k<U> bVar = this.maxConcurrency == Integer.MAX_VALUE ? new io.reactivex.rxjava3.internal.queue.b(this.bufferSize) : new SpscArrayQueue(this.maxConcurrency);
                                this.queue = bVar;
                                r3 = bVar;
                            }
                            r3.offer(obj);
                            if (getAndIncrement() != 0) {
                                return;
                            }
                        }
                        j();
                    }
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    this.errors.a(th);
                    i();
                }
                if (this.maxConcurrency == Integer.MAX_VALUE) {
                    return;
                }
                synchronized (this) {
                    try {
                        tVar = this.sources.poll();
                        if (tVar == null) {
                            this.wip--;
                            z = true;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } while (!z);
            i();
        }

        public final void m(int i) {
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    return;
                }
                synchronized (this) {
                    try {
                        io.reactivex.rxjava3.core.t<? extends U> poll = this.sources.poll();
                        if (poll == null) {
                            this.wip--;
                        } else {
                            l(poll);
                        }
                    } finally {
                    }
                }
                i = i2;
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            i();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (this.done) {
                io.reactivex.rxjava3.plugins.a.a(th);
            } else if (this.errors.a(th)) {
                this.done = true;
                i();
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            if (this.done) {
                return;
            }
            try {
                io.reactivex.rxjava3.core.t<? extends U> apply = this.mapper.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                io.reactivex.rxjava3.core.t<? extends U> tVar = apply;
                if (this.maxConcurrency != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            int i = this.wip;
                            if (i == this.maxConcurrency) {
                                this.sources.offer(tVar);
                                return;
                            }
                            this.wip = i + 1;
                        } finally {
                        }
                    }
                }
                l(tVar);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.upstream.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            if (DisposableHelper.f(this.upstream, cVar)) {
                this.upstream = cVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public j0(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.functions.l lVar, boolean z, int i, int i2) {
        super(qVar);
        this.c = lVar;
        this.d = z;
        this.e = i;
        this.f = i2;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super U> vVar) {
        io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.t<? extends U>> lVar = this.c;
        io.reactivex.rxjava3.core.t<T> tVar = this.b;
        if (ObservableScalarXMap.a(tVar, vVar, lVar)) {
            return;
        }
        tVar.subscribe(new b(vVar, this.c, this.d, this.e, this.f));
    }
}
