package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.zra0;

/* compiled from: MarketItemsForReviewComposeDoneScreen.kt */
/* loaded from: classes18.dex */
public final class l510 {
    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        lg90 s0;
        androidx.compose.runtime.a M = aVar.M(-845014335);
        int i2 = i | 6;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-845014335, i2, -1, "com.vk.ecomm.reviews.impl.itemsforreview.presentation.view.MarketItemsForReviewComposeDoneScreen (MarketItemsForReviewComposeDoneScreen.kt:22)");
            }
            q630Var2 = q630.a.a;
            q630 H = s200.H(txj0.f(q630Var2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 54, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 64, 5);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.o, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
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
            if (we7.m(M)) {
                M.K(761466060);
                qzu0.a.getClass();
                s0 = qzu0.r0(M);
                M.j();
            } else {
                M.K(761546443);
                qzu0.a.getClass();
                s0 = qzu0.s0(M);
                M.j();
            }
            lg90 lg90Var = s0;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new pqz(2);
                M.R(x);
            }
            t8p0 a2 = csa0.a(lg90Var, 0L, 0L, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, 196616, 14);
            String N = d370.N(R.string.market_items_for_review_bottomsheet_congratulation_text, 0, M);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new svz(1);
                M.R(x2);
            }
            ldv0.d(null, a2, zra0.a.a(N, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), null, null, M, 196608, 28), null, null, null, false, M, 0, Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fri(q630Var2, i, 2);
        }
    }
}
