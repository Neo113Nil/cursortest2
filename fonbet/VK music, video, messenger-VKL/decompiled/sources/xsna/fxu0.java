package xsna;

import com.vk.core.compose.component.group.footer.GroupFooter;
import xsna.q630;

/* compiled from: VkGroupFooter.kt */
/* loaded from: classes17.dex */
public final class fxu0 {
    public static final void a(GroupFooter groupFooter, q630 q630Var, androidx.compose.runtime.a aVar, int i, int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(-1522289557);
        int i4 = (M.J(groupFooter) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (M.J(q630Var) ? 32 : 16);
        }
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (i5 != 0) {
                q630Var = q630.a.a;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1522289557, i3, -1, "com.vk.core.compose.component.group.footer.VkGroupFooter (VkGroupFooter.kt:24)");
            }
            groupFooter.a(q630Var, M, ((i3 >> 3) & 14) | ((i3 << 3) & 112));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jqh(groupFooter, q630Var, i, i2);
        }
    }
}
