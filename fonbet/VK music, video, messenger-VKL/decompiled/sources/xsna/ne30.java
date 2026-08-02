package xsna;

import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogVideoMovieDto;
import com.vk.api.generated.video.dto.VideoKinoMailGenreDto;
import com.vk.api.generated.video.dto.VideoKinoMailPictureDto;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.video.impl.movies.detail.poster.MoviePosterView$MoviePosterBlockState;
import com.vk.catalog.mvi.dto.CatalogExtraResponseObjectDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: MoviePosterStateMapper.kt */
/* loaded from: classes.dex */
public final class ne30 implements f2a<MoviePosterView$MoviePosterBlockState> {
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
    
        if (r2 == null) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.vk.catalog.mvi.block.video.impl.movies.detail.poster.MoviePosterView$MoviePosterBlockState] */
    @Override // xsna.f2a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<MoviePosterView$MoviePosterBlockState> a(CatalogExtraResponseObjectDto catalogExtraResponseObjectDto, CatalogBlockDto catalogBlockDto, CatalogBlockVariant catalogBlockVariant) {
        Object obj;
        String num;
        VideoKinoMailGenreDto videoKinoMailGenreDto;
        List<Integer> L1 = catalogBlockDto.L1();
        if (L1 == null) {
            L1 = EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
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
                    BlockId.CompositeId b = com.vk.catalog.mvi.block.a.b(intValue, catalogBlockDto.getId());
                    int id = catalogVideoMovieDto.getId();
                    VideoKinoMailPictureDto F = catalogVideoMovieDto.F();
                    String url = F != null ? F.getUrl() : null;
                    Float n = catalogVideoMovieDto.n();
                    if (n == null) {
                        n = catalogVideoMovieDto.l();
                    }
                    Float valueOf = n != null ? Float.valueOf(i35.k(n.floatValue(), 1)) : null;
                    String u = catalogVideoMovieDto.u();
                    Integer T = catalogVideoMovieDto.T();
                    if (T != null) {
                        int intValue2 = T.intValue();
                        StringBuilder sb = new StringBuilder();
                        Integer W = catalogVideoMovieDto.W();
                        sb.append(W != null ? W.toString() : null);
                        sb.append((char) 8212);
                        sb.append(intValue2);
                        num = sb.toString();
                    }
                    Integer W2 = catalogVideoMovieDto.W();
                    num = W2 != null ? W2.toString() : null;
                    List<VideoKinoMailGenreDto> k2 = catalogVideoMovieDto.k();
                    List I = rl3.I(new String[]{num, (k2 == null || (videoKinoMailGenreDto = (VideoKinoMailGenreDto) j5g.a0(k2)) == null) ? null : videoKinoMailGenreDto.d()});
                    List list = I.isEmpty() ? null : I;
                    r4 = new MoviePosterView$MoviePosterBlockState(b, catalogBlockVariant, id, url, valueOf, u, list != null ? j5g.g0(list, " · ", null, null, 0, null, 62) : null);
                }
            }
            if (r4 != null) {
                arrayList.add(r4);
            }
        }
        return arrayList;
    }
}
