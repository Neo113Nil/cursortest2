package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class g5p {
    public final LinkedHashMap a;

    public g5p(j5p j5pVar) {
        this.a = new LinkedHashMap(j5pVar.a);
    }

    public final j5p a() {
        return new j5p(vng.M(this.a));
    }

    public final void b(uh uhVar, Object obj) {
        LinkedHashMap linkedHashMap = this.a;
        if (obj != null) {
            linkedHashMap.put(uhVar, obj);
        } else {
            linkedHashMap.remove(uhVar);
        }
    }

    public g5p(LinkedHashMap linkedHashMap) {
        this.a = new LinkedHashMap(linkedHashMap);
    }

    public g5p() {
        this.a = new LinkedHashMap();
    }
}
