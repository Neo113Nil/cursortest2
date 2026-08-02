package xsna;

import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: AboutAppHeaderError.kt */
/* loaded from: classes6.dex */
public final class x1 {
    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(412135124);
        int i2 = (M.J(q630Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(412135124, i2, -1, "com.vk.superapp.presentation.about.compose.AboutAppHeaderError (AboutAppHeaderError.kt:20)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            q630.a aVar3 = q630.a.a;
            q630 d2 = rte0.d(txj0.f(s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 50, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f), vog0.b(20));
            long j = wlb0.h(M).getBackground().g;
            e.a aVar4 = androidx.compose.ui.graphics.e.a;
            q630 m = hr80.m(d2, j, aVar4);
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, m);
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
            k9q0.w(M, a, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            float f = 16;
            float f2 = 4;
            ja8.a(hr80.m(rte0.d(txj0.s(s200.H(aVar3, f, 62, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), 128, f), vog0.b(f2)), wlb0.h(M).getBackground().x, aVar4), M, 0);
            float f3 = 12;
            ja8.a(hr80.m(rte0.d(txj0.h(txj0.f(s200.H(aVar3, f, 14, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), 1.0f), f3), vog0.b(f2)), wlb0.h(M).getBackground().x, aVar4), M, 0);
            ja8.a(hr80.m(rte0.d(txj0.h(txj0.f(s200.G(aVar3, f, 6, 64, 18), 1.0f), f3), vog0.b(f2)), wlb0.h(M).getBackground().x, aVar4), M, 0);
            M.G();
            float f4 = 24;
            if (dt.c(r18.a(f2, wlb0.h(M).getBackground().g, hr80.m(rte0.d(txj0.q(s200.H(aVar3, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 100), vog0.b(f4)), wlb0.h(M).getBackground().x, aVar4), vog0.b(f4)), M, 0)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new w1(q630Var, i, 0);
        }
    }
}
