package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.wkj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ggi implements a0t {
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
                androidx.compose.runtime.b.f(1929526613, intValue, -1, "com.vk.games.presentation.components.ComposableSingletons$GamesCatalogWhatInsideModalBottomSheetContentKt.lambda$1929526613.<anonymous> (GamesCatalogWhatInsideModalBottomSheetContent.kt:200)");
            }
            vjw.a(lg90Var, null, null, null, wkj.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar, 24632 | ((intValue >> 6) & 14), 108);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar.h();
        }
        return s3q0.a;
    }
}
