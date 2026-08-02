package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import java.util.Iterator;
import xsna.cri;
import xsna.dt1;
import xsna.pox0;
import xsna.q630;

/* compiled from: WidgetMatches.kt */
/* loaded from: classes17.dex */
public final class mnx0 {
    public static final void a(pox0.e.a aVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(1506223237);
        int i2 = (M.J(aVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1506223237, i2, -1, "com.vk.community.design.compose.widget.matches.Match (WidgetMatches.kt:50)");
            }
            q630.a aVar3 = q630.a.a;
            q630 H = s200.H(s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar3, 1.0f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            q630 f = txj0.f(aVar3, 1.0f);
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.k, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, f);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            d(aVar.a, M, 6);
            c(aVar.d, M, 0);
            e(aVar.b, M, 6);
            M.G();
            b(aVar.c, M, 0);
            if (aVar.e) {
                M.K(1958218514);
                ijv0.c(SeparatorDpi.At1x, SeparatorAppearance.Primary, null, M, 54, 4);
            } else {
                M.K(1955659495);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new z77(aVar, i, 17);
        }
    }

    public static final void b(String str, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(43767878);
        int i2 = i | (M.J(str) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(43767878, i2, -1, "com.vk.community.design.compose.widget.matches.MatchTime (WidgetMatches.kt:140)");
            }
            float f = kqu0.b;
            q630 G = s200.G(txj0.f(q630.a.a, 1.0f), f, 4, f, 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.m0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str, G, ylu0Var.getText().p, null, null, 0, 3, null, 0, false, 0, 0, null, frv0Var, M, i2 & 14, 0, 8120);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new w61(str, i, 18);
        }
    }

    public static final void c(String str, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1800866549);
        int i2 = i | (M.J(str) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1800866549, i2, -1, "com.vk.community.design.compose.widget.matches.ScoreBadge (WidgetMatches.kt:76)");
            }
            rnu0.c(ContentBadgeSize.Large, ContentBadgeMode.Secondary, ContentBadgeAppearance.Design.Neutral, null, null, null, str, null, null, null, false, null, false, null, M, ((i2 << 18) & 3670016) | 438, 0, 16312);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qna0(str, i);
        }
    }

    public static final void d(pox0.e.a.C3525a c3525a, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1185513048);
        int i2 = (M.J(c3525a) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1185513048, i2, -1, "com.vk.community.design.compose.widget.matches.TeamA (WidgetMatches.kt:86)");
            }
            f(54, M, kai.c(-1622750740, new b86(c3525a, 3), M));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new u61(c3525a, i, 15);
        }
    }

    public static final void e(pox0.e.a.C3525a c3525a, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1901536073);
        int i2 = (M.J(c3525a) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1901536073, i2, -1, "com.vk.community.design.compose.widget.matches.TeamB (WidgetMatches.kt:94)");
            }
            f(54, M, kai.c(-414832565, new ua30(c3525a, 4), M));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new z76(c3525a, i, 9);
        }
    }

    public static final void f(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        androidx.compose.runtime.a M = aVar.M(-1237284582);
        if (M.t(i & 1, (i & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1237284582, i, -1, "com.vk.community.design.compose.widget.matches.TeamCell (WidgetMatches.kt:104)");
            }
            q630 E = s200.E(q630.a.a, kqu0.b, kqu0.r);
            tpg0 tpg0Var = tpg0.a;
            q630 b = tpg0Var.b(1.0f, E, true);
            a.j g = androidx.compose.foundation.layout.a.g(4);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(g, dt1.a.k, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            jaiVar.invoke(tpg0Var, M, 54);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new esk(i, jaiVar);
        }
    }

    public static final void g(String str, androidx.compose.runtime.a aVar, int i) {
        String str2;
        androidx.compose.runtime.a M = aVar.M(739140198);
        int i2 = (M.J(str) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(739140198, i2, -1, "com.vk.community.design.compose.widget.matches.TeamIcon (WidgetMatches.kt:130)");
            }
            q630 q = txj0.q(q630.a.a, 20);
            lg90 l = fwu0.l(str, null, null, null, M, i2 & 14, 62);
            str2 = str;
            pzu0.b(l, null, q, l5g.k, M, 3512, 0);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            str2 = str;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new c6p(str2, i);
        }
    }

    public static final void h(spg0 spg0Var, String str, int i, androidx.compose.runtime.a aVar, int i2) {
        int i3;
        String str2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(456978824);
        if ((i2 & 6) == 0) {
            i3 = (M.J(spg0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            str2 = str;
            i3 |= M.J(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.o(i) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(456978824, i3, -1, "com.vk.community.design.compose.widget.matches.TeamName (WidgetMatches.kt:119)");
            }
            q630 b = spg0Var.b(1.0f, q630.a.a, true);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.X;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(str2, b, ylu0Var.getText().m, null, null, 0, i, null, 0, false, 0, 0, null, frv0Var, aVar2, ((i3 >> 3) & 14) | ((i3 << 12) & 3670016), 0, 8120);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new rm7(i, i2, 2, spg0Var, str);
        }
    }

    public static final void i(pox0.e eVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1660460949);
        int i2 = (M.J(eVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1660460949, i2, -1, "com.vk.community.design.compose.widget.matches.WidgetMatches (WidgetMatches.kt:41)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c = qri.c(M, aVar2);
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
            M.K(1823046486);
            Iterator<T> it = eVar.b.iterator();
            while (it.hasNext()) {
                a((pox0.e.a) it.next(), M, 0);
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ke4(eVar, q630Var, i, 8);
        }
    }
}
