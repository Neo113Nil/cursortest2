package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: MoreMenuButton.kt */
/* loaded from: classes3.dex */
public final class y830 {
    public static final void a(izs<? super sx40, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1298129212);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1298129212, i2, -1, "com.vk.music.stickyplayer.presentation.components.MoreMenuButton (MoreMenuButton.kt:23)");
            }
            View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().m;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(950398620, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreVertical28> (VkSdkIcons.kt:2670)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_more_vertical_28, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N = d370.N(R.string.music_talkback_player_more, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j2 = ylu0Var2.getIcon().c;
            float f = 24;
            q630 q = txj0.q(q630.a.a, 40);
            boolean p = M.p(j);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (p || x == c0012a) {
                x = new x830(j, 0);
                M.R(x);
            }
            q630 E = ahn.E(bu00.e(q, (izs) x), "moreButtonInPlayer");
            boolean y = M.y(view) | ((i2 & 14) == 4);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                x2 = new uh3(17, view, izsVar);
                M.R(x2);
            }
            nzu0.c((gzs) x2, a, N, E, f, j2, false, null, false, null, null, M, 24640, 1984);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wwl(izsVar, i);
        }
    }
}
