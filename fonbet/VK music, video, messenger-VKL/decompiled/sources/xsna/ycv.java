package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: HorizontalCategoryGameSkeleton.kt */
/* loaded from: classes17.dex */
public final class ycv {
    public static final void a(final q630 q630Var, boolean z, androidx.compose.runtime.a aVar, final int i, final int i2) {
        final boolean z2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(-1321103378);
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 = i | 48;
            z2 = z;
        } else if ((i & 48) == 0) {
            z2 = z;
            i3 = (M.l(z2) ? 32 : 16) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        int i5 = i3 | 384;
        if (M.t(i5 & 1, (i5 & 147) != 146)) {
            if (i4 != 0) {
                z2 = false;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1321103378, i5, -1, "com.vk.games.presentation.components.skeleton.HorizontalCategoryGameSkeleton (HorizontalCategoryGameSkeleton.kt:18)");
            }
            q630 h = txj0.h(p490.r(txj0.f(s200.H(q630Var, 10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 1.0f), p490.x(M), 12), z2 ? 202 : 184);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, h);
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
            M.K(-1956008600);
            for (int i6 = 0; i6 < 8; i6++) {
                tka.a((i5 & 112) | 902, M, q630.a.a, z2);
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.xcv
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    ycv.a(q630Var, z2, (androidx.compose.runtime.a) obj, I, i2);
                    return s3q0.a;
                }
            };
        }
    }
}
