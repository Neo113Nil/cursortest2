package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.VkTooltipAppearance;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.coroutines.EmptyCoroutineContext;
import xsna.cri;
import xsna.dt1;
import xsna.eo20;
import xsna.q630;

/* compiled from: VkTooltip.kt */
/* loaded from: classes17.dex */
public final class cuv0 {
    public static final void a(final ktv0 ktv0Var, final gtv0 gtv0Var, final htv0 htv0Var, final boolean z, final ktv0 ktv0Var2, VkTooltipAppearance vkTooltipAppearance, final q630 q630Var, final jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        final VkTooltipAppearance vkTooltipAppearance2;
        androidx.compose.runtime.a M = aVar.M(-925604371);
        int i2 = i | (M.J(ktv0Var) ? 4 : 2) | (M.J(gtv0Var) ? 32 : 16) | (M.J(htv0Var) ? 256 : 128) | (M.l(z) ? 2048 : 1024) | (M.J(ktv0Var2) ? 16384 : 8192) | (M.o(vkTooltipAppearance.ordinal()) ? 131072 : 65536) | (M.J(q630Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.y(jaiVar) ? 8388608 : 4194304);
        if (M.t(i2 & 1, (4793491 & i2) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-925604371, i2, -1, "com.vk.core.compose.component.tooltip.TooltipImpl (VkTooltip.kt:238)");
            }
            vkTooltipAppearance2 = vkTooltipAppearance;
            ktv0Var.a(q630Var, htv0Var, kai.c(808069775, new wzs() { // from class: xsna.ttv0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(808069775, intValue, -1, "com.vk.core.compose.component.tooltip.TooltipImpl.<anonymous> (VkTooltip.kt:243)");
                        }
                        if (z) {
                            aVar2.K(-93947117);
                        } else {
                            aVar2.K(-84988644);
                            euv0.a(ktv0Var2, gtv0Var, aVar2, 0);
                        }
                        aVar2.j();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), kai.c(-28725168, new j8p0(ktv0Var2, gtv0Var, vkTooltipAppearance2, jaiVar), M), M, ((i2 >> 18) & 14) | 3456 | ((i2 >> 3) & 112) | ((i2 << 12) & 57344));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            vkTooltipAppearance2 = vkTooltipAppearance;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(gtv0Var, htv0Var, z, ktv0Var2, vkTooltipAppearance2, q630Var, jaiVar, i) { // from class: xsna.utv0
                public final /* synthetic */ gtv0 c;
                public final /* synthetic */ htv0 d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ ktv0 f;
                public final /* synthetic */ VkTooltipAppearance g;
                public final /* synthetic */ q630 h;
                public final /* synthetic */ jai i;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    cuv0.a(ktv0.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x013a, code lost:
    
        if (r10.o(r42) != false) goto L105;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final String str, final ktv0 ktv0Var, final VkTooltipAppearance vkTooltipAppearance, q630 q630Var, final String str2, boolean z, final boolean z2, boolean z3, boolean z4, final fuv0 fuv0Var, gxb0 gxb0Var, float f, gzs gzsVar, wzs wzsVar, int i, final jai jaiVar, androidx.compose.runtime.a aVar, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        String str3;
        final boolean z5;
        int i7;
        final boolean z6;
        int i8;
        int i9;
        int i10;
        final q630 q630Var2;
        final boolean z7;
        final gxb0 gxb0Var2;
        final float f2;
        final gzs gzsVar2;
        final wzs wzsVar2;
        final int i11;
        q630 q630Var3;
        q630 q630Var4;
        gxb0 gxb0Var3;
        final int i12;
        gzs gzsVar3;
        boolean z8;
        final boolean z9;
        float f3;
        boolean z10;
        int i13;
        final wzs wzsVar3;
        q630 q630Var5;
        yvj yvjVar;
        boolean z11;
        int i14;
        int i15;
        gtv0 o0;
        androidx.compose.runtime.a M = aVar.M(-1561077416);
        if ((i2 & 6) == 0) {
            i5 = (M.J(str) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i16 = i5 | (M.J(ktv0Var) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i16 |= M.o(vkTooltipAppearance.ordinal()) ? 256 : 128;
        }
        int i17 = i4 & 8;
        if (i17 != 0) {
            i6 = i16 | 3072;
        } else {
            i6 = i16 | (M.J(q630Var) ? 2048 : 1024);
        }
        int i18 = 16384;
        if ((i2 & 24576) == 0) {
            str3 = str2;
            i6 |= M.J(str3) ? 16384 : 8192;
        } else {
            str3 = str2;
        }
        int i19 = i4 & 32;
        if (i19 != 0) {
            i7 = i6 | 196608;
            z5 = z;
        } else {
            z5 = z;
            i7 = i6 | (M.l(z5) ? 131072 : 65536);
        }
        if ((i2 & 1572864) == 0) {
            i7 |= M.l(z2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i20 = i4 & 128;
        if (i20 != 0) {
            i8 = i7 | 12582912;
            z6 = z3;
        } else {
            z6 = z3;
            i8 = i7 | (M.l(z6) ? 8388608 : 4194304);
        }
        int i21 = i4 & 256;
        if (i21 != 0) {
            i9 = i8 | 100663296;
        } else {
            i9 = i8 | (M.l(z4) ? 67108864 : 33554432);
        }
        int i22 = i9 | (M.J(fuv0Var) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        int i23 = i3 | 6;
        int i24 = i4 & 2048;
        if (i24 != 0) {
            i23 = i3 | 54;
        } else if ((i3 & 48) == 0) {
            i23 |= M.n(f) ? 32 : 16;
        }
        int i25 = i23;
        int i26 = i25 | 384;
        int i27 = i4 & 8192;
        if (i27 != 0) {
            i10 = i25 | 3456;
        } else if ((i3 & 3072) == 0) {
            i10 = i26 | (M.y(wzsVar) ? 2048 : 1024);
        } else {
            i10 = i26;
        }
        if ((i3 & 24576) == 0) {
            if ((i4 & 16384) != 0) {
            }
            i18 = 8192;
            i10 |= i18;
        }
        if (M.t(i22 & 1, ((i22 & 306783379) == 306783378 && (i10 & 74899) == 74898) ? false : true)) {
            M.V();
            int i28 = i2 & 1;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (i28 == 0 || M.i()) {
                q630 q630Var6 = i17 != 0 ? q630.a.a : q630Var;
                if (i19 != 0) {
                    z5 = true;
                }
                if (i20 != 0) {
                    z6 = false;
                }
                boolean z12 = i21 != 0 ? true : z4;
                Object x = M.x();
                if (x == c0012a) {
                    q630Var3 = q630Var6;
                    x = new gxb0(!fuv0Var.a(), false, 27);
                    M.R(x);
                } else {
                    q630Var3 = q630Var6;
                }
                gxb0 gxb0Var4 = (gxb0) x;
                float f4 = i24 != 0 ? 8 : f;
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new jzm0(9);
                    M.R(x2);
                }
                gzs gzsVar4 = (gzs) x2;
                wzs wzsVar4 = i27 != 0 ? ne7.e : wzsVar;
                if ((i4 & 16384) != 0) {
                    pq3.e().getClass();
                    gxb0Var3 = gxb0Var4;
                    i12 = eo20.k;
                    gzsVar3 = gzsVar4;
                    z8 = z12;
                    z9 = z5;
                    f3 = f4;
                    z10 = z6;
                    i13 = i10 & (-57345);
                    q630Var4 = q630Var3;
                } else {
                    q630Var4 = q630Var3;
                    gxb0Var3 = gxb0Var4;
                    i12 = i;
                    gzsVar3 = gzsVar4;
                    z8 = z12;
                    z9 = z5;
                    f3 = f4;
                    z10 = z6;
                    i13 = i10;
                }
                wzsVar3 = wzsVar4;
            } else {
                M.h();
                if ((i4 & 16384) != 0) {
                    i10 &= -57345;
                }
                q630Var4 = q630Var;
                z8 = z4;
                gxb0Var3 = gxb0Var;
                f3 = f;
                gzsVar3 = gzsVar;
                i12 = i;
                z9 = z5;
                z10 = z6;
                i13 = i10;
                wzsVar3 = wzsVar;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1561077416, i22, i13, "com.vk.core.compose.component.tooltip.VkTooltip (VkTooltip.kt:84)");
            }
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = bap.j(EmptyCoroutineContext.b, M);
                M.R(x3);
            }
            yvj yvjVar2 = (yvj) x3;
            int i29 = (i22 >> 6) & 14;
            pq3.e().getClass();
            M.K(720867565);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(720867565, i29, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeTooltipDefaults.colors (MilkshakeTooltipDefaults.kt:24)");
            }
            switch (eo20.a.$EnumSwitchMapping$0[vkTooltipAppearance.ordinal()]) {
                case 1:
                    q630Var5 = q630Var4;
                    yvjVar = yvjVar2;
                    z11 = z10;
                    i14 = i22;
                    i15 = i13;
                    M.K(1264000610);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1793794648, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeTooltipDefaults.accentTooltipColors (MilkshakeTooltipDefaults.kt:47)");
                    }
                    o0 = de.o0(wlb0.h(M).getBackground().f, wlb0.h(M).getText().d, wlb0.h(M).getIcon().c, M, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    break;
                case 2:
                    q630Var5 = q630Var4;
                    yvjVar = yvjVar2;
                    z11 = z10;
                    i14 = i22;
                    i15 = i13;
                    M.K(1264002691);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2036984473, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeTooltipDefaults.neutralTooltipColors (MilkshakeTooltipDefaults.kt:54)");
                    }
                    o0 = de.o0(wlb0.h(M).getBackground().n, wlb0.h(M).getText().m, wlb0.h(M).getIcon().l, M, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    break;
                case 3:
                    q630Var5 = q630Var4;
                    yvjVar = yvjVar2;
                    z11 = z10;
                    i14 = i22;
                    i15 = i13;
                    M.K(1264004873);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1412118092, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeTooltipDefaults.inverseAccentTooltipColors (MilkshakeTooltipDefaults.kt:61)");
                    }
                    o0 = de.o0(wlb0.h(M).getBackground().s, wlb0.h(M).getText().e, wlb0.h(M).getIcon().e, M, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    break;
                case 4:
                    q630Var5 = q630Var4;
                    yvjVar = yvjVar2;
                    z11 = z10;
                    i14 = i22;
                    i15 = i13;
                    M.K(1264007435);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1740446106, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeTooltipDefaults.invariablyWhiteTooltipColors (MilkshakeTooltipDefaults.kt:68)");
                    }
                    o0 = de.o0(wlb0.h(M).getBackground().j, wlb0.h(M).getText().o, wlb0.h(M).getIcon().l, M, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    break;
                case 5:
                    q630Var5 = q630Var4;
                    yvjVar = yvjVar2;
                    z11 = z10;
                    i14 = i22;
                    i15 = i13;
                    M.K(1264010059);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1541868036, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeTooltipDefaults.invariablyBlackTooltipColors (MilkshakeTooltipDefaults.kt:75)");
                    }
                    o0 = de.o0(wlb0.h(M).getBackground().l, wlb0.h(M).getText().d, wlb0.h(M).getIcon().c, M, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    break;
                case 6:
                    M.K(1264012551);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1677634308, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeTooltipDefaults.transparentTooltipColors (MilkshakeTooltipDefaults.kt:82)");
                    }
                    int i30 = i13;
                    long j = l5g.j;
                    q630Var5 = q630Var4;
                    yvjVar = yvjVar2;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    iyk0 iyk0Var = rrv0.a;
                    ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j2 = ylu0Var.getIcon().c;
                    z11 = z10;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j3 = ylu0Var2.getText().m;
                    M = M;
                    i14 = i22;
                    i15 = i30;
                    o0 = de.o0(j, j3, j2, M, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    break;
                default:
                    throw alb0.c(1263999076, M);
            }
            final gtv0 gtv0Var = o0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            final String str4 = str3;
            final yvj yvjVar3 = yvjVar;
            boolean z13 = z9;
            int i31 = i12;
            wzs wzsVar5 = wzsVar3;
            int i32 = i14 >> 3;
            q630 q630Var7 = q630Var5;
            androidx.compose.runtime.a aVar2 = M;
            boolean z14 = z8;
            gxb0 gxb0Var5 = gxb0Var3;
            float f5 = f3;
            gzs gzsVar5 = gzsVar3;
            boolean z15 = z11;
            c(ktv0Var, gtv0Var, vkTooltipAppearance, kai.c(-403507601, new yzs() { // from class: xsna.vtv0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    gtv0 gtv0Var2;
                    String str5;
                    q630.a aVar3;
                    int i33;
                    gtv0 gtv0Var3;
                    int i34;
                    int i35;
                    int i36;
                    int i37;
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar4.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-403507601, intValue, -1, "com.vk.core.compose.component.tooltip.VkTooltip.<anonymous> (VkTooltip.kt:93)");
                        }
                        a.l lVar = androidx.compose.foundation.layout.a.a;
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, aVar4, 0);
                        int hashCode = Long.hashCode(n34.n(aVar4));
                        sy90 D = aVar4.D();
                        q630.a aVar5 = q630.a.a;
                        q630 c = qri.c(aVar4, aVar5);
                        cri.h7.getClass();
                        LayoutNode.a aVar6 = cri.a.b;
                        if (aVar4.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar4.H();
                        if (aVar4.L()) {
                            aVar4.I(aVar6);
                        } else {
                            aVar4.f();
                        }
                        cri.a.c cVar = cri.a.f;
                        k9q0.w(aVar4, a, cVar);
                        cri.a.e eVar = cri.a.e;
                        k9q0.w(aVar4, D, eVar);
                        Integer valueOf = Integer.valueOf(hashCode);
                        cri.a.b bVar = cri.a.g;
                        k9q0.w(aVar4, valueOf, bVar);
                        cri.a.C2678a c2678a = cri.a.h;
                        k9q0.t(aVar4, c2678a);
                        cri.a.d dVar = cri.a.d;
                        k9q0.w(aVar4, c, dVar);
                        pq3.e().getClass();
                        float f6 = eo20.d;
                        pq3.e().getClass();
                        q630 w = txj0.w(aVar5, f6, eo20.e);
                        pq3.e().getClass();
                        q630 j4 = txj0.j(eo20.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, w);
                        androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, aVar4, 0);
                        int hashCode2 = Long.hashCode(n34.n(aVar4));
                        sy90 D2 = aVar4.D();
                        q630 c2 = qri.c(aVar4, j4);
                        if (aVar4.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar4.H();
                        if (aVar4.L()) {
                            aVar4.I(aVar6);
                        } else {
                            aVar4.f();
                        }
                        k9q0.w(aVar4, a2, cVar);
                        k9q0.w(aVar4, D2, eVar);
                        ur.d(hashCode2, aVar4, bVar, aVar4, c2678a);
                        k9q0.w(aVar4, c2, dVar);
                        gtv0 gtv0Var4 = gtv0Var;
                        String str6 = str;
                        if (str6 == null || str6.length() == 0) {
                            gtv0Var2 = gtv0Var4;
                            str5 = "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)";
                            aVar3 = aVar5;
                            i33 = -2138324211;
                            aVar4.K(-2138324211);
                        } else {
                            aVar4.K(-2134537964);
                            pq3.e().getClass();
                            aVar4.K(2124138390);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(2124138390, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeTooltipDefaults.titleTextStyle (MilkshakeTooltipDefaults.kt:41)");
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                            }
                            wuv0 wuv0Var = (wuv0) aVar4.r(rrv0.c);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            frv0 frv0Var = wuv0Var.h0;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            aVar4.j();
                            long b = gtv0Var4.b(aVar4);
                            aVar3 = aVar5;
                            str5 = "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)";
                            gtv0Var2 = gtv0Var4;
                            i33 = -2138324211;
                            yqv0.c(str6, aVar3, b, null, null, 0, 0, null, 0, false, 0, 1, null, frv0Var, aVar4, 48, 48, 6136);
                            aVar4 = aVar4;
                        }
                        aVar4.j();
                        String str7 = str4;
                        if (str7 == null || str7.length() == 0) {
                            gtv0Var3 = gtv0Var2;
                            i34 = 0;
                            aVar4.K(i33);
                            aVar4.j();
                        } else {
                            aVar4.K(-2134140234);
                            pq3.e().getClass();
                            aVar4.K(-574073614);
                            if (androidx.compose.runtime.b.d()) {
                                i36 = -1;
                                i37 = 0;
                                androidx.compose.runtime.b.f(-574073614, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeTooltipDefaults.descriptionTextStyle (MilkshakeTooltipDefaults.kt:44)");
                            } else {
                                i36 = -1;
                                i37 = 0;
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-473561179, i37, i36, str5);
                            }
                            wuv0 wuv0Var2 = (wuv0) aVar4.r(rrv0.c);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            frv0 frv0Var2 = wuv0Var2.d0;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            aVar4.j();
                            gtv0 gtv0Var5 = gtv0Var2;
                            androidx.compose.runtime.a aVar7 = aVar4;
                            i34 = i37;
                            yqv0.c(str7, aVar3, gtv0Var5.b(aVar4), null, null, 0, 0, null, 0, false, 0, i12, null, frv0Var2, aVar7, 48, 0, 6136);
                            aVar4 = aVar7;
                            aVar4.j();
                            gtv0Var3 = gtv0Var5;
                        }
                        wzsVar3.invoke(aVar4, Integer.valueOf(i34));
                        aVar4.G();
                        if (z9) {
                            aVar4.K(-806007625);
                        } else {
                            aVar4.K(-801348046);
                            pq3.e().getClass();
                            q630 H = s200.H(aVar3, eo20.i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                            float f7 = 16;
                            gtv0Var3.getClass();
                            aVar4.K(403979211);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(403979211, 0, -1, "com.vk.core.compose.component.defaults.VkTooltipColorsImpl.iconColor (VkTooltipDefaults.kt:104)");
                            }
                            long j5 = gtv0Var3.c;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            aVar4.j();
                            if (androidx.compose.runtime.b.d()) {
                                i35 = i34;
                                androidx.compose.runtime.b.f(-2113961956, i35, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel16> (VkSdkIcons.kt:212)");
                            } else {
                                i35 = i34;
                            }
                            lg90 a3 = pg90.a(R.drawable.vk_icon_cancel_16, i35, aVar4);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            yvj yvjVar4 = yvjVar3;
                            boolean y = aVar4.y(yvjVar4);
                            fuv0 fuv0Var2 = fuv0Var;
                            boolean J = y | aVar4.J(fuv0Var2);
                            Object x4 = aVar4.x();
                            if (J || x4 == a.C0011a.a) {
                                x4 = new wx0(28, yvjVar4, fuv0Var2);
                                aVar4.R(x4);
                            }
                            nzu0.c((gzs) x4, a3, null, H, f7, j5, false, null, false, null, null, aVar4, 25024, 1984);
                        }
                        aVar4.j();
                        aVar4.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, M), q630Var7, z2, z15, z14, fuv0Var, gxb0Var5, f5, gzsVar5, jaiVar, aVar2, ((i14 << 3) & 57344) | (i32 & 14) | 3072 | (i14 & 896) | (458752 & i32) | (3670016 & i32) | (29360128 & i32) | (i32 & 234881024) | 805306368, ((i15 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | 384);
            M = aVar2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            z5 = z13;
            q630Var2 = q630Var7;
            z7 = z14;
            gxb0Var2 = gxb0Var5;
            f2 = f5;
            gzsVar2 = gzsVar5;
            wzsVar2 = wzsVar5;
            z6 = z15;
            i11 = i31;
        } else {
            M.h();
            q630Var2 = q630Var;
            z7 = z4;
            gxb0Var2 = gxb0Var;
            f2 = f;
            gzsVar2 = gzsVar;
            wzsVar2 = wzsVar;
            i11 = i;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.wtv0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i2 | 1);
                    int I2 = ne7.I(i3);
                    cuv0.b(str, ktv0Var, vkTooltipAppearance, q630Var2, str2, z5, z2, z6, z7, fuv0Var, gxb0Var2, f2, gzsVar2, wzsVar2, i11, jaiVar, (androidx.compose.runtime.a) obj, I, I2, i4);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final ktv0 ktv0Var, final gtv0 gtv0Var, final VkTooltipAppearance vkTooltipAppearance, final jai jaiVar, final q630 q630Var, final boolean z, final boolean z2, final boolean z3, final fuv0 fuv0Var, final gxb0 gxb0Var, final float f, final gzs gzsVar, final jai jaiVar2, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        jai jaiVar3;
        int i4;
        androidx.compose.runtime.a aVar2;
        int i5;
        androidx.compose.runtime.a M = aVar.M(1306631456);
        if ((i & 6) == 0) {
            i3 = (M.J(ktv0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? M.J(gtv0Var) : M.y(gtv0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.o(vkTooltipAppearance.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            jaiVar3 = jaiVar;
            i3 |= M.y(jaiVar3) ? 2048 : 1024;
        } else {
            jaiVar3 = jaiVar;
        }
        if ((i & 24576) == 0) {
            i3 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= M.l(z) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= M.l(z2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= M.l(z3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= M.J(fuv0Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= M.J(gxb0Var) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (M.n(f) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= M.y(jaiVar2) ? 256 : 128;
        }
        int i6 = i4;
        if (M.t(i3 & 1, ((i3 & 306783379) == 306783378 && (i6 & 147) == 146) ? false : true)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1306631456, i3, i6, "com.vk.core.compose.component.tooltip.VkTooltip (VkTooltip.kt:166)");
            }
            azl azlVar = (azl) M.r(uvi.h);
            M.K(1542400539);
            pq3.e().getClass();
            int r0 = azlVar.r0(eo20.g);
            M.j();
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                i5 = i6;
                x = androidx.compose.runtime.k.b(new htv0(0));
                M.R(x);
            } else {
                i5 = i6;
            }
            final wh50 wh50Var = (wh50) x;
            int i7 = 458752 & i3;
            int i8 = i3;
            boolean z4 = i7 == 131072;
            Object x2 = M.x();
            if (z4 || x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(ktv0Var);
                M.R(x2);
            }
            final wh50 wh50Var2 = (wh50) x2;
            boolean z5 = i7 == 131072;
            Object x3 = M.x();
            if (z5 || x3 == c0012a) {
                x3 = androidx.compose.runtime.k.b(new z5p0(azlVar, (ktv0) wh50Var2.getValue(), f, z, new gyo0(wh50Var2, 13), new y2x(2, wh50Var), r0));
                M.R(x3);
            }
            wh50 wh50Var3 = (wh50) x3;
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            jaiVar2.invoke(M, Integer.valueOf((i5 >> 6) & 14));
            if (fuv0Var.isVisible()) {
                M.K(838684651);
                z5p0 z5p0Var = (z5p0) wh50Var3.getValue();
                boolean z6 = (((i8 & 234881024) ^ 100663296) > 67108864 && M.J(fuv0Var)) || (i8 & 100663296) == 67108864;
                Object x4 = M.x();
                if (z6 || x4 == c0012a) {
                    x4 = new hri0(fuv0Var, 23);
                    M.R(x4);
                }
                final jai jaiVar4 = jaiVar3;
                aVar2 = M;
                nb2.a(z5p0Var, (gzs) x4, gxb0Var, kai.c(-589544191, new wzs() { // from class: xsna.xtv0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (aVar4.t(intValue & 1, (intValue & 3) != 2)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-589544191, intValue, -1, "com.vk.core.compose.component.tooltip.VkTooltip.<anonymous>.<anonymous> (VkTooltip.kt:199)");
                            }
                            wh50 wh50Var4 = wh50.this;
                            ktv0 ktv0Var2 = (ktv0) wh50Var4.getValue();
                            q630 q630Var2 = q630.a.a;
                            if (z3) {
                                aVar4.K(-1558693929);
                                Object x5 = aVar4.x();
                                a.C0011a.C0012a c0012a2 = a.C0011a.a;
                                if (x5 == c0012a2) {
                                    x5 = ir.h(aVar4);
                                }
                                sg50 sg50Var = (sg50) x5;
                                fuv0 fuv0Var2 = fuv0Var;
                                boolean J = aVar4.J(fuv0Var2);
                                Object x6 = aVar4.x();
                                if (J || x6 == c0012a2) {
                                    x6 = new oqh0(fuv0Var2, 26);
                                    aVar4.R(x6);
                                }
                                q630Var2 = ojc.b(q630Var2, sg50Var, null, false, null, (gzs) x6, 28);
                                aVar4.j();
                            } else {
                                aVar4.K(-1558398902);
                                aVar4.j();
                            }
                            cuv0.a(ktv0Var2, gtv0Var, (htv0) wh50Var.getValue(), z2, (ktv0) wh50Var4.getValue(), vkTooltipAppearance, q630Var2, jaiVar4, aVar4, 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar4.h();
                        }
                        return s3q0.a;
                    }
                }, M), aVar2, ((i8 >> 21) & 896) | 3072, 0);
                Boolean valueOf = Boolean.valueOf(fuv0Var.isVisible());
                boolean z7 = (i5 & 112) == 32;
                Object x5 = aVar2.x();
                if (z7 || x5 == c0012a) {
                    x5 = new k0t0(1, gzsVar);
                    aVar2.R(x5);
                }
                bap.c(valueOf, (izs) x5, aVar2, 0);
            } else {
                aVar2 = M;
                aVar2.K(831388584);
            }
            aVar2.j();
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ytv0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    int I2 = ne7.I(i2);
                    cuv0.c(ktv0.this, gtv0Var, vkTooltipAppearance, jaiVar, q630Var, z, z2, z3, fuv0Var, gxb0Var, f, gzsVar, jaiVar2, (androidx.compose.runtime.a) obj, I, I2);
                    return s3q0.a;
                }
            };
        }
    }
}
