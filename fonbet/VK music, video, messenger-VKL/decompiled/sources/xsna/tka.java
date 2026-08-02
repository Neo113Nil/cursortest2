package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CategoryGameItemSkeleton.kt */
/* loaded from: classes17.dex */
public final class tka {
    public static final void a(final int i, androidx.compose.runtime.a aVar, final q630 q630Var, final boolean z) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-328865520);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? M.J(null) : M.y(null) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-328865520, i2, -1, "com.vk.games.presentation.components.skeleton.CategoryGameItemSkeleton (CategoryGameItemSkeleton.kt:21)");
            }
            q630 a = wdj0.a(txj0.v(q630Var, 160), null);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, a);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            float f = 6;
            float f2 = 4;
            q630.a aVar3 = q630.a.a;
            ja8.a(hr80.m(txj0.q(s200.H(aVar3, f, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), 148), wlb0.h(M).c().a, vog0.b(16)), M, 0);
            ja8.a(hr80.m(txj0.s(s200.H(aVar3, f, 10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), 100, 12), wlb0.h(M).c().a, vog0.b(f2)), M, 0);
            if (z) {
                M.K(994776543);
                float f3 = 8;
                ja8.a(hr80.m(txj0.s(s200.H(aVar3, f, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), 80, f3), wlb0.h(M).c().a, vog0.b(2)), M, 0);
            } else {
                M.K(993386844);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ska
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    tka.a(ne7.I(i | 1), (androidx.compose.runtime.a) obj, q630Var, z);
                    return s3q0.a;
                }
            };
        }
    }
}
