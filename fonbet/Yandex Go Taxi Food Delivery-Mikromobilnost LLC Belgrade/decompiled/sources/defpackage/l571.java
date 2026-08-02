package defpackage;

import com.adjust.sdk.Constants;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class l571 {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final short[] i;
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
    public int v;

    public l571(int i, int i2, int i3, float f, float f2) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i / i3;
        this.f = i / Constants.MINIMAL_ERROR_STATUS_CODE;
        int i4 = i / 65;
        this.g = i4;
        int i5 = i4 * 2;
        this.h = i5;
        this.i = new short[i5];
        int i6 = i5 * i2;
        this.j = new short[i6];
        this.l = new short[i6];
        this.n = new short[i6];
    }

    public static void c(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr3[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    public final int a(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.b;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i7 < i6 * i2) {
                i7 = i2;
                i6 = i9;
            }
            if (i9 * i5 > i8 * i2) {
                i5 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.u = i6 / i7;
        this.v = i8 / i5;
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0260 A[LOOP:4: B:51:0x004e->B:57:0x0260, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0190 A[EDGE_INSN: B:58:0x0190->B:59:0x0190 BREAK  A[LOOP:4: B:51:0x004e->B:57:0x0260], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        float f;
        float f2;
        float f3;
        double d;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.m;
        float f4 = this.c;
        float f5 = this.d;
        float f6 = f4 / f5;
        float f7 = this.e * f5;
        double d2 = f6;
        int i10 = this.a;
        int i11 = this.b;
        if (d2 > 1.00001d || d2 < 0.99999d) {
            int i12 = this.k;
            int i13 = this.h;
            if (i12 >= i13) {
                int i14 = 0;
                while (true) {
                    int i15 = this.r;
                    short[] sArr = this.j;
                    if (i15 > 0) {
                        i5 = Math.min(i13, i15);
                        f2 = 1.0f;
                        short[] e = e(this.l, this.m, i5);
                        this.l = e;
                        f = f6;
                        System.arraycopy(sArr, i14 * i11, e, this.m * i11, i5 * i11);
                        this.m += i5;
                        this.r -= i5;
                        f3 = f7;
                        d = d2;
                        i4 = i14;
                    } else {
                        f = f6;
                        f2 = 1.0f;
                        int i16 = i10 > 4000 ? i10 / 4000 : 1;
                        int i17 = this.g;
                        int i18 = this.f;
                        if (i11 == 1 && i16 == 1) {
                            i = a(sArr, i14, i18, i17);
                            f3 = f7;
                            d = d2;
                        } else {
                            d(sArr, i14, i16);
                            f3 = f7;
                            short[] sArr2 = this.i;
                            d = d2;
                            int a = a(sArr2, 0, i18 / i16, i17 / i16);
                            if (i16 != 1) {
                                int i19 = a * i16;
                                int i20 = i16 * 4;
                                int i21 = i19 - i20;
                                int i22 = i19 + i20;
                                if (i21 >= i18) {
                                    i18 = i21;
                                }
                                if (i22 <= i17) {
                                    i17 = i22;
                                }
                                if (i11 == 1) {
                                    i = a(sArr, i14, i18, i17);
                                } else {
                                    d(sArr, i14, 1);
                                    i = a(sArr2, 0, i18, i17);
                                }
                            } else {
                                i = a;
                            }
                        }
                        int i23 = this.u;
                        int i24 = this.v;
                        if (i23 == 0 || (i2 = this.s) == 0 || i24 > i23 * 3 || i23 * 2 <= this.t * 3) {
                            i2 = i;
                        }
                        this.t = i23;
                        this.s = i;
                        short[] sArr3 = this.j;
                        if (d > 1.0d) {
                            if (f >= 2.0f) {
                                i6 = (int) (i2 / (f - 1.0f));
                            } else {
                                this.r = (int) (((2.0f - f) * i2) / (f - 1.0f));
                                i6 = i2;
                            }
                            short[] e2 = e(this.l, this.m, i6);
                            this.l = e2;
                            int i25 = i14 + i2;
                            int i26 = i14;
                            int i27 = i6;
                            c(i27, this.b, e2, this.m, sArr3, i26, sArr3, i25);
                            this.m += i27;
                            i14 = i2 + i27 + i26;
                            if (i14 + i13 <= i12) {
                                break;
                            }
                            f6 = f;
                            f7 = f3;
                            d2 = d;
                        } else {
                            int i28 = i14;
                            if (f < 0.5f) {
                                i3 = (int) ((i2 * f) / (1.0f - f));
                            } else {
                                this.r = (int) ((((2.0f * f) - 1.0f) * i2) / (1.0f - f));
                                i3 = i2;
                            }
                            int i29 = i2 + i3;
                            short[] e3 = e(this.l, this.m, i29);
                            this.l = e3;
                            System.arraycopy(sArr3, i28 * i11, e3, this.m * i11, i2 * i11);
                            c(i3, this.b, this.l, this.m + i2, sArr3, i28 + i2, sArr3, i28);
                            i4 = i28;
                            this.m += i29;
                            i5 = i3;
                        }
                    }
                    i14 = i4 + i5;
                    if (i14 + i13 <= i12) {
                    }
                }
                int i30 = this.k - i14;
                short[] sArr4 = this.j;
                System.arraycopy(sArr4, i14 * i11, sArr4, 0, i30 * i11);
                this.k = i30;
                if (f3 != f2 || this.m == i9) {
                }
                int i31 = (int) (i10 / f3);
                while (true) {
                    if (i31 <= 16384 && i10 <= 16384) {
                        break;
                    }
                    i31 /= 2;
                    i10 /= 2;
                }
                int i32 = this.m - i9;
                short[] e4 = e(this.n, this.o, i32);
                this.n = e4;
                System.arraycopy(this.l, i9 * i11, e4, this.o * i11, i32 * i11);
                this.m = i9;
                this.o += i32;
                int i33 = 0;
                while (true) {
                    int i34 = this.o;
                    int i35 = i34 - 1;
                    if (i33 >= i35) {
                        if (i35 == 0) {
                            return;
                        }
                        short[] sArr5 = this.n;
                        System.arraycopy(sArr5, i35 * i11, sArr5, 0, (i34 - i35) * i11);
                        this.o -= i35;
                        return;
                    }
                    while (true) {
                        i7 = this.p + 1;
                        int i36 = i7 * i31;
                        i8 = this.q;
                        if (i36 <= i8 * i10) {
                            break;
                        }
                        this.l = e(this.l, this.m, 1);
                        for (int i37 = 0; i37 < i11; i37++) {
                            short[] sArr6 = this.l;
                            int i38 = (this.m * i11) + i37;
                            short[] sArr7 = this.n;
                            int i39 = (i33 * i11) + i37;
                            short s = sArr7[i39];
                            short s2 = sArr7[i39 + i11];
                            int i40 = this.q * i10;
                            int i41 = this.p;
                            int i42 = i41 * i31;
                            int i43 = (i41 + 1) * i31;
                            int i44 = i43 - i40;
                            int i45 = i43 - i42;
                            sArr6[i38] = (short) ((((i45 - i44) * s2) + (s * i44)) / i45);
                        }
                        this.q++;
                        this.m++;
                    }
                    this.p = i7;
                    if (i7 == i10) {
                        this.p = 0;
                        if (i8 != i31) {
                            ny61.k();
                            return;
                        }
                        this.q = 0;
                    }
                    i33++;
                }
            }
        } else {
            short[] sArr8 = this.j;
            int i46 = this.k;
            short[] e5 = e(this.l, i9, i46);
            this.l = e5;
            System.arraycopy(sArr8, 0, e5, this.m * i11, i46 * i11);
            this.m += i46;
            this.k = 0;
        }
        f3 = f7;
        f2 = 1.0f;
        if (f3 != f2) {
        }
    }

    public final void d(short[] sArr, int i, int i2) {
        int i3 = this.h / i2;
        int i4 = this.b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[b64.b(i7, i5, i6, i9)];
            }
            this.i[i7] = (short) (i8 / i5);
        }
    }

    public final short[] e(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }
}
