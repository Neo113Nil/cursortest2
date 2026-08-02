package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: IconContent.kt */
/* loaded from: classes17.dex */
public final class xpv implements efj {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d = androidx.compose.runtime.k.b(null);

    /* compiled from: IconContent.kt */
    public static final class a {
        public static xpv a(lg90 lg90Var, long j, rek0 rek0Var, androidx.compose.runtime.a aVar, int i, int i2) {
            if ((i2 & 2) != 0) {
                j = l5g.k;
            }
            if ((i2 & 4) != 0) {
                rek0Var = null;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(250150689, i, -1, "com.vk.core.compose.component.image.content.IconContent.Companion.invoke (IconContent.kt:62)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                x = new xpv(rek0Var, lg90Var, j);
                aVar.R(x);
            }
            xpv xpvVar = (xpv) x;
            ((zak0) xpvVar.a).setValue(rek0Var);
            ((zak0) xpvVar.b).setValue(lg90Var);
            ((zak0) xpvVar.c).setValue(new l5g(j));
            ((zak0) xpvVar.d).setValue(null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return xpvVar;
        }
    }

    public xpv(yk8 yk8Var, lg90 lg90Var, long j) {
        this.a = androidx.compose.runtime.k.b(yk8Var);
        this.b = androidx.compose.runtime.k.b(lg90Var);
        this.c = zy60.d(j);
    }

    @Override // xsna.efj
    public final void a(final int i, final long j, androidx.compose.runtime.a aVar, final q630 q630Var) {
        int i2;
        q630 g;
        androidx.compose.runtime.a M = aVar.M(-1354350284);
        if ((i & 6) == 0) {
            i2 = (M.p(j) ? 4 : 2) | i;
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
                androidx.compose.runtime.b.f(-1354350284, i2, -1, "com.vk.core.compose.component.image.content.IconContent.invoke (IconContent.kt:38)");
            }
            M.K(-155523568);
            q630 b = com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.d).getValue());
            wh50 wh50Var = this.a;
            yk8 yk8Var = (yk8) ((zak0) wh50Var).getValue();
            q630.a aVar2 = q630.a.a;
            if (yk8Var != null && (g = b.g(hr80.l(aVar2, yk8Var, null, 6))) != null) {
                b = g;
            }
            if (((yk8) ((zak0) wh50Var).getValue()) == null) {
                b = b.g(hr80.m(aVar2, xcv0.c(6, M), androidx.compose.ui.graphics.e.a));
            }
            M.j();
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            pzu0.b((lg90) ((zak0) this.b).getValue(), null, txj0.r(xcv0.d((i2 & 14) | 48, j), aVar2), ((l5g) ((zak0) this.c).getValue()).a, M, 56, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.wpv
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    xpv.this.a(I, j, (androidx.compose.runtime.a) obj, q630Var);
                    return s3q0.a;
                }
            };
        }
    }
}
