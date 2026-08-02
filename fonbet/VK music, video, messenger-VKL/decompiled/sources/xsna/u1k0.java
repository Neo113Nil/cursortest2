package xsna;

import xsna.q630;

/* compiled from: SlidingCardsSkeleton.kt */
/* loaded from: classes7.dex */
public final class u1k0 {
    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(458635778);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(458635778, i2, -1, "com.vk.video.ui.discovery.minimizable.recycler.design.compose.cards.base.SlidingCardsSkeleton (SlidingCardsSkeleton.kt:17)");
            }
            ckv0.a(txj0.f(q630.a.a, 1.0f), null, kai.c(2078215303, new wg2(q630Var, 4), M), M, 390, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new t1k0(q630Var, i, 0);
        }
    }
}
