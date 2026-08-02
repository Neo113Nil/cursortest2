package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.fullscreenvideo.ControlsState;
import com.vk.fullscreenvideo.a;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: FullscreenBottomControls.kt */
/* loaded from: classes16.dex */
public final class qxs {
    public static final void a(ControlsState.a aVar, gzs gzsVar, q630 q630Var, izs izsVar, androidx.compose.runtime.a aVar2, int i) {
        boolean z;
        ControlsState.a aVar3 = aVar;
        ControlsState.c cVar = aVar3.i;
        boolean z2 = aVar3.j;
        androidx.compose.runtime.a M = aVar2.M(-206941646);
        int i2 = i | (M.J(aVar3) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.y(izsVar) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-206941646, i2, -1, "com.vk.fullscreenvideo.bottom.FullscreenBottomControls (FullscreenBottomControls.kt:44)");
            }
            float f = 6;
            q630 H = s200.H(txj0.C(q630Var, null, 3), f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, z2 ? 10 : 18, 2);
            a.j g = androidx.compose.foundation.layout.a.g(8);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(g, dt1.a.l, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
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
            rqj rqjVar = new rqj(8, false, aVar3.j, aVar3.g, false);
            eqj eqjVar = new eqj(cVar.c == ControlsState.Like.LIKED, cVar.h, aVar3.e);
            int i3 = i2 & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(220027335, i3, -1, "com.vk.fullscreenvideo.bottom.shouldShowCounters (FullscreenBottomControls.kt:125)");
            }
            M.K(992875471);
            xow<a.d> xowVar = aVar3.h;
            ArrayList arrayList = new ArrayList();
            Iterator<a.d> it = xowVar.iterator();
            while (it.hasNext()) {
                dqj b = qqj.b(it.next(), cVar, new rqj(8, false, aVar3.j, aVar3.g, false), M, 0);
                if (b != null) {
                    arrayList.add(b);
                }
            }
            M.j();
            if (aVar3.c && !arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    a.d dVar = ((dqj) it2.next()).c;
                    if ((dVar instanceof a.d.b) && !(dVar instanceof a.d.b.c) && ((a.d.b) dVar).a > 0) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i4 = (!z || z2) ? 8 : 4;
            xow<a.d> xowVar2 = aVar3.h;
            ControlsState.c cVar2 = aVar3.i;
            a.j g2 = androidx.compose.foundation.layout.a.g(i4);
            dt1.a.getClass();
            ty6.a aVar5 = dt1.a.n;
            q630.a aVar6 = q630.a.a;
            aVar3 = aVar;
            qqj.a(xowVar2, cVar2, kai.c(-522638768, new kxs(0, aVar, eqjVar, gzsVar, izsVar), M), rqjVar, txj0.C(aVar6, aVar5, 2), g2, M, 24960, 0);
            M = M;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            f9t.e(new xpy(1.0f, true), M, 0);
            q630 C = txj0.C(aVar6, dt1.a.p, 2);
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, C);
            cri.h7.getClass();
            LayoutNode.a aVar7 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar7);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode2), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            c(aVar3.d, z2 || aVar3.b, izsVar, aVar6, M, ((i2 >> 3) & 896) | 3072);
            dqj b2 = qqj.b(a.d.f.a, cVar, rqjVar, M, 6);
            f9t.e(txj0.v(aVar6, b2 != null ? 18 : 10), M, 0);
            if (b2 != null) {
                M.K(-1373169127);
                bqj.a(b2, izsVar, txj0.q(ahn.E(aVar6, ods0.b(b2.c)), 36), false, f, null, gzsVar, M, ((i2 >> 6) & 112) | 24576 | ((i2 << 15) & 3670016), 40);
                M = M;
                mq.d(aVar6, 1, M, 6);
            } else {
                M.K(-1377745192);
                M.j();
            }
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new lxs(aVar3, gzsVar, q630Var, izsVar, i);
        }
    }

    public static final void b(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(575369141);
        int i2 = (M.J(q630Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(575369141, i2, -1, "com.vk.fullscreenvideo.bottom.InfoView (FullscreenBottomControls.kt:181)");
            }
            a.c cVar = androidx.compose.foundation.layout.a.e;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(cVar, dt1.a.p, M, 54);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 E = ahn.E(q630.a.a, "similar_preview_title");
            String N = d370.N(R.string.video_watch_similar_videos_text, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.l0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(N, E, ylu0Var.getText().d, null, null, 0, 6, null, 0, false, 0, 0, null, frv0Var, aVar2, 48, 0, 8120);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new oxs(q630Var, i, 0);
        }
    }

    public static final void c(final xow xowVar, final boolean z, final izs izsVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar;
        q630.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-739501079);
        if ((i & 6) == 0) {
            i2 = (M.J(xowVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-739501079, i2, -1, "com.vk.fullscreenvideo.bottom.SimilarBlock (FullscreenBottomControls.kt:149)");
            }
            if (xowVar.isEmpty()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    wzsVar = new mxs(xowVar, z, izsVar, q630Var, i);
                    s.d = wzsVar;
                }
                return;
            }
            s3q0 s3q0Var = s3q0.a;
            int i3 = i2 & 896;
            boolean z2 = i3 == 256;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new pxs(izsVar, null);
                M.R(x);
            }
            bap.g(s3q0Var, (wzs) x, M, 6);
            a.d dVar = androidx.compose.foundation.layout.a.b;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(dVar, dt1.a.l, M, 54);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630.a aVar4 = q630.a.a;
            if (z) {
                M.K(1431219434);
                boolean z3 = i3 == 256;
                Object x2 = M.x();
                if (z3 || x2 == c0012a) {
                    x2 = new y6h(izsVar, 1);
                    M.R(x2);
                }
                q630 c2 = ojc.c(aVar4, false, null, null, (gzs) x2, 15);
                aVar2 = aVar4;
                b(c2, M, 0);
                mq.d(aVar2, 12, M, 6);
            } else {
                aVar2 = aVar4;
                M.K(1424889141);
                M.j();
            }
            q630 d = rte0.d(ahn.E(aVar2, "similar_preview"), vog0.b(8));
            boolean z4 = i3 == 256;
            Object x3 = M.x();
            if (z4 || x3 == c0012a) {
                x3 = new c97(izsVar, 3);
                M.R(x3);
            }
            rok0.c(xowVar, ojc.c(d, false, null, null, (gzs) x3, 15), M, i2 & 14);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            wzsVar = new wzs() { // from class: xsna.nxs
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    qxs.c(xow.this, z, izsVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
            s.d = wzsVar;
        }
    }
}
