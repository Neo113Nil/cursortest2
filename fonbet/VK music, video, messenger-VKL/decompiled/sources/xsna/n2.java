package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wkj;

/* compiled from: AboutAppScreenshotsContent.kt */
/* loaded from: classes6.dex */
public final class n2 {
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    public static final void a(int i, androidx.compose.runtime.a aVar, List list, izs izsVar, q630 q630Var) {
        char c;
        androidx.compose.runtime.a M = aVar.M(-1680279653);
        int i2 = i | (M.y(list) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1680279653, i2, -1, "com.vk.superapp.presentation.about.compose.AboutAppScreenshotsContent (AboutAppScreenshotsContent.kt:39)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, q630Var);
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
            k9q0.w(M, c2, dVar);
            ?? r1 = 0;
            com.vk.core.compose.component.group.header.f a2 = f.a.a(d370.N(R.string.apps_about_app_screenshots_title, 0, M), null, null, null, null, null, null, null, false, M, 805306368, 510);
            M = M;
            com.vk.core.compose.component.group.header.g.b(a2, null, b.c.a, null, null, null, false, M, 384, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            q630.a aVar3 = q630.a.a;
            q630 r = p490.r(txj0.f(txj0.h(s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 290), 1.0f), p490.x(M), 14);
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.k, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, r);
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            f9t.e(txj0.v(aVar3, 10), M, 6);
            M.K(838322682);
            Iterator it = list.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                int i4 = i3 + 1;
                z3 z3Var = (z3) it.next();
                q630.a aVar4 = aVar3;
                float f = 12;
                q630 d = rte0.d(txj0.v(txj0.c(s200.H(aVar4, 6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 1.0f), 145), vog0.b(f));
                boolean o = ((i2 & 112) == 32 ? true : r1) | M.o(i3);
                Object x = M.x();
                if (o || x == a.C0011a.a) {
                    x = new l2(izsVar, i3, 0);
                    M.R(x);
                }
                q630 c4 = ojc.c(d, false, null, null, (gzs) x, 15);
                float f2 = (float) 0.5d;
                if (androidx.compose.runtime.b.d()) {
                    c = 65535;
                    androidx.compose.runtime.b.f(1040687336, r1, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                } else {
                    c = 65535;
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630 a4 = r18.a(f2, ylu0Var.p().a, c4, vog0.b(f));
                dt1.a.getClass();
                cp10 d2 = ja8.d(dt1.a.f, r1);
                int hashCode3 = Long.hashCode(n34.n(M));
                sy90 D3 = M.D();
                q630 c5 = qri.c(M, a4);
                cri.h7.getClass();
                LayoutNode.a aVar5 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar5);
                } else {
                    M.f();
                }
                k9q0.w(M, d2, cri.a.f);
                k9q0.w(M, D3, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode3), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c5, cri.a.d);
                vjw.a(xus.s(z3Var.a, 0L, M, 0, 2), null, rte0.d(txj0.d(aVar4, 1.0f), vog0.b(f)), null, wkj.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 24632, 104);
                M.G();
                aVar3 = aVar4;
                i3 = i4;
                r1 = 0;
            }
            M.j();
            f9t.e(txj0.v(aVar3, 16), M, 6);
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
            s.d = new m2(list, izsVar, q630Var, i, 0);
        }
    }
}
