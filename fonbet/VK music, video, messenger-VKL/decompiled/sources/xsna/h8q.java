package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ExpandableLinkedText.kt */
/* loaded from: classes3.dex */
public final class h8q {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(us2 us2Var, q630 q630Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        float f;
        q630.a aVar2;
        ljo0 ljo0Var;
        androidx.compose.runtime.a M = aVar.M(-1324644864);
        int i2 = i | (M.J(us2Var) ? 4 : 2) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1324644864, i2, -1, "com.vk.music.playlist.framework.presentation.ExpandableLinkedText (ExpandableLinkedText.kt:46)");
            }
            Object[] objArr = new Object[0];
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new f20(15);
                M.R(x);
            }
            wh50 wh50Var = (wh50) crx0.A(objArr, (gzs) x, M, 48);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(null);
                M.R(x2);
            }
            wh50 wh50Var2 = (wh50) x2;
            q630 m = hr80.m(rte0.d(txj0.f(q630Var, 1.0f), vog0.b(20)), wlb0.h(M).getBackground().g, androidx.compose.ui.graphics.e.a);
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
            float f2 = 16;
            q630.a aVar4 = q630.a.a;
            q630 a2 = xp2.a(s200.H(aVar4, f2, f2, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), null, 3);
            frv0 frv0Var = wlb0.l(M).c0;
            long l = l2l0.l(15);
            long j = wlb0.h(M).getText().m;
            int i3 = ((Boolean) wh50Var.getValue()).booleanValue() ? Integer.MAX_VALUE : 2;
            obo0 obo0Var = new obo0(5);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new g8q(0, wh50Var2);
                M.R(x3);
            }
            izs izsVar2 = (izs) x3;
            int i4 = i2 & 14;
            boolean z = (i4 == 4) | ((i2 & 896) == 256);
            Object x4 = M.x();
            if (z || x4 == c0012a) {
                x4 = new az2(12, (Object) us2Var, (Object) izsVar);
                M.R(x4);
            }
            vku0.a(us2Var, a2, j, l, 0L, obo0Var, 0L, null, 2, false, i3, izsVar2, null, (izs) x4, null, frv0Var, M, i4 | 3072, 1575936, 678896);
            if (((Boolean) wh50Var.getValue()).booleanValue() || (ljo0Var = (ljo0) wh50Var2.getValue()) == null || !ljo0Var.e()) {
                M = M;
                f = f2;
                aVar2 = aVar4;
                M.K(316025976);
            } else {
                M.K(319111561);
                q630 H = s200.H(aVar4, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
                f = f2;
                Object x5 = M.x();
                if (x5 == c0012a) {
                    x5 = ir.h(M);
                }
                sg50 sg50Var = (sg50) x5;
                mlg0 a3 = qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 0L, false);
                boolean J = M.J(wh50Var);
                Object x6 = M.x();
                if (J || x6 == c0012a) {
                    x6 = new h3(3, wh50Var);
                    M.R(x6);
                }
                aVar2 = aVar4;
                yqv0.a(d370.N(R.string.playlist_summary_show_more, 0, M), ojc.b(H, sg50Var, a3, false, null, (gzs) x6, 28), wlb0.h(M).getText().f, l2l0.l(15), null, null, 0L, 5, 0L, null, 0, false, 0, 0, null, wlb0.l(M).P, M, 3072, 0, 523248);
                M = M;
            }
            M.j();
            if (xga0.c(aVar2, f, M, 6)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jk1(us2Var, q630Var, izsVar, i);
        }
    }
}
