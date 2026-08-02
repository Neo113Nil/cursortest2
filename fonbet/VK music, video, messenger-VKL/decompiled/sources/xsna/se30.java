package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.libvideo.design.compose.movie.poster.PosterCardState;

/* compiled from: MoviePosterView.kt */
/* loaded from: classes.dex */
public final class se30 implements r2a {
    public final BlockId b;
    public final CatalogBlockVariant c;
    public final PosterCardState d;

    public se30(BlockId blockId, CatalogBlockVariant catalogBlockVariant, PosterCardState posterCardState) {
        this.b = blockId;
        this.c = catalogBlockVariant;
        this.d = posterCardState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se30)) {
            return false;
        }
        se30 se30Var = (se30) obj;
        return epx.f(this.b, se30Var.b) && this.c == se30Var.c && epx.f(this.d, se30Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + io.reactivex.rxjava3.subjects.b.b(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        return "MoviePosterViewState(blockId=" + this.b + ", variant=" + this.c + ", posterState=" + this.d + ')';
    }

    @Override // xsna.r2a
    public final BlockId w() {
        return this.b;
    }
}
