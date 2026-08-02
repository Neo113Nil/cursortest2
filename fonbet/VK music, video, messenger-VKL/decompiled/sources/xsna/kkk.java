package xsna;

import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CtaIconButtonContent.kt */
/* loaded from: classes18.dex */
public final class kkk {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;

    public kkk() {
        throw null;
    }

    public kkk(lg90 lg90Var, long j, long j2, String str, gzs gzsVar) {
        this.a = androidx.compose.runtime.k.b(lg90Var);
        this.b = zy60.d(j);
        this.c = zy60.d(j2);
        this.d = androidx.compose.runtime.k.b(str);
        this.e = androidx.compose.runtime.k.b(gzsVar);
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1883924788);
        int i2 = (M.J(q630Var) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1883924788, i2, -1, "com.vk.ecomm.design.compose.tile.impl.image.CtaIconButtonContent.Content (CtaIconButtonContent.kt:40)");
            }
            q630 D = s200.D(q630Var, kqu0.t);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
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
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            float f = 4;
            float f2 = kqu0.e;
            uog0 b = vog0.b(f2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            nzu0.c((gzs) ((zak0) this.e).getValue(), (lg90) ((zak0) this.a).getValue(), (String) ((zak0) this.d).getValue(), ahn.E(hr80.m(a5j0.b(q630.a.a, f, b, false, 0L, l5g.c(14, ylu0Var.l().F0, 0.6f), 12), ((l5g) ((zak0) this.c).getValue()).a, vog0.b(f2)), "product_cta_button"), 30, ((l5g) ((zak0) this.b).getValue()).a, false, null, false, null, null, aVar2, 24640, 1984);
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
            s.d = new nz1(this, q630Var, i, 4);
        }
    }
}
