package xsna;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;

/* compiled from: DynamicPrimitiveLongList.java */
/* loaded from: classes8.dex */
public final class oqo extends AbstractList<Long> {
    public final int b;
    public long[][] c;
    public int d;
    public int e;

    public oqo(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Subarray capacity must be positive");
        }
        this.b = i;
        this.c = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 0, i);
        this.e = 0;
        this.d = 0;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.d) {
            StringBuilder b = ji.b(i, "Index: ", ", Size: ");
            b.append(this.d);
            throw new IndexOutOfBoundsException(b.toString());
        }
    }

    public final void d(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("New size must be non-negative");
        }
        int i2 = this.b;
        int i3 = ((i + i2) - 1) / i2;
        if (i3 > this.e) {
            this.c = (long[][]) Arrays.copyOf(this.c, i3);
            for (int i4 = this.e; i4 < i3; i4++) {
                this.c[i4] = new long[i2];
            }
            this.e = i3;
        }
        this.d = i;
        for (int i5 = 0; i5 < i; i5++) {
            setLong(i5, 0L);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        long[][] jArr = this.c;
        int i2 = this.b;
        return Long.valueOf(jArr[i / i2][i % i2]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return Long.valueOf(setLong(i, ((Long) obj).longValue()));
    }

    public final long setLong(int i, long j) {
        c(i);
        long[][] jArr = this.c;
        int i2 = this.b;
        long j2 = jArr[i / i2][i % i2];
        jArr[i / i2][i % i2] = j;
        return j2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
