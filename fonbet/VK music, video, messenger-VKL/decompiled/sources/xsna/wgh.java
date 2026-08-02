package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CommunityProfileContentDefaultShimmer.kt */
/* loaded from: classes17.dex */
public final class wgh {
    public static final void a(int i, final int i2, long j, androidx.compose.runtime.a aVar, q630 q630Var) {
        int i3;
        long j2;
        final q630 q630Var2;
        int i4;
        q630 q630Var3;
        androidx.compose.runtime.a M = aVar.M(-855350078);
        int i5 = i2 | 182;
        if (M.t(i5 & 1, (i5 & 147) != 146)) {
            M.V();
            int i6 = i2 & 1;
            q630.a aVar2 = q630.a.a;
            if (i6 == 0 || M.i()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j2 = ylu0Var.c().a;
                i3 = 20;
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
                androidx.compose.runtime.b.f(-855350078, i4, -1, "com.vk.community.design.compose.CommunityProfileContentDefaultShimmer (CommunityProfileContentDefaultShimmer.kt:30)");
            }
            for (int i7 = 0; i7 < i3; i7++) {
                float f = 16;
                q630 f2 = txj0.f(s200.E(q630Var3, f, 6), 1.0f);
                a.m mVar = androidx.compose.foundation.layout.a.c;
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
                k9q0.w(M, a, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                q630 d = rte0.d(txj0.f(txj0.h(aVar2, f), 1.0f), vog0.b(4));
                e.a aVar4 = androidx.compose.ui.graphics.e.a;
                f9t.e(hr80.m(d, j2, aVar4), M, 0);
                f9t.e(hr80.m(rte0.d(txj0.f(txj0.h(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, 1, aVar2), 8), 0.35f), vog0.b(2)), j2, aVar4), M, 0);
                M.G();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630Var3;
        } else {
            M.h();
            i3 = i;
            j2 = j;
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final int i8 = i3;
            final long j3 = j2;
            s.d = new wzs(i8, i2, j3, q630Var2) { // from class: xsna.vgh
                public final /* synthetic */ q630 b;
                public final /* synthetic */ int c;
                public final /* synthetic */ long d;

                {
                    this.b = q630Var2;
                    this.d = j3;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    wgh.a(this.c, I, this.d, (androidx.compose.runtime.a) obj, this.b);
                    return s3q0.a;
                }
            };
        }
    }
}
