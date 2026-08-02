package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;
import xsna.yjq0;

/* compiled from: UserProfileEditor.kt */
/* loaded from: classes5.dex */
public final class yoq0 {
    public static final void a(yjq0.f fVar, gzs gzsVar, gzs gzsVar2, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        int i3;
        cri.a.e eVar;
        yjq0.f fVar2 = fVar;
        androidx.compose.runtime.a M = aVar.M(737369641);
        if ((i & 6) == 0) {
            i2 = (M.J(fVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gzsVar2) ? 256 : 128;
        }
        int i4 = i2 | 3072;
        if (M.t(i4 & 1, (i4 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(737369641, i4, -1, "com.vk.profile.design.compose.ProfileUpdateBanner (UserProfileEditor.kt:39)");
            }
            float f = 16;
            float f2 = 12;
            q630.a aVar3 = q630.a.a;
            q630 E = ahn.E(s200.E(aVar3, f, f2), "edit_profile_banner");
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.b;
            cp10 d = ja8.d(ty6Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            k9q0.w(M, d, cVar);
            cri.a.e eVar2 = cri.a.e;
            k9q0.w(M, D, eVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            long j = wlb0.h(M).getBackground().p;
            ty6 ty6Var2 = dt1.a.c;
            ra8 ra8Var = ra8.a;
            q630 s = txj0.s(kci.m(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -8, 1, ra8Var.b(aVar3, ty6Var2)), 24, f2);
            boolean p = M.p(j);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (p || x == c0012a) {
                x = new saw(j, 1);
                M.R(x);
            }
            ja8.a(bu00.c(s, (izs) x), M, 0);
            q630 m = hr80.m(txj0.f(aVar3, 1.0f), wlb0.h(M).getBackground().p, vog0.b(f2));
            cp10 d2 = ja8.d(ty6Var, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, m);
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
            k9q0.w(M, d2, cVar);
            k9q0.w(M, D2, eVar2);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            if (androidx.compose.runtime.b.d()) {
                i3 = 0;
                androidx.compose.runtime.b.f(-1589335940, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel20> (VkSdkIcons.kt:216)");
            } else {
                i3 = 0;
            }
            lg90 b = or.b(M, -187349011, R.drawable.vk_icon_cancel_20, M, i3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N = d370.N(R.string.user_profile_accessibility_close, i3, M);
            long j2 = wlb0.h(M).getIcon().l;
            float f3 = 20;
            q630 E2 = ahn.E(txj0.v(txj0.h(s200.D(ra8Var.b(aVar3, dt1.a.d), 10), f3), f3), "close_banner_button");
            boolean z = (i4 & 112) == 32;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                eVar = eVar2;
                x2 = new jz20(1, gzsVar);
                M.R(x2);
            } else {
                eVar = eVar2;
            }
            cri.a.e eVar3 = eVar;
            q630Var2 = aVar3;
            nzu0.c((gzs) x2, b, N, E2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j2, false, null, false, null, null, M, 64, 2000);
            ty6.a aVar5 = dt1.a.o;
            q630 f4 = txj0.f(q630Var2, 1.0f);
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, aVar5, M, 48);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, f4);
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
            k9q0.w(M, a, cVar);
            k9q0.w(M, D3, eVar3);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            fVar2 = fVar;
            float f5 = 32;
            yqv0.c(fVar2.b, s200.G(txj0.f(q630Var2, 1.0f), f5, f2, f5, f), wlb0.h(M).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).h0, M, 0, 0, 8120);
            String str = fVar2.c;
            ButtonSize buttonSize = ButtonSize.Small;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Overlay;
            q630 E3 = ahn.E(q630Var2, "banner_button");
            boolean z2 = (i4 & 896) == 256;
            Object x3 = M.x();
            if (z2 || x3 == c0012a) {
                x3 = new xoq0(0, gzsVar2);
                M.R(x3);
            }
            bhu0.e((gzs) x3, buttonSize, buttonStyle, buttonAppearance, E3, null, false, false, null, null, null, str, null, null, null, null, false, null, null, null, M, 28080, 0, 0, 4190176);
            aVar2 = M;
            f9t.e(txj0.h(q630Var2, f2), aVar2, 6);
            aVar2.G();
            aVar2.G();
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s2 = aVar2.s();
        if (s2 != null) {
            s2.d = new gw9(i, 4, fVar2, gzsVar, gzsVar2, q630Var2);
        }
    }
}
