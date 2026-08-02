package defpackage;

import com.google.crypto.tink.shaded.protobuf.MapFieldLite;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class fi00 {
    public static void a(Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        b64.D(obj2);
        if (mapFieldLite.isEmpty()) {
            return;
        }
        Iterator it = mapFieldLite.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    public static MapFieldLite b(Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MapFieldLite mapFieldLite2 = (MapFieldLite) obj2;
        if (!mapFieldLite2.isEmpty()) {
            if (!mapFieldLite.f()) {
                mapFieldLite = mapFieldLite.i();
            }
            mapFieldLite.h(mapFieldLite2);
        }
        return mapFieldLite;
    }
}
