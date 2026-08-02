package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: OnboardingPaginationDots.kt */
/* loaded from: classes4.dex */
public final class ie80 {
    public static final void a(final int i, final int i2, final q630 q630Var, androidx.compose.runtime.a aVar, final int i3) {
        q630.a aVar2;
        Throwable th;
        androidx.compose.runtime.a M = aVar.M(-303869234);
        int i4 = (M.o(i) ? 4 : 2) | i3 | (M.o(i2) ? 32 : 16);
        if ((i3 & 384) == 0) {
            i4 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-303869234, i4, -1, "com.vk.onboardingpromo.impl.ui.view.OnboardingPaginationDots (OnboardingPaginationDots.kt:22)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            q630.a aVar4 = q630.a.a;
            q630 E = ahn.E(aVar4, "sliderDots");
            if (androidx.compose.runtime.b.d()) {
                th = null;
                aVar2 = aVar4;
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            } else {
                aVar2 = aVar4;
                th = null;
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 E2 = s200.E(hr80.m(E, ylu0Var.j().a, vog0.a), kqu0.w, kqu0.v);
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.k, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, E2);
            if (M.N() == null) {
                n34.r();
                throw th;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            M.K(2113266772);
            int i5 = 0;
            while (i5 < i) {
                float f = i5 != i + (-1) ? 10 : 0;
                boolean z = i5 == i2;
                q630.a aVar5 = aVar2;
                q630 H = s200.H(aVar5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
                dt1.a.getClass();
                b(z, 8, H.g(new gor0(dt1.a.l)), M, 48);
                i5++;
                aVar2 = aVar5;
            }
            M.j();
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ge80
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i3 | 1);
                    ie80.a(i, i2, q630Var, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final boolean z, final float f, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        long c;
        androidx.compose.runtime.a M = aVar.M(1727649486);
        int i2 = (M.l(z) ? 4 : 2) | i | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1727649486, i2, -1, "com.vk.onboardingpromo.impl.ui.view.PaginationDot (OnboardingPaginationDots.kt:62)");
            }
            if (z) {
                M.K(1812876772);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                c = ylu0Var.getIcon().c;
                M.j();
            } else {
                M.K(1812930929);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                c = l5g.c(14, ylu0Var2.getIcon().c, 0.3f);
                M.j();
            }
            ja8.a(hr80.m(txj0.q(q630Var, f), c, vog0.a), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(z, f, q630Var, i) { // from class: xsna.he80
                public final /* synthetic */ boolean b;
                public final /* synthetic */ float c;
                public final /* synthetic */ q630 d;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(49);
                    ie80.b(this.b, this.c, this.d, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
