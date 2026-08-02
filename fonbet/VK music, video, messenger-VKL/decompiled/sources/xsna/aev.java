package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: HorizontalGameBannerSkeleton.kt */
/* loaded from: classes17.dex */
public final class aev {
    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-692800518);
        int i2 = i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-692800518, i2, -1, "com.vk.games.presentation.components.skeleton.GameBannerSkeleton (HorizontalGameBannerSkeleton.kt:25)");
            }
            float c = vbh0.c(M);
            boolean n = M.n(c);
            Object x = M.x();
            if (n || x == a.C0011a.a) {
                x = new pco(0.5625f * c);
                M.R(x);
            }
            float f = ((pco) x).b;
            q630 a = wdj0.a(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 1, txj0.f(q630Var, 1.0f)), null);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, a);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            q630.a aVar3 = q630.a.a;
            q630 s = txj0.s(aVar3, c, f);
            float f2 = zdv.a;
            float f3 = 12;
            ja8.a(hr80.m(kci.m((-c) - f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, s), wlb0.h(M).c().a, vog0.b(f3)), M, 0);
            ja8.a(hr80.m(txj0.s(aVar3, c, f), wlb0.h(M).c().a, vog0.b(f3)), M, 0);
            if (dt.c(hr80.m(kci.m(c + f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.s(aVar3, c, f)), wlb0.h(M).c().a, vog0.b(f3)), M, 0)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new th3(q630Var, i, 2);
        }
    }
}
