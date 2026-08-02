package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.j7d0;
import xsna.q630;

/* compiled from: CommunityPrimaryBlockHeaderImpl.kt */
/* loaded from: classes17.dex */
public final class fdh implements j7d0 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c = androidx.compose.runtime.k.b(null);

    public fdh(j7d0.b bVar, j7d0.c cVar) {
        this.a = androidx.compose.runtime.k.b(bVar);
        this.b = androidx.compose.runtime.k.b(cVar);
    }

    @Override // xsna.j7d0
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1879223080);
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
                androidx.compose.runtime.b.f(-1879223080, i2, -1, "com.vk.community.design.compose.primaryblock.CommunityPrimaryBlockHeaderImpl.Content (CommunityPrimaryBlockHeaderImpl.kt:29)");
            }
            q630 h = txj0.h(q630Var, 40);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, h);
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
            j7d0.b bVar = (j7d0.b) ((zak0) this.a).getValue();
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            bVar.a(new xpy(1.0f, true), M, 0);
            float f = kqu0.v;
            q630.a aVar3 = q630.a.a;
            f9t.e(txj0.v(aVar3, f), M, 0);
            j7d0.c cVar = (j7d0.c) ((zak0) this.b).getValue();
            if (cVar == null) {
                M.K(1573111281);
            } else {
                M.K(-1196180464);
                cVar.a(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.r, 1, aVar3), M, 0);
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
            s.d = new edh(this, q630Var, i, 0);
        }
    }
}
