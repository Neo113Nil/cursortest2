package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: NewsfeedCoownersListView.kt */
/* loaded from: classes17.dex */
public final class kzk0 implements Cell$Middle.d.a {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;

    public kzk0(lg90 lg90Var, lg90 lg90Var2) {
        this.a = androidx.compose.runtime.k.b(lg90Var);
        this.b = androidx.compose.runtime.k.b(lg90Var2);
        float f = 12;
        this.c = androidx.compose.runtime.k.b(new uco(byc0.b(f, f)));
    }

    @Override // com.vk.core.compose.component.cell.content.Cell.Middle.d.a
    public final void c(spg0 spg0Var, q630 q630Var, Cell$Middle.Size size, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(264405052);
        if ((i & 48) == 0) {
            i2 = (M.J(q630Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(this) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & IronSourceError.ERROR_IS_INSTANCE_INIT_EXCEPTION) != 1040)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(264405052, i2, -1, "com.vk.coowners.presentation.bottomsheet.StatusIconsAlong.Content (NewsfeedCoownersListView.kt:192)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630.a.a);
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
            lg90 lg90Var = (lg90) ((zak0) this.a).getValue();
            wh50 wh50Var = this.c;
            if (lg90Var == null) {
                M.K(-88166958);
            } else {
                M.K(-88166957);
                vqv.a(lg90Var, null, txj0.r(((uco) ((zak0) wh50Var).getValue()).a, s200.H(q630Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11)), l5g.k, M, 3128, 0);
            }
            M.j();
            lg90 lg90Var2 = (lg90) ((zak0) this.b).getValue();
            if (lg90Var2 == null) {
                M.K(-87827880);
            } else {
                M.K(-87827879);
                vqv.a(lg90Var2, null, txj0.r(((uco) ((zak0) wh50Var).getValue()).a, q630Var), l5g.k, M, 3128, 0);
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
            s.d = new vrx(this, spg0Var, q630Var, size, i, 1);
        }
    }
}
