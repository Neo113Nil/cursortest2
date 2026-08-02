package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: DarkOverlay.kt */
/* loaded from: classes17.dex */
public final class hsk implements z190 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c = androidx.compose.runtime.k.b(null);

    /* compiled from: DarkOverlay.kt */
    public static final class a {
        public static hsk a(lg90 lg90Var, long j, androidx.compose.runtime.a aVar, int i, int i2) {
            if ((i2 & 2) != 0) {
                j = xcv0.f(true, aVar);
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1419069536, i, -1, "com.vk.core.compose.component.image.overlay.DarkOverlay.Companion.invoke (DarkOverlay.kt:56)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                x = new hsk(lg90Var, j);
                aVar.R(x);
            }
            hsk hskVar = (hsk) x;
            ((zak0) hskVar.a).setValue(lg90Var);
            ((zak0) hskVar.b).setValue(new l5g(j));
            ((zak0) hskVar.c).setValue(null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return hskVar;
        }
    }

    public hsk(lg90 lg90Var, long j) {
        this.a = androidx.compose.runtime.k.b(lg90Var);
        this.b = zy60.d(j);
    }

    @Override // xsna.z190
    public final void a(final int i, final long j, androidx.compose.runtime.a aVar, final q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-558227381);
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
                androidx.compose.runtime.b.f(-558227381, i2, -1, "com.vk.core.compose.component.image.overlay.DarkOverlay.invoke (DarkOverlay.kt:34)");
            }
            q630 b = com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.c).getValue());
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(b, ylu0Var.i().a, androidx.compose.ui.graphics.e.a);
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
            pzu0.b((lg90) ((zak0) this.a).getValue(), null, txj0.r(xcv0.d((i2 & 14) | 48, j), q630.a.a), ((l5g) ((zak0) this.b).getValue()).a, M, 56, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.gsk
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    hsk.this.a(I, j, (androidx.compose.runtime.a) obj, q630Var);
                    return s3q0.a;
                }
            };
        }
    }
}
