package defpackage;

/* loaded from: classes.dex */
public final class m2t0 {
    public int a;
    public long[] b = new long[16];
    public int[] c = new int[16];
    public int[] d;
    public int e;

    public m2t0() {
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        this.d = iArr;
    }

    public final int a(long j) {
        int i = this.a + 1;
        long[] jArr = this.b;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            int[] iArr = new int[i2];
            f73.k(jArr, 0, jArr2);
            f73.h(0, 0, 14, this.c, iArr);
            this.b = jArr2;
            this.c = iArr;
        }
        int i3 = this.a;
        this.a = i3 + 1;
        int length2 = this.d.length;
        if (this.e >= length2) {
            int i4 = length2 * 2;
            int[] iArr2 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr2[i5] = i6;
                i5 = i6;
            }
            f73.h(0, 0, 14, this.d, iArr2);
            this.d = iArr2;
        }
        int i7 = this.e;
        int[] iArr3 = this.d;
        this.e = iArr3[i7];
        long[] jArr3 = this.b;
        jArr3[i3] = j;
        this.c[i3] = i7;
        iArr3[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (jl40.r(jArr3[i8], j) <= 0) {
                break;
            }
            b(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    public final void b(int i, int i2) {
        long[] jArr = this.b;
        int[] iArr = this.c;
        int[] iArr2 = this.d;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }
}
