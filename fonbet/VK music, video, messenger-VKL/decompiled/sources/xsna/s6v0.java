package xsna;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.banner.Banner$Notification$Appearance;
import com.vk.core.compose.component.banner.Banner$VerticalAlignment;
import java.util.LinkedHashMap;
import java.util.List;
import xsna.bap;
import xsna.c6j;
import xsna.cp10;
import xsna.cri;
import xsna.dp10;
import xsna.dt1;
import xsna.e4p0;
import xsna.ep10;
import xsna.f16;
import xsna.izs;
import xsna.ja8;
import xsna.jgp;
import xsna.k9q0;
import xsna.kqu0;
import xsna.n34;
import xsna.op10;
import xsna.p6v0;
import xsna.q630;
import xsna.q6v0;
import xsna.qri;
import xsna.r6v0;
import xsna.s200;
import xsna.s3q0;
import xsna.s5j;
import xsna.sy90;
import xsna.tdu0;
import xsna.tgi0;
import xsna.tra0;
import xsna.ty6;
import xsna.ur;
import xsna.wh50;
import xsna.zo10;

/* compiled from: VkNotificationBanner.kt */
/* loaded from: classes17.dex */
public final class s6v0 {
    public static final void a(final xl20 xl20Var, final Banner$Notification$Appearance banner$Notification$Appearance, final q630 q630Var, final f16 f16Var, z06 z06Var, Banner$VerticalAlignment banner$VerticalAlignment, gzs gzsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        z06 z06Var2;
        int i3;
        gzs gzsVar2;
        int i4;
        final Banner$VerticalAlignment banner$VerticalAlignment2;
        final z06 z06Var3;
        final gzs gzsVar3;
        androidx.compose.runtime.a M = aVar.M(-865543536);
        int i5 = (M.J(xl20Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i5 |= M.o(banner$Notification$Appearance.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= M.J(q630Var) ? 256 : 128;
        }
        int i6 = i5 | (M.J(f16Var) ? 2048 : 1024);
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 = i6 | 24576;
            z06Var2 = z06Var;
        } else {
            z06Var2 = z06Var;
            i3 = i6 | (M.J(z06Var2) ? 16384 : 8192);
        }
        int i8 = 196608 | i3;
        int i9 = i2 & 64;
        if (i9 != 0) {
            i4 = i3 | 1769472;
            gzsVar2 = gzsVar;
        } else {
            gzsVar2 = gzsVar;
            i4 = i8 | (M.y(gzsVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        }
        if (M.t(i4 & 1, (599187 & i4) != 599186)) {
            final z06 z06Var4 = i7 != 0 ? null : z06Var2;
            final Banner$VerticalAlignment banner$VerticalAlignment3 = Banner$VerticalAlignment.Top;
            gzs gzsVar4 = i9 != 0 ? null : gzsVar2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-865543536, i4, -1, "com.vk.core.compose.component.banner.VkNotificationBanner (VkNotificationBanner.kt:54)");
            }
            M.K(1436349443);
            int i10 = ((i4 >> 3) & 14) | 48;
            q630 a = r18.a((float) 0.5d, tdu0.b(banner$Notification$Appearance, M, i10), hr80.m(rte0.d(txj0.f(q630Var, 1.0f), tdu0.g(6)), tdu0.a(banner$Notification$Appearance, M, i10), androidx.compose.ui.graphics.e.a), tdu0.g(6));
            Object obj = a.C0011a.a;
            if (gzsVar4 != null) {
                Object x = M.x();
                if (x == obj) {
                    x = ir.h(M);
                }
                q630 g = a.g(ojc.b(q630.a.a, (sg50) x, qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 0L, false), true, new plg0(0), gzsVar4, 8));
                if (g != null) {
                    a = g;
                }
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
                x7 = new cp10() { // from class: com.vk.core.compose.component.banner.VkNotificationBannerKt$VkNotificationBanner$$inlined$ConstraintLayout$2
                    @Override // xsna.cp10
                    public final dp10 b(ep10 ep10Var, final List<? extends zo10> list, long j) {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        wh50.this.getValue();
                        long f = op10Var.f(j, ep10Var.getLayoutDirection(), h6jVar, list, linkedHashMap);
                        wh50Var.getValue();
                        final op10 op10Var2 = op10Var;
                        return ep10Var.Q((int) (f >> 32), (int) (f & 4294967295L), jgp.b, new izs<tra0.a, s3q0>() { // from class: com.vk.core.compose.component.banner.VkNotificationBannerKt$VkNotificationBanner$$inlined$ConstraintLayout$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // xsna.izs
                            public final s3q0 invoke(tra0.a aVar2) {
                                op10.this.e(aVar2, list, linkedHashMap);
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
                x8 = new gzs<s3q0>() { // from class: com.vk.core.compose.component.banner.VkNotificationBannerKt$VkNotificationBanner$$inlined$ConstraintLayout$3
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
            final gzs gzsVar5 = (gzs) x8;
            boolean y2 = M.y(op10Var);
            Object x9 = M.x();
            if (y2 || x9 == obj) {
                x9 = new izs<tgi0, s3q0>() { // from class: com.vk.core.compose.component.banner.VkNotificationBannerKt$VkNotificationBanner$$inlined$ConstraintLayout$4
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
            joy.a(egi0.b(a, false, (izs) x9), kai.c(1200550679, new wzs<androidx.compose.runtime.a, Integer, s3q0>() { // from class: com.vk.core.compose.component.banner.VkNotificationBannerKt$VkNotificationBanner$$inlined$ConstraintLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // xsna.wzs
                public final s3q0 invoke(a aVar2, Integer num) {
                    q630 q630Var2;
                    int i11;
                    cri.a.C2678a c2678a;
                    float f;
                    cri.a.d dVar;
                    int i12;
                    a aVar3 = aVar2;
                    int intValue = num.intValue();
                    if ((intValue & 3) == 2 && aVar3.e()) {
                        aVar3.h();
                    } else {
                        if (b.d()) {
                            b.f(1200550679, intValue, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                        }
                        wh50.this.setValue(s3q0.a);
                        c6j c6jVar2 = c6jVar;
                        int i13 = c6jVar2.b;
                        c6jVar2.l();
                        c6j c6jVar3 = c6jVar;
                        aVar3.K(-7521349);
                        c6j c6jVar4 = c6j.this;
                        s5j j = c6jVar4.j();
                        s5j j2 = c6jVar4.j();
                        s5j j3 = c6jVar4.j();
                        tdu0.e();
                        aVar3.K(276855976);
                        f16 f16Var2 = f16Var;
                        q630 q630Var3 = q630.a.a;
                        if (f16Var2 != null) {
                            float f2 = kqu0.v;
                            if (b.d()) {
                                b.f(89672550, 6, -1, "com.vk.core.compose.component.defaults.VkBannerDefaults.beforeMiddleGap (VkBannerDefaults.kt:140)");
                            }
                            if (b.d()) {
                                b.e();
                            }
                            q630Var2 = s200.G(q630Var3, f2, f2, f2, f2);
                        } else {
                            q630Var2 = q630Var3;
                        }
                        aVar3.j();
                        boolean J = aVar3.J(j2) | aVar3.o(banner$VerticalAlignment3.ordinal());
                        Object x10 = aVar3.x();
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (J || x10 == c0012a) {
                            x10 = new p6v0(j2, banner$VerticalAlignment3);
                            aVar3.R(x10);
                        }
                        q630 i14 = c6j.i(q630Var2, j, (izs) x10);
                        dt1.a.getClass();
                        ty6 ty6Var = dt1.a.b;
                        cp10 d = ja8.d(ty6Var, false);
                        int hashCode = Long.hashCode(n34.n(aVar3));
                        sy90 D = aVar3.D();
                        q630 c = qri.c(aVar3, i14);
                        cri.h7.getClass();
                        LayoutNode.a aVar4 = cri.a.b;
                        if (aVar3.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar3.H();
                        if (aVar3.L()) {
                            aVar3.I(aVar4);
                        } else {
                            aVar3.f();
                        }
                        cri.a.c cVar = cri.a.f;
                        k9q0.w(aVar3, d, cVar);
                        cri.a.e eVar = cri.a.e;
                        k9q0.w(aVar3, D, eVar);
                        Integer valueOf = Integer.valueOf(hashCode);
                        cri.a.b bVar = cri.a.g;
                        k9q0.w(aVar3, valueOf, bVar);
                        cri.a.C2678a c2678a2 = cri.a.h;
                        k9q0.t(aVar3, c2678a2);
                        cri.a.d dVar2 = cri.a.d;
                        k9q0.w(aVar3, c, dVar2);
                        if (f16Var == null) {
                            aVar3.K(-2017679421);
                            aVar3.j();
                            i11 = i13;
                        } else {
                            aVar3.K(-1173465090);
                            i11 = i13;
                            f16Var.a(6, aVar3);
                            aVar3.j();
                        }
                        aVar3.G();
                        float f3 = f16Var == null ? kqu0.v : 0;
                        float f4 = kqu0.v;
                        if (z06Var4 == null) {
                            c2678a = c2678a2;
                            f = f4;
                        } else {
                            c2678a = c2678a2;
                            f = 0;
                        }
                        q630 G = s200.G(q630Var3, f3, f4, f, f4);
                        boolean J2 = aVar3.J(j) | aVar3.J(j3) | aVar3.o(banner$VerticalAlignment3.ordinal()) | aVar3.J(j2);
                        Object x11 = aVar3.x();
                        if (J2 || x11 == c0012a) {
                            x11 = new q6v0(j, j3, banner$VerticalAlignment3, j2);
                            aVar3.R(x11);
                        }
                        q630 i15 = c6j.i(G, j2, (izs) x11);
                        cp10 d2 = ja8.d(ty6Var, false);
                        int hashCode2 = Long.hashCode(n34.n(aVar3));
                        sy90 D2 = aVar3.D();
                        q630 c2 = qri.c(aVar3, i15);
                        if (aVar3.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar3.H();
                        if (aVar3.L()) {
                            aVar3.I(aVar4);
                        } else {
                            aVar3.f();
                        }
                        k9q0.w(aVar3, d2, cVar);
                        k9q0.w(aVar3, D2, eVar);
                        cri.a.C2678a c2678a3 = c2678a;
                        ur.d(hashCode2, aVar3, bVar, aVar3, c2678a3);
                        k9q0.w(aVar3, c2, dVar2);
                        xl20Var.a(6, aVar3);
                        aVar3.G();
                        aVar3.K(276913752);
                        if (z06Var4 != null) {
                            tdu0.f();
                            if (b.d()) {
                                dVar = dVar2;
                                b.f(-14542819, 6, -1, "com.vk.core.compose.component.defaults.VkBannerDefaults.middleAfterGap (VkBannerDefaults.kt:144)");
                            } else {
                                dVar = dVar2;
                            }
                            if (b.d()) {
                                b.e();
                            }
                            q630Var3 = s200.G(q630Var3, f4, f4, f4, f4);
                        } else {
                            dVar = dVar2;
                        }
                        aVar3.j();
                        boolean J3 = aVar3.J(j2);
                        Object x12 = aVar3.x();
                        if (J3 || x12 == c0012a) {
                            x12 = new r6v0(j2);
                            aVar3.R(x12);
                        }
                        q630 i16 = c6j.i(q630Var3, j3, (izs) x12);
                        cp10 d3 = ja8.d(ty6Var, false);
                        int hashCode3 = Long.hashCode(n34.n(aVar3));
                        sy90 D3 = aVar3.D();
                        q630 c3 = qri.c(aVar3, i16);
                        if (aVar3.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar3.H();
                        if (aVar3.L()) {
                            aVar3.I(aVar4);
                        } else {
                            aVar3.f();
                        }
                        k9q0.w(aVar3, d3, cVar);
                        k9q0.w(aVar3, D3, eVar);
                        ur.d(hashCode3, aVar3, bVar, aVar3, c2678a3);
                        k9q0.w(aVar3, c3, dVar);
                        if (z06Var4 == null) {
                            aVar3.K(1394984107);
                            aVar3.j();
                            i12 = 6;
                        } else {
                            aVar3.K(-1340473834);
                            i12 = 6;
                            z06Var4.a(6, aVar3);
                            aVar3.j();
                        }
                        aVar3.G();
                        aVar3.j();
                        if (c6jVar.b != i11) {
                            bap.i(gzsVar5, aVar3, i12);
                        }
                        if (b.d()) {
                            b.e();
                        }
                    }
                    return s3q0.a;
                }
            }, M), cp10Var, M, 48, 0);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            banner$VerticalAlignment2 = banner$VerticalAlignment3;
            z06Var3 = z06Var4;
            gzsVar3 = gzsVar4;
        } else {
            M.h();
            banner$VerticalAlignment2 = banner$VerticalAlignment;
            z06Var3 = z06Var2;
            gzsVar3 = gzsVar2;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.o6v0
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    s6v0.a(xl20.this, banner$Notification$Appearance, q630Var, f16Var, z06Var3, banner$VerticalAlignment2, gzsVar3, (androidx.compose.runtime.a) obj2, ne7.I(i | 1), i2);
                    return s3q0.a;
                }
            };
        }
    }
}
