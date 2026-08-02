package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.r1k0;

/* compiled from: CommentCardHeader.kt */
/* loaded from: classes7.dex */
public final class uag {
    public static final void a(r1k0.a.AbstractC3589a abstractC3589a, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        int i3 = abstractC3589a.a;
        androidx.compose.runtime.a M = aVar.M(-6296115);
        if ((i & 6) == 0) {
            i2 = (M.J(abstractC3589a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-6296115, i2, -1, "com.vk.video.ui.discovery.minimizable.recycler.design.compose.cards.comment.CommentCardHeader (CommentCardHeader.kt:24)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
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
            frv0 frv0Var = wlb0.l(M).l0;
            long j = wlb0.h(M).getText().m;
            String N = d370.N(R.string.comments, 0, M);
            q630.a aVar3 = q630.a.a;
            yqv0.c(N, txj0.j(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3), j, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var, M, 100663344, 48, 5880);
            M = M;
            if (i3 > 0) {
                M.K(-1215680091);
                boolean o = M.o(i3);
                Object x = M.x();
                if (o || x == a.C0011a.a) {
                    x = uqm0.f(i3);
                    M.R(x);
                }
                f9t.e(txj0.v(aVar3, kqu0.r), M, 0);
                yqv0.c((String) x, aVar3, wlb0.h(M).getText().r, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).l0, M, 100663344, 48, 5880);
                M = M;
            } else {
                M.K(-1217107951);
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
            s.d = new zre(abstractC3589a, q630Var, i, 1);
        }
    }
}
