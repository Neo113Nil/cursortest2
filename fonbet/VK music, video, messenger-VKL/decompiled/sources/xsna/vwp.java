package xsna;

import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.q630;
import xsna.wra0;
import xsna.zra0;

/* compiled from: ErrorState.kt */
/* loaded from: classes4.dex */
public final class vwp {
    public static final void a(final int i, final int i2, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var) {
        q630 q630Var2;
        int i3;
        final gzs gzsVar2;
        final q630 q630Var3;
        androidx.compose.runtime.a M = aVar.M(-697014438);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            q630Var2 = q630Var;
        } else if ((i & 6) == 0) {
            q630Var2 = q630Var;
            i3 = (M.J(q630Var2) ? 4 : 2) | i;
        } else {
            q630Var2 = q630Var;
            i3 = i;
        }
        int i5 = i3 | (M.y(gzsVar) ? 32 : 16);
        if (M.t(i5 & 1, (i5 & 19) != 18)) {
            q630 q630Var4 = i4 != 0 ? q630.a.a : q630Var2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-697014438, i5, -1, "com.vk.notifications.list.impl.presentation.base.view.common.ErrorState (ErrorState.kt:19)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1159337732, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-IllustrationAntennaLight56> (VkSdkIcons.kt:1088)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_illustration_antenna_light_56, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f = 56;
            gzsVar2 = gzsVar;
            q630Var3 = q630Var4;
            ldv0.d(q630Var3, csa0.a(a, 0L, byc0.b(f, f), null, null, M, 200072, 18), zra0.a.a(null, null, d370.N(R.string.notification_list_error_title, 0, M), null, M, 196608, 27), wra0.b.a(wra0.a.C3954a.a(d370.N(R.string.notification_list_try_again, 0, M), gzsVar, ButtonSize.Medium, ButtonStyle.Tertiary, ButtonAppearance.Accent, false, null, null, null, null, null, null, false, false, null, null, M, (i5 & 112) | 28032, 12582912, 131040), null, null, M, 14), null, null, false, M, i5 & 14, 112);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            gzsVar2 = gzsVar;
            M.h();
            q630Var3 = q630Var2;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.twp
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vwp.a(ne7.I(i | 1), i2, (androidx.compose.runtime.a) obj, gzsVar2, q630Var3);
                    return s3q0.a;
                }
            };
        }
    }
}
