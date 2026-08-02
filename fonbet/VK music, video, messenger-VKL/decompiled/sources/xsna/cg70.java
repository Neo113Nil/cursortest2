package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.e;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: NotificationSettingsAppbar.kt */
/* loaded from: classes5.dex */
public final class cg70 {
    public static final void a(int i, androidx.compose.runtime.a aVar, String str, gzs gzsVar, q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(1047677287);
        int i2 = (M.J(str) ? 4 : 2) | i | (M.y(gzsVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1047677287, i2, -1, "com.vk.settings.impl.presentation.base.view.NotificationSettingsAppbar (NotificationSettingsAppbar.kt:25)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            M.K(1220168573);
            TopBar$Before.e a2 = e.a.a(gzsVar, d370.N(R.string.accessibility_back, 0, M), null, null, null, M, ((i2 >> 3) & 14) | 196608, 28);
            M.j();
            M.K(1220479564);
            M.j();
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(str, null, null, null, null, M, (i2 & 14) | 196608, 30), null, null, null, M, 14);
            q630.a aVar3 = q630.a.a;
            muv0.h(a3, aVar3, null, null, a2, null, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 48, 0, 8140);
            M.K(1220689218);
            ijv0.c(SeparatorDpi.At2x, SeparatorAppearance.Primary, txj0.f(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3), 1.0f), M, 438, 0);
            M = M;
            M.j();
            if (xga0.c(aVar3, (float) 3.5d, M, 6)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fqi(i, 2, str, gzsVar, q630Var);
        }
    }
}
