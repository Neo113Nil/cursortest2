package defpackage;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.UUID;
import ru.yandextaxi.flutter_yandex_mapkit.ReferenceType;

/* loaded from: classes7.dex */
public final class ini0 {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public final String a(ReferenceType referenceType, Object obj) {
        String uuid = UUID.randomUUID().toString();
        b(uuid, referenceType, obj);
        return uuid;
    }

    public final void b(String str, ReferenceType referenceType, Object obj) {
        IdentityHashMap identityHashMap;
        HashMap hashMap = this.a;
        HashMap hashMap2 = (HashMap) hashMap.get(referenceType);
        if (hashMap2 == null) {
            hashMap2 = new HashMap();
            hashMap.put(referenceType, hashMap2);
        }
        Object put = hashMap2.put(str, obj);
        HashMap hashMap3 = this.b;
        if (put != null && (identityHashMap = (IdentityHashMap) hashMap3.get(referenceType)) != null) {
        }
        IdentityHashMap identityHashMap2 = (IdentityHashMap) hashMap3.get(referenceType);
        if (identityHashMap2 == null) {
            identityHashMap2 = new IdentityHashMap();
            hashMap3.put(referenceType, identityHashMap2);
        }
        identityHashMap2.put(obj, str);
    }

    public final Object c(String str, ReferenceType referenceType) {
        Object d = d(str, referenceType);
        if (d != null) {
            return d;
        }
        ny61.r(unr0.p("Object with key ", str, " and type ", referenceType.name(), " not found"));
        return null;
    }

    public final Object d(String str, ReferenceType referenceType) {
        HashMap hashMap = (HashMap) this.a.get(referenceType);
        if (hashMap != null) {
            return hashMap.get(str);
        }
        return null;
    }

    public final Object e(String str, ReferenceType referenceType) {
        IdentityHashMap identityHashMap;
        HashMap hashMap = (HashMap) this.a.get(referenceType);
        Object remove = hashMap != null ? hashMap.remove(str) : null;
        if (remove != null && (identityHashMap = (IdentityHashMap) this.b.get(referenceType)) != null) {
        }
        return remove;
    }
}
