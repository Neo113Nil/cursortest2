package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class fx01 {
    public final List a;
    public final MapBuilder b;

    public fx01(List list) {
        this.a = list;
        MapBuilder mapBuilder = new MapBuilder();
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((hx01) it.next()).o);
        }
        mapBuilder.put("route_options_list", arrayList);
        this.b = mapBuilder.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fx01) && this.a.equals(((fx01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("MobilityHubItemRouteV3(routeOptionsList=", Extension.C_BRAKE, this.a);
    }
}
