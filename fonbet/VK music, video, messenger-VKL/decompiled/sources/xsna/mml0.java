package xsna;

import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.zol0;

/* compiled from: StorefrontLoading.kt */
/* loaded from: classes18.dex */
public final class mml0 {
    public static final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(791104687);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(791104687, i, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.MainShimmer (StorefrontLoading.kt:50)");
            }
            ckv0.a(txj0.f(q630.a.a, 1.0f), null, hli.e, M, 390, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new b06(i);
        }
    }

    public static final void b(zol0.a.c cVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1391453723);
        int i2 = (M.J(cVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1391453723, i2, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontLoading (StorefrontLoading.kt:33)");
            }
            q630 E = ahn.E(txj0.d(q630.a.a, 1.0f), "storefront_content_loading");
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(E, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (cVar instanceof zol0.a.c.d) {
                M.K(1470710126);
                a(0, M);
                M.j();
            } else if (cVar instanceof zol0.a.c.C4189a) {
                M.K(1470711834);
                gkl0.a(0, M);
                M.j();
            } else {
                if (cVar instanceof zol0.a.c.C4190c) {
                    M.K(1470713980);
                    eol0.a(0, M);
                } else {
                    M.K(-1654639519);
                }
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bh5(cVar, i, 13);
        }
    }
}
