package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cp8;
import xsna.cri;
import xsna.dt1;
import xsna.ee30;
import xsna.q630;
import xsna.ty6;

/* compiled from: MovieInfoView.kt */
/* loaded from: classes16.dex */
public final class ie30 {
    public static final void a(ee30 ee30Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        androidx.compose.runtime.a M = aVar.M(1479417908);
        if ((i & 6) == 0) {
            i2 = (M.J(ee30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1479417908, i2, -1, "com.vk.catalog.mvi.block.video.impl.movies.detail.info.MovieInfo (MovieInfoView.kt:159)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar2 = dt1.a.n;
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, aVar2, M, 0);
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
            List list = ee30Var.d;
            boolean J = M.J(list);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                i3 = i2;
                Pair pair = new Pair(j5g.H0(new wow(list), 5), j5g.S(new wow(list), 5));
                M.R(pair);
                x = pair;
            } else {
                i3 = i2;
            }
            Pair pair2 = (Pair) x;
            List list2 = (List) pair2.d();
            List list3 = (List) pair2.g();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(kqu0.t), aVar2, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630.a aVar4 = q630.a.a;
            q630 c2 = qri.c(M, aVar4);
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
            M.K(-1815218138);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                b((ee30.a) it.next(), M, 0);
            }
            M.j();
            M.G();
            boolean z = ee30Var.e;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new b40(27);
                M.R(x2);
            }
            rpp b = anp.m(null, (izs) x2, 1).b(anp.d(null, null, null, 15));
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new b40(27);
                M.R(x3);
            }
            boolean z2 = true;
            mm2.b(r9g.a, z, null, b, anp.p(1, (izs) x3).b(anp.k(null, null, 15)), null, kai.c(-1497287038, new he30(list3, 0), M), M, 1600518, 18);
            if (ee30Var.f) {
                M.K(-1876205550);
                f9t.e(txj0.h(aVar4, kqu0.w), M, 0);
                ButtonSize buttonSize = ButtonSize.Small;
                ButtonStyle buttonStyle = ButtonStyle.Outline;
                ButtonAppearance buttonAppearance = ButtonAppearance.Neutral;
                if (ee30Var.e) {
                    i4 = -337604650;
                    i5 = R.string.movie_info_collapse;
                } else {
                    i4 = -337602412;
                    i5 = R.string.movie_info_expand;
                }
                String a3 = zq.a(M, i4, i5, M, 0);
                Object x4 = M.x();
                if (x4 == c0012a) {
                    x4 = new tr0(29);
                    M.R(x4);
                }
                gio0 a4 = cp8.d.a.a(a3, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), M, 3072, 4);
                q630 E = ahn.E(aVar4, "movie_info_expand_collapse_button");
                boolean z3 = (i3 & 112) == 32;
                if ((i3 & 14) != 4) {
                    z2 = false;
                }
                boolean z4 = z3 | z2;
                Object x5 = M.x();
                if (z4 || x5 == c0012a) {
                    x5 = new p5(15, izsVar, ee30Var);
                    M.R(x5);
                }
                bhu0.d((gzs) x5, buttonStyle, buttonAppearance, E, buttonSize, null, null, a4, false, null, M, 28080, 3936);
                M = M;
            } else {
                M.K(-1883269768);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ec2(i, 2, ee30Var, izsVar, q630Var);
        }
    }

    public static final void b(ee30.a aVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a aVar3;
        androidx.compose.runtime.a M = aVar2.M(174016896);
        int i2 = (M.J(aVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(174016896, i2, -1, "com.vk.catalog.mvi.block.video.impl.movies.detail.info.MovieInfoField (MovieInfoView.kt:215)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            a.j g = androidx.compose.foundation.layout.a.g(kqu0.v);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(g, dt1.a.k, M, 0);
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
            String a2 = aVar.a.a(0, M);
            frv0 frv0Var = wlb0.l(M).i0;
            long j = wlb0.h(M).getText().p;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            yqv0.c(a2, new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), j, null, null, 0, 0, null, 2, false, 0, 2, null, frv0Var, M, 100663296, 48, 5880);
            String a3 = aVar.b.a(0, M);
            frv0 frv0Var2 = wlb0.l(M).i0;
            long j2 = wlb0.h(M).getText().m;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            aVar3 = M;
            yqv0.c(a3, new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), j2, null, null, 0, 0, null, 2, false, 0, 2, null, frv0Var2, aVar3, 100663296, 48, 5880);
            aVar3.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new bt3(aVar, i, 10);
        }
    }
}
