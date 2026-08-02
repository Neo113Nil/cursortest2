package xsna;

import java.util.Arrays;

/* compiled from: LongSet.kt */
/* loaded from: classes11.dex */
public final class zg50 extends v500 {
    public int e;

    public zg50(int i) {
        if (i >= 0) {
            c(h5h0.e(i));
        } else {
            alk.B("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int b(int i) {
        int i2 = this.c;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final void c(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, h5h0.d(i)) : 0;
        this.c = max;
        if (max == 0) {
            jArr = h5h0.a;
        } else {
            int i2 = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.a = jArr;
        int i3 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.e = h5h0.a(this.c) - this.d;
        this.b = new long[max];
    }
}
