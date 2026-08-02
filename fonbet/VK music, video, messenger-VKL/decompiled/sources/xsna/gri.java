package xsna;

import com.vkontakte.android.R;
import xsna.q630;
import xsna.us2;

/* compiled from: ComposeUtils.kt */
/* loaded from: classes5.dex */
public final class gri {
    public static final void a(us2.b bVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-822203042);
        int i2 = (M.y(bVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-822203042, i2, -1, "com.vk.profile.design.compose.header.utils.JoinDot (ComposeUtils.kt:23)");
            }
            bVar.g(" " + d370.N(R.string.author_header_dot_separator, 0, M) + ' ');
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.q(bVar, i, 7);
        }
    }

    public static final void b(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1225151291);
        int i2 = i | 6;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1225151291, i2, -1, "com.vk.profile.design.compose.header.utils.SeparatorDot (ComposeUtils.kt:13)");
            }
            String N = d370.N(R.string.author_header_dot_separator, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.U;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().m;
            q630Var2 = q630.a.a;
            aVar2 = M;
            yqv0.c(N, q630Var2, j, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar2, 48, 0, 8184);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.s(q630Var2, i, 4);
        }
    }
}
