package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.q630;
import xsna.wkj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class aci implements a0t {
    @Override // xsna.a0t
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        lg90 lg90Var = (lg90) obj3;
        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj4;
        int intValue = ((Integer) obj5).intValue();
        if ((intValue & 384) == 0) {
            intValue |= (intValue & 512) == 0 ? aVar.J(lg90Var) : aVar.y(lg90Var) ? 256 : 128;
        }
        if (aVar.t(intValue & 1, (intValue & 1153) != 1152)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-412736948, intValue, -1, "com.vk.ecomm.cart.impl.cart.ui.compose.list.ComposableSingletons$CartProductKt.lambda$-412736948.<anonymous> (CartProduct.kt:137)");
            }
            q630 d = txj0.d(q630.a.a, 1.0f);
            float f = kqu0.e;
            q630 d2 = rte0.d(d, vog0.b(f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) aVar.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d2, ylu0Var.getBackground().x, androidx.compose.ui.graphics.e.a);
            float f2 = (float) 0.5d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) aVar.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            vjw.a(lg90Var, null, r18.a(f2, ylu0Var2.getImage().c, m, vog0.b(f)), null, wkj.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar, 24632 | ((intValue >> 6) & 14), 104);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar.h();
        }
        return s3q0.a;
    }
}
