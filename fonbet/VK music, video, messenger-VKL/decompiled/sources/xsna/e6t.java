package xsna;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wkj;

/* compiled from: GameAchievementsBanner.kt */
/* loaded from: classes17.dex */
public final class e6t {
    public static final ArrayList<Integer> a = e43.a(Integer.valueOf(R.drawable.vk_games_achievements_level_1), Integer.valueOf(R.drawable.vk_games_achievements_level_2), Integer.valueOf(R.drawable.vk_games_achievements_level_3), Integer.valueOf(R.drawable.vk_games_achievements_level_4), Integer.valueOf(R.drawable.vk_games_achievements_level_5));

    public static final void a(g6t g6tVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        g6t g6tVar2 = g6tVar;
        androidx.compose.runtime.a M = aVar.M(-261745146);
        int i2 = i | (M.J(g6tVar2) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-261745146, i2, -1, "com.vk.games.presentation.components.items.GameAchievementsBanner (GameAchievementsBanner.kt:41)");
            }
            uog0 b = vog0.b(kqu0.e);
            float f = 102;
            float f2 = kqu0.v;
            q630 d = rte0.d(r18.a((float) 0.5d, wlb0.h(M).getImage().a, m200.u(txj0.f(s200.E(q630Var, kqu0.w, f2), 1.0f), IntrinsicSize.Min), b), b);
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z = (i3 == 32) | (i4 == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new y4(13, izsVar, g6tVar2);
                M.R(x);
            }
            q630 c = ojc.c(d, false, null, null, (gzs) x, 15);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, c);
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
            k9q0.w(M, d2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            lg90 a2 = pg90.a(R.drawable.vk_games_achievements_background, 0, M);
            ra8 ra8Var = ra8.a;
            q630.a aVar3 = q630.a.a;
            vjw.a(a2, null, ra8Var.a(aVar3), null, wkj.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 24632, 104);
            q630 G = s200.G(txj0.f(aVar3, 1.0f), f2, f2, f, f2);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, G);
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            yqv0.c(d370.N(R.string.vk_games_my_achievements, 0, M), null, wlb0.h(M).getText().d, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).J, M, 100663296, 48, 5882);
            g6tVar2 = g6tVar;
            yqv0.c(g6tVar2.a, s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.q, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), wlb0.h(M).getText().d, null, null, 0, 0, null, 2, false, 0, 2, null, wlb0.l(M).d0, M, 100663296, 48, 5880);
            String N = d370.N(R.string.vk_games_my_achievements_details, 0, M);
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonSize buttonSize = ButtonSize.Small;
            ButtonAppearance buttonAppearance = ButtonAppearance.Overlay;
            q630 H = s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            boolean z2 = (i3 == 32) | (i4 == 4);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new cm(15, izsVar, g6tVar2);
                M.R(x2);
            }
            bhu0.e((gzs) x2, buttonSize, buttonStyle, buttonAppearance, H, null, false, false, null, null, null, N, null, null, null, null, false, null, null, null, M, X2.b.f, 0, 0, 4190176);
            M = M;
            M.G();
            ArrayList<Integer> arrayList = h6t.a;
            int i5 = g6tVar2.b;
            if (i5 < 0) {
                i5 = 0;
            } else {
                ArrayList<Integer> arrayList2 = h6t.a;
                if (i5 >= arrayList2.size()) {
                    i5 = e43.h(arrayList2);
                }
            }
            vjw.a(pg90.a(a.get(i5).intValue(), 0, M), null, ra8Var.b(txj0.q(aVar3, f), dt1.a.g), null, wkj.a.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 24632, 104);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fy7(i, 6, g6tVar2, izsVar, q630Var);
        }
    }
}
