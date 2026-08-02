package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import org.chromium.base.version_info.VersionConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: PopularGamesSkeleton.kt */
/* loaded from: classes17.dex */
public final class awb0 {
    public static final void a(int i, androidx.compose.runtime.a aVar, q630 q630Var, boolean z) {
        androidx.compose.runtime.a M = aVar.M(-894985160);
        int i2 = (M.l(z) ? 4 : 2) | i | 384;
        boolean z2 = true;
        boolean z3 = false;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-894985160, i2, -1, "com.vk.games.presentation.components.skeleton.PopularGamesVerticalSkeleton (PopularGamesSkeleton.kt:32)");
            }
            int i3 = z ? 2 : 1;
            int i4 = z ? 3 : 4;
            float f = 1.0f;
            q630 F = s200.F(kqu0.u, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, wdj0.a(txj0.f(q630Var, 1.0f), null));
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.i(16, dt1.a.l), dt1.a.n, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            M.K(-1596093411);
            int i5 = 0;
            while (i5 < i3) {
                q630.a aVar3 = q630.a.a;
                q630 f2 = txj0.f(aVar3, f);
                a.l lVar2 = androidx.compose.foundation.layout.a.a;
                dt1.a.getClass();
                androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar2, dt1.a.k, M, z3 ? 1 : 0);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c2 = qri.c(M, f2);
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
                k9q0.w(M, a2, cri.a.f);
                k9q0.w(M, D2, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode2), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c2, cri.a.d);
                M.K(-2056120226);
                int i6 = z3 ? 1 : 0;
                while (i6 < i4) {
                    if (f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    xpy xpyVar = new xpy(f, z2);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, z3);
                    int hashCode3 = Long.hashCode(n34.n(M));
                    sy90 D3 = M.D();
                    q630 c3 = qri.c(M, xpyVar);
                    cri.h7.getClass();
                    LayoutNode.a aVar5 = cri.a.b;
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar5);
                    } else {
                        M.f();
                    }
                    cri.a.c cVar = cri.a.f;
                    k9q0.w(M, d, cVar);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(M, D3, eVar);
                    Integer valueOf = Integer.valueOf(hashCode3);
                    cri.a.b bVar = cri.a.g;
                    k9q0.w(M, valueOf, bVar);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(M, c2678a);
                    int i7 = i3;
                    cri.a.d dVar = cri.a.d;
                    k9q0.w(M, c3, dVar);
                    q630 f3 = txj0.f(aVar3, f);
                    int i8 = i4;
                    float f4 = 6;
                    int i9 = i6;
                    float f5 = 4;
                    float f6 = 8;
                    q630 G = s200.G(f3, f4, f5, f4, f6);
                    int i10 = i5;
                    androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
                    int hashCode4 = Long.hashCode(n34.n(M));
                    sy90 D4 = M.D();
                    q630 c4 = qri.c(M, G);
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar5);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, a3, cVar);
                    k9q0.w(M, D4, eVar);
                    ur.d(hashCode4, M, bVar, M, c2678a);
                    k9q0.w(M, c4, dVar);
                    float f7 = 12;
                    ja8.a(hr80.m(rte0.d(sua.d(1.0f, txj0.f(aVar3, 1.0f), false), vog0.b(f7)), wlb0.h(M).c().a, androidx.compose.ui.graphics.e.a), M, 0);
                    q630.a aVar6 = aVar3;
                    ja8.a(hr80.m(txj0.s(s200.H(aVar6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), VersionConstants.PRODUCT_MAJOR_VERSION, f7), wlb0.h(M).c().a, vog0.b(f5)), M, 0);
                    float f8 = 2;
                    ja8.a(hr80.m(txj0.s(s200.H(aVar6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 100, f6), wlb0.h(M).c().a, vog0.b(f8)), M, 0);
                    M.G();
                    M.G();
                    i6 = i9 + 1;
                    f = 1.0f;
                    z3 = false;
                    aVar3 = aVar6;
                    i4 = i8;
                    i3 = i7;
                    i5 = i10;
                    z2 = true;
                }
                Object[] objArr = z3 ? 1 : 0;
                M.j();
                M.G();
                i4 = i4;
                i3 = i3;
                z2 = true;
                i5++;
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h1p(i, 1, q630Var, z);
        }
    }
}
