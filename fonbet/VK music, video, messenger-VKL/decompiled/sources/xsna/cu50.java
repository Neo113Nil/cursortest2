package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;
import xsna.yjq0;

/* compiled from: NamesSettings.kt */
/* loaded from: classes5.dex */
public final class cu50 {
    public static final void a(fww fwwVar, yjq0.d dVar, yjq0.f fVar, izs izsVar, q630 q630Var, gzs gzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        izs izsVar2;
        q630 q630Var2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(2071405699);
        if ((i & 6) == 0) {
            i2 = (M.J(fwwVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(fVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        int i4 = i2 | 24576;
        if ((196608 & i) == 0) {
            i4 |= M.y(gzsVar) ? 131072 : 65536;
        }
        if (M.t(i4 & 1, (74899 & i4) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2071405699, i4, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.settings.name.NamesSettings (NamesSettings.kt:28)");
            }
            q630.a aVar2 = q630.a.a;
            float f = 8;
            float f2 = 20;
            q630 m = hr80.m(rte0.d(s200.H(txj0.f(aVar2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 7), vog0.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f2, 3)), wlb0.h(M).getBackground().g, androidx.compose.ui.graphics.e.a);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            float f3 = 16;
            q630 H = s200.H(aVar2, f3, f, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
            ty6.a aVar4 = dt1.a.o;
            int i5 = i4;
            yqv0.c(fwwVar.a, lr.c(aVar4, H), wlb0.h(M).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).C, M, 0, 0, 8120);
            q630Var2 = aVar2;
            a270.a(fwwVar.b, dVar, izsVar, lr.c(aVar4, s200.H(q630Var2, f3, 2, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8)), M, (i5 & 112) | ((i5 >> 3) & 896));
            izsVar2 = izsVar;
            M = M;
            boolean z = fVar.a;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z) {
                M.K(-481432440);
                int i6 = i5 & 7168;
                i3 = 2048;
                boolean z2 = i6 == 2048;
                Object x = M.x();
                if (z2 || x == c0012a) {
                    x = new lq0(izsVar2, 5);
                    M.R(x);
                }
                gzs gzsVar2 = (gzs) x;
                boolean z3 = i6 == 2048;
                Object x2 = M.x();
                if (z3 || x2 == c0012a) {
                    x2 = new mnc(izsVar2, 3);
                    M.R(x2);
                }
                yoq0.a(fVar, gzsVar2, (gzs) x2, null, M, (i5 >> 6) & 14);
                M = M;
            } else {
                i3 = 2048;
                M.K(-483676375);
            }
            M.j();
            String str = fwwVar.c;
            boolean z4 = (i5 & 7168) == i3;
            Object x3 = M.x();
            if (z4 || x3 == c0012a) {
                x3 = new ci6(izsVar2, 1);
                M.R(x3);
            }
            c2m.a((i5 >> 6) & 7168, M, str, gzsVar, (izs) x3, null);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            izsVar2 = izsVar;
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bu50(fwwVar, dVar, fVar, izsVar2, q630Var2, gzsVar, i);
        }
    }
}
