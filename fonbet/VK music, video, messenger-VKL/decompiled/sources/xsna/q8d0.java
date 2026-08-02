package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.j7d0;
import xsna.q630;

/* compiled from: PrimaryBlockHeaderBaseRightActionsImpl.kt */
/* loaded from: classes17.dex */
public final class q8d0 extends j7d0.c.a {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;

    public q8d0() {
        this(false, false, null, null, null, null);
    }

    @Override // xsna.j7d0
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-563142742);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-563142742, i2, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockHeaderBaseRightActionsImpl.Content (PrimaryBlockHeaderBaseRightActionsImpl.kt:45)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(q630Var, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            boolean booleanValue = ((Boolean) ((zak0) this.a).getValue()).booleanValue();
            jai c2 = kai.c(-1316620818, new gd3(this, 2), M);
            tpg0 tpg0Var = tpg0.a;
            mm2.e(tpg0Var, booleanValue, null, null, null, null, c2, M, 1572870, 30);
            mm2.e(tpg0Var, ((Boolean) ((zak0) this.b).getValue()).booleanValue(), null, null, null, null, kai.c(953390295, new y9a(this, 2), M), M, 1572870, 30);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new j6l(this, q630Var, i, 4);
        }
    }

    public final void b(final lg90 lg90Var, q630 q630Var, final gzs gzsVar, final SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        gzs gzsVar2;
        androidx.compose.runtime.a M = aVar.M(-1357898644);
        int i2 = i | (M.y(lg90Var) ? 4 : 2) | Tensorflow.FRAME_WIDTH | (M.y(gzsVar) ? 2048 : 1024) | (M.J(semanticsConfiguration) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1357898644, i2, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockHeaderBaseRightActionsImpl.RightActionButton (PrimaryBlockHeaderBaseRightActionsImpl.kt:81)");
            }
            q630.a aVar3 = q630.a.a;
            q630 q = txj0.q(aVar3, 36);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.g, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (gzsVar == null) {
                M.K(-1014989318);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new l9(24);
                    M.R(x);
                }
                gzsVar2 = (gzs) x;
                M.j();
            } else {
                M.K(-1141120527);
                M.j();
                gzsVar2 = gzsVar;
            }
            q630 b = com.vk.core.compose.component.semantics.b.b(aVar3, semanticsConfiguration);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            nzu0.c(gzsVar2, lg90Var, null, b, Float.NaN, ylu0Var.getIcon().f, false, null, gzsVar != null, null, null, aVar2, ((i2 << 3) & 112) | 25024, 1728);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(lg90Var, q630Var2, gzsVar, semanticsConfiguration, i) { // from class: xsna.p8d0
                public final /* synthetic */ lg90 c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ gzs e;
                public final /* synthetic */ SemanticsConfiguration f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(9);
                    q8d0.this.b(this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public q8d0(boolean z, boolean z2, gzs gzsVar, gzs gzsVar2, com.vk.core.compose.component.semantics.a aVar, com.vk.core.compose.component.semantics.a aVar2) {
        this.a = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.b = androidx.compose.runtime.k.b(Boolean.valueOf(z2));
        this.c = androidx.compose.runtime.k.b(gzsVar);
        this.d = androidx.compose.runtime.k.b(gzsVar2);
        this.e = androidx.compose.runtime.k.b(aVar);
        this.f = androidx.compose.runtime.k.b(aVar2);
    }
}
