package xsna;

import xsna.q630;

/* compiled from: TextWithBages.kt */
/* loaded from: classes6.dex */
public final class wno0 {
    public static final void a(vno0 vno0Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        frv0 frv0Var = vno0Var.b;
        androidx.compose.runtime.a M = aVar.M(-1328374958);
        int i2 = (M.J(vno0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1328374958, i2, -1, "com.vk.video.profile.presentation.views.TextWithBadges (TextWithBages.kt:30)");
            }
            if (vno0Var.c.isEmpty()) {
                M.K(212044897);
                String str = vno0Var.a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2 = M;
                yqv0.c(str, null, ylu0Var.getText().m, null, null, 0, 0, null, 2, false, 0, 2, null, frv0Var, aVar2, 100663296, 0, 5882);
                aVar2.j();
            } else {
                M.K(210523727);
                eoo0.a(vno0Var.a, frv0Var, 2, kai.c(-292315880, new yn7(14, vno0Var, izsVar), M), M, 27648);
                M.j();
                aVar2 = M;
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
            s.d = new zle(vno0Var, izsVar, q630Var2, i);
        }
    }
}
