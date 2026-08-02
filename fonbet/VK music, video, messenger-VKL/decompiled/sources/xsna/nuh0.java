package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: SearchHistoryCellMiddle.kt */
/* loaded from: classes3.dex */
public final class nuh0 implements Cell$Middle {
    public final /* synthetic */ com.vk.core.compose.component.cell.content.h1 a;
    public final /* synthetic */ com.vk.core.compose.component.cell.content.h1 b;

    public nuh0(com.vk.core.compose.component.cell.content.h1 h1Var, com.vk.core.compose.component.cell.content.h1 h1Var2) {
        this.a = h1Var;
        this.b = h1Var2;
    }

    @Override // com.vk.core.compose.component.cell.content.Cell$Middle
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        aVar.K(-641815644);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-641815644, i, -1, "com.vk.music.ui.search.history.cellMiddle.<no name provided>.Content (SearchHistoryCellMiddle.kt:65)");
        }
        q630 b = spg0Var.b(1.0f, q630Var, true);
        dt1.a.getClass();
        ty6.a aVar2 = dt1.a.n;
        a.l lVar = androidx.compose.foundation.layout.a.a;
        androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.i(2, dt1.a.l), aVar2, aVar, 54);
        int hashCode = Long.hashCode(n34.n(aVar));
        sy90 D = aVar.D();
        q630 c = qri.c(aVar, b);
        cri.h7.getClass();
        LayoutNode.a aVar3 = cri.a.b;
        if (aVar.N() == null) {
            n34.r();
            throw null;
        }
        aVar.H();
        if (aVar.L()) {
            aVar.I(aVar3);
        } else {
            aVar.f();
        }
        k9q0.w(aVar, a, cri.a.f);
        k9q0.w(aVar, D, cri.a.e);
        k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
        k9q0.t(aVar, cri.a.h);
        k9q0.w(aVar, c, cri.a.d);
        Cell$Middle.Size size = Cell$Middle.Size.Medium;
        com.vk.core.compose.component.cell.content.h1 h1Var = this.a;
        q630.a aVar4 = q630.a.a;
        h1Var.c(aVar4, size, aVar, 54);
        this.b.c(aVar4, size, aVar, 54);
        aVar.G();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }
}
