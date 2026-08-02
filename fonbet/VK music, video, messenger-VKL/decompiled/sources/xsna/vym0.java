package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.uc50;
import xsna.wzm0;

/* compiled from: SubscriptionMenuItem.kt */
/* loaded from: classes3.dex */
public final class vym0 {
    public static final void a(uc50.b bVar, wzm0 wzm0Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        wzm0 wzm0Var2;
        q630 q630Var2;
        String f;
        androidx.compose.runtime.a M = aVar.M(468825989);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(wzm0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(468825989, i3, -1, "com.vk.music.bottomsheets.track.redesigned.presentation.components.SubscriptionMenuItem (SubscriptionMenuItem.kt:55)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f2 = txj0.f(aVar2, 1.0f);
            boolean z = ((i3 & 112) == 32) | ((i3 & 896) == 256) | ((i3 & 14) == 4);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new j49(wzm0Var, izsVar, bVar, 4);
                M.R(x);
            }
            q630 E = ahn.E(ojc.c(f2, false, null, null, (gzs) x, 15), "subscriptionMenuItem");
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf, bVar2);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            float f3 = 16;
            q630 q = txj0.q(s200.E(aVar2, f3, 15), 28);
            lg90 a2 = pg90.a(bVar.b, 0, M);
            long a3 = bVar.e.a(0, M);
            Integer num = bVar.d;
            if (num == null) {
                M.K(174766401);
                M.j();
                f = null;
            } else {
                f = l4.f(M, 174766402, num, M, 0);
            }
            pzu0.b(a2, f, q, a3, M, 392, 0);
            androidx.compose.foundation.layout.c a4 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.e, dt1.a.n, M, 6);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, aVar2);
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
            k9q0.w(M, a4, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar2, M, c2678a);
            k9q0.w(M, c2, dVar);
            yqv0.c(d370.N(bVar.c, 0, M), s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), wlb0.h(M).getText().m, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).N, M, 100663344, 48, 5880);
            wzm0Var2 = wzm0Var;
            M = M;
            if (wzm0Var2 instanceof wzm0.a) {
                M.K(-789316889);
                yqv0.c(((wzm0.a) wzm0Var2).a, qri.a(s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 9), a5x.a, new thi(2)), wlb0.h(M).getText().m, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).i0, M, 100663296, 48, 5880);
                M = M;
                M.j();
            } else {
                if (!wzm0Var2.equals(wzm0.b.a)) {
                    throw alb0.c(-1965126468, M);
                }
                M.K(-788778171);
                b(8, s200.H(qri.a(aVar2, a5x.a, new pcm(1)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), new pco(190), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 390);
                M.j();
            }
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            wzm0Var2 = wzm0Var;
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tym0(bVar, wzm0Var2, izsVar, q630Var2, i);
        }
    }

    public static final void b(final float f, final q630 q630Var, final pco pcoVar, float f2, androidx.compose.runtime.a aVar, final int i) {
        q630 f3;
        androidx.compose.runtime.a M = aVar.M(1914851075);
        int i2 = (M.J(q630Var) ? 32 : 16) | i | 3072;
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            f2 = 4;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1914851075, i2, -1, "com.vk.music.bottomsheets.track.redesigned.presentation.components.TextSkeleton (SubscriptionMenuItem.kt:119)");
            }
            q630 h = txj0.h(q630Var, f);
            if (pcoVar == null || (f3 = txj0.v(h, pcoVar.b)) == null) {
                f3 = txj0.f(h, 1.0f);
            }
            q630 d = rte0.d(f3, vog0.b(f2));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ja8.a(hr80.m(d, ylu0Var.c().b, androidx.compose.ui.graphics.e.a), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        final float f4 = f2;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(f, q630Var, pcoVar, f4, i) { // from class: xsna.uym0
                public final /* synthetic */ float b;
                public final /* synthetic */ q630 c;
                public final /* synthetic */ pco d;
                public final /* synthetic */ float e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(391);
                    vym0.b(this.b, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
