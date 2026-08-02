package xsna;

import xsna.r1k0;

/* compiled from: SlidingCardBody.kt */
/* loaded from: classes7.dex */
public final class p1k0 {
    public static final void a(r1k0.a aVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar2.M(-1673733482);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(aVar) : M.y(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1673733482, i2, -1, "com.vk.video.ui.discovery.minimizable.recycler.design.compose.cards.base.SlidingCardBody (SlidingCardBody.kt:12)");
            }
            if (aVar instanceof r1k0.a.AbstractC3589a) {
                M.K(-2140101303);
                tag.a((r1k0.a.AbstractC3589a) aVar, q630Var, M, i2 & 112);
                M.j();
            } else {
                if (!(aVar instanceof r1k0.a.b)) {
                    throw alb0.c(-2140103200, M);
                }
                M.K(-2140096758);
                wrf0.a((r1k0.a.b) aVar, q630Var, M, i2 & 112);
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
            s.d = new nv1(aVar, q630Var, i, 8);
        }
    }
}
