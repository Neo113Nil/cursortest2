package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;
import xsna.u700;

/* compiled from: GamesCatalogInternetErrorContent.kt */
/* loaded from: classes17.dex */
public final class fct {
    public static final float a = 12;
    public static final float b = 8;
    public static final float c = 32;
    public static final float d = 56;

    public static final void a(int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var) {
        int i2;
        q630 q630Var2;
        LayoutNode.a aVar2;
        cri.a.c cVar;
        q630.a aVar3;
        cri.a.d dVar;
        ty6.a aVar4;
        ty6.b bVar;
        cri.a.e eVar;
        int i3;
        cri.a.C2678a c2678a;
        cri.a.b bVar2;
        gzs gzsVar2 = gzsVar;
        androidx.compose.runtime.a M = aVar.M(1638472284);
        if ((i & 6) == 0) {
            i2 = i | (M.y(gzsVar2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1638472284, i2, -1, "com.vk.games.presentation.components.GamesCatalogInternetErrorContent (GamesCatalogInternetErrorContent.kt:37)");
            }
            t700 c2 = guf0.c(new u700.e(wlb0.h(M).s() ? R.raw.vk_antenna_light_56 : R.raw.vk_antenna_dark_56), M, 0);
            boolean e = vbh0.e(M);
            q630 D = s200.D(q630Var, c);
            dt1.a.getClass();
            ty6.a aVar5 = dt1.a.o;
            a.l lVar = androidx.compose.foundation.layout.a.a;
            ty6.b bVar3 = dt1.a.l;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.i(a, bVar3), aVar5, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, D);
            cri.h7.getClass();
            int i4 = i2;
            LayoutNode.a aVar6 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar6);
            } else {
                M.f();
            }
            cri.a.c cVar2 = cri.a.f;
            k9q0.w(M, a2, cVar2);
            cri.a.e eVar2 = cri.a.e;
            k9q0.w(M, D2, eVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar4 = cri.a.g;
            k9q0.w(M, valueOf, bVar4);
            cri.a.C2678a c2678a2 = cri.a.h;
            k9q0.t(M, c2678a2);
            cri.a.d dVar2 = cri.a.d;
            k9q0.w(M, c3, dVar2);
            q630.a aVar7 = q630.a.a;
            if (e) {
                M.K(78499233);
                q630 q = txj0.q(aVar7, d);
                cp10 d2 = ja8.d(dt1.a.b, false);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D3 = M.D();
                q630 c4 = qri.c(M, q);
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar6);
                } else {
                    M.f();
                }
                k9q0.w(M, d2, cVar2);
                k9q0.w(M, D3, eVar2);
                ur.d(hashCode2, M, bVar4, M, c2678a2);
                k9q0.w(M, c4, dVar2);
                i700 i700Var = (i700) c2.getValue();
                i3 = 54;
                aVar2 = aVar6;
                aVar4 = aVar5;
                eVar = eVar2;
                dVar = dVar2;
                c2678a = c2678a2;
                bVar2 = bVar4;
                aVar3 = aVar7;
                cVar = cVar2;
                bVar = bVar3;
                z600.b(i700Var, null, false, false, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Integer.MAX_VALUE, false, false, false, false, null, false, false, null, null, null, false, false, null, false, null, M, 1572864, 0, 0, 4194238);
                M = M;
                M.G();
            } else {
                aVar2 = aVar6;
                cVar = cVar2;
                aVar3 = aVar7;
                dVar = dVar2;
                aVar4 = aVar5;
                bVar = bVar3;
                eVar = eVar2;
                i3 = 54;
                c2678a = c2678a2;
                bVar2 = bVar4;
                M.K(76482652);
            }
            M.j();
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.i(b, bVar), aVar4, M, i3);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D4 = M.D();
            q630 c5 = qri.c(M, aVar3);
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
            k9q0.w(M, D4, eVar);
            ur.d(hashCode3, M, bVar2, M, c2678a);
            k9q0.w(M, c5, dVar);
            androidx.compose.runtime.a aVar8 = M;
            yqv0.c(d370.N(R.string.vk_games_internet_error_title, 0, M), null, wlb0.h(M).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).C, aVar8, 0, 0, 8186);
            yqv0.c(d370.N(R.string.vk_games_internet_error_description, 0, aVar8), null, wlb0.h(aVar8).getText().p, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(aVar8).T, aVar8, 0, 0, 8122);
            aVar8.G();
            gzsVar2 = gzsVar;
            q630Var2 = q630Var;
            bhu0.e(gzsVar2, ButtonSize.Medium, ButtonStyle.Link, ButtonAppearance.Accent, null, null, false, false, null, null, null, d370.N(R.string.vk_games_error_retry_button, 0, aVar8), null, null, null, null, false, null, null, null, aVar8, (i4 & 14) | X2.b.f, 0, 0, 4190192);
            M = aVar8;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ft3(gzsVar2, q630Var2, i, 1);
        }
    }
}
