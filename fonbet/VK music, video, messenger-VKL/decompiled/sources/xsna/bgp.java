package xsna;

import com.vkontakte.android.R;
import xsna.q630;
import xsna.zra0;

/* compiled from: EmptyListIllustration.kt */
/* loaded from: classes4.dex */
public final class bgp {
    public static final void a(String str, androidx.compose.runtime.a aVar, int i) {
        String str2;
        lg90 a;
        androidx.compose.runtime.a M = aVar.M(1683893851);
        int i2 = (M.J(str) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1683893851, i2, -1, "com.vk.notifications.list.impl.presentation.base.view.list.EmptyListIllustration (EmptyListIllustration.kt:16)");
            }
            q630 E = ahn.E(q630.a.a, "NotificationEmptyIllustration");
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (ylu0Var.s()) {
                M.K(-336039908);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1484017104, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-IllustrationNotificationBellLight96> (VkIcons.kt:3908)");
                }
                a = pg90.a(R.drawable.vk_icon_illustration_notification_bell_light_96, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else {
                M.K(-335959587);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1619630398, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-IllustrationNotificationBellDark96> (VkIcons.kt:3904)");
                }
                a = pg90.a(R.drawable.vk_icon_illustration_notification_bell_dark_96, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            float f = 96;
            t8p0 a2 = csa0.a(a, 0L, byc0.b(f, f), null, null, M, 200072, 18);
            vl20 a3 = zra0.a.a(null, null, str, null, M, ((i2 << 6) & 896) | 196608, 27);
            str2 = str;
            ldv0.d(E, a2, a3, null, null, null, false, M, 6, 120);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            str2 = str;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new x76(str2, i, 5);
        }
    }
}
