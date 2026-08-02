package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.e;
import com.vkontakte.android.R;

/* compiled from: linkVkBidToolbar.kt */
/* loaded from: classes18.dex */
public final class gdz {
    public static final void a(gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(303739883);
        int i2 = (M.y(gzsVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(303739883, i2, -1, "com.vk.ecomm.verifiedseller.impl.screens.linkvkbid.ui.LinkVKBidToolbar (linkVkBidToolbar.kt:14)");
            }
            String N = d370.N(R.string.ecomm_verifiedseller_top_bar_back, 0, M);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new nyq(7);
                M.R(x);
            }
            muv0.h(TopBar$Middle.a.c, null, null, null, e.a.a(gzsVar, N, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, (i2 & 14) | 196608, 12), null, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 6, 0, 8174);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new g4h(i, gzsVar);
        }
    }
}
