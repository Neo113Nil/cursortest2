package yads;

import java.util.Arrays;
import xsna.uf3;

/* loaded from: classes10.dex */
public abstract class ez1 {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object c = new Object();
    public static int[] d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static dz1 b(byte[] bArr, int i, int i2) {
        int d2;
        boolean c2;
        lc2 lc2Var;
        int i3;
        int i4;
        boolean z;
        boolean c3;
        int i5;
        int i6;
        float f;
        int b2;
        int i7;
        lc2 lc2Var2 = new lc2(bArr, i + 1, i2);
        int b3 = lc2Var2.b(8);
        int b4 = lc2Var2.b(8);
        int b5 = lc2Var2.b(8);
        int d3 = lc2Var2.d();
        if (b3 == 100 || b3 == 110 || b3 == 122 || b3 == 244 || b3 == 44 || b3 == 83 || b3 == 86 || b3 == 118 || b3 == 128 || b3 == 138) {
            d2 = lc2Var2.d();
            c2 = d2 == 3 ? lc2Var2.c() : false;
            lc2Var2.d();
            lc2Var2.d();
            lc2Var2.f();
            if (lc2Var2.c()) {
                int i8 = d2 != 3 ? 8 : 12;
                int i9 = 0;
                while (i9 < i8) {
                    if (lc2Var2.c()) {
                        int i10 = i9 < 6 ? 16 : 64;
                        int i11 = 8;
                        int i12 = 8;
                        for (int i13 = 0; i13 < i10; i13++) {
                            if (i11 != 0) {
                                i11 = ((lc2Var2.e() + i12) + 256) % 256;
                            }
                            if (i11 != 0) {
                                i12 = i11;
                            }
                        }
                    }
                    i9++;
                }
            }
        } else {
            d2 = 1;
            c2 = false;
        }
        int d4 = lc2Var2.d() + 4;
        int d5 = lc2Var2.d();
        if (d5 == 0) {
            i4 = lc2Var2.d() + 4;
            lc2Var = lc2Var2;
            i3 = 16;
        } else {
            if (d5 == 1) {
                boolean c4 = lc2Var2.c();
                lc2Var2.e();
                lc2Var2.e();
                i3 = 16;
                long d6 = lc2Var2.d();
                lc2Var = lc2Var2;
                for (int i14 = 0; i14 < d6; i14++) {
                    lc2Var.d();
                }
                z = c4;
                i4 = 0;
                lc2Var.d();
                lc2Var.f();
                int d7 = lc2Var.d() + 1;
                int d8 = lc2Var.d() + 1;
                c3 = lc2Var.c();
                int i15 = 2 - (c3 ? 1 : 0);
                int i16 = d8 * i15;
                if (!c3) {
                    lc2Var.f();
                }
                lc2Var.f();
                int i17 = d7 * 16;
                int i18 = i16 * 16;
                if (lc2Var.c()) {
                    i5 = b3;
                    i6 = b4;
                } else {
                    int d9 = lc2Var.d();
                    int d10 = lc2Var.d();
                    int d11 = lc2Var.d();
                    i5 = b3;
                    int d12 = lc2Var.d();
                    if (d2 == 0) {
                        i6 = b4;
                        i7 = 1;
                    } else {
                        i6 = b4;
                        int i19 = d2 == 3 ? 1 : 2;
                        i15 *= d2 != 1 ? 1 : 2;
                        i7 = i19;
                    }
                    int i20 = i15;
                    i17 = uf3.a(d9, d10, i7, i17);
                    i18 = uf3.a(d11, d12, i20, i18);
                }
                int i21 = i17;
                if (lc2Var.c() && lc2Var.c()) {
                    b2 = lc2Var.b(8);
                    if (b2 != 255) {
                        int i22 = i3;
                        int b6 = lc2Var.b(i22);
                        int b7 = lc2Var.b(i22);
                        if (b6 != 0 && b7 != 0) {
                            f = b6 / b7;
                        }
                    } else {
                        float[] fArr = b;
                        if (b2 < 17) {
                            f = fArr[b2];
                        } else {
                            lg1.a("Unexpected aspect_ratio_idc value: ", b2, "NalUnitUtil");
                        }
                    }
                    return new dz1(i5, i6, b5, d3, i21, i18, f, c2, c3, d4, d5, i4, z);
                }
                f = 1.0f;
                return new dz1(i5, i6, b5, d3, i21, i18, f, c2, c3, d4, d5, i4, z);
            }
            lc2Var = lc2Var2;
            i3 = 16;
            i4 = 0;
        }
        z = false;
        lc2Var.d();
        lc2Var.f();
        int d72 = lc2Var.d() + 1;
        int d82 = lc2Var.d() + 1;
        c3 = lc2Var.c();
        int i152 = 2 - (c3 ? 1 : 0);
        int i162 = d82 * i152;
        if (!c3) {
        }
        lc2Var.f();
        int i172 = d72 * 16;
        int i182 = i162 * 16;
        if (lc2Var.c()) {
        }
        int i212 = i172;
        if (lc2Var.c()) {
            b2 = lc2Var.b(8);
            if (b2 != 255) {
            }
            return new dz1(i5, i6, b5, d3, i212, i182, f, c2, c3, d4, d5, i4, z);
        }
        f = 1.0f;
        return new dz1(i5, i6, b5, d3, i212, i182, f, c2, c3, d4, d5, i4, z);
    }

