package defpackage;

import com.google.protobuf.MapFieldLite;

/* loaded from: classes.dex */
public final class gi00 {
    public static MapFieldLite a(Object obj, Object obj2) {
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
