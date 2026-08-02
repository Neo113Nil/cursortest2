package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ecomm.design.compose.property.config.MarketProperty$VariantState;
import xsna.q630;

/* compiled from: MarketPropertyTextVariant.kt */
/* loaded from: classes18.dex */
public final class qd10 {
    public static final void a(ld10 ld10Var, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        uog0 uog0Var;
        q630.a aVar2;
        MarketProperty$VariantState marketProperty$VariantState = ld10Var.c;
        androidx.compose.runtime.a M = aVar.M(-838330917);
        int i2 = i | (M.J(ld10Var) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-838330917, i2, -1, "com.vk.ecomm.design.compose.property.MarketPropertyTextVariant (MarketPropertyTextVariant.kt:35)");
            }
            boolean z = marketProperty$VariantState != MarketProperty$VariantState.UNAVAILABLE;
            y18 b = rd10.b(marketProperty$VariantState, M);
            y18 y18Var = z ? b : null;
            y18 y18Var2 = !z ? b : null;
            float a = rd10.a(marketProperty$VariantState);
            uog0 b2 = vog0.b(10);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.d().a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j2 = ylu0Var2.getText().m;
            q630.a aVar3 = q630.a.a;
            q630 d = rte0.d(aVar3, b2);
            if (y18Var2 != null) {
                float f = 4;
                uog0Var = b2;
                aVar2 = aVar3;
                q630 g = d.g(ltk.a(aVar3, y18Var2, uog0Var, f, f, 16));
                if (g != null) {
                    d = g;
                }
            } else {
                uog0Var = b2;
                aVar2 = aVar3;
            }
            q630 c = ojc.c(o19.a(d, a), false, null, null, gzsVar, 15);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new v4v(10);
                M.R(x);
            }
            uov0.a(egi0.b(c, false, (izs) x), uog0Var, j, j2, y18Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(1901722100, new zu3(ld10Var, 10), M), M, 1572864, 32);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new hx(i, 2, ld10Var, gzsVar, q630Var2);
        }
    }
}
