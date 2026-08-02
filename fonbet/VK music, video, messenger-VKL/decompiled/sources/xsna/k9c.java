package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.e;
import com.vkontakte.android.R;

/* compiled from: CheckoutTopBar.kt */
/* loaded from: classes18.dex */
public final class k9c {
    public static final void a(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-979334537);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-979334537, i3, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.CheckoutTopBar (CheckoutTopBar.kt:15)");
            }
            TopBar$Middle.Text a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.ecomm_checkout_ordering, 0, M), null, null, null, null, M, 196608, 30), null, null, null, M, 14);
            q630 f = txj0.f(q630Var, 1.0f);
            String N = d370.N(R.string.ecomm_checkout_top_bar_accessibility_back, 0, M);
            boolean z = (i3 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new cr0(izsVar, 2);
                M.R(x);
            }
            muv0.h(a, f, null, null, e.a.a((gzs) x, N, null, null, null, M, 196608, 28), null, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8172);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ks3(izsVar, q630Var, i, 2);
        }
    }
}
