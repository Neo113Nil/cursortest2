package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.skeleton.SkeletonType;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: AuthorHeaderSkeleton.kt */
/* loaded from: classes5.dex */
public final class mb5 {
    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1764480672);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1764480672, i, -1, "com.vk.profile.design.compose.header.skeleton.AuthorAvatarSkeleton (AuthorHeaderSkeleton.kt:90)");
            }
            akv0.a(SkeletonType.Block, q630Var, M, 54);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jb5(q630Var, i, 0);
        }
    }

    public static final void b(final int i, final int i2, androidx.compose.runtime.a aVar, final q630 q630Var) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(-1964369748);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (M.t(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                q630Var = q630.a.a;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1964369748, i3, -1, "com.vk.profile.design.compose.header.skeleton.AuthorHeaderSkeleton (AuthorHeaderSkeleton.kt:29)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(q630Var, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            k9q0.w(M, c, cri.a.d);
            ckv0.a(null, null, nbi.a, M, 384, 3);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.hb5
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    mb5.b(ne7.I(i | 1), i2, (androidx.compose.runtime.a) obj, q630.this);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-502790933);
        int i2 = (M.J(q630Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-502790933, i2, -1, "com.vk.profile.design.compose.header.skeleton.AuthorInfoSkeleton (AuthorHeaderSkeleton.kt:100)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            erv0.a(1, wuv0Var.X0, txj0.f(q630Var, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 6, 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new lb5(q630Var, i, 0);
        }
    }

    public static final void d(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1693826791);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1693826791, i, -1, "com.vk.profile.design.compose.header.skeleton.AuthorPostButtonSkeleton (AuthorHeaderSkeleton.kt:111)");
            }
            akv0.a(SkeletonType.Block, q630Var, M, 54);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new kb5(q630Var, i, 0);
        }
    }

    public static final void e(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(2049921081);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2049921081, i, -1, "com.vk.profile.design.compose.header.skeleton.AuthorPostSkeleton (AuthorHeaderSkeleton.kt:133)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            q630.a aVar3 = q630.a.a;
            q630 F = s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar3, 1.0f));
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(12), dt1.a.l, M, 54);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, F);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            SkeletonType skeletonType = SkeletonType.Block;
            akv0.a(skeletonType, txj0.q(aVar3, 40), M, 54);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            erv0.a(1, wuv0Var.X0, txj0.f(aVar3, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 390, 8);
            M.G();
            akv0.a(skeletonType, txj0.h(s200.H(txj0.f(aVar3, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 400), M, 54);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ib5(q630Var, i, 0);
        }
    }

    public static final void f(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(41531419);
        int i2 = i | 6;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(41531419, i2, -1, "com.vk.profile.design.compose.header.skeleton.AuthorTabsSkeleton (AuthorHeaderSkeleton.kt:121)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.X0;
            q630.a aVar2 = q630.a.a;
            erv0.a(1, frv0Var, txj0.v(aVar2, 80), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 6, 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vp4(q630Var, i, 1);
        }
    }
}
