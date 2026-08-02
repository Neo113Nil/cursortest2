package xsna;

import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogVideoMovieDto;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.video.impl.movies.detail.ratings.MovieRatingsView$MovieRatingsBlockState;
import com.vk.catalog.mvi.dto.CatalogExtraResponseObjectDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ef30 implements f2a {
    @Override // xsna.f2a
    public final List a(CatalogExtraResponseObjectDto catalogExtraResponseObjectDto, CatalogBlockDto catalogBlockDto, CatalogBlockVariant catalogBlockVariant) {
        Object obj;
        List<Integer> L1 = catalogBlockDto.L1();
        if (L1 == null) {
            L1 = EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = L1.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            List<CatalogVideoMovieDto> k = catalogExtraResponseObjectDto.k();
            MovieRatingsView$MovieRatingsBlockState movieRatingsView$MovieRatingsBlockState = null;
            if (k != null) {
                Iterator<T> it2 = k.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (((CatalogVideoMovieDto) obj).getId() == intValue) {
                        break;
                    }
                }
                CatalogVideoMovieDto catalogVideoMovieDto = (CatalogVideoMovieDto) obj;
                if (catalogVideoMovieDto != null) {
                    BlockId.Simple a = BlockId.Simple.a(catalogBlockDto.getId());
                    Float n = catalogVideoMovieDto.n();
                    MovieRatingsView$MovieRatingsBlockState.RatingBlockState ratingBlockState = n != null ? new MovieRatingsView$MovieRatingsBlockState.RatingBlockState(n.floatValue(), MovieRatingsView$MovieRatingsBlockState.RatingBlockState.Provider.KinoMail) : null;
                    Float l = catalogVideoMovieDto.l();
                    List I = rl3.I(new MovieRatingsView$MovieRatingsBlockState.RatingBlockState[]{ratingBlockState, l != null ? new MovieRatingsView$MovieRatingsBlockState.RatingBlockState(l.floatValue(), MovieRatingsView$MovieRatingsBlockState.RatingBlockState.Provider.Imdb) : null});
                    if (!I.isEmpty()) {
                        movieRatingsView$MovieRatingsBlockState = new MovieRatingsView$MovieRatingsBlockState(a, catalogBlockVariant, I);
                    }
                }
            }
            if (movieRatingsView$MovieRatingsBlockState != null) {
                arrayList.add(movieRatingsView$MovieRatingsBlockState);
            }
        }
        return arrayList;
    }
}
