package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableCache.java */
/* loaded from: classes8.dex */
public final class k<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> implements io.reactivex.rxjava3.core.v<T> {
    public static final a[] l = new a[0];
    public static final a[] m = new a[0];
    public final AtomicBoolean c;
    public final int d;
    public final AtomicReference<a<T>[]> e;
    public volatile long f;
    public final b<T> g;
    public b<T> h;
    public int i;
    public Throwable j;
    public volatile boolean k;

    /* compiled from: ObservableCache.java */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.disposables.c {
        private static final long serialVersionUID = 6770240836423125754L;
        volatile boolean disposed;
        final io.reactivex.rxjava3.core.v<? super T> downstream;
        long index;
        b<T> node;
        int offset;
        final k<T> parent;

        public a(io.reactivex.rxjava3.core.v<? super T> vVar, k<T> kVar) {
            this.downstream = vVar;
            this.parent = kVar;
            this.node = kVar.g;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            a<T>[] aVarArr;
            if (this.disposed) {
                return;
            }
            this.disposed = true;
            AtomicReference<a<T>[]> atomicReference = this.parent.e;
            while (true) {
                a<T>[] aVarArr2 = atomicReference.get();
                int length = aVarArr2.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (aVarArr2[i] == this) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr = k.l;
                } else {
                    a<T>[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr2, 0, aVarArr3, 0, i);
                    System.arraycopy(aVarArr2, i + 1, aVarArr3, i, (length - i) - 1);
                    aVarArr = aVarArr3;
                }
                while (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                    if (atomicReference.get() != aVarArr2) {
                        break;
                    }
                }
                return;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.disposed;
        }
    }

    /* compiled from: ObservableCache.java */
    public static final class b<T> {
        public final T[] a;
        public volatile b<T> b;

        public b(int i) {
            this.a = (T[]) new Object[i];
        }
    }

    public k(io.reactivex.rxjava3.core.q qVar) {
        super(qVar);
        this.d = 16;
        this.c = new AtomicBoolean();
        b<T> bVar = new b<>(16);
        this.g = bVar;
        this.h = bVar;
        this.e = new AtomicReference<>(l);
    }

    public final void M0(a<T> aVar) {
        if (aVar.getAndIncrement() != 0) {
            return;
        }
        long j = aVar.index;
        int i = aVar.offset;
        b<T> bVar = aVar.node;
        io.reactivex.rxjava3.core.v<? super T> vVar = aVar.downstream;
        int i2 = this.d;
        int i3 = 1;
        while (!aVar.disposed) {
            boolean z = this.k;
            boolean z2 = this.f == j;
            if (z && z2) {
                aVar.node = null;
                Throwable th = this.j;
                if (th != null) {
                    vVar.onError(th);
                    return;
                } else {
                    vVar.onComplete();
                    return;
                }
            }
            if (z2) {
                aVar.index = j;
                aVar.offset = i;
                aVar.node = bVar;
                i3 = aVar.addAndGet(-i3);
                if (i3 == 0) {
                    return;
                }
            } else {
                if (i == i2) {
                    bVar = bVar.b;
                    i = 0;
                }
                vVar.onNext(bVar.a[i]);
                i++;
                j++;
            }
        }
        aVar.node = null;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        this.k = true;
        for (a<T> aVar : this.e.getAndSet(m)) {
            M0(aVar);
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        this.j = th;
        this.k = true;
        for (a<T> aVar : this.e.getAndSet(m)) {
            M0(aVar);
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(T t) {
        int i = this.i;
        if (i == this.d) {
            b<T> bVar = new b<>(i);
            bVar.a[0] = t;
            this.i = 1;
            this.h.b = bVar;
            this.h = bVar;
        } else {
            this.h.a[i] = t;
            this.i = i + 1;
        }
        this.f++;
        for (a<T> aVar : this.e.get()) {
            M0(aVar);
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        a<T> aVar = new a<>(vVar, this);
        vVar.onSubscribe(aVar);
        loop0: while (true) {
            AtomicReference<a<T>[]> atomicReference = this.e;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr != m) {
                int length = aVarArr.length;
                a<T>[] aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
                while (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                    if (atomicReference.get() != aVarArr) {
                        break;
                    }
                }
                break loop0;
            }
            break;
        }
        AtomicBoolean atomicBoolean = this.c;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            M0(aVar);
        } else {
            this.b.subscribe(this);
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
    }
}
