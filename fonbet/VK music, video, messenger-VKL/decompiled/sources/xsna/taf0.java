package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: RecomThemesErrorState.kt */
/* loaded from: classes4.dex */
public final class taf0 {
    public static final void a(int i, androidx.compose.runtime.a aVar, String str, String str2, gzs gzsVar, q630 q630Var) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1328710920);
        int i3 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | 3072;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1328710920, i3, -1, "com.vk.onboardingscreens.impl.recomthemes.presentation.view.RecomThemesErrorState (RecomThemesErrorState.kt:32)");
            }
            q630.a aVar3 = q630.a.a;
            float f = 24;
            q630 g = s200.D(txj0.z(aVar3, null, 3), f).g(aVar3);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, g);
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
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.e, dt1.a.o, M, 54);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, aVar3);
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
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            if (androidx.compose.runtime.b.d()) {
                i2 = 0;
                androidx.compose.runtime.b.f(1461170364, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-WifiOutline56> (VkSdkIcons.kt:3806)");
            } else {
                i2 = 0;
            }
            lg90 a2 = pg90.a(R.drawable.vk_icon_wifi_outline_56, i2, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(a2, null, ahn.E(txj0.q(s200.D(aVar3, f), 56), "WIFI_OUT_TAG_ICON"), wlb0.h(M).getIcon().l, M, 440, 0);
            yqv0.c(str, ahn.E(aVar3, "CHECK_CONNECTION_TEXT"), wlb0.h(M).getText().p, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).X, M, (i3 & 14) | 48, 0, 8120);
            f9t.e(txj0.h(aVar3, 16), M, 6);
            aVar2 = M;
            bhu0.e(gzsVar, ButtonSize.Medium, ButtonStyle.Tertiary, ButtonAppearance.Accent, ahn.E(txj0.f(aVar3, 1.0f), "TRY_AGAIN_BUTTON"), null, false, false, null, null, null, str2, null, null, null, null, false, null, null, null, aVar2, ((i3 >> 6) & 14) | 28080, (i3 << 3) & 896, 0, 4190176);
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
            s.d = new qx00(i, str, str2, gzsVar, q630Var2);
        }
    }
}
