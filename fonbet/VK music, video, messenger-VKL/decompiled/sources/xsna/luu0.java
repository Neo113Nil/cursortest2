package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;
import xsna.xyq;

/* compiled from: VkFeedFooter.kt */
/* loaded from: classes18.dex */
public final class luu0 {
    public static final void a(final xyq.e eVar, final xyq.c cVar, xyq.c cVar2, xyq.b bVar, final q630 q630Var, final xyq xyqVar, float f, float f2, androidx.compose.runtime.a aVar, final int i) {
        xyq.c cVar3;
        float f3;
        final float f4;
        float f5;
        int i2;
        final xyq.b bVar2 = bVar;
        androidx.compose.runtime.a M = aVar.M(-1772691808);
        int i3 = i | (M.J(eVar) ? 4 : 2) | (M.J(cVar) ? 32 : 16) | (M.J(cVar2) ? 256 : 128) | (M.J(bVar2) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192) | (M.J(xyqVar) ? 131072 : 65536) | 4718592;
        if (M.t(i3 & 1, (4793491 & i3) != 4793490)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                f5 = 8;
                i2 = i3 & (-33030145);
                f3 = 8;
            } else {
                M.h();
                i2 = i3 & (-33030145);
                f3 = f;
                f5 = f2;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1772691808, i2, -1, "com.vk.feed.design.compose.newsfeed.footer.VkFeedFooter (VkFeedFooter.kt:27)");
            }
            q630 f6 = txj0.f(q630Var, 1.0f);
            dt1.a.getClass();
            ty6.b bVar3 = dt1.a.l;
            a.l lVar = androidx.compose.foundation.layout.a.a;
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, bVar3, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f6);
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
            cri.a.c cVar4 = cri.a.f;
            k9q0.w(M, a, cVar4);
            cri.a.e eVar2 = cri.a.e;
            k9q0.w(M, D, eVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar4 = cri.a.g;
            k9q0.w(M, valueOf, bVar4);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            int i4 = i2;
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            float f7 = 0;
            float f8 = f5;
            q630 H = s200.H(txj0.x(f7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, bVar3, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, H);
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
            k9q0.w(M, a2, cVar4);
            k9q0.w(M, D2, eVar2);
            ur.d(hashCode2, M, bVar4, M, c2678a);
            k9q0.w(M, c2, dVar);
            if (eVar != null) {
                M.K(238087959);
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                xyq.a.a(s200.H(txj0.x(f7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, 5), eVar, M, (i4 << 3) & 112);
            } else {
                M.K(236470906);
            }
            M.j();
            q630.a aVar3 = q630.a.a;
            if (cVar != null) {
                M.K(238375453);
                xyq.a.a(s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, 5), cVar, M, (i4 & 112) | 6);
            } else {
                M.K(236470906);
            }
            M.j();
            if (cVar2 != null) {
                M.K(238501375);
                cVar3 = cVar2;
                xyq.a.a(s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, 5), cVar3, M, ((i4 >> 3) & 112) | 6);
            } else {
                cVar3 = cVar2;
                M.K(236470906);
            }
            M.j();
            if (bVar != null) {
                M.K(238623360);
                bVar2 = bVar;
                xyq.a.a(s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, 5), bVar2, M, 6 | ((i4 >> 6) & 112));
            } else {
                bVar2 = bVar;
                M.K(236470906);
            }
            M.j();
            M.G();
            if (xyqVar != null) {
                M.K(-1969717460);
                xyq.a.a(s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), xyqVar, M, (i4 >> 12) & 112);
            } else {
                M.K(-1971999618);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            f4 = f8;
        } else {
            cVar3 = cVar2;
            M.h();
            f3 = f;
            f4 = f2;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final xyq.c cVar5 = cVar3;
            final float f9 = f3;
            s.d = new wzs(cVar, cVar5, bVar2, q630Var, xyqVar, f9, f4, i) { // from class: xsna.kuu0
                public final /* synthetic */ xyq.c c;
                public final /* synthetic */ xyq.c d;
                public final /* synthetic */ xyq.b e;
                public final /* synthetic */ q630 f;
                public final /* synthetic */ xyq g;
                public final /* synthetic */ float h;
                public final /* synthetic */ float i;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    luu0.a(xyq.e.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
