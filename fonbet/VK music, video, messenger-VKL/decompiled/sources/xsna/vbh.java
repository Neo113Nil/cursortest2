package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.tool.onboarding.VkOnboarding$HighlighterMarkerType;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cp8;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;
import xsna.v5v;

/* compiled from: CommunityOnboardingBanner.kt */
/* loaded from: classes17.dex */
public final class vbh {
    public static final void a(String str, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> rbhVar;
        androidx.compose.runtime.a M = aVar.M(-507298831);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-507298831, i2, -1, "com.vk.community.design.compose.onboarding.ActionButton (CommunityOnboardingBanner.kt:152)");
            }
            if (str == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    rbhVar = new a8d(str, gzsVar, i, 1);
                    s.d = rbhVar;
                }
                return;
            }
            float f = kqu0.w;
            int i3 = i2;
            bhu0.d(gzsVar, ButtonStyle.Secondary, ButtonAppearance.Neutral, ahn.E(s200.G(q630.a.a, f, kqu0.v, f, f), "community_onboarding_banner_block_action_button"), ButtonSize.Medium, null, null, cp8.d.a.a(str, null, M, (i3 & 14) | 3072, 6), false, null, M, ((i3 >> 3) & 14) | 25008, 3936);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            rbhVar = new rbh(str, gzsVar, i, 0);
            s.d = rbhVar;
        }
    }

    public static final void b(nbh nbhVar, gzs gzsVar, gzs gzsVar2, gzs gzsVar3, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-552729779);
        int i2 = i | (M.J(nbhVar) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.y(gzsVar2) ? 256 : 128) | (M.y(gzsVar3) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-552729779, i2, -1, "com.vk.community.design.compose.onboarding.CommunityOnboardingBanner (CommunityOnboardingBanner.kt:50)");
            }
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new k3(1, gzsVar);
                M.R(x);
            }
            q630 c = ojc.c(q630Var, false, null, null, (gzs) x, 15);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, c);
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
            k9q0.w(M, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630.a aVar4 = q630.a.a;
            q630 c3 = qri.c(M, aVar4);
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
            k9q0.w(M, c3, dVar);
            c(nbhVar.a, gzsVar3, M, (i2 >> 6) & 112);
            q630 E = ahn.E(s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, s200.H(txj0.f(aVar4, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.r, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13)), "community_onboarding_banner_block_subtitle");
            String str = nbhVar.b;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.d0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str, E, ylu0Var.getText().p, null, null, q7z.c, 0, null, 0, false, 0, 0, null, frv0Var, M, 196608, 0, 8152);
            aVar2 = M;
            a(nbhVar.c, gzsVar2, aVar2, (i2 >> 3) & 112);
            aVar2.G();
            aVar2.K(-1879023301);
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
            s.d = new qbh(nbhVar, gzsVar, gzsVar2, gzsVar3, q630Var, i);
        }
    }

    public static final void c(String str, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        int i3;
        int i4;
        androidx.compose.runtime.a M = aVar.M(-1342182571);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1342182571, i2, -1, "com.vk.community.design.compose.onboarding.HighlightedHeader (CommunityOnboardingBanner.kt:101)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                bpn0 bpn0Var = v5v.c;
                x = v5v.a.a(str);
                M.R(x);
            }
            v5v v5vVar = (v5v) x;
            q630 H = s200.H(s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630.a.a, 1.0f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            ty6.b bVar = dt1.a.k;
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, bVar, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf, bVar2);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            int i5 = i2;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f, true);
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, xpyVar);
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
            k9q0.w(M, d, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar2, M, c2678a);
            k9q0.w(M, c2, dVar);
            d8v0.a(v5vVar.b, null, VkOnboarding$HighlighterMarkerType.Type1, VkOnboarding$TintColor.Lime, true, false, false, null, kai.c(1827671279, new sbh(v5vVar, 0), M), M, 805334400, 482);
            M.G();
            q630 H2 = s200.H(new gor0(bVar), kqu0.t, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            boolean z = (i5 & 112) == 32;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                i3 = 0;
                x2 = new tbh(gzsVar, 0);
                M.R(x2);
            } else {
                i3 = 0;
            }
            q630 E = ahn.E(ojc.c(H2, false, null, null, (gzs) x2, 15), "community_onboarding_banner_block_close_icon");
            if (androidx.compose.runtime.b.d()) {
                i4 = -1;
                androidx.compose.runtime.b.f(-2029247040, i3, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Dismiss28> (VkSdkIcons.kt:652)");
            } else {
                i4 = -1;
            }
            lg90 a2 = pg90.a(R.drawable.vk_icon_dismiss_28, i3, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, i3, i4, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(a2, null, E, ylu0Var.getIcon().f, M, 56, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            i3 = 0;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ubh(str, gzsVar, i, i3);
        }
    }
}
