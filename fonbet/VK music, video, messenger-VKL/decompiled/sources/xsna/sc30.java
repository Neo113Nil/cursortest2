package xsna;

import com.vk.catalog.mvi.block.video.impl.movies.detail.actors.MovieActorsView$MovieActorsState;

/* compiled from: MovieActorsView.kt */
/* loaded from: classes.dex */
public final class sc30 extends o2a<MovieActorsView$MovieActorsState> {
    @Override // xsna.o2a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void c(final a8a a8aVar, final MovieActorsView$MovieActorsState movieActorsView$MovieActorsState, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-497836341);
        if ((i & 48) == 0) {
            i2 = (M.J(movieActorsView$MovieActorsState) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-497836341, i2, -1, "com.vk.catalog.mvi.block.video.impl.movies.detail.actors.MovieActorsView.MovieActorsView.ContentImpl (MovieActorsView.kt:71)");
            }
            vc30.a(movieActorsView$MovieActorsState, s200.E(q630Var, kqu0.w, kqu0.t), M, (i2 >> 3) & 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.l(new wzs() { // from class: xsna.rc30
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    sc30.this.c(a8aVar, movieActorsView$MovieActorsState, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            });
        }
    }
}
