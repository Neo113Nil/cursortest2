package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.e;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: OrderToolbar.kt */
/* loaded from: classes18.dex */
public final class qx80 {
    public static final void a(int i, androidx.compose.runtime.a aVar, String str, izs izsVar, q630 q630Var) {
        String O;
        androidx.compose.runtime.a M = aVar.M(1285792407);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1285792407, i2, -1, "com.vk.ecomm.orders.impl.order.presentation.compose.OrderToolbar (OrderToolbar.kt:18)");
            }
            if (str == null) {
                M.K(-1771447750);
                M.j();
                O = null;
            } else {
                M.K(-1771447749);
                O = d370.O(R.string.ecomm_order_top_bar_title_with_id, new Object[]{str}, M);
                M.j();
            }
            if (O == null) {
                O = zq.a(M, -1304065815, R.string.ecomm_order_top_bar_title, M, 0);
            } else {
                M.K(-1304069690);
                M.j();
            }
            TopBar$Middle.Text a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(O, null, null, null, null, M, 196608, 30), null, null, null, M, 14);
            q630 g = ahn.E(q630.a.a, "order_details_toolbar").g(q630Var);
            String N = d370.N(R.string.ecomm_order_list_top_bar_back, 0, M);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new cd10(6);
                M.R(x);
            }
            com.vk.core.compose.component.semantics.a a2 = com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3);
            boolean z = (i2 & 112) == 32;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new zyf(izsVar, 4);
                M.R(x2);
            }
            muv0.h(a, g, null, null, e.a.a((gzs) x2, N, null, null, a2, M, 196608, 12), null, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8172);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new q17(i, 2, str, izsVar, q630Var);
        }
    }
}
