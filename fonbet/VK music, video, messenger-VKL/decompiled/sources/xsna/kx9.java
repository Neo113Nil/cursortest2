package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vkontakte.android.R;

/* compiled from: CartMapToolbar.kt */
/* loaded from: classes18.dex */
public final class kx9 {
    public static final void a(String str, gzs gzsVar, gzs gzsVar2, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1219684446);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.y(gzsVar2) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1219684446, i2, -1, "com.vk.ecomm.cart.impl.common.ui.compose.CartMapToolbar (CartMapToolbar.kt:20)");
            }
            TopBar$Middle.Text a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(str, null, null, null, null, M, (i2 & 14) | 196608, 30), null, null, null, M, 14);
            TopBar$Before.e a2 = TopBar$Before.e.a.a(m200.m(M), d370.N(R.string.accessibility_back, 0, M), gzsVar, null, null, null, M, 1572872 | ((i2 << 3) & 896), 56);
            lg90 p = m200.p(M);
            String N = d370.N(R.string.ecomm_courier_map_toolbar_search, 0, M);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new pe1(8);
                M.R(x);
            }
            muv0.h(a, q630Var, null, null, null, a2, d.a.a(d.c.C0760d.a.a(p, N, gzsVar2, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, 1572872 | (i2 & 896), 24), null, null, null, M, 24576, 14), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, (i2 >> 6) & 112, 0, 8092);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bl0(i, str, gzsVar, gzsVar2, q630Var);
        }
    }
}
