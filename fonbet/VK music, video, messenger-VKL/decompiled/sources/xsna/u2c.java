package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;

/* compiled from: CheckoutAction.kt */
/* loaded from: classes18.dex */
public final class u2c {
    public static final void a(s2c s2cVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-579930949);
        if ((i & 6) == 0) {
            i2 = (M.J(s2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-579930949, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.item.CheckoutAction (CheckoutAction.kt:18)");
            }
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            ButtonSize buttonSize = ButtonSize.Medium;
            ButtonStyle buttonStyle = s2cVar.e ? ButtonStyle.Primary : ButtonStyle.Secondary;
            String str = s2cVar.d;
            float f = kqu0.b;
            q630 H = s200.H(q630Var, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, kqu0.v, 2);
            boolean z = !s2cVar.f;
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new a94(5, izsVar, s2cVar);
                M.R(x);
            }
            aVar2 = M;
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, H, null, false, false, null, null, null, str, null, null, null, null, z, null, null, null, aVar2, 3120, 0, 0, 4059104);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new t2c(i, 0, s2cVar, izsVar, q630Var);
        }
    }
}
