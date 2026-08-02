package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: AvatarBottomLayer.kt */
/* loaded from: classes5.dex */
public final class eq5 {
    public static final void a(final float f, final int i, final int i2, androidx.compose.runtime.a aVar, final q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(1457699175);
        int i3 = (M.J(q630Var) ? 4 : 2) | i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= M.n(f) ? 32 : 16;
        }
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                f = 20;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1457699175, i3, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.settings.photo.avatar.AvatarBottomLayer (AvatarBottomLayer.kt:14)");
            }
            q630 d = rte0.d(txj0.f(q630Var, 1.0f), vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ja8.a(hr80.m(d, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.dq5
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    eq5.a(f, I, i2, (androidx.compose.runtime.a) obj, q630Var);
                    return s3q0.a;
                }
            };
        }
    }
}
