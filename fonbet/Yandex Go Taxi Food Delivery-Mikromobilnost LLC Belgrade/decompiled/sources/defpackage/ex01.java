package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ex01 {
    public final ArrayList a;
    public final MapBuilder b;

    public ex01(ArrayList arrayList) {
        this.a = arrayList;
        MapBuilder mapBuilder = new MapBuilder();
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((gx01) it.next()).j);
        }
        mapBuilder.put("route_options_list", arrayList2);
        this.b = mapBuilder.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ex01) && this.a.equals(((ex01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g8e.q("MobilityHubItemRouteV2(routeOptionsList=", Extension.C_BRAKE, this.a);
    }
}
