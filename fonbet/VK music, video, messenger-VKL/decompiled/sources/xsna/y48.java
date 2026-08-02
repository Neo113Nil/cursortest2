package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.PlaceholderMode;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wra0;

/* compiled from: BottomImpl.kt */
/* loaded from: classes17.dex */
public final class y48 implements wra0 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;

    public y48(r48 r48Var, wra0.a aVar, wra0.a aVar2) {
        this.a = androidx.compose.runtime.k.b(r48Var);
        this.b = androidx.compose.runtime.k.b(aVar);
        this.c = androidx.compose.runtime.k.b(aVar2);
    }

    @Override // xsna.wra0
    public final void a(q630 q630Var, PlaceholderMode placeholderMode, dt1.b bVar, androidx.compose.runtime.a aVar, int i) {
        aVar.K(-1310844253);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1310844253, i, -1, "com.vk.core.compose.component.placeholder.BottomImpl.Content (BottomImpl.kt:30)");
        }
        a.l lVar = androidx.compose.foundation.layout.a.a;
        androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(kqu0.v), bVar, aVar, ((i & 910) >> 3) & 112);
        int hashCode = Long.hashCode(n34.n(aVar));
        sy90 D = aVar.D();
        q630 c = qri.c(aVar, q630Var);
        cri.h7.getClass();
        LayoutNode.a aVar2 = cri.a.b;
        if (aVar.N() == null) {
            n34.r();
            throw null;
        }
        aVar.H();
        if (aVar.L()) {
            aVar.I(aVar2);
        } else {
            aVar.f();
        }
        k9q0.w(aVar, a, cri.a.f);
        k9q0.w(aVar, D, cri.a.e);
        k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
        k9q0.t(aVar, cri.a.h);
        k9q0.w(aVar, c, cri.a.d);
        int i2 = (i & 112) | ((i >> 3) & 896);
        b((wra0.a) ((zak0) this.a).getValue(), placeholderMode, aVar, i2);
        b((wra0.a) ((zak0) this.b).getValue(), placeholderMode, aVar, i2);
        b((wra0.a) ((zak0) this.c).getValue(), placeholderMode, aVar, i2);
        aVar.G();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }

    public final void b(wra0.a aVar, PlaceholderMode placeholderMode, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar2.M(-1720096260);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(aVar) : M.y(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.o(placeholderMode.ordinal()) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1720096260, i2, -1, "com.vk.core.compose.component.placeholder.BottomImpl.BottomButton (BottomImpl.kt:43)");
            }
            if (aVar == null) {
                M.K(-132772550);
            } else {
                M.K(549906343);
                wra0.a.b.a(q630.a.a, placeholderMode, null, aVar, M, (i2 & 112) | 6 | ((i2 << 9) & 7168), 4);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new sr3(i, 1, this, aVar, placeholderMode);
        }
    }
}
