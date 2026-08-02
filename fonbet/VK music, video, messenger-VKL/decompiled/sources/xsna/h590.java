package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ComposeMusicOwnerVh.kt */
/* loaded from: classes16.dex */
public final class h590 implements Cell$Middle {
    public final com.vk.core.compose.component.cell.content.h1 a;
    public final Cell$Middle.c b;
    public final Cell$Middle.c c;
    public final gzs<s3q0> d;

    public h590(com.vk.core.compose.component.cell.content.h1 h1Var, com.vk.core.compose.component.cell.content.h1 h1Var2, com.vk.core.compose.component.cell.content.h1 h1Var3, gzs gzsVar) {
        this.a = h1Var;
        this.b = h1Var2;
        this.c = h1Var3;
        this.d = gzsVar;
    }

    @Override // com.vk.core.compose.component.cell.content.Cell$Middle
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-598600999);
        if ((i & 6) == 0) {
            i2 = (M.J(spg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-598600999, i2, -1, "com.vk.catalog2.feature.music.holders.OwnerMiddle.Content (ComposeMusicOwnerVh.kt:213)");
            }
            q630 b = spg0Var.b(1.0f, q630Var, true);
            a.c cVar = androidx.compose.foundation.layout.a.e;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(cVar, dt1.a.n, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b);
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
            cri.a.c cVar2 = cri.a.f;
            k9q0.w(M, a, cVar2);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            Cell$Middle.Size size = Cell$Middle.Size.Medium;
            com.vk.core.compose.component.cell.content.h1 h1Var = this.a;
            q630.a aVar3 = q630.a.a;
            h1Var.c(aVar3, size, M, 54);
            Cell$Middle.c cVar3 = this.b;
            if (cVar3 == null) {
                M.K(-419876076);
            } else {
                M.K(-419876075);
                f9t.e(txj0.h(aVar3, 4), M, 6);
                cVar3.c(aVar3, size, M, 54);
            }
            M.j();
            Cell$Middle.c cVar4 = this.c;
            if (cVar4 == null) {
                M.K(-419708955);
            } else {
                M.K(-419708954);
                f9t.e(txj0.h(aVar3, 4), M, 6);
                q630 c2 = ojc.c(txj0.h(aVar3, 22), false, null, null, this.d, 15);
                androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c3 = qri.c(M, c2);
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
                k9q0.w(M, a2, cVar2);
                k9q0.w(M, D2, eVar);
                ur.d(hashCode2, M, bVar, M, c2678a);
                k9q0.w(M, c3, dVar);
                cVar4.c(aVar3, size, M, 54);
                M.G();
            }
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
            s.d = new urx(i, 1, this, spg0Var, q630Var);
        }
    }
}
