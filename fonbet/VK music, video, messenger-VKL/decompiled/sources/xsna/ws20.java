package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: MixItemWithBackground.kt */
/* loaded from: classes3.dex */
public final class ws20 {
    public static final long a = f870.d(4281169141L);

    public static final void a(String str, String str2, String str3, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-578918798);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | (M.y(gzsVar) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-578918798, i2, -1, "com.vk.music.bottomsheets.track.redesigned.presentation.components.MixItemWithBackground (MixItemWithBackground.kt:34)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new ts20(0);
                M.R(x);
            }
            ts20 ts20Var = (ts20) x;
            float f = 4;
            q630.a aVar2 = q630.a.a;
            q630 f2 = txj0.f(txj0.h(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 1, aVar2), 110), 1.0f);
            boolean z = (i2 & 7168) == 2048;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new us20(0, gzsVar);
                M.R(x2);
            }
            q630 c = ojc.c(f2, false, null, null, (gzs) x2, 15);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, c);
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
            k9q0.w(M, c2, dVar);
            u4j0.a(a, ts20Var, null, M, 54);
            q630 b = ra8.a.b(s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 7), dt1.a.f);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, b);
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
            k9q0.w(M, c3, dVar);
            q630 E = ahn.E(new gcv(dt1.a.o), str3);
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.k, M, 0);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c4 = qri.c(M, E);
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            gor0 gor0Var = new gor0(dt1.a.l);
            qzu0.a.getClass();
            lg90 d1 = qzu0.d1(M);
            M = M;
            pzu0.b(d1, null, gor0Var, l5g.d, M, 3128, 0);
            q630 D4 = s200.D(aVar2, f);
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object x3 = M.x();
            if (z2 || x3 == c0012a) {
                x3 = new wj2(str, 2);
                M.R(x3);
            }
            yqv0.c(str, egi0.b(D4, false, (izs) x3), wlb0.h(M).getText().d, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).p, M, i3, 0, 8184);
            M.G();
            boolean z3 = (i2 & 112) == 32;
            Object x4 = M.x();
            if (z3 || x4 == c0012a) {
                x4 = new xj2(str2, 1);
                M.R(x4);
            }
            yqv0.c(str2, egi0.b(aVar2, false, (izs) x4), wlb0.h(M).getText().d, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).Y, M, ((i2 >> 3) & 14) | 100663296, 48, 5880);
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vs20(str, str2, str3, gzsVar, i);
        }
    }
}
