package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.banner.Banner$BackgroundContentScale;
import com.vk.core.compose.component.banner.Banner$BackgroundMode;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.c16;
import xsna.cri;
import xsna.d16;
import xsna.dt1;

/* compiled from: GameAchievementsBannerLego.kt */
/* loaded from: classes17.dex */
public final class f6t {
    public static final ArrayList<Integer> a = e43.a(Integer.valueOf(R.drawable.vk_games_achievements_level_1), Integer.valueOf(R.drawable.vk_games_achievements_level_2), Integer.valueOf(R.drawable.vk_games_achievements_level_3), Integer.valueOf(R.drawable.vk_games_achievements_level_4), Integer.valueOf(R.drawable.vk_games_achievements_level_5));

    public static final void a(g6t g6tVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1448815260);
        int i2 = i | (M.J(g6tVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1448815260, i2, -1, "com.vk.games.presentation.components.lego_items.GameAchievementsBannerLego (GameAchievementsBannerLego.kt:27)");
            }
            q630 E = s200.E(q630Var, kqu0.w, kqu0.v);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            lg90 a2 = pg90.a(R.drawable.vk_games_achievements_background, 0, M);
            Banner$BackgroundContentScale banner$BackgroundContentScale = Banner$BackgroundContentScale.Crop;
            long j = l5g.j;
            Banner$BackgroundMode banner$BackgroundMode = Banner$BackgroundMode.Dark;
            mzo0 a3 = d16.e.a.a(d370.N(R.string.vk_games_my_achievements, 0, M), M);
            s0n0 a4 = d16.d.a.a(g6tVar.a, M);
            String N = d370.N(R.string.vk_games_my_achievements_details, 0, M);
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Overlay;
            ButtonSize buttonSize = ButtonSize.Small;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            int i4 = i2 & 14;
            boolean z2 = z | (i4 == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new ni0(5, izsVar, g6tVar);
                M.R(x);
            }
            xl20 b = d16.b.b(a3, a4, null, d16.a.C2697a.a(buttonStyle, buttonAppearance, buttonSize, N, null, null, null, null, null, null, null, null, (gzs) x, M, 438, 24576, 8176), null, null, null, null, M, 100663296, 244);
            ArrayList<Integer> arrayList = h6t.a;
            int i5 = g6tVar.b;
            if (i5 < 0) {
                i5 = 0;
            } else {
                ArrayList<Integer> arrayList2 = h6t.a;
                if (i5 >= arrayList2.size()) {
                    i5 = e43.h(arrayList2);
                }
            }
            ymr a5 = c16.a.C2633a.a(pg90.a(a.get(i5).intValue(), 0, M), M, 3128, 4);
            l5g l5gVar = new l5g(j);
            boolean z3 = (i3 == 32) | (i4 == 4);
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new mh3(8, izsVar, g6tVar);
                M.R(x2);
            }
            beu0.a(b, null, a2, null, l5gVar, banner$BackgroundMode, banner$BackgroundContentScale, null, null, null, a5, (gzs) x2, M, 1794560, 0, 906);
            aVar2 = M;
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
            s.d = new ote(g6tVar, izsVar, q630Var, i);
        }
    }
}
