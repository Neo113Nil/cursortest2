package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: DescriptionContainer.kt */
/* loaded from: classes18.dex */
public final class v1m {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;

    public v1m(hrd0 hrd0Var, vqd0 vqd0Var, t490 t490Var, zxe0 zxe0Var, y6e0 y6e0Var) {
        MarketProductTileConfig.HoldDescriptionSecondLineType holdDescriptionSecondLineType = MarketProductTileConfig.HoldDescriptionSecondLineType.None;
        this.a = androidx.compose.runtime.k.b(hrd0Var);
        this.b = androidx.compose.runtime.k.b(vqd0Var);
        this.c = androidx.compose.runtime.k.b(t490Var);
        this.d = androidx.compose.runtime.k.b(zxe0Var);
        this.e = androidx.compose.runtime.k.b(y6e0Var);
        this.f = androidx.compose.runtime.k.b(holdDescriptionSecondLineType);
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-819142363);
        int i2 = (M.J(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-819142363, i2, -1, "com.vk.ecomm.design.compose.tile.impl.description.DescriptionContainer.Content (DescriptionContainer.kt:31)");
            }
            float f = kqu0.r;
            float f2 = kqu0.q;
            q630 H = s200.H(q630Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 5);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
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
            hrd0 hrd0Var = (hrd0) ((zak0) this.a).getValue();
            if (hrd0Var == null) {
                M.K(-1434910019);
            } else {
                M.K(-46287420);
                hrd0Var.a(null, M, 0);
            }
            M.j();
            vqd0 vqd0Var = (vqd0) ((zak0) this.b).getValue();
            if (vqd0Var == null) {
                M.K(-1434868355);
            } else {
                M.K(-46286076);
                vqd0Var.a(null, M, 0);
            }
            M.j();
            t490 t490Var = (t490) ((zak0) this.c).getValue();
            q630.a aVar3 = q630.a.a;
            if (t490Var == null) {
                M.K(-1434829171);
            } else {
                M.K(-46284812);
                q630 H2 = s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                f2 = f2;
                t490Var.a(H2, M, 0);
            }
            M.j();
            zxe0 zxe0Var = (zxe0) ((zak0) this.d).getValue();
            if (zxe0Var == null) {
                M.K(-1434681363);
            } else {
                M.K(-46280044);
                zxe0Var.a(s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), M, 0);
            }
            M.j();
            y6e0 y6e0Var = (y6e0) ((zak0) this.e).getValue();
            if (y6e0Var == null) {
                M.K(-1434533059);
            } else {
                M.K(-46275260);
                y6e0Var.a(null, M, 0);
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
            s.d = new wbi(this, q630Var, i, 2);
        }
    }
}
