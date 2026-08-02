package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.yk8;

/* compiled from: AboutAppHeaderContent.kt */
/* loaded from: classes6.dex */
public final class v1 {
    public static final void a(String str, String str2, String str3, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        float f;
        q630.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1359024881);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | (M.J(str3) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1359024881, i2, -1, "com.vk.superapp.presentation.about.compose.AboutAppHeaderContent (AboutAppHeaderContent.kt:43)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
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
            long j = wlb0.h(M).getBackground().x;
            q630.a aVar4 = q630.a.a;
            e.a aVar5 = androidx.compose.ui.graphics.e.a;
            float f2 = 20;
            float f3 = 0;
            q630 m = hr80.m(rte0.d(txj0.f(s200.H(hr80.m(aVar4, j, aVar5), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 50, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f), vog0.c(f2, f2, f3, f3)), wlb0.h(M).getBackground().g, aVar5);
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, m);
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
            k9q0.w(M, a, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            float f4 = 16;
            yqv0.c(str, s200.H(aVar4, f4, 62, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), wlb0.h(M).getText().m, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).C, M, (i2 & 14) | 100663344, 48, 5880);
            M = M;
            if (drm0.N(str3)) {
                f = f4;
                aVar2 = aVar4;
                M.K(292422997);
            } else {
                M.K(294925627);
                aVar2 = aVar4;
                f = f4;
                b(0, ((i2 >> 6) & 14) | 48, M, str3, s200.H(aVar4, f4, 6, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8));
            }
            M.j();
            f9t.e(txj0.h(aVar2, f), M, 6);
            M.G();
            float f5 = 24;
            q630 a2 = r18.a(4, wlb0.h(M).getBackground().g, hr80.m(rte0.d(txj0.q(s200.H(aVar2, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 100), vog0.b(f5)), wlb0.h(M).getBackground().x, aVar5), vog0.b(f5));
            cp10 d2 = ja8.d(dt1.a.f, false);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, a2);
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
            k9q0.w(M, d2, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            vjw.a(xus.s(str2, 0L, M, (i2 >> 3) & 14, 2), null, rte0.d(txj0.q(aVar2, 98), vog0.b(f5)), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 56, 120);
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new r1(str, str2, str3, q630Var, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(int i, final int i2, androidx.compose.runtime.a aVar, final String str, final q630 q630Var) {
        int i3;
        androidx.compose.runtime.a aVar2;
        final int i4;
        androidx.compose.runtime.a M = aVar.M(-1220035111);
        if ((i2 & 6) == 0) {
            i3 = i2 | (M.J(str) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(q630Var) ? 32 : 16;
        }
        int i5 = i3 | 384;
        if (M.t(i5 & 1, (i5 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1220035111, i5, -1, "com.vk.superapp.presentation.about.compose.ExpandableText (AboutAppHeaderContent.kt:103)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x2);
            }
            wh50 wh50Var2 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = ir.h(M);
            }
            sg50 sg50Var = (sg50) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new s1(wh50Var, 0);
                M.R(x4);
            }
            q630 b = ojc.b(q630Var, sg50Var, null, false, null, (gzs) x4, 28);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b);
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
            frv0 frv0Var = wlb0.l(M).e0;
            long j = wlb0.h(M).getText().p;
            int i6 = ((Boolean) wh50Var.getValue()).booleanValue() ? Integer.MAX_VALUE : 2;
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new t1(0, wh50Var2);
                M.R(x5);
            }
            yqv0.c(str, null, j, null, null, 0, 0, null, 0, false, 0, i6, (izs) x5, frv0Var, M, i5 & 14, 384, 2042);
            aVar2 = M;
            if (((Boolean) wh50Var2.getValue()).booleanValue()) {
                aVar2.K(2134849457);
                ty6 ty6Var = dt1.a.j;
                ra8 ra8Var = ra8.a;
                q630.a aVar4 = q630.a.a;
                q630 b2 = ra8Var.b(aVar4, ty6Var);
                androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.m, aVar2, 48);
                int hashCode2 = Long.hashCode(n34.n(aVar2));
                sy90 D2 = aVar2.D();
                q630 c2 = qri.c(aVar2, b2);
                if (aVar2.N() == null) {
                    n34.r();
                    throw null;
                }
                aVar2.H();
                if (aVar2.L()) {
                    aVar2.I(aVar3);
                } else {
                    aVar2.f();
                }
                k9q0.w(aVar2, a, cVar);
                k9q0.w(aVar2, D2, eVar);
                ur.d(hashCode2, aVar2, bVar, aVar2, c2678a);
                k9q0.w(aVar2, c2, dVar);
                aVar2.K(-100254509);
                float O0 = ((azl) aVar2.r(uvi.h)).O0(wlb0.l(aVar2).e0.a.b.c);
                aVar2.j();
                f9t.e(hr80.l(txj0.h(txj0.v(aVar4, 50), O0), yk8.a.a(e43.l(new l5g(l5g.j), new l5g(wlb0.h(aVar2).getBackground().g)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), null, 6), aVar2, 0);
                yqv0.c(d370.N(R.string.apps_about_description_show_more, 0, aVar2), s200.H(hr80.m(aVar4, wlb0.h(aVar2).getBackground().g, androidx.compose.ui.graphics.e.a), 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), wlb0.h(aVar2).getText().a, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar2).e0, aVar2, 0, 0, 8184);
                aVar2.G();
            } else {
                aVar2.K(2130489679);
            }
            aVar2.j();
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            i4 = 2;
        } else {
            aVar2 = M;
            aVar2.h();
            i4 = i;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.u1
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i2 | 1);
                    v1.b(i4, I, (androidx.compose.runtime.a) obj, str, q630Var);
                    return s3q0.a;
                }
            };
        }
    }
}
