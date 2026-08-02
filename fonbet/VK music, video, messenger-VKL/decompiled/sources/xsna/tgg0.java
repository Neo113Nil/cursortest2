package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ReviewBlockTextBodyImpl.kt */
/* loaded from: classes18.dex */
public final class tgg0 implements jgg0 {
    public final wh50 a;
    public final wh50 b = androidx.compose.runtime.k.b(null);

    public tgg0(sgg0 sgg0Var) {
        this.a = androidx.compose.runtime.k.b(sgg0Var);
    }

    @Override // xsna.jgg0
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-927984951);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-927984951, i3, -1, "com.vk.ecomm.design.compose.reviewcell.ReviewBlockTextBodyImpl.Content (ReviewBlockTextBodyImpl.kt:31)");
            }
            q630 H = s200.H(q630Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 7);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
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
            q630 E = ahn.E(q630.a.a, "review_block_text");
            wh50 wh50Var = this.a;
            us2 us2Var = ((sgg0) ((zak0) wh50Var).getValue()).a;
            frv0 frv0Var = wlb0.l(M).T;
            long j = wlb0.h(M).getText().m;
            String N = d370.N(R.string.review_block_cell_text_body_expand_hint, 0, M);
            long j2 = wlb0.h(M).getText().r;
            frv0 frv0Var2 = wlb0.l(M).Y;
            boolean z = ((sgg0) ((zak0) wh50Var).getValue()).b;
            ((sgg0) ((zak0) wh50Var).getValue()).getClass();
            int i4 = i3 & 112;
            boolean z2 = i4 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new u210(this, 23);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            boolean z3 = i4 == 32;
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new nid0(this, 3);
                M.R(x2);
            }
            aVar2 = M;
            psu0.e(us2Var, z, gzsVar, E, j2, frv0Var2, frv0Var, j, 3, 0, N, null, 0L, null, false, (gzs) x2, aVar2, 100666368, 0, 14848);
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
            s.d = new vi1(this, q630Var, i, 6);
        }
    }
}
