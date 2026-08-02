package xsna;

import androidx.compose.runtime.a;
import com.vkontakte.android.R;

/* compiled from: StatusPopupContent.kt */
/* loaded from: classes4.dex */
public final class zzk0 {
    public static final void a(int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-320835203);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-320835203, i2, -1, "com.vk.newsfeed.common.popups.status.CloseButton (StatusPopupContent.kt:348)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new nc90(14);
                M.R(x);
            }
            q630 b = egi0.b(q630Var, true, (izs) x);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1974706104, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Dismiss24> (VkSdkIcons.kt:648)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_dismiss_24, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N = d370.N(R.string.accessibility_close, 0, M);
            float f = 48;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().l;
            boolean z = (i2 & 112) == 32;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new gd40(gzsVar, 25);
                M.R(x2);
            }
            aVar2 = M;
            nzu0.c((gzs) x2, a, N, b, f, j, false, null, false, null, null, aVar2, 24640, 1984);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new xyc(q630Var, gzsVar, i, 5);
        }
    }
}
