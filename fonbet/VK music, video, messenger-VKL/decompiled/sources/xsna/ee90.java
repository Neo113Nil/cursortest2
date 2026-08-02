package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: PaginationImpl.kt */
/* loaded from: classes17.dex */
public final class ee90 {
    public static final void a(final boolean z, final float f, androidx.compose.runtime.a aVar, final int i) {
        long c;
        androidx.compose.runtime.a M = aVar.M(-355021758);
        int i2 = (M.l(z) ? 4 : 2) | i | (M.n(f) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-355021758, i2, -1, "com.vk.core.tool.compose.onboarding.fullscreen.PaginationDot (PaginationImpl.kt:59)");
            }
            if (z) {
                M.K(2051370095);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                c = ylu0Var.getIcon().l;
                M.j();
            } else {
                M.K(2051425244);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                c = l5g.c(14, ylu0Var2.getIcon().l, 0.3f);
                M.j();
            }
            ja8.a(hr80.m(txj0.q(s200.F(4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a), f), c, vog0.a), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(f, i, z) { // from class: xsna.ce90
                public final /* synthetic */ boolean b;
                public final /* synthetic */ float c;

                {
                    this.b = z;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    ee90.a(this.b, this.c, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final int i, final int i2, final q630 q630Var, androidx.compose.runtime.a aVar, final int i3) {
        androidx.compose.runtime.a M = aVar.M(1202858770);
        int i4 = (M.o(i) ? 4 : 2) | i3 | (M.o(i2) ? 32 : 16) | 384;
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1202858770, i4, -1, "com.vk.core.tool.compose.onboarding.fullscreen.PaginationDots (PaginationImpl.kt:42)");
            }
            a.c cVar = androidx.compose.foundation.layout.a.e;
            float f = 16;
            q630.a aVar2 = q630.a.a;
            q630 G = s200.G(aVar2, f, 28, f, f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(cVar, dt1.a.l, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, G);
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
            M.K(1981516172);
            int i5 = 0;
            while (i5 < i2) {
                i5++;
                boolean z = i5 == i;
                a(z, z ? 8 : 6, M, 0);
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i, i2, q630Var, i3) { // from class: xsna.de90
                public final /* synthetic */ int b;
                public final /* synthetic */ int c;
                public final /* synthetic */ q630 d;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    ee90.b(this.b, this.c, this.d, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
