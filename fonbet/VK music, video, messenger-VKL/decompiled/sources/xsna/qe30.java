package xsna;

import com.vk.catalog.mvi.block.video.impl.movies.detail.poster.MoviePosterView$MoviePosterBlockState;
import kotlin.NoWhenBranchMatchedException;
import xsna.oe30;
import xsna.pe30;

/* compiled from: MoviePosterView.kt */
/* loaded from: classes.dex */
public final class qe30 extends u1a<MoviePosterView$MoviePosterBlockState, oe30> {
    @Override // xsna.u1a
    public final void g(oe30 oe30Var) {
        if (!(oe30Var instanceof oe30.a)) {
            throw new NoWhenBranchMatchedException();
        }
        mcc0 mcc0Var = this.b;
        t(new pe30.a(((MoviePosterView$MoviePosterBlockState) mcc0Var.n()).b, ((MoviePosterView$MoviePosterBlockState) mcc0Var.n()).d));
    }
}
