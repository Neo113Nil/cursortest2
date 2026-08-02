package defpackage;

import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: classes10.dex */
public abstract class l150 {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object c = new Object();
    public static int[] d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        d6z.x(i3 >= 0);
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

    public static boolean c(byte[] bArr, int i, a aVar) {
        int i2;
        if (Objects.equals(aVar.n, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) == 0 && ((i2 = b2 & 31) == 1 || i2 == 9 || i2 == 14)) {
                return false;
            }
        } else if (Objects.equals(aVar.n, "video/hevc")) {
            kb e = e(new a69(4, i + 4, 1, bArr));
            int i3 = e.a;
            if (i3 == 35) {
                return false;
            }
            if (i3 <= 14 && i3 % 2 == 0 && e.c == aVar.C - 1) {
                return false;
            }
        }
        return true;
    }

    public static int d(a aVar) {
        if (Objects.equals(aVar.n, "video/avc")) {
            return 1;
        }
        return (Objects.equals(aVar.n, "video/hevc") || eh20.c(aVar.k, "video/hevc") != null) ? 2 : 0;
    }

    public static kb e(a69 a69Var) {
        a69Var.t();
        return new kb(a69Var.p(6), a69Var.p(6), a69Var.p(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e150 f(a69 a69Var, boolean z, int i, e150 e150Var) {
        int[] iArr;
        int i2;
        boolean z2;
        int i3;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int[] iArr2 = new int[6];
        if (z) {
            int p = a69Var.p(2);
            z3 = a69Var.o();
            i5 = a69Var.p(5);
            i6 = 0;
            for (int i7 = 0; i7 < 32; i7++) {
                if (a69Var.o()) {
                    i6 |= 1 << i7;
                }
            }
            for (int i8 = 0; i8 < 6; i8++) {
                iArr2[i8] = a69Var.p(8);
            }
            i2 = p;
        } else {
            if (e150Var == null) {
                iArr = iArr2;
                i2 = 0;
                z2 = false;
                i3 = 0;
                i4 = 0;
                int p2 = a69Var.p(8);
                int i9 = 0;
                for (int i10 = 0; i10 < i; i10++) {
                    if (a69Var.o()) {
                        i9 += 88;
                    }
                    if (a69Var.o()) {
                        i9 += 8;
                    }
                }
                a69Var.u(i9);
                if (i > 0) {
                    a69Var.u((8 - i) * 2);
                }
                return new e150(i2, z2, i3, i4, iArr, p2);
            }
            int i11 = e150Var.a;
            z3 = e150Var.b;
            i5 = e150Var.c;
            i6 = e150Var.d;
            iArr2 = e150Var.e;
            i2 = i11;
        }
        iArr = iArr2;
        z2 = z3;
        i3 = i5;
        i4 = i6;
        int p22 = a69Var.p(8);
        int i92 = 0;
        while (i10 < i) {
        }
        a69Var.u(i92);
        if (i > 0) {
        }
        return new e150(i2, z2, i3, i4, iArr, p22);
    }

    public static dn60 g(int i, int i2, byte[] bArr) {
        byte b2;
        int i3 = i + 2;
        int i4 = i2 - 1;
        while (true) {
            b2 = bArr[i4];
            if (b2 != 0 || i4 <= i3) {
                break;
            }
            i4--;
        }
        if (b2 == 0 || i4 <= i3) {
            return null;
        }
        a69 a69Var = new a69(i3, i4 + 1, 1, bArr);
        while (a69Var.i(16)) {
            int p = a69Var.p(8);
            byte b3 = 0;
            int i5 = 0;
            while (p == 255) {
                i5 += 255;
                p = a69Var.p(8);
            }
            int i6 = i5 + p;
            int p2 = a69Var.p(8);
            int i7 = 0;
            while (p2 == 255) {
                i7 += 255;
                p2 = a69Var.p(8);
            }
            int i8 = i7 + p2;
            if (i8 == 0 || !a69Var.i(i8)) {
                return null;
            }
            if (i6 == 176) {
                int q = a69Var.q();
                boolean o = a69Var.o();
                int q2 = o ? a69Var.q() : 0;
                int q3 = a69Var.q();
                int i9 = -1;
                int i10 = 0;
                while (true) {
                    int i11 = 6;
                    if (i10 > q3) {
                        return new dn60(i9, i11, b3);
                    }
                    i9 = a69Var.q();
                    a69Var.q();
                    int p3 = a69Var.p(6);
                    if (p3 == 63) {
                        return null;
                    }
                    a69Var.p(p3 == 0 ? Math.max(0, q - 30) : Math.max(0, (p3 + q) - 31));
                    if (o) {
                        int p4 = a69Var.p(6);
                        if (p4 == 63) {
                            return null;
                        }
                        a69Var.p(p4 == 0 ? Math.max(0, q2 - 30) : Math.max(0, (p4 + q2) - 31));
                    }
                    if (a69Var.o()) {
                        a69Var.u(10);
                    }
                    i10++;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static h150 h(byte[] bArr, int i, int i2, dt20 dt20Var) {
        int i3;
        int i4;
        int i5;
        int q;
        int q2;
        int i6;
        int q3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        f150 f150Var;
        int i19;
        int i20;
        int i21;
        at20 at20Var;
        kb e = e(new a69(i, i2, 1, bArr));
        a69 a69Var = new a69(i + 2, i2, 1, bArr);
        int i22 = 4;
        a69Var.u(4);
        int p = a69Var.p(3);
        int i23 = e.b;
        boolean z = i23 != 0 && p == 7;
        if (dt20Var != null) {
            ImmutableList immutableList = (ImmutableList) dt20Var.b;
            if (!immutableList.isEmpty()) {
                i3 = ((d150) immutableList.get(Math.min(i23, immutableList.size() - 1))).a;
                e150 e150Var = null;
                if (z) {
                    a69Var.t();
                    e150Var = f(a69Var, true, p, null);
                } else if (dt20Var != null) {
                    f150 f150Var2 = (f150) dt20Var.c;
                    int[] iArr = f150Var2.b;
                    ImmutableList immutableList2 = f150Var2.a;
                    int i24 = iArr[i3];
                    if (immutableList2.size() > i24) {
                        e150Var = (e150) immutableList2.get(i24);
                    }
                }
                a69Var.q();
                if (z) {
                    int q4 = a69Var.q();
                    if (q4 == 3) {
                        a69Var.t();
                    }
                    int q5 = a69Var.q();
                    int q6 = a69Var.q();
                    if (a69Var.o()) {
                        int q7 = a69Var.q();
                        int q8 = a69Var.q();
                        int q9 = a69Var.q();
                        int q10 = a69Var.q();
                        q5 -= (q7 + q8) * ((q4 == 1 || q4 == 2) ? 2 : 1);
                        q6 -= (q9 + q10) * (q4 == 1 ? 2 : 1);
                    }
                    i4 = q6;
                    i5 = q5;
                    q = a69Var.q();
                    q2 = a69Var.q();
                } else {
                    int p2 = a69Var.o() ? a69Var.p(8) : -1;
                    if (dt20Var != null && (at20Var = (at20) dt20Var.w) != null) {
                        ImmutableList immutableList3 = (ImmutableList) at20Var.a;
                        if (p2 == -1) {
                            p2 = ((int[]) at20Var.b)[i3];
                        }
                        if (p2 != -1 && immutableList3.size() > p2) {
                            g150 g150Var = (g150) immutableList3.get(p2);
                            int i25 = g150Var.a;
                            i5 = g150Var.d;
                            i4 = g150Var.e;
                            q = g150Var.b;
                            q2 = g150Var.c;
                        }
                    }
                    q = 0;
                    q2 = 0;
                    i5 = 0;
                    i4 = 0;
                }
                int q11 = a69Var.q();
                if (z) {
                    i6 = -1;
                    for (int i26 = a69Var.o() ? 0 : p; i26 <= p; i26++) {
                        a69Var.q();
                        i6 = Math.max(a69Var.q(), i6);
                        a69Var.q();
                    }
                } else {
                    i6 = -1;
                }
                a69Var.q();
                a69Var.q();
                a69Var.q();
                a69Var.q();
                a69Var.q();
                a69Var.q();
                if (a69Var.o()) {
                    int i27 = 6;
                    if (z ? a69Var.o() : false) {
                        a69Var.u(6);
                    } else if (a69Var.o()) {
                        int i28 = 0;
                        while (i28 < i22) {
                            int i29 = 0;
                            while (i29 < i27) {
                                if (a69Var.o()) {
                                    int min = Math.min(64, 1 << ((i28 << 1) + 4));
                                    if (i28 > 1) {
                                        a69Var.r();
                                    }
                                    for (int i30 = 0; i30 < min; i30++) {
                                        a69Var.r();
                                    }
                                } else {
                                    a69Var.q();
                                }
                                i29 += i28 == 3 ? 3 : 1;
                                i27 = 6;
                            }
                            i28++;
                            i22 = 4;
                            i27 = 6;
                        }
                    }
                }
                a69Var.u(2);
                if (a69Var.o()) {
                    a69Var.u(8);
                    a69Var.q();
                    a69Var.q();
                    a69Var.t();
                }
                q3 = a69Var.q();
                i7 = 0;
                int[] iArr2 = new int[0];
                int[] iArr3 = new int[0];
                int i31 = -1;
                int i32 = -1;
                while (i7 < q3) {
                    if (i7 == 0 || !a69Var.o()) {
                        i19 = q3;
                        i20 = i3;
                        i21 = i7;
                        int q12 = a69Var.q();
                        i31 = a69Var.q();
                        int[] iArr4 = new int[q12];
                        int i33 = 0;
                        while (i33 < q12) {
                            iArr4[i33] = (i33 > 0 ? iArr4[i33 - 1] : 0) - (a69Var.q() + 1);
                            a69Var.t();
                            i33++;
                        }
                        int[] iArr5 = new int[i31];
                        int i34 = 0;
                        while (i34 < i31) {
                            iArr5[i34] = a69Var.q() + 1 + (i34 > 0 ? iArr5[i34 - 1] : 0);
                            a69Var.t();
                            i34++;
                        }
                        i32 = q12;
                        iArr2 = iArr4;
                        iArr3 = iArr5;
                    } else {
                        i19 = q3;
                        int i35 = i32 + i31;
                        int q13 = (1 - ((a69Var.o() ? 1 : 0) * 2)) * (a69Var.q() + 1);
                        i20 = i3;
                        int i36 = i35 + 1;
                        i21 = i7;
                        boolean[] zArr = new boolean[i36];
                        for (int i37 = 0; i37 <= i35; i37++) {
                            if (a69Var.o()) {
                                zArr[i37] = true;
                            } else {
                                zArr[i37] = a69Var.o();
                            }
                        }
                        int[] iArr6 = new int[i36];
                        int[] iArr7 = new int[i36];
                        int i38 = 0;
                        for (int i39 = i31 - 1; i39 >= 0; i39--) {
                            int i40 = iArr3[i39] + q13;
                            if (i40 < 0 && zArr[i32 + i39]) {
                                iArr6[i38] = i40;
                                i38++;
                            }
                        }
                        if (q13 < 0 && zArr[i35]) {
                            iArr6[i38] = q13;
                            i38++;
                        }
                        int i41 = i38;
                        int[] iArr8 = iArr2;
                        for (int i42 = 0; i42 < i32; i42++) {
                            int i43 = iArr8[i42] + q13;
                            if (i43 < 0 && zArr[i42]) {
                                iArr6[i41] = i43;
                                i41++;
                            }
                        }
                        int[] copyOf = Arrays.copyOf(iArr6, i41);
                        int i44 = 0;
                        for (int i45 = i32 - 1; i45 >= 0; i45--) {
                            int i46 = iArr8[i45] + q13;
                            if (i46 > 0 && zArr[i45]) {
                                iArr7[i44] = i46;
                                i44++;
                            }
                        }
                        if (q13 > 0 && zArr[i35]) {
                            iArr7[i44] = q13;
                            i44++;
                        }
                        int i47 = i41;
                        int i48 = i44;
                        for (int i49 = 0; i49 < i31; i49++) {
                            int i50 = iArr3[i49] + q13;
                            if (i50 > 0 && zArr[i32 + i49]) {
                                iArr7[i48] = i50;
                                i48++;
                            }
                        }
                        iArr3 = Arrays.copyOf(iArr7, i48);
                        i31 = i48;
                        i32 = i47;
                        iArr2 = copyOf;
                    }
                    i7 = i21 + 1;
                    q3 = i19;
                    i3 = i20;
                }
                int i51 = i3;
                if (a69Var.o()) {
                    int q14 = a69Var.q();
                    for (int i52 = 0; i52 < q14; i52++) {
                        a69Var.u(q11 + 5);
                    }
                }
                a69Var.u(2);
                float f = 1.0f;
                if (a69Var.o()) {
                    i8 = i6;
                    i9 = q;
                    i10 = q2;
                    i11 = i5;
                    i12 = i4;
                    i13 = -1;
                    i14 = -1;
                    i15 = -1;
                } else {
                    if (a69Var.o()) {
                        int p3 = a69Var.p(8);
                        if (p3 == 255) {
                            int p4 = a69Var.p(16);
                            int p5 = a69Var.p(16);
                            if (p4 != 0 && p5 != 0) {
                                f = p4 / p5;
                            }
                        } else if (p3 < 17) {
                            f = b[p3];
                        } else {
                            xvz.v(p3, "Unexpected aspect_ratio_idc value: ");
                        }
                    }
                    if (a69Var.o()) {
                        a69Var.t();
                    }
                    if (a69Var.o()) {
                        a69Var.u(3);
                        i18 = a69Var.o() ? 1 : 2;
                        if (a69Var.o()) {
                            int p6 = a69Var.p(8);
                            int p7 = a69Var.p(8);
                            a69Var.u(8);
                            i16 = kfc.f(p6);
                            i17 = kfc.g(p7);
                        } else {
                            i16 = -1;
                            i17 = -1;
                        }
                    } else {
                        if (dt20Var != null && (f150Var = (f150) dt20Var.x) != null) {
                            ImmutableList immutableList4 = f150Var.a;
                            int i53 = f150Var.b[i51];
                            if (immutableList4.size() > i53) {
                                i150 i150Var = (i150) immutableList4.get(i53);
                                int i54 = i150Var.a;
                                int i55 = i150Var.b;
                                i17 = i150Var.c;
                                i16 = i54;
                                i18 = i55;
                            }
                        }
                        i16 = -1;
                        i17 = -1;
                        i18 = -1;
                    }
                    if (a69Var.o()) {
                        a69Var.q();
                        a69Var.q();
                    }
                    a69Var.t();
                    if (a69Var.o()) {
                        i4 *= 2;
                    }
                    i13 = i16;
                    i15 = i17;
                    i14 = i18;
                    i8 = i6;
                    i9 = q;
                    i10 = q2;
                    i11 = i5;
                    i12 = i4;
                }
                return new h150(p, e150Var, i9, i10, i11, i12, f, i8, i13, i14, i15);
            }
        }
        i3 = 0;
        e150 e150Var2 = null;
        if (z) {
        }
        a69Var.q();
        if (z) {
        }
        int q112 = a69Var.q();
        if (z) {
        }
        a69Var.q();
        a69Var.q();
        a69Var.q();
        a69Var.q();
        a69Var.q();
        a69Var.q();
        if (a69Var.o()) {
        }
        a69Var.u(2);
        if (a69Var.o()) {
        }
        q3 = a69Var.q();
        i7 = 0;
        int[] iArr22 = new int[0];
        int[] iArr32 = new int[0];
        int i312 = -1;
        int i322 = -1;
        while (i7 < q3) {
        }
        int i512 = i3;
        if (a69Var.o()) {
        }
        a69Var.u(2);
        float f2 = 1.0f;
        if (a69Var.o()) {
        }
        return new h150(p, e150Var2, i9, i10, i11, i12, f2, i8, i13, i14, i15);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static dt20 i(int i, int i2, byte[] bArr) {
        int[] iArr;
        int[] iArr2;
        f150 f150Var;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean[][] zArr;
        int i7;
        boolean[][] zArr2;
        int[] iArr3;
        int[] iArr4;
        int i8;
        int i9;
        boolean o;
        int i10;
        int i11;
        int i12;
        boolean o2;
        int[] iArr5;
        int i13;
        boolean z;
        boolean z2;
        a69 a69Var = new a69(i, i2, 1, bArr);
        e(a69Var);
        a69Var.u(4);
        boolean o3 = a69Var.o();
        boolean o4 = a69Var.o();
        int p = a69Var.p(6);
        int i14 = p + 1;
        int p2 = a69Var.p(3);
        a69Var.u(17);
        e150 f = f(a69Var, true, p2, null);
        for (int i15 = a69Var.o() ? 0 : p2; i15 <= p2; i15++) {
            a69Var.q();
            a69Var.q();
            a69Var.q();
        }
        int p3 = a69Var.p(6);
        int q = a69Var.q() + 1;
        int i16 = 6;
        f150 f150Var2 = new f150(ImmutableList.r(f), new int[1], 0);
        boolean z3 = i14 >= 2 && q >= 2;
        boolean z4 = o3 && o4;
        int i17 = p3 + 1;
        boolean z5 = i17 >= i14;
        if (!z3 || !z4 || !z5) {
            return new dt20((List) null, f150Var2, (at20) null, (f150) null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr6 = (int[][]) Array.newInstance((Class<?>) cls, q, i17);
        int i18 = 1;
        int[] iArr7 = new int[q];
        int[] iArr8 = new int[q];
        iArr6[0][0] = 0;
        iArr7[0] = 1;
        iArr8[0] = 0;
        for (int i19 = 1; i19 < q; i19++) {
            int i20 = 0;
            for (int i21 = 0; i21 <= p3; i21++) {
                if (a69Var.o()) {
                    iArr6[i19][i20] = i21;
                    iArr8[i19] = i21;
                    i20++;
                }
                iArr7[i19] = i20;
            }
        }
        if (a69Var.o()) {
            a69Var.u(64);
            if (a69Var.o()) {
                a69Var.q();
            }
            int q2 = a69Var.q();
            int i22 = 0;
            while (i22 < q2) {
                a69Var.q();
                if (i22 == 0 || a69Var.o()) {
                    boolean o5 = a69Var.o();
                    boolean o6 = a69Var.o();
                    z2 = o5;
                    z = o6;
                    if (o5 || o6) {
                        o = a69Var.o();
                        if (o) {
                            a69Var.u(19);
                        }
                        a69Var.u(8);
                        if (o) {
                            a69Var.u(4);
                        }
                        a69Var.u(15);
                        i11 = o5;
                        i10 = o6;
                        i12 = 0;
                        while (i12 <= p2) {
                            boolean o7 = a69Var.o();
                            if (!o7) {
                                o7 = a69Var.o();
                            }
                            if (o7) {
                                a69Var.q();
                                o2 = false;
                            } else {
                                o2 = a69Var.o();
                            }
                            if (o2) {
                                iArr5 = iArr7;
                                i13 = 0;
                            } else {
                                iArr5 = iArr7;
                                i13 = a69Var.q();
                            }
                            int i23 = i22;
                            int i24 = i11 + i10;
                            int[][] iArr9 = iArr6;
                            int i25 = 0;
                            while (i25 < i24) {
                                int i26 = i24;
                                for (int i27 = 0; i27 <= i13; i27++) {
                                    a69Var.q();
                                    a69Var.q();
                                    if (o) {
                                        a69Var.q();
                                        a69Var.q();
                                    }
                                    a69Var.t();
                                }
                                i25++;
                                i24 = i26;
                            }
                            i12++;
                            iArr7 = iArr5;
                            i22 = i23;
                            iArr6 = iArr9;
                        }
                        i22++;
                    }
                } else {
                    z2 = false;
                    z = false;
                }
                o = false;
                i11 = z2;
                i10 = z;
                i12 = 0;
                while (i12 <= p2) {
                }
                i22++;
            }
        }
        int[] iArr10 = iArr7;
        int[][] iArr11 = iArr6;
        if (!a69Var.o()) {
            return new dt20((List) null, f150Var2, (at20) null, (f150) null);
        }
        int i28 = a69Var.e;
        if (i28 > 0) {
            a69Var.u(8 - i28);
        }
        e150 f2 = f(a69Var, false, p2, f);
        boolean o8 = a69Var.o();
        boolean[] zArr3 = new boolean[16];
        int i29 = 0;
        for (int i30 = 0; i30 < 16; i30++) {
            boolean o9 = a69Var.o();
            zArr3[i30] = o9;
            if (o9) {
                i29++;
            }
        }
        if (i29 == 0 || !zArr3[1]) {
            return new dt20((List) null, f150Var2, (at20) null, (f150) null);
        }
        int[] iArr12 = new int[i29];
        for (int i31 = 0; i31 < i29 - (o8 ? 1 : 0); i31++) {
            iArr12[i31] = a69Var.p(3);
        }
        int[] iArr13 = new int[i29 + 1];
        if (o8) {
            int i32 = 1;
            while (i32 < i29) {
                int[] iArr14 = iArr13;
                for (int i33 = 0; i33 < i32; i33++) {
                    iArr14[i32] = iArr12[i33] + 1 + iArr14[i32];
                }
                i32++;
                iArr13 = iArr14;
            }
            iArr = iArr13;
            iArr[i29] = 6;
        } else {
            iArr = iArr13;
        }
        int[][] iArr15 = (int[][]) Array.newInstance((Class<?>) cls, i14, i29);
        int[] iArr16 = new int[i14];
        iArr16[0] = 0;
        boolean o10 = a69Var.o();
        int i34 = 1;
        while (i34 < i14) {
            if (o10) {
                i9 = i34;
                iArr16[i9] = a69Var.p(i16);
            } else {
                i9 = i34;
                iArr16[i9] = i9;
            }
            if (o8) {
                for (int i35 = 0; i35 < i29; i35++) {
                    iArr15[i9][i35] = (iArr16[i9] & ((1 << iArr[r31]) - 1)) >> iArr[i35];
                }
            } else {
                int i36 = 0;
                while (i36 < i29) {
                    int i37 = i36;
                    iArr15[i9][i37] = a69Var.p(iArr12[i36] + 1);
                    i36 = i37 + 1;
                }
            }
            i34 = i9 + 1;
            i16 = 6;
        }
        int[] iArr17 = new int[i17];
        int i38 = 1;
        int i39 = 0;
        while (i39 < i14) {
            iArr17[iArr16[i39]] = -1;
            int[] iArr18 = iArr17;
            int i40 = 0;
            int i41 = 0;
            while (i40 < 16) {
                if (zArr3[i40]) {
                    if (i40 == i18) {
                        iArr18[iArr16[i39]] = iArr15[i39][i41];
                    }
                    i41++;
                }
                i40++;
                i18 = 1;
            }
            if (i39 > 0) {
                int i42 = 0;
                while (true) {
                    if (i42 >= i39) {
                        i38++;
                        break;
                    }
                    int i43 = i42;
                    if (iArr18[iArr16[i39]] == iArr18[iArr16[i42]]) {
                        break;
                    }
                    i42 = i43 + 1;
                }
            }
            i39++;
            iArr17 = iArr18;
            i18 = 1;
        }
        int[] iArr19 = iArr17;
        int p4 = a69Var.p(4);
        if (i38 < 2 || p4 == 0) {
            return new dt20((List) null, f150Var2, (at20) null, (f150) null);
        }
        int[] iArr20 = new int[i38];
        for (int i44 = 0; i44 < i38; i44++) {
            iArr20[i44] = a69Var.p(p4);
        }
        int[] iArr21 = new int[i17];
        for (int i45 = 0; i45 < i14; i45++) {
            iArr21[Math.min(iArr16[i45], p3)] = i45;
        }
        ImmutableList.a aVar = new ImmutableList.a();
        int i46 = 0;
        while (i46 <= p3) {
            int[] iArr22 = iArr21;
            int i47 = i38;
            int min = Math.min(iArr19[i46], i47 - 1);
            aVar.a(new d150(iArr22[i46], min >= 0 ? iArr20[min] : -1));
            i46++;
            iArr21 = iArr22;
            i38 = i47;
            iArr16 = iArr16;
        }
        int[] iArr23 = iArr16;
        ImmutableList g = aVar.g();
        if (((d150) g.get(0)).b == -1) {
            return new dt20((List) null, f150Var2, (at20) null, (f150) null);
        }
        int i48 = 1;
        while (true) {
            if (i48 > p3) {
                i48 = -1;
                break;
            }
            if (((d150) g.get(i48)).b != -1) {
                break;
            }
            i48++;
        }
        if (i48 == -1) {
            return new dt20((List) null, f150Var2, (at20) null, (f150) null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i14, i14);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i14, i14);
        for (int i49 = 1; i49 < i14; i49++) {
            for (int i50 = 0; i50 < i49; i50++) {
                boolean[] zArr6 = zArr4[i49];
                boolean[] zArr7 = zArr5[i49];
                boolean o11 = a69Var.o();
                zArr7[i50] = o11;
                zArr6[i50] = o11;
            }
        }
        for (int i51 = 1; i51 < i14; i51++) {
            int i52 = 0;
            while (i52 < p) {
                boolean[][] zArr8 = zArr4;
                int i53 = 0;
                while (true) {
                    if (i53 < i51) {
                        boolean[] zArr9 = zArr5[i51];
                        if (zArr9[i53] && zArr5[i53][i52]) {
                            zArr9[i52] = true;
                            break;
                        }
                        i53++;
                    }
                }
                i52++;
                zArr4 = zArr8;
            }
        }
        boolean[][] zArr10 = zArr4;
        int[] iArr24 = new int[i17];
        for (int i54 = 0; i54 < i14; i54++) {
            int i55 = 0;
            for (int i56 = 0; i56 < i54; i56++) {
                i55 += zArr10[i54][i56] ? 1 : 0;
            }
            iArr24[iArr23[i54]] = i55;
        }
        int i57 = 0;
        for (int i58 = 0; i58 < i14; i58++) {
            if (iArr24[iArr23[i58]] == 0) {
                i57++;
            }
        }
        if (i57 > 1) {
            return new dt20((List) null, f150Var2, (at20) null, (f150) null);
        }
        int[] iArr25 = new int[i14];
        int[] iArr26 = new int[q];
        if (a69Var.o()) {
            iArr2 = iArr24;
            int i59 = 0;
            while (i59 < i14) {
                int i60 = i59;
                iArr25[i60] = a69Var.p(3);
                i59 = i60 + 1;
            }
        } else {
            iArr2 = iArr24;
            Arrays.fill(iArr25, 0, i14, p2);
        }
        int i61 = 0;
        while (i61 < q) {
            int i62 = i61;
            boolean[][] zArr11 = zArr5;
            int[] iArr27 = iArr25;
            int i63 = 0;
            for (int i64 = 0; i64 < iArr10[i62]; i64++) {
                i63 = Math.max(i63, iArr27[((d150) g.get(iArr11[i62][i64])).a]);
            }
            iArr26[i62] = i63 + 1;
            i61 = i62 + 1;
            zArr5 = zArr11;
            iArr25 = iArr27;
        }
        boolean[][] zArr12 = zArr5;
        if (a69Var.o()) {
            int i65 = 0;
            while (i65 < p) {
                int i66 = i65 + 1;
                int i67 = i66;
                while (i67 < i14) {
                    if (zArr10[i67][i65]) {
                        i8 = p;
                        a69Var.u(3);
                    } else {
                        i8 = p;
                    }
                    i67++;
                    p = i8;
                }
                i65 = i66;
            }
        }
        a69Var.t();
        int q3 = a69Var.q() + 1;
        ImmutableList.a aVar2 = new ImmutableList.a();
        aVar2.a(f);
        if (q3 > 1) {
            aVar2.a(f2);
            e150 e150Var = f2;
            for (int i68 = 2; i68 < q3; i68++) {
                e150Var = f(a69Var, a69Var.o(), p2, e150Var);
                aVar2.a(e150Var);
            }
        }
        ImmutableList g2 = aVar2.g();
        int q4 = a69Var.q() + q;
        if (q4 > q) {
            return new dt20((List) null, f150Var2, (at20) null, (f150) null);
        }
        int p5 = a69Var.p(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, q4, i17);
        int[] iArr28 = new int[q4];
        int i69 = 0;
        int[] iArr29 = new int[q4];
        int i70 = 0;
        while (i70 < q) {
            iArr28[i70] = i69;
            iArr29[i70] = iArr8[i70];
            if (p5 == 0) {
                i7 = i70;
                zArr2 = zArr13;
                iArr3 = iArr28;
                iArr4 = iArr26;
                Arrays.fill(zArr13[i7], i69, iArr10[i7], true);
                iArr3[i7] = iArr10[i7];
            } else {
                i7 = i70;
                zArr2 = zArr13;
                iArr3 = iArr28;
                iArr4 = iArr26;
                if (p5 == 1) {
                    int i71 = iArr8[i7];
                    for (int i72 = 0; i72 < iArr10[i7]; i72++) {
                        zArr2[i7][i72] = iArr11[i7][i72] == i71;
                    }
                    iArr3[i7] = 1;
                } else {
                    i69 = 0;
                    zArr2[0][0] = true;
                    iArr3[0] = 1;
                    i70 = i7 + 1;
                    zArr13 = zArr2;
                    iArr28 = iArr3;
                    iArr26 = iArr4;
                }
            }
            i69 = 0;
            i70 = i7 + 1;
            zArr13 = zArr2;
            iArr28 = iArr3;
            iArr26 = iArr4;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr30 = iArr28;
        int[] iArr31 = iArr26;
        int[] iArr32 = new int[i17];
        int i73 = 2;
        int[] iArr33 = new int[2];
        iArr33[1] = i17;
        iArr33[i69] = q4;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr33);
        int i74 = 0;
        int i75 = 1;
        while (i75 < q4) {
            if (p5 == i73) {
                for (int i76 = 0; i76 < iArr10[i75]; i76++) {
                    zArr14[i75][i76] = a69Var.o();
                    int i77 = iArr30[i75];
                    boolean z6 = zArr14[i75][i76];
                    iArr30[i75] = i77 + (z6 ? 1 : 0);
                    if (z6) {
                        iArr29[i75] = iArr11[i75][i76];
                    }
                }
            }
            if (i74 == 0 && iArr11[i75][0] == 0 && zArr14[i75][0]) {
                for (int i78 = 1; i78 < iArr10[i75]; i78++) {
                    if (iArr11[i75][i78] == i48 && zArr14[i75][i48]) {
                        i74 = i75;
                    }
                }
            }
            int i79 = 0;
            while (i79 < iArr10[i75]) {
                if (q3 > 1) {
                    zArr15[i75][i79] = zArr14[i75][i79];
                    i6 = i48;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int i80 = zk91.i(q3);
                    if (!zArr[i75][i79]) {
                        int i81 = ((d150) g.get(iArr11[i75][i79])).a;
                        int i82 = 0;
                        while (true) {
                            if (i82 >= i79) {
                                break;
                            }
                            int i83 = i82;
                            if (zArr12[i81][((d150) g.get(iArr11[i75][i83])).a]) {
                                zArr[i75][i79] = true;
                                break;
                            }
                            i82 = i83 + 1;
                        }
                    }
                    if (zArr[i75][i79]) {
                        if (i74 <= 0 || i75 != i74) {
                            a69Var.u(i80);
                        } else {
                            iArr32[i79] = a69Var.p(i80);
                        }
                    }
                } else {
                    i6 = i48;
                    zArr = zArr15;
                }
                i79++;
                i48 = i6;
                zArr15 = zArr;
            }
            int i84 = i48;
            boolean[][] zArr16 = zArr15;
            if (iArr30[i75] == 1 && iArr2[iArr29[i75]] > 0) {
                a69Var.t();
            }
            i75++;
            i48 = i84;
            zArr15 = zArr16;
            i73 = 2;
        }
        boolean[][] zArr17 = zArr15;
        if (i74 == 0) {
            return new dt20((List) null, f150Var2, (at20) null, (f150) null);
        }
        int q5 = a69Var.q();
        int i85 = q5 + 1;
        y5e.i(i85, "expectedSize");
        ImmutableList.a aVar3 = new ImmutableList.a(i85);
        int[] iArr34 = new int[i14];
        int i86 = 0;
        while (i86 < i85) {
            int p6 = a69Var.p(16);
            int p7 = a69Var.p(16);
            int i87 = i86;
            if (a69Var.o()) {
                i3 = a69Var.p(2);
                if (i3 == 3) {
                    a69Var.t();
                }
                i4 = a69Var.p(4);
                i5 = a69Var.p(4);
            } else {
                i3 = 0;
                i4 = 0;
                i5 = 0;
            }
            if (a69Var.o()) {
                int q6 = a69Var.q();
                int q7 = a69Var.q();
                int q8 = a69Var.q();
                int q9 = a69Var.q();
                p6 -= (q6 + q7) * ((i3 == 1 || i3 == 2) ? 2 : 1);
                p7 -= (q8 + q9) * (i3 == 1 ? 2 : 1);
            }
            aVar3.a(new g150(i3, i4, i5, p6, p7));
            i86 = i87 + 1;
        }
        if (i85 <= 1 || !a69Var.o()) {
            for (int i88 = 1; i88 < i14; i88++) {
                iArr34[i88] = Math.min(i88, q5);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int i89 = zk91.i(i85);
            for (int i90 = 1; i90 < i14; i90++) {
                iArr34[i90] = a69Var.p(i89);
            }
        }
        ImmutableList g3 = aVar3.g();
        at20 at20Var = new at20();
        at20Var.a = ImmutableList.l(g3);
        at20Var.b = iArr34;
        a69Var.u(2);
        for (int i91 = 1; i91 < i14; i91++) {
            if (iArr2[iArr23[i91]] == 0) {
                a69Var.t();
            }
        }
        for (int i92 = 1; i92 < q4; i92++) {
            boolean o12 = a69Var.o();
            int i93 = 0;
            while (i93 < iArr31[i92]) {
                if ((i93 <= 0 || !o12) ? i93 == 0 : a69Var.o()) {
                    for (int i94 = 0; i94 < iArr10[i92]; i94++) {
                        if (zArr17[i92][i94]) {
                            a69Var.q();
                        }
                    }
                    a69Var.q();
                    a69Var.q();
                }
                i93++;
            }
        }
        int i95 = 2;
        int q10 = a69Var.q() + 2;
        if (a69Var.o()) {
            a69Var.u(q10);
        } else {
            for (int i96 = 1; i96 < i14; i96++) {
                for (int i97 = 0; i97 < i96; i97++) {
                    if (zArr10[i96][i97]) {
                        a69Var.u(q10);
                    }
                }
            }
        }
        int q11 = a69Var.q();
        for (int i98 = 1; i98 <= q11; i98++) {
            a69Var.u(8);
        }
        if (a69Var.o()) {
            int i99 = a69Var.e;
            if (i99 > 0) {
                a69Var.u(8 - i99);
            }
            if (!a69Var.o() ? a69Var.o() : true) {
                a69Var.t();
            }
            boolean o13 = a69Var.o();
            boolean o14 = a69Var.o();
            if (o13 || o14) {
                for (int i100 = 0; i100 < q; i100++) {
                    for (int i101 = 0; i101 < iArr31[i100]; i101++) {
                        boolean o15 = o13 ? a69Var.o() : false;
                        boolean o16 = o14 ? a69Var.o() : false;
                        if (o15) {
                            a69Var.u(32);
                        }
                        if (o16) {
                            a69Var.u(18);
                        }
                    }
                }
            }
            boolean o17 = a69Var.o();
            int p8 = o17 ? a69Var.p(4) + 1 : i14;
            y5e.i(p8, "expectedSize");
            ImmutableList.a aVar4 = new ImmutableList.a(p8);
            int[] iArr35 = new int[i14];
            int i102 = 0;
            while (i102 < p8) {
                a69Var.u(3);
                int i103 = a69Var.o() ? 1 : i95;
                int f3 = kfc.f(a69Var.p(8));
                int g4 = kfc.g(a69Var.p(8));
                a69Var.u(8);
                aVar4.a(new i150(f3, i103, g4));
                i102++;
                i95 = 2;
            }
            if (o17 && p8 > 1) {
                for (int i104 = 0; i104 < i14; i104++) {
                    iArr35[i104] = a69Var.p(4);
                }
            }
            f150Var = new f150(aVar4.g(), iArr35, 1);
        } else {
            f150Var = null;
        }
        return new dt20(g, new f150(g2, iArr32, 0), at20Var, f150Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static k150 j(int i, int i2, byte[] bArr) {
        int q;
        int q2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        boolean o;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        float f;
        int i14;
        int i15;
        int i16;
        int i17;
        a69 a69Var = new a69(i + 1, i2, 1, bArr);
        int p = a69Var.p(8);
        int p2 = a69Var.p(8);
        int p3 = a69Var.p(8);
        int q3 = a69Var.q();
        if (p == 100 || p == 110 || p == 122 || p == 244 || p == 44 || p == 83 || p == 86 || p == 118 || p == 128 || p == 138) {
            q = a69Var.q();
            boolean o2 = q == 3 ? a69Var.o() : false;
            int q4 = a69Var.q();
            q2 = a69Var.q();
            a69Var.t();
            if (a69Var.o()) {
                int i18 = q != 3 ? 8 : 12;
                i3 = 16;
                int i19 = 0;
                while (i19 < i18) {
                    if (a69Var.o()) {
                        int i20 = i19 < 6 ? 16 : 64;
                        int i21 = 8;
                        int i22 = 8;
                        for (int i23 = 0; i23 < i20; i23++) {
                            if (i21 != 0) {
                                i21 = ((a69Var.r() + i22) + 256) % 256;
                            }
                            if (i21 != 0) {
                                i22 = i21;
                            }
                        }
                    }
                    i19++;
                }
            } else {
                i3 = 16;
            }
            z = o2;
            i4 = q4;
        } else {
            q = 1;
            i3 = 16;
            i4 = 0;
            z = false;
            q2 = 0;
        }
        int q5 = a69Var.q() + 4;
        int q6 = a69Var.q();
        if (q6 == 0) {
            i8 = a69Var.q() + 4;
            i5 = p;
            i6 = q6;
            i7 = q2;
        } else {
            if (q6 == 1) {
                boolean o3 = a69Var.o();
                a69Var.r();
                a69Var.r();
                i5 = p;
                long q7 = a69Var.q();
                i6 = q6;
                for (int i24 = 0; i24 < q7; i24++) {
                    a69Var.q();
                }
                i7 = q2;
                z2 = o3;
                i8 = 0;
                a69Var.q();
                a69Var.t();
                int q8 = a69Var.q() + 1;
                int q9 = a69Var.q() + 1;
                o = a69Var.o();
                int i25 = 2 - (o ? 1 : 0);
                int i26 = q9 * i25;
                if (!o) {
                    a69Var.t();
                }
                a69Var.t();
                int i27 = q8 * 16;
                int i28 = i26 * 16;
                if (a69Var.o()) {
                    int q10 = a69Var.q();
                    int q11 = a69Var.q();
                    int q12 = a69Var.q();
                    int q13 = a69Var.q();
                    if (q == 0) {
                        i17 = 1;
                    } else {
                        i17 = q == 3 ? 1 : 2;
                        i25 *= q == 1 ? 2 : 1;
                    }
                    i27 -= (q10 + q11) * i17;
                    i28 -= (q12 + q13) * i25;
                }
                int i29 = i28;
                int i30 = i27;
                int i31 = i5;
                int i32 = ((i31 != 44 || i31 == 86 || i31 == 100 || i31 == 110 || i31 == 122 || i31 == 244) && (p2 & 16) != 0) ? 0 : i3;
                int i33 = -1;
                float f2 = 1.0f;
                if (a69Var.o()) {
                    i9 = i7;
                    i10 = i32;
                    i11 = -1;
                    i12 = -1;
                    i13 = i8;
                    f = 1.0f;
                    i14 = -1;
                } else {
                    if (a69Var.o()) {
                        int p4 = a69Var.p(8);
                        if (p4 == 255) {
                            int i34 = i3;
                            int p5 = a69Var.p(i34);
                            int p6 = a69Var.p(i34);
                            if (p5 != 0 && p6 != 0) {
                                f2 = p5 / p6;
                            }
                        } else if (p4 < 17) {
                            f2 = b[p4];
                        } else {
                            xvz.v(p4, "Unexpected aspect_ratio_idc value: ");
                        }
                    }
                    if (a69Var.o()) {
                        a69Var.t();
                    }
                    if (a69Var.o()) {
                        a69Var.u(3);
                        i15 = a69Var.o() ? 1 : 2;
                        if (a69Var.o()) {
                            int p7 = a69Var.p(8);
                            int p8 = a69Var.p(8);
                            a69Var.u(8);
                            int f3 = kfc.f(p7);
                            int g = kfc.g(p8);
                            i33 = f3;
                            i16 = g;
                        } else {
                            i16 = -1;
                        }
                    } else {
                        i15 = -1;
                        i16 = -1;
                    }
                    if (a69Var.o()) {
                        a69Var.q();
                        a69Var.q();
                    }
                    int i35 = i15;
                    if (a69Var.o()) {
                        a69Var.u(65);
                    }
                    boolean o4 = a69Var.o();
                    if (o4) {
                        k(a69Var);
                    }
                    boolean o5 = a69Var.o();
                    if (o5) {
                        k(a69Var);
                    }
                    if (o4 || o5) {
                        a69Var.t();
                    }
                    a69Var.t();
                    if (a69Var.o()) {
                        a69Var.t();
                        a69Var.q();
                        a69Var.q();
                        a69Var.q();
                        a69Var.q();
                        i32 = a69Var.q();
                        a69Var.q();
                    }
                    int i36 = i33;
                    i13 = i8;
                    f = f2;
                    i14 = i36;
                    i11 = i35;
                    i12 = i16;
                    i10 = i32;
                    i9 = i7;
                }
                return new k150(i31, p2, p3, q3, i30, i29, f, i4, i9, z, o, q5, i6, i13, z2, i14, i11, i12, i10);
            }
            i5 = p;
            i6 = q6;
            i7 = q2;
            i8 = 0;
        }
        z2 = false;
        a69Var.q();
        a69Var.t();
        int q82 = a69Var.q() + 1;
        int q92 = a69Var.q() + 1;
        o = a69Var.o();
        int i252 = 2 - (o ? 1 : 0);
        int i262 = q92 * i252;
        if (!o) {
        }
        a69Var.t();
        int i272 = q82 * 16;
        int i282 = i262 * 16;
        if (a69Var.o()) {
        }
        int i292 = i282;
        int i302 = i272;
        int i312 = i5;
        if (i312 != 44) {
        }
        int i332 = -1;
        float f22 = 1.0f;
        if (a69Var.o()) {
        }
        return new k150(i312, p2, p3, q3, i302, i292, f, i4, i9, z, o, q5, i6, i13, z2, i14, i11, i12, i10);
    }

    public static void k(a69 a69Var) {
        int q = a69Var.q() + 1;
        a69Var.u(8);
        for (int i = 0; i < q; i++) {
            a69Var.q();
            a69Var.q();
            a69Var.t();
        }
        a69Var.u(20);
    }

    public static int l(int i, byte[] bArr) {
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
