package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.q630;
import xsna.xla0;

/* compiled from: PinDot.kt */
/* loaded from: classes15.dex */
public final class yla0 {
    public static final void a(xla0 xla0Var, androidx.compose.runtime.a aVar, int i) {
        long j;
        androidx.compose.runtime.a M = aVar.M(-627224522);
        int i2 = (M.J(xla0Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-627224522, i2, -1, "com.vk.biometrics.lock.impl.presentation.base.view.PinDot (PinDot.kt:15)");
            }
            q630 d = rte0.d(txj0.q(q630.a.a, 12), vog0.a);
            if (xla0Var instanceof xla0.a) {
                j = ((xla0.a) xla0Var).a;
            } else if (xla0Var instanceof xla0.c) {
                j = ((xla0.c) xla0Var).a;
            } else if (xla0Var instanceof xla0.b) {
                j = ((xla0.b) xla0Var).a;
            } else {
                if (!(xla0Var instanceof xla0.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                j = ((xla0.d) xla0Var).a;
            }
            ja8.a(hr80.m(d, j, androidx.compose.ui.graphics.e.a), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new q0r(xla0Var, i, 3);
        }
    }
}
