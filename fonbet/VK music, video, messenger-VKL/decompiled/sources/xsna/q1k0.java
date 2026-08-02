package xsna;

import xsna.r1k0;

/* compiled from: SlidingCardHeader.kt */
/* loaded from: classes7.dex */
public final class q1k0 {
    public static final void a(r1k0.a aVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(274422272);
        int i2 = (M.J(aVar) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(274422272, i2, -1, "com.vk.video.ui.discovery.minimizable.recycler.design.compose.cards.base.SlidingCardHeader (SlidingCardHeader.kt:12)");
            }
            if (aVar instanceof r1k0.a.AbstractC3589a) {
                M.K(1726804597);
                uag.a((r1k0.a.AbstractC3589a) aVar, q630Var, M, i2 & 112);
                M.j();
            } else {
                if (!(aVar instanceof r1k0.a.b)) {
                    throw alb0.c(1726802702, M);
                }
                M.K(1726809206);
                zrf0.a((r1k0.a.b) aVar, q630Var, M, i2 & 112);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new pzj(aVar, q630Var, i, 9);
        }
    }
}
