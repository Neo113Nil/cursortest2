package xsna;

import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogVideoMovieDto;
import com.vk.api.generated.video.dto.VideoKinoMailPersonDto;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.video.impl.movies.detail.actors.MovieActorsView$MovieActorsState;
import com.vk.catalog.mvi.dto.CatalogExtraResponseObjectDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class qc30 implements f2a {
    @Override // xsna.f2a
    public final List a(CatalogExtraResponseObjectDto catalogExtraResponseObjectDto, CatalogBlockDto catalogBlockDto, CatalogBlockVariant catalogBlockVariant) {
        Object obj;
        List H0;
        List<Integer> L1 = catalogBlockDto.L1();
        if (L1 == null) {
            L1 = EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = L1.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            List<CatalogVideoMovieDto> k = catalogExtraResponseObjectDto.k();
            MovieActorsView$MovieActorsState movieActorsView$MovieActorsState = null;
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
                    List<VideoKinoMailPersonDto> d = catalogVideoMovieDto.d();
                    if (d != null && (H0 = j5g.H0(d, 8)) != null) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it3 = H0.iterator();
                        while (it3.hasNext()) {
                            String d2 = ((VideoKinoMailPersonDto) it3.next()).d();
                            if (d2 != null) {
                                arrayList2.add(d2);
                            }
                        }
                        movieActorsView$MovieActorsState = new MovieActorsView$MovieActorsState(a, catalogBlockVariant, arrayList2);
                    }
                }
            }
            if (movieActorsView$MovieActorsState != null) {
                arrayList.add(movieActorsView$MovieActorsState);
            }
        }
        return arrayList;
    }
}
