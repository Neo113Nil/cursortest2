package xsna;

import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogVideoMovieDto;
import com.vk.api.generated.video.dto.VideoKinoMailCountryDto;
import com.vk.api.generated.video.dto.VideoKinoMailGenreDto;
import com.vk.api.generated.video.dto.VideoKinoMailSeasonDto;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.video.impl.movies.detail.header.entities.MovieHeaderBlockState;
import com.vk.catalog.mvi.dto.CatalogExtraResponseObjectDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: MovieHeaderCatalogView.kt */
/* loaded from: classes.dex */
public final class rd30 implements f2a<MovieHeaderBlockState> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    @Override // xsna.f2a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<MovieHeaderBlockState> a(CatalogExtraResponseObjectDto catalogExtraResponseObjectDto, CatalogBlockDto catalogBlockDto, CatalogBlockVariant catalogBlockVariant) {
        MovieHeaderBlockState movieHeaderBlockState;
        Object obj;
        ArrayList arrayList;
        ?? r4;
        List<Integer> L1 = catalogBlockDto.L1();
        ArrayList arrayList2 = null;
        if (L1 != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it = L1.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                List<CatalogVideoMovieDto> k = catalogExtraResponseObjectDto.k();
                if (k != null) {
                    Iterator it2 = k.iterator();
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
                        String u = catalogVideoMovieDto.u();
                        String B = catalogVideoMovieDto.B();
                        Integer W = catalogVideoMovieDto.W();
                        List<VideoKinoMailGenreDto> k2 = catalogVideoMovieDto.k();
                        if (k2 != null) {
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it3 = k2.iterator();
                            while (it3.hasNext()) {
                                String d = ((VideoKinoMailGenreDto) it3.next()).d();
                                if (d != null) {
                                    arrayList4.add(d);
                                }
                            }
                            arrayList = arrayList4;
                        } else {
                            arrayList = null;
                        }
                        List<VideoKinoMailCountryDto> g = catalogVideoMovieDto.g();
                        if (g != null) {
                            r4 = new ArrayList();
                            Iterator it4 = g.iterator();
                            while (it4.hasNext()) {
                                String d2 = ((VideoKinoMailCountryDto) it4.next()).d();
                                if (d2 != null) {
                                    r4.add(d2);
                                }
                            }
                        } else {
                            r4 = 0;
                        }
                        if (r4 == 0) {
                            r4 = EmptyList.b;
                        }
                        List list = r4;
                        Integer j = catalogVideoMovieDto.j();
                        List<VideoKinoMailSeasonDto> R = catalogVideoMovieDto.R();
                        movieHeaderBlockState = new MovieHeaderBlockState(a, catalogBlockVariant, u, B, W, arrayList, list, j, R != null ? Integer.valueOf(R.size()) : null, catalogVideoMovieDto.e());
                        if (movieHeaderBlockState == null) {
                            arrayList3.add(movieHeaderBlockState);
                        }
                    }
                }
                movieHeaderBlockState = null;
                if (movieHeaderBlockState == null) {
                }
            }
            arrayList2 = arrayList3;
        }
        return arrayList2 == null ? EmptyList.b : arrayList2;
    }
}
