package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: GroupHeader.kt */
/* loaded from: classes17.dex */
public final class cku {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;

    /* compiled from: GroupHeader.kt */
    public interface a {

        /* compiled from: GroupHeader.kt */
        /* renamed from: xsna.cku$a$a, reason: collision with other inner class name */
        public static final class C2666a implements a {
            public final wh50 a;
            public final wh50 b;
            public final wh50 c = androidx.compose.runtime.k.b(null);
            public final wh50 d = androidx.compose.runtime.k.b(null);

            /* compiled from: GroupHeader.kt */
            /* renamed from: xsna.cku$a$a$a, reason: collision with other inner class name */
            public static final class C2667a {
                public static C2666a a(lg90 lg90Var, long j, androidx.compose.runtime.a aVar) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1090544951, 24584, -1, "com.vk.core.compose.component.group.header.GroupHeader.Subtitle.Along.Icon.Companion.invoke (GroupHeader.kt:529)");
                    }
                    Object x = aVar.x();
                    if (x == a.C0011a.a) {
                        x = new C2666a(lg90Var, j);
                        aVar.R(x);
                    }
                    C2666a c2666a = (C2666a) x;
                    ((zak0) c2666a.a).setValue(lg90Var);
                    ((zak0) c2666a.b).setValue(new l5g(j));
                    ((zak0) c2666a.c).setValue(null);
                    ((zak0) c2666a.d).setValue(null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return c2666a;
                }
            }

            public C2666a(lg90 lg90Var, long j) {
                this.a = androidx.compose.runtime.k.b(lg90Var);
                this.b = zy60.d(j);
            }

            @Override // xsna.cku.a
            public final void a(int i, androidx.compose.runtime.a aVar) {
                androidx.compose.runtime.a M = aVar.M(1362064802);
                int i2 = (M.J(this) ? 32 : 16) | i;
                if (M.t(i2 & 1, (i2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1362064802, i2, -1, "com.vk.core.compose.component.group.header.GroupHeader.Subtitle.Along.Icon.Content (GroupHeader.kt:511)");
                    }
                    vqv.a((lg90) ((zak0) this.a).getValue(), (String) ((zak0) this.c).getValue(), txj0.q(com.vk.core.compose.component.semantics.b.b(q630.a.a, (SemanticsConfiguration) ((zak0) this.d).getValue()), jgz.s().e), ((l5g) ((zak0) this.b).getValue()).a, M, 8, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    M.h();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new u61(this, i, 5);
                }
            }
        }

        void a(int i, androidx.compose.runtime.a aVar);
    }

    /* compiled from: GroupHeader.kt */
    public static final class b {
        public static cku a(String str, a.C2666a c2666a, a.C2666a c2666a2, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i, int i2) {
            if ((i2 & 2) != 0) {
                c2666a = null;
            }
            if ((i2 & 4) != 0) {
                c2666a2 = null;
            }
            if ((i2 & 8) != 0) {
                aVar = null;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-64400082, i, -1, "com.vk.core.compose.component.group.header.GroupHeader.Subtitle.Companion.invoke (GroupHeader.kt:484)");
            }
            Object x = aVar2.x();
            if (x == a.C0011a.a) {
                x = new cku(c2666a, str, c2666a2, aVar);
                aVar2.R(x);
            }
            cku ckuVar = (cku) x;
            ((zak0) ckuVar.a).setValue(str);
            ((zak0) ckuVar.b).setValue(c2666a);
            ((zak0) ckuVar.c).setValue(c2666a2);
            ((zak0) ckuVar.d).setValue(aVar);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return ckuVar;
        }
    }

    public cku(a aVar, String str, a aVar2, SemanticsConfiguration semanticsConfiguration) {
        this.a = androidx.compose.runtime.k.b(str);
        this.b = androidx.compose.runtime.k.b(aVar);
        this.c = androidx.compose.runtime.k.b(aVar2);
        this.d = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    public final void a(com.vk.core.compose.component.group.header.b bVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-3822227);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
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
                androidx.compose.runtime.b.f(-3822227, i2, -1, "com.vk.core.compose.component.group.header.GroupHeader.Subtitle.Content (GroupHeader.kt:456)");
            }
            q630 b2 = com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.d).getValue());
            a.l lVar = androidx.compose.foundation.layout.a.a;
            float f = jgz.s().b;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.h(f, dt1.a.n), dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b2);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            a aVar3 = (a) ((zak0) this.b).getValue();
            if (aVar3 == null) {
                M.K(1244342439);
            } else {
                M.K(-652596582);
                aVar3.a(6, M);
            }
            M.j();
            String str = (String) ((zak0) this.a).getValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str, null, ylu0Var.getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, jgz.s().a(bVar, M, i2 & 14), M, 0, 0, 8186);
            a aVar4 = (a) ((zak0) this.c).getValue();
            if (aVar4 == null) {
                M.K(1244597383);
            } else {
                M.K(-652588358);
                aVar4.a(6, M);
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
            s.d = new bku(i, 0, this, bVar, q630Var);
        }
    }
}
