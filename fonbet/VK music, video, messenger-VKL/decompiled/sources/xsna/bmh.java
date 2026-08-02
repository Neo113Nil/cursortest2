package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CommunityProfileContentWallShimmer.kt */
/* loaded from: classes17.dex */
public final class bmh {
    public static final void a(int i, final int i2, long j, androidx.compose.runtime.a aVar, q630 q630Var) {
        int i3;
        long j2;
        final q630 q630Var2;
        int i4;
        q630 q630Var3;
        androidx.compose.runtime.a M = aVar.M(-1303805996);
        int i5 = i2 | 182;
        int i6 = 0;
        int i7 = 1;
        if (M.t(i5 & 1, (i5 & 147) != 146)) {
            M.V();
            int i8 = i2 & 1;
            q630.a aVar2 = q630.a.a;
            if (i8 == 0 || M.i()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j3 = ylu0Var.c().a;
                i3 = 4;
                j2 = j3;
                i4 = i5 & (-897);
                q630Var3 = aVar2;
            } else {
                M.h();
                i3 = i;
                j2 = j;
                i4 = i5 & (-897);
                q630Var3 = q630Var;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1303805996, i4, -1, "com.vk.community.design.compose.CommunityProfileContentWallShimmer (CommunityProfileContentWallShimmer.kt:36)");
            }
            int i9 = 0;
            while (i9 < i3) {
                float f = 8;
                q630 f2 = txj0.f(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, i7, q630Var3), 1.0f);
                a.m mVar = androidx.compose.foundation.layout.a.c;
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, i6);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, f2);
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
                cri.a.c cVar = cri.a.f;
                k9q0.w(M, a, cVar);
                cri.a.e eVar = cri.a.e;
                k9q0.w(M, D, eVar);
                Integer valueOf = Integer.valueOf(hashCode);
                cri.a.b bVar = cri.a.g;
                k9q0.w(M, valueOf, bVar);
                cri.a.C2678a c2678a = cri.a.h;
                k9q0.t(M, c2678a);
                cri.a.d dVar = cri.a.d;
                k9q0.w(M, c, dVar);
                float f3 = 12;
                int i10 = i9;
                q630 f4 = txj0.f(s200.H(s200.F(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, 7), 1.0f);
                q630 q630Var4 = q630Var3;
                androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c2 = qri.c(M, f4);
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
                k9q0.w(M, a2, cVar);
                k9q0.w(M, D2, eVar);
                ur.d(hashCode2, M, bVar, M, c2678a);
                k9q0.w(M, c2, dVar);
                q630 d = rte0.d(txj0.q(aVar2, 28), vog0.a);
                e.a aVar4 = androidx.compose.ui.graphics.e.a;
                f9t.e(hr80.m(d, j2, aVar4), M, 0);
                float f5 = 3;
                f9t.e(hr80.m(rte0.d(txj0.f(txj0.h(s200.H(aVar2, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), f), 1.0f), vog0.b(f5)), j2, aVar4), M, 0);
                M.G();
                f9t.e(hr80.m(rte0.d(txj0.f(txj0.h(s200.F(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2), f), 1.0f), vog0.b(f5)), j2, aVar4), M, 0);
                f9t.e(hr80.m(rte0.d(txj0.f(txj0.h(s200.H(aVar2, f3, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, 4), f), 0.5f), vog0.b(f5)), j2, aVar4), M, 0);
                f9t.e(hr80.m(sua.d(1.8f, txj0.f(aVar2, 1.0f), false), j2, aVar4), M, 0);
                M.G();
                i9 = i10 + 1;
                i6 = 0;
                q630Var3 = q630Var4;
                i7 = 1;
            }
            q630 q630Var5 = q630Var3;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630Var5;
        } else {
            M.h();
            i3 = i;
            j2 = j;
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final int i11 = i3;
            final long j4 = j2;
            s.d = new wzs(i11, i2, j4, q630Var2) { // from class: xsna.amh
                public final /* synthetic */ q630 b;
                public final /* synthetic */ int c;
                public final /* synthetic */ long d;

                {
                    this.b = q630Var2;
                    this.d = j4;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    bmh.a(this.c, I, this.d, (androidx.compose.runtime.a) obj, this.b);
                    return s3q0.a;
                }
            };
        }
    }
}
