package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.video.impl.movies.detail.poster.MoviePosterView$MoviePosterBlockState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.libvideo.design.compose.movie.poster.PosterCardState;
import xsna.mno0;
import xsna.rmw;

/* compiled from: MoviePosterViewStateMapper.kt */
/* loaded from: classes.dex */
public final class cf30 implements s2a<MoviePosterView$MoviePosterBlockState, se30> {
    @Override // xsna.s2a
    public final se30 a(MoviePosterView$MoviePosterBlockState moviePosterView$MoviePosterBlockState) {
        MoviePosterView$MoviePosterBlockState moviePosterView$MoviePosterBlockState2 = moviePosterView$MoviePosterBlockState;
        BlockId blockId = moviePosterView$MoviePosterBlockState2.b;
        CatalogBlockVariant catalogBlockVariant = moviePosterView$MoviePosterBlockState2.c;
        String str = moviePosterView$MoviePosterBlockState2.e;
        rmw.h e = str != null ? smw.e(str) : null;
        VideoMetaViewState.i iVar = new VideoMetaViewState.i(mno0.b.e(moviePosterView$MoviePosterBlockState2.g));
        String str2 = moviePosterView$MoviePosterBlockState2.h;
        VideoMetaViewState videoMetaViewState = new VideoMetaViewState(iVar, str2 != null ? new VideoMetaViewState.a(null, null, mno0.b.e(str2), false, null, null, null, 0, 251) : null, 4);
        Float f = moviePosterView$MoviePosterBlockState2.f;
        return new se30(blockId, catalogBlockVariant, PosterCardState.a.a(e, videoMetaViewState, f != null ? new PreviewViewState.k(PosterCardState.a.b(f.floatValue()), 2) : null, 988));
    }
}
