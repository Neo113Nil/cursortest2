package xsna;

import androidx.compose.runtime.a;

/* compiled from: TabbarDialogPointer.kt */
/* loaded from: classes6.dex */
public final class ttn0 {
    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(13552113);
        int i2 = (M.J(q630Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(13552113, i2, -1, "com.vk.tabbar.settings.impl.suggests.TabbarDialogPointer (TabbarDialogPointer.kt:14)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().r;
            boolean p = M.p(j);
            Object x = M.x();
            if (p || x == a.C0011a.a) {
                x = new ykm(j, 1);
                M.R(x);
            }
            f9t.e(bu00.e(q630Var, (izs) x), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new f2i0(q630Var, i, 1);
        }
    }
}
