package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.e3p0;
import xsna.q630;
import xsna.wkj;

/* compiled from: CoverView.kt */
/* loaded from: classes6.dex */
public final class l3k {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(keb0 keb0Var, w7b0 w7b0Var, q630 q630Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        boolean z;
        lg90 l;
        e3p0 e3p0Var = keb0Var.e;
        androidx.compose.runtime.a M = aVar.M(192326160);
        int i3 = i | (M.J(keb0Var) ? 4 : 2) | (M.J(w7b0Var) ? 32 : 16) | (M.J(q630Var) ? 256 : 128) | (M.y(izsVar) ? 2048 : 1024);
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(192326160, i3, -1, "com.vk.video.playlist.playlistscreen.ui.view.CoverView (CoverView.kt:43)");
            }
            q630 E = ahn.E(q630Var, "video_playlist_cover");
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            if (e3p0Var instanceof e3p0.a) {
                M.K(74654326);
                M.j();
            } else {
                if (!(e3p0Var instanceof e3p0.b) && !(e3p0Var instanceof e3p0.c)) {
                    throw alb0.c(2408566, M);
                }
                M.K(74832452);
                e3p0.c cVar = e3p0Var instanceof e3p0.c ? (e3p0.c) e3p0Var : null;
                String str = cVar != null ? cVar.a : null;
                if (str == null) {
                    M.K(74899814);
                    M.j();
                    i2 = i3;
                    z = false;
                    l = null;
                } else {
                    M.K(74899815);
                    i2 = i3;
                    z = false;
                    l = fwu0.l(null, str, null, null, M, 0, 61);
                    M.j();
                }
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = androidx.compose.runtime.k.b(Boolean.FALSE);
                    M.R(x);
                }
                wh50 wh50Var = (wh50) x;
                boolean y = M.y(l) | ((i2 & 112) == 32 ? true : z);
                Object x2 = M.x();
                if (y || x2 == c0012a) {
                    x2 = new k3k(l, w7b0Var, wh50Var, null);
                    M.R(x2);
                }
                bap.f(w7b0Var, l, (wzs) x2, M, ((i2 >> 3) & 14) | 64);
                q630.a aVar3 = q630.a.a;
                if (l != null) {
                    M.K(75394823);
                    q630 d2 = txj0.d(aVar3, 1.0f);
                    Object x3 = M.x();
                    if (x3 == c0012a) {
                        x3 = new vt1(16);
                        M.R(x3);
                    }
                    vjw.a(l, null, bu00.f(d2, (izs) x3), null, wkj.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 24632, 104);
                    boolean z2 = ((Boolean) wh50Var.getValue()).booleanValue() && w7b0Var != null;
                    q630 E2 = s200.E(ra8.a.b(aVar3, dt1.a.i), 16, 12);
                    rpp e = anp.e(jq2.d(250, 0, null, 6), 2);
                    dtp0 d3 = jq2.d(250, 0, null, 6);
                    Object x4 = M.x();
                    if (x4 == c0012a) {
                        x4 = new gt(15);
                        M.R(x4);
                    }
                    mm2.f(z2, E2, e.b(anp.l(d3, (izs) x4)), null, null, kai.c(956890358, new sp7(1, w7b0Var, izsVar), M), M, 196992, 24);
                    M = M;
                    M.j();
                } else {
                    M.K(77301788);
                    ckv0.a(txj0.d(aVar3, 1.0f), null, lei.a, M, 390, 2);
                    M = M;
                    M.j();
                }
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
            s.d = new lhf(keb0Var, w7b0Var, q630Var, izsVar, i);
        }
    }
}
