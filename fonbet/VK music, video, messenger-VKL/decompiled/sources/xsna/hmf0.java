package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;
import xsna.gfp0;
import xsna.q630;

/* compiled from: RedesignedTrackInfoBlock.kt */
/* loaded from: classes3.dex */
public final class hmf0 {
    public static final void a(gfp0.b.c cVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1004487174);
        if ((i & 6) == 0) {
            i2 = i | (M.J(cVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1004487174, i3, -1, "com.vk.music.stickyplayer.presentation.redesignedcomponents.TrackInfoBlock (RedesignedTrackInfoBlock.kt:20)");
            }
            q630.a aVar3 = q630.a.a;
            q630 f = txj0.f(aVar3, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            yqv0.c(cVar.c, null, wlb0.h(M).getText().d, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).f, M, 0, 0, 8186);
            f9t.e(txj0.h(aVar3, 4), M, 6);
            boolean z = (i3 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new dz7(izsVar, 5);
                M.R(x);
            }
            aVar2 = M;
            yqv0.c(cVar.d, ojc.c(aVar3, false, null, null, (gzs) x, 15), wlb0.h(aVar2).getText().d, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar2).f, aVar2, 0, 0, 8184);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new le1(i, 1, cVar, izsVar, q630Var2);
        }
    }
}
