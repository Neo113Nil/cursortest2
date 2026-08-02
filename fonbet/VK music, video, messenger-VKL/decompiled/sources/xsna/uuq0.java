package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.q630;

/* compiled from: UserProfileServiceInfo.kt */
/* loaded from: classes5.dex */
public final class uuq0 {
    public static final void a(us2 us2Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1421970615);
        if ((i & 6) == 0) {
            i2 = (M.J(us2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1421970615, i2, -1, "com.vk.profile.design.compose.profileserviceinfo.UserProfileServiceInfo (UserProfileServiceInfo.kt:26)");
            }
            q630 b = txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 196, 1, txj0.f(aVar2, 1.0f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            uov0.a(b, null, ylu0Var.getBackground().g, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(1318082402, new ah7(us2Var, 9), M), M, 1572864, 58);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zs3(us2Var, i);
        }
    }
}
