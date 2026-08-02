package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.q630;
import xsna.wkj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class hdi implements a0t {
    public final /* synthetic */ int b;

    @Override // xsna.a0t
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.b) {
            case 0:
                lg90 lg90Var = (lg90) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj4;
                int intValue = ((Integer) obj5).intValue();
                if ((intValue & 384) == 0) {
                    intValue |= (intValue & 512) == 0 ? aVar.J(lg90Var) : aVar.y(lg90Var) ? 256 : 128;
                }
                if (aVar.t(intValue & 1, (intValue & 1153) != 1152)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1682046944, intValue, -1, "com.vk.profile.community.creationonboarding.impl.finish.presentation.compose.ComposableSingletons$CommunityCreationOnboardingFinishScreenKt.lambda$1682046944.<anonymous> (CommunityCreationOnboardingFinishScreen.kt:103)");
                    }
                    vjw.a(lg90Var, null, txj0.d(q630.a.a, 1.0f), null, wkj.a.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar, 25016 | ((intValue >> 6) & 14), 104);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                lg90 lg90Var2 = (lg90) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                int intValue2 = ((Integer) obj5).intValue();
                if ((intValue2 & 384) == 0) {
                    intValue2 |= (intValue2 & 512) == 0 ? aVar2.J(lg90Var2) : aVar2.y(lg90Var2) ? 256 : 128;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 1153) != 1152)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(560877243, intValue2, -1, "com.vk.video.ui.discovery.minimizable.recycler.design.compose.cards.related_audio.ComposableSingletons$RelatedAudioBodyKt.lambda$560877243.<anonymous> (RelatedAudioBody.kt:72)");
                    }
                    vjw.a(lg90Var2, null, txj0.d(q630.a.a, 1.0f), null, wkj.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar2, 25016 | ((intValue2 >> 6) & 14), 104);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }
}
