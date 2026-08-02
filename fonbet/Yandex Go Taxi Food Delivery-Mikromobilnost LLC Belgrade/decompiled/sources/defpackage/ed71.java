package defpackage;

import java.util.Arrays;

/* loaded from: classes7.dex */
public final class ed71 {
    public int a;
    public long[] b = new long[32];

    public final long a(int i) {
        if (i >= 0 && i < this.a) {
            return this.b[i];
        }
        ny61.i(b64.t(i, "Invalid index ", ", size is "), this.a);
        return 0L;
    }

    public final void b(long j) {
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
}
