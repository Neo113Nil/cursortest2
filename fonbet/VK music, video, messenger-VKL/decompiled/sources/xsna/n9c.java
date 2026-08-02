package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CheckoutTotalPriceStickItem.kt */
/* loaded from: classes18.dex */
public final class n9c {
    public static final void a(l9c l9cVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-2010954298);
        int i2 = (M.J(l9cVar) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2010954298, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.stick.CheckoutTotalPriceStickItem (CheckoutTotalPriceStickItem.kt:17)");
            }
            float f = kqu0.b;
            q630.a aVar3 = q630.a.a;
            q630 F = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            aVar2 = M;
            String str = l9cVar.a;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630Var2 = aVar3;
            yqv0.c(str, new xpy(1.0f, true), wlb0.h(aVar2).getText().m, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(aVar2).J, aVar2, 100663296, 48, 5880);
            yqv0.c(l9cVar.b, null, wlb0.h(aVar2).getText().m, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(aVar2).J, aVar2, 100663296, 48, 5882);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new m9c(l9cVar, q630Var2, i, 0);
        }
    }
}
