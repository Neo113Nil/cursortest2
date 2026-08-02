package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: InviteFriendsTopBar.kt */
/* loaded from: classes14.dex */
public final class ksx {
    public static final void a(String str, q630 q630Var, String str2, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-589496732);
        int i2 = i | (M.J(str) ? 4 : 2) | 48 | (M.J(str2) ? 256 : 128) | (M.y(izsVar) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-589496732, i2, -1, "com.vk.friends.groupinvite.impl.ui.MainTopBar (InviteFriendsTopBar.kt:32)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar3 = q630.a.a;
            q630 c = qri.c(M, aVar3);
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
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(str, null, null, null, null, M, (i2 & 14) | 196608, 30), null, null, null, M, 14);
            String N = d370.N(R.string.accessibility_close, 0, M);
            int i3 = i2 & 7168;
            boolean z = i3 == 2048;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new m87(izsVar, 3);
                M.R(x);
            }
            muv0.h(a2, null, null, null, null, TopBar$Before.d.a.a(N, (gzs) x, null, null, M, 24576, 12), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8158);
            float f = 16;
            float f2 = 8;
            q630 H = s200.H(aVar3, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2, 2);
            boolean z2 = i3 == 2048;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new o87(izsVar, 4);
                M.R(x2);
            }
            q630 c2 = ojc.c(H, false, null, null, (gzs) x2, 15);
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, c2);
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
            k9q0.w(M, d, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            q630 H2 = s200.H(ahn.E(aVar3, "SEARCH_FIELD"), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            tho0 tho0Var = new tho0(str2, 0L, 6);
            boolean z3 = i3 == 2048;
            Object x3 = M.x();
            if (z3 || x3 == c0012a) {
                x3 = new mse(izsVar, 2);
                M.R(x3);
            }
            gzs gzsVar = (gzs) x3;
            boolean z4 = i3 == 2048;
            Object x4 = M.x();
            if (z4 || x4 == c0012a) {
                x4 = new nse(izsVar, 3);
                M.R(x4);
            }
            gzs gzsVar2 = (gzs) x4;
            boolean z5 = i3 == 2048;
            Object x5 = M.x();
            if (z5 || x5 == c0012a) {
                x5 = new ln7(izsVar, 5);
                M.R(x5);
            }
            gzs gzsVar3 = (gzs) x5;
            boolean z6 = i3 == 2048;
            Object x6 = M.x();
            if (z6 || x6 == c0012a) {
                x6 = new pse(izsVar, 1);
                M.R(x6);
            }
            aVar2 = M;
            trx.a(tho0Var, gzsVar, H2, true, false, gzsVar2, gzsVar3, (izs) x6, aVar2, 3456, 16);
            if (kr.f(aVar2)) {
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
            s.d = new eet(str, q630Var2, str2, izsVar, i);
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, String str, izs izsVar, q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(787493352);
        int i2 = i | (M.J(q630Var) ? 4 : 2) | (M.J(str) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(787493352, i2, -1, "com.vk.friends.groupinvite.impl.ui.SearchTopBar (InviteFriendsTopBar.kt:87)");
            }
            q630.a aVar2 = q630.a.a;
            q630 g = q630Var.g(s200.E(aVar2, 16, 8));
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, g);
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
            q630 E = ahn.E(aVar2, "TOP_BAR_BACK");
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new ddn(izsVar, 2);
                M.R(x);
            }
            q630 c2 = ojc.c(E, false, null, null, (gzs) x, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(b, d370.N(R.string.accessibility_back, 0, M), c2, ylu0Var.getIcon().a, M, 8, 0);
            q630 H = s200.H(aVar2, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            int length = str.length();
            tho0 tho0Var = new tho0(str, jgz.c(length, length), 4);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new ob0(16);
                M.R(x2);
            }
            gzs gzsVar = (gzs) x2;
            boolean z2 = i3 == 256;
            Object x3 = M.x();
            if (z2 || x3 == c0012a) {
                x3 = new nhf(izsVar, 3);
                M.R(x3);
            }
            gzs gzsVar2 = (gzs) x3;
            boolean z3 = i3 == 256;
            Object x4 = M.x();
            if (z3 || x4 == c0012a) {
                x4 = new f3(izsVar, 5);
                M.R(x4);
            }
            gzs gzsVar3 = (gzs) x4;
            boolean z4 = i3 == 256;
            Object x5 = M.x();
            if (z4 || x5 == c0012a) {
                x5 = new oyg(izsVar, 2);
                M.R(x5);
            }
            M = M;
            trx.a(tho0Var, gzsVar, H, false, true, gzsVar2, gzsVar3, (izs) x5, M, 28080, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new cr3(q630Var, str, izsVar, i, 2);
        }
    }
}
