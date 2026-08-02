package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.chs;
import xsna.q630;
import xsna.wkj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class pni implements a0t {
    @Override // xsna.a0t
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        chs chsVar = (chs) obj2;
        lg90 lg90Var = (lg90) obj3;
        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj4;
        int intValue = ((Integer) obj5).intValue();
        if ((intValue & 48) == 0) {
            i = (aVar.J(chsVar) ? 32 : 16) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 384) == 0) {
            i |= (intValue & 512) == 0 ? aVar.J(lg90Var) : aVar.y(lg90Var) ? 256 : 128;
        }
        if (aVar.t(i & 1, (i & 1169) != 1168)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1307209892, i, -1, "com.vk.community.design.view.components.compose.ComposableSingletons$VkCommunityCardKt.lambda$1307209892.<anonymous> (VkCommunityCard.kt:124)");
            }
            if ((chsVar instanceof chs.e) || (chsVar instanceof chs.d)) {
                aVar.K(621531652);
                vjw.a(lg90Var, null, txj0.d(q630.a.a, 1.0f), null, wkj.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar, 25016 | ((i >> 6) & 14), 104);
            } else {
                aVar.K(617257310);
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
