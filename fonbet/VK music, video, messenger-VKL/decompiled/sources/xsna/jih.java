package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CommunityProfileContentGoodsTileShimmer.kt */
/* loaded from: classes17.dex */
public final class jih {
    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1168442117);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1168442117, i, -1, "com.vk.community.design.compose.tab_shimmer.CommunityProfileContentGoodsTileShimmer (CommunityProfileContentGoodsTileShimmer.kt:32)");
            }
            for (int i2 = 0; i2 < 2; i2++) {
                q630 f = txj0.f(q630Var, 1.0f);
                a.l lVar = androidx.compose.foundation.layout.a.a;
                dt1.a.getClass();
                androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, f);
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
                M.K(41264279);
                for (int i3 = 0; i3 < 2; i3++) {
                    if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    float f2 = 6;
                    q630 H = s200.H(new xpy(1.0f, true), f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
                    int hashCode2 = Long.hashCode(n34.n(M));
                    sy90 D2 = M.D();
                    q630 c2 = qri.c(M, H);
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
                    k9q0.w(M, a2, cri.a.f);
                    k9q0.w(M, D2, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode2), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c2, cri.a.d);
                    float f3 = 3;
                    q630.a aVar4 = q630.a.a;
                    float f4 = 8;
                    q630 d = rte0.d(sua.d(0.8317f, txj0.f(s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, 5), 1.0f), false), vog0.b(f4));
                    long j = wlb0.h(M).c().a;
                    e.a aVar5 = androidx.compose.ui.graphics.e.a;
                    f9t.e(hr80.m(d, j, aVar5), M, 0);
                    f9t.e(hr80.m(rte0.d(txj0.h(txj0.f(aVar4, 0.6f), f4), vog0.b(f4)), wlb0.h(M).c().a, aVar5), M, 0);
                    f9t.e(hr80.m(rte0.d(txj0.h(s200.H(txj0.f(aVar4, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), f4), vog0.b(f3)), wlb0.h(M).c().a, aVar5), M, 0);
                    M.G();
                }
                M.j();
                M.G();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.i(q630Var, i, 6);
        }
    }
}
