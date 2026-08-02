package defpackage;

import android.util.Log;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.input.InputState;
import com.yandex.go.design.compose.slot.SlotSize;
import io.flutter.plugins.camerax.CameraXError;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class heb1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01bb  */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final hoy0 hoy0Var, final tls tlsVar, final f530 f530Var, boolean z, ety0 ety0Var, wp2 wp2Var, osy0 osy0Var, wp2 wp2Var2, final String str, wp2 wp2Var3, String str2, wp2 wp2Var4, ety0 ety0Var2, String str3, wp2 wp2Var5, boolean z2, ohy ohyVar, float f, fhy fhyVar, gy31 gy31Var, lkx lkxVar, xjx xjxVar, boolean z3, int i, int i2, zx40 zx40Var, tls tlsVar2, SlotSize slotSize, bms bmsVar, bms bmsVar2, final a aVar, fid fidVar, final int i3, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        final wp2 wp2Var6;
        String str4;
        fhy fhyVar2;
        int i9;
        int i10;
        zx40 zx40Var2;
        int i11;
        int i12;
        bts btsVar;
        final boolean z4;
        final ety0 ety0Var3;
        final osy0 osy0Var2;
        final wp2 wp2Var7;
        final wp2 wp2Var8;
        final wp2 wp2Var9;
        final boolean z5;
        final ohy ohyVar2;
        final float f2;
        final gy31 gy31Var2;
        final lkx lkxVar2;
        final xjx xjxVar2;
        final boolean z6;
        final int i13;
        final int i14;
        final tls tlsVar3;
        final SlotSize slotSize2;
        final bms bmsVar3;
        final bms bmsVar4;
        final String str5;
        final fhy fhyVar3;
        final zx40 zx40Var3;
        final ety0 ety0Var4;
        final String str6;
        final wp2 wp2Var10;
        aii0 v;
        int i15;
        AppColor$Palette appColor$Palette;
        SlotSize slotSize3;
        String str7;
        ?? r3;
        bms bmsVar5;
        final wp2 wp2Var11;
        int i16;
        final boolean z7;
        int i17;
        final fhy fhyVar4;
        final wp2 wp2Var12;
        final bms bmsVar6;
        final int i18;
        wp2 wp2Var13;
        final ety0 ety0Var5;
        gy31 gy31Var3;
        osy0 osy0Var3;
        final boolean z8;
        lkx lkxVar3;
        final xjx xjxVar3;
        final wp2 wp2Var14;
        final SlotSize slotSize4;
        final String str8;
        final ety0 ety0Var6;
        final float f3;
        final wp2 wp2Var15;
        final bms bmsVar7;
        boolean z9;
        final String str9;
        final zx40 zx40Var4;
        tls tlsVar4;
        boolean z10;
        InputState inputState;
        int i19;
        int i20;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-261811951);
        if ((i3 & 6) == 0) {
            i7 = (btsVar2.k(hoy0Var) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i7 |= btsVar2.k(f530Var) ? 256 : 128;
        }
        int i21 = i7 | HProv.ALG_TYPE_SECURECHANNEL;
        if ((i6 & 16) != 0) {
            i21 = i7 | 27648;
        } else if ((i3 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i21 |= btsVar2.a(false) ? 16384 : 8192;
        }
        if ((i3 & ImageMetadata.EDGE_MODE) == 0) {
            i21 |= 65536;
        }
        int i22 = i6 & 64;
        if (i22 != 0) {
            i21 |= 1572864;
            i8 = 196608;
            wp2Var6 = wp2Var;
        } else {
            i8 = 196608;
            wp2Var6 = wp2Var;
            if ((i3 & 1572864) == 0) {
                i21 |= btsVar2.k(wp2Var6) ? 1048576 : 524288;
            }
        }
        if ((i3 & 12582912) == 0) {
            i21 |= SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((i3 & 100663296) == 0) {
            i21 |= SelfTester_JCP.DECRYPT_CFB;
        }
        int i23 = i3 & 805306368;
        int i24 = SelfTester_JCP.IMITA;
        if (i23 == 0) {
            i21 |= btsVar2.k(str) ? 536870912 : 268435456;
        }
        int i25 = i4 | 6;
        int i26 = i6 & 2048;
        if (i26 != 0) {
            i25 = i4 | 54;
            str4 = str2;
        } else {
            str4 = str2;
            if ((i4 & 48) == 0) {
                i25 |= btsVar2.k(str4) ? 32 : 16;
            }
        }
        int i27 = i25;
        int i28 = i27 | 384;
        if ((i4 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i28 = i27 | 1408;
        }
        int i29 = 221184 | i28;
        if ((i4 & 1572864) == 0) {
            i29 = 745472 | i28;
        }
        if ((i4 & 12582912) == 0) {
            i29 |= SelfTester_JCP.ENCRYPT_CBC;
        }
        int i30 = i29 | 100663296;
        if ((i4 & 805306368) == 0) {
            if ((i6 & 524288) == 0) {
                fhyVar2 = fhyVar;
                if (btsVar2.k(fhyVar2)) {
                    i20 = 536870912;
                    i30 |= i20;
                }
            } else {
                fhyVar2 = fhyVar;
            }
            i20 = 268435456;
            i30 |= i20;
        } else {
            fhyVar2 = fhyVar;
        }
        int i31 = i5 | 438;
        int i32 = i6 & SelfTester_JCP.ENCRYPT_CNT;
        if (i32 != 0) {
            i31 = i5 | 3510;
            i9 = i30;
        } else {
            i9 = i30;
            if ((i5 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                i31 |= btsVar2.a(z3) ? 2048 : 1024;
                if ((i5 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    if ((i6 & 16777216) == 0 && btsVar2.c(i)) {
                        i19 = 16384;
                        i31 |= i19;
                    }
                    i19 = 8192;
                    i31 |= i19;
                }
                int i33 = i31 | i8;
                i10 = i6 & SelfTester_JCP.DECRYPT_CBC;
                if (i10 == 0) {
                    i33 = i31 | 1769472;
                } else if ((i5 & 1572864) == 0) {
                    zx40Var2 = zx40Var;
                    i33 |= btsVar2.k(zx40Var2) ? 1048576 : 524288;
                    i11 = i33 | 113246208;
                    i12 = i6 & 536870912;
                    if (i12 != 0) {
                        i11 = i33 | 918552576;
                    } else if ((i5 & 805306368) == 0) {
                        if (btsVar2.e(bmsVar)) {
                            i24 = 536870912;
                        }
                        i11 |= i24;
                    }
                    if (btsVar2.V(i21 & 1, ((i21 & 306783379) != 306783378 && (i9 & 306783379) == 306783378 && (i11 & 306783379) == 306783378) ? false : true)) {
                        btsVar2.a0();
                        int i34 = i3 & 1;
                        o430 o430Var = did.a;
                        if (i34 == 0 || btsVar2.C()) {
                            ety0 ety0Var7 = xya1.e(btsVar2).g.a;
                            if (i22 != 0) {
                                wp2Var6 = tp2.a;
                            }
                            osy0 d = f7b1.d(btsVar2, 6);
                            up2 up2Var = new up2(aq2.a);
                            AppColor$Palette appColor$Palette2 = AppColor$Palette.TextMinor;
                            if (i26 != 0) {
                                str4 = "";
                            }
                            ety0 ety0Var8 = xya1.e(btsVar2).h.a;
                            AppColor$Palette appColor$Palette3 = AppColor$Palette.Error;
                            boolean z11 = "".length() > 0;
                            if ((i6 & 524288) != 0) {
                                fhyVar2 = ghy.a;
                            }
                            dy31 dy31Var = zoy0.w;
                            lkx lkxVar4 = lkx.f;
                            xjx xjxVar4 = xjx.g;
                            boolean z12 = i32 != 0 ? false : z3;
                            if ((i6 & 16777216) != 0) {
                                i15 = z12 ? 1 : Integer.MAX_VALUE;
                                i11 &= -57345;
                            } else {
                                i15 = i;
                            }
                            if (i10 != 0) {
                                Object Q = btsVar2.Q();
                                if (Q == o430Var) {
                                    Q = ly3.i(btsVar2);
                                }
                                zx40Var2 = (zx40) Q;
                            }
                            Object Q2 = btsVar2.Q();
                            if (Q2 == o430Var) {
                                appColor$Palette = appColor$Palette2;
                                Q2 = new wk6(6);
                                btsVar2.o0(Q2);
                            } else {
                                appColor$Palette = appColor$Palette2;
                            }
                            tls tlsVar5 = (tls) Q2;
                            SlotSize slotSize5 = SlotSize.L;
                            if (i12 != 0) {
                                slotSize3 = slotSize5;
                                str7 = "";
                                r3 = true;
                                bmsVar5 = wwg.S(88073034, true, new eed(12), btsVar2);
                            } else {
                                slotSize3 = slotSize5;
                                str7 = "";
                                r3 = true;
                                bmsVar5 = bmsVar;
                            }
                            b8d.a.getClass();
                            fhy fhyVar5 = fhyVar2;
                            wp2Var11 = up2Var;
                            i16 = i15;
                            z7 = z11;
                            i17 = i11;
                            fhyVar4 = fhyVar5;
                            wp2Var12 = appColor$Palette;
                            bmsVar6 = b8d.c;
                            i18 = r3;
                            wp2Var13 = wp2Var6;
                            ety0Var5 = ety0Var8;
                            gy31Var3 = dy31Var;
                            ohyVar2 = hk91.a;
                            osy0Var3 = d;
                            z8 = z12;
                            lkxVar3 = lkxVar4;
                            xjxVar3 = xjxVar4;
                            wp2Var14 = wp2Var12;
                            slotSize4 = slotSize3;
                            str8 = str7;
                            ety0Var6 = ety0Var7;
                            f3 = 7.0f;
                            wp2Var15 = appColor$Palette3;
                            bmsVar7 = bmsVar5;
                            z9 = i18 == true ? 1 : 0;
                            str9 = str4;
                            zx40Var4 = zx40Var2;
                            tlsVar4 = tlsVar5;
                        } else {
                            btsVar2.Y();
                            if ((i6 & 16777216) != 0) {
                                i11 &= -57345;
                            }
                            z9 = z;
                            ety0Var6 = ety0Var;
                            osy0Var3 = osy0Var;
                            wp2Var12 = wp2Var3;
                            wp2Var14 = wp2Var4;
                            ety0Var5 = ety0Var2;
                            str8 = str3;
                            wp2Var15 = wp2Var5;
                            z7 = z2;
                            ohyVar2 = ohyVar;
                            f3 = f;
                            lkxVar3 = lkxVar;
                            xjxVar3 = xjxVar;
                            z8 = z3;
                            i16 = i;
                            i18 = i2;
                            slotSize4 = slotSize;
                            bmsVar7 = bmsVar;
                            bmsVar6 = bmsVar2;
                            wp2Var13 = wp2Var6;
                            str9 = str4;
                            zx40Var4 = zx40Var2;
                            i17 = i11;
                            gy31Var3 = gy31Var;
                            tlsVar4 = tlsVar2;
                            fhyVar4 = fhyVar2;
                            wp2Var11 = wp2Var2;
                        }
                        btsVar2.u();
                        oz40 b = androidx.compose.foundation.interaction.a.b(zx40Var4, btsVar2, (i17 >> 18) & 14);
                        if (z7) {
                            inputState = ((Boolean) b.getValue()).booleanValue() ? InputState.ErrorFocused : InputState.ErrorUnfocused;
                            z10 = z9;
                        } else {
                            z10 = z9;
                            inputState = hoy0Var.a.b.length() > 0 ? ((Boolean) b.getValue()).booleanValue() ? InputState.FillFocused : InputState.FillUnfocused : ((Boolean) b.getValue()).booleanValue() ? InputState.EmptyFocused : InputState.EmptyUnfocused;
                        }
                        Object Q3 = btsVar2.Q();
                        if (Q3 == o430Var) {
                            Q3 = f.j(inputState);
                            btsVar2.o0(Q3);
                        }
                        final oz40 oz40Var = (oz40) Q3;
                        oz40Var.setValue(inputState);
                        final ety0 e = ety0.e(ety0Var6, tje.n(inputState == InputState.ErrorUnfocused ? wp2Var15 : wp2Var13, btsVar2), 0L, null, null, null, 0L, null, 0, 0L, 16777214);
                        vvf0 a = psy0.a.a(osy0Var3);
                        z4 = z10;
                        osy0 osy0Var4 = osy0Var3;
                        final InputState inputState2 = inputState;
                        final gy31 gy31Var4 = gy31Var3;
                        final lkx lkxVar5 = lkxVar3;
                        final int i35 = i16;
                        final tls tlsVar6 = tlsVar4;
                        btsVar = btsVar2;
                        sb2.b(a, wwg.S(746730577, true, new wls() { // from class: lhy
                            @Override // defpackage.wls
                            public final Object invoke(Object obj, Object obj2) {
                                fid fidVar2 = (fid) obj;
                                int intValue = ((Integer) obj2).intValue();
                                bts btsVar3 = (bts) fidVar2;
                                if (btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                                    ne5.a(hoy0.this, tlsVar, pmb1.e(f530Var), z4, false, e, lkxVar5, xjxVar3, z8, i35, i18, gy31Var4, tlsVar6, zx40Var4, new a6t0(tje.n(wp2Var11, btsVar3)), wwg.S(-378141004, true, new khy(oz40Var, fhyVar4, ohyVar2, slotSize4, z7, str8, wp2Var15, bmsVar7, f3, str9, str, ety0Var6, ety0Var5, wp2Var14, inputState2, wp2Var12, bmsVar6, aVar, 1), btsVar3), btsVar3, 0, ImageMetadata.EDGE_MODE, 0);
                                } else {
                                    btsVar3.Y();
                                }
                                return zy11.a;
                            }
                        }, btsVar), btsVar, 56);
                        boolean z13 = z7;
                        fhyVar3 = fhyVar4;
                        z5 = z13;
                        i14 = i18;
                        wp2Var10 = wp2Var15;
                        bmsVar3 = bmsVar7;
                        ety0Var3 = ety0Var6;
                        wp2Var8 = wp2Var12;
                        bmsVar4 = bmsVar6;
                        lkxVar2 = lkxVar5;
                        xjxVar2 = xjxVar3;
                        zx40Var3 = zx40Var4;
                        ety0Var4 = ety0Var5;
                        wp2Var6 = wp2Var13;
                        osy0Var2 = osy0Var4;
                        tlsVar3 = tlsVar6;
                        wp2Var9 = wp2Var14;
                        slotSize2 = slotSize4;
                        f2 = f3;
                        z6 = z8;
                        wp2Var7 = wp2Var11;
                        str6 = str8;
                        gy31Var2 = gy31Var4;
                        str5 = str9;
                        i13 = i35;
                    } else {
                        btsVar = btsVar2;
                        btsVar.Y();
                        z4 = z;
                        ety0Var3 = ety0Var;
                        osy0Var2 = osy0Var;
                        wp2Var7 = wp2Var2;
                        wp2Var8 = wp2Var3;
                        wp2Var9 = wp2Var4;
                        z5 = z2;
                        ohyVar2 = ohyVar;
                        f2 = f;
                        gy31Var2 = gy31Var;
                        lkxVar2 = lkxVar;
                        xjxVar2 = xjxVar;
                        z6 = z3;
                        i13 = i;
                        i14 = i2;
                        tlsVar3 = tlsVar2;
                        slotSize2 = slotSize;
                        bmsVar3 = bmsVar;
                        bmsVar4 = bmsVar2;
                        str5 = str4;
                        fhyVar3 = fhyVar2;
                        zx40Var3 = zx40Var2;
                        ety0Var4 = ety0Var2;
                        str6 = str3;
                        wp2Var10 = wp2Var5;
                    }
                    v = btsVar.v();
                    if (v != null) {
                        v.d = new wls() { // from class: mhy
                            @Override // defpackage.wls
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int O = vng.O(i3 | 1);
                                int O2 = vng.O(i4);
                                int O3 = vng.O(i5);
                                heb1.a(hoy0.this, tlsVar, f530Var, z4, ety0Var3, wp2Var6, osy0Var2, wp2Var7, str, wp2Var8, str5, wp2Var9, ety0Var4, str6, wp2Var10, z5, ohyVar2, f2, fhyVar3, gy31Var2, lkxVar2, xjxVar2, z6, i13, i14, zx40Var3, tlsVar3, slotSize2, bmsVar3, bmsVar4, aVar, (fid) obj, O, O2, O3, i6);
                                return zy11.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                zx40Var2 = zx40Var;
                i11 = i33 | 113246208;
                i12 = i6 & 536870912;
                if (i12 != 0) {
                }
                if (btsVar2.V(i21 & 1, ((i21 & 306783379) != 306783378 && (i9 & 306783379) == 306783378 && (i11 & 306783379) == 306783378) ? false : true)) {
                }
                v = btsVar.v();
                if (v != null) {
                }
            }
        }
        if ((i5 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
        }
        int i332 = i31 | i8;
        i10 = i6 & SelfTester_JCP.DECRYPT_CBC;
        if (i10 == 0) {
        }
        zx40Var2 = zx40Var;
        i11 = i332 | 113246208;
        i12 = i6 & 536870912;
        if (i12 != 0) {
        }
        if (btsVar2.V(i21 & 1, ((i21 & 306783379) != 306783378 && (i9 & 306783379) == 306783378 && (i11 & 306783379) == 306783378) ? false : true)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a4, code lost:
    
        if (r4.c(r78) == false) goto L133;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final String str, final tls tlsVar, f530 f530Var, boolean z, ety0 ety0Var, wp2 wp2Var, osy0 osy0Var, wp2 wp2Var2, String str2, wp2 wp2Var3, String str3, wp2 wp2Var4, ety0 ety0Var2, String str4, wp2 wp2Var5, boolean z2, ohy ohyVar, float f, fhy fhyVar, gy31 gy31Var, lkx lkxVar, xjx xjxVar, boolean z3, int i, int i2, zx40 zx40Var, tls tlsVar2, SlotSize slotSize, bms bmsVar, bms bmsVar2, bms bmsVar3, fid fidVar, final int i3, final int i4, final int i5, final int i6, final int i7, final int i8) {
        int i9;
        f530 f530Var2;
        int i10;
        ety0 ety0Var3;
        int i11;
        wp2 wp2Var6;
        int i12;
        int i13;
        String str5;
        int i14;
        int i15;
        int i16;
        String str6;
        int i17;
        int i18;
        String str7;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        final boolean z4;
        final osy0 osy0Var2;
        final wp2 wp2Var7;
        final boolean z5;
        final ohy ohyVar2;
        final float f2;
        final fhy fhyVar2;
        final gy31 gy31Var2;
        final lkx lkxVar2;
        final xjx xjxVar2;
        final boolean z6;
        final int i29;
        final int i30;
        final zx40 zx40Var2;
        final tls tlsVar3;
        final SlotSize slotSize2;
        final bms bmsVar4;
        final bms bmsVar5;
        final bms bmsVar6;
        bts btsVar;
        final String str8;
        final f530 f530Var3;
        final ety0 ety0Var4;
        final String str9;
        final wp2 wp2Var8;
        final ety0 ety0Var5;
        final wp2 wp2Var9;
        final String str10;
        final wp2 wp2Var10;
        final wp2 wp2Var11;
        aii0 v;
        bts btsVar2;
        up2 up2Var;
        ohy ohyVar3;
        int i31;
        zx40 zx40Var3;
        String str11;
        SlotSize slotSize3;
        AppColor$Palette appColor$Palette;
        bms bmsVar7;
        final gy31 gy31Var3;
        final xjx xjxVar3;
        osy0 osy0Var3;
        final wp2 wp2Var12;
        int i32;
        zx40 zx40Var4;
        final String str12;
        final wp2 wp2Var13;
        final wp2 wp2Var14;
        final bms bmsVar8;
        final bms bmsVar9;
        final bms bmsVar10;
        final String str13;
        final ety0 ety0Var6;
        final wp2 wp2Var15;
        final boolean z7;
        final ety0 ety0Var7;
        final String str14;
        final fhy fhyVar3;
        int i33;
        final float f3;
        final lkx lkxVar3;
        final boolean z8;
        final ohy ohyVar4;
        final int i34;
        final boolean z9;
        final int i35;
        final tls tlsVar4;
        SlotSize slotSize4;
        int i36;
        bts btsVar3 = (bts) fidVar;
        btsVar3.g0(-1918439234);
        if ((i3 & 6) == 0) {
            i9 = (btsVar3.k(str) ? 4 : 2) | i3;
        } else {
            i9 = i3;
        }
        if ((i3 & 48) == 0) {
            i9 |= btsVar3.e(tlsVar) ? 32 : 16;
        }
        int i37 = i7 & 4;
        if (i37 != 0) {
            i9 |= 384;
        } else if ((i3 & 384) == 0) {
            f530Var2 = f530Var;
            i9 |= btsVar3.k(f530Var2) ? 256 : 128;
            i10 = i9 | 27648;
            if ((i3 & ImageMetadata.EDGE_MODE) != 0) {
                if ((i7 & 32) == 0) {
                    ety0Var3 = ety0Var;
                    if (btsVar3.k(ety0Var3)) {
                        i36 = 131072;
                        i10 |= i36;
                    }
                } else {
                    ety0Var3 = ety0Var;
                }
                i36 = 65536;
                i10 |= i36;
            } else {
                ety0Var3 = ety0Var;
            }
            i11 = i7 & 64;
            if (i11 == 0) {
                i10 |= 1572864;
                wp2Var6 = wp2Var;
            } else {
                wp2Var6 = wp2Var;
                if ((i3 & 1572864) == 0) {
                    i10 |= btsVar3.k(wp2Var6) ? 1048576 : 524288;
                }
            }
            i12 = i3 & 12582912;
            int i38 = SelfTester_JCP.ENCRYPT_CBC;
            if (i12 == 0) {
                i10 |= SelfTester_JCP.ENCRYPT_CBC;
            }
            if ((i3 & 100663296) == 0) {
                i10 |= SelfTester_JCP.DECRYPT_CFB;
            }
            i13 = i7 & 512;
            int i39 = SelfTester_JCP.IMITA;
            if (i13 == 0) {
                i10 |= 805306368;
                str5 = str2;
            } else {
                str5 = str2;
                if ((i3 & 805306368) == 0) {
                    i14 = 65536;
                    i10 |= btsVar3.k(str5) ? 536870912 : 268435456;
                    int i40 = i4 | 6;
                    i15 = i7 & 2048;
                    i16 = 54;
                    if (i15 != 0) {
                        str6 = str3;
                        i17 = 54;
                    } else {
                        str6 = str3;
                        if ((i4 & 48) == 0) {
                            i40 |= btsVar3.k(str6) ? 32 : 16;
                        }
                        i17 = i40;
                    }
                    int i41 = i17 | 1408;
                    i18 = i7 & 16384;
                    int i42 = 16384;
                    if (i18 != 0) {
                        i19 = i17 | 25984;
                        str7 = str4;
                    } else {
                        str7 = str4;
                        i19 = i41 | (btsVar3.k(str7) ? 16384 : 8192);
                    }
                    int i43 = i19 | ImageMetadata.EDGE_MODE;
                    if ((i7 & i14) == 0) {
                        i20 = i18;
                        if (btsVar3.a(z2)) {
                            i21 = 1048576;
                            int i44 = i43 | i21;
                            if ((i7 & 131072) == 0 && btsVar3.k(ohyVar)) {
                                i38 = 8388608;
                            }
                            i22 = i44 | i38 | 100663296 | (((i7 & 524288) == 0 || !btsVar3.k(fhyVar)) ? 268435456 : 536870912);
                            int i45 = i5 | 6;
                            i23 = i7 & 2097152;
                            if (i23 == 0) {
                                i45 = i5 | 54;
                            } else if ((i5 & 48) == 0) {
                                i45 |= btsVar3.k(lkxVar) ? 32 : 16;
                            }
                            int i46 = i45;
                            int i47 = i46 | 384;
                            i24 = i7 & SelfTester_JCP.ENCRYPT_CNT;
                            if (i24 == 0) {
                                i47 = i46 | 3456;
                            } else if ((i5 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                                i47 |= btsVar3.a(z3) ? 2048 : 1024;
                                if ((i5 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                                    if ((i7 & 16777216) != 0) {
                                    }
                                    i42 = 8192;
                                    i47 |= i42;
                                }
                                int i48 = i47 | ImageMetadata.EDGE_MODE;
                                i25 = i7 & SelfTester_JCP.DECRYPT_CBC;
                                if (i25 != 0) {
                                    i48 = i47 | 1769472;
                                } else if ((i5 & 1572864) == 0) {
                                    i48 |= btsVar3.k(zx40Var) ? 1048576 : 524288;
                                    i26 = i48 | 113246208;
                                    i27 = i7 & 536870912;
                                    if (i27 == 0) {
                                        i26 = i48 | 918552576;
                                    } else if ((i5 & 805306368) == 0) {
                                        if (btsVar3.e(bmsVar)) {
                                            i39 = 536870912;
                                        }
                                        i26 |= i39;
                                    }
                                    int i49 = i6 | 6;
                                    i28 = i8 & 1;
                                    if (i28 == 0) {
                                        if ((i6 & 48) == 0) {
                                            i16 = i49 | (btsVar3.e(bmsVar3) ? 32 : 16);
                                        } else {
                                            i16 = i49;
                                        }
                                    }
                                    if (btsVar3.V(i10 & 1, ((i10 & 306783379) != 306783378 && (i22 & 306783379) == 306783378 && (i26 & 306783379) == 306783378 && (i16 & 19) == 18) ? false : true)) {
                                        btsVar3.Y();
                                        z4 = z;
                                        osy0Var2 = osy0Var;
                                        wp2Var7 = wp2Var4;
                                        z5 = z2;
                                        ohyVar2 = ohyVar;
                                        f2 = f;
                                        fhyVar2 = fhyVar;
                                        gy31Var2 = gy31Var;
                                        lkxVar2 = lkxVar;
                                        xjxVar2 = xjxVar;
                                        z6 = z3;
                                        i29 = i;
                                        i30 = i2;
                                        zx40Var2 = zx40Var;
                                        tlsVar3 = tlsVar2;
                                        slotSize2 = slotSize;
                                        bmsVar4 = bmsVar;
                                        bmsVar5 = bmsVar2;
                                        bmsVar6 = bmsVar3;
                                        btsVar = btsVar3;
                                        str8 = str7;
                                        f530Var3 = f530Var2;
                                        ety0Var4 = ety0Var3;
                                        str9 = str5;
                                        wp2Var8 = wp2Var2;
                                        ety0Var5 = ety0Var2;
                                        wp2Var9 = wp2Var5;
                                        str10 = str6;
                                        wp2Var10 = wp2Var6;
                                        wp2Var11 = wp2Var3;
                                    } else {
                                        btsVar3.a0();
                                        int i50 = i3 & 1;
                                        o430 o430Var = did.a;
                                        if (i50 == 0 || btsVar3.C()) {
                                            if (i37 != 0) {
                                                f530Var2 = c530.a;
                                            }
                                            if ((i7 & 32) != 0) {
                                                i10 &= -458753;
                                                ety0Var3 = xya1.e(btsVar3).g.a;
                                            }
                                            if (i11 != 0) {
                                                wp2Var6 = tp2.a;
                                            }
                                            osy0 d = f7b1.d(btsVar3, 6);
                                            btsVar2 = btsVar3;
                                            up2 up2Var2 = new up2(aq2.a);
                                            int i51 = i10 & (-264241153);
                                            if (i13 != 0) {
                                                str5 = "";
                                            }
                                            AppColor$Palette appColor$Palette2 = AppColor$Palette.TextMinor;
                                            if (i15 != 0) {
                                                str6 = "";
                                            }
                                            ety0 ety0Var8 = xya1.e(btsVar2).h.a;
                                            String str15 = i20 == 0 ? str7 : "";
                                            AppColor$Palette appColor$Palette3 = AppColor$Palette.Error;
                                            boolean z10 = (i7 & i14) != 0 ? str15.length() > 0 : z2;
                                            if ((i7 & 131072) != 0) {
                                                up2Var = up2Var2;
                                                ohyVar3 = hk91.a;
                                            } else {
                                                up2Var = up2Var2;
                                                ohyVar3 = ohyVar;
                                            }
                                            fhy fhyVar4 = (i7 & 524288) != 0 ? ghy.a : fhyVar;
                                            dy31 dy31Var = zoy0.w;
                                            lkx lkxVar4 = i23 != 0 ? lkx.f : lkxVar;
                                            xjx xjxVar4 = xjx.g;
                                            boolean z11 = i24 != 0 ? false : z3;
                                            if ((i7 & 16777216) != 0) {
                                                i31 = z11 ? 1 : Integer.MAX_VALUE;
                                                i26 &= -57345;
                                            } else {
                                                i31 = i;
                                            }
                                            if (i25 != 0) {
                                                Object Q = btsVar2.Q();
                                                if (Q == o430Var) {
                                                    Q = ly3.i(btsVar2);
                                                }
                                                zx40Var3 = (zx40) Q;
                                            } else {
                                                zx40Var3 = zx40Var;
                                            }
                                            Object Q2 = btsVar2.Q();
                                            if (Q2 == o430Var) {
                                                str11 = str15;
                                                Q2 = new wk6(6);
                                                btsVar2.o0(Q2);
                                            } else {
                                                str11 = str15;
                                            }
                                            tls tlsVar5 = (tls) Q2;
                                            SlotSize slotSize5 = SlotSize.L;
                                            if (i27 != 0) {
                                                slotSize3 = slotSize5;
                                                appColor$Palette = appColor$Palette2;
                                                bmsVar7 = wwg.S(1620052983, true, new alb0(12, ohyVar3), btsVar2);
                                            } else {
                                                slotSize3 = slotSize5;
                                                appColor$Palette = appColor$Palette2;
                                                bmsVar7 = bmsVar;
                                            }
                                            b8d.a.getClass();
                                            a aVar = b8d.b;
                                            if (i28 != 0) {
                                                bms bmsVar11 = bmsVar7;
                                                ohy ohyVar5 = ohyVar3;
                                                a S = wwg.S(-2039559281, true, new l0(16, appColor$Palette3, ohyVar3), btsVar2);
                                                gy31Var3 = dy31Var;
                                                xjxVar3 = xjxVar4;
                                                osy0Var3 = d;
                                                wp2Var12 = up2Var;
                                                i32 = i51;
                                                str12 = str11;
                                                wp2Var13 = appColor$Palette;
                                                wp2Var14 = wp2Var13;
                                                bmsVar8 = bmsVar11;
                                                bmsVar9 = S;
                                                bmsVar10 = aVar;
                                                str13 = str6;
                                                ety0Var6 = ety0Var8;
                                                wp2Var15 = appColor$Palette3;
                                                z7 = z10;
                                                ety0Var7 = ety0Var3;
                                                str14 = str5;
                                                fhyVar3 = fhyVar4;
                                                i33 = i26;
                                                f3 = 7.0f;
                                                lkxVar3 = lkxVar4;
                                                z8 = z11;
                                                ohyVar4 = ohyVar5;
                                                i34 = i31;
                                                z9 = true;
                                                i35 = 1;
                                                zx40Var4 = zx40Var3;
                                            } else {
                                                ohy ohyVar6 = ohyVar3;
                                                bms bmsVar12 = bmsVar7;
                                                gy31Var3 = dy31Var;
                                                xjxVar3 = xjxVar4;
                                                osy0Var3 = d;
                                                wp2Var12 = up2Var;
                                                i32 = i51;
                                                zx40Var4 = zx40Var3;
                                                str12 = str11;
                                                wp2Var13 = appColor$Palette;
                                                wp2Var14 = wp2Var13;
                                                bmsVar8 = bmsVar12;
                                                bmsVar9 = bmsVar3;
                                                bmsVar10 = aVar;
                                                str13 = str6;
                                                ety0Var6 = ety0Var8;
                                                wp2Var15 = appColor$Palette3;
                                                z7 = z10;
                                                ety0Var7 = ety0Var3;
                                                str14 = str5;
                                                fhyVar3 = fhyVar4;
                                                i33 = i26;
                                                f3 = 7.0f;
                                                lkxVar3 = lkxVar4;
                                                z8 = z11;
                                                ohyVar4 = ohyVar6;
                                                i34 = i31;
                                                z9 = true;
                                                i35 = 1;
                                            }
                                            tlsVar4 = tlsVar5;
                                            slotSize4 = slotSize3;
                                        } else {
                                            btsVar3.Y();
                                            if ((i7 & 32) != 0) {
                                                i10 &= -458753;
                                            }
                                            int i52 = i10 & (-264241153);
                                            if ((i7 & 16777216) != 0) {
                                                i26 &= -57345;
                                            }
                                            z9 = z;
                                            wp2Var12 = wp2Var2;
                                            wp2Var14 = wp2Var3;
                                            wp2Var13 = wp2Var4;
                                            ety0Var6 = ety0Var2;
                                            wp2Var15 = wp2Var5;
                                            z7 = z2;
                                            ohyVar4 = ohyVar;
                                            f3 = f;
                                            fhyVar3 = fhyVar;
                                            gy31Var3 = gy31Var;
                                            xjxVar3 = xjxVar;
                                            z8 = z3;
                                            i34 = i;
                                            i35 = i2;
                                            zx40Var4 = zx40Var;
                                            tlsVar4 = tlsVar2;
                                            bmsVar8 = bmsVar;
                                            bmsVar10 = bmsVar2;
                                            bmsVar9 = bmsVar3;
                                            i32 = i52;
                                            btsVar2 = btsVar3;
                                            str13 = str6;
                                            str12 = str7;
                                            ety0Var7 = ety0Var3;
                                            str14 = str5;
                                            i33 = i26;
                                            osy0Var3 = osy0Var;
                                            lkxVar3 = lkxVar;
                                            slotSize4 = slotSize;
                                        }
                                        final f530 f530Var4 = f530Var2;
                                        btsVar2.u();
                                        oz40 b = androidx.compose.foundation.interaction.a.b(zx40Var4, btsVar2, (i33 >> 18) & 14);
                                        InputState inputState = z7 ? ((Boolean) b.getValue()).booleanValue() ? InputState.ErrorFocused : InputState.ErrorUnfocused : str.length() > 0 ? ((Boolean) b.getValue()).booleanValue() ? InputState.FillFocused : InputState.FillUnfocused : ((Boolean) b.getValue()).booleanValue() ? InputState.EmptyFocused : InputState.EmptyUnfocused;
                                        Object Q3 = btsVar2.Q();
                                        if (Q3 == o430Var) {
                                            Q3 = f.j(inputState);
                                            btsVar2.o0(Q3);
                                        }
                                        final oz40 oz40Var = (oz40) Q3;
                                        oz40Var.setValue(inputState);
                                        final ety0 e = ety0.e(ety0Var7, tje.n(inputState == InputState.ErrorUnfocused ? wp2Var15 : wp2Var6, btsVar2), 0L, null, null, null, 0L, null, 0, 0L, 16777214);
                                        Object Q4 = btsVar2.Q();
                                        if (Q4 == o430Var) {
                                            int length = str.length();
                                            Q4 = f.j(new hoy0(str, eja1.c(length, length), 4));
                                            btsVar2 = btsVar2;
                                            btsVar2.o0(Q4);
                                        }
                                        final oz40 oz40Var2 = (oz40) Q4;
                                        final zx40 zx40Var5 = zx40Var4;
                                        final SlotSize slotSize6 = slotSize4;
                                        int i53 = i32;
                                        final hoy0 b2 = hoy0.b((hoy0) oz40Var2.getValue(), str, 0L, 6);
                                        boolean k = btsVar2.k(b2);
                                        Object Q5 = btsVar2.Q();
                                        if (k || Q5 == o430Var) {
                                            Q5 = new le5(b2, oz40Var2, 2);
                                            btsVar2.o0(Q5);
                                        }
                                        zpn.i((sls) Q5, btsVar2);
                                        boolean z12 = (i53 & 14) == 4;
                                        Object Q6 = btsVar2.Q();
                                        if (z12 || Q6 == o430Var) {
                                            Q6 = f.j(str);
                                            btsVar2.o0(Q6);
                                        }
                                        final oz40 oz40Var3 = (oz40) Q6;
                                        final InputState inputState2 = inputState;
                                        sb2.b(psy0.a.a(osy0Var3), wwg.S(-1782885378, true, new wls() { // from class: ihy
                                            @Override // defpackage.wls
                                            public final Object invoke(Object obj, Object obj2) {
                                                fid fidVar2 = (fid) obj;
                                                int intValue = ((Integer) obj2).intValue();
                                                bts btsVar4 = (bts) fidVar2;
                                                if (btsVar4.V(intValue & 1, (intValue & 3) != 2)) {
                                                    oz40 oz40Var4 = oz40Var3;
                                                    boolean k2 = btsVar4.k(oz40Var4);
                                                    tls tlsVar6 = tlsVar;
                                                    boolean k3 = k2 | btsVar4.k(tlsVar6);
                                                    Object Q7 = btsVar4.Q();
                                                    if (k3 || Q7 == did.a) {
                                                        Q7 = new me5(tlsVar6, oz40Var2, oz40Var4, 2);
                                                        btsVar4.o0(Q7);
                                                    }
                                                    ne5.a(hoy0.this, (tls) Q7, pmb1.e(f530Var4), z9, false, e, lkxVar3, xjxVar3, z8, i34, i35, gy31Var3, tlsVar4, zx40Var5, new a6t0(tje.n(wp2Var12, btsVar4)), wwg.S(-2048050847, true, new khy(oz40Var, fhyVar3, ohyVar4, slotSize6, z7, str12, wp2Var15, bmsVar8, f3, str13, str14, ety0Var7, ety0Var6, wp2Var13, inputState2, wp2Var14, bmsVar10, bmsVar9, 0), btsVar4), btsVar4, 0, ImageMetadata.EDGE_MODE, 0);
                                                } else {
                                                    btsVar4.Y();
                                                }
                                                return zy11.a;
                                            }
                                        }, btsVar2), btsVar2, 56);
                                        gy31 gy31Var4 = gy31Var3;
                                        z6 = z8;
                                        gy31Var2 = gy31Var4;
                                        osy0Var2 = osy0Var3;
                                        btsVar = btsVar2;
                                        wp2Var10 = wp2Var6;
                                        f530Var3 = f530Var4;
                                        z4 = z9;
                                        i30 = i35;
                                        tlsVar3 = tlsVar4;
                                        wp2Var8 = wp2Var12;
                                        ohyVar2 = ohyVar4;
                                        slotSize2 = slotSize6;
                                        z5 = z7;
                                        str8 = str12;
                                        wp2Var9 = wp2Var15;
                                        str10 = str13;
                                        str9 = str14;
                                        ety0Var4 = ety0Var7;
                                        wp2Var7 = wp2Var13;
                                        wp2Var11 = wp2Var14;
                                        bmsVar5 = bmsVar10;
                                        bmsVar6 = bmsVar9;
                                        zx40Var2 = zx40Var5;
                                        xjxVar2 = xjxVar3;
                                        i29 = i34;
                                        fhyVar2 = fhyVar3;
                                        bmsVar4 = bmsVar8;
                                        ety0Var5 = ety0Var6;
                                        lkxVar2 = lkxVar3;
                                        f2 = f3;
                                    }
                                    v = btsVar.v();
                                    if (v == null) {
                                        v.d = new wls() { // from class: jhy
                                            @Override // defpackage.wls
                                            public final Object invoke(Object obj, Object obj2) {
                                                ((Integer) obj2).getClass();
                                                int O = vng.O(i3 | 1);
                                                int O2 = vng.O(i4);
                                                int O3 = vng.O(i5);
                                                int O4 = vng.O(i6);
                                                heb1.b(str, tlsVar, f530Var3, z4, ety0Var4, wp2Var10, osy0Var2, wp2Var8, str9, wp2Var11, str10, wp2Var7, ety0Var5, str8, wp2Var9, z5, ohyVar2, f2, fhyVar2, gy31Var2, lkxVar2, xjxVar2, z6, i29, i30, zx40Var2, tlsVar3, slotSize2, bmsVar4, bmsVar5, bmsVar6, (fid) obj, O, O2, O3, O4, i7, i8);
                                                return zy11.a;
                                            }
                                        };
                                        return;
                                    }
                                    return;
                                }
                                i26 = i48 | 113246208;
                                i27 = i7 & 536870912;
                                if (i27 == 0) {
                                }
                                int i492 = i6 | 6;
                                i28 = i8 & 1;
                                if (i28 == 0) {
                                }
                                if (btsVar3.V(i10 & 1, ((i10 & 306783379) != 306783378 && (i22 & 306783379) == 306783378 && (i26 & 306783379) == 306783378 && (i16 & 19) == 18) ? false : true)) {
                                }
                                v = btsVar.v();
                                if (v == null) {
                                }
                            }
                            if ((i5 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                            }
                            int i482 = i47 | ImageMetadata.EDGE_MODE;
                            i25 = i7 & SelfTester_JCP.DECRYPT_CBC;
                            if (i25 != 0) {
                            }
                            i26 = i482 | 113246208;
                            i27 = i7 & 536870912;
                            if (i27 == 0) {
                            }
                            int i4922 = i6 | 6;
                            i28 = i8 & 1;
                            if (i28 == 0) {
                            }
                            if (btsVar3.V(i10 & 1, ((i10 & 306783379) != 306783378 && (i22 & 306783379) == 306783378 && (i26 & 306783379) == 306783378 && (i16 & 19) == 18) ? false : true)) {
                            }
                            v = btsVar.v();
                            if (v == null) {
                            }
                        }
                    } else {
                        i20 = i18;
                    }
                    i21 = 524288;
                    int i442 = i43 | i21;
                    if ((i7 & 131072) == 0) {
                        i38 = 8388608;
                    }
                    i22 = i442 | i38 | 100663296 | (((i7 & 524288) == 0 || !btsVar3.k(fhyVar)) ? 268435456 : 536870912);
                    int i452 = i5 | 6;
                    i23 = i7 & 2097152;
                    if (i23 == 0) {
                    }
                    int i462 = i452;
                    int i472 = i462 | 384;
                    i24 = i7 & SelfTester_JCP.ENCRYPT_CNT;
                    if (i24 == 0) {
                    }
                    if ((i5 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    }
                    int i4822 = i472 | ImageMetadata.EDGE_MODE;
                    i25 = i7 & SelfTester_JCP.DECRYPT_CBC;
                    if (i25 != 0) {
                    }
                    i26 = i4822 | 113246208;
                    i27 = i7 & 536870912;
                    if (i27 == 0) {
                    }
                    int i49222 = i6 | 6;
                    i28 = i8 & 1;
                    if (i28 == 0) {
                    }
                    if (btsVar3.V(i10 & 1, ((i10 & 306783379) != 306783378 && (i22 & 306783379) == 306783378 && (i26 & 306783379) == 306783378 && (i16 & 19) == 18) ? false : true)) {
                    }
                    v = btsVar.v();
                    if (v == null) {
                    }
                }
            }
            i14 = 65536;
            int i402 = i4 | 6;
            i15 = i7 & 2048;
            i16 = 54;
            if (i15 != 0) {
            }
            int i412 = i17 | 1408;
            i18 = i7 & 16384;
            int i422 = 16384;
            if (i18 != 0) {
            }
            int i432 = i19 | ImageMetadata.EDGE_MODE;
            if ((i7 & i14) == 0) {
            }
            i21 = 524288;
            int i4422 = i432 | i21;
            if ((i7 & 131072) == 0) {
            }
            i22 = i4422 | i38 | 100663296 | (((i7 & 524288) == 0 || !btsVar3.k(fhyVar)) ? 268435456 : 536870912);
            int i4522 = i5 | 6;
            i23 = i7 & 2097152;
            if (i23 == 0) {
            }
            int i4622 = i4522;
            int i4722 = i4622 | 384;
            i24 = i7 & SelfTester_JCP.ENCRYPT_CNT;
            if (i24 == 0) {
            }
            if ((i5 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            }
            int i48222 = i4722 | ImageMetadata.EDGE_MODE;
            i25 = i7 & SelfTester_JCP.DECRYPT_CBC;
            if (i25 != 0) {
            }
            i26 = i48222 | 113246208;
            i27 = i7 & 536870912;
            if (i27 == 0) {
            }
            int i492222 = i6 | 6;
            i28 = i8 & 1;
            if (i28 == 0) {
            }
            if (btsVar3.V(i10 & 1, ((i10 & 306783379) != 306783378 && (i22 & 306783379) == 306783378 && (i26 & 306783379) == 306783378 && (i16 & 19) == 18) ? false : true)) {
            }
            v = btsVar.v();
            if (v == null) {
            }
        }
        f530Var2 = f530Var;
        i10 = i9 | 27648;
        if ((i3 & ImageMetadata.EDGE_MODE) != 0) {
        }
        i11 = i7 & 64;
        if (i11 == 0) {
        }
        i12 = i3 & 12582912;
        int i382 = SelfTester_JCP.ENCRYPT_CBC;
        if (i12 == 0) {
        }
        if ((i3 & 100663296) == 0) {
        }
        i13 = i7 & 512;
        int i392 = SelfTester_JCP.IMITA;
        if (i13 == 0) {
        }
        i14 = 65536;
        int i4022 = i4 | 6;
        i15 = i7 & 2048;
        i16 = 54;
        if (i15 != 0) {
        }
        int i4122 = i17 | 1408;
        i18 = i7 & 16384;
        int i4222 = 16384;
        if (i18 != 0) {
        }
        int i4322 = i19 | ImageMetadata.EDGE_MODE;
        if ((i7 & i14) == 0) {
        }
        i21 = 524288;
        int i44222 = i4322 | i21;
        if ((i7 & 131072) == 0) {
        }
        i22 = i44222 | i382 | 100663296 | (((i7 & 524288) == 0 || !btsVar3.k(fhyVar)) ? 268435456 : 536870912);
        int i45222 = i5 | 6;
        i23 = i7 & 2097152;
        if (i23 == 0) {
        }
        int i46222 = i45222;
        int i47222 = i46222 | 384;
        i24 = i7 & SelfTester_JCP.ENCRYPT_CNT;
        if (i24 == 0) {
        }
        if ((i5 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
        }
        int i482222 = i47222 | ImageMetadata.EDGE_MODE;
        i25 = i7 & SelfTester_JCP.DECRYPT_CBC;
        if (i25 != 0) {
        }
        i26 = i482222 | 113246208;
        i27 = i7 & 536870912;
        if (i27 == 0) {
        }
        int i4922222 = i6 | 6;
        i28 = i8 & 1;
        if (i28 == 0) {
        }
        if (btsVar3.V(i10 & 1, ((i10 & 306783379) != 306783378 && (i22 & 306783379) == 306783378 && (i26 & 306783379) == 306783378 && (i16 & 19) == 18) ? false : true)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void c(a aVar, wls wlsVar, wls wlsVar2, ety0 ety0Var, long j, long j2, fid fidVar, int i) {
        wls wlsVar3;
        long j3;
        ety0 ety0Var2;
        wls wlsVar4;
        boolean z;
        int i2;
        boolean z2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-931325388);
        dmw0 dmw0Var = btsVar.a;
        int i3 = i | (btsVar.e(aVar) ? 4 : 2) | (btsVar.e(wlsVar) ? 32 : 16) | (btsVar.e(wlsVar2) ? 256 : 128) | (btsVar.k(ety0Var) ? 2048 : 1024) | (btsVar.d(j) ? 16384 : 8192) | (btsVar.d(j2) ? 131072 : 65536);
        if (btsVar.V(i3 & 1, (74899 & i3) != 74898)) {
            float f = wlsVar2 == null ? 8.0f : 0.0f;
            c530 c530Var = c530.a;
            f530 o = an91.o(c530Var, 16.0f, 0.0f, f, 0.0f, 10);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new x0t0();
                btsVar.o0(Q);
            }
            z910 z910Var = (z910) Q;
            int S = cma1.S(btsVar);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, o);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar5 = d.f;
            qje.W(btsVar, wlsVar5, z910Var);
            wls wlsVar6 = d.e;
            qje.W(btsVar, wlsVar6, o2);
            wls wlsVar7 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar, S, wlsVar7);
            }
            wls wlsVar8 = d.d;
            qje.W(btsVar, wlsVar8, d);
            f530 m = an91.m(pj91.h(c530Var, "text"), 0.0f, 6.0f, 1);
            uo5 uo5Var = x4c.b;
            z910 d2 = pi6.d(uo5Var, false);
            int S2 = cma1.S(btsVar);
            r1b0 o3 = btsVar.o();
            f530 d3 = b.d(btsVar, m);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar5, d2);
            qje.W(btsVar, wlsVar6, o3);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S2))) {
                b64.z(S2, btsVar, S2, wlsVar7);
            }
            qje.W(btsVar, wlsVar8, d3);
            nnm.p(i3 & 14, aVar, btsVar, true);
            if (wlsVar != null) {
                btsVar.e0(-1014168049);
                f530 h = pj91.h(c530Var, "action");
                z910 d4 = pi6.d(uo5Var, false);
                int S3 = cma1.S(btsVar);
                i2 = 8;
                r1b0 o4 = btsVar.o();
                f530 d5 = b.d(btsVar, h);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar5, d4);
                qje.W(btsVar, wlsVar6, o4);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S3))) {
                    b64.z(S3, btsVar, S3, wlsVar7);
                }
                qje.W(btsVar, wlsVar8, d5);
                ety0Var2 = ety0Var;
                wlsVar3 = wlsVar;
                sb2.c(new vvf0[]{bfe.a.a(new ldc(j)), vqy0.a.a(ety0Var2)}, wlsVar3, btsVar, 8 | (i3 & 112));
                btsVar.t(true);
                z = false;
            } else {
                wlsVar3 = wlsVar;
                ety0Var2 = ety0Var;
                z = false;
                i2 = 8;
                btsVar.e0(-1027731913);
            }
            btsVar.t(z);
            if (wlsVar2 != null) {
                btsVar.e0(-1013804481);
                f530 h2 = pj91.h(c530Var, "dismissAction");
                z910 d6 = pi6.d(uo5Var, z);
                int S4 = cma1.S(btsVar);
                r1b0 o5 = btsVar.o();
                f530 d7 = b.d(btsVar, h2);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar5, d6);
                qje.W(btsVar, wlsVar6, o5);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S4))) {
                    b64.z(S4, btsVar, S4, wlsVar7);
                }
                qje.W(btsVar, wlsVar8, d7);
                j3 = j2;
                wlsVar4 = wlsVar2;
                sb2.b(bfe.a.a(new ldc(j3)), wlsVar4, btsVar, i2 | ((i3 >> 3) & 112));
                z2 = true;
                btsVar.t(true);
                z = false;
            } else {
                wlsVar4 = wlsVar2;
                j3 = j2;
                z2 = true;
                btsVar.e0(-1027731913);
            }
            btsVar.t(z);
            btsVar.t(z2);
        } else {
            wlsVar3 = wlsVar;
            j3 = j2;
            ety0Var2 = ety0Var;
            wlsVar4 = wlsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t0t0(aVar, wlsVar3, wlsVar4, ety0Var2, j, j3, i);
        }
    }

    public static final void d(final f530 f530Var, final wls wlsVar, final wls wlsVar2, final ehr0 ehr0Var, final long j, final long j2, final long j3, final long j4, final a aVar, fid fidVar, final int i) {
        int i2;
        wls wlsVar3;
        wls wlsVar4;
        ehr0 ehr0Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1218779924);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            wlsVar3 = wlsVar;
            i2 |= btsVar.e(wlsVar3) ? 32 : 16;
        } else {
            wlsVar3 = wlsVar;
        }
        if ((i & 384) == 0) {
            wlsVar4 = wlsVar2;
            i2 |= btsVar.e(wlsVar4) ? 256 : 128;
        } else {
            wlsVar4 = wlsVar2;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.a(false) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            ehr0Var2 = ehr0Var;
            i2 |= btsVar.k(ehr0Var2) ? 16384 : 8192;
        } else {
            ehr0Var2 = ehr0Var;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.d(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar.d(j2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= btsVar.d(j3) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((100663296 & i) == 0) {
            i2 |= btsVar.d(j4) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if ((805306368 & i) == 0) {
            i2 |= btsVar.e(aVar) ? 536870912 : SelfTester_JCP.IMITA;
        }
        int i3 = i2;
        if (btsVar.V(i3 & 1, (306783379 & i2) != 306783378)) {
            btsVar.a0();
            if ((i & 1) != 0 && !btsVar.C()) {
                btsVar.Y();
            }
            btsVar.u();
            float f = f1t0.d;
            a S = wwg.S(-1343524879, true, new hme(wlsVar3, aVar, wlsVar4, j3, j4), btsVar);
            int i4 = i3 >> 9;
            mnw0.a(f530Var, ehr0Var2, j, j2, 0.0f, f, S, btsVar, (i3 & 14) | 12779520 | (i4 & 112) | (i4 & 896) | (i4 & 7168), 80);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: v0t0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(i | 1);
                    heb1.d(f530.this, wlsVar, wlsVar2, ehr0Var, j, j2, j3, j4, aVar, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    public static final void e(final o0t0 o0t0Var, f530 f530Var, ehr0 ehr0Var, long j, long j2, long j3, long j4, long j5, fid fidVar, final int i) {
        int i2;
        bts btsVar;
        final f530 f530Var2;
        final ehr0 ehr0Var2;
        final long j6;
        final long j7;
        final long j8;
        final long j9;
        final long j10;
        long d;
        f530 f530Var3;
        long j11;
        long j12;
        long j13;
        long j14;
        ehr0 ehr0Var3;
        int i3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(274621471);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(o0t0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 432;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i4 = i2 | 1456;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i4 |= 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((100663296 & i) == 0) {
            i4 |= SelfTester_JCP.DECRYPT_CFB;
        }
        if (btsVar2.V(i4 & 1, (38347923 & i4) != 38347922)) {
            btsVar2.a0();
            if ((i & 1) == 0 || btsVar2.C()) {
                ehr0 b = zir0.b(f1t0.e, btsVar2);
                long d2 = dgc.d(f1t0.c, btsVar2);
                long d3 = dgc.d(f1t0.g, btsVar2);
                ColorSchemeKeyTokens colorSchemeKeyTokens = f1t0.a;
                d = dgc.d(colorSchemeKeyTokens, btsVar2);
                long d4 = dgc.d(colorSchemeKeyTokens, btsVar2);
                long d5 = dgc.d(f1t0.f, btsVar2);
                f530Var3 = c530.a;
                j11 = d2;
                j12 = d3;
                j13 = d4;
                j14 = d5;
                ehr0Var3 = b;
                i3 = i4 & (-268434433);
            } else {
                btsVar2.Y();
                i3 = i4 & (-268434433);
                f530Var3 = f530Var;
                ehr0Var3 = ehr0Var;
                j11 = j;
                j12 = j2;
                d = j3;
                j13 = j4;
                j14 = j5;
            }
            btsVar2.u();
            ((r0t0) o0t0Var).a.getClass();
            btsVar2.e0(-663827885);
            a S = wwg.S(-1378313599, true, new eye(d, o0t0Var, 3), btsVar2);
            btsVar2.t(false);
            ((r0t0) o0t0Var).a.getClass();
            btsVar2.e0(-662598425);
            btsVar2.t(false);
            btsVar = btsVar2;
            d(an91.k(f530Var3, 12.0f), S, null, ehr0Var3, j11, j12, j13, j14, wwg.S(-1266389126, true, new e3o0(27, o0t0Var), btsVar2), btsVar, ((i3 << 3) & 7168) | 805306368);
            f530Var2 = f530Var3;
            j8 = d;
            ehr0Var2 = ehr0Var3;
            j6 = j11;
            j7 = j12;
            j9 = j13;
            j10 = j14;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
            ehr0Var2 = ehr0Var;
            j6 = j;
            j7 = j2;
            j8 = j3;
            j9 = j4;
            j10 = j5;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: u0t0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(i | 1);
                    heb1.e(o0t0.this, f530Var2, ehr0Var2, j6, j7, j8, j9, j10, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    public static void f(tt5 tt5Var, final w4u w4uVar) {
        i3y i3yVar = eu7.b;
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.PigeonInternalInstanceManager.removeStrongReference", (rs10) i3yVar.getValue(), null);
        if (w4uVar != null) {
            final int i = 0;
            m2vVar.G(new ee5() { // from class: du7
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    int i2 = i;
                    w4u w4uVar2 = w4uVar;
                    switch (i2) {
                        case 0:
                            try {
                                ((HashMap) w4uVar2.i).remove((Long) ((List) obj).get(0));
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g2 = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g2 = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        default:
                            try {
                                ((WeakHashMap) w4uVar2.h).clear();
                                ((HashMap) w4uVar2.b).clear();
                                ((HashMap) w4uVar2.i).clear();
                                ((HashMap) w4uVar2.k).clear();
                                g = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                    }
                }
            });
        } else {
            m2vVar.G(null);
        }
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.PigeonInternalInstanceManager.clear", (rs10) i3yVar.getValue(), null);
        if (w4uVar == null) {
            m2vVar2.G(null);
        } else {
            final int i2 = 1;
            m2vVar2.G(new ee5() { // from class: du7
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    int i22 = i2;
                    w4u w4uVar2 = w4uVar;
                    switch (i22) {
                        case 0:
                            try {
                                ((HashMap) w4uVar2.i).remove((Long) ((List) obj).get(0));
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g2 = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g2 = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        default:
                            try {
                                ((WeakHashMap) w4uVar2.h).clear();
                                ((HashMap) w4uVar2.b).clear();
                                ((HashMap) w4uVar2.i).clear();
                                ((HashMap) w4uVar2.k).clear();
                                g = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                    }
                }
            });
        }
    }
}
