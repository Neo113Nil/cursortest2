package xsna;

import xsna.q630;

/* compiled from: TextWithAgeBadge.kt */
/* loaded from: classes6.dex */
public final class tno0 {
    public static final void a(uno0 uno0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-556069489);
        int i2 = (M.J(uno0Var) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-556069489, i2, -1, "com.vk.video.profile.presentation.views.TextWithAgeBadge (TextWithAgeBadge.kt:27)");
            }
            if (uno0Var.c != null) {
                M.K(-177105395);
                eoo0.a(uno0Var.a, uno0Var.b, uno0Var.d, kai.c(839963017, new com.vk.movika.tools.controls.seekbar.r(uno0Var, 13), M), M, 27648);
                M.j();
                aVar2 = M;
            } else {
                M.K(-176163708);
                String str = uno0Var.a;
                int i3 = uno0Var.d;
                frv0 frv0Var = uno0Var.b;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2 = M;
                yqv0.c(str, null, ylu0Var.getText().m, null, null, 0, 0, null, 2, false, 0, i3, null, frv0Var, aVar2, 100663296, 0, 5882);
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630.a.a;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wn7(uno0Var, q630Var2, i, 15);
        }
    }
}
