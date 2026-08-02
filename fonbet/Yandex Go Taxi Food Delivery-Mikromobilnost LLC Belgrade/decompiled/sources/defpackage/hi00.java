package defpackage;

import androidx.datastore.preferences.protobuf.MapFieldLite;

/* loaded from: classes.dex */
public final class hi00 {
    public static MapFieldLite a(Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MapFieldLite mapFieldLite2 = (MapFieldLite) obj2;
        if (!mapFieldLite2.isEmpty()) {
            if (!mapFieldLite.b()) {
                mapFieldLite = mapFieldLite.f();
            }
            mapFieldLite.a();
            if (!mapFieldLite2.isEmpty()) {
                mapFieldLite.putAll(mapFieldLite2);
            }
        }
        return mapFieldLite;
    }
}
