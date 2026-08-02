package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: CheckoutDivider.kt */
/* loaded from: classes18.dex */
public final class s4c {
    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(408557555);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(408557555, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.item.CheckoutDivider (CheckoutDivider.kt:13)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            float f2 = kqu0.b;
            jqu0.a(s200.G(f, f2, 6, f2, (float) 5.5d), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vn1(q630Var, i, 1);
        }
    }
}
