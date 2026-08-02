package com.google.zxing.qrcode.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.ReaderException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import defpackage.aa31;
import defpackage.egz;
import defpackage.eyg;
import defpackage.i6z0;
import defpackage.p7s;
import defpackage.pyg;
import defpackage.rv4;
import defpackage.rys;
import defpackage.v5c0;
import defpackage.v891;
import defpackage.vz5;
import defpackage.w511;
import defpackage.we6;
import defpackage.wz5;
import java.util.ArrayList;
import java.util.Map;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final class b {
    public final v5c0 a = new v5c0(22, rys.l);

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[Catch: ChecksumException | FormatException -> 0x0050, TryCatch #2 {ChecksumException | FormatException -> 0x0050, blocks: (B:10:0x0011, B:11:0x0024, B:13:0x0028, B:14:0x002b, B:16:0x002f, B:18:0x0039, B:20:0x003f, B:25:0x0044), top: B:9:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pyg a(vz5 vz5Var, Map map) {
        ChecksumException checksumException;
        vz5 vz5Var2;
        int i;
        a aVar = new a(vz5Var);
        try {
            return b(aVar, map);
        } catch (ChecksumException e) {
            checksumException = e;
            e = null;
            try {
                aVar.d();
                aVar.b = null;
                aVar.c = null;
                aVar.d = true;
                aVar.c();
                aVar.b();
                vz5Var2 = aVar.a;
                i = 0;
                while (i < vz5Var2.a) {
                    int i2 = i + 1;
                    for (int i3 = i2; i3 < vz5Var2.b; i3++) {
                        if (vz5Var2.b(i, i3) != vz5Var2.b(i3, i)) {
                            vz5Var2.a(i3, i);
                            vz5Var2.a(i, i3);
                        }
                    }
                    i = i2;
                }
                pyg b = this.b(aVar, map);
                b.e = new egz();
                return b;
            } catch (ChecksumException | FormatException unused) {
                if (e != null) {
                    throw e;
                }
                throw checksumException;
            }
        } catch (FormatException e2) {
            e = e2;
            checksumException = null;
            aVar.d();
            aVar.b = null;
            aVar.c = null;
            aVar.d = true;
            aVar.c();
            aVar.b();
            vz5Var2 = aVar.a;
            i = 0;
            while (i < vz5Var2.a) {
            }
            pyg b2 = this.b(aVar, map);
            b2.e = new egz();
            return b2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:170:0x039c A[LOOP:21: B:146:0x0231->B:170:0x039c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0369 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pyg b(a aVar, Map map) {
        Mode mode;
        Mode mode2;
        int i;
        boolean z;
        int i2;
        int b;
        aa31 c = aVar.c();
        ErrorCorrectionLevel errorCorrectionLevel = aVar.b().a;
        p7s b2 = aVar.b();
        aa31 c2 = aVar.c();
        DataMask dataMask = DataMask.values()[b2.b];
        vz5 vz5Var = aVar.a;
        int i3 = vz5Var.b;
        dataMask.getClass();
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            for (int i6 = 0; i6 < i3; i6++) {
                if (dataMask.a(i5, i6)) {
                    vz5Var.a(i6, i5);
                }
            }
        }
        int i7 = c2.a * 4;
        int i8 = i7 + 17;
        int i9 = c2.d;
        vz5 vz5Var2 = new vz5(i8, i8);
        vz5Var2.d(0, 0, 9, 9);
        int i10 = i7 + 9;
        vz5Var2.d(i10, 0, 8, 9);
        vz5Var2.d(0, i10, 9, 8);
        int[] iArr = c2.b;
        int length = iArr.length;
        int i11 = 0;
        while (i11 < length) {
            int i12 = iArr[i11] - 2;
            for (int i13 = i4; i13 < length; i13++) {
                if ((i11 != 0 || (i13 != 0 && i13 != length - 1)) && (i11 != length - 1 || i13 != 0)) {
                    vz5Var2.d(iArr[i13] - 2, i12, 5, 5);
                }
            }
            i11++;
            i4 = 0;
        }
        int i14 = 2;
        int i15 = 6;
        int i16 = 1;
        vz5Var2.d(6, 9, 1, i7);
        vz5Var2.d(9, 6, i7, 1);
        if (c2.a > 6) {
            int i17 = i7 + 6;
            vz5Var2.d(i17, 0, 3, 6);
            vz5Var2.d(0, i17, 6, 3);
        }
        byte[] bArr = new byte[i9];
        int i18 = i3 - 1;
        int i19 = i18;
        boolean z2 = true;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        while (i19 > 0) {
            if (i19 == i15) {
                i19--;
            }
            int i23 = 0;
            while (i23 < i3) {
                int i24 = z2 ? i18 - i23 : i23;
                int i25 = i16;
                int i26 = 0;
                for (int i27 = i14; i26 < i27; i27 = 2) {
                    int i28 = i19 - i26;
                    if (!vz5Var2.b(i28, i24)) {
                        i21++;
                        i22 <<= 1;
                        if (vz5Var.b(i28, i24)) {
                            i22 |= 1;
                        }
                        if (i21 == 8) {
                            bArr[i20] = (byte) i22;
                            i20++;
                            i21 = 0;
                            i22 = 0;
                        }
                    }
                    i26++;
                }
                i23++;
                i16 = i25;
                i14 = 2;
            }
            z2 = !z2;
            i19 -= 2;
            i15 = 6;
            i14 = 2;
        }
        int i29 = i16;
        if (i20 != i9) {
            throw FormatException.a();
        }
        if (i9 != c.d) {
            w511.q();
            return null;
        }
        we6 we6Var = c.c[errorCorrectionLevel.ordinal()];
        i6z0[] i6z0VarArr = (i6z0[]) we6Var.c;
        int i30 = we6Var.b;
        int i31 = 0;
        for (i6z0 i6z0Var : i6z0VarArr) {
            i31 += i6z0Var.b;
        }
        rv4[] rv4VarArr = new rv4[i31];
        int i32 = 0;
        for (i6z0 i6z0Var2 : i6z0VarArr) {
            int i33 = 0;
            while (i33 < i6z0Var2.b) {
                int i34 = i6z0Var2.c;
                rv4VarArr[i32] = new rv4(i34, new byte[i30 + i34]);
                i33++;
                i32++;
            }
        }
        int length2 = rv4VarArr[0].b.length;
        int i35 = i31 - 1;
        while (i35 >= 0 && rv4VarArr[i35].b.length != length2) {
            i35--;
        }
        int i36 = i35 + 1;
        int i37 = length2 - i30;
        int i38 = 0;
        int i39 = 0;
        while (i38 < i37) {
            int i40 = i39;
            int i41 = 0;
            while (i41 < i32) {
                rv4VarArr[i41].b[i38] = bArr[i40];
                i41++;
                i40++;
            }
            i38++;
            i39 = i40;
        }
        int i42 = i36;
        while (i42 < i32) {
            rv4VarArr[i42].b[i37] = bArr[i39];
            i42++;
            i39++;
        }
        boolean z3 = false;
        int length3 = rv4VarArr[0].b.length;
        while (i37 < length3) {
            int i43 = i39;
            int i44 = 0;
            while (i44 < i32) {
                rv4VarArr[i44].b[i44 < i36 ? i37 : i37 + 1] = bArr[i43];
                i44++;
                i43++;
            }
            i37++;
            i39 = i43;
        }
        int i45 = 0;
        for (int i46 = 0; i46 < i31; i46++) {
            i45 += rv4VarArr[i46].a;
        }
        byte[] bArr2 = new byte[i45];
        int i47 = 0;
        int i48 = 0;
        int i49 = 0;
        while (i48 < i31) {
            rv4 rv4Var = rv4VarArr[i48];
            byte[] bArr3 = rv4Var.b;
            int i50 = rv4Var.a;
            int length4 = bArr3.length;
            int[] iArr2 = new int[length4];
            for (int i51 = 0; i51 < length4; i51++) {
                iArr2[i51] = bArr3[i51] & 255;
            }
            try {
                int C = this.a.C(bArr3.length - i50, iArr2);
                for (int i52 = 0; i52 < i50; i52++) {
                    bArr3[i52] = (byte) iArr2[i52];
                }
                i47 += C;
                int i53 = i49;
                int i54 = 0;
                while (i54 < i50) {
                    bArr2[i53] = bArr3[i54];
                    i54++;
                    i53++;
                }
                i48++;
                i49 = i53;
            } catch (ReedSolomonException unused) {
                ChecksumException checksumException = ChecksumException.c;
                if (ReaderException.a) {
                    throw new ChecksumException();
                }
                throw ChecksumException.c;
            }
        }
        wz5 wz5Var = new wz5();
        wz5Var.c = bArr2;
        StringBuilder sb = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(i29);
        int i55 = -1;
        int i56 = -1;
        boolean z4 = false;
        boolean z5 = false;
        CharacterSetECI characterSetECI = null;
        while (true) {
            try {
                if (wz5Var.a() < 4) {
                    mode = Mode.TERMINATOR;
                } else {
                    int b3 = wz5Var.b(4);
                    if (b3 == 0) {
                        mode = Mode.TERMINATOR;
                    } else if (b3 == 1) {
                        mode = Mode.NUMERIC;
                    } else if (b3 == 2) {
                        mode = Mode.ALPHANUMERIC;
                    } else if (b3 == 3) {
                        mode = Mode.STRUCTURED_APPEND;
                    } else if (b3 == 4) {
                        mode = Mode.BYTE;
                    } else if (b3 == 5) {
                        mode = Mode.FNC1_FIRST_POSITION;
                    } else if (b3 == 7) {
                        mode = Mode.ECI;
                    } else if (b3 == 8) {
                        mode = Mode.KANJI;
                    } else if (b3 == 9) {
                        mode = Mode.FNC1_SECOND_POSITION;
                    } else {
                        if (b3 != 13) {
                            throw new IllegalArgumentException();
                        }
                        mode = Mode.HANZI;
                    }
                }
                int[] iArr3 = eyg.a;
                switch (iArr3[mode.ordinal()]) {
                    case 5:
                        mode2 = mode;
                        i = i56;
                        z = z5;
                        i2 = i55;
                        if (mode2 == Mode.TERMINATOR) {
                            pyg pygVar = new pyg(bArr2, sb.toString(), arrayList.isEmpty() ? null : arrayList, errorCorrectionLevel.toString(), i2, i, characterSetECI != null ? z3 ? 4 : z ? 6 : 2 : z3 ? 3 : z ? 5 : 1);
                            pygVar.d = Integer.valueOf(i47);
                            return pygVar;
                        }
                        i55 = i2;
                        i56 = i;
                        z5 = z;
                    case 6:
                        mode2 = mode;
                        i = i56;
                        z = z5;
                        z4 = true;
                        z3 = true;
                        i2 = i55;
                        if (mode2 == Mode.TERMINATOR) {
                        }
                        break;
                    case 7:
                        mode2 = mode;
                        i2 = i55;
                        i = i56;
                        z = true;
                        z4 = true;
                        if (mode2 == Mode.TERMINATOR) {
                        }
                        break;
                    case 8:
                        mode2 = mode;
                        if (wz5Var.a() < 16) {
                            throw FormatException.a();
                        }
                        i55 = wz5Var.b(8);
                        i56 = wz5Var.b(8);
                        i = i56;
                        z = z5;
                        i2 = i55;
                        if (mode2 == Mode.TERMINATOR) {
                        }
                        break;
                    case 9:
                        mode2 = mode;
                        int b4 = wz5Var.b(8);
                        if ((b4 & 128) == 0) {
                            b = b4 & HProv.PP_VERSION_TIMESTAMP;
                        } else if ((b4 & 192) == 128) {
                            b = ((b4 & 63) << 8) | wz5Var.b(8);
                        } else {
                            if ((b4 & 224) != 192) {
                                throw FormatException.a();
                            }
                            b = wz5Var.b(16) | ((b4 & 31) << 16);
                        }
                        characterSetECI = CharacterSetECI.c(b);
                        if (characterSetECI == null) {
                            throw FormatException.a();
                        }
                        i = i56;
                        z = z5;
                        i2 = i55;
                        if (mode2 == Mode.TERMINATOR) {
                        }
                        break;
                    case 10:
                        mode2 = mode;
                        int b5 = wz5Var.b(4);
                        int b6 = wz5Var.b(mode2.b(c));
                        if (b5 == 1) {
                            v891.c(wz5Var, sb, b6);
                        }
                        i = i56;
                        z = z5;
                        i2 = i55;
                        if (mode2 == Mode.TERMINATOR) {
                        }
                        break;
                    default:
                        int b7 = wz5Var.b(mode.b(c));
                        int i57 = iArr3[mode.ordinal()];
                        if (i57 == 1) {
                            mode2 = mode;
                            v891.e(wz5Var, sb, b7);
                        } else if (i57 == 2) {
                            mode2 = mode;
                            v891.a(wz5Var, sb, b7, z4);
                        } else if (i57 == 3) {
                            mode2 = mode;
                            v891.b(wz5Var, sb, b7, characterSetECI, arrayList, map);
                        } else {
                            if (i57 != 4) {
                                throw FormatException.a();
                            }
                            v891.d(wz5Var, sb, b7);
                            mode2 = mode;
                        }
                        i = i56;
                        z = z5;
                        i2 = i55;
                        if (mode2 == Mode.TERMINATOR) {
                        }
                        break;
                }
            } catch (IllegalArgumentException unused2) {
                throw FormatException.a();
            }
        }
    }
}
