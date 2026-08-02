package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.viewer.impl.grid.toolbar.profile.swap.utils.shadow.CustomShadowParams;
import com.vk.clips.viewer.impl.grid.toolbar.profile.swap.utils.shadow.GradientParams;
import com.vk.clips.viewer.impl.grid.toolbar.profile.swap.utils.shadow.Shadow;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: FullToolbar.kt */
/* loaded from: classes17.dex */
public final class qws {
    public static final float a = 8;

    public static final void a(final boolean z, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(659788486);
        int i2 = (M.l(z) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(659788486, i2, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.placeholder.ButtonsPlaceholder (FullToolbar.kt:109)");
            }
            float d = r490.d(R.dimen.clips_profile_switch_horizontal_padding, M);
            float d2 = r490.d(R.dimen.clips_profile_switch_horizontal_padding, M);
            q630.a aVar2 = q630.a.a;
            q630 H = s200.H(aVar2, d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, d2, 12, 2);
            dt1.a.getClass();
            cp10 d3 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
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
            k9q0.w(M, d3, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z) {
                M.K(-1646376704);
                q630 f = txj0.f(aVar2, 1.0f);
                androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.k, M, 0);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c2 = qri.c(M, f);
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
                Object x = M.x();
                if (x == c0012a) {
                    x = new fgi(4);
                    M.R(x);
                }
                q630 i3 = dd80.i(aVar2, (yzs) x);
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new lk(16);
                    M.R(x2);
                }
                gud0.e((gzs) x2, i3, null, null, false, null, M, 6, 60);
                f9t.e(txj0.v(aVar2, 8), M, 6);
                Object x3 = M.x();
                if (x3 == c0012a) {
                    x3 = new gbi(5);
                    M.R(x3);
                }
                q630 i4 = dd80.i(aVar2, (yzs) x3);
                Object x4 = M.x();
                if (x4 == c0012a) {
                    x4 = new com.vk.movika.sdk.base.logic.interactor.m(13);
                    M.R(x4);
                }
                gud0.e((gzs) x4, i4, null, null, false, null, M, 6, 60);
                M.G();
                M.j();
            } else {
                M.K(-1646554799);
                q630 f2 = txj0.f(aVar2, 1.0f);
                Object x5 = M.x();
                if (x5 == c0012a) {
                    x5 = new qe3(22);
                    M.R(x5);
                }
                gud0.e((gzs) x5, f2, null, null, false, null, M, 54, 60);
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(z, i) { // from class: xsna.pws
                public final /* synthetic */ boolean b;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    qws.a(this.b, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final boolean z, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1502757134);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1502757134, i2, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.placeholder.PlaceholderContent (FullToolbar.kt:37)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c = qri.c(M, aVar2);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f = 20;
            shu0.a(s200.H(txj0.f(aVar2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), vog0.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, 3), ylu0Var.getBackground().g, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(-755947143, new wzs() { // from class: xsna.nws
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar4.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-755947143, intValue, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.placeholder.PlaceholderContent.<anonymous>.<anonymous> (FullToolbar.kt:46)");
                        }
                        a.m mVar2 = androidx.compose.foundation.layout.a.c;
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar2, dt1.a.n, aVar4, 0);
                        int hashCode2 = Long.hashCode(n34.n(aVar4));
                        sy90 D2 = aVar4.D();
                        q630.a aVar5 = q630.a.a;
                        q630 c2 = qri.c(aVar4, aVar5);
                        cri.h7.getClass();
                        LayoutNode.a aVar6 = cri.a.b;
                        if (aVar4.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar4.H();
                        if (aVar4.L()) {
                            aVar4.I(aVar6);
                        } else {
                            aVar4.f();
                        }
                        k9q0.w(aVar4, a3, cri.a.f);
                        k9q0.w(aVar4, D2, cri.a.e);
                        k9q0.w(aVar4, Integer.valueOf(hashCode2), cri.a.g);
                        k9q0.t(aVar4, cri.a.h);
                        k9q0.w(aVar4, c2, cri.a.d);
                        float f2 = 20;
                        shu0.a(s200.H(txj0.f(aVar5, 1.0f), r490.d(R.dimen.clips_profile_switch_horizontal_padding, aVar4), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r490.d(R.dimen.clips_profile_switch_horizontal_padding, aVar4), qws.a, 2).g(new x4j0(new CustomShadowParams("Card Shadow", e43.l(new Shadow(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, cn70.d(24), cn70.d(36), -16777216, 0.02f, GradientParams.a.a()), new Shadow(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, cn70.d(36), -16777216, 0.01f, GradientParams.a.a()), new Shadow(cn70.d(24), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, cn70.d(36), -16777216, 0.02f, GradientParams.a.a()), new Shadow(cn70.d(-24), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, cn70.d(36), -16777216, 0.02f, GradientParams.a.a()))), f2)), vog0.b(f2), 0L, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, yfi.a, aVar4, 1572864, 60);
                        boolean z2 = z;
                        f9t.e(txj0.h(aVar5, z2 ? 38 : 12), aVar4, 0);
                        qws.a(z2, aVar4, 0);
                        aVar4.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 1572870, 56);
            f9t.e(txj0.h(aVar2, 10), M, 6);
            jyj.a(z ? 4 : 3, 0, M);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ows
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    qws.b(z, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
