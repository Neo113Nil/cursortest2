package xsna;

import com.vk.catalog.mvi.block.video.impl.movies.detail.header.entities.MovieHeaderBlockState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import kotlin.NoWhenBranchMatchedException;
import xsna.pd30;

/* compiled from: MovieHeaderCatalogView.kt */
/* loaded from: classes.dex */
public final class qd30 extends u1a<MovieHeaderBlockState, pd30> {
    @Override // xsna.u1a
    public final void g(pd30 pd30Var) {
        pd30 pd30Var2 = pd30Var;
        if (!(pd30Var2 instanceof pd30.a)) {
            throw new NoWhenBranchMatchedException();
        }
        t(new v4u0(((MovieHeaderBlockState) this.b.n()).b, CatalogBlockVariant.MovieHeader, ((pd30.a) pd30Var2).a()));
    }
}
