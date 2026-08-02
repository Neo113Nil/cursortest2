package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes4.dex */
public abstract class lu91 {
    public static final int[] a = {1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, SelfTester_JCP.IMITA};
    public static final int[] b = {-1424848535, -487721339, 580428573, 1745064566, -770181698, 1036971123, 461123738, -1582065343, 1268693629, -889041821, -731974758, 43769659, 0, 0, 0, 16777216};

    public static final ArrayList a(Collection collection, List list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.addAll(collection);
        return arrayList;
    }

    public static final ArrayList b(Iterable iterable, tls tlsVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((Boolean) tlsVar.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static void c(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr[0] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        long j2 = iArr[1] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        long j3 = iArr[2] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        long j4 = iArr[3] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        int i = 4;
        long j5 = iArr[4] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        long j6 = iArr[5] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        long j7 = iArr[6] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        long j8 = iArr[7] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        long j9 = iArr2[0] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        long j10 = j9 * j;
        long j11 = (j9 * j2) + (j10 >>> 32);
        long j12 = (j9 * j3) + (j11 >>> 32);
        long j13 = (j9 * j4) + (j12 >>> 32);
        long j14 = (j9 * j5) + (j13 >>> 32);
        long j15 = (j9 * j6) + (j14 >>> 32);
        long j16 = (j9 * j7) + (j15 >>> 32);
        long j17 = (j9 * j8) + (j16 >>> 32);
        int i2 = 8;
        int[] iArr4 = {(int) j10, (int) j11, (int) j12, (int) j13, (int) j14, (int) j15, (int) j16, (int) j17, (int) (j17 >>> 32), 0, 0, 0};
        int i3 = 1;
        while (i3 < i) {
            long j18 = iArr2[i3] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
            long j19 = (j18 * j) + (iArr4[i3] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            iArr4[i3] = (int) j19;
            int i4 = i3 + 1;
            int i5 = i;
            int[] iArr5 = iArr4;
            long j20 = (j18 * j2) + (iArr4[i4] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (j19 >>> 32);
            iArr5[i4] = (int) j20;
            long j21 = (j18 * j3) + (iArr5[r5] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (j20 >>> 32);
            iArr5[i3 + 2] = (int) j21;
            long j22 = (j18 * j4) + (iArr5[r5] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (j21 >>> 32);
            iArr5[i3 + 3] = (int) j22;
            long j23 = (j18 * j5) + (iArr5[r5] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (j22 >>> 32);
            iArr5[i3 + 4] = (int) j23;
            long j24 = (j18 * j6) + (iArr5[r5] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (j23 >>> 32);
            iArr5[i3 + 5] = (int) j24;
            long j25 = (j18 * j7) + (iArr5[r5] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (j24 >>> 32);
            iArr5[i3 + 6] = (int) j25;
            long j26 = (j18 * j8) + (iArr5[r5] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (j25 >>> 32);
            iArr5[i3 + 7] = (int) j26;
            iArr5[i3 + 8] = (int) (j26 >>> 32);
            i3 = i4;
            i = i5;
            i2 = i2;
            iArr4 = iArr5;
        }
        int[] iArr6 = iArr4;
        int i6 = i;
        int i7 = i2;
        if (iArr2[3] < 0) {
            int[] iArr7 = a;
            long j27 = (iArr7[0] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (iArr6[i6] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            int i8 = (int) j27;
            iArr6[i6] = i8;
            long j28 = (iArr7[1] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (iArr6[5] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (j27 >>> 32);
            int i9 = (int) j28;
            iArr6[5] = i9;
            long j29 = (iArr7[2] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (iArr6[6] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (j28 >>> 32);
            int i10 = (int) j29;
            iArr6[6] = i10;
            long j30 = (iArr7[3] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (iArr6[7] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (j29 >>> 32);
            int i11 = (int) j30;
            iArr6[7] = i11;
            long j31 = (iArr7[i6] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (iArr6[i7] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (j30 >>> 32);
            int i12 = (int) j31;
            iArr6[i7] = i12;
            long j32 = (iArr7[5] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (iArr6[9] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (j31 >>> 32);
            int i13 = (int) j32;
            iArr6[9] = i13;
            long j33 = (iArr7[6] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (iArr6[10] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (j32 >>> 32);
            int i14 = (int) j33;
            iArr6[10] = i14;
            int i15 = (int) ((iArr7[7] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (iArr6[11] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + (j33 >>> 32));
            iArr6[11] = i15;
            long j34 = (i8 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) - (iArr[0] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            iArr6[i6] = (int) j34;
            long j35 = ((i9 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) - (iArr[1] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + (j34 >> 32);
            iArr6[5] = (int) j35;
            long j36 = ((i10 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) - (iArr[2] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + (j35 >> 32);
            iArr6[6] = (int) j36;
            long j37 = ((i11 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) - (iArr[3] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + (j36 >> 32);
            iArr6[7] = (int) j37;
            long j38 = ((i12 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) - (iArr[i6] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + (j37 >> 32);
            iArr6[i7] = (int) j38;
            long j39 = ((i13 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) - (iArr[5] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + (j38 >> 32);
            iArr6[9] = (int) j39;
            long j40 = ((i14 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) - (iArr[6] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + (j39 >> 32);
            iArr6[10] = (int) j40;
            iArr6[11] = (int) (((i15 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) - (iArr[7] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + (j40 >> 32));
        }
        byte[] bArr = new byte[48];
        for (int i16 = 0; i16 < 12; i16++) {
            tnb1.c(iArr6[i16], i16 * 4, bArr);
        }
        long b2 = tnb1.b(0, bArr) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        long a2 = (tnb1.a(i6, bArr) << i6) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        long b3 = tnb1.b(7, bArr) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        long a3 = (tnb1.a(11, bArr) << i6) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        long b4 = tnb1.b(14, bArr) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        long a4 = (tnb1.a(18, bArr) << i6) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        long b5 = tnb1.b(21, bArr) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        long a5 = (tnb1.a(25, bArr) << 4) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        long b6 = tnb1.b(28, bArr) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        long a6 = tnb1.a(32, bArr) << 4;
        long j41 = a6 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        long b7 = tnb1.b(35, bArr);
        long j42 = b7 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        long a7 = tnb1.a(39, bArr) << 4;
        long j43 = a7 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        long b8 = tnb1.b(42, bArr);
        long j44 = ((((bArr[46] & 255) | ((bArr[47] & 255) << 8)) << 4) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) + ((b8 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) >> 28);
        long j45 = b4 - (j44 * (-50998291));
        long j46 = (b8 & 268435455) + (j43 >> 28);
        long j47 = (b5 - (j44 * 127719000)) - (j46 * (-6428113));
        long j48 = (a5 - (j44 * (-6428113))) - (j46 * 5343);
        long j49 = (a7 & 268435455) + (j42 >> 28);
        long j50 = (b7 & 268435455) + (j41 >> 28);
        long j51 = a2 - (j50 * (-50998291));
        long j52 = (b3 - (j49 * (-50998291))) - (j50 * 19280294);
        long j53 = ((a3 - (j46 * (-50998291))) - (j49 * 19280294)) - (j50 * 127719000);
        long j54 = ((j45 - (j46 * 19280294)) - (j49 * 127719000)) - (j50 * (-6428113));
        long j55 = (((a4 - (j44 * 19280294)) - (j46 * 127719000)) - (j49 * (-6428113))) - (j50 * 5343);
        long j56 = (b6 - (j44 * 5343)) + (j48 >> 28);
        long j57 = j48 & 268435455;
        long j58 = j56 & 268435455;
        long j59 = j58 >>> 27;
        long j60 = (a6 & 268435455) + (j56 >> 28) + j59;
        long j61 = b2 - (j60 * (-50998291));
        long j62 = (j51 - (j60 * 19280294)) + (j61 >> 28);
        long j63 = j61 & 268435455;
        long j64 = (j52 - (j60 * 127719000)) + (j62 >> 28);
        long j65 = j62 & 268435455;
        long j66 = (j53 - (j60 * (-6428113))) + (j64 >> 28);
        long j67 = (j54 - (j60 * 5343)) + (j66 >> 28);
        long j68 = j55 + (j67 >> 28);
        long j69 = (j47 - (j49 * 5343)) + (j68 >> 28);
        long j70 = j57 + (j69 >> 28);
        long j71 = j58 + (j70 >> 28);
        long j72 = (j71 >> 28) - j59;
        long j73 = j63 + (j72 & (-50998291));
        long j74 = j65 + (j72 & 19280294) + (j73 >> 28);
        long j75 = (j64 & 268435455) + (j72 & 127719000) + (j74 >> 28);
        long j76 = (j66 & 268435455) + (j72 & (-6428113)) + (j75 >> 28);
        long j77 = (j67 & 268435455) + (j72 & 5343) + (j76 >> 28);
        long j78 = (j68 & 268435455) + (j77 >> 28);
        long j79 = (j69 & 268435455) + (j78 >> 28);
        long j80 = (j70 & 268435455) + (j79 >> 28);
        byte[] bArr2 = new byte[64];
        tnb1.d((j73 & 268435455) | ((j74 & 268435455) << 28), 0, bArr2);
        tnb1.d(((j76 & 268435455) << 28) | (j75 & 268435455), 7, bArr2);
        tnb1.d((j77 & 268435455) | ((j78 & 268435455) << 28), 14, bArr2);
        tnb1.d(((j80 & 268435455) << 28) | (j79 & 268435455), 21, bArr2);
        tnb1.c((int) ((j71 & 268435455) + (j80 >> 28)), 28, bArr2);
        for (int i17 = 0; i17 < i7; i17++) {
            iArr3[i17] = tnb1.b(i17 * 4, bArr2);
        }
    }
}
