package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: OwnerContent.kt */
/* loaded from: classes18.dex */
public final class t490 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;

    public t490(String str, String str2, lg90 lg90Var) {
        this.a = androidx.compose.runtime.k.b(str);
        this.b = androidx.compose.runtime.k.b(str2);
        this.c = androidx.compose.runtime.k.b(lg90Var);
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-418453981);
        int i2 = (M.J(q630Var) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-418453981, i2, -1, "com.vk.ecomm.design.compose.tile.impl.description.OwnerContent.Content (OwnerContent.kt:32)");
            }
            q630 j = txj0.j(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630Var);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, j);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            String str = (String) ((zak0) this.a).getValue();
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            yqv0.c(str, new xpy(1.0f, false), wlb0.h(M).getText().s, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).i0, M, 100663296, 48, 5880);
            lg90 lg90Var = (lg90) ((zak0) this.c).getValue();
            if (lg90Var == null) {
                M.K(-1320895661);
                M.j();
                aVar2 = M;
            } else {
                M.K(-1320895660);
                pzu0.b(lg90Var, (String) ((zak0) this.b).getValue(), s200.H(q630.a.a, kqu0.r, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), wlb0.h(M).q().b, M, 8, 0);
                aVar2 = M;
                aVar2.j();
            }
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
            s.d = new pzj(this, q630Var, i, 5);
        }
    }
}
