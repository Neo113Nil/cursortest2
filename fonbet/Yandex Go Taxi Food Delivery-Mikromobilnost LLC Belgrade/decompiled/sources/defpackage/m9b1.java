package defpackage;

import android.view.animation.Interpolator;
import androidx.compose.ui.b;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidViewsHandler;
import androidx.compose.ui.semantics.a;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.design.compose.slot.body.BodyAlign;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class m9b1 {
    /* JADX WARN: Removed duplicated region for block: B:101:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0126 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(ebp0 ebp0Var, CharSequence charSequence, f530 f530Var, wp2 wp2Var, ety0 ety0Var, int i, int i2, String str, wp2 wp2Var2, ety0 ety0Var2, int i3, int i4, BodyAlign bodyAlign, fid fidVar, int i5, int i6, int i7) {
        int i8;
        f530 f530Var2;
        int i9;
        ety0 ety0Var3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String str2;
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
        bts btsVar;
        wp2 wp2Var3;
        wp2 wp2Var4;
        int i26;
        BodyAlign bodyAlign2;
        ety0 ety0Var4;
        int i27;
        int i28;
        f530 f530Var3;
        ety0 ety0Var5;
        int i29;
        aii0 v;
        ety0 ety0Var6;
        int i30;
        f530 f530Var4;
        int i31;
        String str3;
        wp2 wp2Var5;
        wp2 wp2Var6;
        ety0 ety0Var7;
        int i32;
        int i33;
        int i34;
        BodyAlign bodyAlign3;
        BodyAlign bodyAlign4;
        wp2 wp2Var7;
        ety0 ety0Var8;
        int i35;
        int i36;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1302059100);
        if ((i5 & 6) == 0) {
            i8 = (btsVar2.k(ebp0Var) ? 4 : 2) | i5;
        } else {
            i8 = i5;
        }
        if ((i5 & 48) == 0) {
            i8 |= (i5 & 64) == 0 ? btsVar2.k(charSequence) : btsVar2.e(charSequence) ? 32 : 16;
        }
        int i37 = i7 & 2;
        if (i37 != 0) {
            i8 |= 384;
        } else if ((i5 & 384) == 0) {
            f530Var2 = f530Var;
            i8 |= btsVar2.k(f530Var2) ? 256 : 128;
            i9 = i7 & 4;
            if (i9 == 0) {
                i8 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i5 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                i8 |= btsVar2.k(wp2Var) ? 2048 : 1024;
                if ((i5 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    if ((i7 & 8) == 0) {
                        ety0Var3 = ety0Var;
                        if (btsVar2.k(ety0Var3)) {
                            i36 = 16384;
                            i8 |= i36;
                        }
                    } else {
                        ety0Var3 = ety0Var;
                    }
                    i36 = 8192;
                    i8 |= i36;
                } else {
                    ety0Var3 = ety0Var;
                }
                i10 = i7 & 16;
                if (i10 != 0) {
                    i8 |= ImageMetadata.EDGE_MODE;
                    i11 = i;
                } else {
                    i11 = i;
                    if ((i5 & ImageMetadata.EDGE_MODE) == 0) {
                        i8 |= btsVar2.c(i11) ? 131072 : 65536;
                    }
                }
                i12 = i7 & 32;
                if (i12 != 0) {
                    i8 |= 1572864;
                    i13 = i2;
                } else {
                    i13 = i2;
                    if ((i5 & 1572864) == 0) {
                        i8 |= btsVar2.c(i13) ? 1048576 : 524288;
                    }
                }
                i14 = i8 | 12582912;
                i15 = i7 & 128;
                if (i15 != 0) {
                    i14 = i8 | 113246208;
                } else if ((100663296 & i5) == 0) {
                    str2 = str;
                    i14 |= btsVar2.k(str2) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
                    i16 = i7 & 256;
                    if (i16 == 0) {
                        i14 |= 805306368;
                    } else if ((i5 & 805306368) == 0) {
                        i14 |= btsVar2.k(wp2Var2) ? 536870912 : SelfTester_JCP.IMITA;
                    }
                    if ((i7 & 512) == 0 && btsVar2.k(ety0Var2)) {
                        i17 = 4;
                        int i38 = i6 | i17;
                        i18 = i7 & 1024;
                        if (i18 == 0) {
                            i20 = i38 | 48;
                            i19 = i18;
                        } else {
                            i19 = i18;
                            i20 = i38 | (btsVar2.c(i3) ? 32 : 16);
                        }
                        int i39 = i20;
                        i21 = i7 & 2048;
                        if (i21 == 0) {
                            i22 = i39 | 384;
                        } else {
                            i22 = i39 | (btsVar2.c(i4) ? 256 : 128);
                        }
                        i23 = i7 & 4096;
                        if (i23 == 0) {
                            i24 = i22 | HProv.ALG_TYPE_SECURECHANNEL;
                        } else {
                            int i40 = i22;
                            if ((i6 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                                i24 = i40 | (btsVar2.c(bodyAlign == null ? -1 : bodyAlign.ordinal()) ? 2048 : 1024);
                            } else {
                                i24 = i40;
                            }
                        }
                        if ((i7 & 8192) == 0) {
                            i25 = i24 | HProv.ALG_CLASS_DATA_ENCRYPT;
                        } else {
                            i25 = i24 | (btsVar2.k(null) ? 16384 : 8192);
                        }
                        if (btsVar2.V(i14 & 1, (i14 & 306783379) == 306783378 || (i25 & 9363) != 9362)) {
                            btsVar = btsVar2;
                            btsVar.Y();
                            wp2Var3 = wp2Var;
                            wp2Var4 = wp2Var2;
                            i26 = i4;
                            bodyAlign2 = bodyAlign;
                            ety0Var4 = ety0Var3;
                            i27 = i11;
                            i28 = i13;
                            f530Var3 = f530Var2;
                            ety0Var5 = ety0Var2;
                            i29 = i3;
                        } else {
                            btsVar2.a0();
                            if ((i5 & 1) == 0 || btsVar2.C()) {
                                f530 f530Var5 = i37 != 0 ? c530.a : f530Var2;
                                wp2 wp2Var8 = i9 != 0 ? tp2.a : wp2Var;
                                if ((i7 & 8) != 0) {
                                    ety0Var3 = xya1.e(btsVar2).g.a;
                                    i14 &= -57345;
                                }
                                if (i10 != 0) {
                                    i11 = 2;
                                }
                                if (i12 != 0) {
                                    i13 = Integer.MAX_VALUE;
                                }
                                if (i15 != 0) {
                                    str2 = "";
                                }
                                wp2 wp2Var9 = i16 != 0 ? AppColor$Palette.TextMinor : wp2Var2;
                                if ((i7 & 512) != 0) {
                                    ety0Var6 = xya1.e(btsVar2).h.a;
                                    i25 &= -15;
                                } else {
                                    ety0Var6 = ety0Var2;
                                }
                                int i41 = i19 != 0 ? 2 : i3;
                                int i42 = i21 == 0 ? i4 : Integer.MAX_VALUE;
                                BodyAlign bodyAlign5 = i23 != 0 ? null : bodyAlign;
                                i30 = i25;
                                f530Var4 = f530Var5;
                                i31 = i42;
                                str3 = str2;
                                wp2Var5 = wp2Var8;
                                wp2Var6 = wp2Var9;
                                ety0Var7 = ety0Var6;
                                i32 = i41;
                                i33 = i14;
                                i34 = i13;
                                bodyAlign3 = bodyAlign5;
                            } else {
                                btsVar2.Y();
                                if ((i7 & 8) != 0) {
                                    i14 &= -57345;
                                }
                                if ((i7 & 512) != 0) {
                                    i25 &= -15;
                                }
                                wp2Var5 = wp2Var;
                                wp2Var6 = wp2Var2;
                                ety0Var7 = ety0Var2;
                                i32 = i3;
                                i31 = i4;
                                i30 = i25;
                                str3 = str2;
                                i34 = i13;
                                f530Var4 = f530Var2;
                                i33 = i14;
                                bodyAlign3 = bodyAlign;
                            }
                            ety0 ety0Var9 = ety0Var3;
                            int i43 = i11;
                            btsVar2.u();
                            if (bodyAlign3 == null) {
                                btsVar2.e0(-1443290549);
                                BodyAlign bodyAlign6 = (BodyAlign) btsVar2.m(u76.a);
                                btsVar2.t(false);
                                bodyAlign4 = bodyAlign6;
                            } else {
                                btsVar2.e0(-1443291417);
                                btsVar2.t(false);
                                bodyAlign4 = bodyAlign3;
                            }
                            jt1 alignment = bodyAlign4.getAlignment();
                            ebp0Var.getClass();
                            f530 m = an91.m(cj6.a.a(f530Var4, alignment), 0.0f, ebp0Var.c() == SlotSize.XS ? 0.0f : 2.0f, 1);
                            sic a = qic.a(lr20.c, bodyAlign4.getHorizontal(), btsVar2, 0);
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
                            int i44 = i33;
                            f530 f530Var6 = f530Var4;
                            qgy.b(charSequence, null, null, wp2Var5, 0L, 0L, new sjy0(bodyAlign4.getTextAlign()), 0L, i43, i34, 0, ety0Var9, null, btsVar2, ((i33 >> 3) & 14) | (i33 & 7168) | ((i33 << 12) & 1879048192), ((i33 >> 18) & 14) | ((i33 >> 6) & 896) | ((i33 >> 12) & 7168), 2422);
                            wp2 wp2Var10 = wp2Var5;
                            int i45 = i34;
                            btsVar = btsVar2;
                            if (str3.length() > 0) {
                                btsVar.e0(-1097830366);
                                String str4 = str3;
                                wp2Var7 = wp2Var6;
                                ety0Var8 = ety0Var7;
                                i29 = i32;
                                i35 = i31;
                                jeb1.f(str4, null, wp2Var7, 0L, 0L, null, new sjy0(bodyAlign4.getTextAlign()), 0L, i29, false, i35, 0, null, ety0Var8, btsVar, ((i44 >> 24) & 14) | ((i44 >> 21) & 896) | ((i30 << 24) & 1879048192), ((i30 >> 3) & 112) | (57344 & (i30 << 12)), 13690);
                                str2 = str4;
                                btsVar = btsVar;
                                btsVar.t(false);
                            } else {
                                str2 = str3;
                                wp2Var7 = wp2Var6;
                                ety0Var8 = ety0Var7;
                                i29 = i32;
                                i35 = i31;
                                btsVar.e0(-1097622604);
                                btsVar.t(false);
                            }
                            btsVar.t(true);
                            wp2Var4 = wp2Var7;
                            i26 = i35;
                            ety0Var5 = ety0Var8;
                            bodyAlign2 = bodyAlign3;
                            f530Var3 = f530Var6;
                            wp2Var3 = wp2Var10;
                            i27 = i43;
                            i28 = i45;
                            ety0Var4 = ety0Var9;
                        }
                        v = btsVar.v();
                        if (v == null) {
                            v.d = new z76(ebp0Var, charSequence, f530Var3, wp2Var3, ety0Var4, i27, i28, str2, wp2Var4, ety0Var5, i29, i26, bodyAlign2, i5, i6, i7, 1);
                            return;
                        }
                        return;
                    }
                    i17 = 2;
                    int i382 = i6 | i17;
                    i18 = i7 & 1024;
                    if (i18 == 0) {
                    }
                    int i392 = i20;
                    i21 = i7 & 2048;
                    if (i21 == 0) {
                    }
                    i23 = i7 & 4096;
                    if (i23 == 0) {
                    }
                    if ((i7 & 8192) == 0) {
                    }
                    if (btsVar2.V(i14 & 1, (i14 & 306783379) == 306783378 || (i25 & 9363) != 9362)) {
                    }
                    v = btsVar.v();
                    if (v == null) {
                    }
                }
                str2 = str;
                i16 = i7 & 256;
                if (i16 == 0) {
                }
                if ((i7 & 512) == 0) {
                    i17 = 4;
                    int i3822 = i6 | i17;
                    i18 = i7 & 1024;
                    if (i18 == 0) {
                    }
                    int i3922 = i20;
                    i21 = i7 & 2048;
                    if (i21 == 0) {
                    }
                    i23 = i7 & 4096;
                    if (i23 == 0) {
                    }
                    if ((i7 & 8192) == 0) {
                    }
                    if (btsVar2.V(i14 & 1, (i14 & 306783379) == 306783378 || (i25 & 9363) != 9362)) {
                    }
                    v = btsVar.v();
                    if (v == null) {
                    }
                }
                i17 = 2;
                int i38222 = i6 | i17;
                i18 = i7 & 1024;
                if (i18 == 0) {
                }
                int i39222 = i20;
                i21 = i7 & 2048;
                if (i21 == 0) {
                }
                i23 = i7 & 4096;
                if (i23 == 0) {
                }
                if ((i7 & 8192) == 0) {
                }
                if (btsVar2.V(i14 & 1, (i14 & 306783379) == 306783378 || (i25 & 9363) != 9362)) {
                }
                v = btsVar.v();
                if (v == null) {
                }
            }
            if ((i5 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            }
            i10 = i7 & 16;
            if (i10 != 0) {
            }
            i12 = i7 & 32;
            if (i12 != 0) {
            }
            i14 = i8 | 12582912;
            i15 = i7 & 128;
            if (i15 != 0) {
            }
            str2 = str;
            i16 = i7 & 256;
            if (i16 == 0) {
            }
            if ((i7 & 512) == 0) {
            }
            i17 = 2;
            int i382222 = i6 | i17;
            i18 = i7 & 1024;
            if (i18 == 0) {
            }
            int i392222 = i20;
            i21 = i7 & 2048;
            if (i21 == 0) {
            }
            i23 = i7 & 4096;
            if (i23 == 0) {
            }
            if ((i7 & 8192) == 0) {
            }
            if (btsVar2.V(i14 & 1, (i14 & 306783379) == 306783378 || (i25 & 9363) != 9362)) {
            }
            v = btsVar.v();
            if (v == null) {
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
        i14 = i8 | 12582912;
        i15 = i7 & 128;
        if (i15 != 0) {
        }
        str2 = str;
        i16 = i7 & 256;
        if (i16 == 0) {
        }
        if ((i7 & 512) == 0) {
        }
        i17 = 2;
        int i3822222 = i6 | i17;
        i18 = i7 & 1024;
        if (i18 == 0) {
        }
        int i3922222 = i20;
        i21 = i7 & 2048;
        if (i21 == 0) {
        }
        i23 = i7 & 4096;
        if (i23 == 0) {
        }
        if ((i7 & 8192) == 0) {
        }
        if (btsVar2.V(i14 & 1, (i14 & 306783379) == 306783378 || (i25 & 9363) != 9362)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0124 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(ebp0 ebp0Var, CharSequence charSequence, f530 f530Var, wp2 wp2Var, ety0 ety0Var, int i, int i2, CharSequence charSequence2, wp2 wp2Var2, ety0 ety0Var2, int i3, int i4, BodyAlign bodyAlign, fid fidVar, int i5, int i6, int i7) {
        int i8;
        f530 f530Var2;
        int i9;
        wp2 wp2Var3;
        ety0 ety0Var3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        wp2 wp2Var4;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        bts btsVar;
        ety0 ety0Var4;
        BodyAlign bodyAlign2;
        wp2 wp2Var5;
        ety0 ety0Var5;
        int i24;
        int i25;
        wp2 wp2Var6;
        f530 f530Var3;
        int i26;
        int i27;
        aii0 v;
        ety0 ety0Var6;
        ety0 ety0Var7;
        int i28;
        wp2 wp2Var7;
        int i29;
        wp2 wp2Var8;
        int i30;
        ety0 ety0Var8;
        int i31;
        BodyAlign bodyAlign3;
        f530 f530Var4;
        int i32;
        ety0 ety0Var9;
        BodyAlign bodyAlign4;
        wp2 wp2Var9;
        ety0 ety0Var10;
        int i33;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(43408337);
        if ((i5 & 6) == 0) {
            i8 = (btsVar2.k(ebp0Var) ? 4 : 2) | i5;
        } else {
            i8 = i5;
        }
        if ((i5 & 48) == 0) {
            i8 |= (i5 & 64) == 0 ? btsVar2.k(charSequence) : btsVar2.e(charSequence) ? 32 : 16;
        }
        int i34 = i7 & 2;
        if (i34 != 0) {
            i8 |= 384;
        } else if ((i5 & 384) == 0) {
            f530Var2 = f530Var;
            i8 |= btsVar2.k(f530Var2) ? 256 : 128;
            i9 = i7 & 4;
            if (i9 == 0) {
                i8 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i5 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                wp2Var3 = wp2Var;
                i8 |= btsVar2.k(wp2Var3) ? 2048 : 1024;
                if ((i5 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    if ((i7 & 8) == 0) {
                        ety0Var3 = ety0Var;
                        if (btsVar2.k(ety0Var3)) {
                            i33 = 16384;
                            i8 |= i33;
                        }
                    } else {
                        ety0Var3 = ety0Var;
                    }
                    i33 = 8192;
                    i8 |= i33;
                } else {
                    ety0Var3 = ety0Var;
                }
                i10 = i7 & 16;
                if (i10 != 0) {
                    i8 |= ImageMetadata.EDGE_MODE;
                    i11 = i;
                } else {
                    i11 = i;
                    if ((i5 & ImageMetadata.EDGE_MODE) == 0) {
                        i8 |= btsVar2.c(i11) ? 131072 : 65536;
                    }
                }
                i12 = i7 & 32;
                if (i12 != 0) {
                    i8 |= 1572864;
                    i13 = i2;
                } else {
                    i13 = i2;
                    if ((i5 & 1572864) == 0) {
                        i8 |= btsVar2.c(i13) ? 1048576 : 524288;
                    }
                }
                i14 = i8 | 12582912;
                if ((i5 & 100663296) == 0) {
                    i14 |= (i5 & SelfTester_JCP.DECRYPT_CNT) == 0 ? btsVar2.k(charSequence2) : btsVar2.e(charSequence2) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
                }
                i15 = i7 & 256;
                if (i15 != 0) {
                    i14 |= 805306368;
                    wp2Var4 = wp2Var2;
                } else {
                    wp2Var4 = wp2Var2;
                    if ((i5 & 805306368) == 0) {
                        i14 |= btsVar2.k(wp2Var4) ? 536870912 : SelfTester_JCP.IMITA;
                    }
                }
                if ((i7 & 512) != 0 && btsVar2.k(ety0Var2)) {
                    i16 = 4;
                    int i35 = i6 | i16;
                    i17 = i7 & 1024;
                    if (i17 != 0) {
                        i35 |= 48;
                        i18 = i17;
                    } else if ((i6 & 48) == 0) {
                        i18 = i17;
                        i35 |= btsVar2.c(i3) ? 32 : 16;
                    } else {
                        i18 = i17;
                    }
                    int i36 = i35;
                    i19 = i7 & 2048;
                    if (i19 != 0) {
                        i20 = i36 | 384;
                    } else {
                        int i37 = i36;
                        if ((i6 & 384) == 0) {
                            i37 |= btsVar2.c(i4) ? 256 : 128;
                        }
                        i20 = i37;
                    }
                    int i38 = i20 | HProv.ALG_TYPE_SECURECHANNEL;
                    i21 = i7 & 8192;
                    if (i21 != 0) {
                        i22 = i20 | 27648;
                    } else if ((i6 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                        i22 = i38 | (btsVar2.c(bodyAlign == null ? -1 : bodyAlign.ordinal()) ? 16384 : 8192);
                    } else {
                        i22 = i38;
                    }
                    i23 = i22 | ImageMetadata.EDGE_MODE;
                    if (btsVar2.V(i14 & 1, (i14 & 306783379) == 306783378 || (i23 & 74899) != 74898)) {
                        btsVar2.a0();
                        if ((i5 & 1) == 0 || btsVar2.C()) {
                            if (i34 != 0) {
                                f530Var2 = c530.a;
                            }
                            wp2 wp2Var10 = i9 != 0 ? tp2.a : wp2Var3;
                            if ((i7 & 8) != 0) {
                                ety0Var6 = xya1.e(btsVar2).g.a;
                                i14 &= -57345;
                            } else {
                                ety0Var6 = ety0Var3;
                            }
                            if (i10 != 0) {
                                i11 = 2;
                            }
                            if (i12 != 0) {
                                i13 = Integer.MAX_VALUE;
                            }
                            wp2 wp2Var11 = i15 != 0 ? AppColor$Palette.TextMinor : wp2Var4;
                            if ((i7 & 512) != 0) {
                                ety0Var7 = xya1.e(btsVar2).h.a;
                                i28 = i23 & (-15);
                            } else {
                                ety0Var7 = ety0Var2;
                                i28 = i23;
                            }
                            int i39 = i18 != 0 ? 2 : i3;
                            int i40 = i19 == 0 ? i4 : Integer.MAX_VALUE;
                            BodyAlign bodyAlign5 = i21 != 0 ? null : bodyAlign;
                            wp2Var7 = wp2Var10;
                            i29 = i40;
                            wp2Var8 = wp2Var11;
                            i30 = i14;
                            ety0Var8 = ety0Var7;
                            i31 = i28;
                            bodyAlign3 = bodyAlign5;
                            f530Var4 = f530Var2;
                            i32 = i39;
                            ety0Var9 = ety0Var6;
                        } else {
                            btsVar2.Y();
                            if ((i7 & 8) != 0) {
                                i14 &= -57345;
                            }
                            if ((i7 & 512) != 0) {
                                ety0Var8 = ety0Var2;
                                i32 = i3;
                                i29 = i4;
                                bodyAlign3 = bodyAlign;
                                i31 = i23 & (-15);
                            } else {
                                ety0Var8 = ety0Var2;
                                i32 = i3;
                                i29 = i4;
                                bodyAlign3 = bodyAlign;
                                i31 = i23;
                            }
                            wp2Var7 = wp2Var3;
                            i30 = i14;
                            wp2Var8 = wp2Var4;
                            f530Var4 = f530Var2;
                            ety0Var9 = ety0Var3;
                        }
                        btsVar2.u();
                        if (bodyAlign3 == null) {
                            btsVar2.e0(-1234237896);
                            BodyAlign bodyAlign6 = (BodyAlign) btsVar2.m(u76.a);
                            btsVar2.t(false);
                            bodyAlign4 = bodyAlign6;
                        } else {
                            btsVar2.e0(-1234238764);
                            btsVar2.t(false);
                            bodyAlign4 = bodyAlign3;
                        }
                        jt1 alignment = bodyAlign4.getAlignment();
                        ebp0Var.getClass();
                        f530 m = an91.m(cj6.a.a(f530Var4, alignment), 0.0f, ebp0Var.c() == SlotSize.XS ? 0.0f : 2.0f, 1);
                        sic a = qic.a(lr20.c, bodyAlign4.getHorizontal(), btsVar2, 0);
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
                        int i41 = i30 >> 18;
                        int i42 = i30;
                        f530 f530Var5 = f530Var4;
                        qgy.b(charSequence, null, null, wp2Var7, 0L, 0L, new sjy0(bodyAlign4.getTextAlign()), 0L, i11, i13, 0, ety0Var9, null, btsVar2, ((i30 >> 3) & 14) | (i30 & 7168) | ((i30 << 12) & 1879048192), (i41 & 14) | ((i30 >> 6) & 896) | ((i30 >> 12) & 7168), 2422);
                        wp2 wp2Var12 = wp2Var7;
                        int i43 = i11;
                        int i44 = i13;
                        ety0 ety0Var11 = ety0Var9;
                        btsVar = btsVar2;
                        if (charSequence2.length() > 0) {
                            btsVar.e0(-1512601078);
                            wp2Var9 = wp2Var8;
                            ety0Var10 = ety0Var8;
                            i26 = i32;
                            i27 = i29;
                            qgy.b(charSequence2, null, null, wp2Var9, 0L, 0L, new sjy0(bodyAlign4.getTextAlign()), 0L, i26, i27, 0, ety0Var10, null, btsVar, ((i42 >> 24) & 14) | (i41 & 7168) | ((i31 << 24) & 1879048192), ((i31 >> 6) & 14) | ((i31 << 6) & 896) | HProv.ALG_TYPE_SECURECHANNEL, 2422);
                            btsVar = btsVar;
                            btsVar.t(false);
                        } else {
                            wp2Var9 = wp2Var8;
                            ety0Var10 = ety0Var8;
                            i26 = i32;
                            i27 = i29;
                            btsVar.e0(-1512351993);
                            btsVar.t(false);
                        }
                        btsVar.t(true);
                        wp2Var6 = wp2Var9;
                        ety0Var4 = ety0Var10;
                        bodyAlign2 = bodyAlign3;
                        f530Var3 = f530Var5;
                        wp2Var5 = wp2Var12;
                        i24 = i43;
                        i25 = i44;
                        ety0Var5 = ety0Var11;
                    } else {
                        btsVar = btsVar2;
                        btsVar.Y();
                        ety0Var4 = ety0Var2;
                        bodyAlign2 = bodyAlign;
                        wp2Var5 = wp2Var3;
                        ety0Var5 = ety0Var3;
                        i24 = i11;
                        i25 = i13;
                        wp2Var6 = wp2Var4;
                        f530Var3 = f530Var2;
                        i26 = i3;
                        i27 = i4;
                    }
                    v = btsVar.v();
                    if (v != null) {
                        v.d = new z76(ebp0Var, charSequence, f530Var3, wp2Var5, ety0Var5, i24, i25, charSequence2, wp2Var6, ety0Var4, i26, i27, bodyAlign2, i5, i6, i7, 0);
                        return;
                    }
                    return;
                }
                i16 = 2;
                int i352 = i6 | i16;
                i17 = i7 & 1024;
                if (i17 != 0) {
                }
                int i362 = i352;
                i19 = i7 & 2048;
                if (i19 != 0) {
                }
                int i382 = i20 | HProv.ALG_TYPE_SECURECHANNEL;
                i21 = i7 & 8192;
                if (i21 != 0) {
                }
                i23 = i22 | ImageMetadata.EDGE_MODE;
                if (btsVar2.V(i14 & 1, (i14 & 306783379) == 306783378 || (i23 & 74899) != 74898)) {
                }
                v = btsVar.v();
                if (v != null) {
                }
            }
            wp2Var3 = wp2Var;
            if ((i5 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            }
            i10 = i7 & 16;
            if (i10 != 0) {
            }
            i12 = i7 & 32;
            if (i12 != 0) {
            }
            i14 = i8 | 12582912;
            if ((i5 & 100663296) == 0) {
            }
            i15 = i7 & 256;
            if (i15 != 0) {
            }
            if ((i7 & 512) != 0) {
                i16 = 4;
                int i3522 = i6 | i16;
                i17 = i7 & 1024;
                if (i17 != 0) {
                }
                int i3622 = i3522;
                i19 = i7 & 2048;
                if (i19 != 0) {
                }
                int i3822 = i20 | HProv.ALG_TYPE_SECURECHANNEL;
                i21 = i7 & 8192;
                if (i21 != 0) {
                }
                i23 = i22 | ImageMetadata.EDGE_MODE;
                if (btsVar2.V(i14 & 1, (i14 & 306783379) == 306783378 || (i23 & 74899) != 74898)) {
                }
                v = btsVar.v();
                if (v != null) {
                }
            }
            i16 = 2;
            int i35222 = i6 | i16;
            i17 = i7 & 1024;
            if (i17 != 0) {
            }
            int i36222 = i35222;
            i19 = i7 & 2048;
            if (i19 != 0) {
            }
            int i38222 = i20 | HProv.ALG_TYPE_SECURECHANNEL;
            i21 = i7 & 8192;
            if (i21 != 0) {
            }
            i23 = i22 | ImageMetadata.EDGE_MODE;
            if (btsVar2.V(i14 & 1, (i14 & 306783379) == 306783378 || (i23 & 74899) != 74898)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        i9 = i7 & 4;
        if (i9 == 0) {
        }
        wp2Var3 = wp2Var;
        if ((i5 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
        }
        i10 = i7 & 16;
        if (i10 != 0) {
        }
        i12 = i7 & 32;
        if (i12 != 0) {
        }
        i14 = i8 | 12582912;
        if ((i5 & 100663296) == 0) {
        }
        i15 = i7 & 256;
        if (i15 != 0) {
        }
        if ((i7 & 512) != 0) {
        }
        i16 = 2;
        int i352222 = i6 | i16;
        i17 = i7 & 1024;
        if (i17 != 0) {
        }
        int i362222 = i352222;
        i19 = i7 & 2048;
        if (i19 != 0) {
        }
        int i382222 = i20 | HProv.ALG_TYPE_SECURECHANNEL;
        i21 = i7 & 8192;
        if (i21 != 0) {
        }
        i23 = i22 | ImageMetadata.EDGE_MODE;
        if (btsVar2.V(i14 & 1, (i14 & 306783379) == 306783378 || (i23 & 74899) != 74898)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final bip0 c(int i, List list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((bip0) list.get(i2)).a == i) {
                return (bip0) list.get(i2);
            }
        }
        return null;
    }

    public static final float d(Interpolator interpolator, float f, float f2, float f3) {
        return g8e.b(f3, f2, interpolator.getInterpolation(f), f2);
    }

    public static final Float e(cnq0 cnq0Var) {
        tls tlsVar;
        ArrayList arrayList = new ArrayList();
        ag agVar = (ag) androidx.compose.ui.semantics.b.a(cnq0Var, a.C);
        if (agVar == null || (tlsVar = (tls) agVar.b) == null || !((Boolean) tlsVar.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (Float) arrayList.get(0);
    }

    public static final dry0 f(cnq0 cnq0Var) {
        tls tlsVar;
        ArrayList arrayList = new ArrayList();
        ag agVar = (ag) androidx.compose.ui.semantics.b.a(cnq0Var, a.a);
        if (agVar == null || (tlsVar = (tls) agVar.b) == null || !((Boolean) tlsVar.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (dry0) arrayList.get(0);
    }

    public static final AndroidViewHolder g(AndroidViewsHandler androidViewsHandler, int i) {
        Object obj;
        Iterator<T> it = androidViewsHandler.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((LayoutNode) ((Map.Entry) obj).getKey()).b == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (AndroidViewHolder) entry.getValue();
        }
        return null;
    }

    public static final String h(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
