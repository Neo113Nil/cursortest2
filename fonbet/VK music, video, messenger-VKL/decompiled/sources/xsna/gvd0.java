package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ProfileContentNarrativesShimmer.kt */
/* loaded from: classes17.dex */
public final class gvd0 {
    public static final void a(int i, int i2, final int i3, long j, androidx.compose.runtime.a aVar, q630 q630Var) {
        int i4;
        final int i5;
        long j2;
        q630 q630Var2;
        long j3;
        int i6;
        int i7;
        androidx.compose.runtime.a M = aVar.M(1528101599);
        int i8 = i3 | 1462;
        int i9 = 0;
        boolean z = true;
        if (M.t(i8 & 1, (i8 & 1171) != 1170)) {
            M.V();
            int i10 = i3 & 1;
            q630.a aVar2 = q630.a.a;
            if (i10 == 0 || M.i()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j3 = ylu0Var.c().a;
                i4 = 7;
                i6 = i8 & (-7169);
                q630Var2 = aVar2;
                i7 = 3;
            } else {
                M.h();
                i4 = i;
                j3 = j;
                q630Var2 = q630Var;
                i6 = i8 & (-7169);
                i7 = i2;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1528101599, i6, -1, "com.vk.community.design.compose.ProfileContentNarrativesShimmer (ProfileContentNarrativesShimmer.kt:36)");
            }
            int i11 = 0;
            while (i11 < i4) {
                q630 f = txj0.f(q630Var2, 1.0f);
                a.l lVar = androidx.compose.foundation.layout.a.a;
                dt1.a.getClass();
                androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, i9);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, f);
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
                M.K(1055875364);
                int i12 = 0;
                while (i12 < i7) {
                    if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    q630 F = s200.F(20, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, new xpy(1.0f, z));
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
                    int hashCode2 = Long.hashCode(n34.n(M));
                    sy90 D2 = M.D();
                    q630 c2 = qri.c(M, F);
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
                    long j4 = j3;
                    q630 d = rte0.d(sua.d(1.0f, txj0.f(s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f), false), vog0.a);
                    e.a aVar5 = androidx.compose.ui.graphics.e.a;
                    f9t.e(hr80.m(d, j4, aVar5), M, 0);
                    float f2 = 8;
                    f9t.e(hr80.m(rte0.d(txj0.f(txj0.h(s200.H(s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 5), f2), 1.0f), vog0.b(3)), j4, aVar5), M, 0);
                    M.G();
                    i12++;
                    j3 = j4;
                    i7 = i7;
                    z = true;
                }
                M.j();
                M.G();
                i11++;
                j3 = j3;
                i9 = 0;
                i7 = i7;
                z = true;
            }
            int i13 = i7;
            long j5 = j3;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j2 = j5;
            i5 = i13;
        } else {
            M.h();
            i4 = i;
            i5 = i2;
            j2 = j;
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final int i14 = i4;
            final long j6 = j2;
            final q630 q630Var3 = q630Var2;
            s.d = new wzs(i14, i5, i3, j6, q630Var3) { // from class: xsna.fvd0
                public final /* synthetic */ q630 b;
                public final /* synthetic */ int c;
                public final /* synthetic */ int d;
                public final /* synthetic */ long e;

                {
                    this.b = q630Var3;
                    this.e = j6;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    gvd0.a(this.c, this.d, I, this.e, (androidx.compose.runtime.a) obj, this.b);
                    return s3q0.a;
                }
            };
        }
    }
}
