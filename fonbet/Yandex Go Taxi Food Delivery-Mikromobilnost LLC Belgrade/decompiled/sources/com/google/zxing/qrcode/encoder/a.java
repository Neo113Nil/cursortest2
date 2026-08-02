package com.google.zxing.qrcode.encoder;

import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import defpackage.aa31;
import defpackage.b64;
import defpackage.i6z0;
import defpackage.kn1;
import defpackage.li20;
import defpackage.nuu0;
import defpackage.o36;
import defpackage.oib1;
import defpackage.pk91;
import defpackage.q5g0;
import defpackage.ryn;
import defpackage.rys;
import defpackage.uz5;
import defpackage.we6;
import defpackage.yxf0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class a {
    public static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    public static final Charset b = StandardCharsets.ISO_8859_1;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051 A[LOOP:0: B:13:0x0026->B:20:0x0051, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(String str, Mode mode, uz5 uz5Var, Charset charset) {
        int i;
        int i2 = ryn.a[mode.ordinal()];
        int i3 = 0;
        if (i2 == 1) {
            int length = str.length();
            while (i3 < length) {
                int charAt = str.charAt(i3) - '0';
                int i4 = i3 + 2;
                if (i4 < length) {
                    uz5Var.b(b64.b(str.charAt(i3 + 1) - '0', 10, charAt * 100, str.charAt(i4) - '0'), 10);
                    i3 += 3;
                } else {
                    i3++;
                    if (i3 < length) {
                        uz5Var.b((charAt * 10) + (str.charAt(i3) - '0'), 7);
                        i3 = i4;
                    } else {
                        uz5Var.b(charAt, 4);
                    }
                }
            }
            return;
        }
        if (i2 == 2) {
            int length2 = str.length();
            while (i3 < length2) {
                char charAt2 = str.charAt(i3);
                int[] iArr = a;
                int i5 = charAt2 < '`' ? iArr[charAt2] : -1;
                if (i5 == -1) {
                    throw new WriterException();
                }
                int i6 = i3 + 1;
                if (i6 < length2) {
                    char charAt3 = str.charAt(i6);
                    int i7 = charAt3 < '`' ? iArr[charAt3] : -1;
                    if (i7 == -1) {
                        throw new WriterException();
                    }
                    uz5Var.b((i5 * 45) + i7, 11);
                    i3 += 2;
                } else {
                    uz5Var.b(i5, 6);
                    i3 = i6;
                }
            }
            return;
        }
        if (i2 == 3) {
            byte[] bytes = str.getBytes(charset);
            int length3 = bytes.length;
            while (i3 < length3) {
                uz5Var.b(bytes[i3], 8);
                i3++;
            }
            return;
        }
        if (i2 != 4) {
            throw new WriterException("Invalid mode: " + mode);
        }
        Charset charset2 = nuu0.b;
        if (charset2 == null) {
            throw new WriterException("SJIS Charset not supported on this platform");
        }
        byte[] bytes2 = str.getBytes(charset2);
        if (bytes2.length % 2 != 0) {
            throw new WriterException("Kanji byte size not even");
        }
        int length4 = bytes2.length - 1;
        while (i3 < length4) {
            int i8 = ((bytes2[i3] & 255) << 8) | (bytes2[i3 + 1] & 255);
            int i9 = 33088;
            if (i8 < 33088 || i8 > 40956) {
                if (i8 < 57408 || i8 > 60351) {
                    i = -1;
                    if (i != -1) {
                        throw new WriterException("Invalid byte sequence");
                    }
                    uz5Var.b(((i >> 8) * 192) + (i & 255), 13);
                    i3 += 2;
                } else {
                    i9 = 49472;
                }
            }
            i = i8 - i9;
            if (i != -1) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x046e, code lost:
    
        if (r4 < 8) goto L219;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0248 A[LOOP:27: B:361:0x0246->B:362:0x0248, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0294 A[LOOP:2: B:58:0x0292->B:59:0x0294, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static q5g0 b(String str, ErrorCorrectionLevel errorCorrectionLevel, Map map) {
        boolean z;
        boolean z2;
        boolean z3;
        Charset forName;
        int i;
        Mode mode;
        Mode mode2;
        aa31 c;
        int i2;
        int i3;
        int e;
        int i4;
        uz5 uz5Var;
        aa31 aa31Var;
        CharacterSetECI a2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        byte[][] bArr;
        int i12;
        char c2;
        int i13 = 1;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.GS1_FORMAT;
            if (map.containsKey(encodeHintType) && Boolean.parseBoolean(map.get(encodeHintType).toString())) {
                z = true;
                if (map != null) {
                    EncodeHintType encodeHintType2 = EncodeHintType.QR_COMPACT;
                    if (map.containsKey(encodeHintType2) && Boolean.parseBoolean(map.get(encodeHintType2).toString())) {
                        z2 = true;
                        z3 = map == null && map.containsKey(EncodeHintType.CHARACTER_SET);
                        Charset charset = b;
                        if (z3) {
                            try {
                                forName = Charset.forName(map.get(EncodeHintType.CHARACTER_SET).toString());
                            } catch (UnsupportedCharsetException unused) {
                            }
                            int i14 = 4;
                            int i15 = 8;
                            if (z2) {
                                i = 1;
                                Charset charset2 = nuu0.b;
                                if (charset2 != null && charset2.equals(forName) && c(str)) {
                                    mode = Mode.KANJI;
                                } else {
                                    boolean z4 = false;
                                    boolean z5 = false;
                                    int i16 = 0;
                                    while (true) {
                                        if (i16 < str.length()) {
                                            char charAt = str.charAt(i16);
                                            if (charAt < '0' || charAt > '9') {
                                                if ((charAt < '`' ? a[charAt] : -1) == -1) {
                                                    mode = Mode.BYTE;
                                                    break;
                                                }
                                                z4 = true;
                                            } else {
                                                z5 = true;
                                            }
                                            i16++;
                                        } else {
                                            mode = z4 ? Mode.ALPHANUMERIC : z5 ? Mode.NUMERIC : Mode.BYTE;
                                        }
                                    }
                                }
                                mode2 = mode;
                                uz5 uz5Var2 = new uz5();
                                Mode mode3 = Mode.BYTE;
                                if (mode2 == mode3 && z3 && (a2 = CharacterSetECI.a(forName)) != null) {
                                    uz5Var2.b(Mode.ECI.a(), 4);
                                    uz5Var2.b(a2.f(), 8);
                                }
                                if (z) {
                                    uz5Var2.b(Mode.FNC1_FIRST_POSITION.a(), 4);
                                }
                                uz5Var2.b(mode2.a(), 4);
                                uz5 uz5Var3 = new uz5();
                                a(str, mode2, uz5Var3, forName);
                                if (map != null) {
                                    EncodeHintType encodeHintType3 = EncodeHintType.QR_VERSION;
                                    if (map.containsKey(encodeHintType3)) {
                                        aa31 c3 = aa31.c(Integer.parseInt(map.get(encodeHintType3).toString()));
                                        if (!d(mode2.b(c3) + uz5Var2.b + uz5Var3.b, c3, errorCorrectionLevel)) {
                                            throw new WriterException("Data too big for requested version");
                                        }
                                        c = c3;
                                        uz5 uz5Var4 = new uz5();
                                        i2 = uz5Var2.b;
                                        uz5Var4.c(uz5Var4.b + i2);
                                        for (i3 = 0; i3 < i2; i3++) {
                                            uz5Var4.a(uz5Var2.d(i3));
                                        }
                                        e = mode2 != mode3 ? uz5Var3.e() : str.length();
                                        int b2 = mode2.b(c);
                                        i4 = 1 << b2;
                                        if (e < i4) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(e);
                                            sb.append(" is bigger than ");
                                            sb.append(i4 - 1);
                                            throw new WriterException(sb.toString());
                                        }
                                        uz5Var4.b(e, b2);
                                        int i17 = uz5Var3.b;
                                        uz5Var4.c(uz5Var4.b + i17);
                                        for (int i18 = 0; i18 < i17; i18++) {
                                            uz5Var4.a(uz5Var3.d(i18));
                                        }
                                        uz5Var = uz5Var4;
                                        aa31Var = c;
                                    }
                                }
                                int b3 = mode2.b(aa31.c(1)) + uz5Var2.b + uz5Var3.b;
                                int i19 = 1;
                                while (i19 <= 40) {
                                    aa31 c4 = aa31.c(i19);
                                    if (d(b3, c4, errorCorrectionLevel)) {
                                        int b4 = mode2.b(c4) + uz5Var2.b + uz5Var3.b;
                                        int i20 = 1;
                                        while (i20 <= 40) {
                                            c = aa31.c(i20);
                                            if (d(b4, c, errorCorrectionLevel)) {
                                                uz5 uz5Var42 = new uz5();
                                                i2 = uz5Var2.b;
                                                uz5Var42.c(uz5Var42.b + i2);
                                                while (i3 < i2) {
                                                }
                                                if (mode2 != mode3) {
                                                }
                                                int b22 = mode2.b(c);
                                                i4 = 1 << b22;
                                                if (e < i4) {
                                                }
                                            } else {
                                                i20++;
                                                i14 = i14;
                                                i15 = 8;
                                            }
                                        }
                                        throw new WriterException("Data too big");
                                    }
                                    i19++;
                                    i14 = i14;
                                    i15 = 8;
                                }
                                throw new WriterException("Data too big");
                            }
                            mode2 = Mode.BYTE;
                            if (forName.equals(charset)) {
                                forName = null;
                            }
                            d dVar = new d(str, forName, z, errorCorrectionLevel);
                            aa31[] aa31VarArr = {d.e(MinimalEncoder$VersionSize.SMALL), d.e(MinimalEncoder$VersionSize.MEDIUM), d.e(MinimalEncoder$VersionSize.LARGE)};
                            c[] cVarArr = {dVar.d(aa31VarArr[0]), dVar.d(aa31VarArr[1]), dVar.d(aa31VarArr[2])};
                            int i21 = 0;
                            int i22 = -1;
                            int i23 = Integer.MAX_VALUE;
                            while (i21 < 3) {
                                c cVar = cVarArr[i21];
                                int a3 = cVar.a(cVar.b);
                                int i24 = i13;
                                if (d(a3, aa31VarArr[i21], dVar.d) && a3 < i23) {
                                    i22 = i21;
                                    i23 = a3;
                                }
                                i21++;
                                i13 = i24;
                            }
                            i = i13;
                            if (i22 < 0) {
                                throw new WriterException("Data too big for any version");
                            }
                            c cVar2 = cVarArr[i22];
                            uz5Var = new uz5();
                            Iterator it = cVar2.a.iterator();
                            while (it.hasNext()) {
                                li20 li20Var = (li20) it.next();
                                int i25 = li20Var.c;
                                c cVar3 = li20Var.e;
                                d dVar2 = cVar3.c;
                                Mode mode4 = li20Var.a;
                                uz5Var.b(mode4.a(), 4);
                                int i26 = li20Var.d;
                                if (i26 > 0) {
                                    uz5Var.b(li20Var.a(), mode4.b(cVar3.b));
                                }
                                if (mode4 == Mode.ECI) {
                                    uz5Var.b(CharacterSetECI.a(dVar2.c.a[i25].charset()).f(), 8);
                                } else if (i26 > 0) {
                                    String str2 = dVar2.a;
                                    int i27 = li20Var.b;
                                    a(str2.substring(i27, i26 + i27), mode4, uz5Var, dVar2.c.a[i25].charset());
                                }
                            }
                            aa31Var = cVar2.b;
                            we6 we6Var = aa31Var.c[errorCorrectionLevel.ordinal()];
                            int i28 = aa31Var.d;
                            int i29 = we6Var.b;
                            i6z0[] i6z0VarArr = (i6z0[]) we6Var.c;
                            int i30 = 0;
                            for (i6z0 i6z0Var : i6z0VarArr) {
                                i30 += i6z0Var.b;
                            }
                            int i31 = i28 - (i30 * i29);
                            i5 = i31 * 8;
                            if (uz5Var.b <= i5) {
                                throw new WriterException("data bits cannot fit in the QR Code" + uz5Var.b + " > " + i5);
                            }
                            for (int i32 = 0; i32 < i14 && uz5Var.b < i5; i32++) {
                                uz5Var.a(false);
                            }
                            int i33 = uz5Var.b & 7;
                            if (i33 > 0) {
                                while (i33 < i15) {
                                    uz5Var.a(false);
                                    i33++;
                                }
                            }
                            int e2 = i31 - uz5Var.e();
                            for (int i34 = 0; i34 < e2; i34++) {
                                uz5Var.b((i34 & 1) == 0 ? 236 : 17, i15);
                            }
                            if (uz5Var.b != i5) {
                                throw new WriterException("Bits size does not equal capacity");
                            }
                            int i35 = 0;
                            for (i6z0 i6z0Var2 : i6z0VarArr) {
                                i35 += i6z0Var2.b;
                            }
                            if (uz5Var.e() != i31) {
                                throw new WriterException("Number of bits and data bytes does not match");
                            }
                            ArrayList arrayList = new ArrayList(i35);
                            int i36 = 0;
                            int i37 = 0;
                            int i38 = 0;
                            int i39 = 0;
                            while (i36 < i35) {
                                int i40 = i;
                                int[] iArr = new int[i40];
                                int[] iArr2 = new int[i40];
                                if (i36 >= i35) {
                                    throw new WriterException("Block ID too large");
                                }
                                int i41 = i28 % i35;
                                int i42 = i35 - i41;
                                int i43 = i28 / i35;
                                int i44 = i31 / i35;
                                int i45 = i44 + 1;
                                int i46 = i43 - i44;
                                int i47 = (i43 + 1) - i45;
                                if (i46 != i47) {
                                    throw new WriterException("EC bytes mismatch");
                                }
                                if (i35 != i42 + i41) {
                                    throw new WriterException("RS blocks mismatch");
                                }
                                if (i28 != ((i45 + i47) * i41) + ((i44 + i46) * i42)) {
                                    throw new WriterException("Total bytes mismatch");
                                }
                                if (i36 < i42) {
                                    c2 = 0;
                                    iArr[0] = i44;
                                    iArr2[0] = i46;
                                } else {
                                    c2 = 0;
                                    iArr[0] = i45;
                                    iArr2[0] = i47;
                                }
                                int i48 = iArr[c2];
                                byte[] bArr2 = new byte[i48];
                                int i49 = i37 * 8;
                                int i50 = i36;
                                int i51 = 0;
                                while (i51 < i48) {
                                    int i52 = i51;
                                    int i53 = i35;
                                    int i54 = 0;
                                    for (int i55 = 0; i55 < 8; i55++) {
                                        if (uz5Var.d(i49)) {
                                            i54 = (1 << (7 - i55)) | i54;
                                        }
                                        i49++;
                                    }
                                    bArr2[i52] = (byte) i54;
                                    i51 = i52 + 1;
                                    i35 = i53;
                                }
                                int i56 = i35;
                                int i57 = iArr2[0];
                                int[] iArr3 = new int[i48 + i57];
                                for (int i58 = 0; i58 < i48; i58++) {
                                    iArr3[i58] = bArr2[i58] & 255;
                                }
                                new yxf0(rys.l).f(i57, iArr3);
                                byte[] bArr3 = new byte[i57];
                                int i59 = 0;
                                while (i59 < i57) {
                                    int[] iArr4 = iArr3;
                                    bArr3[i59] = (byte) iArr4[i48 + i59];
                                    i59++;
                                    iArr3 = iArr4;
                                }
                                arrayList.add(new o36(bArr2, bArr3));
                                i39 = Math.max(i39, i48);
                                i38 = Math.max(i38, i57);
                                i37 += iArr[0];
                                i36 = i50 + 1;
                                i35 = i56;
                                i = 1;
                            }
                            if (i31 != i37) {
                                throw new WriterException("Data bytes does not match offset");
                            }
                            uz5 uz5Var5 = new uz5();
                            for (int i60 = 0; i60 < i39; i60++) {
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    byte[] bArr4 = ((o36) it2.next()).a;
                                    if (i60 < bArr4.length) {
                                        uz5Var5.b(bArr4[i60], 8);
                                    }
                                }
                            }
                            for (int i61 = 0; i61 < i38; i61++) {
                                Iterator it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    byte[] bArr5 = ((o36) it3.next()).b;
                                    if (i61 < bArr5.length) {
                                        uz5Var5.b(bArr5[i61], 8);
                                    }
                                }
                            }
                            if (i28 != uz5Var5.e()) {
                                StringBuilder t = b64.t(i28, "Interleaving error: ", " and ");
                                t.append(uz5Var5.e());
                                t.append(" differ.");
                                throw new WriterException(t.toString());
                            }
                            q5g0 q5g0Var = new q5g0();
                            q5g0Var.b = errorCorrectionLevel;
                            q5g0Var.a = mode2;
                            q5g0Var.c = aa31Var;
                            int i62 = (aa31Var.a * 4) + 17;
                            kn1 kn1Var = new kn1(i62, i62);
                            if (map != null) {
                                EncodeHintType encodeHintType4 = EncodeHintType.QR_MASK_PATTERN;
                                if (map.containsKey(encodeHintType4)) {
                                    i7 = Integer.parseInt(map.get(encodeHintType4).toString());
                                    i6 = 8;
                                    if (i7 >= 0) {
                                    }
                                    i7 = -1;
                                    int i63 = -1;
                                    if (i7 == -1) {
                                        int i64 = Integer.MAX_VALUE;
                                        int i65 = 0;
                                        while (i65 < i6) {
                                            pk91.a(uz5Var5, errorCorrectionLevel, aa31Var, i65, kn1Var);
                                            int i66 = 0;
                                            int e3 = oib1.e(kn1Var, false) + oib1.e(kn1Var, true);
                                            byte[][] bArr6 = (byte[][]) kn1Var.w;
                                            int i67 = kn1Var.c;
                                            int i68 = 0;
                                            int i69 = 0;
                                            while (true) {
                                                int i70 = i67 - 1;
                                                i8 = kn1Var.b;
                                                if (i68 >= i70) {
                                                    break;
                                                }
                                                byte[] bArr7 = bArr6[i68];
                                                int i71 = i69;
                                                int i72 = i66;
                                                while (i72 < i8 - 1) {
                                                    byte b5 = bArr7[i72];
                                                    int i73 = i72 + 1;
                                                    int i74 = e3;
                                                    if (b5 == bArr7[i73]) {
                                                        byte[] bArr8 = bArr6[i68 + 1];
                                                        if (b5 == bArr8[i72] && b5 == bArr8[i73]) {
                                                            i71++;
                                                        }
                                                    }
                                                    e3 = i74;
                                                    i72 = i73;
                                                }
                                                i68++;
                                                i69 = i71;
                                                i66 = 0;
                                            }
                                            int i75 = (i69 * 3) + e3;
                                            int i76 = 0;
                                            for (int i77 = 0; i77 < i67; i77++) {
                                                int i78 = 0;
                                                while (i78 < i8) {
                                                    byte[] bArr9 = bArr6[i77];
                                                    int i79 = i76;
                                                    int i80 = i78 + 6;
                                                    if (i80 < i8) {
                                                        i9 = i65;
                                                        if (bArr9[i78] == 1 && bArr9[i78 + 1] == 0 && bArr9[i78 + 2] == 1 && bArr9[i78 + 3] == 1 && bArr9[i78 + 4] == 1 && bArr9[i78 + 5] == 0 && bArr9[i80] == 1) {
                                                            int i81 = i78 - 4;
                                                            if (i81 >= 0 && bArr9.length >= i78) {
                                                                while (i81 < i78) {
                                                                    int i82 = i81;
                                                                    if (bArr9[i81] != 1) {
                                                                        i81 = i82 + 1;
                                                                    }
                                                                }
                                                                i10 = i79 + 1;
                                                                i11 = i77 + 6;
                                                                if (i11 < i67) {
                                                                    i12 = i10;
                                                                    byte b6 = 1;
                                                                    if (bArr6[i77][i78] == 1 && bArr6[i77 + 1][i78] == 0 && bArr6[i77 + 2][i78] == 1 && bArr6[i77 + 3][i78] == 1 && bArr6[i77 + 4][i78] == 1 && bArr6[i77 + 5][i78] == 0 && bArr6[i11][i78] == 1) {
                                                                        int i83 = i77 - 4;
                                                                        if (i83 >= 0 && bArr6.length >= i77) {
                                                                            while (i83 < i77) {
                                                                                if (bArr6[i83][i78] != b6) {
                                                                                    i83++;
                                                                                    b6 = 1;
                                                                                }
                                                                            }
                                                                            bArr = bArr6;
                                                                            i76 = i12 + 1;
                                                                            i78++;
                                                                            bArr6 = bArr;
                                                                            i65 = i9;
                                                                        }
                                                                        int i84 = i77 + 7;
                                                                        int i85 = i77 + 11;
                                                                        if (i84 >= 0 && bArr6.length >= i85) {
                                                                            while (i84 < i85) {
                                                                                bArr = bArr6;
                                                                                if (bArr6[i84][i78] != 1) {
                                                                                    i84++;
                                                                                    bArr6 = bArr;
                                                                                }
                                                                            }
                                                                            bArr = bArr6;
                                                                            i76 = i12 + 1;
                                                                            i78++;
                                                                            bArr6 = bArr;
                                                                            i65 = i9;
                                                                        }
                                                                    }
                                                                    bArr = bArr6;
                                                                } else {
                                                                    bArr = bArr6;
                                                                    i12 = i10;
                                                                }
                                                                i76 = i12;
                                                                i78++;
                                                                bArr6 = bArr;
                                                                i65 = i9;
                                                            }
                                                            int i86 = i78 + 7;
                                                            int i87 = i78 + 11;
                                                            if (i86 >= 0 && bArr9.length >= i87) {
                                                                int i88 = i86;
                                                                while (i88 < i87) {
                                                                    int i89 = i88;
                                                                    int i90 = i87;
                                                                    if (bArr9[i89] != 1) {
                                                                        i88 = i89 + 1;
                                                                        i87 = i90;
                                                                    }
                                                                }
                                                                i10 = i79 + 1;
                                                                i11 = i77 + 6;
                                                                if (i11 < i67) {
                                                                }
                                                                i76 = i12;
                                                                i78++;
                                                                bArr6 = bArr;
                                                                i65 = i9;
                                                            }
                                                        }
                                                    } else {
                                                        i9 = i65;
                                                    }
                                                    i10 = i79;
                                                    i11 = i77 + 6;
                                                    if (i11 < i67) {
                                                    }
                                                    i76 = i12;
                                                    i78++;
                                                    bArr6 = bArr;
                                                    i65 = i9;
                                                }
                                            }
                                            byte[][] bArr10 = bArr6;
                                            int i91 = i65;
                                            int i92 = (i76 * 40) + i75;
                                            int i93 = 0;
                                            for (int i94 = 0; i94 < i67; i94++) {
                                                byte[] bArr11 = bArr10[i94];
                                                for (int i95 = 0; i95 < i8; i95++) {
                                                    if (bArr11[i95] == 1) {
                                                        i93++;
                                                    }
                                                }
                                            }
                                            int i96 = i67 * i8;
                                            int abs = (((Math.abs((i93 * 2) - i96) * 10) / i96) * 10) + i92;
                                            if (abs < i64) {
                                                i64 = abs;
                                                i63 = i91;
                                            }
                                            i65 = i91 + 1;
                                            i6 = 8;
                                        }
                                        i7 = i63;
                                    }
                                    q5g0Var.d = i7;
                                    pk91.a(uz5Var5, errorCorrectionLevel, aa31Var, i7, kn1Var);
                                    q5g0Var.e = kn1Var;
                                    return q5g0Var;
                                }
                            }
                            i6 = 8;
                            i7 = -1;
                            int i632 = -1;
                            if (i7 == -1) {
                            }
                            q5g0Var.d = i7;
                            pk91.a(uz5Var5, errorCorrectionLevel, aa31Var, i7, kn1Var);
                            q5g0Var.e = kn1Var;
                            return q5g0Var;
                        }
                        forName = charset;
                        int i142 = 4;
                        int i152 = 8;
                        if (z2) {
                        }
                        we6 we6Var2 = aa31Var.c[errorCorrectionLevel.ordinal()];
                        int i282 = aa31Var.d;
                        int i292 = we6Var2.b;
                        i6z0[] i6z0VarArr2 = (i6z0[]) we6Var2.c;
                        int i302 = 0;
                        while (r9 < r8) {
                        }
                        int i312 = i282 - (i302 * i292);
                        i5 = i312 * 8;
                        if (uz5Var.b <= i5) {
                        }
                    }
                }
                z2 = false;
                if (map == null) {
                }
                Charset charset3 = b;
                if (z3) {
                }
                forName = charset3;
                int i1422 = 4;
                int i1522 = 8;
                if (z2) {
                }
                we6 we6Var22 = aa31Var.c[errorCorrectionLevel.ordinal()];
                int i2822 = aa31Var.d;
                int i2922 = we6Var22.b;
                i6z0[] i6z0VarArr22 = (i6z0[]) we6Var22.c;
                int i3022 = 0;
                while (r9 < r8) {
                }
                int i3122 = i2822 - (i3022 * i2922);
                i5 = i3122 * 8;
                if (uz5Var.b <= i5) {
                }
            }
        }
        z = false;
        if (map != null) {
        }
        z2 = false;
        if (map == null) {
        }
        Charset charset32 = b;
        if (z3) {
        }
        forName = charset32;
        int i14222 = 4;
        int i15222 = 8;
        if (z2) {
        }
        we6 we6Var222 = aa31Var.c[errorCorrectionLevel.ordinal()];
        int i28222 = aa31Var.d;
        int i29222 = we6Var222.b;
        i6z0[] i6z0VarArr222 = (i6z0[]) we6Var222.c;
        int i30222 = 0;
        while (r9 < r8) {
        }
        int i31222 = i28222 - (i30222 * i29222);
        i5 = i31222 * 8;
        if (uz5Var.b <= i5) {
        }
    }

    public static boolean c(String str) {
        byte[] bytes = str.getBytes(nuu0.b);
        int length = bytes.length;
        if (length % 2 != 0) {
            return false;
        }
        for (int i = 0; i < length; i += 2) {
            int i2 = bytes[i] & 255;
            if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(int i, aa31 aa31Var, ErrorCorrectionLevel errorCorrectionLevel) {
        int i2 = aa31Var.d;
        we6 we6Var = aa31Var.c[errorCorrectionLevel.ordinal()];
        int i3 = we6Var.b;
        int i4 = 0;
        for (i6z0 i6z0Var : (i6z0[]) we6Var.c) {
            i4 += i6z0Var.b;
        }
        return i2 - (i4 * i3) >= (i + 7) / 8;
    }
}
