package xsna;

import com.vk.catalog.mvi.register.CatalogBlockVariant;
import xsna.q630;

/* compiled from: MoviePosterView.kt */
/* loaded from: classes.dex */
public final class re30 extends m2a<se30, oe30, pe30> {
    public final le30 b;

    public re30(le30 le30Var) {
        super(fpf0.a(pe30.class));
        this.b = le30Var;
    }

    @Override // xsna.m2a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void b(a8a a8aVar, se30 se30Var, izs izsVar, ksr ksrVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-47926641);
        if ((i & 48) == 0) {
            i2 = (M.J(se30Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(ksrVar) ? 2048 : 1024;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (66705 & i2) != 66704)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-47926641, i2, -1, "com.vk.catalog.mvi.block.video.impl.movies.detail.poster.MoviePosterView.MoviePosterView.ContentImpl (MoviePosterView.kt:132)");
            }
            this.b.a(ksrVar, M, (i2 >> 9) & 14);
            if (se30Var.c == CatalogBlockVariant.MoviePostersLegacySlider) {
                M.K(-1853043200);
                bf30.b(0, M);
            } else {
                M.K(-1858473997);
            }
            M.j();
            int i3 = i2 >> 3;
            bf30.a(se30Var, izsVar, ahn.E(q630.a.a, "movie_poster_root"), M, (i3 & 112) | (i3 & 14) | 384);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.l(new nma(this, a8aVar, se30Var, izsVar, ksrVar, q630Var, i, 2));
        }
    }
}
