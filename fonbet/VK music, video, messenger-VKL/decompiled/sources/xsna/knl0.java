package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.wra0;
import xsna.zra0;

/* compiled from: StorefrontServicesError.kt */
/* loaded from: classes18.dex */
public final class knl0 {
    public static final void a(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-549484501);
        int i2 = i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-549484501, i2, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontServicesError (StorefrontServicesError.kt:26)");
            }
            q630 d = txj0.d(q630Var, 1.0f);
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
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            vl20 a = zra0.a.a(d370.N(R.string.community_market_error_title, 0, M), null, d370.N(R.string.community_market_error_description, 0, M), null, M, 196608, 26);
            String N = d370.N(R.string.community_market_error_retry_button_text, 0, M);
            ButtonStyle buttonStyle = ButtonStyle.Secondary;
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new s3(izsVar, 5);
                M.R(x);
            }
            aVar2 = M;
            ldv0.d(null, null, a, wra0.b.a(wra0.a.C3954a.a(N, (gzs) x, null, buttonStyle, null, false, null, null, null, null, null, null, false, false, null, null, aVar2, 3072, 12582912, 131060), null, null, aVar2, 14), null, null, false, aVar2, 0, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new mz1(q630Var, izsVar, i, 9);
        }
    }
}
