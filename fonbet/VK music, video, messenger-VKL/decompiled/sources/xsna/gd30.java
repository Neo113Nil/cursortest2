package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.video.impl.movies.detail.buttons.entity.MovieButtonsBlockState;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.fd30;
import xsna.mno0;

/* compiled from: MovieButtonsViewStateMapper.kt */
/* loaded from: classes.dex */
public final class gd30 implements s2a<MovieButtonsBlockState, fd30> {
    @Override // xsna.s2a
    public final fd30 a(MovieButtonsBlockState movieButtonsBlockState) {
        mno0.g b;
        MovieButtonsBlockState movieButtonsBlockState2 = movieButtonsBlockState;
        BlockId blockId = movieButtonsBlockState2.b;
        MovieButtonsBlockState.WatchButtonState watchButtonState = movieButtonsBlockState2.d;
        if (epx.f(watchButtonState, MovieButtonsBlockState.WatchButtonState.WatchMovie.b)) {
            b = nno0.b(R.string.movie_watch);
        } else if (epx.f(watchButtonState, MovieButtonsBlockState.WatchButtonState.WatchSeries.b)) {
            b = nno0.b(R.string.movie_watch_series);
        } else {
            if (!epx.f(watchButtonState, MovieButtonsBlockState.WatchButtonState.WatchFromSearch.b)) {
                throw new NoWhenBranchMatchedException();
            }
            b = nno0.b(R.string.movie_watch_search);
        }
        fd30.a aVar = new fd30.a(movieButtonsBlockState2.f.X(), watchButtonState instanceof MovieButtonsBlockState.WatchButtonState.WatchMovie);
        if (!movieButtonsBlockState2.e) {
            aVar = null;
        }
        return new fd30(blockId, b, aVar, movieButtonsBlockState2.g ? null : nno0.b(R.string.movie_pirate_disclaimer));
    }
}
