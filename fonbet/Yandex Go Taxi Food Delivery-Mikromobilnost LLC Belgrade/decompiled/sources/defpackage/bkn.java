package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public abstract class bkn {
    public static final int[] a = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    public static final int[] b = {1886001095, 1339575613, 1980447930, 258412557, -95215574, -959694548, 2013120334, 2047061138};
    public static final int[] c = {-1886001114, -1339575614, -1980447931, -258412558, 95215573, 959694547, -2013120335, 100422509};
    public static final int[] d = {52811034, 25909283, 8072341, 50637101, 13785486, 30858332, 20483199, 20966410, 43936626, 4379245};
    public static final int[] e = {40265304, 26843545, 6710886, 53687091, 13421772, 40265318, 26843545, 6710886, 53687091, 13421772};
    public static final int[] f = {12052516, 1174424, 4087752, 38672185, 20040971, 21899680, 55468344, 20105554, 66708015, 9981791};
    public static final int[] g = {66430571, 45040722, 4842939, 15895846, 18981244, 46308410, 4697481, 8903007, 53646190, 12474675};
    public static final int[] h = {56195235, 47411844, 25868126, 40503822, 57364, 58321048, 30416477, 31930572, 57760639, 10749657};
    public static final int[] i = {45281625, 27714825, 18181821, 13898781, 114729, 49533232, 60832955, 30306712, 48412415, 4722099};
    public static final int[] j = {23454386, 55429651, 2809210, 27797563, 229458, 31957600, 54557047, 27058993, 29715967, 9444199};
    public static final Object k = new Object();
    public static jdj[] l = null;
    public static jdj[] m = null;
    public static int[] n = null;

    public static boolean a(byte[] bArr, boolean z, zjn zjnVar) {
        int i2 = (bArr[31] & DerValue.TAG_CONTEXT) >>> 7;
        int[] iArr = zjnVar.b;
        w9a1.f(0, bArr, iArr, 0);
        w9a1.f(16, bArr, iArr, 5);
        iArr[9] = iArr[9] & 16777215;
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[10];
        w9a1.s(iArr, iArr2);
        w9a1.m(h, iArr2, iArr3);
        iArr2[0] = iArr2[0] - 1;
        iArr3[0] = iArr3[0] + 1;
        int[] iArr4 = zjnVar.a;
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[10];
        w9a1.m(iArr2, iArr3, iArr5);
        w9a1.s(iArr3, iArr6);
        w9a1.m(iArr5, iArr6, iArr5);
        w9a1.s(iArr6, iArr6);
        w9a1.m(iArr6, iArr5, iArr6);
        int[] iArr7 = new int[10];
        int[] iArr8 = new int[10];
        w9a1.s(iArr6, iArr7);
        w9a1.m(iArr6, iArr7, iArr7);
        int[] iArr9 = new int[10];
        w9a1.s(iArr7, iArr9);
        w9a1.m(iArr6, iArr9, iArr9);
        w9a1.r(2, iArr9, iArr9);
        w9a1.m(iArr7, iArr9, iArr9);
        int[] iArr10 = new int[10];
        w9a1.r(5, iArr9, iArr10);
        w9a1.m(iArr9, iArr10, iArr10);
        int[] iArr11 = new int[10];
        w9a1.r(5, iArr10, iArr11);
        w9a1.m(iArr9, iArr11, iArr11);
        w9a1.r(10, iArr11, iArr9);
        w9a1.m(iArr10, iArr9, iArr9);
        w9a1.r(25, iArr9, iArr10);
        w9a1.m(iArr9, iArr10, iArr10);
        w9a1.r(25, iArr10, iArr11);
        w9a1.m(iArr9, iArr11, iArr11);
        w9a1.r(50, iArr11, iArr9);
        w9a1.m(iArr10, iArr9, iArr9);
        w9a1.r(HProv.PP_DELETE_KEYSET, iArr9, iArr10);
        w9a1.m(iArr9, iArr10, iArr10);
        w9a1.r(2, iArr10, iArr9);
        w9a1.m(iArr9, iArr6, iArr8);
        w9a1.m(iArr8, iArr5, iArr8);
        int[] iArr12 = new int[10];
        w9a1.s(iArr8, iArr12);
        w9a1.m(iArr12, iArr3, iArr12);
        for (int i3 = 0; i3 < 10; i3++) {
            iArr7[i3] = iArr12[i3] - iArr2[i3];
        }
        w9a1.o(iArr7);
        if (!w9a1.l(iArr7)) {
            w9a1.a(iArr12, iArr2, iArr7);
            w9a1.o(iArr7);
            if (w9a1.l(iArr7)) {
                w9a1.m(iArr8, w9a1.b, iArr4);
            }
            return false;
        }
        w9a1.d(0, 0, iArr8, iArr4);
        w9a1.o(iArr4);
        if (i2 != 1 || !w9a1.l(iArr4)) {
            if (z ^ (i2 != (iArr4[0] & 1))) {
                w9a1.n(iArr4, iArr4);
                w9a1.o(iArr4);
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0b7e, code lost:
    
        return false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(byte[] bArr, yzh yzhVar, byte b2, byte[] bArr2, int i2) {
        boolean z;
        boolean z2;
        int[] iArr;
        long j2;
        int[] iArr2;
        int[] iArr3;
        int i3;
        int[] iArr4;
        int i4;
        int i5;
        byte b3 = 0;
        if (b2 != 0) {
            ny61.g("ctx");
            return false;
        }
        int i6 = 32;
        byte[] bArr3 = new byte[32];
        System.arraycopy(bArr, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[32];
        System.arraycopy(bArr, 32, bArr4, 0, 32);
        char c2 = 28;
        int b4 = tnb1.b(28, bArr3) & Integer.MAX_VALUE;
        int[] iArr5 = a;
        int i7 = 7;
        int i8 = Integer.MIN_VALUE;
        boolean z3 = 1;
        int i9 = 8;
        if (b4 < iArr5[7]) {
            z2 = true;
        } else {
            int[] iArr6 = new int[8];
            for (int i10 = 0; i10 < 8; i10++) {
                iArr6[i10] = tnb1.b(i10 * 4, bArr3);
            }
            iArr6[7] = Integer.MAX_VALUE & iArr6[7];
            for (int i11 = 7; i11 >= 0; i11--) {
                int i12 = iArr6[i11] ^ Integer.MIN_VALUE;
                int i13 = iArr5[i11] ^ Integer.MIN_VALUE;
                if (i12 < i13) {
                    z = false;
                    break;
                }
                if (i12 > i13) {
                    break;
                }
            }
            z = true;
            z2 = !z;
        }
        if (z2) {
            int[] iArr7 = new int[8];
            for (int i14 = 0; i14 < 8; i14++) {
                iArr7[i14] = tnb1.b(i14 * 4, bArr4);
            }
            int i15 = 7;
            while (true) {
                if (i15 < 0) {
                    break;
                }
                int i16 = iArr7[i15] ^ i8;
                int[] iArr8 = lu91.a;
                int i17 = iArr8[i15] ^ i8;
                if (i16 < i17) {
                    zjn zjnVar = new zjn();
                    if (a(bArr3, z3, zjnVar)) {
                        zjn zjnVar2 = new zjn();
                        int[] iArr9 = (int[]) yzhVar.a;
                        w9a1.n(iArr9, zjnVar2.a);
                        w9a1.d(10, b3, iArr9, zjnVar2.b);
                        byte[] bArr5 = new byte[i6];
                        w9a1.i(10, bArr5, iArr9, b3);
                        int i18 = i8;
                        w9a1.i(15, bArr5, iArr9, 16);
                        bArr5[31] = (byte) (bArr5[31] | ((iArr9[b3] & z3) << i7));
                        nll0 nll0Var = new nll0();
                        boolean z4 = z3;
                        byte[] bArr6 = new byte[64];
                        nll0Var.i(i6, bArr3);
                        nll0Var.i(i6, bArr5);
                        nll0Var.i(i2, bArr2);
                        int i19 = 15;
                        long j3 = nll0Var.c;
                        if (j3 > 2305843009213693951L) {
                            nll0Var.d += j3 >>> 61;
                            nll0Var.c = j3 & 2305843009213693951L;
                        }
                        long j4 = nll0Var.c << 3;
                        int i20 = 3;
                        long j5 = nll0Var.d;
                        nll0Var.h(DerValue.TAG_CONTEXT);
                        while (nll0Var.b != 0) {
                            nll0Var.h(b3);
                        }
                        if (nll0Var.n > 14) {
                            nll0Var.e();
                        }
                        long[] jArr = nll0Var.m;
                        jArr[14] = j5;
                        jArr[15] = j4;
                        nll0Var.e();
                        u490.c(nll0Var.e, b3, bArr6);
                        u490.c(nll0Var.f, i9, bArr6);
                        u490.c(nll0Var.g, 16, bArr6);
                        u490.c(nll0Var.h, 24, bArr6);
                        u490.c(nll0Var.i, i6, bArr6);
                        u490.c(nll0Var.j, 40, bArr6);
                        u490.c(nll0Var.k, 48, bArr6);
                        u490.c(nll0Var.l, 56, bArr6);
                        nll0Var.g();
                        long b5 = tnb1.b(b3, bArr6) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long a2 = (tnb1.a(4, bArr6) << 4) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long b6 = tnb1.b(7, bArr6) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long a3 = (tnb1.a(11, bArr6) << 4) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long b7 = tnb1.b(14, bArr6) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long a4 = (tnb1.a(18, bArr6) << 4) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long b8 = tnb1.b(21, bArr6) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long a5 = (tnb1.a(25, bArr6) << 4) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long b9 = tnb1.b(28, bArr6) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long a6 = (tnb1.a(32, bArr6) << 4) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long b10 = tnb1.b(35, bArr6) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long a7 = (tnb1.a(39, bArr6) << 4) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long b11 = tnb1.b(42, bArr6) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long a8 = (tnb1.a(46, bArr6) << 4) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long b12 = tnb1.b(49, bArr6);
                        long j6 = b12 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long a9 = (tnb1.a(53, bArr6) << 4) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long b13 = tnb1.b(56, bArr6);
                        long j7 = b13 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j8 = bArr6[63] & 255;
                        long j9 = a6 - (j8 * (-50998291));
                        long j10 = b10 - (j8 * 19280294);
                        long j11 = a7 - (j8 * 127719000);
                        long j12 = b11 - (j8 * (-6428113));
                        long j13 = a8 - (j8 * 5343);
                        long a10 = ((tnb1.a(60, bArr6) << 4) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (j7 >> 28);
                        long j14 = b13 & 268435455;
                        long j15 = b9 - (a10 * (-50998291));
                        long j16 = j9 - (a10 * 19280294);
                        long j17 = j12 - (a10 * 5343);
                        long j18 = (j11 - (a10 * (-6428113))) - (j14 * 5343);
                        long j19 = a9 + (j6 >> 28);
                        long j20 = b12 & 268435455;
                        long j21 = ((j10 - (a10 * 127719000)) - (j14 * (-6428113))) - (j19 * 5343);
                        long j22 = ((j16 - (j14 * 127719000)) - (j19 * (-6428113))) - (j20 * 5343);
                        long j23 = j13 + (j17 >> 28);
                        long j24 = b7 - (j23 * (-50998291));
                        long j25 = ((b8 - (j19 * (-50998291))) - (j20 * 19280294)) - (j23 * 127719000);
                        long j26 = (((a5 - (j14 * (-50998291))) - (j19 * 19280294)) - (j20 * 127719000)) - (j23 * (-6428113));
                        long j27 = (((j15 - (j14 * 19280294)) - (j19 * 127719000)) - (j20 * (-6428113))) - (j23 * 5343);
                        long j28 = (j17 & 268435455) + (j18 >> 28);
                        long j29 = ((a4 - (j20 * (-50998291))) - (j23 * 19280294)) - (j28 * 127719000);
                        long j30 = j26 - (j28 * 5343);
                        long j31 = (j18 & 268435455) + (j21 >> 28);
                        long j32 = (a3 - (j28 * (-50998291))) - (j31 * 19280294);
                        long j33 = (j24 - (j28 * 19280294)) - (j31 * 127719000);
                        long j34 = (j25 - (j28 * (-6428113))) - (j31 * 5343);
                        long j35 = (j21 & 268435455) + (j22 >> 28);
                        long j36 = a2 - (j35 * (-50998291));
                        long j37 = (b6 - (j31 * (-50998291))) - (j35 * 19280294);
                        long j38 = j32 - (j35 * 127719000);
                        long j39 = j33 - (j35 * (-6428113));
                        long j40 = (j29 - (j31 * (-6428113))) - (j35 * 5343);
                        long j41 = j27 + (j30 >> 28);
                        long j42 = (j22 & 268435455) + (j41 >> 28);
                        long j43 = j41 & 268435455;
                        long j44 = j43 >>> 27;
                        long j45 = j42 + j44;
                        long j46 = b5 - (j45 * (-50998291));
                        long j47 = j38 - (j45 * (-6428113));
                        long j48 = j39 - (j45 * 5343);
                        long j49 = (j36 - (j45 * 19280294)) + (j46 >> 28);
                        long j50 = (j37 - (j45 * 127719000)) + (j49 >> 28);
                        long j51 = j49 & 268435455;
                        long j52 = j47 + (j50 >> 28);
                        long j53 = j48 + (j52 >> 28);
                        long j54 = j52 & 268435455;
                        long j55 = j40 + (j53 >> 28);
                        long j56 = j53 & 268435455;
                        long j57 = j34 + (j55 >> 28);
                        long j58 = (j30 & 268435455) + (j57 >> 28);
                        long j59 = j43 + (j58 >> 28);
                        long j60 = (j59 >> 28) - j44;
                        long j61 = (j46 & 268435455) + (j60 & (-50998291));
                        long j62 = j51 + (j60 & 19280294) + (j61 >> 28);
                        long j63 = (j50 & 268435455) + (j60 & 127719000) + (j62 >> 28);
                        long j64 = j54 + (j60 & (-6428113)) + (j63 >> 28);
                        long j65 = j56 + (j60 & 5343) + (j64 >> 28);
                        long j66 = (j55 & 268435455) + (j65 >> 28);
                        long j67 = (j57 & 268435455) + (j66 >> 28);
                        long j68 = (j58 & 268435455) + (j67 >> 28);
                        byte[] bArr7 = new byte[32];
                        tnb1.d((j61 & 268435455) | ((j62 & 268435455) << 28), 0, bArr7);
                        tnb1.d(((j64 & 268435455) << 28) | (j63 & 268435455), 7, bArr7);
                        tnb1.d((j65 & 268435455) | ((j66 & 268435455) << 28), 14, bArr7);
                        tnb1.d((j67 & 268435455) | ((j68 & 268435455) << 28), 21, bArr7);
                        tnb1.c((int) ((j59 & 268435455) + (j68 >> 28)), 28, bArr7);
                        int[] iArr10 = new int[8];
                        int i21 = 0;
                        for (int i22 = 8; i21 < i22; i22 = 8) {
                            iArr10[i21] = tnb1.b(i21 * 4, bArr7);
                            i21++;
                        }
                        int[] iArr11 = new int[4];
                        int[] iArr12 = new int[4];
                        int[] iArr13 = new int[16];
                        System.arraycopy(lu91.b, 0, iArr13, 0, 16);
                        int[] iArr14 = new int[16];
                        long j69 = iArr10[0] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        int i23 = 16;
                        int i24 = 7;
                        int i25 = 0;
                        while (true) {
                            int i26 = i24 - 1;
                            iArr = iArr14;
                            long j70 = iArr10[i24] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                            long j71 = j70 * j70;
                            j2 = j69;
                            iArr[i23 - 1] = (i25 << 31) | ((int) (j71 >>> 33));
                            i23 -= 2;
                            iArr[i23] = (int) (j71 >>> (z4 ? 1L : 0L));
                            i25 = (int) j71;
                            if (i26 <= 0) {
                                break;
                            }
                            i24 = i26;
                            j69 = j2;
                            i19 = i19;
                            iArr14 = iArr;
                        }
                        long j72 = j2 * j2;
                        long j73 = ((i25 << 31) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (j72 >>> 33);
                        int i27 = (int) j72;
                        iArr[0] = i27;
                        long j74 = iArr10[z4 ? 1 : 0] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j75 = iArr[2] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j76 = (j74 * j2) + j73;
                        int i28 = (int) j76;
                        iArr[z4 ? 1 : 0] = (i28 << 1) | (((int) (j72 >>> 32)) & 1);
                        long j77 = j75 + (j76 >>> 32);
                        long j78 = iArr10[2] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j79 = iArr[3] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j80 = iArr[4] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j81 = (j78 * j2) + j77;
                        int i29 = (int) j81;
                        iArr[2] = (i29 << 1) | (i28 >>> 31);
                        long g2 = smw0.g(j78, j74, j81 >>> 32, j79);
                        long j82 = j80 + (g2 >>> 32);
                        long j83 = g2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j84 = iArr10[3] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j85 = (iArr[5] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (j82 >>> 32);
                        long j86 = j82 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j87 = (iArr[6] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (j85 >>> 32);
                        long j88 = j85 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j89 = (j84 * j2) + j83;
                        int i30 = (int) j89;
                        iArr[3] = (i30 << 1) | (i29 >>> 31);
                        long g3 = smw0.g(j84, j74, j89 >>> 32, j86);
                        long g4 = smw0.g(j84, j78, g3 >>> 32, j88);
                        long j90 = g3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j91 = j87 + (g4 >>> 32);
                        long j92 = g4 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j93 = iArr10[4] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j94 = (iArr[7] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (j91 >>> 32);
                        long j95 = j91 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j96 = (iArr[8] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (j94 >>> 32);
                        long j97 = j94 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j98 = (j93 * j2) + j90;
                        int i31 = (int) j98;
                        iArr[4] = (i31 << 1) | (i30 >>> 31);
                        int i32 = i31 >>> 31;
                        long g5 = smw0.g(j93, j74, j98 >>> 32, j92);
                        long g6 = smw0.g(j93, j78, g5 >>> 32, j95);
                        long j99 = g5 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long g7 = smw0.g(j93, j84, g6 >>> 32, j97);
                        long j100 = g6 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j101 = j96 + (g7 >>> 32);
                        long j102 = g7 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j103 = iArr10[5] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j104 = (iArr[9] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (j101 >>> 32);
                        long j105 = j101 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j106 = (iArr[10] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (j104 >>> 32);
                        long j107 = j104 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j108 = (j103 * j2) + j99;
                        int i33 = (int) j108;
                        iArr[5] = (i33 << 1) | i32;
                        long g8 = smw0.g(j103, j74, j108 >>> 32, j100);
                        long g9 = smw0.g(j103, j78, g8 >>> 32, j102);
                        long j109 = g8 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long g10 = smw0.g(j103, j84, g9 >>> 32, j105);
                        long j110 = g9 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long g11 = smw0.g(j103, j93, g10 >>> 32, j107);
                        long j111 = g10 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j112 = j106 + (g11 >>> 32);
                        long j113 = g11 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j114 = iArr10[6] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j115 = (iArr[11] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (j112 >>> 32);
                        long j116 = j112 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j117 = (iArr[12] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (j115 >>> 32);
                        long j118 = j115 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j119 = (j114 * j2) + j109;
                        int i34 = (int) j119;
                        iArr[6] = (i34 << 1) | (i33 >>> 31);
                        long g12 = smw0.g(j114, j74, j119 >>> 32, j110);
                        long g13 = smw0.g(j114, j78, g12 >>> 32, j111);
                        long j120 = g12 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long g14 = smw0.g(j114, j84, g13 >>> 32, j113);
                        long j121 = g13 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long g15 = smw0.g(j114, j93, g14 >>> 32, j116);
                        long j122 = g14 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long g16 = smw0.g(j114, j103, g15 >>> 32, j118);
                        long j123 = g15 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j124 = j117 + (g16 >>> 32);
                        long j125 = g16 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j126 = iArr10[7] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j127 = (iArr[13] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (j124 >>> 32);
                        long j128 = j124 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j129 = (iArr[14] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (j127 >>> 32);
                        long j130 = j127 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j131 = (j126 * j2) + j120;
                        int i35 = (int) j131;
                        iArr[7] = (i35 << 1) | (i34 >>> 31);
                        long g17 = smw0.g(j126, j74, j131 >>> 32, j121);
                        long g18 = smw0.g(j126, j78, g17 >>> 32, j122);
                        long g19 = smw0.g(j126, j84, g18 >>> 32, j123);
                        long g20 = smw0.g(j126, j93, g19 >>> 32, j125);
                        long g21 = smw0.g(j126, j103, g20 >>> 32, j128);
                        long g22 = smw0.g(j126, j114, g21 >>> 32, j130);
                        long j132 = j129 + (g22 >>> 32);
                        int i36 = (int) g17;
                        iArr[8] = (i35 >>> 31) | (i36 << 1);
                        int i37 = (int) g18;
                        iArr[9] = (i37 << 1) | (i36 >>> 31);
                        int i38 = (int) g19;
                        iArr[10] = (i37 >>> 31) | (i38 << 1);
                        int i39 = i38 >>> 31;
                        int i40 = (int) g20;
                        iArr[11] = i39 | (i40 << 1);
                        int i41 = i40 >>> 31;
                        int i42 = (int) g21;
                        iArr[12] = i41 | (i42 << 1);
                        int i43 = i42 >>> 31;
                        int i44 = (int) g22;
                        iArr[13] = i43 | (i44 << 1);
                        int i45 = i44 >>> 31;
                        int i46 = (int) j132;
                        iArr[14] = i45 | (i46 << 1);
                        iArr[i19] = ((iArr[i19] + ((int) (j132 >>> 32))) << 1) | (i46 >>> 31);
                        iArr[0] = i27 + 1;
                        int[] iArr15 = new int[16];
                        long j133 = iArr10[0] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j134 = iArr10[z4 ? 1 : 0] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j135 = iArr10[2] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j136 = iArr10[3] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j137 = iArr10[4] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j138 = iArr10[5] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j139 = iArr10[6] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j140 = iArr10[7] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j141 = iArr8[0] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        long j142 = j141 * j133;
                        iArr15[0] = (int) j142;
                        long j143 = (j141 * j134) + (j142 >>> 32);
                        iArr15[z4 ? 1 : 0] = (int) j143;
                        long j144 = (j141 * j135) + (j143 >>> 32);
                        iArr15[2] = (int) j144;
                        long j145 = (j141 * j136) + (j144 >>> 32);
                        iArr15[3] = (int) j145;
                        long j146 = (j141 * j137) + (j145 >>> 32);
                        iArr15[4] = (int) j146;
                        long j147 = (j141 * j138) + (j146 >>> 32);
                        iArr15[5] = (int) j147;
                        long j148 = (j141 * j139) + (j147 >>> 32);
                        iArr15[6] = (int) j148;
                        long j149 = (j141 * j140) + (j148 >>> 32);
                        iArr15[7] = (int) j149;
                        iArr15[8] = (int) (j149 >>> 32);
                        int i47 = z4 ? 1 : 0;
                        for (int i48 = 8; i47 < i48; i48 = 8) {
                            long j150 = j134;
                            long j151 = iArr8[i47] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                            int i49 = i47;
                            long j152 = (j151 * j133) + (iArr15[i49] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                            iArr15[i49] = (int) j152;
                            int i50 = i49 + 1;
                            long j153 = (j151 * j150) + (iArr15[i50] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (j152 >>> 32);
                            iArr15[i50] = (int) j153;
                            long j154 = (j151 * j135) + (iArr15[r26] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (j153 >>> 32);
                            iArr15[i49 + 2] = (int) j154;
                            long j155 = (j151 * j136) + (iArr15[r26] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (j154 >>> 32);
                            iArr15[i49 + 3] = (int) j155;
                            long j156 = (j151 * j137) + (iArr15[r26] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (j155 >>> 32);
                            iArr15[i49 + 4] = (int) j156;
                            long j157 = (j151 * j138) + (iArr15[r26] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (j156 >>> 32);
                            iArr15[i49 + 5] = (int) j157;
                            long j158 = (j151 * j139) + (iArr15[r26] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (j157 >>> 32);
                            iArr15[i49 + 6] = (int) j158;
                            long j159 = (j151 * j140) + (iArr15[r26] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (j158 >>> 32);
                            iArr15[i49 + 7] = (int) j159;
                            iArr15[i49 + 8] = (int) (j159 >>> 32);
                            i47 = i50;
                            j134 = j150;
                        }
                        int[] iArr16 = new int[4];
                        System.arraycopy(iArr8, 0, iArr16, 0, 4);
                        int[] iArr17 = new int[4];
                        int[] iArr18 = new int[4];
                        System.arraycopy(iArr10, 0, iArr18, 0, 4);
                        int[] iArr19 = new int[4];
                        iArr19[0] = z4 ? 1 : 0;
                        int i51 = i19;
                        while (i51 > 0 && iArr[i51] == 0) {
                            i51--;
                        }
                        int numberOfLeadingZeros = ((i51 * 32) + 32) - Integer.numberOfLeadingZeros(iArr[i51]);
                        int[] iArr20 = iArr;
                        int i52 = i19;
                        int[] iArr21 = iArr13;
                        while (numberOfLeadingZeros > 254) {
                            int i53 = iArr15[i52] >> 31;
                            int i54 = i52;
                            while (i54 > 0 && iArr15[i54] == i53) {
                                i54--;
                            }
                            int numberOfLeadingZeros2 = (((i54 * 32) + 32) - Integer.numberOfLeadingZeros(i53 ^ iArr15[i54])) - numberOfLeadingZeros;
                            int i55 = (~(numberOfLeadingZeros2 >> 31)) & numberOfLeadingZeros2;
                            if (iArr15[i52] < 0) {
                                int i56 = i55 >>> 5;
                                int i57 = i55 & 31;
                                if (i57 == 0) {
                                    int i58 = i56;
                                    long j160 = 0;
                                    long j161 = 0;
                                    while (i58 <= i52) {
                                        int i59 = i58 - i56;
                                        int[] iArr22 = iArr16;
                                        long j162 = j160 + (iArr21[i58] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (iArr15[i59] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                        long j163 = j161 + (iArr15[i58] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (iArr20[i59] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                        iArr15[i58] = (int) j163;
                                        j161 = j163 >>> 32;
                                        long j164 = j162 + (iArr15[i59] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                        iArr21[i58] = (int) j164;
                                        j160 = j164 >>> 32;
                                        i58++;
                                        iArr16 = iArr22;
                                        iArr17 = iArr17;
                                    }
                                    iArr2 = iArr16;
                                    iArr3 = iArr17;
                                } else {
                                    iArr2 = iArr16;
                                    iArr3 = iArr17;
                                    int i60 = i56;
                                    int i61 = 0;
                                    int i62 = 0;
                                    int i63 = 0;
                                    long j165 = 0;
                                    long j166 = 0;
                                    while (i60 <= i52) {
                                        int i64 = i60 - i56;
                                        int i65 = iArr15[i64];
                                        int i66 = i61;
                                        int i67 = -i57;
                                        long j167 = j165 + (iArr21[i60] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (((i65 << i57) | (i66 >>> i67)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                        int i68 = iArr20[i64];
                                        int[] iArr23 = iArr21;
                                        long j168 = j166 + (iArr15[i60] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (((i68 << i57) | (i62 >>> i67)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                        iArr15[i60] = (int) j168;
                                        j166 = j168 >>> 32;
                                        int i69 = iArr15[i64];
                                        long j169 = j167 + (((i69 << i57) | (i63 >>> i67)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                        iArr23[i60] = (int) j169;
                                        j165 = j169 >>> 32;
                                        i60++;
                                        i63 = i69;
                                        iArr21 = iArr23;
                                        numberOfLeadingZeros = numberOfLeadingZeros;
                                        i56 = i56;
                                        i62 = i68;
                                        i61 = i65;
                                    }
                                }
                                i3 = numberOfLeadingZeros;
                                int i70 = i56;
                                iArr4 = iArr21;
                                if (i57 == 0) {
                                    int i71 = i70;
                                    long j170 = 0;
                                    long j171 = 0;
                                    for (int i72 = i20; i71 <= i72; i72 = 3) {
                                        long j172 = j170 + (iArr2[i71] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                        long j173 = j171 + (iArr3[i71] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                        int i73 = i71 - i70;
                                        long j174 = j172 + (iArr18[i73] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                        long j175 = j173 + (iArr19[i73] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                        iArr2[i71] = (int) j174;
                                        j170 = j174 >>> 32;
                                        iArr3[i71] = (int) j175;
                                        j171 = j175 >>> 32;
                                        i71++;
                                    }
                                } else {
                                    int i74 = i70;
                                    int i75 = 0;
                                    int i76 = 0;
                                    long j176 = 0;
                                    long j177 = 0;
                                    while (i74 <= 3) {
                                        int i77 = i74 - i70;
                                        int i78 = iArr18[i77];
                                        int i79 = iArr19[i77];
                                        int i80 = -i57;
                                        long j178 = j176 + (iArr2[i74] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                        long j179 = j177 + (iArr3[i74] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                        long j180 = j178 + (((i75 >>> i80) | (i78 << i57)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                        long j181 = j179 + (((i76 >>> i80) | (i79 << i57)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                        iArr2[i74] = (int) j180;
                                        j176 = j180 >>> 32;
                                        iArr3[i74] = (int) j181;
                                        j177 = j181 >>> 32;
                                        i74++;
                                        i76 = i79;
                                        i75 = i78;
                                    }
                                }
                                i4 = i52;
                                i5 = 3;
                            } else {
                                iArr2 = iArr16;
                                iArr3 = iArr17;
                                i3 = numberOfLeadingZeros;
                                iArr4 = iArr21;
                                int i81 = i55 >>> 5;
                                int i82 = i55 & 31;
                                if (i82 == 0) {
                                    long j182 = 0;
                                    long j183 = 0;
                                    for (int i83 = i81; i83 <= i52; i83++) {
                                        int i84 = i83 - i81;
                                        long j184 = (j182 + (iArr4[i83] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - (iArr15[i84] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                        long j185 = (j183 + (iArr15[i83] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - (iArr20[i84] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                        iArr15[i83] = (int) j185;
                                        j183 = j185 >> 32;
                                        long j186 = j184 - (iArr15[i84] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                        iArr4[i83] = (int) j186;
                                        j182 = j186 >> 32;
                                    }
                                } else {
                                    int i85 = i81;
                                    int i86 = 0;
                                    int i87 = 0;
                                    int i88 = 0;
                                    long j187 = 0;
                                    long j188 = 0;
                                    while (i85 <= i52) {
                                        int i89 = i85 - i81;
                                        int i90 = iArr15[i89];
                                        int i91 = i52;
                                        int i92 = -i82;
                                        int i93 = i81;
                                        long j189 = (j187 + (iArr4[i85] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - (((i90 << i82) | (i86 >>> i92)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                        int i94 = iArr20[i89];
                                        long j190 = (j188 + (iArr15[i85] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - (((i94 << i82) | (i87 >>> i92)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                        iArr15[i85] = (int) j190;
                                        j188 = j190 >> 32;
                                        int i95 = iArr15[i89];
                                        long j191 = j189 - (((i95 << i82) | (i88 >>> i92)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                        iArr4[i85] = (int) j191;
                                        j187 = j191 >> 32;
                                        i85++;
                                        i87 = i94;
                                        i88 = i95;
                                        i86 = i90;
                                        i52 = i91;
                                        i81 = i93;
                                    }
                                }
                                i4 = i52;
                                int i96 = i81;
                                if (i82 == 0) {
                                    long j192 = 0;
                                    long j193 = 0;
                                    for (int i97 = i96; i97 <= 3; i97++) {
                                        long j194 = j192 + (iArr2[i97] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                        long j195 = j193 + (iArr3[i97] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                        int i98 = i97 - i96;
                                        long j196 = j194 - (iArr18[i98] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                        long j197 = j195 - (iArr19[i98] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                        iArr2[i97] = (int) j196;
                                        j192 = j196 >> 32;
                                        iArr3[i97] = (int) j197;
                                        j193 = j197 >> 32;
                                    }
                                    i5 = 3;
                                } else {
                                    int i99 = i96;
                                    int i100 = 0;
                                    int i101 = 0;
                                    i5 = 3;
                                    long j198 = 0;
                                    long j199 = 0;
                                    while (i99 <= 3) {
                                        int i102 = i99 - i96;
                                        int i103 = iArr18[i102];
                                        int i104 = iArr19[i102];
                                        int i105 = -i82;
                                        long j200 = j198 + (iArr2[i99] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                        long j201 = j199 + (iArr3[i99] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                        long j202 = j200 - (((i100 >>> i105) | (i103 << i82)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                        long j203 = j201 - (((i101 >>> i105) | (i104 << i82)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                        iArr2[i99] = (int) j202;
                                        j198 = j202 >> 32;
                                        iArr3[i99] = (int) j203;
                                        j199 = j203 >> 32;
                                        i99++;
                                        i101 = i104;
                                        i100 = i103;
                                    }
                                }
                            }
                            int i106 = i4;
                            do {
                                int i107 = iArr4[i106] + i18;
                                int i108 = iArr20[i106] + i18;
                                if (i107 < i108) {
                                    i52 = i3 >>> 5;
                                    int i109 = i52;
                                    while (i109 > 0 && iArr4[i109] == 0) {
                                        i109--;
                                    }
                                    numberOfLeadingZeros = ((i109 * 32) + 32) - Integer.numberOfLeadingZeros(iArr4[i109]);
                                    iArr16 = iArr18;
                                    iArr18 = iArr2;
                                    iArr17 = iArr19;
                                    iArr19 = iArr3;
                                } else {
                                    if (i107 > i108) {
                                        break;
                                    }
                                    i106--;
                                }
                                i20 = i5;
                                iArr21 = iArr20;
                                iArr20 = iArr4;
                            } while (i106 >= 0);
                            int[] iArr24 = iArr4;
                            iArr4 = iArr20;
                            iArr20 = iArr24;
                            iArr16 = iArr2;
                            iArr17 = iArr3;
                            numberOfLeadingZeros = i3;
                            i52 = i4;
                            i20 = i5;
                            iArr21 = iArr20;
                            iArr20 = iArr4;
                        }
                        System.arraycopy(iArr18, 0, iArr11, 0, 4);
                        System.arraycopy(iArr19, 0, iArr12, 0, 4);
                        lu91.c(iArr7, iArr12, iArr7);
                        q4g q4gVar = new q4g(i19);
                        j(iArr7, iArr11, zjnVar2, iArr12, zjnVar, q4gVar);
                        w9a1.o((int[]) q4gVar.b);
                        int[] iArr25 = (int[]) q4gVar.c;
                        w9a1.o(iArr25);
                        int[] iArr26 = (int[]) q4gVar.w;
                        w9a1.o(iArr26);
                        if (w9a1.l((int[]) q4gVar.b) && !w9a1.l(iArr25)) {
                            int i110 = 0;
                            for (int i111 = 0; i111 < 10; i111++) {
                                i110 |= iArr25[i111] ^ iArr26[i111];
                            }
                            if (((((i110 >>> 1) | (i110 & 1)) - 1) >> 31) != 0) {
                                return z4;
                            }
                        }
                    }
                } else {
                    int i112 = i6;
                    int i113 = i7;
                    int i114 = i8;
                    boolean z5 = z3;
                    int i115 = i9;
                    char c3 = c2;
                    if (i16 > i17) {
                        break;
                    }
                    i15--;
                    z3 = z5;
                    c2 = c3;
                    i7 = i113;
                    i6 = i112;
                    i9 = i115;
                    b3 = 0;
                    i8 = i114;
                }
            }
        }
        return b3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00bc, code lost:
    
        if (r8 < r9) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c3, code lost:
    
        r25 = r8 + 30;
        r0 = r15[0];
        r30 = r12[0];
        r28 = 30;
        r6 = 0;
        r26 = 0;
        r8 = 1;
        r29 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d7, code lost:
    
        r31 = java.lang.Integer.numberOfTrailingZeros(r30 | ((-1) << r28));
        r30 = r30 >> r31;
        r32 = r9;
        r9 = r29 << r31;
        r29 = r10;
        r10 = r26 << r31;
        r26 = r11;
        r11 = r17 - r31;
        r33 = r12;
        r12 = r28 - r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f1, code lost:
    
        if (r12 > 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x025c, code lost:
    
        r34 = r7;
        r28 = r13;
        r31 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0262, code lost:
    
        if (r11 >= 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0264, code lost:
    
        r7 = -r11;
        r0 = -r0;
        r9 = -r9;
        r10 = -r10;
        r11 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x026a, code lost:
    
        if (r11 <= r12) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x026c, code lost:
    
        r11 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x026d, code lost:
    
        r11 = (((-1) >>> (32 - r11)) & 63) & (((r30 * r30) - 2) * (r30 * r0));
        r30 = r0;
        r0 = r30;
        r9 = r6;
        r6 = r9;
        r10 = r8;
        r8 = r10;
        r17 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x02a7, code lost:
    
        r30 = (r0 * r11) + r30;
        r6 = r6 + (r9 * r11);
        r8 = r8 + (r11 * r10);
        r11 = r26;
        r13 = r28;
        r14 = r31;
        r7 = r34;
        r26 = r10;
        r28 = r12;
        r10 = r29;
        r12 = r33;
        r29 = r9;
        r9 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x028e, code lost:
    
        r7 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0290, code lost:
    
        if (r7 <= r12) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0292, code lost:
    
        r7 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0293, code lost:
    
        r17 = r11;
        r11 = (((-1) >>> (32 - r7)) & 15) & ((-((((r0 + 1) & 4) << 1) + r0)) * r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f3, code lost:
    
        r0 = new int[]{r9, r10, r6, r8};
        r6 = r0[0];
        r8 = r0[1];
        r9 = r0[2];
        r12 = r0[3];
        r17 = r13[r29] >> 31;
        r27 = r14[r29] >> 31;
        r28 = (r6 & r17) + (r8 & r27);
        r17 = (r9 & r17) + (r12 & r27);
        r10 = r3[0];
        r31 = r14;
        r34 = r7;
        r6 = r6;
        r6 = r13[0];
        r37 = r6 * r6;
        r6 = r8;
        r6 = r31[0];
        r6 = (r6 * r6) + r37;
        r8 = r9;
        r37 = r8 * r6;
        r8 = r12;
        r8 = (r8 * r6) + r37;
        r0 = r28 - (((((int) r6) * r20) + r28) & 1073741823);
        r28 = r13;
        r12 = r10;
        r6 = r0;
        r43 = (r12 * r6) + r6;
        r49 = r6;
        r6 = r17 - (((((int) r8) * r20) + r17) & 1073741823);
        r12 = ((r12 * r6) + r8) >> 30;
        r53 = r43 >> 30;
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x016c, code lost:
    
        if (r0 >= r1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x016e, code lost:
    
        r8 = r3[r0];
        r37 = r6;
        r6 = r28[r0];
        r9 = r31[r0];
        r51 = (r6 * r9) + (r6 * r6);
        r6 = r8;
        r6 = defpackage.smw0.g(r6, r49, r51, r53);
        r8 = defpackage.smw0.g(r6, r37, (r8 * r9) + (r6 * r8), r12);
        r10 = r0 - 1;
        r28[r10] = ((int) r6) & 1073741823;
        r53 = r6 >> 30;
        r31[r10] = ((int) r8) & 1073741823;
        r12 = r8 >> 30;
        r0 = r0 + 1;
        r6 = r37;
        r49 = r49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01ae, code lost:
    
        r28[r29] = (int) r53;
        r31[r29] = (int) r12;
        r0 = r0[0];
        r6 = r0[1];
        r7 = r0[2];
        r8 = r0[3];
        r12 = r0;
        r12 = r15[0];
        r37 = r12 * r12;
        r12 = r6;
        r9 = r33[0];
        r41 = (r12 * r9) + r37;
        r6 = r7;
        r37 = r6 * r12;
        r6 = r8;
        r49 = ((r9 * r6) + r37) >> 30;
        r0 = 1;
        r45 = r41 >> 30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01e3, code lost:
    
        if (r0 >= r5) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01e5, code lost:
    
        r37 = r6;
        r6 = r15[r0];
        r8 = r33[r0];
        r39 = r12;
        r8 = defpackage.smw0.g(r39, r8, r12 * r6, r45);
        r6 = defpackage.smw0.g(r37, r8, r6 * r6, r49);
        r10 = r0 - 1;
        r15[r10] = ((int) r8) & 1073741823;
        r45 = r8 >> 30;
        r33[r10] = ((int) r6) & 1073741823;
        r49 = r6 >> 30;
        r0 = r0 + 1;
        r6 = r37;
        r12 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0218, code lost:
    
        r0 = r5 - 1;
        r15[r0] = (int) r45;
        r6 = (int) r49;
        r33[r0] = r6;
        r0 = r15[r0];
        r7 = r5 - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0232, code lost:
    
        if ((((r7 >> 31) | ((r0 >> 31) ^ r0)) | ((r6 >> 31) ^ r6)) != 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0234, code lost:
    
        r15[r7] = (r0 << 30) | r15[r7];
        r33[r7] = r33[r7] | (r6 << 30);
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00be, code lost:
    
        r0 = r7;
        r1 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(akn[] aknVarArr) {
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int length = aknVarArr.length;
        int[] iArr6 = new int[length * 10];
        int[] iArr7 = new int[10];
        w9a1.d(0, 0, aknVarArr[0].c, iArr7);
        w9a1.d(0, 0, iArr7, iArr6);
        int i9 = 0;
        while (true) {
            int i10 = i9 + 1;
            if (i10 >= length) {
                break;
            }
            w9a1.m(iArr7, aknVarArr[i10].c, iArr7);
            w9a1.d(0, i10 * 10, iArr7, iArr6);
            i9 = i10;
        }
        w9a1.a(iArr7, iArr7, iArr7);
        int[] iArr8 = new int[10];
        int[] iArr9 = new int[8];
        w9a1.d(0, 0, iArr7, iArr8);
        w9a1.o(iArr8);
        w9a1.h(0, 0, iArr8, iArr9);
        w9a1.h(5, 4, iArr8, iArr9);
        int[] iArr10 = w9a1.a;
        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(iArr10[7]);
        int i11 = 256 - numberOfLeadingZeros;
        int i12 = (285 - numberOfLeadingZeros) / 30;
        int[] iArr11 = new int[i12];
        int[] iArr12 = new int[i12];
        int[] iArr13 = new int[i12];
        int[] iArr14 = new int[i12];
        int[] iArr15 = new int[i12];
        iArr12[0] = 1;
        xw20.b(i11, iArr9, iArr14);
        xw20.b(i11, iArr10, iArr15);
        System.arraycopy(iArr15, 0, iArr13, 0, i12);
        int i13 = i12 - 1;
        int numberOfLeadingZeros2 = (-1) - (Integer.numberOfLeadingZeros(iArr14[i13] | 1) - (((i12 * 30) + 2) - i11));
        int i14 = iArr15[0];
        int i15 = (2 - (i14 * i14)) * i14;
        int i16 = (2 - (i14 * i15)) * i15;
        int i17 = (2 - (i14 * i16)) * i16;
        int i18 = (2 - (i14 * i17)) * i17;
        int i19 = ((i11 * 49) + (i11 < 46 ? 80 : 47)) / 17;
        int i20 = i12;
        int i21 = 0;
        while (true) {
            i2 = i9;
            int i22 = 0;
            while (true) {
                if (i22 >= i20) {
                    int[] iArr16 = iArr9;
                    int i23 = i11;
                    int[] iArr17 = iArr11;
                    int i24 = 32;
                    int i25 = iArr13[i20 - 1] >> 31;
                    int i26 = iArr17[i13] >> 31;
                    if (i26 < 0) {
                        i26 = xw20.a(i12, iArr17, iArr15);
                    }
                    if (i25 < 0) {
                        i26 = xw20.c(i12, iArr17);
                        xw20.c(i20, iArr13);
                    }
                    int i27 = 1;
                    if (iArr13[0] == 1) {
                        while (true) {
                            if (i27 >= i20) {
                                if (i26 < 0) {
                                    xw20.a(i12, iArr17, iArr15);
                                }
                                long j2 = 0;
                                int i28 = 0;
                                int i29 = 0;
                                int i30 = 0;
                                int i31 = i23;
                                while (i31 > 0) {
                                    for (int i32 = i24; i30 < Math.min(i32, i31); i32 = 32) {
                                        j2 |= iArr17[i28] << i30;
                                        i30 += 30;
                                        i28++;
                                    }
                                    iArr16[i29] = (int) j2;
                                    i24 = 32;
                                    j2 >>>= 32;
                                    i30 -= 32;
                                    i31 -= 32;
                                    i29++;
                                }
                            } else if (iArr13[i27] != 0) {
                                break;
                            } else {
                                i27++;
                            }
                        }
                    }
                    i3 = 0;
                    iArr = iArr16;
                } else if (iArr14[i22] != 0) {
                    break;
                } else {
                    i22++;
                }
            }
            numberOfLeadingZeros2 = i8;
            i9 = i2;
            i21 = i4;
            i11 = i7;
            iArr11 = iArr5;
            i13 = i6;
            iArr12 = iArr3;
            i19 = i5;
            iArr14 = iArr2;
            iArr9 = iArr4;
        }
        w9a1.e(i3, i3, iArr, iArr7);
        w9a1.e(4, 5, iArr, iArr7);
        iArr7[9] = iArr7[9] & 16777215;
        int[] iArr18 = new int[10];
        int i33 = i2;
        while (i33 > 0) {
            int i34 = i33 - 1;
            w9a1.d(i34 * 10, 0, iArr6, iArr18);
            w9a1.m(iArr18, iArr7, iArr18);
            w9a1.m(iArr7, aknVarArr[i33].c, iArr7);
            w9a1.d(0, 0, iArr18, aknVarArr[i33].c);
            i33 = i34;
        }
        w9a1.d(0, 0, iArr7, aknVarArr[0].c);
    }

    public static void d(akn aknVar, akn aknVar2, akn aknVar3, u1n u1nVar) {
        int[] iArr = aknVar3.a;
        int[] iArr2 = aknVar3.b;
        int[] iArr3 = (int[]) u1nVar.b;
        int[] iArr4 = (int[]) u1nVar.c;
        w9a1.b(aknVar.b, aknVar.a, iArr2, iArr);
        w9a1.b(aknVar2.b, aknVar2.a, iArr4, iArr3);
        w9a1.m(iArr, iArr3, iArr);
        w9a1.m(iArr2, iArr4, iArr2);
        w9a1.m(aknVar.d, aknVar2.d, iArr3);
        w9a1.m(iArr3, i, iArr3);
        int[] iArr5 = aknVar.c;
        w9a1.a(iArr5, iArr5, iArr4);
        w9a1.m(iArr4, aknVar2.c, iArr4);
        w9a1.b(iArr2, iArr, iArr2, iArr);
        w9a1.b(iArr4, iArr3, iArr4, iArr3);
        w9a1.m(iArr, iArr2, aknVar3.d);
        w9a1.m(iArr3, iArr4, aknVar3.c);
        w9a1.m(iArr, iArr3, iArr);
        w9a1.m(iArr2, iArr4, iArr2);
    }

    public static void e(boolean z, jdj jdjVar, q4g q4gVar, u1n u1nVar) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3 = (int[]) q4gVar.b;
        int[] iArr4 = (int[]) q4gVar.w;
        int[] iArr5 = (int[]) q4gVar.c;
        int[] iArr6 = (int[]) u1nVar.b;
        int[] iArr7 = (int[]) q4gVar.x;
        int[] iArr8 = (int[]) q4gVar.y;
        if (z) {
            iArr2 = iArr3;
            iArr = iArr5;
        } else {
            iArr = iArr3;
            iArr2 = iArr5;
        }
        w9a1.b(iArr5, iArr3, iArr5, iArr3);
        w9a1.m(iArr, (int[]) jdjVar.c, iArr);
        w9a1.m(iArr2, (int[]) jdjVar.b, iArr2);
        w9a1.m(iArr7, iArr8, iArr6);
        w9a1.m(iArr6, (int[]) jdjVar.w, iArr6);
        w9a1.b(iArr5, iArr3, iArr8, iArr7);
        w9a1.b(iArr4, iArr6, iArr2, iArr);
        w9a1.m(iArr3, iArr5, iArr4);
        w9a1.m(iArr3, iArr7, iArr3);
        w9a1.m(iArr5, iArr8, iArr5);
    }

    public static void f(boolean z, akn aknVar, q4g q4gVar, u1n u1nVar) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3 = (int[]) q4gVar.b;
        int[] iArr4 = (int[]) q4gVar.c;
        int[] iArr5 = (int[]) u1nVar.b;
        int[] iArr6 = (int[]) q4gVar.w;
        int[] iArr7 = (int[]) q4gVar.x;
        int[] iArr8 = (int[]) q4gVar.y;
        if (z) {
            iArr2 = iArr3;
            iArr = iArr4;
        } else {
            iArr = iArr3;
            iArr2 = iArr4;
        }
        w9a1.b(iArr4, iArr3, iArr4, iArr3);
        w9a1.m(iArr, aknVar.a, iArr);
        w9a1.m(iArr2, aknVar.b, iArr2);
        w9a1.m(iArr7, iArr8, iArr5);
        w9a1.m(iArr5, aknVar.c, iArr5);
        w9a1.m(iArr6, aknVar.d, iArr6);
        w9a1.b(iArr4, iArr3, iArr8, iArr7);
        w9a1.b(iArr6, iArr5, iArr2, iArr);
        w9a1.m(iArr3, iArr4, iArr6);
        w9a1.m(iArr3, iArr7, iArr3);
        w9a1.m(iArr4, iArr8, iArr4);
    }

    public static void g(q4g q4gVar, akn aknVar) {
        w9a1.d(0, 0, (int[]) q4gVar.b, aknVar.a);
        w9a1.d(0, 0, (int[]) q4gVar.c, aknVar.b);
        w9a1.d(0, 0, (int[]) q4gVar.w, aknVar.c);
        w9a1.m((int[]) q4gVar.x, (int[]) q4gVar.y, aknVar.d);
    }

    public static void h(q4g q4gVar) {
        int[] iArr = (int[]) q4gVar.b;
        int[] iArr2 = (int[]) q4gVar.c;
        int[] iArr3 = (int[]) q4gVar.w;
        int[] iArr4 = (int[]) q4gVar.x;
        int[] iArr5 = (int[]) q4gVar.y;
        w9a1.a(iArr, iArr2, iArr4);
        w9a1.s(iArr, iArr);
        w9a1.s(iArr2, iArr2);
        w9a1.s(iArr3, iArr3);
        w9a1.a(iArr3, iArr3, iArr3);
        w9a1.b(iArr, iArr2, iArr5, iArr2);
        w9a1.s(iArr4, iArr4);
        for (int i2 = 0; i2 < 10; i2++) {
            iArr4[i2] = iArr5[i2] - iArr4[i2];
        }
        w9a1.a(iArr3, iArr2, iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        int i7 = iArr[4];
        int i8 = iArr[5];
        int i9 = iArr[6];
        int i10 = iArr[7];
        int i11 = iArr[8];
        int i12 = i5 + (i4 >> 26);
        int i13 = i7 + (i6 >> 26);
        int i14 = i10 + (i9 >> 26);
        int i15 = iArr[9] + (i11 >> 26);
        int i16 = (i6 & 67108863) + (i12 >> 25);
        int i17 = i8 + (i13 >> 25);
        int i18 = (i11 & 67108863) + (i14 >> 25);
        int i19 = ((i15 >> 25) * 38) + i3;
        int i20 = (i4 & 67108863) + (i19 >> 26);
        int i21 = (i9 & 67108863) + (i17 >> 26);
        iArr[0] = i19 & 67108863;
        iArr[1] = i20 & 67108863;
        iArr[2] = (i12 & 33554431) + (i20 >> 26);
        iArr[3] = i16 & 67108863;
        iArr[4] = (i13 & 33554431) + (i16 >> 26);
        iArr[5] = i17 & 67108863;
        iArr[6] = i21 & 67108863;
        iArr[7] = (i14 & 33554431) + (i21 >> 26);
        iArr[8] = i18 & 67108863;
        iArr[9] = (i15 & 33554431) + (i18 >> 26);
        w9a1.m(iArr, iArr2, iArr3);
        w9a1.m(iArr, iArr4, iArr);
        w9a1.m(iArr2, iArr5, iArr2);
    }

    public static void i(zjn zjnVar, akn[] aknVarArr, u1n u1nVar) {
        akn aknVar = new akn();
        int[] iArr = zjnVar.a;
        int i2 = 0;
        w9a1.d(0, 0, iArr, aknVar.a);
        int[] iArr2 = zjnVar.b;
        w9a1.d(0, 0, iArr2, aknVar.b);
        w9a1.p(aknVar.c);
        w9a1.m(iArr, iArr2, aknVar.d);
        akn aknVar2 = new akn();
        d(aknVar, aknVar, aknVar2, u1nVar);
        while (true) {
            akn aknVar3 = new akn();
            int[] iArr3 = new int[10];
            aknVar3.a = iArr3;
            int[] iArr4 = new int[10];
            aknVar3.b = iArr4;
            int[] iArr5 = new int[10];
            aknVar3.c = iArr5;
            int[] iArr6 = new int[10];
            aknVar3.d = iArr6;
            aknVarArr[i2] = aknVar3;
            w9a1.b(aknVar.b, aknVar.a, iArr4, iArr3);
            w9a1.m(aknVar.d, i, iArr5);
            int[] iArr7 = aknVar.c;
            w9a1.a(iArr7, iArr7, iArr6);
            i2++;
            if (i2 == 4) {
                return;
            } else {
                d(aknVar, aknVar2, aknVar, u1nVar);
            }
        }
    }

    public static void j(int[] iArr, int[] iArr2, zjn zjnVar, int[] iArr3, zjn zjnVar2, q4g q4gVar) {
        boolean z;
        int i2;
        synchronized (k) {
            try {
                int i3 = 10;
                int i4 = 4;
                int i5 = 0;
                if (n != null) {
                    z = true;
                } else {
                    akn[] aknVarArr = new akn[96];
                    u1n u1nVar = new u1n(2);
                    int[] iArr4 = new int[10];
                    int[] iArr5 = new int[10];
                    int[] iArr6 = d;
                    w9a1.d(0, 0, iArr6, iArr4);
                    int[] iArr7 = e;
                    w9a1.d(0, 0, iArr7, iArr5);
                    akn aknVar = new akn();
                    aknVarArr[0] = aknVar;
                    w9a1.d(0, 0, iArr4, aknVar.a);
                    w9a1.d(0, 0, iArr5, aknVar.b);
                    w9a1.p(aknVar.c);
                    w9a1.m(iArr4, iArr5, aknVar.d);
                    akn aknVar2 = new akn();
                    akn aknVar3 = aknVarArr[0];
                    d(aknVar3, aknVar3, aknVar2, u1nVar);
                    for (int i6 = 1; i6 < 16; i6++) {
                        int i7 = 0 + i6;
                        akn aknVar4 = aknVarArr[i7 - 1];
                        akn aknVar5 = new akn();
                        aknVarArr[i7] = aknVar5;
                        d(aknVar4, aknVar2, aknVar5, u1nVar);
                    }
                    z = true;
                    int[] iArr8 = new int[10];
                    int[] iArr9 = new int[10];
                    w9a1.d(0, 0, f, iArr8);
                    w9a1.d(0, 0, g, iArr9);
                    akn aknVar6 = new akn();
                    aknVarArr[16] = aknVar6;
                    w9a1.d(0, 0, iArr8, aknVar6.a);
                    w9a1.d(0, 0, iArr9, aknVar6.b);
                    w9a1.p(aknVar6.c);
                    w9a1.m(iArr8, iArr9, aknVar6.d);
                    akn aknVar7 = new akn();
                    akn aknVar8 = aknVarArr[16];
                    d(aknVar8, aknVar8, aknVar7, u1nVar);
                    for (int i8 = 1; i8 < 16; i8++) {
                        int i9 = 16 + i8;
                        akn aknVar9 = aknVarArr[i9 - 1];
                        akn aknVar10 = new akn();
                        aknVarArr[i9] = aknVar10;
                        d(aknVar9, aknVar7, aknVar10, u1nVar);
                    }
                    q4g q4gVar2 = new q4g(15);
                    w9a1.d(0, 0, iArr6, (int[]) q4gVar2.b);
                    w9a1.d(0, 0, iArr7, (int[]) q4gVar2.c);
                    w9a1.p((int[]) q4gVar2.w);
                    w9a1.d(0, 0, (int[]) q4gVar2.b, (int[]) q4gVar2.x);
                    w9a1.d(0, 0, (int[]) q4gVar2.c, (int[]) q4gVar2.y);
                    akn[] aknVarArr2 = new akn[4];
                    for (int i10 = 0; i10 < 4; i10++) {
                        aknVarArr2[i10] = new akn();
                    }
                    akn aknVar11 = new akn();
                    int i11 = 0;
                    int i12 = 32;
                    while (i11 < 8) {
                        int i13 = i12 + 1;
                        akn aknVar12 = new akn();
                        aknVarArr[i12] = aknVar12;
                        int i14 = i5;
                        while (i14 < i4) {
                            if (i14 == 0) {
                                g(q4gVar2, aknVar12);
                            } else {
                                g(q4gVar2, aknVar11);
                                d(aknVar12, aknVar11, aknVar12, u1nVar);
                            }
                            h(q4gVar2);
                            g(q4gVar2, aknVarArr2[i14]);
                            if (i11 + i14 != i3) {
                                for (int i15 = 1; i15 < 8; i15++) {
                                    h(q4gVar2);
                                }
                            }
                            i14++;
                            i4 = 4;
                        }
                        int[] iArr10 = aknVar12.a;
                        w9a1.n(iArr10, iArr10);
                        int[] iArr11 = aknVar12.d;
                        w9a1.n(iArr11, iArr11);
                        int i16 = i5;
                        i12 = i13;
                        while (i16 < 3) {
                            int i17 = 1 << i16;
                            int i18 = i5;
                            while (i18 < i17) {
                                akn aknVar13 = new akn();
                                aknVarArr[i12] = aknVar13;
                                d(aknVarArr[i12 - i17], aknVarArr2[i16], aknVar13, u1nVar);
                                i18++;
                                i12++;
                            }
                            i16++;
                            i5 = 0;
                        }
                        i11++;
                        i3 = 10;
                        i4 = 4;
                        i5 = 0;
                    }
                    c(aknVarArr);
                    l = new jdj[16];
                    for (int i19 = 0; i19 < 16; i19++) {
                        akn aknVar14 = aknVarArr[i19];
                        jdj[] jdjVarArr = l;
                        jdj jdjVar = new jdj(12);
                        jdjVarArr[i19] = jdjVar;
                        int[] iArr12 = aknVar14.a;
                        w9a1.m(iArr12, aknVar14.c, iArr12);
                        int[] iArr13 = aknVar14.b;
                        w9a1.m(iArr13, aknVar14.c, iArr13);
                        w9a1.b(aknVar14.b, aknVar14.a, (int[]) jdjVar.b, (int[]) jdjVar.c);
                        w9a1.m(aknVar14.a, aknVar14.b, (int[]) jdjVar.w);
                        int[] iArr14 = (int[]) jdjVar.w;
                        w9a1.m(iArr14, j, iArr14);
                        w9a1.o((int[]) jdjVar.c);
                        w9a1.o((int[]) jdjVar.b);
                        w9a1.o((int[]) jdjVar.w);
                    }
                    m = new jdj[16];
                    for (int i20 = 0; i20 < 16; i20++) {
                        akn aknVar15 = aknVarArr[16 + i20];
                        jdj[] jdjVarArr2 = m;
                        jdj jdjVar2 = new jdj(12);
                        jdjVarArr2[i20] = jdjVar2;
                        int[] iArr15 = aknVar15.a;
                        w9a1.m(iArr15, aknVar15.c, iArr15);
                        int[] iArr16 = aknVar15.b;
                        w9a1.m(iArr16, aknVar15.c, iArr16);
                        w9a1.b(aknVar15.b, aknVar15.a, (int[]) jdjVar2.b, (int[]) jdjVar2.c);
                        w9a1.m(aknVar15.a, aknVar15.b, (int[]) jdjVar2.w);
                        int[] iArr17 = (int[]) jdjVar2.w;
                        w9a1.m(iArr17, j, iArr17);
                        w9a1.o((int[]) jdjVar2.c);
                        w9a1.o((int[]) jdjVar2.b);
                        w9a1.o((int[]) jdjVar2.w);
                    }
                    n = new int[1920];
                    int[] iArr18 = new int[10];
                    int[] iArr19 = new int[10];
                    int[] iArr20 = new int[10];
                    int i21 = 0;
                    for (int i22 = 32; i22 < 96; i22++) {
                        akn aknVar16 = aknVarArr[i22];
                        int[] iArr21 = aknVar16.a;
                        w9a1.m(iArr21, aknVar16.c, iArr21);
                        int[] iArr22 = aknVar16.b;
                        w9a1.m(iArr22, aknVar16.c, iArr22);
                        w9a1.b(aknVar16.b, aknVar16.a, iArr19, iArr18);
                        w9a1.m(aknVar16.a, aknVar16.b, iArr20);
                        w9a1.m(iArr20, j, iArr20);
                        w9a1.o(iArr18);
                        w9a1.o(iArr19);
                        w9a1.o(iArr20);
                        w9a1.d(0, i21, iArr18, n);
                        w9a1.d(0, i21 + 10, iArr19, n);
                        w9a1.d(0, i21 + 20, iArr20, n);
                        i21 += 30;
                    }
                }
            } finally {
            }
        }
        byte[] bArr = new byte[256];
        int i23 = 128;
        byte[] bArr2 = new byte[128];
        byte[] bArr3 = new byte[128];
        mn91.f(6, bArr, iArr);
        mn91.f(4, bArr2, iArr2);
        mn91.f(4, bArr3, iArr3);
        akn[] aknVarArr3 = new akn[4];
        akn[] aknVarArr4 = new akn[4];
        u1n u1nVar2 = new u1n(2);
        i(zjnVar, aknVarArr3, u1nVar2);
        i(zjnVar2, aknVarArr4, u1nVar2);
        int[] iArr23 = (int[]) q4gVar.b;
        for (int i24 = 0; i24 < 10; i24++) {
            iArr23[i24] = 0;
        }
        w9a1.p((int[]) q4gVar.c);
        w9a1.p((int[]) q4gVar.w);
        int[] iArr24 = (int[]) q4gVar.x;
        for (int i25 = 0; i25 < 10; i25++) {
            iArr24[i25] = 0;
        }
        w9a1.p((int[]) q4gVar.y);
        while (true) {
            i2 = i23 - 1;
            if (i2 < 0) {
                break;
            }
            if ((bArr[i23 + HProv.PP_VERSION_TIMESTAMP] | bArr[i2] | bArr2[i2] | bArr3[i2]) != 0) {
                break;
            } else {
                i23 = i2;
            }
        }
        while (i2 >= 0) {
            byte b2 = bArr[i2];
            if (b2 != 0) {
                e(b2 < 0 ? z : false, l[(b2 >> 1) ^ (b2 >> 31)], q4gVar, u1nVar2);
            }
            byte b3 = bArr[i2 + 128];
            if (b3 != 0) {
                e(b3 < 0 ? z : false, m[(b3 >> 1) ^ (b3 >> 31)], q4gVar, u1nVar2);
            }
            byte b4 = bArr2[i2];
            if (b4 != 0) {
                f(b4 < 0 ? z : false, aknVarArr3[(b4 >> 1) ^ (b4 >> 31)], q4gVar, u1nVar2);
            }
            byte b5 = bArr3[i2];
            if (b5 != 0) {
                f(b5 < 0 ? z : false, aknVarArr4[(b5 >> 1) ^ (b5 >> 31)], q4gVar, u1nVar2);
            }
            h(q4gVar);
            i2--;
        }
        h(q4gVar);
        h(q4gVar);
    }
}