    public static int a(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalStateException();
        }
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            a(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            a(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            a(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b2 = bArr[i5];
            if ((b2 & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b2 == 1) {
                    a(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static bz1 a(byte[] bArr, int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        int i7 = 2;
        lc2 lc2Var = new lc2(bArr, i + 2, i2);
        lc2Var.d(4);
        int b2 = lc2Var.b(3);
        lc2Var.f();
        int b3 = lc2Var.b(2);
        boolean c2 = lc2Var.c();
        int b4 = lc2Var.b(5);
        int i8 = 0;
        int i9 = 0;
        while (true) {
            z = true;
            if (i8 >= 32) {
                break;
            }
            if (lc2Var.c()) {
                i9 |= 1 << i8;
            }
            i8++;
        }
        int[] iArr = new int[6];
        for (int i10 = 0; i10 < 6; i10++) {
            iArr[i10] = lc2Var.b(8);
        }
        int i11 = i9;
        int b5 = lc2Var.b(8);
        int i12 = 0;
        for (int i13 = 0; i13 < b2; i13++) {
            if (lc2Var.c()) {
                i12 += 89;
            }
            if (lc2Var.c()) {
                i12 += 8;
            }
        }
        lc2Var.d(i12);
        if (b2 > 0) {
            lc2Var.d((8 - b2) * 2);
        }
        lc2Var.d();
        int d2 = lc2Var.d();
        if (d2 == 3) {
            lc2Var.f();
        }
        int d3 = lc2Var.d();
        int d4 = lc2Var.d();
        if (lc2Var.c()) {
            int d5 = lc2Var.d();
            int d6 = lc2Var.d();
            int d7 = lc2Var.d();
            i3 = b3;
            int d8 = lc2Var.d();
            if (d2 != 1 && d2 != 2) {
                i7 = 1;
            }
            int i14 = d2 == 1 ? 2 : 1;
            d3 = uf3.a(d5, d6, i7, d3);
            d4 = uf3.a(d7, d8, i14, d4);
        } else {
            i3 = b3;
        }
        lc2Var.d();
        lc2Var.d();
        int d9 = lc2Var.d();
        for (int i15 = lc2Var.c() ? 0 : b2; i15 <= b2; i15++) {
            lc2Var.d();
            lc2Var.d();
            lc2Var.d();
        }
        lc2Var.d();
        lc2Var.d();
        lc2Var.d();
        lc2Var.d();
        lc2Var.d();
        lc2Var.d();
        if (lc2Var.c() && lc2Var.c()) {
            int i16 = 0;
            while (true) {
                int i17 = 4;
                if (i16 >= 4) {
                    break;
                }
                int i18 = 0;
                while (i18 < 6) {
                    if (!lc2Var.c()) {
                        lc2Var.d();
                    } else {
                        int min = Math.min(64, 1 << ((i16 << 1) + i17));
                        if (i16 > 1) {
                            lc2Var.e();
                        }
                        for (int i19 = 0; i19 < min; i19++) {
                            lc2Var.e();
                        }
                    }
                    i18 += i16 == 3 ? 3 : 1;
                    i17 = 4;
                }
                i16++;
            }
        }
        lc2Var.d(2);
        if (lc2Var.c()) {
            lc2Var.d(8);
            lc2Var.d();
            lc2Var.d();
            lc2Var.f();
        }
        int d10 = lc2Var.d();
        int i20 = 0;
        int[] iArr2 = new int[0];
        int[] iArr3 = new int[0];
        int i21 = -1;
        int i22 = -1;
        while (i20 < d10) {
            if (i20 != 0 && lc2Var.c()) {
                z2 = z;
                int i23 = i21 + i22;
                int d11 = (1 - ((lc2Var.c() ? 1 : 0) * 2)) * (lc2Var.d() + 1);
                i4 = d9;
                int i24 = i23 + 1;
                i5 = d10;
                boolean[] zArr = new boolean[i24];
                for (int i25 = 0; i25 <= i23; i25++) {
                    if (!lc2Var.c()) {
                        zArr[i25] = lc2Var.c();
                    } else {
                        zArr[i25] = z2;
                    }
                }
                int[] iArr4 = new int[i24];
                int[] iArr5 = new int[i24];
                int i26 = 0;
                for (int i27 = i22 - 1; i27 >= 0; i27--) {
                    int i28 = iArr3[i27] + d11;
                    if (i28 < 0 && zArr[i21 + i27]) {
                        iArr4[i26] = i28;
                        i26++;
                    }
                }
                if (d11 < 0 && zArr[i23]) {
                    iArr4[i26] = d11;
                    i26++;
                }
                i6 = i20;
                int i29 = i26;
                int[] iArr6 = iArr2;
                for (int i30 = 0; i30 < i21; i30++) {
                    int i31 = iArr6[i30] + d11;
                    if (i31 < 0 && zArr[i30]) {
                        iArr4[i29] = i31;
                        i29++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr4, i29);
                int i32 = 0;
                for (int i33 = i21 - 1; i33 >= 0; i33--) {
                    int i34 = iArr6[i33] + d11;
                    if (i34 > 0 && zArr[i33]) {
                        iArr5[i32] = i34;
                        i32++;
                    }
                }
                if (d11 > 0 && zArr[i23]) {
                    iArr5[i32] = d11;
                    i32++;
                }
                int i35 = i32;
                for (int i36 = 0; i36 < i22; i36++) {
                    int i37 = iArr3[i36] + d11;
                    if (i37 > 0 && zArr[i21 + i36]) {
                        iArr5[i35] = i37;
                        i35++;
                    }
                }
                iArr3 = Arrays.copyOf(iArr5, i35);
                i21 = i29;
                i22 = i35;
                iArr2 = copyOf;
            } else {
                i4 = d9;
                i5 = d10;
                i6 = i20;
                z2 = z;
                int d12 = lc2Var.d();
                int d13 = lc2Var.d();
                int[] iArr7 = new int[d12];
                for (int i38 = 0; i38 < d12; i38++) {
                    iArr7[i38] = lc2Var.d() + 1;
                    lc2Var.f();
                }
                int[] iArr8 = new int[d13];
                for (int i39 = 0; i39 < d13; i39++) {
                    iArr8[i39] = lc2Var.d() + 1;
                    lc2Var.f();
                }
                i21 = d12;
                i22 = d13;
                iArr3 = iArr8;
                iArr2 = iArr7;
            }
            i20 = i6 + 1;
            z = z2;
            d9 = i4;
            d10 = i5;
        }
        int i40 = d9;
        if (lc2Var.c()) {
            for (int i41 = 0; i41 < lc2Var.d(); i41++) {
                lc2Var.d(i40 + 5);
            }
        }
        lc2Var.d(2);
        float f = 1.0f;
        if (lc2Var.c()) {
            if (lc2Var.c()) {
                int b6 = lc2Var.b(8);
                if (b6 == 255) {
                    int b7 = lc2Var.b(16);
                    int b8 = lc2Var.b(16);
                    if (b7 != 0 && b8 != 0) {
                        f = b7 / b8;
                    }
                } else {
                    float[] fArr = b;
                    if (b6 < 17) {
                        f = fArr[b6];
                    } else {
                        lg1.a("Unexpected aspect_ratio_idc value: ", b6, "NalUnitUtil");
                    }
                }
            }
            if (lc2Var.c()) {
                lc2Var.f();
            }
            if (lc2Var.c()) {
                lc2Var.d(4);
                if (lc2Var.c()) {
                    lc2Var.d(24);
                }
            }
            if (lc2Var.c()) {
                lc2Var.d();
                lc2Var.d();
            }
            lc2Var.f();
            if (lc2Var.c()) {
                d4 *= 2;
            }
        }
        return new bz1(i3, c2, b4, i11, iArr, b5, d3, d4, f);
    }

    public static int a(int i, byte[] bArr) {
        int i2;
        synchronized (c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = d;
                    if (iArr.length <= i4) {
                        d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }
}
