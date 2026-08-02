package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ali implements a0t {
    @Override // xsna.a0t
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int intValue = ((Integer) obj).intValue();
        int intValue2 = ((Integer) obj2).intValue();
        q630 q630Var = (q630) obj3;
        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj4;
        int intValue3 = ((Integer) obj5).intValue();
        if ((intValue3 & 6) == 0) {
            i = (aVar.o(intValue) ? 4 : 2) | intValue3;
        } else {
            i = intValue3;
        }
        if ((intValue3 & 48) == 0) {
            i |= aVar.o(intValue2) ? 32 : 16;
        }
        if ((intValue3 & 384) == 0) {
            i |= aVar.J(q630Var) ? 256 : 128;
        }
        if (aVar.t(i & 1, (i & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1741933697, i, -1, "com.vk.video.ui.discovery.minimizable.recycler.design.compose.cards.base.ComposableSingletons$SlidingContentKt.lambda$-1741933697.<anonymous> (SlidingContent.kt:46)");
            }
            if (intValue2 > 1) {
                aVar.K(2143140148);
                z1k0.b(intValue, intValue2, q630Var, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar, i & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
            } else {
                aVar.K(2140875939);
            }
            aVar.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar.h();
        }
        return s3q0.a;
    }
}
