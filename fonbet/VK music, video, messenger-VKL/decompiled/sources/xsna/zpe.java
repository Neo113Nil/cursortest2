package xsna;

import com.vk.api.generated.places.dto.PlacesPlaceWithDistanceDto;
import com.vk.api.generated.places.dto.PlacesSearchResponseDto;
import com.vk.dto.clips.ClipsVideoItemLocation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;

/* compiled from: ClipsPlacesSearchGeolocationRequest.kt */
/* loaded from: classes17.dex */
public final class zpe extends yvi<bqe> {
    public final List<ClipsVideoItemLocation> s;
    public final String t = "";
    public final int u;

    public zpe(List list, int i) {
        this.s = list;
        this.u = i;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        int i;
        List<ClipsVideoItemLocation> list = this.s;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf((float) ((ClipsVideoItemLocation) it.next()).b));
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Float.valueOf((float) ((ClipsVideoItemLocation) it2.next()).c));
        }
        EmptyList emptyList = EmptyList.b;
        if (arrayList2.isEmpty()) {
            return new bqe(emptyList);
        }
        int size = arrayList2.size();
        int i2 = this.u;
        int i3 = i2 / size;
        int size2 = i2 % arrayList2.size();
        int size3 = 20 > arrayList2.size() ? arrayList2.size() : 20;
        po40 po40Var = new po40();
        ListBuilder e = e43.e();
        int i4 = 0;
        while (i4 < size3) {
            if ((i4 < size2 ? i3 + 1 : i3) > 0) {
                float floatValue = ((Number) arrayList.get(i4)).floatValue();
                float floatValue2 = ((Number) arrayList2.get(i4)).floatValue();
                String str = this.t;
                if (!(str.length() > 0)) {
                    str = null;
                }
                Integer valueOf = Integer.valueOf(i2);
                if (!(i2 > 0)) {
                    valueOf = null;
                }
                i = i4;
                List<PlacesPlaceWithDistanceDto> d = ((PlacesSearchResponseDto) yfb.A(po40.m(po40Var, floatValue, floatValue2, str, null, valueOf, 56)).f(l7r0Var)).d();
                ArrayList arrayList3 = new ArrayList(c5g.u(d, 10));
                Iterator<T> it3 = d.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(dz5.C((PlacesPlaceWithDistanceDto) it3.next()));
                }
                e.add(arrayList3);
            } else {
                i = i4;
            }
            i4 = i + 1;
        }
        return new bqe(e.g());
    }
}
