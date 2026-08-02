package xsna;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.banner.Banner$BackgroundContentScale;
import com.vk.core.compose.component.banner.Banner$BackgroundMode;
import com.vk.core.compose.component.banner.Banner$Notification$Appearance;
import com.vk.core.compose.component.banner.Banner$VerticalAlignment;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.aeu0;
import xsna.bap;
import xsna.c6j;
import xsna.cp10;
import xsna.cri;
import xsna.dp10;
import xsna.dt1;
import xsna.e4p0;
import xsna.ep10;
import xsna.hr80;
import xsna.izs;
import xsna.ja8;
import xsna.jgp;
import xsna.k9q0;
import xsna.kqu0;
import xsna.l5g;
import xsna.lg90;
import xsna.n34;
import xsna.op10;
import xsna.q630;
import xsna.qri;
import xsna.s200;
import xsna.s3q0;
import xsna.s5j;
import xsna.sy90;
import xsna.tdu0;
import xsna.tgi0;
import xsna.tra0;
import xsna.ty6;
import xsna.ur;
import xsna.vdu0;
import xsna.vjw;
import xsna.wdu0;
import xsna.wh50;
import xsna.wkj;
import xsna.xdu0;
import xsna.ydu0;
import xsna.zak0;
import xsna.zdu0;
import xsna.zo10;

