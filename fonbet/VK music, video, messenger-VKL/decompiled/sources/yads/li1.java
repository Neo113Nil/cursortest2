package yads;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class li1 {
    public int a;
    public long[] b;

    public li1() {
        this(0);
    }

    public final void a(long j) {
        int i = this.a;
        long[] jArr = this.b;
        if (i == jArr.length) {
            this.b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        jArr2[i2] = j;
    }

    public li1(int i) {
        this.b = new long[32];
    }

    public final long a(int i) {
        if (i >= 0 && i < this.a) {
            return this.b[i];
        }
        StringBuilder b = xsna.ji.b(i, "Invalid index ", ", size is ");
        b.append(this.a);
        throw new IndexOutOfBoundsException(b.toString());
    }

    public final long[] a() {
        return Arrays.copyOf(this.b, this.a);
    }
}
