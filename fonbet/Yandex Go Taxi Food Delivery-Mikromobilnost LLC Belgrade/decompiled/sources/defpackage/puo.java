package defpackage;

import com.yandex.go.explorer.impl.data.models.CoordinateDto;
import com.yandex.go.explorer.impl.data.models.RegionCoverageResponse;
import com.yandex.go.explorer.impl.data.models.RegionItemDto;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polygon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.map_common.map.k;

/* loaded from: classes12.dex */
public final class puo {
    public static ouo a(RegionCoverageResponse regionCoverageResponse) {
        List<RegionItemDto> list = regionCoverageResponse.a;
        int i = 10;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (RegionItemDto regionItemDto : list) {
            String str = regionItemDto.a;
            String str2 = regionItemDto.b;
            double d = regionItemDto.c;
            List list2 = regionItemDto.d;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                List<CoordinateDto> list3 = (List) it.next();
                ArrayList arrayList3 = new ArrayList(tcc.n(list3, i));
                for (CoordinateDto coordinateDto : list3) {
                    arrayList3.add(new Point(coordinateDto.a, coordinateDto.b));
                    it = it;
                }
                Iterator it2 = it;
                Polygon j = k.j(arrayList3, EmptyList.a);
                if (j != null) {
                    arrayList2.add(j);
                }
                it = it2;
                i = 10;
            }
            arrayList.add(new suo(str, str2, d, arrayList2));
            i = 10;
        }
        return new ouo(arrayList);
    }
}
