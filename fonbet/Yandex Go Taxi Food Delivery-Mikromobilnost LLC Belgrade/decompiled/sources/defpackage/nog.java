package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import com.google.zxing.datamatrix.encoder.b;
import com.google.zxing.datamatrix.encoder.c;
import com.google.zxing.datamatrix.encoder.d;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* loaded from: classes11.dex */
public final class nog implements fc51 {
    /* JADX WARN: Removed duplicated region for block: B:236:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02de  */
    @Override // defpackage.fc51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vz5 a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        vz5 vz5Var;
        boolean z;
        int i3;
        int i4;
        azn aznVar;
        StringBuilder sb;
        int i5;
        int i6;
        int length;
        int i7;
        String sb2;
        int length2;
        int i8;
        zzw0 zzw0Var;
        int i9;
        int i10;
        int i11;
        vz5 vz5Var2;
        int i12;
        int i13;
        String str2;
        int i14;
        int i15;
        vz5 vz5Var3;
        vz5 vz5Var4 = null;
        if (str.isEmpty()) {
            ny61.g("Found empty contents");
            return null;
        }
        if (barcodeFormat != BarcodeFormat.DATA_MATRIX) {
            kbs.f(barcodeFormat, "Can only encode DATA_MATRIX, but got ");
            return null;
        }
        if (i < 0 || i2 < 0) {
            h490.a(i, i2, "Requested dimensions can't be negative: ");
            return null;
        }
        SymbolShapeHint symbolShapeHint = SymbolShapeHint.FORCE_NONE;
        if (map != null) {
            SymbolShapeHint symbolShapeHint2 = (SymbolShapeHint) map.get(EncodeHintType.DATA_MATRIX_SHAPE);
            if (symbolShapeHint2 != null) {
                symbolShapeHint = symbolShapeHint2;
            }
            if (map.get(EncodeHintType.MIN_SIZE) != null) {
                ny61.u();
                return null;
            }
            if (map.get(EncodeHintType.MAX_SIZE) != null) {
                ny61.u();
                return null;
            }
        }
        SymbolShapeHint symbolShapeHint3 = symbolShapeHint;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.DATA_MATRIX_COMPACT;
            if (map.containsKey(encodeHintType) && Boolean.parseBoolean(map.get(encodeHintType).toString())) {
                EncodeHintType encodeHintType2 = EncodeHintType.GS1_FORMAT;
                boolean z2 = map.containsKey(encodeHintType2) && Boolean.parseBoolean(map.get(encodeHintType2).toString());
                EncodeHintType encodeHintType3 = EncodeHintType.CHARACTER_SET;
                Charset forName = map.containsKey(encodeHintType3) ? Charset.forName(map.get(encodeHintType3).toString()) : null;
                int i16 = z2 ? 29 : -1;
                if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
                    str2 = oyr.g(2, 7, str);
                    i14 = 2;
                    i15 = 5;
                } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
                    str2 = oyr.g(2, 7, str);
                    i14 = 2;
                    i15 = 6;
                } else {
                    str2 = str;
                    i14 = 2;
                    i15 = 0;
                }
                ki20 ki20Var = new ki20(str2, forName, i16, symbolShapeHint3, i15);
                int length3 = ki20Var.b.length;
                int[] iArr = new int[i14];
                iArr[1] = 6;
                iArr[0] = length3 + 1;
                b[][] bVarArr = (b[][]) Array.newInstance((Class<?>) b.class, iArr);
                d.b(ki20Var, bVarArr, 0, null);
                for (int i17 = 1; i17 <= length3; i17++) {
                    for (int i18 = 0; i18 < 6; i18++) {
                        b bVar = bVarArr[i17][i18];
                        if (bVar != null && i17 < length3) {
                            d.b(ki20Var, bVarArr, i17, bVar);
                        }
                    }
                    for (int i19 = 0; i19 < 6; i19++) {
                        bVarArr[i17 - 1][i19] = null;
                    }
                }
                int i20 = 0;
                int i21 = Integer.MAX_VALUE;
                int i22 = -1;
                while (i20 < 6) {
                    b bVar2 = bVarArr[length3][i20];
                    if (bVar2 != null) {
                        int i23 = bVar2.f;
                        vz5Var3 = vz5Var4;
                        if (i20 >= 1 && i20 <= 3) {
                            i23++;
                        }
                        if (i23 < i21) {
                            i21 = i23;
                            i22 = i20;
                        }
                    } else {
                        vz5Var3 = vz5Var4;
                    }
                    i20++;
                    vz5Var4 = vz5Var3;
                }
                vz5Var = vz5Var4;
                if (i22 < 0) {
                    vg10.p("Failed to encode \"", ki20Var, "\"");
                    return vz5Var;
                }
                sb2 = new String(new c(bVarArr[length3][i22]).a, StandardCharsets.ISO_8859_1);
                i4 = 0;
                i3 = 7;
                zzw0 e = zzw0.e(sb2.length(), symbolShapeHint3);
                int i24 = e.e;
                int i25 = e.d;
                int[] iArr2 = v6o.a;
                length2 = sb2.length();
                i8 = e.b;
                int i26 = e.c;
                if (length2 != i8) {
                    ny61.g("The number of codewords does not match the selected symbol");
                    return vz5Var;
                }
                StringBuilder sb3 = new StringBuilder(i8 + i26);
                sb3.append(sb2);
                int c = e.c();
                if (c == 1) {
                    sb3.append(v6o.a(i26, sb2));
                } else {
                    sb3.setLength(sb3.capacity());
                    int[] iArr3 = new int[c];
                    int[] iArr4 = new int[c];
                    int i27 = i4;
                    while (i27 < c) {
                        int i28 = i27 + 1;
                        iArr3[i27] = e.a(i28);
                        iArr4[i27] = e.h;
                        i27 = i28;
                    }
                    for (int i29 = i4; i29 < c; i29++) {
                        StringBuilder sb4 = new StringBuilder(iArr3[i29]);
                        for (int i30 = i29; i30 < i8; i30 += c) {
                            sb4.append(sb2.charAt(i30));
                        }
                        String a = v6o.a(iArr4[i29], sb4.toString());
                        int i31 = i29;
                        int i32 = i4;
                        while (i31 < iArr4[i29] * c) {
                            sb3.setCharAt(i8 + i31, a.charAt(i32));
                            i31 += c;
                            i32++;
                        }
                    }
                }
                String sb5 = sb3.toString();
                int b = e.b() * i25;
                int d = e.d() * i24;
                yi6 yi6Var = new yi6(sb5, b, d);
                int i33 = yi6Var.c;
                byte[] bArr = (byte[]) yi6Var.x;
                int i34 = i4;
                int i35 = i34;
                int i36 = 4;
                while (true) {
                    if (i36 == d && i35 == 0) {
                        int i37 = d - 1;
                        zzw0Var = e;
                        yi6Var.q(i37, i4, i34, 1);
                        yi6Var.q(i37, 1, i34, 2);
                        yi6Var.q(i37, 2, i34, 3);
                        yi6Var.q(0, b - 2, i34, 4);
                        int i38 = b - 1;
                        yi6Var.q(0, i38, i34, 5);
                        yi6Var.q(1, i38, i34, 6);
                        yi6Var.q(2, i38, i34, i3);
                        yi6Var.q(3, i38, i34, 8);
                        i34++;
                    } else {
                        zzw0Var = e;
                    }
                    int i39 = d - 2;
                    if (i36 == i39 && i35 == 0 && b % 4 != 0) {
                        i9 = i24;
                        yi6Var.q(d - 3, 0, i34, 1);
                        yi6Var.q(i39, 0, i34, 2);
                        yi6Var.q(d - 1, 0, i34, 3);
                        yi6Var.q(0, b - 4, i34, 4);
                        yi6Var.q(0, b - 3, i34, 5);
                        yi6Var.q(0, b - 2, i34, 6);
                        int i40 = b - 1;
                        yi6Var.q(0, i40, i34, 7);
                        yi6Var.q(1, i40, i34, 8);
                        i34++;
                    } else {
                        i9 = i24;
                    }
                    if (i36 == i39 && i35 == 0 && b % 8 == 4) {
                        yi6Var.q(d - 3, 0, i34, 1);
                        yi6Var.q(i39, 0, i34, 2);
                        yi6Var.q(d - 1, 0, i34, 3);
                        yi6Var.q(0, b - 2, i34, 4);
                        int i41 = b - 1;
                        yi6Var.q(0, i41, i34, 5);
                        yi6Var.q(1, i41, i34, 6);
                        yi6Var.q(2, i41, i34, 7);
                        yi6Var.q(3, i41, i34, 8);
                        i34++;
                    }
                    if (i36 == d + 4 && i35 == 2 && b % 8 == 0) {
                        int i42 = d - 1;
                        yi6Var.q(i42, 0, i34, 1);
                        int i43 = b - 1;
                        yi6Var.q(i42, i43, i34, 2);
                        int i44 = b - 3;
                        i10 = i39;
                        yi6Var.q(0, i44, i34, 3);
                        int i45 = b - 2;
                        yi6Var.q(0, i45, i34, 4);
                        yi6Var.q(0, i43, i34, 5);
                        yi6Var.q(1, i44, i34, 6);
                        i11 = 7;
                        yi6Var.q(1, i45, i34, 7);
                        yi6Var.q(1, i43, i34, 8);
                        i34++;
                    } else {
                        i10 = i39;
                        i11 = 7;
                    }
                    while (true) {
                        if (i36 < d && i35 >= 0 && bArr[(i36 * i33) + i35] < 0) {
                            yi6Var.x(i36, i35, i34);
                            i34++;
                        }
                        int i46 = i36 - 2;
                        int i47 = i35 + 2;
                        if (i46 < 0 || i47 >= b) {
                            break;
                        }
                        i36 = i46;
                        i35 = i47;
                    }
                    int i48 = i36 - 1;
                    int i49 = i35 + 5;
                    while (true) {
                        if (i48 >= 0 && i49 < b && bArr[(i48 * i33) + i49] < 0) {
                            yi6Var.x(i48, i49, i34);
                            i34++;
                        }
                        int i50 = i48 + 2;
                        int i51 = i49 - 2;
                        if (i50 >= d || i51 < 0) {
                            break;
                        }
                        i48 = i50;
                        i49 = i51;
                    }
                    i36 = i48 + 5;
                    i35 = i49 - 1;
                    if (i36 >= d && i35 >= b) {
                        break;
                    }
                    i4 = 0;
                    e = zzw0Var;
                    i24 = i9;
                    i3 = i11;
                }
                int i52 = b - 1;
                int i53 = d - 1;
                if (bArr[(i53 * i33) + i52] < 0) {
                    bArr[(i53 * i33) + i52] = 1;
                    bArr[(i10 * i33) + (b - 2)] = 1;
                }
                int b2 = zzw0Var.b() * i25;
                int d2 = zzw0Var.d() * i9;
                kn1 kn1Var = new kn1((zzw0Var.b() * 2) + (zzw0Var.b() * i25), (zzw0Var.d() * 2) + (zzw0Var.d() * i9));
                int i54 = 0;
                for (int i55 = 0; i55 < d2; i55++) {
                    int i56 = i55 % i9;
                    if (i56 == 0) {
                        int i57 = 0;
                        for (int i58 = 0; i58 < (zzw0Var.b() * 2) + (zzw0Var.b() * i25); i58++) {
                            kn1Var.x(i57, i54, i58 % 2 == 0);
                            i57++;
                        }
                        i54++;
                    }
                    int i59 = 0;
                    for (int i60 = 0; i60 < b2; i60++) {
                        int i61 = i60 % i25;
                        if (i61 == 0) {
                            kn1Var.x(i59, i54, true);
                            i59++;
                        }
                        kn1Var.x(i59, i54, bArr[(i55 * i33) + i60] == 1);
                        int i62 = i59 + 1;
                        if (i61 == i25 - 1) {
                            kn1Var.x(i62, i54, i55 % 2 == 0);
                            i59 += 2;
                        } else {
                            i59 = i62;
                        }
                    }
                    int i63 = i54 + 1;
                    if (i56 == i9 - 1) {
                        int i64 = 0;
                        for (int i65 = 0; i65 < (zzw0Var.b() * 2) + (zzw0Var.b() * i25); i65++) {
                            kn1Var.x(i64, i63, true);
                            i64++;
                        }
                        i54 += 2;
                    } else {
                        i54 = i63;
                    }
                }
                int i66 = kn1Var.c;
                int i67 = kn1Var.b;
                int max = Math.max(i, i67);
                int max2 = Math.max(i2, i66);
                int min = Math.min(max / i67, max2 / i66);
                int i68 = (max - (i67 * min)) / 2;
                int i69 = (max2 - (i66 * min)) / 2;
                if (i2 < i66 || i < i67) {
                    vz5Var2 = new vz5(i67, i66);
                    i12 = 0;
                    i13 = 0;
                } else {
                    vz5Var2 = new vz5(i, i2);
                    i12 = i68;
                    i13 = i69;
                }
                int[] iArr5 = vz5Var2.w;
                int length4 = iArr5.length;
                for (int i70 = 0; i70 < length4; i70++) {
                    iArr5[i70] = 0;
                }
                int i71 = i13;
                int i72 = 0;
                while (i72 < i66) {
                    int i73 = i12;
                    int i74 = 0;
                    while (i74 < i67) {
                        if (kn1Var.u(i74, i72) == 1) {
                            vz5Var2.d(i73, i71, min, min);
                        }
                        i74++;
                        i73 += min;
                    }
                    i72++;
                    i71 += min;
                }
                return vz5Var2;
            }
        }
        vz5Var = null;
        if (map != null) {
            EncodeHintType encodeHintType4 = EncodeHintType.FORCE_C40;
            if (map.containsKey(encodeHintType4) && Boolean.parseBoolean(map.get(encodeHintType4).toString())) {
                z = true;
                zoy0 zoy0Var = new zoy0();
                i3 = 7;
                i4 = 0;
                vyn[] vynVarArr = {new r501(5), zoy0Var, new gmy0(0), new gmy0(1), new r501(21), new m501(8)};
                aznVar = new azn(str);
                aznVar.b = symbolShapeHint3;
                if (!str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
                    aznVar.d((char) 236);
                    aznVar.g = 2;
                    aznVar.d += 7;
                } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
                    aznVar.d((char) 237);
                    aznVar.g = 2;
                    aznVar.d += 7;
                }
                sb = aznVar.c;
                if (z) {
                    i5 = -1;
                    i6 = 0;
                } else {
                    StringBuilder sb6 = new StringBuilder();
                    int i75 = aznVar.d;
                    int i76 = 0;
                    int i77 = 0;
                    while (aznVar.b()) {
                        char a2 = aznVar.a();
                        aznVar.d++;
                        i77 = zoy0Var.u(a2, sb6);
                        if (sb6.length() % 3 == 0) {
                            i75 = aznVar.d;
                            i76 = sb6.length();
                        }
                    }
                    if (i76 != sb6.length()) {
                        int length5 = sb.length() + ((sb6.length() / 3) * 2) + 1;
                        aznVar.c(length5);
                        int i78 = aznVar.f.b - length5;
                        int length6 = sb6.length() % 3;
                        if ((length6 == 2 && i78 != 2) || (length6 == 1 && (i77 > 3 || i78 != 1))) {
                            sb6.setLength(i76);
                            aznVar.d = i75;
                        }
                    }
                    if (sb6.length() > 0) {
                        aznVar.d((char) 230);
                    }
                    zoy0Var.z(aznVar, sb6);
                    i6 = aznVar.e;
                    i5 = -1;
                    aznVar.e = -1;
                }
                while (aznVar.b()) {
                    vynVarArr[i6].v(aznVar);
                    int i79 = aznVar.e;
                    if (i79 >= 0) {
                        aznVar.e = i5;
                        i6 = i79;
                    }
                }
                length = sb.length();
                aznVar.c(sb.length());
                i7 = aznVar.f.b;
                if (length < i7 && i6 != 0 && i6 != 5 && i6 != 4) {
                    aznVar.d((char) 254);
                }
                if (sb.length() < i7) {
                    sb.append((char) 129);
                }
                while (sb.length() < i7) {
                    int length7 = ((sb.length() + 1) * 149) % 253;
                    int i80 = length7 + 130;
                    if (i80 > 254) {
                        i80 = length7 - 124;
                    }
                    sb.append((char) i80);
                }
                sb2 = sb.toString();
                zzw0 e2 = zzw0.e(sb2.length(), symbolShapeHint3);
                int i242 = e2.e;
                int i252 = e2.d;
                int[] iArr22 = v6o.a;
                length2 = sb2.length();
                i8 = e2.b;
                int i262 = e2.c;
                if (length2 != i8) {
                }
            }
        }
        z = false;
        zoy0 zoy0Var2 = new zoy0();
        i3 = 7;
        i4 = 0;
        vyn[] vynVarArr2 = {new r501(5), zoy0Var2, new gmy0(0), new gmy0(1), new r501(21), new m501(8)};
        aznVar = new azn(str);
        aznVar.b = symbolShapeHint3;
        if (!str.startsWith("[)>\u001e05\u001d")) {
        }
        if (str.startsWith("[)>\u001e06\u001d")) {
            aznVar.d((char) 237);
            aznVar.g = 2;
            aznVar.d += 7;
        }
        sb = aznVar.c;
        if (z) {
        }
        while (aznVar.b()) {
        }
        length = sb.length();
        aznVar.c(sb.length());
        i7 = aznVar.f.b;
        if (length < i7) {
            aznVar.d((char) 254);
        }
        if (sb.length() < i7) {
        }
        while (sb.length() < i7) {
        }
        sb2 = sb.toString();
        zzw0 e22 = zzw0.e(sb2.length(), symbolShapeHint3);
        int i2422 = e22.e;
        int i2522 = e22.d;
        int[] iArr222 = v6o.a;
        length2 = sb2.length();
        i8 = e22.b;
        int i2622 = e22.c;
        if (length2 != i8) {
        }
    }
}
