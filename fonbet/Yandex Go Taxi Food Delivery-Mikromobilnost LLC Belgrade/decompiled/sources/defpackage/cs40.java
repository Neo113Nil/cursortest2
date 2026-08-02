package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class cs40 {
    public final List a;
    public final MapBuilder b;

    public cs40(List list) {
        this.a = list;
        MapBuilder mapBuilder = new MapBuilder();
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ds40) it.next()).i);
        }
        mapBuilder.put("mm_value", arrayList);
        this.b = mapBuilder.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cs40) && this.a.equals(((cs40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("MultimodalRouteItem(mmValue=", Extension.C_BRAKE, this.a);
    }
}
