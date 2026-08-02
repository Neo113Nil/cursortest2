package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: GameFeatureBanner.kt */
/* loaded from: classes17.dex */
public final class x6t {
    public static final void a(l6t l6tVar, izs izsVar, k6t k6tVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        izs izsVar2;
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        k6t k6tVar2 = k6tVar;
        boolean z = k6tVar2.a;
        int i2 = k6tVar2.c;
        b7t b7tVar = k6tVar2.b;
        androidx.compose.runtime.a M = aVar.M(273470500);
        int i3 = i | (M.J(l6tVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(k6tVar2) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024);
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(273470500, i3, -1, "com.vk.games.presentation.components.items.GameFeatureBanner (GameFeatureBanner.kt:68)");
            }
            uog0 b = vog0.b(kqu0.f);
            q630 s = txj0.s(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 1, q630Var), b7tVar.a, b7tVar.b);
            float f = (float) 0.5d;
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
            boolean z2 = (i4 == 32) | (i5 == 4) | (i6 == 256);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new mi1(izsVar, l6tVar, k6tVar2, 3);
                M.R(x);
            }
            q630 E = ahn.E(ojc.c(d, false, null, null, (gzs) x, 15), "horizontalBannerFeaturingItem_" + i2);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.i, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            k9q0.w(M, d2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            c(b7tVar.c, i2, 0, M, l6tVar.g);
            q630.a aVar4 = q630.a.a;
            q630 f2 = txj0.f(aVar4, 1.0f);
            float f3 = kqu0.v;
            q630 H = s200.H(f2, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, f3, 2);
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g, dt1.a.m, M, 54);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, H);
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
            k9q0.w(M, a, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            b(z, l6tVar, new xpy(1.0f, true), M, (i3 << 3) & 112);
            if (l6tVar.h != null) {
                M.K(-1514119021);
                String str = l6tVar.h;
                q630 H2 = s200.H(aVar4, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                ButtonStyle buttonStyle = ButtonStyle.Primary;
                ButtonSize buttonSize = z ? ButtonSize.Medium : ButtonSize.Small;
                ButtonAppearance buttonAppearance = ButtonAppearance.Overlay;
                boolean z3 = (i4 == 32) | (i5 == 4) | (i6 == 256);
                Object x2 = M.x();
                if (z3 || x2 == c0012a) {
                    izsVar2 = izsVar;
                    q630Var2 = H2;
                    k6tVar2 = k6tVar;
                    x2 = new defpackage.w(izsVar2, l6tVar, k6tVar2, 2);
                    M.R(x2);
                } else {
                    izsVar2 = izsVar;
                    q630Var2 = H2;
                    k6tVar2 = k6tVar;
                }
                bhu0.e((gzs) x2, buttonSize, buttonStyle, buttonAppearance, q630Var2, null, false, false, null, null, null, str, null, null, null, null, false, null, null, null, M, 3456, 0, 0, 4190176);
                aVar2 = M;
            } else {
                izsVar2 = izsVar;
                k6tVar2 = k6tVar;
                aVar2 = M;
                aVar2.K(-1518723544);
            }
            aVar2.j();
            if (kr.f(aVar2)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            izsVar2 = izsVar;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s2 = aVar2.s();
        if (s2 != null) {
            s2.d = new iga(l6tVar, izsVar2, k6tVar2, q630Var, i);
        }
    }

    public static final void b(final boolean z, final l6t l6tVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        frv0 frv0Var;
        frv0 frv0Var2;
        androidx.compose.runtime.a M = aVar.M(1884232881);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(l6tVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1884232881, i2, -1, "com.vk.games.presentation.components.items.GameInformationColumn (GameFeatureBanner.kt:175)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.i.a(0);
                M.R(x);
            }
            rg50 rg50Var = (rg50) x;
            a.l lVar = androidx.compose.foundation.layout.a.a;
            a.j g = androidx.compose.foundation.layout.a.g(kqu0.q);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 0);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            String str = l6tVar.e;
            if (z) {
                M.K(197585889);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0Var = wuv0Var.z;
            } else {
                M.K(197586888);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0Var = wuv0Var2.h0;
            }
            M.j();
            frv0 frv0Var3 = frv0Var;
            long j = wlb0.h(M).getText().d;
            v4j0 c2 = wlb0.k(M).c(M);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new cvh(rg50Var, 11);
                M.R(x2);
            }
            yqv0.c(str, null, j, null, c2, 0, 0, null, 2, false, 0, 2, (izs) x2, frv0Var3, M, 100663296, Tensorflow.FRAME_WIDTH, 1770);
            String str2 = l6tVar.f;
            if (z) {
                M.K(197599231);
                frv0Var2 = wlb0.l(M).T;
            } else {
                M.K(197600163);
                frv0Var2 = wlb0.l(M).i0;
            }
            M.j();
            aVar2 = M;
            yqv0.c(str2, null, wlb0.h(M).getText().d, null, wlb0.k(M).c(M), 0, 0, null, 2, false, 0, rg50Var.getIntValue() >= 2 ? 1 : 2, null, frv0Var2, aVar2, 100663296, 0, 5866);
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
            s.d = new wzs() { // from class: xsna.w6t
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    x6t.b(z, l6tVar, q630Var, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final float f, final int i, final int i2, androidx.compose.runtime.a aVar, String str) {
        final String str2;
        androidx.compose.runtime.a M = aVar.M(1383838291);
        int i3 = (M.J(str) ? 4 : 2) | i2 | (M.n(f) ? 32 : 16) | (M.o(i) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1383838291, i3, -1, "com.vk.games.presentation.components.items.GradientImageView (GameFeatureBanner.kt:144)");
            }
            lg90 l = fwu0.l(null, str, null, null, M, (i3 << 3) & 112, 61);
            q630.a aVar2 = q630.a.a;
            str2 = str;
            vjw.a(l, null, ahn.E(txj0.d(aVar2, 1.0f), "horizontalBannerFeaturingImageItem_" + i), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 56, 120);
            q630 h = txj0.h(txj0.f(aVar2, 1.0f), f);
            long j = l5g.b;
            f9t.e(hr80.l(h, new y7z(e43.l(new l5g(l5g.c(14, j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), new l5g(l5g.c(14, j, 0.4f))), null, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(100.0f) & 4294967295L), 0), null, 6), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            str2 = str;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(f, i, i2, str2) { // from class: xsna.v6t
                public final /* synthetic */ String b;
                public final /* synthetic */ float c;
                public final /* synthetic */ int d;

                {
                    this.b = str2;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    x6t.c(this.c, this.d, I, (androidx.compose.runtime.a) obj, this.b);
                    return s3q0.a;
                }
            };
        }
    }
}
