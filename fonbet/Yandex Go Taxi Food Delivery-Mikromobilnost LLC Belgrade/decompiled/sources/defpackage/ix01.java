package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ix01 {
    public final ArrayList a;
    public final MapBuilder b;

    public ix01(ArrayList arrayList) {
        this.a = arrayList;
        MapBuilder mapBuilder = new MapBuilder();
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((jx01) it.next()).i);
        }
        mapBuilder.put("mm_value", arrayList2);
        this.b = mapBuilder.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ix01) && this.a.equals(((ix01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g8e.q("MultimodalRouteItem(mmValue=", Extension.C_BRAKE, this.a);
    }
}
