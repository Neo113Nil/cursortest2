package yads;

/* loaded from: classes10.dex */
public final class ad3 {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};
    public final byte[] a = new byte[8];
    public int b;
    public int c;

    public static long a(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public final long a(ld0 ld0Var, boolean z, boolean z2, int i) {
        int i2;
        if (this.b == 0) {
            if (!ld0Var.a(this.a, 0, 1, z)) {
                return -1L;
            }
            int i3 = this.a[0] & 255;
            int i4 = 0;
            while (true) {
                long[] jArr = d;
                if (i4 >= 8) {
                    i2 = -1;
                    break;
                }
                if ((jArr[i4] & i3) != 0) {
                    i2 = i4 + 1;
                    break;
                }
                i4++;
            }
            this.c = i2;
            if (i2 != -1) {
                this.b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i5 = this.c;
        if (i5 > i) {
            this.b = 0;
            return -2L;
        }
        if (i5 != 1) {
            ld0Var.a(this.a, 1, i5 - 1, false);
        }
        this.b = 0;
        return a(this.a, this.c, z2);
    }
}
