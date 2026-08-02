package xsna;

/* compiled from: MovieRatingsView.kt */
/* loaded from: classes.dex */
public final class gf30 extends o2a<com.vk.catalog.mvi.block.video.impl.movies.detail.ratings.a> {
    @Override // xsna.o2a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void c(final a8a a8aVar, final com.vk.catalog.mvi.block.video.impl.movies.detail.ratings.a aVar, final q630 q630Var, androidx.compose.runtime.a aVar2, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar2.M(-1568769076);
        if ((i & 48) == 0) {
            i2 = (M.J(aVar) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1568769076, i2, -1, "com.vk.catalog.mvi.block.video.impl.movies.detail.ratings.MovieRatingsView.MovieRatingsView.ContentImpl (MovieRatingsView.kt:126)");
            }
            com.vk.catalog.mvi.block.video.impl.movies.detail.ratings.b.b(aVar, s200.E(q630Var, kqu0.w, kqu0.v), M, (i2 >> 3) & 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.l(new wzs() { // from class: xsna.ff30
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    gf30.this.c(a8aVar, aVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            });
        }
    }
}
