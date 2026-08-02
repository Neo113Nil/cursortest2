package xsna;

import androidx.compose.runtime.a;
import xsna.q630;

/* compiled from: RemovePollAlert.kt */
/* loaded from: classes4.dex */
public final class nxf0 {
    public static final void a(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(2016638070);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2016638070, i3, -1, "com.vk.newsfeed.posting.poll_editor.presentation.base.view.RemovePollAlert (RemovePollAlert.kt:10)");
            }
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new gy7(izsVar, 6);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            boolean z2 = i4 == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new u78(izsVar, 6);
                M.R(x2);
            }
            uob0.b(gzsVar, (gzs) x2, M, (i3 << 3) & 896);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = q630.a.a;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new u9z(izsVar, q630Var, i, 4);
        }
    }
}
