package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: MusicBuySubscription.kt */
/* loaded from: classes3.dex */
public final class qc40 implements efj {
    public final /* synthetic */ lg90 a;
    public final /* synthetic */ yk8 b;

    public qc40(lg90 lg90Var, yk8 yk8Var) {
        this.a = lg90Var;
        this.b = yk8Var;
    }

    @Override // xsna.efj
    public final void a(int i, long j, androidx.compose.runtime.a aVar, q630 q630Var) {
        aVar.K(1663262468);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1663262468, i, -1, "com.vk.music.ui.subscription.CellItem.<no name provided>.invoke (MusicBuySubscription.kt:187)");
        }
        q630 m = hr80.m(q630Var, f870.c(855638016), vog0.b(12));
        dt1.a.getClass();
        cp10 d = ja8.d(dt1.a.f, false);
        int hashCode = Long.hashCode(n34.n(aVar));
        sy90 D = aVar.D();
        q630 c = qri.c(aVar, m);
        cri.h7.getClass();
        LayoutNode.a aVar2 = cri.a.b;
        if (aVar.N() == null) {
            n34.r();
            throw null;
        }
        aVar.H();
        if (aVar.L()) {
            aVar.I(aVar2);
        } else {
            aVar.f();
        }
        k9q0.w(aVar, d, cri.a.f);
        k9q0.w(aVar, D, cri.a.e);
        k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
        k9q0.t(aVar, cri.a.h);
        k9q0.w(aVar, c, cri.a.d);
        q630 c2 = rdu.c(txj0.r(xcv0.d(i & 14, j), q630.a.a), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.99f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 524283);
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new fa00(this.b, 6);
            aVar.R(x);
        }
        pzu0.b(this.a, null, bu00.e(c2, (izs) x), 0L, aVar, 56, 8);
        aVar.G();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }
}
