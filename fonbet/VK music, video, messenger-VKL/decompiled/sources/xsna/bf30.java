package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.compose.movie.poster.PosterCardState;
import java.util.List;
import xsna.cri;
import xsna.mno0;
import xsna.q630;

/* compiled from: MoviePosterView.kt */
/* loaded from: classes16.dex */
public final class bf30 {

    /* compiled from: MoviePosterView.kt */
    public static final class a implements cp10 {
        public static final a a = new a();

        @Override // xsna.cp10
        public final dp10 b(ep10 ep10Var, List<? extends zo10> list, long j) {
            return ep10Var.Q(0, ((zo10) j5g.Y(list)).N(j).c, jgp.b, new xmz(8));
        }
    }

    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, kotlin.Lazy] */
    public static final void a(se30 se30Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-2029884398);
        if ((i & 6) == 0) {
            i2 = (M.J(se30Var) ? 4 : 2) | i;
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
                androidx.compose.runtime.b.f(-2029884398, i2, -1, "com.vk.catalog.mvi.block.video.impl.movies.detail.poster.MoviePoster (MoviePosterView.kt:195)");
            }
            PosterCardState posterCardState = se30Var.d;
            ((zoi) posterCardState.c.getValue()).c(PosterCardState.Size.Small, M, 6);
            q630 v = txj0.v(q630Var, 128);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = ir.h(M);
            }
            sg50 sg50Var = (sg50) x;
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new pw(17, izsVar, se30Var);
                M.R(x2);
            }
            com.vk.libvideo.design.compose.movie.poster.a.c(posterCardState, ojc.b(v, sg50Var, null, false, null, (gzs) x2, 28), M, 0, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new hj(i, 5, se30Var, izsVar, q630Var);
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(409814836);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(409814836, i, -1, "com.vk.catalog.mvi.block.video.impl.movies.detail.poster.StableHeightDummy (MoviePosterView.kt:162)");
            }
            q630 v = txj0.v(q630.a.a, 128);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = a.a;
                M.R(x);
            }
            cp10 cp10Var = (cp10) x;
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, v);
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
            k9q0.w(M, cp10Var, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            com.vk.libvideo.design.compose.movie.poster.a.c(PosterCardState.a.a(null, new VideoMetaViewState(new VideoMetaViewState.i(new mno0.i("\n"), 2), new VideoMetaViewState.a(null, null, new mno0.i(""), false, null, null, null, 0, 251), 4), null, 1020), null, M, 0, 2);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new dmi(i);
        }
    }
}
