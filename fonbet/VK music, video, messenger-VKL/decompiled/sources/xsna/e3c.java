package xsna;

import com.ironsource.X2;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;

/* compiled from: CheckoutCompleteActionButton.kt */
/* loaded from: classes18.dex */
public final class e3c {
    public static final void a(int i, androidx.compose.runtime.a aVar, String str, gzs gzsVar, q630 q630Var, boolean z) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1983411483);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.l(z) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1983411483, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.action.CheckoutCompleteActionButton (CheckoutCompleteActionButton.kt:15)");
            }
            aVar2 = M;
            bhu0.e(gzsVar, ButtonSize.Large, ButtonStyle.Primary, ButtonAppearance.Accent, q630Var, null, false, false, null, null, null, str, null, null, null, null, z, null, null, null, aVar2, ((i2 >> 6) & 14) | X2.b.f | ((i2 << 3) & 57344), ((i2 << 6) & 896) | ((i2 << 18) & 29360128), 0, 4059104);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new d3c(i, str, gzsVar, q630Var, z);
        }
    }
}
