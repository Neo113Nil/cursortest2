package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.b78;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class u8u0 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u8u0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                b78.h hVar = (b78.h) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.l(booleanValue) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1946643526, intValue, -1, "com.vk.music.stickyplayer.presentation.components.PodcastButtons.<anonymous>.<anonymous> (VkAppBottomPlayer.kt:561)");
                    }
                    q630.a aVar2 = q630.a.a;
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (booleanValue) {
                        aVar.K(-1808794905);
                        q630 E = ahn.E(aVar2, "fastForwardBtn");
                        qzu0.a.getClass();
                        lg90 V = qzu0.V(aVar);
                        String N = d370.N(R.string.accessibility_rewind_on_15_sec_forward, 0, aVar);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j = ylu0Var.getIcon().a;
                        boolean J = aVar.J(hVar);
                        Object x = aVar.x();
                        if (J || x == c0012a) {
                            x = new gkc0(hVar, 29);
                            aVar.R(x);
                        }
                        nzu0.c((gzs) x, V, N, E, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j, false, null, false, null, null, aVar, 3136, 2000);
                        aVar.j();
                    } else {
                        aVar.K(-1808280677);
                        q630 E2 = ahn.E(aVar2, "closeBtn");
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1243383292, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel24> (VkSdkIcons.kt:226)");
                        }
                        lg90 b = or.b(aVar, 1833859693, R.drawable.vk_icon_cancel_24, aVar, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        String N2 = d370.N(R.string.ui_accessibility_close, 0, aVar);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j2 = ylu0Var2.getIcon().l;
                        boolean J2 = aVar.J(hVar);
                        Object x2 = aVar.x();
                        if (J2 || x2 == c0012a) {
                            x2 = new pyr0(hVar, 10);
                            aVar.R(x2);
                        }
                        nzu0.c((gzs) x2, b, N2, E2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j2, false, null, false, null, null, aVar, 3136, 2000);
                        aVar.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                d0l d0lVar = (d0l) this.c;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1697208391, intValue2, -1, "com.vk.core.compose.component.datetime.VkDatePickerDialog.<anonymous>.<anonymous> (VkDatePicker.kt:89)");
                    }
                    lzk.b(d0lVar, null, null, null, null, null, false, null, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
        }
        return s3q0.a;
    }
}
