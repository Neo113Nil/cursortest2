package xsna;

import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogVideoMovieDto;
import com.vk.api.generated.video.dto.VideoKinoMailCountryDto;
import com.vk.api.generated.video.dto.VideoKinoMailGenreDto;
import com.vk.api.generated.video.dto.VideoKinoMailPersonDto;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.video.impl.movies.detail.info.MovieInfoView$MovieInfoBlockState;
import com.vk.catalog.mvi.dto.CatalogExtraResponseObjectDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: MovieInfoStateMapper.kt */
/* loaded from: classes.dex */
public final class ce30 implements f2a<MovieInfoView$MovieInfoBlockState> {
    @Override // xsna.f2a
    public final List<MovieInfoView$MovieInfoBlockState> a(CatalogExtraResponseObjectDto catalogExtraResponseObjectDto, CatalogBlockDto catalogBlockDto, CatalogBlockVariant catalogBlockVariant) {
        Object obj;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        Integer num;
        String str;
        ArrayList arrayList6;
        List<Integer> L1 = catalogBlockDto.L1();
        if (L1 == null) {
            L1 = EmptyList.b;
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator<T> it = L1.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            List<CatalogVideoMovieDto> k = catalogExtraResponseObjectDto.k();
            MovieInfoView$MovieInfoBlockState movieInfoView$MovieInfoBlockState = null;
            if (k != null) {
                Iterator<T> it2 = k.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (intValue == ((CatalogVideoMovieDto) obj).getId()) {
                        break;
                    }
                }
                CatalogVideoMovieDto catalogVideoMovieDto = (CatalogVideoMovieDto) obj;
                if (catalogVideoMovieDto != null) {
                    List<VideoKinoMailGenreDto> k2 = catalogVideoMovieDto.k();
                    if (k2 != null) {
                        ArrayList arrayList8 = new ArrayList();
                        Iterator<T> it3 = k2.iterator();
                        while (it3.hasNext()) {
                            String d = ((VideoKinoMailGenreDto) it3.next()).d();
                            if (d != null) {
                                arrayList8.add(d);
                            }
                        }
                        arrayList = arrayList8;
                    } else {
                        arrayList = null;
                    }
                    List<VideoKinoMailCountryDto> g = catalogVideoMovieDto.g();
                    if (g != null) {
                        ArrayList arrayList9 = new ArrayList();
                        Iterator<T> it4 = g.iterator();
                        while (it4.hasNext()) {
                            String d2 = ((VideoKinoMailCountryDto) it4.next()).d();
                            if (d2 != null) {
                                arrayList9.add(d2);
                            }
                        }
                        arrayList2 = arrayList9;
                    } else {
                        arrayList2 = null;
                    }
                    Integer W = catalogVideoMovieDto.W();
                    Integer T = catalogVideoMovieDto.T();
                    Integer j = catalogVideoMovieDto.j();
                    List<VideoKinoMailPersonDto> i = catalogVideoMovieDto.i();
                    if (i != null) {
                        ArrayList arrayList10 = new ArrayList();
                        Iterator<T> it5 = i.iterator();
                        while (it5.hasNext()) {
                            String d3 = ((VideoKinoMailPersonDto) it5.next()).d();
                            if (d3 != null) {
                                arrayList10.add(d3);
                            }
                        }
                        arrayList3 = arrayList10;
                    } else {
                        arrayList3 = null;
                    }
                    String K = catalogVideoMovieDto.K();
                    String G = catalogVideoMovieDto.G();
                    List<VideoKinoMailPersonDto> M = catalogVideoMovieDto.M();
                    if (M != null) {
                        ArrayList arrayList11 = new ArrayList();
                        Iterator<T> it6 = M.iterator();
                        while (it6.hasNext()) {
                            String d4 = ((VideoKinoMailPersonDto) it6.next()).d();
                            if (d4 != null) {
                                arrayList11.add(d4);
                            }
                        }
                        arrayList4 = arrayList11;
                    } else {
                        arrayList4 = null;
                    }
                    List<VideoKinoMailPersonDto> f = catalogVideoMovieDto.f();
                    if (f != null) {
                        ArrayList arrayList12 = new ArrayList();
                        Iterator<T> it7 = f.iterator();
                        while (it7.hasNext()) {
                            String d5 = ((VideoKinoMailPersonDto) it7.next()).d();
                            if (d5 != null) {
                                arrayList12.add(d5);
                            }
                        }
                        arrayList5 = arrayList12;
                    } else {
                        arrayList5 = null;
                    }
                    List<VideoKinoMailPersonDto> C = catalogVideoMovieDto.C();
                    if (C != null) {
                        ArrayList arrayList13 = new ArrayList();
                        Iterator<T> it8 = C.iterator();
                        while (it8.hasNext()) {
                            String d6 = ((VideoKinoMailPersonDto) it8.next()).d();
                            if (d6 != null) {
                                arrayList13.add(d6);
                            }
                        }
                        num = j;
                        str = G;
                        arrayList6 = arrayList13;
                    } else {
                        num = j;
                        str = G;
                        arrayList6 = null;
                    }
                    ArrayList arrayList14 = arrayList3;
                    ArrayList arrayList15 = arrayList4;
                    ArrayList arrayList16 = arrayList5;
                    Object[] objArr = {arrayList, arrayList2, W, T, num, arrayList14, K, str, arrayList15, arrayList16, arrayList6};
                    ArrayList arrayList17 = arrayList6;
                    String str2 = str;
                    Integer num2 = num;
                    List I = rl3.I(objArr);
                    if (!I.isEmpty()) {
                        movieInfoView$MovieInfoBlockState = new MovieInfoView$MovieInfoBlockState(BlockId.Simple.a(catalogBlockDto.getId()), catalogBlockVariant, arrayList, arrayList2, W, T, num2, arrayList14, K, str2, arrayList15, arrayList16, arrayList17, catalogVideoMovieDto.p() == CatalogVideoMovieDto.MainRubricDto.MOVIES, false, I.size() > 5);
                    }
                }
            }
            if (movieInfoView$MovieInfoBlockState != null) {
                arrayList7.add(movieInfoView$MovieInfoBlockState);
            }
        }
        return arrayList7;
    }
}
