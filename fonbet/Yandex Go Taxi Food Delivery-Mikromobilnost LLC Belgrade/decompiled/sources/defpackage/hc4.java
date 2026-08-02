package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.CharacterSetECI;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes11.dex */
public final class hc4 implements fc51 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015b  */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v45, types: [g3u0] */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Type inference failed for: r9v48 */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v5, types: [uz5] */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // defpackage.fc51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vz5 a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        Charset charset;
        int i3;
        char c;
        int i4;
        uz5 uz5Var;
        boolean z;
        int i5;
        int i6;
        char c2;
        uz5 e;
        int i7;
        int i8;
        LinkedList a;
        int length;
        afs0 afs0Var;
        vz5 vz5Var = null;
        byte b = 0;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.CHARACTER_SET;
            charset = map.containsKey(encodeHintType) ? Charset.forName(map.get(encodeHintType).toString()) : null;
            EncodeHintType encodeHintType2 = EncodeHintType.ERROR_CORRECTION;
            r3 = map.containsKey(encodeHintType2) ? Integer.parseInt(map.get(encodeHintType2).toString()) : 33;
            EncodeHintType encodeHintType3 = EncodeHintType.AZTEC_LAYERS;
            if (map.containsKey(encodeHintType3)) {
                i3 = Integer.parseInt(map.get(encodeHintType3).toString());
                if (barcodeFormat == BarcodeFormat.AZTEC) {
                    kbs.f(barcodeFormat, "Can only encode AZTEC, but got ");
                    return null;
                }
                byte[] bytes = str.getBytes(charset != null ? charset : StandardCharsets.ISO_8859_1);
                g3u0 g3u0Var = g3u0.f;
                byte b2 = Alerts.alert_certificate_unknown;
                int i9 = 3;
                int i10 = 4;
                if (charset != null) {
                    CharacterSetECI a2 = CharacterSetECI.a(charset);
                    if (a2 == null) {
                        kbs.f(charset, "No ECI code for character set ");
                        return null;
                    }
                    int f = a2.f();
                    cnz0 cnz0Var = g3u0Var.e(4, 0).b;
                    if (f < 0) {
                        cnz0Var.getClass();
                        afs0Var = new afs0(cnz0Var, 0, 3);
                        length = 3;
                    } else {
                        if (f > 999999) {
                            ny61.g("ECI code must be between 0 and 999999");
                            return null;
                        }
                        byte[] bytes2 = Integer.toString(f).getBytes(StandardCharsets.ISO_8859_1);
                        int length2 = bytes2.length;
                        cnz0Var.getClass();
                        afs0 afs0Var2 = new afs0(cnz0Var, length2, 3);
                        int length3 = bytes2.length;
                        int i11 = 0;
                        while (i11 < length3) {
                            afs0 afs0Var3 = new afs0(afs0Var2, bytes2[i11] - Alerts.alert_certificate_unknown, 4);
                            i11++;
                            afs0Var2 = afs0Var3;
                        }
                        length = (bytes2.length * 4) + 3;
                        afs0Var = afs0Var2;
                    }
                    g3u0Var = new g3u0(afs0Var, g3u0Var.a, 0, g3u0Var.d + length);
                }
                List<g3u0> singletonList = Collections.singletonList(g3u0Var);
                int i12 = 0;
                while (true) {
                    boolean z2 = true;
                    int i13 = 2;
                    c = '\n';
                    if (i12 >= bytes.length) {
                        break;
                    }
                    int i14 = i12 + 1;
                    vz5 vz5Var2 = vz5Var;
                    byte b3 = i14 < bytes.length ? bytes[i14] : b;
                    byte b4 = bytes[i12];
                    if (b4 == 13) {
                        if (b3 == 10) {
                            i8 = 2;
                            if (i8 <= 0) {
                            }
                            singletonList = a;
                            i12++;
                            b = 0;
                            b2 = Alerts.alert_certificate_unknown;
                            i10 = 4;
                            vz5Var = vz5Var2;
                        }
                        i8 = 0;
                        if (i8 <= 0) {
                        }
                        singletonList = a;
                        i12++;
                        b = 0;
                        b2 = Alerts.alert_certificate_unknown;
                        i10 = 4;
                        vz5Var = vz5Var2;
                    } else if (b4 == 44) {
                        if (b3 == 32) {
                            i8 = i10;
                            if (i8 <= 0) {
                            }
                            singletonList = a;
                            i12++;
                            b = 0;
                            b2 = Alerts.alert_certificate_unknown;
                            i10 = 4;
                            vz5Var = vz5Var2;
                        }
                        i8 = 0;
                        if (i8 <= 0) {
                        }
                        singletonList = a;
                        i12++;
                        b = 0;
                        b2 = Alerts.alert_certificate_unknown;
                        i10 = 4;
                        vz5Var = vz5Var2;
                    } else if (b4 != b2) {
                        if (b4 == 58 && b3 == 32) {
                            i8 = 5;
                            if (i8 <= 0) {
                                LinkedList linkedList = new LinkedList();
                                for (g3u0 g3u0Var2 : singletonList) {
                                    g3u0 b5 = g3u0Var2.b(i12);
                                    linkedList.add(b5.d(i10, i8));
                                    if (g3u0Var2.a != i10) {
                                        linkedList.add(b5.e(i10, i8));
                                    }
                                    if (i8 == 3 || i8 == i10) {
                                        linkedList.add(b5.d(2, 16 - i8).d(2, 1));
                                    }
                                    if (g3u0Var2.c > 0) {
                                        linkedList.add(g3u0Var2.a(i12).a(i14));
                                    }
                                }
                                a = fju.a(linkedList);
                                i12 = i14;
                            } else {
                                LinkedList linkedList2 = new LinkedList();
                                for (g3u0 g3u0Var3 : singletonList) {
                                    char c3 = (char) (bytes[i12] & 255);
                                    int[][] iArr = fju.c;
                                    int i15 = g3u0Var3.a;
                                    boolean z3 = iArr[i15][c3] > 0 ? z2 : false;
                                    Object obj = vz5Var2;
                                    int i16 = 0;
                                    while (i16 <= i10) {
                                        boolean z4 = z2;
                                        int i17 = iArr[i16][c3];
                                        Object obj2 = obj;
                                        if (i17 > 0) {
                                            if (obj == null) {
                                                obj2 = g3u0Var3.b(i12);
                                            }
                                            ?? r9 = obj2;
                                            if (!z3 || i16 == i15 || i16 == i13) {
                                                linkedList2.add(r9.d(i16, i17));
                                            }
                                            if (!z3 && fju.d[i15][i16] >= 0) {
                                                linkedList2.add(r9.e(i16, i17));
                                            }
                                            obj = r9;
                                        }
                                        i16++;
                                        z2 = z4;
                                        i10 = 4;
                                        i13 = 2;
                                        obj = obj;
                                    }
                                    boolean z5 = z2;
                                    if (g3u0Var3.c > 0 || iArr[i15][c3] == 0) {
                                        linkedList2.add(g3u0Var3.a(i12));
                                    }
                                    z2 = z5;
                                    i10 = 4;
                                    i13 = 2;
                                }
                                a = fju.a(linkedList2);
                            }
                            singletonList = a;
                            i12++;
                            b = 0;
                            b2 = Alerts.alert_certificate_unknown;
                            i10 = 4;
                            vz5Var = vz5Var2;
                        }
                        i8 = 0;
                        if (i8 <= 0) {
                        }
                        singletonList = a;
                        i12++;
                        b = 0;
                        b2 = Alerts.alert_certificate_unknown;
                        i10 = 4;
                        vz5Var = vz5Var2;
                    } else {
                        if (b3 == 32) {
                            i8 = 3;
                            if (i8 <= 0) {
                            }
                            singletonList = a;
                            i12++;
                            b = 0;
                            b2 = Alerts.alert_certificate_unknown;
                            i10 = 4;
                            vz5Var = vz5Var2;
                        }
                        i8 = 0;
                        if (i8 <= 0) {
                        }
                        singletonList = a;
                        i12++;
                        b = 0;
                        b2 = Alerts.alert_certificate_unknown;
                        i10 = 4;
                        vz5Var = vz5Var2;
                    }
                }
                vz5 vz5Var3 = vz5Var;
                g3u0 g3u0Var4 = (g3u0) Collections.min(singletonList, new rvr(8));
                g3u0Var4.getClass();
                ArrayList arrayList = new ArrayList();
                for (cnz0 cnz0Var2 = g3u0Var4.b(bytes.length).b; cnz0Var2 != null; cnz0Var2 = cnz0Var2.a) {
                    arrayList.add(cnz0Var2);
                }
                uz5 uz5Var2 = new uz5();
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((cnz0) arrayList.get(size)).a(uz5Var2, bytes);
                }
                int i18 = uz5Var2.b;
                int i19 = ((r3 * i18) / 100) + 11;
                int i20 = i18 + i19;
                int[] iArr2 = ke91.a;
                if (i3 == 0) {
                    ?? r92 = vz5Var3;
                    int i21 = 0;
                    int i22 = 0;
                    while (i21 <= 32) {
                        boolean z6 = i21 <= i9;
                        int i23 = z6 ? i21 + 1 : i21;
                        int i24 = ((i23 * 16) + (z6 ? 88 : 112)) * i23;
                        if (i20 > i24) {
                            i4 = i22;
                            c2 = c;
                        } else {
                            if (r92 == 0 || i22 != iArr2[i23]) {
                                i4 = iArr2[i23];
                                r92 = ke91.g(uz5Var2, i4);
                            } else {
                                i4 = i22;
                                r92 = r92;
                            }
                            int i25 = i24 - (i24 % i4);
                            if ((!z6 || r92.b <= i4 * 64) && r92.b + i19 <= i25) {
                                uz5Var = r92;
                                z = z6;
                                i5 = i23;
                                i6 = i24;
                            } else {
                                c2 = c;
                            }
                        }
                        i21++;
                        i22 = i4;
                        c = c2;
                        i9 = 3;
                        r92 = r92;
                    }
                    ny61.g("Data too large for an Aztec code");
                    return vz5Var3;
                }
                z = i3 < 0;
                i5 = Math.abs(i3);
                if (i5 > (z ? 4 : 32)) {
                    ny61.g(oyr.j(i3, "Illegal value ", " for layers"));
                    return vz5Var3;
                }
                i6 = ((i5 * 16) + (z ? 88 : 112)) * i5;
                i4 = iArr2[i5];
                int i26 = i6 - (i6 % i4);
                uz5Var = ke91.g(uz5Var2, i4);
                int i27 = uz5Var.b;
                if (i19 + i27 > i26) {
                    ny61.g("Data to large for user specified layer");
                    return vz5Var3;
                }
                if (z && i27 > i4 * 64) {
                    ny61.g("Data to large for user specified layer");
                    return vz5Var3;
                }
                uz5 e2 = ke91.e(uz5Var, i6, i4);
                int i28 = uz5Var.b / i4;
                uz5 uz5Var3 = new uz5();
                if (z) {
                    uz5Var3.b(i5 - 1, 2);
                    uz5Var3.b(i28 - 1, 6);
                    e = ke91.e(uz5Var3, 28, 4);
                } else {
                    uz5Var3.b(i5 - 1, 5);
                    uz5Var3.b(i28 - 1, 11);
                    e = ke91.e(uz5Var3, 40, 4);
                }
                int i29 = (i5 * 4) + (z ? 11 : 14);
                int[] iArr3 = new int[i29];
                if (z) {
                    for (int i30 = 0; i30 < i29; i30++) {
                        iArr3[i30] = i30;
                    }
                    i7 = i29;
                } else {
                    int i31 = i29 / 2;
                    i7 = (((i31 - 1) / 15) * 2) + i29 + 1;
                    int i32 = i7 / 2;
                    for (int i33 = 0; i33 < i31; i33++) {
                        iArr3[(i31 - i33) - 1] = (i32 - r10) - 1;
                        iArr3[i31 + i33] = (i33 / 15) + i33 + i32 + 1;
                    }
                }
                vz5 vz5Var4 = new vz5(i7, i7);
                int i34 = 0;
                for (int i35 = 0; i35 < i5; i35++) {
                    int i36 = ((i5 - i35) * 4) + (z ? 9 : 12);
                    for (int i37 = 0; i37 < i36; i37++) {
                        int i38 = i37 * 2;
                        for (int i39 = 0; i39 < 2; i39++) {
                            if (e2.d(i34 + i38 + i39)) {
                                int i40 = i35 * 2;
                                vz5Var4.c(iArr3[i40 + i39], iArr3[i40 + i37]);
                            }
                            if (e2.d((i36 * 2) + i34 + i38 + i39)) {
                                int i41 = i35 * 2;
                                vz5Var4.c(iArr3[i41 + i37], iArr3[((i29 - 1) - i41) - i39]);
                            }
                            if (e2.d((i36 * 4) + i34 + i38 + i39)) {
                                int i42 = (i29 - 1) - (i35 * 2);
                                vz5Var4.c(iArr3[i42 - i39], iArr3[i42 - i37]);
                            }
                            if (e2.d((i36 * 6) + i34 + i38 + i39)) {
                                int i43 = i35 * 2;
                                vz5Var4.c(iArr3[((i29 - 1) - i43) - i37], iArr3[i43 + i39]);
                            }
                        }
                    }
                    i34 += i36 * 8;
                }
                int i44 = i7 / 2;
                if (z) {
                    for (int i45 = 0; i45 < 7; i45++) {
                        int i46 = (i44 - 3) + i45;
                        if (e.d(i45)) {
                            vz5Var4.c(i46, i44 - 5);
                        }
                        if (e.d(i45 + 7)) {
                            vz5Var4.c(i44 + 5, i46);
                        }
                        if (e.d(20 - i45)) {
                            vz5Var4.c(i46, i44 + 5);
                        }
                        if (e.d(27 - i45)) {
                            vz5Var4.c(i44 - 5, i46);
                        }
                    }
                } else {
                    for (int i47 = 0; i47 < 10; i47++) {
                        int i48 = (i47 / 5) + (i44 - 5) + i47;
                        if (e.d(i47)) {
                            vz5Var4.c(i48, i44 - 7);
                        }
                        if (e.d(i47 + 10)) {
                            vz5Var4.c(i44 + 7, i48);
                        }
                        if (e.d(29 - i47)) {
                            vz5Var4.c(i48, i44 + 7);
                        }
                        if (e.d(39 - i47)) {
                            vz5Var4.c(i44 - 7, i48);
                        }
                    }
                }
                if (z) {
                    ke91.d(vz5Var4, i44, 5);
                } else {
                    ke91.d(vz5Var4, i44, 7);
                    int i49 = 0;
                    int i50 = 0;
                    while (i49 < (i29 / 2) - 1) {
                        for (int i51 = i44 & 1; i51 < i7; i51 += 2) {
                            int i52 = i44 - i50;
                            vz5Var4.c(i52, i51);
                            int i53 = i44 + i50;
                            vz5Var4.c(i53, i51);
                            vz5Var4.c(i51, i52);
                            vz5Var4.c(i51, i53);
                        }
                        i49 += 15;
                        i50 += 16;
                    }
                }
                new gc4();
                int i54 = vz5Var4.a;
                int i55 = vz5Var4.b;
                int max = Math.max(i, i54);
                int max2 = Math.max(i2, i55);
                int min = Math.min(max / i54, max2 / i55);
                int i56 = (max - (i54 * min)) / 2;
                int i57 = (max2 - (i55 * min)) / 2;
                vz5 vz5Var5 = new vz5(max, max2);
                int i58 = 0;
                while (i58 < i55) {
                    int i59 = i56;
                    int i60 = 0;
                    while (i60 < i54) {
                        if (vz5Var4.b(i60, i58)) {
                            vz5Var5.d(i59, i57, min, min);
                        }
                        i60++;
                        i59 += min;
                    }
                    i58++;
                    i57 += min;
                }
                return vz5Var5;
            }
        } else {
            charset = null;
        }
        i3 = 0;
        if (barcodeFormat == BarcodeFormat.AZTEC) {
        }
    }
}
