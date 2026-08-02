package defpackage;

import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes15.dex */
public final class m0z0 {
    public static byte[] a(int i, int i2, byte[] bArr) {
        int i3;
        l0z0 l0z0Var;
        if (i > 100 || i2 > 100) {
            throw new IllegalArgumentException(i + RemoteBioParameters.X + i2 + " doesn't fit in 100x100");
        }
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i3 = i * i2;
            if (i4 >= i3) {
                break;
            }
            float f5 = (bArr[i5 + 3] & 255) / 255.0f;
            float f6 = f5 / 255.0f;
            f2 += (bArr[i5] & 255) * f6;
            f3 += (bArr[i5 + 1] & 255) * f6;
            f4 += f6 * (bArr[i5 + 2] & 255);
            f += f5;
            i4++;
            i5 += 4;
        }
        if (f > 0.0f) {
            f2 /= f;
            f3 /= f;
            f4 /= f;
        }
        boolean z = f < ((float) i3);
        int i6 = z ? 5 : 7;
        int max = Math.max(1, Math.round((i6 * i) / Math.max(i, i2)));
        int max2 = Math.max(1, Math.round((i6 * i2) / Math.max(i, i2)));
        float[] fArr = new float[i3];
        float[] fArr2 = new float[i3];
        float[] fArr3 = new float[i3];
        float[] fArr4 = new float[i3];
        int i7 = 0;
        int i8 = 0;
        while (i7 < i3) {
            float f7 = (bArr[i8 + 3] & 255) / 255.0f;
            float f8 = 1.0f - f7;
            float f9 = f7 / 255.0f;
            float f10 = ((bArr[i8] & 255) * f9) + (f2 * f8);
            boolean z2 = z;
            float f11 = ((bArr[i8 + 1] & 255) * f9) + (f3 * f8);
            float f12 = (f9 * (bArr[i8 + 2] & 255)) + (f8 * f4);
            float f13 = f10 + f11;
            fArr[i7] = (f13 + f12) / 3.0f;
            fArr2[i7] = (f13 / 2.0f) - f12;
            fArr3[i7] = f10 - f11;
            fArr4[i7] = f7;
            i7++;
            i8 += 4;
            z = z2;
        }
        boolean z3 = z;
        l0z0 l0z0Var2 = new l0z0(Math.max(3, max), Math.max(3, max2));
        l0z0Var2.a(i, i2, fArr);
        l0z0 l0z0Var3 = new l0z0(3, 3);
        l0z0Var3.a(i, i2, fArr2);
        l0z0 l0z0Var4 = new l0z0(3, 3);
        l0z0Var4.a(i, i2, fArr3);
        if (z3) {
            l0z0Var = new l0z0(5, 5);
            l0z0Var.a(i, i2, fArr4);
        } else {
            l0z0Var = null;
        }
        boolean z4 = i > i2;
        int round = Math.round(l0z0Var2.c * 63.0f) | (Math.round((l0z0Var3.c * 31.5f) + 31.5f) << 6) | (Math.round((l0z0Var4.c * 31.5f) + 31.5f) << 12) | (Math.round(l0z0Var2.e * 31.0f) << 18) | (z3 ? SelfTester_JCP.ENCRYPT_CNT : 0);
        if (z4) {
            max = max2;
        }
        int round2 = (z4 ? 32768 : 0) | (Math.round(l0z0Var3.e * 63.0f) << 3) | max | (Math.round(l0z0Var4.e * 63.0f) << 9);
        int i9 = z3 ? 6 : 5;
        byte[] bArr2 = new byte[(((((l0z0Var2.d.length + l0z0Var3.d.length) + l0z0Var4.d.length) + (z3 ? l0z0Var.d.length : 0)) + 1) / 2) + i9];
        bArr2[0] = (byte) round;
        bArr2[1] = (byte) (round >> 8);
        bArr2[2] = (byte) (round >> 16);
        bArr2[3] = (byte) round2;
        bArr2[4] = (byte) (round2 >> 8);
        if (z3) {
            bArr2[5] = (byte) (Math.round(l0z0Var.c * 15.0f) | (Math.round(l0z0Var.e * 15.0f) << 4));
        }
        int b = l0z0Var4.b(bArr2, i9, l0z0Var3.b(bArr2, i9, l0z0Var2.b(bArr2, i9, 0)));
        if (z3) {
            l0z0Var.b(bArr2, i9, b);
        }
        return bArr2;
    }

    public static wz5 b(byte[] bArr) {
        char c;
        int i;
        char c2;
        float f;
        l0z0 l0z0Var;
        int i2;
        int i3;
        float f2;
        float[] fArr;
        int i4;
        boolean z;
        int i5 = 0;
        int i6 = (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
        int i7 = 3;
        int i8 = (bArr[3] & 255) | ((bArr[4] & 255) << 8);
        float f3 = (i6 & 63) / 63.0f;
        float f4 = 1.0f;
        float f5 = (((i6 >> 6) & 63) / 31.5f) - 1.0f;
        float f6 = (((i6 >> 12) & 63) / 31.5f) - 1.0f;
        float f7 = ((i6 >> 18) & 31) / 31.0f;
        boolean z2 = (i6 >> 23) != 0;
        float f8 = ((i8 >> 3) & 63) / 63.0f;
        float f9 = ((i8 >> 9) & 63) / 63.0f;
        boolean z3 = (i8 >> 15) != 0;
        if (z3) {
            c = 2;
            i = z2 ? 5 : 7;
        } else {
            c = 2;
            i = i8 & 7;
        }
        int max = Math.max(3, i);
        int max2 = Math.max(3, z3 ? i8 & 7 : z2 ? 5 : 7);
        if (z2) {
            c2 = 4;
            f = (bArr[5] & PKIBody._CCP) / 15.0f;
        } else {
            c2 = 4;
            f = 1.0f;
        }
        float f10 = ((bArr[5] >> 4) & 15) / 15.0f;
        int i9 = z2 ? 6 : 5;
        int i10 = 0;
        while (i10 < max2) {
            float f11 = f4;
            for (int i11 = i10 > 0 ? 0 : 1; i11 * max2 < (max2 - i10) * max; i11++) {
                i5++;
            }
            i10++;
            f4 = f11;
        }
        float f12 = f4;
        float[] fArr2 = new float[i5];
        int i12 = 0;
        int i13 = 0;
        while (i12 < i7) {
            int i14 = i12 > 0 ? 0 : 1;
            while (true) {
                i4 = i7;
                z = z2;
                if (i14 * 3 < (3 - i12) * 3) {
                    i13++;
                    i14++;
                    i7 = i4;
                    z2 = z;
                }
            }
            i12++;
            i7 = i4;
            z2 = z;
        }
        boolean z4 = z2;
        float[] fArr3 = new float[i13];
        int i15 = i7;
        int i16 = 0;
        int i17 = 0;
        while (i16 < i15) {
            int i18 = i16 > 0 ? 0 : 1;
            while (true) {
                fArr = fArr2;
                if (i18 * 3 < (3 - i16) * 3) {
                    i17++;
                    i18++;
                    fArr2 = fArr;
                    i15 = 3;
                }
            }
            i16++;
            fArr2 = fArr;
            i15 = 3;
        }
        float[] fArr4 = fArr2;
        float[] fArr5 = new float[i17];
        int i19 = 0;
        int i20 = 0;
        while (i19 < i5) {
            fArr4[i19] = ((((bArr[i9 + (i20 >> 1)] >> ((i20 & 1) << 2)) & 15) / 7.5f) - f12) * f7;
            i20++;
            i19++;
            i5 = i5;
        }
        float f13 = f8 * 1.25f;
        for (int i21 = 0; i21 < i13; i21++) {
            fArr3[i21] = ((((bArr[i9 + (i20 >> 1)] >> ((i20 & 1) << 2)) & 15) / 7.5f) - f12) * f13;
            i20++;
        }
        float f14 = f9 * 1.25f;
        for (int i22 = 0; i22 < i17; i22++) {
            fArr5[i22] = ((((bArr[i9 + (i20 >> 1)] >> ((i20 & 1) << 2)) & 15) / 7.5f) - f12) * f14;
            i20++;
        }
        if (z4) {
            l0z0Var = new l0z0(5, 5);
            int i23 = 0;
            while (true) {
                float[] fArr6 = l0z0Var.d;
                if (i23 >= fArr6.length) {
                    break;
                }
                fArr6[i23] = ((((bArr[i9 + (i20 >> 1)] >> ((i20 & 1) << 2)) & 15) / 7.5f) - f12) * f10;
                i20++;
                i23++;
            }
        } else {
            l0z0Var = null;
        }
        float[] fArr7 = z4 ? l0z0Var.d : null;
        byte b = bArr[3];
        boolean z5 = (bArr[c] & DerValue.TAG_CONTEXT) != 0;
        boolean z6 = (bArr[c2] & DerValue.TAG_CONTEXT) != 0;
        float f15 = (z6 ? z5 ? 5 : 7 : b & 7) / (z6 ? b & 7 : z5 ? 5 : 7);
        int round = Math.round(f15 > f12 ? 32.0f : f15 * 32.0f);
        int round2 = Math.round(f15 > f12 ? 32.0f / f15 : 32.0f);
        byte[] bArr2 = new byte[round * round2 * 4];
        int max3 = Math.max(max, z4 ? 5 : 3);
        int max4 = Math.max(max2, z4 ? 5 : 3);
        float[] fArr8 = new float[max3];
        float[] fArr9 = new float[max4];
        int i24 = 0;
        int i25 = 0;
        while (i24 < round2) {
            float[] fArr10 = fArr7;
            int i26 = 0;
            while (i26 < round) {
                float[] fArr11 = fArr5;
                int i27 = 0;
                while (i27 < max3) {
                    fArr8[i27] = (float) Math.cos((3.141592653589793d / round) * (i26 + 0.5f) * i27);
                    i27++;
                    f3 = f3;
                    f = f;
                }
                float f16 = f;
                float f17 = f3;
                int i28 = 0;
                while (i28 < max4) {
                    fArr9[i28] = (float) Math.cos(i28 * (i24 + 0.5f) * (3.141592653589793d / round2));
                    i28++;
                    i26 = i26;
                }
                int i29 = i26;
                float f18 = f17;
                int i30 = 0;
                int i31 = 0;
                while (i30 < max2) {
                    float f19 = fArr9[i30] * 2.0f;
                    int i32 = i30 > 0 ? 0 : 1;
                    int i33 = i30;
                    while (true) {
                        f2 = f18;
                        if (i32 * max2 < (max2 - i33) * max) {
                            f18 = (fArr4[i31] * fArr8[i32] * f19) + f2;
                            i32++;
                            i31++;
                        }
                    }
                    i30 = i33 + 1;
                    f18 = f2;
                }
                float f20 = f5;
                float f21 = f6;
                int i34 = 0;
                int i35 = 0;
                while (i34 < 3) {
                    float f22 = fArr9[i34] * 2.0f;
                    int i36 = i34 > 0 ? 0 : 1;
                    while (true) {
                        i3 = i34;
                        if (i36 < 3 - i3) {
                            float f23 = fArr8[i36] * f22;
                            f20 = (fArr3[i35] * f23) + f20;
                            f21 = (fArr11[i35] * f23) + f21;
                            i36++;
                            i35++;
                            i34 = i3;
                        }
                    }
                    i34 = i3 + 1;
                }
                float f24 = f18;
                float f25 = f16;
                if (z4) {
                    int i37 = 0;
                    int i38 = 0;
                    while (i37 < 5) {
                        float f26 = fArr9[i37] * 2.0f;
                        int i39 = i37 > 0 ? 0 : 1;
                        while (true) {
                            i2 = i37;
                            if (i39 < 5 - i2) {
                                f25 += fArr10[i38] * fArr8[i39] * f26;
                                i39++;
                                i38++;
                                i37 = i2;
                            }
                        }
                        i37 = i2 + 1;
                    }
                }
                float f27 = f24 - (f20 * 0.6666667f);
                float f28 = (((3.0f * f24) - f27) + f21) / 2.0f;
                bArr2[i25] = (byte) Math.max(0, Math.round(Math.min(f12, f28) * 255.0f));
                bArr2[i25 + 1] = (byte) Math.max(0, Math.round(Math.min(1.0f, f28 - f21) * 255.0f));
                bArr2[i25 + 2] = (byte) Math.max(0, Math.round(Math.min(1.0f, f27) * 255.0f));
                bArr2[i25 + 3] = (byte) Math.max(0, Math.round(Math.min(1.0f, f25) * 255.0f));
                i26 = i29 + 1;
                i25 += 4;
                f12 = 1.0f;
                fArr5 = fArr11;
                max = max;
                f3 = f17;
                f = f16;
            }
            i24++;
            fArr7 = fArr10;
            max = max;
            f = f;
        }
        wz5 wz5Var = new wz5();
        wz5Var.a = round;
        wz5Var.b = round2;
        wz5Var.c = bArr2;
        return wz5Var;
    }
}
