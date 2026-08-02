package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.group.header.GroupHeader$Right;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: RightImpl.kt */
/* loaded from: classes17.dex */
public final class ikg0 implements GroupHeader$Right {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;

    public ikg0(GroupHeader$Right.a aVar, GroupHeader$Right.Icon icon, GroupHeader$Right.b bVar, SemanticsConfiguration semanticsConfiguration) {
        this.a = androidx.compose.runtime.k.b(aVar);
        this.b = androidx.compose.runtime.k.b(icon);
        this.c = androidx.compose.runtime.k.b(bVar);
        this.d = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    @Override // com.vk.core.compose.component.group.header.GroupHeader$Right
    public final void a(com.vk.core.compose.component.group.header.b bVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-539900453);
        int i3 = i & 6;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 = (M.J(aVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(bVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-539900453, i2, -1, "com.vk.core.compose.component.group.header.right.RightImpl.Content (RightImpl.kt:35)");
            }
            q630 b = com.vk.core.compose.component.semantics.b.b(aVar2, (SemanticsConfiguration) ((zak0) this.d).getValue());
            a.l lVar = androidx.compose.foundation.layout.a.a;
            float f = kqu0.r;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.h(f, dt1.a.p), dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b);
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
            GroupHeader$Right.Icon icon = (GroupHeader$Right.Icon) ((zak0) this.b).getValue();
            if (icon == null) {
                M.K(-423763215);
            } else {
                M.K(1233256208);
                icon.a(aVar2, M, 6);
            }
            M.j();
            GroupHeader$Right.a aVar4 = (GroupHeader$Right.a) ((zak0) this.a).getValue();
            if (aVar4 == null) {
                M.K(-423719381);
            } else {
                M.K(1233257622);
                aVar4.a(bVar, M, (i2 & 112) | 6);
            }
            M.j();
            GroupHeader$Right.b bVar2 = (GroupHeader$Right.b) ((zak0) this.c).getValue();
            if (bVar2 == null) {
                M.K(-423671765);
            } else {
                M.K(1233259158);
                bVar2.a(bVar, M, (i2 & 112) | 6);
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
            s.d = new nv1(this, bVar, i);
        }
    }
}
