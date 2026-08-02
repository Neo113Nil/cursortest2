package io.reactivex.rxjava3.internal.queue;

import io.reactivex.rxjava3.internal.fuseable.k;
import io.reactivex.rxjava3.internal.operators.flowable.g;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: SpscLinkedArrayQueue.java */
/* loaded from: classes11.dex */
public final class b<T> implements k<T> {
    public static final int j = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    public static final Object k = new Object();
    public final AtomicLong b;
    public final int c;
    public long d;
    public final int e;
    public AtomicReferenceArray<Object> f;
    public final int g;
    public AtomicReferenceArray<Object> h;
    public final AtomicLong i;

    public b(int i) {
        AtomicLong atomicLong = new AtomicLong();
        this.b = atomicLong;
        this.i = new AtomicLong();
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i) - 1));
        int i2 = numberOfLeadingZeros - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(numberOfLeadingZeros + 1);
        this.f = atomicReferenceArray;
        this.e = i2;
        this.c = Math.min(numberOfLeadingZeros / 4, j);
        this.h = atomicReferenceArray;
        this.g = i2;
        this.d = numberOfLeadingZeros - 2;
        atomicLong.lazySet(0L);
    }

    public final void b(g.b bVar, Object obj) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f;
        AtomicLong atomicLong = this.b;
        long j2 = atomicLong.get();
        long j3 = 2 + j2;
        int i = this.e;
        if (atomicReferenceArray.get(((int) j3) & i) == null) {
            int i2 = ((int) j2) & i;
            atomicReferenceArray.lazySet(i2 + 1, obj);
            atomicReferenceArray.lazySet(i2, bVar);
            atomicLong.lazySet(j3);
            return;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f = atomicReferenceArray2;
        int i3 = ((int) j2) & i;
        atomicReferenceArray2.lazySet(i3 + 1, obj);
        atomicReferenceArray2.lazySet(i3, bVar);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i3, k);
        atomicLong.lazySet(j3);
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final boolean isEmpty() {
        return this.b.get() == this.i.get();
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final boolean offer(T t) {
        if (t == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.f;
        AtomicLong atomicLong = this.b;
        long j2 = atomicLong.get();
        int i = this.e;
        int i2 = ((int) j2) & i;
        if (j2 < this.d) {
            atomicReferenceArray.lazySet(i2, t);
            atomicLong.lazySet(j2 + 1);
            return true;
        }
        long j3 = this.c + j2;
        if (atomicReferenceArray.get(((int) j3) & i) == null) {
            this.d = j3 - 1;
            atomicReferenceArray.lazySet(i2, t);
            atomicLong.lazySet(j2 + 1);
            return true;
        }
        long j4 = j2 + 1;
        if (atomicReferenceArray.get(((int) j4) & i) == null) {
            atomicReferenceArray.lazySet(i2, t);
            atomicLong.lazySet(j4);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f = atomicReferenceArray2;
        this.d = (j2 + i) - 1;
        atomicReferenceArray2.lazySet(i2, t);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i2, k);
        atomicLong.lazySet(j4);
        return true;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.h;
        AtomicLong atomicLong = this.i;
        long j2 = atomicLong.get();
        int i = this.g;
        int i2 = ((int) j2) & i;
        T t = (T) atomicReferenceArray.get(i2);
        boolean z = t == k;
        if (t != null && !z) {
            atomicReferenceArray.lazySet(i2, null);
            atomicLong.lazySet(j2 + 1);
            return t;
        }
        if (!z) {
            return null;
        }
        int i3 = i + 1;
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
        atomicReferenceArray.lazySet(i3, null);
        this.h = atomicReferenceArray2;
        T t2 = (T) atomicReferenceArray2.get(i2);
        if (t2 != null) {
            atomicReferenceArray2.lazySet(i2, null);
            atomicLong.lazySet(j2 + 1);
        }
        return t2;
    }
}
