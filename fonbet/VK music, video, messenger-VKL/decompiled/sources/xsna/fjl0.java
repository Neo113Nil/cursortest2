package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wra0;
import xsna.zra0;

/* compiled from: StorefrontAccessDenied.kt */
/* loaded from: classes18.dex */
public final class fjl0 {
    public static final void a(izs izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(753503923);
        int i2 = i | (M.y(izsVar) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(753503923, i2, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.StorefrontAccessDenied (StorefrontAccessDenied.kt:18)");
            }
            q630 d = txj0.d(q630.a.a, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            vl20 a = zra0.a.a(d370.N(R.string.community_market_access_denied_title, 0, M), null, null, null, M, 196608, 30);
            String N = d370.N(R.string.community_market_access_denied_back, 0, M);
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new px(izsVar, 4);
                M.R(x);
            }
            r48 a2 = wra0.a.C3954a.a(N, (gzs) x, null, null, null, false, null, null, null, null, null, null, false, false, null, null, M, 0, 12582912, 131068);
            M = M;
            ldv0.c(null, null, null, null, a, wra0.b.a(a2, null, null, M, 14), true, false, false, null, null, M, 1572864, 1935);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new nx7(izsVar, i, 12);
        }
    }
}
