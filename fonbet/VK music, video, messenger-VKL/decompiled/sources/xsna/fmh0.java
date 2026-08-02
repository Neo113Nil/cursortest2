package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SpinnerSize;
import com.vk.core.compose.component.defaults.SpinnerState;
import xsna.cri;
import xsna.dt1;
import xsna.mmh0;
import xsna.q630;

/* compiled from: SearchAddressLoading.kt */
/* loaded from: classes18.dex */
public final class fmh0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(mmh0.c cVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1634217615);
        int i2 = (M.J(cVar) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1634217615, i2, -1, "com.vk.ecomm.cart.impl.search_address.ui.compose.SearchAddressLoading (SearchAddressLoading.kt:19)");
            }
            boolean booleanValue = ((Boolean) jk50.d(cVar.a, Boolean.FALSE, M, 48).getValue()).booleanValue();
            q630Var2 = q630.a.a;
            if (booleanValue) {
                M.K(-1522438376);
                q630 H = s200.H(txj0.f(q630Var2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.b, false);
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
                k9q0.w(M, d, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                zfr0.f(SpinnerState.Loading, ra8.a.b(q630Var2, dt1.a.c), null, 0L, SpinnerSize.Size36, null, M, 24582, 44);
                M.G();
            } else {
                M.K(-1523297231);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h0k(cVar, q630Var2, i, 5);
        }
    }
}
