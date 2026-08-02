package io.reactivex.rxjava3.internal.queue;

import io.reactivex.rxjava3.internal.fuseable.k;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes11.dex */
public final class SpscArrayQueue<E> extends AtomicReferenceArray<E> implements k<E> {
    public static final Integer b = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;
    final AtomicLong consumerIndex;
    final int lookAheadStep;
    final int mask;
    final AtomicLong producerIndex;
    long producerLookAhead;

    public SpscArrayQueue(int i) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i - 1)));
        this.mask = length() - 1;
        this.producerIndex = new AtomicLong();
        this.consumerIndex = new AtomicLong();
        this.lookAheadStep = Math.min(i / 4, b.intValue());
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
        return this.producerIndex.get() == this.consumerIndex.get();
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final boolean offer(E e) {
        if (e == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        int i = this.mask;
        long j = this.producerIndex.get();
        int i2 = ((int) j) & i;
        if (j >= this.producerLookAhead) {
            long j2 = this.lookAheadStep + j;
            if (get(i & ((int) j2)) == null) {
                this.producerLookAhead = j2;
            } else if (get(i2) != null) {
                return false;
            }
        }
        lazySet(i2, e);
        this.producerIndex.lazySet(j + 1);
        return true;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final E poll() {
        long j = this.consumerIndex.get();
        int i = ((int) j) & this.mask;
        E e = get(i);
        if (e == null) {
            return null;
        }
        this.consumerIndex.lazySet(j + 1);
        lazySet(i, null);
        return e;
    }
}
