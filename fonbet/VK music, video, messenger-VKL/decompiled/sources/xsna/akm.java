package xsna;

import androidx.compose.runtime.a;
import xsna.q630;
import xsna.xpb0;

/* compiled from: DialogSpinner.kt */
/* loaded from: classes4.dex */
public final class akm {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(xpb0.a aVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(1151461031);
        int i2 = (M.J(aVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1151461031, i2, -1, "com.vk.newsfeed.posting.poll_editor.presentation.base.view.DialogSpinner (DialogSpinner.kt:19)");
            }
            if (((Boolean) jk50.c(aVar.b, M).getValue()).booleanValue()) {
                M.K(-727999025);
                xim ximVar = new xim(false, 4);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new wv0(12);
                    M.R(x);
                }
                v72.a((gzs) x, ximVar, afi.a, M, 438, 0);
            } else {
                M.K(-728866405);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = q630.a.a;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zjm(aVar, q630Var, i, 0);
        }
    }
}
