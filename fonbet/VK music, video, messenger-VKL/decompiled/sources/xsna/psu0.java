package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.Pair;
import org.chromium.net.NetError;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.yk8;

/* compiled from: VkExpandableText.kt */
/* loaded from: classes17.dex */
public final class psu0 {
    public static final void a(final String str, final boolean z, final mtk0 mtk0Var, final mtk0 mtk0Var2, final izs izsVar, q630 q630Var, final gzs gzsVar, final long j, final frv0 frv0Var, final boolean z2, final LayoutDirection layoutDirection, final izs izsVar2, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        q630 q630Var3;
        androidx.compose.runtime.a M = aVar.M(-1518367535);
        int i5 = i & 6;
        ra8 ra8Var = ra8.a;
        if (i5 == 0) {
            i3 = (M.J(ra8Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.J(mtk0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= M.J(mtk0Var2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= M.y(izsVar) ? 131072 : 65536;
        }
        int i6 = i3 | 1572864;
        if ((i & 12582912) == 0) {
            i6 |= M.y(gzsVar) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i6 |= M.p(j) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i6 |= M.J(frv0Var) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (M.l(z2) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= M.o(layoutDirection == null ? -1 : layoutDirection.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= M.y(izsVar2) ? 256 : 128;
        }
        int i7 = i4;
        boolean z3 = true;
        if (M.t(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 147) == 146) ? false : true)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                q630Var3 = q630.a.a;
            } else {
                M.h();
                q630Var3 = q630Var;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1518367535, i6, i7, "com.vk.core.compose.component.ExpandText (VkExpandableText.kt:345)");
            }
            dt1.a.getClass();
            q630 b = ra8Var.b(q630Var3, dt1.a.h);
            boolean z4 = ((57344 & i6) == 16384) | ((i6 & 7168) == 2048);
            if ((((i7 & 112) ^ 48) <= 32 || !M.o(layoutDirection.ordinal())) && (i7 & 48) != 32) {
                z3 = false;
            }
            boolean z5 = z4 | z3;
            Object x = M.x();
            if (z5 || x == a.C0011a.a) {
                x = new gd5(mtk0Var, mtk0Var2, layoutDirection, 11);
                M.R(x);
            }
            q630 q630Var4 = q630Var3;
            aVar2 = M;
            mm2.f(z, kci.k(b, (izs) x), anp.e(null, 3), anp.f(null, 3), null, kai.c(2137267113, new yzs() { // from class: xsna.ksu0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2137267113, intValue, -1, "com.vk.core.compose.component.ExpandText.<anonymous> (VkExpandableText.kt:366)");
                    }
                    mtk0 mtk0Var3 = mtk0.this;
                    boolean J = aVar3.J(mtk0Var3);
                    boolean z6 = z2;
                    boolean l = J | aVar3.l(z6);
                    Object x2 = aVar3.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (l || x2 == c0012a) {
                        x2 = new zjl(mtk0Var3, z6);
                        aVar3.R(x2);
                    }
                    q630 c = ojc.c(bu00.e(q630.a.a, (izs) x2), false, null, new plg0(0), gzsVar, 11);
                    izs izsVar3 = izsVar2;
                    boolean J2 = aVar3.J(izsVar3);
                    Object x3 = aVar3.x();
                    if (J2 || x3 == c0012a) {
                        x3 = new b8k(izsVar3, 2);
                        aVar3.R(x3);
                    }
                    yqv0.c(str, egi.o(c, (izs) x3), j, null, null, 0, 0, t7z.a(t7z.d), 2, false, 0, 1, izsVar, frv0Var, aVar3, 100663296, 48, 1656);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, ((i6 >> 6) & 14) | 200064, 16);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630Var4;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.lsu0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    int I2 = ne7.I(i2);
                    psu0.a(str, z, mtk0Var, mtk0Var2, izsVar, q630Var2, gzsVar, j, frv0Var, z2, layoutDirection, izsVar2, (androidx.compose.runtime.a) obj, I, I2);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final us2 us2Var, final gzs gzsVar, final q630 q630Var, long j, frv0 frv0Var, frv0 frv0Var2, long j2, int i, int i2, String str, izs izsVar, androidx.compose.runtime.a aVar, final int i3, final int i4) {
        long j3;
        int i5;
        int i6;
        final String str2;
        int i7;
        int i8;
        int i9;
        izs izsVar2;
        int i10;
        boolean z;
        androidx.compose.runtime.a aVar2;
        final frv0 frv0Var3;
        final frv0 frv0Var4;
        final int i11;
        final int i12;
        final izs izsVar3;
        final long j4;
        final long j5;
        androidx.compose.runtime.f s;
        frv0 frv0Var5;
        int i13;
        String str3;
        izs izsVar4;
        frv0 frv0Var6;
        long j6;
        String str4;
        int i14;
        int i15;
        int i16;
        frv0 frv0Var7;
        long j7;
        androidx.compose.runtime.a M = aVar.M(-471881071);
        int i17 = (M.J(us2Var) ? 4 : 2) | i3 | (M.y(gzsVar) ? 32 : 16);
        if ((i3 & 384) == 0) {
            i17 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i4 & 8) == 0) {
            j3 = j;
            if (M.p(j3)) {
                i5 = 2048;
                int i18 = i17 | i5;
                int i19 = 598016 | i18;
                i6 = i4 & 128;
                if (i6 == 0) {
                    i19 = 13180928 | i18;
                } else if ((12582912 & i3) == 0) {
                    i19 |= M.o(i) ? 8388608 : 4194304;
                    int i20 = i19 | 100663296;
                    if ((i4 & 512) == 0) {
                        str2 = str;
                        if (M.J(str2)) {
                            i7 = SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
                            i8 = i20 | i7;
                            i9 = i4 & 1024;
                            if (i9 == 0) {
                                i10 = 6;
                                izsVar2 = izsVar;
                            } else {
                                izsVar2 = izsVar;
                                i10 = M.y(izsVar2) ? 4 : 2;
                            }
                            if ((i8 & 306783379) == 306783378 && (i10 & 3) == 2) {
                                z = false;
                                if (M.t(i8 & 1, z)) {
                                    aVar2 = M;
                                    aVar2.h();
                                    frv0Var3 = frv0Var;
                                    frv0Var4 = frv0Var2;
                                    i11 = i;
                                    i12 = i2;
                                    izsVar3 = izsVar;
                                    j4 = j3;
                                    j5 = j2;
                                } else {
                                    M.V();
                                    if ((i3 & 1) == 0 || M.i()) {
                                        if ((i4 & 8) != 0) {
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                            }
                                            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                            j3 = ylu0Var.getText().p;
                                            i8 &= -7169;
                                        }
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                                        }
                                        iyk0 iyk0Var = rrv0.c;
                                        wuv0 wuv0Var = (wuv0) M.r(iyk0Var);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        frv0 frv0Var8 = wuv0Var.e0;
                                        if (androidx.compose.runtime.b.d()) {
                                            frv0Var5 = frv0Var8;
                                            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                                        } else {
                                            frv0Var5 = frv0Var8;
                                        }
                                        wuv0 wuv0Var2 = (wuv0) M.r(iyk0Var);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        frv0 frv0Var9 = wuv0Var2.Y;
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                        }
                                        ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        long j8 = ylu0Var2.getText().m;
                                        int i21 = i8 & (-4186113);
                                        int i22 = i6 != 0 ? 2 : i;
                                        if ((i4 & 512) != 0) {
                                            str3 = d370.N(R.string.vk_expandable_linked_text_expand, 0, M);
                                            i13 = i8 & (-1883234305);
                                        } else {
                                            i13 = i21;
                                            str3 = str2;
                                        }
                                        if (i9 != 0) {
                                            frv0Var6 = frv0Var9;
                                            j6 = j8;
                                            str4 = str3;
                                            i14 = i22;
                                            i15 = i13;
                                            i16 = Integer.MAX_VALUE;
                                            izsVar4 = null;
                                        } else {
                                            izsVar4 = izsVar;
                                            frv0Var6 = frv0Var9;
                                            j6 = j8;
                                            str4 = str3;
                                            i14 = i22;
                                            i15 = i13;
                                            i16 = Integer.MAX_VALUE;
                                        }
                                        frv0Var7 = frv0Var5;
                                        j7 = j3;
                                    } else {
                                        M.h();
                                        if ((i4 & 8) != 0) {
                                            i8 &= -7169;
                                        }
                                        i15 = i8 & (-4186113);
                                        if ((i4 & 512) != 0) {
                                            i15 = i8 & (-1883234305);
                                        }
                                        frv0Var7 = frv0Var;
                                        frv0Var6 = frv0Var2;
                                        j6 = j2;
                                        i14 = i;
                                        i16 = i2;
                                        izsVar4 = izsVar2;
                                        j7 = j3;
                                        str4 = str2;
                                    }
                                    M.S();
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-471881071, i15, i10, "com.vk.core.compose.component.VkAlwaysExpandableText (VkExpandableText.kt:167)");
                                    }
                                    int i23 = i15 << 3;
                                    aVar2 = M;
                                    d(us2Var, false, gzsVar, q630Var, j7, frv0Var7, frv0Var6, j6, i14, i16, str4, null, 0L, null, false, null, true, izsVar4, aVar2, (i15 & 14) | 48 | (i23 & 896) | (i23 & 7168) | (57344 & i23) | (i23 & 234881024) | 805306368, ((i15 >> 27) & 14) | 1572864 | ((i10 << 21) & 29360128), 63488);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    j4 = j7;
                                    frv0Var3 = frv0Var7;
                                    frv0Var4 = frv0Var6;
                                    j5 = j6;
                                    i11 = i14;
                                    i12 = i16;
                                    str2 = str4;
                                    izsVar3 = izsVar4;
                                }
                                s = aVar2.s();
                                if (s == null) {
                                    s.d = new wzs() { // from class: xsna.hsu0
                                        @Override // xsna.wzs
                                        public final Object invoke(Object obj, Object obj2) {
                                            ((Integer) obj2).getClass();
                                            int I = ne7.I(i3 | 1);
                                            psu0.b(us2.this, gzsVar, q630Var, j4, frv0Var3, frv0Var4, j5, i11, i12, str2, izsVar3, (androidx.compose.runtime.a) obj, I, i4);
                                            return s3q0.a;
                                        }
                                    };
                                    return;
                                }
                                return;
                            }
                            z = true;
                            if (M.t(i8 & 1, z)) {
                            }
                            s = aVar2.s();
                            if (s == null) {
                            }
                        }
                    } else {
                        str2 = str;
                    }
                    i7 = 268435456;
                    i8 = i20 | i7;
                    i9 = i4 & 1024;
                    if (i9 == 0) {
                    }
                    if ((i8 & 306783379) == 306783378) {
                        z = false;
                        if (M.t(i8 & 1, z)) {
                        }
                        s = aVar2.s();
                        if (s == null) {
                        }
                    }
                    z = true;
                    if (M.t(i8 & 1, z)) {
                    }
                    s = aVar2.s();
                    if (s == null) {
                    }
                }
                int i202 = i19 | 100663296;
                if ((i4 & 512) == 0) {
                }
                i7 = 268435456;
                i8 = i202 | i7;
                i9 = i4 & 1024;
                if (i9 == 0) {
                }
                if ((i8 & 306783379) == 306783378) {
                }
                z = true;
                if (M.t(i8 & 1, z)) {
                }
                s = aVar2.s();
                if (s == null) {
                }
            }
        } else {
            j3 = j;
        }
        i5 = 1024;
        int i182 = i17 | i5;
        int i192 = 598016 | i182;
        i6 = i4 & 128;
        if (i6 == 0) {
        }
        int i2022 = i192 | 100663296;
        if ((i4 & 512) == 0) {
        }
        i7 = 268435456;
        i8 = i2022 | i7;
        i9 = i4 & 1024;
        if (i9 == 0) {
        }
        if ((i8 & 306783379) == 306783378) {
        }
        z = true;
        if (M.t(i8 & 1, z)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final us2 us2Var, final q630 q630Var, final long j, frv0 frv0Var, final frv0 frv0Var2, final long j2, final int i, String str, String str2, long j3, frv0 frv0Var3, boolean z, androidx.compose.runtime.a aVar, final int i2, final int i3, final int i4) {
        int i5;
        q630 q630Var2;
        long j4;
        frv0 frv0Var4;
        frv0 frv0Var5;
        String str3;
        int i6;
        androidx.compose.runtime.a aVar2;
        final long j5;
        final frv0 frv0Var6;
        final boolean z2;
        final String str4;
        final frv0 frv0Var7;
        final String str5;
        frv0 frv0Var8;
        int i7;
        frv0 frv0Var9;
        long j6;
        boolean z3;
        long j7;
        String str6;
        String str7;
        int i8;
        int i9;
        frv0 frv0Var10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        androidx.compose.runtime.a M = aVar.M(-1981003889);
        if ((i2 & 6) == 0) {
            i5 = (M.J(us2Var) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            q630Var2 = q630Var;
            i5 |= M.J(q630Var2) ? 32 : 16;
        } else {
            q630Var2 = q630Var;
        }
        if ((i2 & 384) == 0) {
            j4 = j;
            i5 |= M.p(j4) ? 256 : 128;
        } else {
            j4 = j;
        }
        if ((i2 & 3072) == 0) {
            if ((i4 & 8) == 0) {
                frv0Var4 = frv0Var;
                if (M.J(frv0Var4)) {
                    i14 = 2048;
                    i5 |= i14;
                }
            } else {
                frv0Var4 = frv0Var;
            }
            i14 = 1024;
            i5 |= i14;
        } else {
            frv0Var4 = frv0Var;
        }
        if ((i2 & 24576) == 0) {
            frv0Var5 = frv0Var2;
            i5 |= M.J(frv0Var5) ? 16384 : 8192;
        } else {
            frv0Var5 = frv0Var2;
        }
        if ((196608 & i2) == 0) {
            i5 |= M.p(j2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i5 |= M.o(i) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i2 & 12582912) == 0) {
            if ((i4 & 128) == 0) {
                str3 = str;
                if (M.J(str3)) {
                    i13 = 8388608;
                    i5 |= i13;
                }
            } else {
                str3 = str;
            }
            i13 = 4194304;
            i5 |= i13;
        } else {
            str3 = str;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= 33554432;
        }
        if ((i2 & 805306368) == 0) {
            if ((i4 & 512) == 0) {
                i11 = i5;
                if (M.p(j3)) {
                    i12 = SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
                    i6 = i11 | i12;
                }
            } else {
                i11 = i5;
            }
            i12 = 268435456;
            i6 = i11 | i12;
        } else {
            i6 = i5;
        }
        int i15 = i3 | 2;
        int i16 = i4 & 2048;
        if (i16 != 0) {
            i15 = 50;
        } else if ((i3 & 48) == 0) {
            i15 |= M.l(z) ? 32 : 16;
        }
        if (M.t(i6 & 1, ((i6 & 306783379) == 306783378 && (i15 & 19) == 18) ? false : true)) {
            M.V();
            if ((i2 & 1) == 0 || M.i()) {
                if ((i4 & 8) != 0) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0Var8 = wuv0Var.e0;
                    i6 &= -7169;
                } else {
                    frv0Var8 = frv0Var4;
                }
                if ((i4 & 128) != 0) {
                    i7 = 0;
                    str3 = d370.N(R.string.vk_expandable_linked_text_expand, 0, M);
                    i6 &= -29360129;
                } else {
                    i7 = 0;
                }
                String N = d370.N(R.string.vk_expandable_linked_text_collapse, i7, M);
                int i17 = i6 & (-234881025);
                if ((i4 & 512) != 0) {
                    if (androidx.compose.runtime.b.d()) {
                        frv0Var9 = frv0Var8;
                        androidx.compose.runtime.b.f(1040687336, i7, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    } else {
                        frv0Var9 = frv0Var8;
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j6 = ylu0Var.getText().p;
                    i17 = i6 & (-2113929217);
                } else {
                    frv0Var9 = frv0Var8;
                    j6 = j3;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var11 = wuv0Var2.e0;
                int i18 = i15 & (-15);
                frv0Var4 = frv0Var9;
                if (i16 != 0) {
                    j7 = j6;
                    str6 = N;
                    str7 = str3;
                    i8 = i17;
                    i9 = -1981003889;
                    z3 = false;
                } else {
                    z3 = z;
                    j7 = j6;
                    str6 = N;
                    str7 = str3;
                    i8 = i17;
                    i9 = -1981003889;
                }
                frv0Var10 = frv0Var11;
                i10 = i18;
            } else {
                M.h();
                if ((i4 & 8) != 0) {
                    i6 &= -7169;
                }
                if ((i4 & 128) != 0) {
                    i6 &= -29360129;
                }
                i8 = i6 & (-234881025);
                if ((i4 & 512) != 0) {
                    i8 = i6 & (-2113929217);
                }
                i10 = i15 & (-15);
                str6 = str2;
                j7 = j3;
                frv0Var10 = frv0Var3;
                z3 = z;
                str7 = str3;
                i9 = -1981003889;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(i9, i8, i10, "com.vk.core.compose.component.VkExpandableText (VkExpandableText.kt:77)");
            }
            Object[] objArr = new Object[0];
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new u3c0(7);
                M.R(x);
            }
            wh50 wh50Var = (wh50) crx0.A(objArr, (gzs) x, M, 48);
            boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
            boolean J = M.J(wh50Var);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                x2 = new l8s(1, wh50Var);
                M.R(x2);
            }
            gzs gzsVar = (gzs) x2;
            boolean J2 = M.J(wh50Var);
            int i19 = i8;
            Object x3 = M.x();
            if (J2 || x3 == c0012a) {
                x3 = new c36(2, wh50Var);
                M.R(x3);
            }
            int i20 = i19 << 6;
            aVar2 = M;
            long j8 = j4;
            frv0 frv0Var12 = frv0Var4;
            e(us2Var, booleanValue, gzsVar, q630Var2, j8, frv0Var12, frv0Var5, j2, i, 0, str7, str6, j7, frv0Var10, z3, (gzs) x3, aVar2, (i19 & 14) | (i20 & 7168) | (i20 & 57344) | (i20 & 458752) | (i20 & 3670016) | (i20 & 29360128) | (i20 & 234881024), ((i19 >> 21) & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW) | ((i10 << 9) & 57344), 512);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0Var7 = frv0Var12;
            str4 = str7;
            str5 = str6;
            j5 = j7;
            frv0Var6 = frv0Var10;
            z2 = z3;
        } else {
            aVar2 = M;
            aVar2.h();
            j5 = j3;
            frv0Var6 = frv0Var3;
            z2 = z;
            str4 = str3;
            frv0Var7 = frv0Var4;
            str5 = str2;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.msu0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i2 | 1);
                    int I2 = ne7.I(i3);
                    psu0.c(us2.this, q630Var, j, frv0Var7, frv0Var2, j2, i, str4, str5, j5, frv0Var6, z2, (androidx.compose.runtime.a) obj, I, I2, i4);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final us2 us2Var, final boolean z, final gzs<s3q0> gzsVar, final q630 q630Var, final long j, final frv0 frv0Var, final frv0 frv0Var2, final long j2, final int i, final int i2, final String str, String str2, long j3, frv0 frv0Var3, boolean z2, gzs<s3q0> gzsVar2, final boolean z3, izs<? super zhf0, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        String str3;
        int i8;
        frv0 frv0Var4;
        int i9;
        int i10;
        int i11;
        androidx.compose.runtime.a aVar2;
        final long j4;
        final frv0 frv0Var5;
        final boolean z4;
        final gzs<s3q0> gzsVar3;
        final izs<? super zhf0, s3q0> izsVar2;
        androidx.compose.runtime.f s;
        dtp0 dtp0Var;
        String str4;
        String str5;
        long j5;
        long j6;
        frv0 frv0Var6;
        int i12;
        gzs<s3q0> gzsVar4;
        String str6;
        long j7;
        izs<? super zhf0, s3q0> izsVar3;
        frv0 frv0Var7;
        int i13;
        boolean z5;
        gzs<s3q0> gzsVar5;
        int i14;
        Object obj;
        final wh50 wh50Var;
        Object obj2;
        final LayoutDirection layoutDirection;
        final wh50 wh50Var2;
        long j8;
        frv0 frv0Var8;
        gzs<s3q0> gzsVar6;
        ljo0 ljo0Var;
        int i15;
        androidx.compose.runtime.a M = aVar.M(1879762687);
        if ((i3 & 6) == 0) {
            i6 = (M.J(us2Var) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= M.l(z) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= M.y(gzsVar) ? 256 : 128;
        }
        int i16 = 1024;
        if ((i3 & 3072) == 0) {
            i6 |= M.J(q630Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i6 |= M.p(j) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i6 |= M.J(frv0Var) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i6 |= M.J(frv0Var2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i6 |= M.p(j2) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i6 |= M.o(i) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i6 |= M.o(i2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i4 & 6) == 0) {
            i7 = i4 | (M.J(str) ? 4 : 2);
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            if ((i5 & 2048) == 0) {
                str3 = str2;
                if (M.J(str3)) {
                    i15 = 32;
                    i7 |= i15;
                }
            } else {
                str3 = str2;
            }
            i15 = 16;
            i7 |= i15;
        } else {
            str3 = str2;
        }
        if ((i4 & 384) == 0) {
            i8 = i6;
            i7 |= ((i5 & 4096) == 0 && M.p(j3)) ? 256 : 128;
        } else {
            i8 = i6;
        }
        if ((i4 & 3072) == 0) {
            if ((i5 & 8192) == 0) {
                frv0Var4 = frv0Var3;
                if (M.J(frv0Var4)) {
                    i16 = 2048;
                }
            } else {
                frv0Var4 = frv0Var3;
            }
            i7 |= i16;
        } else {
            frv0Var4 = frv0Var3;
        }
        int i17 = i7;
        int i18 = i5 & 16384;
        if (i18 != 0) {
            i9 = i17 | 24576;
        } else {
            i9 = i17;
            if ((i4 & 24576) == 0) {
                i9 |= M.l(z2) ? 16384 : 8192;
                i10 = i5 & 32768;
                if (i10 == 0) {
                    i9 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    i9 |= M.y(gzsVar2) ? 131072 : 65536;
                }
                if ((i4 & 1572864) == 0) {
                    i9 |= M.l(z3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                }
                i11 = i5 & 131072;
                if (i11 == 0) {
                    i9 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    i9 |= M.y(izsVar) ? 8388608 : 4194304;
                }
                if (M.t(i8 & 1, (i8 & 306783379) == 306783378 || (i9 & 4793491) != 4793490)) {
                    aVar2 = M;
                    aVar2.h();
                    j4 = j3;
                    frv0Var5 = frv0Var3;
                    z4 = z2;
                    gzsVar3 = gzsVar2;
                    izsVar2 = izsVar;
                } else {
                    M.V();
                    int i19 = i3 & 1;
                    Object obj3 = a.C0011a.a;
                    if (i19 == 0 || M.i()) {
                        dtp0Var = null;
                        if ((i5 & 2048) != 0) {
                            str4 = d370.N(R.string.vk_expandable_linked_text_collapse, 0, M);
                            i9 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                        } else {
                            str4 = str3;
                        }
                        int i20 = i9;
                        if ((i5 & 4096) != 0) {
                            if (androidx.compose.runtime.b.d()) {
                                str5 = str4;
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            } else {
                                str5 = str4;
                            }
                            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            j5 = ylu0Var.getText().p;
                            i20 &= -897;
                        } else {
                            str5 = str4;
                            j5 = j3;
                        }
                        if ((i5 & 8192) != 0) {
                            if (androidx.compose.runtime.b.d()) {
                                j6 = j5;
                                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                            } else {
                                j6 = j5;
                            }
                            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            frv0Var6 = wuv0Var.e0;
                            i12 = i20 & (-7169);
                        } else {
                            j6 = j5;
                            frv0Var6 = frv0Var3;
                            i12 = i20;
                        }
                        boolean z6 = i18 != 0 ? false : z2;
                        if (i10 != 0) {
                            Object x = M.x();
                            if (x == obj3) {
                                x = new chr0(5);
                                M.R(x);
                            }
                            gzsVar4 = (gzs) x;
                        } else {
                            gzsVar4 = gzsVar2;
                        }
                        str6 = str5;
                        j7 = j6;
                        if (i11 != 0) {
                            frv0Var7 = frv0Var6;
                            i13 = i12;
                            z5 = z6;
                            gzsVar5 = gzsVar4;
                            izsVar3 = null;
                        } else {
                            izsVar3 = izsVar;
                            frv0Var7 = frv0Var6;
                            i13 = i12;
                            z5 = z6;
                            gzsVar5 = gzsVar4;
                        }
                    } else {
                        M.h();
                        if ((i5 & 2048) != 0) {
                            i9 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                        }
                        int i21 = i9;
                        dtp0Var = null;
                        if ((i5 & 4096) != 0) {
                            i21 &= -897;
                        }
                        if ((i5 & 8192) != 0) {
                            i21 &= -7169;
                        }
                        j7 = j3;
                        z5 = z2;
                        gzsVar5 = gzsVar2;
                        izsVar3 = izsVar;
                        i13 = i21;
                        frv0Var7 = frv0Var4;
                        str6 = str3;
                    }
                    M.S();
                    if (androidx.compose.runtime.b.d()) {
                        i14 = i8;
                        androidx.compose.runtime.b.f(1879762687, i14, i13, "com.vk.core.compose.component.VkExpandableText (VkExpandableText.kt:235)");
                    } else {
                        i14 = i8;
                    }
                    LayoutDirection layoutDirection2 = (LayoutDirection) M.r(uvi.n);
                    int i22 = i14 >> 21;
                    int i23 = i22 & 14;
                    int i24 = i14;
                    Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(273266588, i23, -1, "com.vk.core.compose.component.rememberDisappearingBrush (VkExpandableText.kt:404)");
                    }
                    azl azlVar = (azl) M.r(uvi.h);
                    boolean J = (((i23 ^ 6) > 4 && M.p(j2)) || (i22 & 6) == 4) | M.J(azlVar) | M.o(layoutDirection2.ordinal());
                    Object x2 = M.x();
                    if (J || x2 == obj3) {
                        float I0 = azlVar.I0(gsu0.c);
                        x2 = layoutDirection2 == LayoutDirection.Rtl ? yk8.a.b(new Pair[]{new Pair(valueOf, new l5g(l5g.j)), new Pair(Float.valueOf(I0), new l5g(j2))}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, I0, 8) : yk8.a.b(new Pair[]{new Pair(valueOf, new l5g(j2)), new Pair(Float.valueOf(I0), new l5g(l5g.j))}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, I0, 8);
                        M.R(x2);
                    }
                    final yk8 yk8Var = (yk8) x2;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    Object x3 = M.x();
                    if (x3 == obj3) {
                        x3 = androidx.compose.runtime.k.b(dtp0Var);
                        M.R(x3);
                    }
                    wh50 wh50Var3 = (wh50) x3;
                    Object x4 = M.x();
                    if (x4 == obj3) {
                        x4 = androidx.compose.runtime.k.b(dtp0Var);
                        M.R(x4);
                    }
                    wh50 wh50Var4 = (wh50) x4;
                    q630 a = xp2.a(q630Var, dtp0Var, 3);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c = qri.c(M, a);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar3);
                    } else {
                        M.f();
                    }
                    cri.a.c cVar = cri.a.f;
                    k9q0.w(M, a2, cVar);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(M, D, eVar);
                    Integer valueOf2 = Integer.valueOf(hashCode);
                    cri.a.b bVar = cri.a.g;
                    k9q0.w(M, valueOf2, bVar);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(M, c2678a);
                    cri.a.d dVar = cri.a.d;
                    k9q0.w(M, c, dVar);
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode2 = Long.hashCode(n34.n(M));
                    sy90 D2 = M.D();
                    q630.a aVar4 = q630.a.a;
                    q630 c2 = qri.c(M, aVar4);
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar3);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, d, cVar);
                    k9q0.w(M, D2, eVar);
                    ur.d(hashCode2, M, bVar, M, c2678a);
                    k9q0.w(M, c2, dVar);
                    q630 f = z3 ? txj0.f(aVar4, 1.0f) : aVar4;
                    Object x5 = M.x();
                    if (x5 == obj3) {
                        x5 = new lwp0(8);
                        M.R(x5);
                    }
                    q630 a3 = rdu.a(f, (izs) x5);
                    boolean J2 = ((i24 & 112) == 32) | ((3670016 & i13) == 1048576) | M.J(yk8Var) | M.o(layoutDirection2.ordinal());
                    Object x6 = M.x();
                    if (J2 || x6 == obj3) {
                        wh50Var = wh50Var4;
                        obj2 = obj3;
                        layoutDirection = layoutDirection2;
                        wh50Var2 = wh50Var3;
                        obj = new izs() { // from class: xsna.osu0
                            @Override // xsna.izs
                            public final Object invoke(Object obj4) {
                                final wh50 wh50Var5 = wh50.this;
                                final wh50 wh50Var6 = wh50Var;
                                final boolean z7 = z;
                                final boolean z8 = z3;
                                final yk8 yk8Var2 = yk8Var;
                                final LayoutDirection layoutDirection3 = layoutDirection;
                                return ((kw8) obj4).e(new izs() { // from class: xsna.jsu0
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // xsna.izs
                                    public final Object invoke(Object obj5) {
                                        float f2;
                                        float f3;
                                        ggj ggjVar = (ggj) obj5;
                                        ggjVar.s1();
                                        T value = wh50.this.getValue();
                                        T value2 = wh50Var6.getValue();
                                        if (value != 0 && value2 != 0) {
                                            ljo0 ljo0Var2 = (ljo0) value2;
                                            ljo0 ljo0Var3 = (ljo0) value;
                                            if (!z7 && (ljo0Var3.e() || z8)) {
                                                float f4 = (int) (ljo0Var3.c >> 32);
                                                long j9 = ljo0Var2.c;
                                                float f5 = (int) (j9 >> 32);
                                                float f6 = (int) (j9 & 4294967295L);
                                                float h = ljo0Var3.h(ljo0Var3.b.f - 1);
                                                float I02 = ggjVar.I0(gsu0.b);
                                                LayoutDirection layoutDirection4 = layoutDirection3;
                                                long floatToRawIntBits = (Float.floatToRawIntBits(((int) (r4 & 4294967295L)) - f6) & 4294967295L) | (Float.floatToRawIntBits(psu0.f(ljo0Var3, ljo0Var2, layoutDirection4, I02)) << 32);
                                                LayoutDirection layoutDirection5 = LayoutDirection.Rtl;
                                                if (layoutDirection4 != layoutDirection5 ? Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) >= (f4 - f5) - I02 : h < I02 + f5) {
                                                    float I03 = ggjVar.I0(gsu0.a);
                                                    yk8 yk8Var3 = yk8Var2;
                                                    if (layoutDirection4 == layoutDirection5) {
                                                        int i25 = (int) (floatToRawIntBits & 4294967295L);
                                                        float intBitsToFloat = Float.intBitsToFloat(i25);
                                                        ggjVar.a0().a.l(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat);
                                                        try {
                                                            f3 = -0.0f;
                                                            f2 = intBitsToFloat;
                                                            try {
                                                                oio.P(ggjVar, l5g.j, 0L, (Float.floatToRawIntBits(f6) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 5, 58);
                                                                ggjVar.a0().a.l(-0.0f, -f2);
                                                                float intBitsToFloat2 = Float.intBitsToFloat(i25);
                                                                ggjVar.a0().a.l(f5, intBitsToFloat2);
                                                                try {
                                                                    oio.x1(ggjVar, yk8Var3, 0L, (Float.floatToRawIntBits(I03) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 5, 58);
                                                                } finally {
                                                                    ggjVar.a0().a.l(-f5, -intBitsToFloat2);
                                                                }
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                ggjVar.a0().a.l(f3, -f2);
                                                                throw th;
                                                            }
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            f2 = intBitsToFloat;
                                                            f3 = -0.0f;
                                                        }
                                                    } else {
                                                        float intBitsToFloat3 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) - I03;
                                                        float f7 = intBitsToFloat3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : intBitsToFloat3;
                                                        float intBitsToFloat4 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
                                                        ggjVar.a0().a.l(f7, intBitsToFloat4);
                                                        try {
                                                            oio.x1(ggjVar, yk8Var3, 0L, (Float.floatToRawIntBits(I03 + f5) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 5, 58);
                                                        } finally {
                                                            ggjVar.a0().a.l(-f7, -intBitsToFloat4);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        return s3q0.a;
                                    }
                                });
                            }
                        };
                        M.R(obj);
                    } else {
                        obj2 = obj3;
                        obj = x6;
                        layoutDirection = layoutDirection2;
                        wh50Var = wh50Var4;
                        wh50Var2 = wh50Var3;
                    }
                    q630 e = bu00.e(a3, (izs) obj);
                    int i25 = z ? i2 : i;
                    t7z a4 = t7z.a(t7z.d);
                    Object x7 = M.x();
                    if (x7 == obj2) {
                        x7 = new lze0(1, wh50Var2);
                        M.R(x7);
                    }
                    int i26 = i13;
                    Object obj4 = obj2;
                    yqv0.d(us2Var, e, j2, 0, a4, 1, false, i25, (izs) x7, null, frv0Var2, M, (i24 & 14) | 100663296 | ((i24 >> 15) & 896), ((i24 >> 9) & 7168) | 48, 4728);
                    boolean z7 = !(z || wh50Var2.getValue() == 0 || (ljo0Var = (ljo0) wh50Var2.getValue()) == null || !ljo0Var.e()) || wh50Var2.getValue() == 0 || z3;
                    Object x8 = M.x();
                    if (x8 == obj4) {
                        x8 = new fk4(3, wh50Var);
                        M.R(x8);
                    }
                    int i27 = i24 << 12;
                    izs<? super zhf0, s3q0> izsVar4 = izsVar3;
                    a(str, z7, wh50Var2, wh50Var, (izs) x8, null, gzsVar, j, frv0Var, z3, layoutDirection, izsVar4, M, ((i26 << 3) & 112) | 224262 | ((i24 << 15) & 29360128) | (234881024 & i27) | (i27 & 1879048192), ((i26 >> 18) & 14) | ((i26 >> 15) & 896));
                    aVar2 = M;
                    aVar2.G();
                    if (z && z5 && str6 != null) {
                        aVar2.K(-1710897906);
                        gzs<s3q0> gzsVar7 = gzsVar5;
                        gzsVar6 = gzsVar7;
                        String str7 = str6;
                        j8 = j7;
                        frv0Var8 = frv0Var7;
                        yqv0.c(str7, ojc.c(aVar4, false, null, new plg0(0), gzsVar7, 11), j8, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var8, aVar2, ((i26 >> 3) & 14) | 100663296 | (i26 & 896), (i26 & 7168) | 48, 5880);
                        str3 = str7;
                        aVar2 = aVar2;
                    } else {
                        str3 = str6;
                        j8 = j7;
                        frv0Var8 = frv0Var7;
                        gzsVar6 = gzsVar5;
                        aVar2.K(-1724478355);
                    }
                    aVar2.j();
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    izsVar2 = izsVar4;
                    gzsVar3 = gzsVar6;
                    j4 = j8;
                    frv0Var5 = frv0Var8;
                    z4 = z5;
                }
                final String str8 = str3;
                s = aVar2.s();
                if (s == null) {
                    s.d = new wzs() { // from class: xsna.isu0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj5, Object obj6) {
                            ((Integer) obj6).getClass();
                            int I = ne7.I(i3 | 1);
                            int I2 = ne7.I(i4);
                            psu0.d(us2.this, z, gzsVar, q630Var, j, frv0Var, frv0Var2, j2, i, i2, str, str8, j4, frv0Var5, z4, gzsVar3, z3, izsVar2, (androidx.compose.runtime.a) obj5, I, I2, i5);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
        }
        i10 = i5 & 32768;
        if (i10 == 0) {
        }
        if ((i4 & 1572864) == 0) {
        }
        i11 = i5 & 131072;
        if (i11 == 0) {
        }
        if (M.t(i8 & 1, (i8 & 306783379) == 306783378 || (i9 & 4793491) != 4793490)) {
        }
        final String str82 = str3;
        s = aVar2.s();
        if (s == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final us2 us2Var, final boolean z, final gzs<s3q0> gzsVar, final q630 q630Var, long j, frv0 frv0Var, frv0 frv0Var2, long j2, final int i, int i2, String str, String str2, long j3, frv0 frv0Var3, boolean z2, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, final int i3, final int i4, final int i5) {
        int i6;
        boolean z3;
        int i7;
        long j4;
        frv0 frv0Var4;
        long j5;
        int i8;
        long j6;
        int i9;
        int i10;
        androidx.compose.runtime.a aVar2;
        final int i11;
        final long j7;
        final frv0 frv0Var5;
        final boolean z4;
        final gzs<s3q0> gzsVar3;
        final long j8;
        final frv0 frv0Var6;
        final long j9;
        final frv0 frv0Var7;
        final String str3;
        final String str4;
        androidx.compose.runtime.f s;
        frv0 frv0Var8;
        String str5;
        frv0 frv0Var9;
        String str6;
        String str7;
        String str8;
        int i12;
        long j10;
        long j11;
        boolean z5;
        frv0 frv0Var10;
        int i13;
        String str9;
        String str10;
        long j12;
        gzs<s3q0> gzsVar4;
        boolean z6;
        frv0 frv0Var11;
        long j13;
        int i14;
        int i15;
        frv0 frv0Var12;
        frv0 frv0Var13;
        int i16;
        int i17;
        int i18;
        androidx.compose.runtime.a M = aVar.M(-379033706);
        if ((i3 & 6) == 0) {
            i6 = (M.J(us2Var) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            z3 = z;
            i6 |= M.l(z3) ? 32 : 16;
        } else {
            z3 = z;
        }
        if ((i3 & 384) == 0) {
            i6 |= M.y(gzsVar) ? 256 : 128;
        }
        int i19 = 1024;
        if ((i3 & 3072) == 0) {
            i6 |= M.J(q630Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            j4 = j;
            i7 = i6 | (((i5 & 16) == 0 && M.p(j4)) ? 16384 : 8192);
        } else {
            i7 = i6;
            j4 = j;
        }
        if ((i3 & 196608) == 0) {
            i7 |= ((i5 & 32) == 0 && M.J(frv0Var)) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            frv0Var4 = frv0Var2;
            i7 |= ((i5 & 64) == 0 && M.J(frv0Var4)) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            frv0Var4 = frv0Var2;
        }
        if ((i3 & 12582912) == 0) {
            j5 = j2;
            i7 |= ((i5 & 128) == 0 && M.p(j5)) ? 8388608 : 4194304;
        } else {
            j5 = j2;
        }
        if ((i3 & 100663296) == 0) {
            i7 |= M.o(i) ? 67108864 : 33554432;
        }
        int i20 = i7 | 805306368;
        if ((i4 & 6) == 0) {
            if ((i5 & 1024) == 0 && M.J(str)) {
                i18 = 4;
                i8 = i4 | i18;
            }
            i18 = 2;
            i8 = i4 | i18;
        } else {
            i8 = i4;
        }
        if ((i4 & 48) == 0) {
            if ((i5 & 2048) == 0 && M.J(str2)) {
                i17 = 32;
                i8 |= i17;
            }
            i17 = 16;
            i8 |= i17;
        }
        if ((i4 & 384) == 0) {
            j6 = j3;
            i8 |= ((i5 & 4096) == 0 && M.p(j6)) ? 256 : 128;
        } else {
            j6 = j3;
        }
        if ((i4 & 3072) == 0) {
            if ((i5 & 8192) == 0 && M.J(frv0Var3)) {
                i19 = 2048;
            }
            i8 |= i19;
        }
        int i21 = i8;
        int i22 = i5 & 16384;
        if (i22 != 0) {
            i9 = i21 | 24576;
        } else {
            i9 = i21;
            if ((i4 & 24576) == 0) {
                i9 |= M.l(z2) ? 16384 : 8192;
                i10 = i5 & 32768;
                if (i10 == 0) {
                    i9 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    i9 |= M.y(gzsVar2) ? 131072 : 65536;
                }
                if (M.t(i20 & 1, (i20 & 306783379) == 306783378 || (i9 & 74899) != 74898)) {
                    aVar2 = M;
                    aVar2.h();
                    i11 = i2;
                    j7 = j3;
                    frv0Var5 = frv0Var3;
                    z4 = z2;
                    gzsVar3 = gzsVar2;
                    j8 = j4;
                    frv0Var6 = frv0Var4;
                    j9 = j5;
                    frv0Var7 = frv0Var;
                    str3 = str;
                    str4 = str2;
                } else {
                    M.V();
                    if ((i3 & 1) == 0 || M.i()) {
                        if ((i5 & 16) != 0) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            j4 = ylu0Var.getText().p;
                            i20 &= -57345;
                        }
                        if ((i5 & 32) != 0) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                            }
                            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            frv0Var8 = wuv0Var.e0;
                            i20 &= -458753;
                        } else {
                            frv0Var8 = frv0Var;
                        }
                        if ((i5 & 64) != 0) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                            }
                            wuv0 wuv0Var2 = (wuv0) M.r(rrv0.c);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            i20 &= -3670017;
                            frv0Var4 = wuv0Var2.Y;
                        }
                        if ((i5 & 128) != 0) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            j5 = ylu0Var2.getText().m;
                            i20 &= -29360129;
                        }
                        if ((i5 & 1024) != 0) {
                            str5 = d370.N(R.string.vk_expandable_linked_text_expand, 0, M);
                            i9 &= -15;
                        } else {
                            str5 = str;
                        }
                        if ((i5 & 2048) != 0) {
                            frv0Var9 = frv0Var8;
                            str6 = d370.N(R.string.vk_expandable_linked_text_collapse, 0, M);
                            i9 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                        } else {
                            frv0Var9 = frv0Var8;
                            str6 = str2;
                        }
                        int i23 = i9;
                        if ((i5 & 4096) != 0) {
                            str7 = str6;
                            str8 = str5;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            j10 = ylu0Var3.getText().p;
                            i12 = i23 & (-897);
                        } else {
                            str7 = str6;
                            str8 = str5;
                            i12 = i23;
                            j10 = j3;
                        }
                        if ((i5 & 8192) != 0) {
                            j11 = j10;
                            if (androidx.compose.runtime.b.d()) {
                                z5 = false;
                                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                            } else {
                                z5 = false;
                            }
                            wuv0 wuv0Var3 = (wuv0) M.r(rrv0.c);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            frv0Var10 = wuv0Var3.e0;
                            i13 = i12 & (-7169);
                        } else {
                            j11 = j10;
                            z5 = false;
                            frv0Var10 = frv0Var3;
                            i13 = i12;
                        }
                        if (i22 == 0) {
                            z5 = z2;
                        }
                        if (i10 != 0) {
                            Object x = M.x();
                            if (x == a.C0011a.a) {
                                x = new jzm0(8);
                                M.R(x);
                            }
                            str9 = str7;
                            str10 = str8;
                            j12 = j11;
                            z6 = z5;
                            gzsVar4 = (gzs) x;
                        } else {
                            str9 = str7;
                            str10 = str8;
                            j12 = j11;
                            gzsVar4 = gzsVar2;
                            z6 = z5;
                        }
                        frv0Var11 = frv0Var4;
                        j13 = j5;
                        i14 = i20;
                        i15 = Integer.MAX_VALUE;
                        frv0Var12 = frv0Var9;
                        frv0Var13 = frv0Var10;
                        i16 = i13;
                    } else {
                        M.h();
                        if ((i5 & 16) != 0) {
                            i20 &= -57345;
                        }
                        if ((i5 & 32) != 0) {
                            i20 &= -458753;
                        }
                        if ((i5 & 64) != 0) {
                            i20 &= -3670017;
                        }
                        if ((i5 & 128) != 0) {
                            i20 &= -29360129;
                        }
                        if ((i5 & 1024) != 0) {
                            i9 &= -15;
                        }
                        if ((i5 & 2048) != 0) {
                            i9 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                        }
                        i16 = i9;
                        if ((i5 & 4096) != 0) {
                            i16 &= -897;
                        }
                        if ((i5 & 8192) != 0) {
                            i16 &= -7169;
                        }
                        i15 = i2;
                        str10 = str;
                        str9 = str2;
                        z6 = z2;
                        gzsVar4 = gzsVar2;
                        j12 = j6;
                        frv0Var11 = frv0Var4;
                        j13 = j5;
                        i14 = i20;
                        frv0Var12 = frv0Var;
                        frv0Var13 = frv0Var3;
                    }
                    M.S();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-379033706, i14, i16, "com.vk.core.compose.component.VkExpandableText (VkExpandableText.kt:126)");
                    }
                    aVar2 = M;
                    long j14 = j4;
                    d(us2Var, z3, gzsVar, q630Var, j14, frv0Var12, frv0Var11, j13, i, i15, str10, str9, j12, frv0Var13, z6, gzsVar4, false, null, aVar2, i14 & 2147483646, (i16 & 14) | 1572864 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (i16 & 458752), 131072);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j8 = j14;
                    frv0Var7 = frv0Var12;
                    frv0Var6 = frv0Var11;
                    j9 = j13;
                    i11 = i15;
                    str3 = str10;
                    str4 = str9;
                    j7 = j12;
                    frv0Var5 = frv0Var13;
                    z4 = z6;
                    gzsVar3 = gzsVar4;
                }
                s = aVar2.s();
                if (s == null) {
                    s.d = new wzs() { // from class: xsna.nsu0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int I = ne7.I(i3 | 1);
                            int I2 = ne7.I(i4);
                            psu0.e(us2.this, z, gzsVar, q630Var, j8, frv0Var7, frv0Var6, j9, i, i11, str3, str4, j7, frv0Var5, z4, gzsVar3, (androidx.compose.runtime.a) obj, I, I2, i5);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
        }
        i10 = i5 & 32768;
        if (i10 == 0) {
        }
        if (M.t(i20 & 1, (i20 & 306783379) == 306783378 || (i9 & 74899) != 74898)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    public static final float f(ljo0 ljo0Var, ljo0 ljo0Var2, LayoutDirection layoutDirection, float f) {
        float f2 = (int) (ljo0Var.c >> 32);
        float i = ljo0Var.i(ljo0Var.b.f - 1);
        float i2 = ljo0Var2.i(0);
        LayoutDirection layoutDirection2 = LayoutDirection.Rtl;
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (layoutDirection == layoutDirection2) {
            float min = (Math.min(f2, i) - i2) - f;
            return min < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : min;
        }
        float f4 = f2 - i2;
        if (f4 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f3 = f4;
        }
        return Math.min(f3, i + f);
    }
}
