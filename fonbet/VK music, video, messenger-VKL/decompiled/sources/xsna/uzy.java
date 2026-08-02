package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;
import xsna.poa;
import xsna.q630;
import xsna.ty6;

/* compiled from: LeftImpl.kt */
/* loaded from: classes17.dex */
public final class uzy implements poa {
    public final wh50 a;
    public final wh50 b;

    public uzy(poa.c cVar, poa.b bVar) {
        this.a = androidx.compose.runtime.k.b(cVar);
        this.b = androidx.compose.runtime.k.b(bVar);
    }

    @Override // xsna.poa
    public final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1661674251);
        int i2 = (M.J(this) ? 256 : 128) | i;
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1661674251, i2, -1, "com.vk.core.compose.component.cell.skeleton.LeftImpl.Content (LeftImpl.kt:25)");
            }
            dt1.a.getClass();
            ty6.b bVar = dt1.a.l;
            a.l lVar = androidx.compose.foundation.layout.a.a;
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(kqu0.v), bVar, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630.a.a);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            poa.b bVar2 = (poa.b) ((zak0) this.b).getValue();
            if (bVar2 == null) {
                M.K(-1011442719);
            } else {
                M.K(-1011442718);
                bVar2.a(54, M);
            }
            M.j();
            M.K(521563520);
            ((poa.c) ((zak0) this.a).getValue()).a(54, M);
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new th3(this, i, 4);
        }
    }
}
