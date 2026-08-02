package xsna;

import java.util.Arrays;

/* compiled from: Sonic.kt */
/* loaded from: classes3.dex */
public final class yek0 {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final int e;
    public final int f;
    public final int g;
    public final short[] h;
    public int i;
    public short[] j;
    public int k;
    public short[] l;
    public int m;
    public short[] n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;

    public yek0(float f, int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = f / 1.0f;
        this.d = (i / i3) * 1.0f;
        this.e = i / 400;
        int i4 = i / 65;
        this.f = i4;
        int i5 = i4 * 2;
        this.g = i5;
        this.h = new short[i5];
        int i6 = i5 * i2;
        this.j = new short[i6];
        this.l = new short[i6];
        this.n = new short[i6];
    }

    public final void a(short[] sArr, int i, int i2) {
        short[] c = c(this.l, this.k, i2);
        this.l = c;
        int i3 = this.b;
        System.arraycopy(sArr, i * i3, c, this.k * i3, i3 * i2);
        this.k += i2;
    }

    public final void b(short[] sArr, int i, int i2) {
        int i3 = this.g / i2;
        int i4 = this.b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[rqi.a(i7, i5, i6, i9)];
            }
            this.h[i7] = (short) (i8 / i5);
        }
    }

    public final short[] c(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.b;
        int i4 = length / i3;
        return i + i2 < i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public final int d(short[] sArr, int i, int i2, int i3) {
        int i4;
        int i5 = i * this.b;
        int i6 = 0;
        int i7 = 255;
        int i8 = 1;
        if (i2 <= i3) {
            int i9 = 0;
            i4 = 0;
            while (true) {
                int i10 = 0;
                for (int i11 = 0; i11 < i2; i11++) {
                    i10 += Math.abs(sArr[i5 + i11] - sArr[(i5 + i2) + i11]);
                }
                if (i10 * i9 < i8 * i2) {
                    i9 = i2;
                    i8 = i10;
                }
                if (i10 * i7 > i4 * i2) {
                    i7 = i2;
                    i4 = i10;
                }
                if (i2 == i3) {
                    break;
                }
                i2++;
            }
            i6 = i9;
        } else {
            i4 = 0;
        }
        this.t = i8 / i6;
        this.u = i4 / i7;
        return i6;
    }

    public final void e(int i, int i2, short[] sArr, int i3, int i4) {
        short[] sArr2 = this.l;
        int i5 = 0;
        while (true) {
            int i6 = this.b;
            if (i5 >= i6) {
                return;
            }
            int i7 = (i2 * i6) + i5;
            int i8 = (i4 * i6) + i5;
            int i9 = (i3 * i6) + i5;
            for (int i10 = 0; i10 < i; i10++) {
                sArr2[i7] = (short) (((sArr[i8] * i10) + ((i - i10) * sArr[i9])) / i);
                i7 += i6;
                i9 += i6;
                i8 += i6;
            }
            i5++;
        }
    }
}
