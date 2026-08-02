package xsna;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.wkj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class vli implements zzs {
    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        lg90 b;
        q630 q630Var = (q630) obj2;
        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 48) == 0) {
            intValue |= aVar.J(q630Var) ? 32 : 16;
        }
        if (aVar.t(intValue & 1, (intValue & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(33444202, intValue, -1, "com.vk.video.ui.discovery.minimizable.banner_trap.ComposableSingletons$TrapBannerDelegateKt.lambda$33444202.<anonymous> (TrapBannerDelegate.kt:99)");
            }
            Context context = (Context) aVar.r(AndroidCompositionLocals_androidKt.b);
            HashSet hashSet = iah0.a;
            boolean d = fnj.d(context);
            boolean z = ((Configuration) aVar.r(AndroidCompositionLocals_androidKt.a)).orientation == 2;
            if (d && z) {
                aVar.K(-95927450);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-945906750, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-IllustrationVkvideoSubscription40H> (VkIcons.kt:4088)");
                }
                b = pg90.a(R.drawable.vk_icon_illustration_vkvideo_subscription_40h, 0, aVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
            } else {
                b = or.b(aVar, -95839503, R.drawable.vkvideo_subscription_dark_80h, aVar, 0);
            }
            vjw.a(b, null, rte0.d(q630Var, vog0.b(12)), null, wkj.a.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar, 24632, 104);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar.h();
        }
        return s3q0.a;
    }
}
