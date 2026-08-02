package xsna;

import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import xsna.i870;
import xsna.q630;

/* compiled from: NotificationButtons.kt */
/* loaded from: classes4.dex */
public final class h870 {
    public static final void a(final String str, final ButtonStyle buttonStyle, final Boolean bool, final q630 q630Var, final gzs gzsVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1861732346);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(bool) ? 256 : 128) | (M.y(gzsVar) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1861732346, i2, -1, "com.vk.notifications.design.compose.list.common.LoadingButton (NotificationButtons.kt:59)");
            }
            aVar2 = M;
            bhu0.e(gzsVar, ButtonSize.Small, buttonStyle, ButtonAppearance.Neutral, s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11).g(q630Var), null, epx.f(bool, Boolean.FALSE), false, null, null, null, str, null, null, null, null, bool == null, null, null, null, aVar2, ((i2 >> 12) & 14) | X2.b.f, (i2 << 6) & 896, 0, 4058976);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(str, buttonStyle, bool, q630Var, gzsVar, i) { // from class: xsna.g870
                public final /* synthetic */ String b;
                public final /* synthetic */ ButtonStyle c;
                public final /* synthetic */ Boolean d;
                public final /* synthetic */ q630 e;
                public final /* synthetic */ gzs f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(3121);
                    h870.a(this.b, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(i870.a aVar, izs<? super snv, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar2.M(-1710285901);
        if ((i & 6) == 0) {
            i2 = (M.J(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1710285901, i2, -1, "com.vk.notifications.design.compose.list.common.NotificationButtons (NotificationButtons.kt:22)");
            }
            androidx.compose.foundation.layout.e.a(null, null, null, null, 0, 0, kai.c(130192622, new rg7(1, aVar, izsVar), M), M, 1572864, 63);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bo7(aVar, izsVar, i, 5);
        }
    }
}
