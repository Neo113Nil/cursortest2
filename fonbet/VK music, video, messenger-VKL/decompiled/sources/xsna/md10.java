package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: MarketPropertyCell.kt */
/* loaded from: classes18.dex */
public final class md10 {
    public static final void a(int i, androidx.compose.runtime.a aVar, String str, String str2, q630 q630Var) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(456502552);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(456502552, i2, -1, "com.vk.ecomm.design.compose.MarketPropertyCell (MarketPropertyCell.kt:24)");
            }
            float f = kqu0.b;
            float f2 = kqu0.r;
            q630.a aVar3 = q630.a.a;
            q630 E = s200.E(aVar3, f, f2);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            frv0 frv0Var = wlb0.l(M).Y;
            long j = wlb0.h(M).getText().r;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            yqv0.c(str, new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), j, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, i2 & 14, 0, 8184);
            f9t.e(txj0.v(aVar3, kqu0.v), M, 0);
            frv0 frv0Var2 = wlb0.l(M).Y;
            long j2 = wlb0.h(M).getText().m;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            float f3 = 1.0f;
            if (1.0f > Float.MAX_VALUE) {
                f3 = Float.MAX_VALUE;
            }
            aVar2 = M;
            yqv0.c(str2, new xpy(f3, true), j2, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var2, aVar2, (i2 >> 3) & 14, 0, 8184);
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
            s.d = new w2k(i, 3, str, str2, q630Var2);
        }
    }
}
