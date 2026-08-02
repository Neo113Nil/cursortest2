package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.catalog.mvi.block.video.impl.movies.detail.actors.MovieActorsView$MovieActorsState;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;

/* compiled from: MovieActorsView.kt */
/* loaded from: classes16.dex */
public final class vc30 {
    public static final void a(MovieActorsView$MovieActorsState movieActorsView$MovieActorsState, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(996941308);
        int i4 = 2;
        if ((i & 6) == 0) {
            i2 = (M.J(movieActorsView$MovieActorsState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        boolean z = true;
        int i5 = 0;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            int i6 = -1;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(996941308, i2, -1, "com.vk.catalog.mvi.block.video.impl.movies.detail.actors.MovieActors (MovieActorsView.kt:91)");
            }
            List<String> list = movieActorsView$MovieActorsState.d;
            boolean J = M.J(list);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                int size = (list.size() + 1) / 2;
                x = new wow(rl3.u0(new wow[]{new wow(list.subList(0, size)), new wow(list.subList(size, list.size()))}));
                M.R(x);
            }
            List<T> list2 = ((wow) x).b;
            a.l lVar = androidx.compose.foundation.layout.a.a;
            a.j g = androidx.compose.foundation.layout.a.g(kqu0.v);
            q630 E = ahn.E(q630Var, "movie_actors_root");
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(g, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            Iterator a2 = yu50.a(M, c, cri.a.d, -568945171, list2);
            while (a2.hasNext()) {
                List<T> list3 = ((wow) a2.next()).b;
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                xpy xpyVar = new xpy(1.0f, z);
                a.l lVar2 = androidx.compose.foundation.layout.a.a;
                a.j g2 = androidx.compose.foundation.layout.a.g(kqu0.v);
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(g2, dt1.a.n, M, i5);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c2 = qri.c(M, xpyVar);
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
                k9q0.w(M, a3, cri.a.f);
                k9q0.w(M, D2, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode2), cri.a.g);
                k9q0.t(M, cri.a.h);
                Iterator a4 = yu50.a(M, c2, cri.a.d, 1830329856, list3);
                while (a4.hasNext()) {
                    String str = (String) a4.next();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, i5, i6, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0 frv0Var = wuv0Var.i0;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, i5, i6, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    androidx.compose.runtime.a aVar5 = M;
                    yqv0.c(str, null, ylu0Var.getText().m, null, null, 0, 0, null, 2, false, 0, 2, null, frv0Var, aVar5, 100663296, 48, 5882);
                    i4 = i4;
                    M = aVar5;
                    i5 = i5;
                    i6 = i6;
                    z = z;
                    a2 = a2;
                }
                androidx.compose.runtime.a aVar6 = M;
                aVar6.j();
                aVar6.G();
                a2 = a2;
            }
            aVar2 = M;
            i3 = i4;
            if (gp.d(aVar2)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            i3 = 2;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new h7c(movieActorsView$MovieActorsState, q630Var, i, i3);
        }
    }
}
