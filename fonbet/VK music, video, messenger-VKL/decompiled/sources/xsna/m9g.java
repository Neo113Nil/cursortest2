package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import java.util.Iterator;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.g8s;
import xsna.q630;

/* compiled from: ColumnImpl.kt */
/* loaded from: classes17.dex */
public final class m9g extends g8s.a {
    public final wh50 c;
    public final wh50 d = androidx.compose.runtime.k.b(null);

    public m9g(List list) {
        this.c = androidx.compose.runtime.k.b(list);
    }

    @Override // xsna.g8s
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(112404956);
        if ((i & 48) == 0) {
            i2 = (M.J(this) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 17) != 16)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(112404956, i2, -1, "com.vk.core.compose.component.form.ColumnImpl.Content (ColumnImpl.kt:21)");
            }
            SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) ((zak0) this.d).getValue();
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(com.vk.core.compose.component.semantics.b.b(aVar2, semanticsConfiguration), 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            M.K(367275068);
            Iterator it = ((List) ((zak0) this.c).getValue()).iterator();
            while (it.hasNext()) {
                ((g8s.d) it.next()).a(txj0.f(aVar2, 1.0f), M, 6);
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jh4(this, q630Var, i, 1);
        }
    }
}
