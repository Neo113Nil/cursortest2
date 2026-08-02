package defpackage;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class nlz {
    public int a;
    public long[] b;

    public nlz(int i) {
        this.b = new long[i];
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

    public final void b(long[] jArr) {
        int length = this.a + jArr.length;
        long[] jArr2 = this.b;
        if (length > jArr2.length) {
            this.b = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.b, this.a, jArr.length);
        this.a = length;
    }

    public final long c(int i) {
        if (i >= 0 && i < this.a) {
            return this.b[i];
        }
        ny61.i(b64.t(i, "Invalid index ", ", size is "), this.a);
        return 0L;
    }

    public final int d() {
        return this.a;
    }

    public nlz() {
        this(32);
    }
}
