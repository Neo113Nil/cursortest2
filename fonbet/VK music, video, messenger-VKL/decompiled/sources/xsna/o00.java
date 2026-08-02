package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ActionEntryPointCellLeftContent.kt */
/* loaded from: classes4.dex */
public final class o00 implements Cell$Left.Main {
    public final lg90 a;
    public final String b;
    public final jai c;
    public final gzs<s3q0> d;

    public o00(lg90 lg90Var, String str, jai jaiVar, gzs gzsVar) {
        this.a = lg90Var;
        this.b = str;
        this.c = jaiVar;
        this.d = gzsVar;
    }

    @Override // com.vk.core.compose.component.cell.content.Cell$Left
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1432831262);
        if ((i & 48) == 0) {
            i2 = (M.J(q630Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1432831262, i2, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.ActionEntryPointCellLeftContent.Content (ActionEntryPointCellLeftContent.kt:29)");
            }
            if (this.b == null) {
                M.K(2091285970);
                b(8 | (i2 & 896), M, null, this.a);
                M.j();
            } else {
                M.K(2091364586);
                int i3 = i2 & 896;
                boolean z = i3 == 256;
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z || x == c0012a) {
                    x = new k00(this, 0);
                    M.R(x);
                }
                izs izsVar = (izs) x;
                boolean z2 = i3 == 256;
                Object x2 = M.x();
                if (z2 || x2 == c0012a) {
                    x2 = new l00(this, 0);
                    M.R(x2);
                }
                buv0 z3 = rdi.z(false, izsVar, (izs) x2, M, 0, 1);
                Object x3 = M.x();
                if (x3 == c0012a) {
                    x3 = new bd8();
                    M.R(x3);
                }
                q630 s = fo50.s(q630Var, (yc8) x3);
                jai c = kai.c(-308636787, new m00(this, 0), M);
                String str = this.b;
                gzs<s3q0> gzsVar = this.d;
                o9v0.a(str, z3, s, null, null, null, null, null, gzsVar, gzsVar, null, null, null, false, null, true, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, c, M, 0, 805502976, 490744);
                M = M;
                this.c.invoke(z3, M, 0);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new n00(this, spg0Var, q630Var, i, 0);
        }
    }

    public final void b(int i, androidx.compose.runtime.a aVar, q630 q630Var, lg90 lg90Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1723337220);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1723337220, i3, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.ActionEntryPointCellLeftContent.IconContent (ActionEntryPointCellLeftContent.kt:61)");
            }
            q630.a aVar2 = q630.a.a;
            q630 q = txj0.q(aVar2, 24);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.e, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q);
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
            q630 q2 = txj0.q(aVar2, 20);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(lg90Var, null, q2, ylu0Var.getIcon().l, M, 440 | (i3 & 14), 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new hj(i, 1, this, lg90Var, q630Var);
        }
    }
}
