package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: SleepTimerButton.kt */
/* loaded from: classes3.dex */
public final class zzj0 {
    public static final void a(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var, boolean z) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-2041871811);
        int i2 = (M.l(z) ? 4 : 2) | i | (M.y(izsVar) ? 256 : 128) | 3072;
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2041871811, i2, -1, "com.vk.music.stickyplayer.presentation.components.controls.SleepTimerButton (SleepTimerButton.kt:28)");
            }
            View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
            qzu0.a.getClass();
            lg90 y = qzu0.y(M);
            String N = d370.N(R.string.music_talkback_sleep_timer, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().c;
            q630Var2 = q630.a.a;
            q630 E = ahn.E(o19.a(txj0.q(s200.D(q630Var2, 10), 24), z ? 1.0f : 0.64f), "sleepTimerButton");
            boolean y2 = M.y(view) | ((i2 & 896) == 256);
            Object x = M.x();
            if (y2 || x == a.C0011a.a) {
                x = new j4(24, view, izsVar);
                M.R(x);
            }
            pzu0.b(y, N, ojc.c(E, true, null, null, (gzs) x, 14), j, M, 8, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fwd0(i, izsVar, q630Var2, z);
        }
    }
}
