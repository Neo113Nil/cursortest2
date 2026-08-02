package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.SexyCell$Size;
import com.vk.core.compose.component.cell.content.a1;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.tool.compose.blur.GradientDirection;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.yk8;

/* compiled from: GameFeatureBannerLego.kt */
/* loaded from: classes17.dex */
public final class a7t {
    public static final void a(l6t l6tVar, izs izsVar, k6t k6tVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        izs izsVar2;
        k6t k6tVar2;
        int i2 = k6tVar.c;
        androidx.compose.runtime.a M = aVar.M(1115700304);
        int i3 = i | (M.J(l6tVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(k6tVar) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024);
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1115700304, i3, -1, "com.vk.games.presentation.components.lego_items.GameFeatureBannerLego (GameFeatureBannerLego.kt:61)");
            }
            uog0 b = vog0.b(16);
            rv5 c = lv5.c(M);
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 1, q630Var);
            b7t b7tVar = k6tVar.b;
            q630 s = txj0.s(F, b7tVar.a, b7tVar.b);
            float f = 1;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 d = rte0.d(r18.a(f, ylu0Var.getImage().a, s, b), b);
            int i4 = i3 & 112;
            int i5 = i3 & 14;
            int i6 = i3 & 896;
            boolean z = (i4 == 32) | (i5 == 4) | (i6 == 256);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new lza(izsVar, l6tVar, k6tVar, 4);
                M.R(x);
            }
            q630 E = ahn.E(ojc.c(d, false, null, null, (gzs) x, 15), "horizontalBannerFeaturingItem_" + i2);
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.i;
            cp10 d2 = ja8.d(ty6Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, E);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            lg90 l = fwu0.l(null, l6tVar.g, null, null, M, 0, 61);
            q630.a aVar3 = q630.a.a;
            vjw.a(l, null, ahn.E(lv5.b(txj0.d(aVar3, 1.0f), c, 0L, 6), "horizontalBannerFeaturingImageItem_" + i2), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 56, 120);
            q630 c3 = txj0.c(txj0.f(aVar3, 1.0f), 0.6666667f);
            GradientDirection gradientDirection = GradientDirection.TopBottom;
            long j = l5g.j;
            l5g l5gVar = new l5g(j);
            long j2 = l5g.b;
            f9t.e(lv5.a(ra8.a.b(c3, ty6Var), c, 20, gradientDirection, yk8.a.g(e43.l(l5gVar, new l5g(l5g.c(14, j2, 0.4f))), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), yk8.a.g(e43.l(new l5g(j), new l5g(l5g.c(14, j2, 0.4f))), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 4), M, 0);
            String str = l6tVar.e;
            String str2 = l6tVar.f;
            String str3 = l6tVar.h;
            boolean z2 = (i5 == 4) | (i4 == 32) | (i6 == 256);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                izsVar2 = izsVar;
                k6tVar2 = k6tVar;
                x2 = new defpackage.c0(izsVar2, l6tVar, k6tVar2, 4);
                M.R(x2);
            } else {
                izsVar2 = izsVar;
                k6tVar2 = k6tVar;
            }
            b(0, M, str, str2, str3, (gzs) x2, null);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            izsVar2 = izsVar;
            k6tVar2 = k6tVar;
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new j3m(l6tVar, izsVar2, k6tVar2, q630Var, i);
        }
    }

    public static final void b(final int i, androidx.compose.runtime.a aVar, final String str, final String str2, final String str3, final gzs gzsVar, q630 q630Var) {
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        int i2;
        gzs gzsVar2;
        q630.a aVar3;
        androidx.compose.runtime.a M = aVar.M(-239730409);
        int i3 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | 384 | (M.J(str3) ? 2048 : 1024) | (M.y(gzsVar) ? 16384 : 8192);
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-239730409, i3, -1, "com.vk.games.presentation.components.lego_items.GameInformationColumnLego (GameFeatureBannerLego.kt:146)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.i.a(0);
                M.R(x);
            }
            final rg50 rg50Var = (rg50) x;
            q630.a aVar4 = q630.a.a;
            q630 H = s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 7);
            dt1.a.getClass();
            float f = 8;
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(f), dt1.a.m, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f, true);
            SexyCell$Size sexyCell$Size = SexyCell$Size.Medium;
            jai c2 = kai.c(-482372079, new zzs() { // from class: xsna.y6t
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if (aVar6.t(intValue & 1, (intValue & 129) != 128)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-482372079, intValue, -1, "com.vk.games.presentation.components.lego_items.GameInformationColumnLego.<anonymous>.<anonymous> (GameFeatureBannerLego.kt:160)");
                        }
                        a.m mVar = androidx.compose.foundation.layout.a.c;
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar6, 0);
                        int hashCode2 = Long.hashCode(n34.n(aVar6));
                        sy90 D2 = aVar6.D();
                        q630 c3 = qri.c(aVar6, q630.a.a);
                        cri.h7.getClass();
                        LayoutNode.a aVar7 = cri.a.b;
                        if (aVar6.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar6.H();
                        if (aVar6.L()) {
                            aVar6.I(aVar7);
                        } else {
                            aVar6.f();
                        }
                        k9q0.w(aVar6, a2, cri.a.f);
                        k9q0.w(aVar6, D2, cri.a.e);
                        k9q0.w(aVar6, Integer.valueOf(hashCode2), cri.a.g);
                        k9q0.t(aVar6, cri.a.h);
                        k9q0.w(aVar6, c3, cri.a.d);
                        us2 b = ws2.b(str, aVar6, 0);
                        frv0 frv0Var = wlb0.l(aVar6).b1;
                        long j = wlb0.h(aVar6).getText().d;
                        Object x2 = aVar6.x();
                        a.C0011a.C0012a c0012a2 = a.C0011a.a;
                        rg50 rg50Var2 = rg50Var;
                        if (x2 == c0012a2) {
                            x2 = new g1j(rg50Var2, 11);
                            aVar6.R(x2);
                        }
                        ntu0.c(b, null, frv0Var, j, 2, false, false, false, null, 0, null, 0, (izs) x2, aVar6, 24576, 384, 4066);
                        ntu0.c(ws2.b(str2, aVar6, 0), null, wlb0.l(aVar6).Y, l5g.c(14, wlb0.h(aVar6).getText().d, 0.5f), rg50Var2.getIntValue() >= 2 ? 1 : 2, false, false, false, null, 0, null, 0, null, aVar6, 0, 0, 8162);
                        aVar6.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar6.h();
                    }
                    return s3q0.a;
                }
            }, M);
            if (androidx.compose.runtime.b.d()) {
                i2 = -1;
                androidx.compose.runtime.b.f(-152959023, 54, -1, "com.vk.core.compose.component.cell.content.SexyCell.Middle.Slot.Companion.invoke (SexyCell.kt:239)");
            } else {
                i2 = -1;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-816353401, 54, i2, "com.vk.core.compose.component.cell.content.remember (SexyMiddleSlotImpl.kt:25)");
            }
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new com.vk.core.compose.component.cell.content.e1(c2);
                M.R(x2);
            }
            com.vk.core.compose.component.cell.content.e1 e1Var = (com.vk.core.compose.component.cell.content.e1) x2;
            ((zak0) e1Var.a).setValue(c2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            mjv0.a(xpyVar, a1.b.a(null, null, null, null, e1Var, null, null, null, null, M, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS), null, null, sexyCell$Size, null, false, null, null, M, 24576, 492);
            if (str3 == null) {
                M.K(-1985977762);
                M.j();
                aVar2 = M;
                aVar3 = aVar4;
            } else {
                M.K(-1985977761);
                if (gzsVar == null) {
                    M.K(-1290897969);
                    Object x3 = M.x();
                    if (x3 == c0012a) {
                        x3 = new re0(15);
                        M.R(x3);
                    }
                    gzsVar2 = (gzs) x3;
                    M.j();
                } else {
                    M.K(1066736260);
                    M.j();
                    gzsVar2 = gzsVar;
                }
                aVar3 = aVar4;
                bhu0.e(gzsVar2, ButtonSize.Medium, ButtonStyle.Primary, ButtonAppearance.Overlay, s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16, f, 3), null, false, false, null, null, null, str3, null, null, null, null, false, null, null, null, M, 28080, 0, 0, 4190176);
                aVar2 = M;
                aVar2.j();
            }
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(i, str, str2, str3, gzsVar, q630Var2) { // from class: xsna.z6t
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ String e;
                public final /* synthetic */ gzs f;

                {
                    this.b = str;
                    this.c = str2;
                    this.d = q630Var2;
                    this.e = str3;
                    this.f = gzsVar;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a7t.b(ne7.I(1), (androidx.compose.runtime.a) obj, this.b, this.c, this.e, this.f, this.d);
                    return s3q0.a;
                }
            };
        }
    }
}
