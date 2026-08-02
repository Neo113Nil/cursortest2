package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ecomm.design.compose.property.config.MarketProperty$VariantState;
import xsna.q630;
import xsna.wkj;

/* compiled from: MarketPropertyImageVariant.kt */
/* loaded from: classes18.dex */
public final class pd10 {
    public static final void a(kd10 kd10Var, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        q630.a aVar2;
        q630 g;
        MarketProperty$VariantState marketProperty$VariantState = kd10Var.c;
        androidx.compose.runtime.a M = aVar.M(1655894449);
        int i2 = i | (M.J(kd10Var) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1655894449, i2, -1, "com.vk.ecomm.design.compose.property.MarketPropertyImageVariant (MarketPropertyImageVariant.kt:39)");
            }
            MarketProperty$VariantState marketProperty$VariantState2 = MarketProperty$VariantState.UNAVAILABLE;
            boolean z = marketProperty$VariantState != marketProperty$VariantState2;
            y18 b = rd10.b(marketProperty$VariantState, M);
            y18 y18Var = z ? b : null;
            y18 y18Var2 = !z ? b : null;
            float a = rd10.a(marketProperty$VariantState);
            final boolean z2 = marketProperty$VariantState == MarketProperty$VariantState.SELECTED || marketProperty$VariantState == MarketProperty$VariantState.RUN_OUT || !(marketProperty$VariantState != marketProperty$VariantState2);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = vog0.b(10);
                M.R(x);
            }
            final uog0 uog0Var = (uog0) x;
            q630.a aVar3 = q630.a.a;
            q630 d = rte0.d(txj0.h(txj0.v(aVar3, 52), 69), uog0Var);
            if (y18Var2 != null) {
                float f = 4;
                aVar2 = aVar3;
                q630 g2 = d.g(ltk.a(aVar3, y18Var2, uog0Var, f, f, 16));
                if (g2 != null) {
                    d = g2;
                }
            } else {
                aVar2 = aVar3;
            }
            if (y18Var != null && (g = d.g(r18.b(y18Var.a, y18Var.b, aVar2, uog0Var))) != null) {
                d = g;
            }
            q630.a aVar4 = aVar2;
            fwu0.c(ojc.c(o19.a(d, a), false, null, null, gzsVar, 15), null, kd10Var.b, null, null, null, null, kai.c(-550063102, new a0t() { // from class: xsna.od10
                @Override // xsna.a0t
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    lg90 lg90Var = (lg90) obj3;
                    androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    if ((intValue & 384) == 0) {
                        intValue |= (intValue & 512) == 0 ? aVar5.J(lg90Var) : aVar5.y(lg90Var) ? 256 : 128;
                    }
                    if (aVar5.t(intValue & 1, (intValue & 1153) != 1152)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-550063102, intValue, -1, "com.vk.ecomm.design.compose.property.MarketPropertyImageVariant.<anonymous> (MarketPropertyImageVariant.kt:69)");
                        }
                        aVar5.K(-329655229);
                        q630.a aVar6 = q630.a.a;
                        uog0 uog0Var2 = uog0.this;
                        q630 d2 = rte0.d(aVar6, uog0Var2);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        iyk0 iyk0Var = rrv0.a;
                        ylu0 ylu0Var = (ylu0) aVar5.r(iyk0Var);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630 m = hr80.m(d2, ylu0Var.getImage().b, androidx.compose.ui.graphics.e.a);
                        if (z2) {
                            float f2 = 3;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var2 = (ylu0) aVar5.r(iyk0Var);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            y18 a2 = aqw.a(f2, ylu0Var2.getBackground().g);
                            m = m.g(r18.b(a2.a, a2.b, aVar6, uog0Var2));
                        }
                        aVar5.j();
                        r0v0.a(lg90Var, m, null, wkj.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, aVar5, 3080 | ((intValue >> 6) & 14), 244);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar5.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 100663296, 250);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar4;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ex(i, 6, kd10Var, gzsVar, q630Var2);
        }
    }
}
