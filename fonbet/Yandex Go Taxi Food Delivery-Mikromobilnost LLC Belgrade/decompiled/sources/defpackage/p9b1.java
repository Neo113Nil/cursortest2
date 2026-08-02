package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.design.compose.slot.body.BodyAlign;
import com.yandex.messaging.internal.entities.MessageData;
import java.util.Map;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class p9b1 {
    public static final void a(final ebp0 ebp0Var, final String str, f530 f530Var, wp2 wp2Var, final ety0 ety0Var, int i, int i2, final kk2 kk2Var, final Map map, final wp2 wp2Var2, ety0 ety0Var2, int i3, int i4, fid fidVar, final int i5) {
        ebp0 ebp0Var2;
        int i6;
        ety0 ety0Var3;
        final f530 f530Var2;
        final wp2 wp2Var3;
        final int i7;
        final ety0 ety0Var4;
        final int i8;
        final int i9;
        bts btsVar;
        final int i10;
        int i11;
        int i12;
        ety0 ety0Var5;
        int i13;
        int i14;
        f530 f530Var3;
        wp2 wp2Var4;
        f530 f530Var4;
        ety0 ety0Var6;
        int i15;
        int i16;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1512553767);
        if ((i5 & 6) == 0) {
            ebp0Var2 = ebp0Var;
            i6 = (btsVar2.k(ebp0Var2) ? 4 : 2) | i5;
        } else {
            ebp0Var2 = ebp0Var;
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= btsVar2.k(str) ? 32 : 16;
        }
        int i17 = i6 | 3456;
        if ((i5 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            ety0Var3 = ety0Var;
            i17 |= btsVar2.k(ety0Var3) ? 16384 : 8192;
        } else {
            ety0Var3 = ety0Var;
        }
        int i18 = i17 | 1769472;
        if ((12582912 & i5) == 0) {
            i18 |= btsVar2.k(kk2Var) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((100663296 & i5) == 0) {
            i18 |= btsVar2.k(map) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if ((i5 & 805306368) == 0) {
            i18 |= btsVar2.k(wp2Var2) ? 536870912 : SelfTester_JCP.IMITA;
        }
        if (btsVar2.V(i18 & 1, (306783379 & i18) != 306783378)) {
            btsVar2.a0();
            if ((i5 & 1) == 0 || btsVar2.C()) {
                i11 = 2;
                i12 = 2;
                ety0Var5 = xya1.e(btsVar2).h.a;
                i13 = Integer.MAX_VALUE;
                i14 = Integer.MAX_VALUE;
                f530Var3 = c530.a;
                wp2Var4 = tp2.a;
            } else {
                btsVar2.Y();
                f530Var3 = f530Var;
                wp2Var4 = wp2Var;
                i11 = i;
                i13 = i2;
                ety0Var5 = ety0Var2;
                i12 = i3;
                i14 = i4;
            }
            btsVar2.u();
            btsVar2.e0(-1865202016);
            BodyAlign bodyAlign = (BodyAlign) btsVar2.m(u76.a);
            btsVar2.t(false);
            jt1 alignment = bodyAlign.getAlignment();
            ebp0Var2.getClass();
            f530 m = an91.m(cj6.a.a(f530Var3, alignment), 0.0f, ebp0Var2.c() == SlotSize.XS ? 0.0f : 2.0f, 1);
            sic a = qic.a(lr20.c, bodyAlign.getHorizontal(), btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = b.d(btsVar2, m);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, d.f, a);
            qje.W(btsVar2, d.e, o);
            qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, d.h);
            qje.W(btsVar2, d.d, d);
            int i19 = i18 >> 15;
            jeb1.f(str, null, wp2Var4, 0L, 0L, null, new sjy0(bodyAlign.getTextAlign()), 0L, i11, false, i13, 0, null, ety0Var3, btsVar2, ((i18 >> 3) & 910) | ((i18 << 12) & 1879048192), (i19 & 112) | (57344 & i18), 13690);
            wp2 wp2Var5 = wp2Var4;
            int i20 = i13;
            bts btsVar3 = btsVar2;
            int i21 = i11;
            if (kk2Var.b.length() > 0) {
                btsVar3.e0(-701253998);
                f530Var4 = f530Var3;
                ety0Var6 = ety0Var5;
                i15 = i12;
                i16 = i14;
                jeb1.d(kk2Var, null, wp2Var2, 0L, 0L, new sjy0(bodyAlign.getTextAlign()), 0L, i15, false, i16, 0, map, null, ety0Var6, btsVar3, ((i18 >> 21) & 910) | 805306368, 48 | (i19 & 7168), 21882);
                btsVar3 = btsVar3;
                btsVar3.t(false);
            } else {
                f530Var4 = f530Var3;
                ety0Var6 = ety0Var5;
                i15 = i12;
                i16 = i14;
                btsVar3.e0(-701001069);
                btsVar3.t(false);
            }
            btsVar3.t(true);
            btsVar = btsVar3;
            i9 = i16;
            ety0Var4 = ety0Var6;
            wp2Var3 = wp2Var5;
            i7 = i21;
            i10 = i20;
            f530Var2 = f530Var4;
            i8 = i15;
        } else {
            btsVar2.Y();
            f530Var2 = f530Var;
            wp2Var3 = wp2Var;
            i7 = i;
            ety0Var4 = ety0Var2;
            i8 = i3;
            i9 = i4;
            btsVar = btsVar2;
            i10 = i2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: b86
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(i5 | 1);
                    p9b1.a(ebp0.this, str, f530Var2, wp2Var3, ety0Var, i7, i10, kk2Var, map, wp2Var2, ety0Var4, i8, i9, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final ebp0 ebp0Var, final kk2 kk2Var, final Map map, f530 f530Var, wp2 wp2Var, ety0 ety0Var, int i, int i2, final kk2 kk2Var2, Map map2, wp2 wp2Var2, ety0 ety0Var2, int i3, int i4, fid fidVar, final int i5, final int i6, final int i7) {
        int i8;
        ety0 ety0Var3;
        int i9;
        int i10;
        Map map3;
        int i11;
        wp2 wp2Var3;
        int i12;
        int i13;
        final f530 f530Var2;
        final int i14;
        final int i15;
        final int i16;
        final wp2 wp2Var4;
        final ety0 ety0Var4;
        final Map map4;
        final wp2 wp2Var5;
        final ety0 ety0Var5;
        final int i17;
        aii0 v;
        ety0 ety0Var6;
        wp2 wp2Var6;
        ety0 ety0Var7;
        ety0 ety0Var8;
        int i18;
        int i19;
        int i20;
        wp2 wp2Var7;
        f530 f530Var3;
        int i21;
        int i22;
        f530 f530Var4;
        Map map5;
        ety0 ety0Var9;
        int i23;
        int i24;
        int i25;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1343013347);
        if ((i5 & 6) == 0) {
            i8 = (btsVar.k(ebp0Var) ? 4 : 2) | i5;
        } else {
            i8 = i5;
        }
        if ((i5 & 48) == 0) {
            i8 |= btsVar.k(kk2Var) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i8 |= btsVar.k(map) ? 256 : 128;
        }
        int i26 = i8 | HProv.ALG_TYPE_SECURECHANNEL;
        int i27 = i7 & 8;
        if (i27 != 0) {
            i26 = i8 | 27648;
        } else if ((i5 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i26 |= btsVar.k(wp2Var) ? 16384 : 8192;
            if ((196608 & i5) != 0) {
                if ((i7 & 16) == 0) {
                    ety0Var3 = ety0Var;
                    if (btsVar.k(ety0Var3)) {
                        i25 = 131072;
                        i26 |= i25;
                    }
                } else {
                    ety0Var3 = ety0Var;
                }
                i25 = 65536;
                i26 |= i25;
            } else {
                ety0Var3 = ety0Var;
            }
            i9 = i26 | 14155776;
            if ((100663296 & i5) == 0) {
                i9 |= btsVar.k(kk2Var2) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
            }
            i10 = i7 & 256;
            if (i10 == 0) {
                i9 |= 805306368;
            } else if ((i5 & 805306368) == 0) {
                map3 = map2;
                i9 |= btsVar.k(map3) ? 536870912 : SelfTester_JCP.IMITA;
                i11 = i7 & 512;
                if (i11 != 0) {
                    wp2Var3 = wp2Var2;
                    i12 = 6;
                } else {
                    wp2Var3 = wp2Var2;
                    if ((i6 & 6) == 0) {
                        i12 = i6 | (btsVar.k(wp2Var3) ? 4 : 2);
                    } else {
                        i12 = i6;
                    }
                }
                i13 = i12 | 224656;
                if (btsVar.V(i9 & 1, (i9 & 306783379) == 306783378 || (i13 & 74899) != 74898)) {
                    btsVar.a0();
                    if ((i5 & 1) == 0 || btsVar.C()) {
                        wp2 wp2Var8 = i27 != 0 ? tp2.a : wp2Var;
                        if ((i7 & 16) != 0) {
                            ety0Var6 = xya1.e(btsVar).g.a;
                            i9 &= -458753;
                        } else {
                            ety0Var6 = ety0Var3;
                        }
                        if (i10 != 0) {
                            map3 = kotlin.collections.b.f();
                        }
                        if (i11 != 0) {
                            wp2Var3 = AppColor$Palette.TextMinor;
                        }
                        wp2Var6 = wp2Var3;
                        ety0Var7 = xya1.e(btsVar).h.a;
                        ety0Var8 = ety0Var6;
                        i18 = i13 & (-113);
                        i19 = Integer.MAX_VALUE;
                        i20 = 2;
                        wp2Var7 = wp2Var8;
                        f530Var3 = c530.a;
                        i21 = 2;
                        i22 = Integer.MAX_VALUE;
                    } else {
                        btsVar.Y();
                        if ((i7 & 16) != 0) {
                            i9 &= -458753;
                        }
                        i21 = i;
                        i22 = i2;
                        ety0Var7 = ety0Var2;
                        i20 = i3;
                        i19 = i4;
                        i18 = i13 & (-113);
                        wp2Var6 = wp2Var3;
                        ety0Var8 = ety0Var3;
                        f530Var3 = f530Var;
                        wp2Var7 = wp2Var;
                    }
                    int i28 = i9;
                    Map map6 = map3;
                    btsVar.u();
                    btsVar.e0(2145662122);
                    BodyAlign bodyAlign = (BodyAlign) btsVar.m(u76.a);
                    btsVar.t(false);
                    jt1 alignment = bodyAlign.getAlignment();
                    ebp0Var.getClass();
                    f530 m = an91.m(cj6.a.a(f530Var3, alignment), 0.0f, ebp0Var.c() == SlotSize.XS ? 0.0f : 2.0f, 1);
                    sic a = qic.a(lr20.c, bodyAlign.getHorizontal(), btsVar, 0);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d = b.d(btsVar, m);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, d.f, a);
                    qje.W(btsVar, d.e, o);
                    qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar, d.h);
                    qje.W(btsVar, d.d, d);
                    int i29 = i28 >> 18;
                    f530 f530Var5 = f530Var3;
                    jeb1.d(kk2Var, null, wp2Var7, 0L, 0L, new sjy0(bodyAlign.getTextAlign()), 0L, i21, false, i22, 0, map, null, ety0Var8, btsVar, ((i28 >> 3) & 14) | ((i28 >> 6) & 896) | ((i28 << 9) & 1879048192), (i29 & 112) | ((i28 << 3) & 7168) | (i28 & ImageMetadata.JPEG_GPS_COORDINATES), 21882);
                    wp2 wp2Var9 = wp2Var7;
                    int i30 = i21;
                    int i31 = i22;
                    ety0 ety0Var10 = ety0Var8;
                    btsVar = btsVar;
                    if (kk2Var2.b.length() > 0) {
                        btsVar.e0(1126327220);
                        f530Var4 = f530Var5;
                        map5 = map6;
                        ety0Var9 = ety0Var7;
                        i23 = i20;
                        i24 = i19;
                        jeb1.d(kk2Var2, null, wp2Var6, 0L, 0L, new sjy0(bodyAlign.getTextAlign()), 0L, i23, false, i24, 0, map5, null, ety0Var9, btsVar, ((i28 >> 24) & 14) | ((i18 << 6) & 896) | 805306368, 48 | (i29 & 7168), 21882);
                        btsVar = btsVar;
                        btsVar.t(false);
                    } else {
                        f530Var4 = f530Var5;
                        map5 = map6;
                        ety0Var9 = ety0Var7;
                        i23 = i20;
                        i24 = i19;
                        btsVar.e0(1126580149);
                        btsVar.t(false);
                    }
                    btsVar.t(true);
                    wp2Var4 = wp2Var6;
                    i16 = i23;
                    map4 = map5;
                    wp2Var5 = wp2Var9;
                    i14 = i30;
                    i15 = i31;
                    f530Var2 = f530Var4;
                    ety0Var4 = ety0Var10;
                    i17 = i24;
                    ety0Var5 = ety0Var9;
                } else {
                    btsVar.Y();
                    f530Var2 = f530Var;
                    i14 = i;
                    i15 = i2;
                    i16 = i3;
                    wp2Var4 = wp2Var3;
                    ety0Var4 = ety0Var3;
                    map4 = map3;
                    wp2Var5 = wp2Var;
                    ety0Var5 = ety0Var2;
                    i17 = i4;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new wls() { // from class: c86
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int O = vng.O(i5 | 1);
                            int O2 = vng.O(i6);
                            p9b1.b(ebp0.this, kk2Var, map, f530Var2, wp2Var5, ety0Var4, i14, i15, kk2Var2, map4, wp2Var4, ety0Var5, i16, i17, (fid) obj, O, O2, i7);
                            return zy11.a;
                        }
                    };
                    return;
                }
                return;
            }
            map3 = map2;
            i11 = i7 & 512;
            if (i11 != 0) {
            }
            i13 = i12 | 224656;
            if (btsVar.V(i9 & 1, (i9 & 306783379) == 306783378 || (i13 & 74899) != 74898)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        if ((196608 & i5) != 0) {
        }
        i9 = i26 | 14155776;
        if ((100663296 & i5) == 0) {
        }
        i10 = i7 & 256;
        if (i10 == 0) {
        }
        map3 = map2;
        i11 = i7 & 512;
        if (i11 != 0) {
        }
        i13 = i12 | 224656;
        if (btsVar.V(i9 & 1, (i9 & 306783379) == 306783378 || (i13 & 74899) != 74898)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(ebp0 ebp0Var, String str, f530 f530Var, wp2 wp2Var, ety0 ety0Var, int i, int i2, String str2, wp2 wp2Var2, ety0 ety0Var2, int i3, int i4, BodyAlign bodyAlign, fid fidVar, int i5, int i6, int i7) {
        int i8;
        String str3;
        f530 f530Var2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String str4;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        wp2 wp2Var3;
        ety0 ety0Var3;
        wp2 wp2Var4;
        int i25;
        BodyAlign bodyAlign2;
        int i26;
        int i27;
        String str5;
        f530 f530Var3;
        ety0 ety0Var4;
        int i28;
        aii0 v;
        ety0 ety0Var5;
        wp2 wp2Var5;
        ety0 ety0Var6;
        int i29;
        int i30;
        int i31;
        ety0 ety0Var7;
        int i32;
        BodyAlign bodyAlign3;
        int i33;
        wp2 wp2Var6;
        BodyAlign bodyAlign4;
        int i34;
        ety0 ety0Var8;
        String str6;
        wp2 wp2Var7;
        int i35;
        int i36;
        int i37;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-961961057);
        if ((i5 & 6) == 0) {
            i8 = (btsVar.k(ebp0Var) ? 4 : 2) | i5;
        } else {
            i8 = i5;
        }
        if ((i5 & 48) == 0) {
            str3 = str;
            i8 |= btsVar.k(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        int i38 = i7 & 2;
        if (i38 != 0) {
            i8 |= 384;
        } else if ((i5 & 384) == 0) {
            f530Var2 = f530Var;
            i8 |= btsVar.k(f530Var2) ? 256 : 128;
            i9 = i7 & 4;
            if (i9 == 0) {
                i8 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i5 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                i8 |= btsVar.k(wp2Var) ? 2048 : 1024;
                if ((i5 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    if ((i7 & 8) == 0 && btsVar.k(ety0Var)) {
                        i37 = 16384;
                        i8 |= i37;
                    }
                    i37 = 8192;
                    i8 |= i37;
                }
                i10 = i7 & 16;
                if (i10 != 0) {
                    i8 |= ImageMetadata.EDGE_MODE;
                    i11 = i;
                } else {
                    i11 = i;
                    if ((i5 & ImageMetadata.EDGE_MODE) == 0) {
                        i8 |= btsVar.c(i11) ? 131072 : 65536;
                    }
                }
                i12 = i7 & 32;
                if (i12 != 0) {
                    i8 |= 1572864;
                    i13 = i2;
                } else {
                    i13 = i2;
                    if ((i5 & 1572864) == 0) {
                        i8 |= btsVar.c(i13) ? 1048576 : 524288;
                    }
                }
                i14 = i7 & 64;
                if (i14 != 0) {
                    i8 |= 12582912;
                    str4 = str2;
                } else {
                    str4 = str2;
                    if ((i5 & 12582912) == 0) {
                        i8 |= btsVar.k(str4) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                    }
                }
                i15 = i7 & 128;
                if (i15 != 0) {
                    i8 |= 100663296;
                } else if ((i5 & 100663296) == 0) {
                    i8 |= btsVar.k(wp2Var2) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
                }
                if ((i5 & 805306368) == 0) {
                    if ((i7 & 256) == 0 && btsVar.k(ety0Var2)) {
                        i36 = 536870912;
                        i8 |= i36;
                    }
                    i36 = SelfTester_JCP.IMITA;
                    i8 |= i36;
                }
                i16 = i7 & 512;
                if (i16 != 0) {
                    i18 = i6 | 6;
                    i17 = i16;
                } else if ((i6 & 6) == 0) {
                    i17 = i16;
                    i18 = i6 | (btsVar.c(i3) ? 4 : 2);
                } else {
                    i17 = i16;
                    i18 = i6;
                }
                i19 = i7 & 1024;
                if (i19 != 0) {
                    i18 |= 48;
                    i20 = i19;
                } else if ((i6 & 48) == 0) {
                    i20 = i19;
                    i18 |= btsVar.c(i4) ? 32 : 16;
                } else {
                    i20 = i19;
                }
                int i39 = i18;
                i21 = i7 & 2048;
                if (i21 != 0) {
                    i22 = i39 | 384;
                } else if ((i6 & 384) == 0) {
                    i22 = i39 | (btsVar.c(bodyAlign == null ? -1 : bodyAlign.ordinal()) ? 256 : 128);
                } else {
                    i22 = i39;
                }
                if ((i7 & 4096) != 0) {
                    i23 = i22 | HProv.ALG_TYPE_SECURECHANNEL;
                } else {
                    i23 = i22 | (btsVar.k(null) ? 2048 : 1024);
                }
                i24 = i8;
                if (btsVar.V(i24 & 1, (i8 & 306783379) == 306783378 || (i23 & 1171) != 1170)) {
                    btsVar.a0();
                    if ((i5 & 1) == 0 || btsVar.C()) {
                        f530 f530Var4 = i38 != 0 ? c530.a : f530Var2;
                        wp2 wp2Var8 = i9 != 0 ? tp2.a : wp2Var;
                        if ((i7 & 8) != 0) {
                            ety0Var5 = xya1.e(btsVar).g.a;
                            i24 &= -57345;
                        } else {
                            ety0Var5 = ety0Var;
                        }
                        if (i10 != 0) {
                            i11 = 2;
                        }
                        if (i12 != 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        if (i14 != 0) {
                            str4 = "";
                        }
                        wp2Var5 = i15 != 0 ? AppColor$Palette.TextMinor : wp2Var2;
                        if ((i7 & 256) != 0) {
                            ety0Var6 = xya1.e(btsVar).h.a;
                            i24 &= -1879048193;
                        } else {
                            ety0Var6 = ety0Var2;
                        }
                        int i40 = i17 != 0 ? 2 : i3;
                        i29 = i20 == 0 ? i4 : Integer.MAX_VALUE;
                        i30 = i11;
                        i31 = i13;
                        ety0Var7 = ety0Var5;
                        i32 = i24;
                        bodyAlign3 = i21 != 0 ? null : bodyAlign;
                        f530Var2 = f530Var4;
                        i33 = i40;
                        wp2Var6 = wp2Var8;
                    } else {
                        btsVar.Y();
                        if ((i7 & 8) != 0) {
                            i24 &= -57345;
                        }
                        if ((i7 & 256) != 0) {
                            i24 &= -1879048193;
                        }
                        wp2Var6 = wp2Var;
                        ety0Var7 = ety0Var;
                        wp2Var5 = wp2Var2;
                        ety0Var6 = ety0Var2;
                        i33 = i3;
                        i29 = i4;
                        i30 = i11;
                        i31 = i13;
                        i32 = i24;
                        bodyAlign3 = bodyAlign;
                    }
                    btsVar.u();
                    if (bodyAlign3 == null) {
                        btsVar.e0(-1026587482);
                        bodyAlign4 = (BodyAlign) btsVar.m(u76.a);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(-1026588350);
                        btsVar.t(false);
                        bodyAlign4 = bodyAlign3;
                    }
                    jt1 alignment = bodyAlign4.getAlignment();
                    ebp0Var.getClass();
                    int i41 = i23;
                    int i42 = i33;
                    f530 m = an91.m(cj6.a.a(f530Var2, alignment), 0.0f, ebp0Var.c() == SlotSize.XS ? 0.0f : 2.0f, 1);
                    sic a = qic.a(lr20.c, bodyAlign4.getHorizontal(), btsVar, 0);
                    ety0 ety0Var9 = ety0Var6;
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d = b.d(btsVar, m);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, d.f, a);
                    qje.W(btsVar, d.e, o);
                    qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar, d.h);
                    qje.W(btsVar, d.d, d);
                    int i43 = i32 >> 15;
                    jeb1.f(str3, null, wp2Var6, 0L, 0L, null, new sjy0(bodyAlign4.getTextAlign()), 0L, i30, false, i31, 0, null, ety0Var7, btsVar, ((i32 >> 3) & 910) | ((i32 << 12) & 1879048192), (i43 & 112) | (i32 & HProv.ALG_CLASS_ALL), 13690);
                    wp2 wp2Var9 = wp2Var6;
                    int i44 = i30;
                    int i45 = i31;
                    ety0 ety0Var10 = ety0Var7;
                    if (str4.length() > 0) {
                        btsVar.e0(-704284793);
                        i34 = i42;
                        ety0Var8 = ety0Var9;
                        str6 = str4;
                        wp2Var7 = wp2Var5;
                        i35 = i29;
                        jeb1.f(str6, null, wp2Var7, 0L, 0L, null, new sjy0(bodyAlign4.getTextAlign()), 0L, i34, false, i35, 0, null, ety0Var8, btsVar, ((i32 >> 21) & 14) | ((i32 >> 18) & 896) | ((i41 << 27) & 1879048192), (i41 & 112) | (i43 & HProv.ALG_CLASS_ALL), 13690);
                        btsVar.t(false);
                    } else {
                        i34 = i42;
                        ety0Var8 = ety0Var9;
                        str6 = str4;
                        wp2Var7 = wp2Var5;
                        i35 = i29;
                        btsVar.e0(-704077031);
                        btsVar.t(false);
                    }
                    btsVar.t(true);
                    wp2Var3 = wp2Var9;
                    bodyAlign2 = bodyAlign3;
                    str5 = str6;
                    wp2Var4 = wp2Var7;
                    i25 = i34;
                    ety0Var4 = ety0Var8;
                    ety0Var3 = ety0Var10;
                    i27 = i45;
                    i26 = i44;
                    f530Var3 = f530Var2;
                    i28 = i35;
                } else {
                    btsVar.Y();
                    wp2Var3 = wp2Var;
                    ety0Var3 = ety0Var;
                    wp2Var4 = wp2Var2;
                    i25 = i3;
                    bodyAlign2 = bodyAlign;
                    i26 = i11;
                    i27 = i13;
                    str5 = str4;
                    f530Var3 = f530Var2;
                    ety0Var4 = ety0Var2;
                    i28 = i4;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new z76(ebp0Var, str, f530Var3, wp2Var3, ety0Var3, i26, i27, str5, wp2Var4, ety0Var4, i25, i28, bodyAlign2, i5, i6, i7, 2);
                    return;
                }
                return;
            }
            if ((i5 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            }
            i10 = i7 & 16;
            if (i10 != 0) {
            }
            i12 = i7 & 32;
            if (i12 != 0) {
            }
            i14 = i7 & 64;
            if (i14 != 0) {
            }
            i15 = i7 & 128;
            if (i15 != 0) {
            }
            if ((i5 & 805306368) == 0) {
            }
            i16 = i7 & 512;
            if (i16 != 0) {
            }
            i19 = i7 & 1024;
            if (i19 != 0) {
            }
            int i392 = i18;
            i21 = i7 & 2048;
            if (i21 != 0) {
            }
            if ((i7 & 4096) != 0) {
            }
            i24 = i8;
            if (btsVar.V(i24 & 1, (i8 & 306783379) == 306783378 || (i23 & 1171) != 1170)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        i9 = i7 & 4;
        if (i9 == 0) {
        }
        if ((i5 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
        }
        i10 = i7 & 16;
        if (i10 != 0) {
        }
        i12 = i7 & 32;
        if (i12 != 0) {
        }
        i14 = i7 & 64;
        if (i14 != 0) {
        }
        i15 = i7 & 128;
        if (i15 != 0) {
        }
        if ((i5 & 805306368) == 0) {
        }
        i16 = i7 & 512;
        if (i16 != 0) {
        }
        i19 = i7 & 1024;
        if (i19 != 0) {
        }
        int i3922 = i18;
        i21 = i7 & 2048;
        if (i21 != 0) {
        }
        if ((i7 & 4096) != 0) {
        }
        i24 = i8;
        if (btsVar.V(i24 & 1, (i8 & 306783379) == 306783378 || (i23 & 1171) != 1170)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0137 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final ebp0 ebp0Var, final kk2 kk2Var, Map map, f530 f530Var, wp2 wp2Var, ety0 ety0Var, int i, int i2, String str, wp2 wp2Var2, ety0 ety0Var2, int i3, int i4, fid fidVar, final int i5, final int i6) {
        int i7;
        kk2 kk2Var2;
        Map map2;
        int i8;
        int i9;
        final ety0 ety0Var3;
        int i10;
        final int i11;
        int i12;
        int i13;
        int i14;
        String str2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        final f530 f530Var2;
        final wp2 wp2Var3;
        final wp2 wp2Var4;
        final int i26;
        final int i27;
        final Map map3;
        final String str3;
        final ety0 ety0Var4;
        final int i28;
        aii0 v;
        f530 f530Var3;
        wp2 wp2Var5;
        ety0 ety0Var5;
        int i29;
        Map map4;
        ety0 ety0Var6;
        int i30;
        int i31;
        wp2 wp2Var6;
        int i32;
        int i33;
        int i34;
        ety0 ety0Var7;
        ety0 ety0Var8;
        int i35;
        int i36;
        wp2 wp2Var7;
        String str4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-610173867);
        if ((i5 & 6) == 0) {
            i7 = (btsVar.k(ebp0Var) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            kk2Var2 = kk2Var;
            i7 |= btsVar.k(kk2Var2) ? 32 : 16;
        } else {
            kk2Var2 = kk2Var;
        }
        int i37 = i6 & 2;
        if (i37 != 0) {
            i7 |= 384;
        } else if ((i5 & 384) == 0) {
            map2 = map;
            i7 |= btsVar.k(map2) ? 256 : 128;
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i5 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                i7 |= btsVar.k(f530Var) ? 2048 : 1024;
                i9 = i6 & 8;
                if (i9 != 0) {
                    i7 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                } else if ((i5 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    i7 |= btsVar.k(wp2Var) ? 16384 : 8192;
                    if ((i5 & ImageMetadata.EDGE_MODE) != 0) {
                        ety0Var3 = ety0Var;
                        i7 |= ((i6 & 16) == 0 && btsVar.k(ety0Var3)) ? 131072 : 65536;
                    } else {
                        ety0Var3 = ety0Var;
                    }
                    i10 = i6 & 32;
                    if (i10 == 0) {
                        i7 |= 1572864;
                        i11 = i;
                    } else {
                        i11 = i;
                        if ((i5 & 1572864) == 0) {
                            i7 |= btsVar.c(i11) ? 1048576 : 524288;
                        }
                    }
                    i12 = i6 & 64;
                    if (i12 == 0) {
                        i7 |= 12582912;
                        i13 = i2;
                    } else {
                        i13 = i2;
                        if ((i5 & 12582912) == 0) {
                            i7 |= btsVar.c(i13) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                        }
                    }
                    i14 = i6 & 128;
                    if (i14 == 0) {
                        i7 |= 100663296;
                        str2 = str;
                    } else {
                        str2 = str;
                        if ((i5 & 100663296) == 0) {
                            i7 |= btsVar.k(str2) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
                        }
                    }
                    i15 = i6 & 256;
                    if (i15 == 0) {
                        i7 |= 805306368;
                    } else if ((i5 & 805306368) == 0) {
                        i16 = i15;
                        i7 |= btsVar.k(wp2Var2) ? 536870912 : SelfTester_JCP.IMITA;
                        if ((i6 & 512) != 0 && btsVar.k(ety0Var2)) {
                            i17 = 4;
                            i18 = i6 & 1024;
                            if (i18 != 0) {
                                i20 = i17 | 48;
                                i19 = i18;
                            } else {
                                i19 = i18;
                                i20 = i17 | (btsVar.c(i3) ? 32 : 16);
                            }
                            int i38 = i20;
                            i21 = i6 & 2048;
                            if (i21 != 0) {
                                i22 = i38 | 384;
                            } else {
                                i22 = i38 | (btsVar.c(i4) ? 256 : 128);
                            }
                            if ((i6 & 4096) != 0) {
                                i23 = i22 | HProv.ALG_TYPE_SECURECHANNEL;
                            } else {
                                i23 = i22 | (btsVar.c(-1) ? 2048 : 1024);
                            }
                            if ((i6 & 8192) != 0) {
                                i24 = i23 | HProv.ALG_CLASS_DATA_ENCRYPT;
                            } else {
                                i24 = i23 | (btsVar.k(null) ? 16384 : 8192);
                            }
                            i25 = i7;
                            if (btsVar.V(i25 & 1, (i7 & 306783379) == 306783378 || (i24 & 9363) != 9362)) {
                                btsVar.a0();
                                if ((i5 & 1) == 0 || btsVar.C()) {
                                    Map f = i37 != 0 ? kotlin.collections.b.f() : map2;
                                    f530Var3 = i8 != 0 ? c530.a : f530Var;
                                    wp2 wp2Var8 = i9 != 0 ? tp2.a : wp2Var;
                                    if ((i6 & 16) != 0) {
                                        ety0Var3 = xya1.e(btsVar).g.a;
                                        i25 &= -458753;
                                    }
                                    if (i10 != 0) {
                                        i11 = 2;
                                    }
                                    if (i12 != 0) {
                                        i13 = Integer.MAX_VALUE;
                                    }
                                    String str5 = i14 != 0 ? "" : str2;
                                    wp2Var5 = i16 != 0 ? AppColor$Palette.TextMinor : wp2Var2;
                                    if ((i6 & 512) != 0) {
                                        ety0Var5 = xya1.e(btsVar).h.a;
                                        i24 &= -15;
                                    } else {
                                        ety0Var5 = ety0Var2;
                                    }
                                    int i39 = i19 != 0 ? 2 : i3;
                                    i29 = i21 == 0 ? i4 : Integer.MAX_VALUE;
                                    map4 = f;
                                    ety0Var6 = ety0Var3;
                                    i30 = i11;
                                    i31 = i13;
                                    wp2Var6 = wp2Var8;
                                    i32 = i25;
                                    i33 = i39;
                                    i34 = i24;
                                    ety0Var7 = ety0Var5;
                                    str2 = str5;
                                } else {
                                    btsVar.Y();
                                    if ((i6 & 16) != 0) {
                                        i25 &= -458753;
                                    }
                                    if ((i6 & 512) != 0) {
                                        i24 &= -15;
                                    }
                                    f530Var3 = f530Var;
                                    wp2Var6 = wp2Var;
                                    wp2Var5 = wp2Var2;
                                    i33 = i3;
                                    i29 = i4;
                                    ety0Var6 = ety0Var3;
                                    i30 = i11;
                                    i31 = i13;
                                    map4 = map2;
                                    i32 = i25;
                                    i34 = i24;
                                    ety0Var7 = ety0Var2;
                                }
                                btsVar.u();
                                btsVar.e0(2033455452);
                                BodyAlign bodyAlign = (BodyAlign) btsVar.m(u76.a);
                                btsVar.t(false);
                                jt1 alignment = bodyAlign.getAlignment();
                                ebp0Var.getClass();
                                ety0 ety0Var9 = ety0Var7;
                                f530 m = an91.m(cj6.a.a(f530Var3, alignment), 0.0f, ebp0Var.c() == SlotSize.XS ? 0.0f : 2.0f, 1);
                                sic a = qic.a(lr20.c, bodyAlign.getHorizontal(), btsVar, 0);
                                int hashCode = Long.hashCode(btsVar.T);
                                r1b0 o = btsVar.o();
                                f530 d = b.d(btsVar, m);
                                ohd.G1.getClass();
                                int i40 = i33;
                                sls slsVar = d.b;
                                int i41 = i29;
                                if (btsVar.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar.i0();
                                if (btsVar.S) {
                                    btsVar.n(slsVar);
                                } else {
                                    btsVar.r0();
                                }
                                qje.W(btsVar, d.f, a);
                                qje.W(btsVar, d.e, o);
                                qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                                qje.M(btsVar, d.h);
                                qje.W(btsVar, d.d, d);
                                jeb1.d(kk2Var2, null, wp2Var6, 0L, 0L, new sjy0(bodyAlign.getTextAlign()), 0L, i30, false, i31, 0, map4, null, ety0Var6, btsVar, ((i32 >> 3) & 14) | ((i32 >> 6) & 896) | ((i32 << 9) & 1879048192), ((i32 >> 18) & 112) | ((i32 << 3) & 7168) | (458752 & i32), 21882);
                                wp2 wp2Var9 = wp2Var6;
                                int i42 = i30;
                                int i43 = i31;
                                map3 = map4;
                                ety0 ety0Var10 = ety0Var6;
                                if (str2.length() > 0) {
                                    btsVar.e0(-101918555);
                                    ety0Var8 = ety0Var9;
                                    i35 = i40;
                                    i36 = i41;
                                    wp2Var7 = wp2Var5;
                                    str4 = str2;
                                    jeb1.f(str4, null, wp2Var7, 0L, 0L, null, new sjy0(bodyAlign.getTextAlign()), 0L, i35, false, i36, 0, null, ety0Var8, btsVar, ((i32 >> 21) & 896) | ((i32 >> 24) & 14) | (1879048192 & (i34 << 24)), ((i34 >> 3) & 112) | ((i34 << 12) & HProv.ALG_CLASS_ALL), 13690);
                                    btsVar.t(false);
                                } else {
                                    ety0Var8 = ety0Var9;
                                    i35 = i40;
                                    i36 = i41;
                                    wp2Var7 = wp2Var5;
                                    str4 = str2;
                                    btsVar.e0(-101710793);
                                    btsVar.t(false);
                                }
                                btsVar.t(true);
                                i11 = i42;
                                ety0Var3 = ety0Var10;
                                f530Var2 = f530Var3;
                                wp2Var3 = wp2Var9;
                                str3 = str4;
                                wp2Var4 = wp2Var7;
                                i26 = i35;
                                i28 = i36;
                                ety0Var4 = ety0Var8;
                                i27 = i43;
                            } else {
                                btsVar.Y();
                                f530Var2 = f530Var;
                                wp2Var3 = wp2Var;
                                wp2Var4 = wp2Var2;
                                i26 = i3;
                                i27 = i13;
                                map3 = map2;
                                str3 = str2;
                                ety0Var4 = ety0Var2;
                                i28 = i4;
                            }
                            v = btsVar.v();
                            if (v != null) {
                                v.d = new wls() { // from class: a86
                                    @Override // defpackage.wls
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        int O = vng.O(i5 | 1);
                                        p9b1.d(ebp0.this, kk2Var, map3, f530Var2, wp2Var3, ety0Var3, i11, i27, str3, wp2Var4, ety0Var4, i26, i28, (fid) obj, O, i6);
                                        return zy11.a;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        i17 = 2;
                        i18 = i6 & 1024;
                        if (i18 != 0) {
                        }
                        int i382 = i20;
                        i21 = i6 & 2048;
                        if (i21 != 0) {
                        }
                        if ((i6 & 4096) != 0) {
                        }
                        if ((i6 & 8192) != 0) {
                        }
                        i25 = i7;
                        if (btsVar.V(i25 & 1, (i7 & 306783379) == 306783378 || (i24 & 9363) != 9362)) {
                        }
                        v = btsVar.v();
                        if (v != null) {
                        }
                    }
                    i16 = i15;
                    if ((i6 & 512) != 0) {
                        i17 = 4;
                        i18 = i6 & 1024;
                        if (i18 != 0) {
                        }
                        int i3822 = i20;
                        i21 = i6 & 2048;
                        if (i21 != 0) {
                        }
                        if ((i6 & 4096) != 0) {
                        }
                        if ((i6 & 8192) != 0) {
                        }
                        i25 = i7;
                        if (btsVar.V(i25 & 1, (i7 & 306783379) == 306783378 || (i24 & 9363) != 9362)) {
                        }
                        v = btsVar.v();
                        if (v != null) {
                        }
                    }
                    i17 = 2;
                    i18 = i6 & 1024;
                    if (i18 != 0) {
                    }
                    int i38222 = i20;
                    i21 = i6 & 2048;
                    if (i21 != 0) {
                    }
                    if ((i6 & 4096) != 0) {
                    }
                    if ((i6 & 8192) != 0) {
                    }
                    i25 = i7;
                    if (btsVar.V(i25 & 1, (i7 & 306783379) == 306783378 || (i24 & 9363) != 9362)) {
                    }
                    v = btsVar.v();
                    if (v != null) {
                    }
                }
                if ((i5 & ImageMetadata.EDGE_MODE) != 0) {
                }
                i10 = i6 & 32;
                if (i10 == 0) {
                }
                i12 = i6 & 64;
                if (i12 == 0) {
                }
                i14 = i6 & 128;
                if (i14 == 0) {
                }
                i15 = i6 & 256;
                if (i15 == 0) {
                }
                i16 = i15;
                if ((i6 & 512) != 0) {
                }
                i17 = 2;
                i18 = i6 & 1024;
                if (i18 != 0) {
                }
                int i382222 = i20;
                i21 = i6 & 2048;
                if (i21 != 0) {
                }
                if ((i6 & 4096) != 0) {
                }
                if ((i6 & 8192) != 0) {
                }
                i25 = i7;
                if (btsVar.V(i25 & 1, (i7 & 306783379) == 306783378 || (i24 & 9363) != 9362)) {
                }
                v = btsVar.v();
                if (v != null) {
                }
            }
            i9 = i6 & 8;
            if (i9 != 0) {
            }
            if ((i5 & ImageMetadata.EDGE_MODE) != 0) {
            }
            i10 = i6 & 32;
            if (i10 == 0) {
            }
            i12 = i6 & 64;
            if (i12 == 0) {
            }
            i14 = i6 & 128;
            if (i14 == 0) {
            }
            i15 = i6 & 256;
            if (i15 == 0) {
            }
            i16 = i15;
            if ((i6 & 512) != 0) {
            }
            i17 = 2;
            i18 = i6 & 1024;
            if (i18 != 0) {
            }
            int i3822222 = i20;
            i21 = i6 & 2048;
            if (i21 != 0) {
            }
            if ((i6 & 4096) != 0) {
            }
            if ((i6 & 8192) != 0) {
            }
            i25 = i7;
            if (btsVar.V(i25 & 1, (i7 & 306783379) == 306783378 || (i24 & 9363) != 9362)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        map2 = map;
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        if (i9 != 0) {
        }
        if ((i5 & ImageMetadata.EDGE_MODE) != 0) {
        }
        i10 = i6 & 32;
        if (i10 == 0) {
        }
        i12 = i6 & 64;
        if (i12 == 0) {
        }
        i14 = i6 & 128;
        if (i14 == 0) {
        }
        i15 = i6 & 256;
        if (i15 == 0) {
        }
        i16 = i15;
        if ((i6 & 512) != 0) {
        }
        i17 = 2;
        i18 = i6 & 1024;
        if (i18 != 0) {
        }
        int i38222222 = i20;
        i21 = i6 & 2048;
        if (i21 != 0) {
        }
        if ((i6 & 4096) != 0) {
        }
        if ((i6 & 8192) != 0) {
        }
        i25 = i7;
        if (btsVar.V(i25 & 1, (i7 & 306783379) == 306783378 || (i24 & 9363) != 9362)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final int e(int i, wz40 wz40Var) {
        int i2 = wz40Var.c - 1;
        int i3 = 0;
        while (i3 < i2) {
            int c = x4e.c(i2, i3, 2, i3);
            Object[] objArr = wz40Var.a;
            int i4 = ((suw) objArr[c]).a;
            if (i4 != i) {
                if (i4 < i) {
                    i3 = c + 1;
                    if (i < ((suw) objArr[i3]).a) {
                    }
                } else {
                    i2 = c - 1;
                }
            }
            return c;
        }
        return i3;
    }

    public static String f(MessageData messageData) {
        int i = messageData.type;
        if (i == 0) {
            return "text";
        }
        if (i == 1) {
            return "image";
        }
        if (i == 4) {
            return "sticker";
        }
        if (i == 10) {
            return "album";
        }
        if (i == 1001) {
            return "video_file";
        }
        if (i == 6) {
            return "file";
        }
        if (i == 7) {
            return "div";
        }
        switch (i) {
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case HProv.PP_SET_PIN /* 107 */:
            case 108:
            case 109:
                return "system";
            default:
                return "unknown";
        }
    }
}
