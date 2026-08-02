package yads;

import java.util.Arrays;
import xsna.rqi;

/* loaded from: classes10.dex */
public final class g33 {
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

    public g33(int i, int i2, float f, float f2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i / i3;
        this.f = i / 400;
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

    public final void a(short[] sArr, int i, int i2) {
        int i3 = this.h / i2;
        int i4 = this.b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[rqi.a(i7, i5, i6, i9)];
            }
            this.i[i7] = (short) (i8 / i5);
        }
    }

    public final short[] b(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
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

    public static void a(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
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

    /* JADX WARN: Removed duplicated region for block: B:59:0x0262 A[LOOP:4: B:53:0x004c->B:59:0x0262, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018f A[EDGE_INSN: B:60:0x018f->B:61:0x018f BREAK  A[LOOP:4: B:53:0x004c->B:59:0x0262], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        float f;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.m;
        float f2 = this.c;
        float f3 = this.d;
        float f4 = f2 / f3;
        float f5 = this.e * f3;
        double d = f4;
        int i10 = 1;
        if (d <= 1.00001d && d >= 0.99999d) {
            short[] sArr = this.j;
            int i11 = this.k;
            short[] b = b(this.l, i9, i11);
            this.l = b;
            int i12 = this.b;
            System.arraycopy(sArr, 0, b, this.m * i12, i12 * i11);
            this.m += i11;
            this.k = 0;
        } else {
            int i13 = this.k;
            if (i13 >= this.h) {
                int i14 = 0;
                while (true) {
                    int i15 = this.r;
                    if (i15 > 0) {
                        i2 = Math.min(this.h, i15);
                        short[] sArr2 = this.j;
                        short[] b2 = b(this.l, this.m, i2);
                        this.l = b2;
                        int i16 = this.b;
                        f = 1.0f;
                        System.arraycopy(sArr2, i14 * i16, b2, this.m * i16, i16 * i2);
                        this.m += i2;
                        this.r -= i2;
                        i3 = i10;
                        i4 = i14;
                    } else {
                        f = 1.0f;
                        short[] sArr3 = this.j;
                        int i17 = this.a;
                        int i18 = i17 > 4000 ? i17 / 4000 : i10;
                        if (this.b == i10 && i18 == i10) {
                            i = a(sArr3, i14, this.f, this.g);
                        } else {
                            a(sArr3, i14, i18);
                            int a = a(this.i, 0, this.f / i18, this.g / i18);
                            if (i18 != i10) {
                                int i19 = a * i18;
                                int i20 = i18 * 4;
                                int i21 = i19 - i20;
                                int i22 = i19 + i20;
                                int i23 = this.f;
                                if (i21 < i23) {
                                    i21 = i23;
                                }
                                int i24 = this.g;
                                if (i22 > i24) {
                                    i22 = i24;
                                }
                                if (this.b == i10) {
                                    i = a(sArr3, i14, i21, i22);
                                } else {
                                    a(sArr3, i14, i10);
                                    i = a(this.i, 0, i21, i22);
                                }
                            } else {
                                i = a;
                            }
                        }
                        int i25 = this.u;
                        int i26 = (i25 == 0 || (i6 = this.s) == 0 || this.v > i25 * 3 || i25 * 2 <= this.t * 3) ? i : i6;
                        this.t = i25;
                        this.s = i;
                        if (d > 1.0d) {
                            short[] sArr4 = this.j;
                            if (f4 >= 2.0f) {
                                i5 = (int) (i26 / (f4 - 1.0f));
                            } else {
                                this.r = (int) (((2.0f - f4) * i26) / (f4 - 1.0f));
                                i5 = i26;
                            }
                            short[] b3 = b(this.l, this.m, i5);
                            this.l = b3;
                            int i27 = i26;
                            int i28 = i14;
                            a(i5, this.b, b3, this.m, sArr4, i28, sArr4, i14 + i27);
                            this.m += i5;
                            i3 = i10;
                            i14 = i27 + i5 + i28;
                            if (this.h + i14 <= i13) {
                                break;
                            } else {
                                i10 = i3;
                            }
                        } else {
                            int i29 = i14;
                            int i30 = i26;
                            short[] sArr5 = this.j;
                            if (f4 < 0.5f) {
                                i2 = (int) ((i30 * f4) / (1.0f - f4));
                            } else {
                                this.r = (int) ((((2.0f * f4) - 1.0f) * i30) / (1.0f - f4));
                                i2 = i30;
                            }
                            int i31 = i30 + i2;
                            short[] b4 = b(this.l, this.m, i31);
                            this.l = b4;
                            int i32 = this.b;
                            i3 = i10;
                            System.arraycopy(sArr5, i29 * i32, b4, this.m * i32, i32 * i30);
                            a(i2, this.b, this.l, this.m + i30, sArr5, i29 + i30, sArr5, i29);
                            i4 = i29;
                            this.m += i31;
                        }
                    }
                    i14 = i4 + i2;
                    if (this.h + i14 <= i13) {
                    }
                }
                int i33 = this.k - i14;
                short[] sArr6 = this.j;
                int i34 = this.b;
                System.arraycopy(sArr6, i14 * i34, sArr6, 0, i34 * i33);
                this.k = i33;
                if (f5 != f || this.m == i9) {
                }
                int i35 = this.a;
                int i36 = (int) (i35 / f5);
                while (true) {
                    if (i36 <= 16384 && i35 <= 16384) {
                        break;
                    }
                    i36 /= 2;
                    i35 /= 2;
                }
                int i37 = this.m - i9;
                short[] b5 = b(this.n, this.o, i37);
                this.n = b5;
                short[] sArr7 = this.l;
                int i38 = this.b;
                System.arraycopy(sArr7, i9 * i38, b5, this.o * i38, i38 * i37);
                this.m = i9;
                this.o += i37;
                int i39 = 0;
                while (true) {
                    int i40 = this.o;
                    int i41 = i40 - 1;
                    if (i39 >= i41) {
                        if (i41 == 0) {
                            return;
                        }
                        short[] sArr8 = this.n;
                        int i42 = this.b;
                        System.arraycopy(sArr8, i41 * i42, sArr8, 0, (i40 - i41) * i42);
                        this.o -= i41;
                        return;
                    }
                    while (true) {
                        i7 = this.p + 1;
                        int i43 = i7 * i36;
                        i8 = this.q;
                        if (i43 <= i8 * i35) {
                            break;
                        }
                        this.l = b(this.l, this.m, i3);
                        int i44 = 0;
                        while (true) {
                            int i45 = this.b;
                            if (i44 < i45) {
                                short[] sArr9 = this.l;
                                int i46 = (this.m * i45) + i44;
                                short[] sArr10 = this.n;
                                int i47 = (i39 * i45) + i44;
                                short s = sArr10[i47];
                                short s2 = sArr10[i47 + i45];
                                int i48 = this.q * i35;
                                int i49 = this.p;
                                int i50 = i49 * i36;
                                int i51 = (i49 + 1) * i36;
                                int i52 = i51 - i48;
                                int i53 = i51 - i50;
                                sArr9[i46] = (short) ((((i53 - i52) * s2) + (s * i52)) / i53);
                                i44++;
                            }
                        }
                        i3 = 1;
                        this.q++;
                        this.m++;
                    }
                    this.p = i7;
                    if (i7 == i35) {
                        this.p = 0;
                        if (i8 == i36) {
                            this.q = 0;
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    i39++;
                }
            }
        }
        i3 = 1;
        f = 1.0f;
        if (f5 != f) {
        }
    }
}