/* compiled from: VkBanner.kt */
/* loaded from: classes17.dex */
public final class beu0 {
    /* JADX WARN: Removed duplicated region for block: B:124:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final xl20 xl20Var, q630 q630Var, lg90 lg90Var, lg90 lg90Var2, l5g l5gVar, Banner$BackgroundMode banner$BackgroundMode, Banner$BackgroundContentScale banner$BackgroundContentScale, b16 b16Var, z06 z06Var, Banner$VerticalAlignment banner$VerticalAlignment, c16 c16Var, gzs gzsVar, androidx.compose.runtime.a aVar, final int i, final int i2, final int i3) {
        int i4;
        q630 q630Var2;
        int i5;
        int i6;
        int i7;
        l5g l5gVar2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        androidx.compose.runtime.a aVar2;
        final lg90 lg90Var3;
        final lg90 lg90Var4;
        final Banner$BackgroundContentScale banner$BackgroundContentScale2;
        final b16 b16Var2;
        final z06 z06Var2;
        final Banner$VerticalAlignment banner$VerticalAlignment2;
        final gzs gzsVar2;
        final l5g l5gVar3;
        final q630 q630Var3;
        final Banner$BackgroundMode banner$BackgroundMode2;
        final c16 c16Var2;
        androidx.compose.runtime.f s;
        gzs gzsVar3;
        gzs gzsVar4;
        long j;
        androidx.compose.runtime.a M = aVar.M(-731236227);
        if ((i & 6) == 0) {
            i4 = (M.J(xl20Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i20 = i3 & 2;
        if (i20 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i4 |= M.J(q630Var2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                i4 |= (i & 512) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 256 : 128;
            }
            i6 = i3 & 8;
            if (i6 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= (i & 4096) == 0 ? M.J(lg90Var2) : M.y(lg90Var2) ? 2048 : 1024;
            }
            i7 = i3 & 16;
            if (i7 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                l5gVar2 = l5gVar;
                i4 |= M.J(l5gVar2) ? 16384 : 8192;
                i8 = i3 & 32;
                if (i8 != 0) {
                    i4 |= 196608;
                } else if ((i & 196608) == 0) {
                    i4 |= M.o(banner$BackgroundMode == null ? -1 : banner$BackgroundMode.ordinal()) ? 131072 : 65536;
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= M.o(banner$BackgroundContentScale != null ? banner$BackgroundContentScale.ordinal() : -1) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                }
                i10 = i3 & 128;
                if (i10 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= M.J(b16Var) ? 8388608 : 4194304;
                }
                i11 = i3 & 256;
                if (i11 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i12 = i11;
                    i4 |= M.J(z06Var) ? 67108864 : 33554432;
                    i13 = i4 | 805306368;
                    i14 = i3 & 1024;
                    if (i14 == 0) {
                        i16 = i2 | 6;
                        i15 = i14;
                    } else {
                        i15 = i14;
                        i16 = i2 | (M.J(c16Var) ? 4 : 2);
                    }
                    i17 = i3 & 2048;
                    if (i17 == 0) {
                        i16 |= 48;
                        i18 = i17;
                    } else if ((i2 & 48) == 0) {
                        i18 = i17;
                        i16 |= M.y(gzsVar) ? 32 : 16;
                    } else {
                        i18 = i17;
                    }
                    i19 = i16;
                    boolean z = true;
                    if (M.t(i13 & 1, (i13 & 306783379) == 306783378 || (i19 & 19) != 18)) {
                        aVar2 = M;
                        aVar2.h();
                        lg90Var3 = lg90Var;
                        lg90Var4 = lg90Var2;
                        banner$BackgroundContentScale2 = banner$BackgroundContentScale;
                        b16Var2 = b16Var;
                        z06Var2 = z06Var;
                        banner$VerticalAlignment2 = banner$VerticalAlignment;
                        gzsVar2 = gzsVar;
                        l5gVar3 = l5gVar2;
                        q630Var3 = q630Var2;
                        banner$BackgroundMode2 = banner$BackgroundMode;
                        c16Var2 = c16Var;
                    } else {
                        q630.a aVar3 = q630.a.a;
                        if (i20 != 0) {
                            q630Var2 = aVar3;
                        }
                        final lg90 lg90Var5 = i5 != 0 ? null : lg90Var;
                        int i21 = i12;
                        final lg90 lg90Var6 = i6 != 0 ? null : lg90Var2;
                        if (i7 != 0) {
                            l5gVar2 = null;
                        }
                        final Banner$BackgroundMode banner$BackgroundMode3 = i8 != 0 ? Banner$BackgroundMode.Auto : banner$BackgroundMode;
                        final Banner$BackgroundContentScale banner$BackgroundContentScale3 = i9 != 0 ? Banner$BackgroundContentScale.Fit : banner$BackgroundContentScale;
                        int i22 = i15;
                        final b16 b16Var3 = i10 != 0 ? null : b16Var;
                        final z06 z06Var3 = i21 != 0 ? null : z06Var;
                        int i23 = i18;
                        final Banner$VerticalAlignment banner$VerticalAlignment3 = Banner$VerticalAlignment.Top;
                        final c16 c16Var3 = i22 != 0 ? null : c16Var;
                        gzs gzsVar5 = i23 != 0 ? null : gzsVar;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-731236227, i13, i19, "com.vk.core.compose.component.banner.VkBanner (VkBanner.kt:70)");
                        }
                        M.K(1656674608);
                        M.K(1656656616);
                        q630 d = rte0.d(txj0.z(txj0.f(q630Var2, 1.0f), null, 3), tdu0.g(6));
                        if (l5gVar2 == null && lg90Var5 != null) {
                            z = false;
                        }
                        if (z) {
                            if (l5gVar2 == null) {
                                M.K(1366965877);
                                j = tdu0.a(Banner$Notification$Appearance.Neutral, M, 54);
                                M.j();
                            } else {
                                M.K(1366964141);
                                M.j();
                                j = l5gVar2.a;
                            }
                            gzsVar3 = gzsVar5;
                            d = d.g(r18.a((float) 0.5d, tdu0.b(Banner$Notification$Appearance.Neutral, M, 54), hr80.m(aVar3, j, androidx.compose.ui.graphics.e.a), tdu0.g(6)));
                        } else {
                            gzsVar3 = gzsVar5;
                        }
                        M.j();
                        Object obj = a.C0011a.a;
                        if (gzsVar3 != null) {
                            Object x = M.x();
                            if (x == obj) {
                                x = ir.h(M);
                            }
                            q630 b = ojc.b(aVar3, (sg50) x, qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 0L, false), true, new plg0(0), gzsVar3, 8);
                            gzsVar4 = gzsVar3;
                            q630 g = d.g(b);
                            if (g != null) {
                                d = g;
                            }
                        } else {
                            gzsVar4 = gzsVar3;
                        }
                        M.j();
                        M.K(-1003410150);
                        M.K(212064437);
                        M.j();
                        azl azlVar = (azl) M.r(uvi.h);
                        Object x2 = M.x();
                        if (x2 == obj) {
                            x2 = new op10(azlVar);
                            M.R(x2);
                        }
                        final op10 op10Var = (op10) x2;
                        Object x3 = M.x();
                        if (x3 == obj) {
                            x3 = new c6j();
                            M.R(x3);
                        }
                        final c6j c6jVar = (c6j) x3;
                        Object x4 = M.x();
                        if (x4 == obj) {
                            x4 = androidx.compose.runtime.k.b(Boolean.FALSE);
                            M.R(x4);
                        }
                        final wh50 wh50Var = (wh50) x4;
                        Object x5 = M.x();
                        if (x5 == obj) {
                            x5 = new h6j(c6jVar);
                            M.R(x5);
                        }
                        final h6j h6jVar = (h6j) x5;
                        Object x6 = M.x();
                        if (x6 == obj) {
                            x6 = androidx.compose.runtime.k.a(s3q0.a, w65.e);
                            M.R(x6);
                        }
                        final wh50 wh50Var2 = (wh50) x6;
                        boolean y = M.y(op10Var) | M.o(257);
                        Object x7 = M.x();
                        if (y || x7 == obj) {
                            x7 = new cp10() { // from class: com.vk.core.compose.component.banner.VkBannerKt$VkBanner-rIlmasA$$inlined$ConstraintLayout$2
                                @Override // xsna.cp10
                                public final dp10 b(ep10 ep10Var, final List<? extends zo10> list, long j2) {
                                    final LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    wh50.this.getValue();
                                    long f = op10Var.f(j2, ep10Var.getLayoutDirection(), h6jVar, list, linkedHashMap);
                                    wh50Var.getValue();
                                    final op10 op10Var2 = op10Var;
                                    return ep10Var.Q((int) (f >> 32), (int) (f & 4294967295L), jgp.b, new izs<tra0.a, s3q0>() { // from class: com.vk.core.compose.component.banner.VkBannerKt$VkBanner-rIlmasA$$inlined$ConstraintLayout$2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // xsna.izs
                                        public final s3q0 invoke(tra0.a aVar4) {
                                            op10.this.e(aVar4, list, linkedHashMap);
                                            return s3q0.a;
                                        }
                                    });
                                }
                            };
                            M.R(x7);
                        }
                        cp10 cp10Var = (cp10) x7;
                        Object x8 = M.x();
                        if (x8 == obj) {
                            x8 = new gzs<s3q0>() { // from class: com.vk.core.compose.component.banner.VkBannerKt$VkBanner-rIlmasA$$inlined$ConstraintLayout$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // xsna.gzs
                                public final s3q0 invoke() {
                                    wh50.this.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                                    h6jVar.e = true;
                                    return s3q0.a;
                                }
                            };
                            M.R(x8);
                        }
                        final gzs gzsVar6 = (gzs) x8;
                        boolean y2 = M.y(op10Var);
                        Object x9 = M.x();
                        if (y2 || x9 == obj) {
                            x9 = new izs<tgi0, s3q0>() { // from class: com.vk.core.compose.component.banner.VkBannerKt$VkBanner-rIlmasA$$inlined$ConstraintLayout$4
                                {
                                    super(1);
                                }

                                @Override // xsna.izs
                                public final s3q0 invoke(tgi0 tgi0Var) {
                                    e4p0.a(tgi0Var, op10.this);
                                    return s3q0.a;
                                }
                            };
                            M.R(x9);
                        }
                        joy.a(egi0.b(d, false, (izs) x9), kai.c(1200550679, new wzs<androidx.compose.runtime.a, Integer, s3q0>() { // from class: com.vk.core.compose.component.banner.VkBannerKt$VkBanner-rIlmasA$$inlined$ConstraintLayout$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // xsna.wzs
                            public final s3q0 invoke(a aVar4, Integer num) {
                                wkj wkjVar;
                                int i24;
                                a.C0011a.C0012a c0012a;
                                q630.a aVar5;
                                q630 q630Var4;
                                cri.a.d dVar;
                                float f;
                                Object zdu0Var;
                                s5j s5jVar;
                                s5j s5jVar2;
                                s5j s5jVar3;
                                q630 q630Var5;
                                a aVar6 = aVar4;
                                int intValue = num.intValue();
                                if ((intValue & 3) == 2 && aVar6.e()) {
                                    aVar6.h();
                                } else {
                                    if (b.d()) {
                                        b.f(1200550679, intValue, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                    }
                                    wh50.this.setValue(s3q0.a);
                                    c6j c6jVar2 = c6jVar;
                                    int i25 = c6jVar2.b;
                                    c6jVar2.l();
                                    c6j c6jVar3 = c6jVar;
                                    aVar6.K(1243143048);
                                    c6j c6jVar4 = c6j.this;
                                    s5j j2 = c6jVar4.j();
                                    s5j j3 = c6jVar4.j();
                                    s5j j4 = c6jVar4.j();
                                    s5j j5 = c6jVar4.j();
                                    s5j j6 = c6jVar4.j();
                                    s5j j7 = c6jVar4.j();
                                    tdu0.e();
                                    lg90 lg90Var7 = lg90Var5;
                                    q630.a aVar7 = q630.a.a;
                                    a.C0011a.C0012a c0012a2 = a.C0011a.a;
                                    if (lg90Var7 == null) {
                                        aVar6.K(1243259451);
                                        aVar6.j();
                                        aVar5 = aVar7;
                                        i24 = i25;
                                        c0012a = c0012a2;
                                    } else {
                                        aVar6.K(1243259452);
                                        lg90 lg90Var8 = lg90Var5;
                                        Object x10 = aVar6.x();
                                        if (x10 == c0012a2) {
                                            x10 = vdu0.b;
                                            aVar6.R(x10);
                                        }
                                        q630 m = hr80.m(c6j.i(aVar7, j2, (izs) x10), l5g.g, e.a);
                                        Banner$BackgroundContentScale banner$BackgroundContentScale4 = banner$BackgroundContentScale3;
                                        if (b.d()) {
                                            b.f(1914558831, 48, -1, "com.vk.core.compose.component.defaults.VkBannerDefaults.backgroundImageScaleType (VkBannerDefaults.kt:270)");
                                        }
                                        int i26 = tdu0.a.$EnumSwitchMapping$2[banner$BackgroundContentScale4.ordinal()];
                                        if (i26 == 1) {
                                            wkjVar = wkj.a.b;
                                        } else {
                                            if (i26 != 2) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            wkjVar = wkj.a.a;
                                        }
                                        if (b.d()) {
                                            b.e();
                                        }
                                        i24 = i25;
                                        c0012a = c0012a2;
                                        aVar5 = aVar7;
                                        vjw.a(lg90Var8, null, m, null, wkjVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar6, 56, 104);
                                        aVar6.j();
                                    }
                                    if (lg90Var6 == null) {
                                        aVar6.K(1243954657);
                                    } else {
                                        aVar6.K(1243954658);
                                        lg90 lg90Var9 = lg90Var6;
                                        Object x11 = aVar6.x();
                                        if (x11 == c0012a) {
                                            x11 = xdu0.b;
                                            aVar6.R(x11);
                                        }
                                        q630 i27 = c6j.i(aVar5, j3, (izs) x11);
                                        dt1.a.getClass();
                                        vjw.a(lg90Var9, null, i27, dt1.a.j, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar6, 3128, 112);
                                    }
                                    aVar6.j();
                                    aVar6.K(-1622419447);
                                    if (b16Var3 != null) {
                                        float f2 = kqu0.v;
                                        if (b.d()) {
                                            b.f(89672550, 6, -1, "com.vk.core.compose.component.defaults.VkBannerDefaults.beforeMiddleGap (VkBannerDefaults.kt:140)");
                                        }
                                        if (b.d()) {
                                            b.e();
                                        }
                                        q630Var4 = s200.G(aVar5, f2, f2, f2, f2);
                                    } else {
                                        q630Var4 = aVar5;
                                    }
                                    aVar6.j();
                                    boolean J = aVar6.J(j5) | aVar6.o(banner$VerticalAlignment3.ordinal());
                                    Object x12 = aVar6.x();
                                    if (J || x12 == c0012a) {
                                        x12 = new ydu0(j5, banner$VerticalAlignment3);
                                        aVar6.R(x12);
                                    }
                                    q630 i28 = c6j.i(q630Var4, j4, (izs) x12);
                                    dt1.a.getClass();
                                    ty6 ty6Var = dt1.a.b;
                                    cp10 d2 = ja8.d(ty6Var, false);
                                    int hashCode = Long.hashCode(n34.n(aVar6));
                                    sy90 D = aVar6.D();
                                    q630 c = qri.c(aVar6, i28);
                                    cri.h7.getClass();
                                    LayoutNode.a aVar8 = cri.a.b;
                                    if (aVar6.N() == null) {
                                        n34.r();
                                        throw null;
                                    }
                                    aVar6.H();
                                    if (aVar6.L()) {
                                        aVar6.I(aVar8);
                                    } else {
                                        aVar6.f();
                                    }
                                    cri.a.c cVar = cri.a.f;
                                    k9q0.w(aVar6, d2, cVar);
                                    cri.a.e eVar = cri.a.e;
                                    k9q0.w(aVar6, D, eVar);
                                    Integer valueOf = Integer.valueOf(hashCode);
                                    cri.a.b bVar = cri.a.g;
                                    k9q0.w(aVar6, valueOf, bVar);
                                    cri.a.C2678a c2678a = cri.a.h;
                                    k9q0.t(aVar6, c2678a);
                                    cri.a.d dVar2 = cri.a.d;
                                    k9q0.w(aVar6, c, dVar2);
                                    if (b16Var3 == null) {
                                        aVar6.K(-1130636976);
                                    } else {
                                        aVar6.K(1626095825);
                                        b16Var3.a(6, aVar6);
                                    }
                                    aVar6.j();
                                    aVar6.G();
                                    float f3 = b16Var3 == null ? kqu0.v : 0;
                                    float f4 = kqu0.v;
                                    if (z06Var3 == null) {
                                        dVar = dVar2;
                                        f = f4;
                                    } else {
                                        dVar = dVar2;
                                        f = 0;
                                    }
                                    q630 G = s200.G(aVar5, f3, f4, f, f4);
                                    boolean J2 = aVar6.J(c16Var3) | aVar6.J(j7) | aVar6.J(j6) | aVar6.J(j4) | aVar6.o(banner$VerticalAlignment3.ordinal()) | aVar6.J(j5);
                                    Object x13 = aVar6.x();
                                    if (J2 || x13 == c0012a) {
                                        zdu0Var = new zdu0(c16Var3, j7, j6, j4, banner$VerticalAlignment3, j5);
                                        s5jVar = j7;
                                        s5jVar2 = j6;
                                        s5jVar3 = j5;
                                        aVar6.R(zdu0Var);
                                    } else {
                                        zdu0Var = x13;
                                        s5jVar3 = j5;
                                        s5jVar = j7;
                                        s5jVar2 = j6;
                                    }
                                    q630 i29 = c6j.i(G, s5jVar3, (izs) zdu0Var);
                                    s5j s5jVar4 = s5jVar2;
                                    cp10 d3 = ja8.d(ty6Var, false);
                                    int hashCode2 = Long.hashCode(n34.n(aVar6));
                                    sy90 D2 = aVar6.D();
                                    q630 c2 = qri.c(aVar6, i29);
                                    if (aVar6.N() == null) {
                                        n34.r();
                                        throw null;
                                    }
                                    aVar6.H();
                                    if (aVar6.L()) {
                                        aVar6.I(aVar8);
                                    } else {
                                        aVar6.f();
                                    }
                                    k9q0.w(aVar6, d3, cVar);
                                    k9q0.w(aVar6, D2, eVar);
                                    ur.d(hashCode2, aVar6, bVar, aVar6, c2678a);
                                    cri.a.d dVar3 = dVar;
                                    k9q0.w(aVar6, c2, dVar3);
                                    ((zak0) xl20Var.a).setValue(banner$BackgroundMode3);
                                    xl20Var.a(6, aVar6);
                                    aVar6.G();
                                    boolean J3 = aVar6.J(s5jVar3) | aVar6.J(c16Var3);
                                    Object x14 = aVar6.x();
                                    if (J3 || x14 == c0012a) {
                                        x14 = new aeu0(c16Var3, s5jVar3);
                                        aVar6.R(x14);
                                    }
                                    q630 i30 = c6j.i(aVar5, s5jVar, (izs) x14);
                                    cp10 d4 = ja8.d(ty6Var, false);
                                    int hashCode3 = Long.hashCode(n34.n(aVar6));
                                    sy90 D3 = aVar6.D();
                                    q630 c3 = qri.c(aVar6, i30);
                                    if (aVar6.N() == null) {
                                        n34.r();
                                        throw null;
                                    }
                                    aVar6.H();
                                    if (aVar6.L()) {
                                        aVar6.I(aVar8);
                                    } else {
                                        aVar6.f();
                                    }
                                    k9q0.w(aVar6, d4, cVar);
                                    k9q0.w(aVar6, D3, eVar);
                                    ur.d(hashCode3, aVar6, bVar, aVar6, c2678a);
                                    k9q0.w(aVar6, c3, dVar3);
                                    if (c16Var3 == null) {
                                        aVar6.K(-981992088);
                                    } else {
                                        aVar6.K(1215248825);
                                        c16Var3.a(6, aVar6);
                                    }
                                    aVar6.j();
                                    aVar6.G();
                                    aVar6.K(-1622333417);
                                    if (z06Var3 != null) {
                                        tdu0.f();
                                        if (b.d()) {
                                            b.f(-14542819, 6, -1, "com.vk.core.compose.component.defaults.VkBannerDefaults.middleAfterGap (VkBannerDefaults.kt:144)");
                                        }
                                        if (b.d()) {
                                            b.e();
                                        }
                                        q630Var5 = s200.G(aVar5, f4, f4, f4, f4);
                                    } else {
                                        q630Var5 = aVar5;
                                    }
                                    aVar6.j();
                                    boolean J4 = aVar6.J(c16Var3) | aVar6.J(s5jVar3);
                                    Object x15 = aVar6.x();
                                    if (J4 || x15 == c0012a) {
                                        x15 = new wdu0(c16Var3, s5jVar3);
                                        aVar6.R(x15);
                                    }
                                    q630 i31 = c6j.i(q630Var5, s5jVar4, (izs) x15);
                                    cp10 d5 = ja8.d(ty6Var, false);
                                    int hashCode4 = Long.hashCode(n34.n(aVar6));
                                    sy90 D4 = aVar6.D();
                                    q630 c4 = qri.c(aVar6, i31);
                                    if (aVar6.N() == null) {
                                        n34.r();
                                        throw null;
                                    }
                                    aVar6.H();
                                    if (aVar6.L()) {
                                        aVar6.I(aVar8);
                                    } else {
                                        aVar6.f();
                                    }
                                    k9q0.w(aVar6, d5, cVar);
                                    k9q0.w(aVar6, D4, eVar);
                                    ur.d(hashCode4, aVar6, bVar, aVar6, c2678a);
                                    k9q0.w(aVar6, c4, dVar3);
                                    if (z06Var3 != null) {
                                        aVar6.K(1273526354);
                                        ((zak0) z06Var3.a).setValue(banner$BackgroundMode3);
                                        z06Var3.a(6, aVar6);
                                    } else {
                                        aVar6.K(1264150683);
                                    }
                                    aVar6.j();
                                    aVar6.G();
                                    aVar6.j();
                                    if (c6jVar.b != i24) {
                                        bap.i(gzsVar6, aVar6, 6);
                                    }
                                    if (b.d()) {
                                        b.e();
                                    }
                                }
                                return s3q0.a;
                            }
                        }, M), cp10Var, M, 48, 0);
                        aVar2 = M;
                        aVar2.j();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        gzsVar2 = gzsVar4;
                        l5gVar3 = l5gVar2;
                        q630Var3 = q630Var2;
                        lg90Var3 = lg90Var5;
                        lg90Var4 = lg90Var6;
                        b16Var2 = b16Var3;
                        banner$VerticalAlignment2 = banner$VerticalAlignment3;
                        z06Var2 = z06Var3;
                        c16Var2 = c16Var3;
                        banner$BackgroundContentScale2 = banner$BackgroundContentScale3;
                        banner$BackgroundMode2 = banner$BackgroundMode3;
                    }
                    s = aVar2.s();
                    if (s == null) {
                        s.d = new wzs() { // from class: xsna.udu0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                int I = ne7.I(i | 1);
                                int I2 = ne7.I(i2);
                                beu0.a(xl20.this, q630Var3, lg90Var3, lg90Var4, l5gVar3, banner$BackgroundMode2, banner$BackgroundContentScale2, b16Var2, z06Var2, banner$VerticalAlignment2, c16Var2, gzsVar2, (androidx.compose.runtime.a) obj2, I, I2, i3);
                                return s3q0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                i12 = i11;
                i13 = i4 | 805306368;
                i14 = i3 & 1024;
                if (i14 == 0) {
                }
                i17 = i3 & 2048;
                if (i17 == 0) {
                }
                i19 = i16;
                boolean z2 = true;
                if (M.t(i13 & 1, (i13 & 306783379) == 306783378 || (i19 & 19) != 18)) {
                }
                s = aVar2.s();
                if (s == null) {
                }
            }
            l5gVar2 = l5gVar;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            i10 = i3 & 128;
            if (i10 != 0) {
            }
            i11 = i3 & 256;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i4 | 805306368;
            i14 = i3 & 1024;
            if (i14 == 0) {
            }
            i17 = i3 & 2048;
            if (i17 == 0) {
            }
            i19 = i16;
            boolean z22 = true;
            if (M.t(i13 & 1, (i13 & 306783379) == 306783378 || (i19 & 19) != 18)) {
            }
            s = aVar2.s();
            if (s == null) {
            }
        }
        q630Var2 = q630Var;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        i6 = i3 & 8;
        if (i6 == 0) {
        }
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        l5gVar2 = l5gVar;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        i10 = i3 & 128;
        if (i10 != 0) {
        }
        i11 = i3 & 256;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i4 | 805306368;
        i14 = i3 & 1024;
        if (i14 == 0) {
        }
        i17 = i3 & 2048;
        if (i17 == 0) {
        }
        i19 = i16;
        boolean z222 = true;
        if (M.t(i13 & 1, (i13 & 306783379) == 306783378 || (i19 & 19) != 18)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }
}
