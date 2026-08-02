package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ReviewBlockBottomImpl.kt */
/* loaded from: classes18.dex */
public final class ngg0 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d = androidx.compose.runtime.k.b(null);

    public ngg0(mgg0 mgg0Var, gzs gzsVar, gzs gzsVar2) {
        this.a = androidx.compose.runtime.k.b(mgg0Var);
        this.b = androidx.compose.runtime.k.b(gzsVar);
        this.c = androidx.compose.runtime.k.b(gzsVar2);
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-2136187119);
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
                androidx.compose.runtime.b.f(-2136187119, i2, -1, "com.vk.ecomm.design.compose.reviewcell.ReviewBlockBottomImpl.Content (ReviewBlockBottomImpl.kt:41)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(12), dt1.a.l, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            q630.a aVar3 = q630.a.a;
            q630 E = ahn.E(aVar3, "review_block_publish_info");
            wh50 wh50Var = this.a;
            int i3 = i2;
            yqv0.c(((mgg0) ((zak0) wh50Var).getValue()).a, E, wlb0.h(M).getText().p, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).i0, M, 100663344, 48, 5880);
            M = M;
            if (((mgg0) ((zak0) wh50Var).getValue()).b) {
                M.K(1750351230);
                boolean z = (i3 & 112) == 32;
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new r010(this, 28);
                    M.R(x);
                }
                yqv0.c(d370.N(R.string.review_block_cell_bottom_replay_action_text, 0, M), ahn.E(s200.D(ojc.c(aVar3, false, null, null, (gzs) x, 15), 4), "review_block_reply"), wlb0.h(M).getText().r, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).l0, M, 0, 0, 8184);
                M = M;
            } else {
                M.K(1748043125);
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
            s.d = new gga(this, q630Var, i, 3);
        }
    }
}
