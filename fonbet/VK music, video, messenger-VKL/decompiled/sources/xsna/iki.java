package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.q630;
import xsna.wkj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class iki implements a0t {
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
                androidx.compose.runtime.b.f(-2130098653, intValue, -1, "com.vk.music.stickyplayer.presentation.redesignedcomponents.ComposableSingletons$RedesignCoverBlockKt.lambda$-2130098653.<anonymous> (RedesignCoverBlock.kt:24)");
            }
            float f = 18;
            q630 d = rte0.d(q630.a.a, vog0.b(f));
            float f2 = 1;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            y18 a = aqw.a(f2, ylu0Var.getBackground().a);
            r0v0.a(lg90Var, r18.b(a.a, a.b, d, vog0.b(f)), null, wkj.a.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, aVar, 3080 | ((intValue >> 6) & 14), 244);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar.h();
        }
        return s3q0.a;
    }
}
