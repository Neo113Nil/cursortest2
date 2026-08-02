package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;
import xsna.mno0;
import xsna.q630;

/* compiled from: MovieHeaderCatalogView.kt */
/* loaded from: classes16.dex */
public final class xd30 {
    public static final void a(mno0.i iVar, mno0 mno0Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-987112667);
        if ((i & 6) == 0) {
            i2 = (M.J(iVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(mno0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-987112667, i2, -1, "com.vk.catalog.mvi.block.video.impl.movies.detail.header.MovieHeaderContent (MovieHeaderCatalogView.kt:151)");
            }
            q630 E = ahn.E(s200.E(q630Var, kqu0.w, kqu0.x), "movie_header_root");
            a.l lVar = androidx.compose.foundation.layout.a.a;
            a.j g = androidx.compose.foundation.layout.a.g(kqu0.s);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            String a2 = iVar.a(i2 & 14, M);
            frv0 frv0Var = wlb0.l(M).a;
            long j = wlb0.h(M).getText().m;
            q630.a aVar4 = q630.a.a;
            q630 E2 = ahn.E(aVar4, "movie_header_title");
            boolean z = (i2 & 896) == 256;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new wd30(izsVar, 0);
                M.R(x);
            }
            aVar2 = M;
            yqv0.c(a2, egi.o(E2, (izs) x), j, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar2, 0, 0, 8184);
            yqv0.c(mno0Var.a((i2 >> 3) & 14, aVar2), ahn.E(aVar4, "movie_header_subtitle"), wlb0.h(aVar2).getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar2).i0, aVar2, 48, 0, 8184);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new iww(iVar, mno0Var, izsVar, q630Var, i);
        }
    }
}
