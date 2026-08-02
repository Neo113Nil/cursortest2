package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class lhn {
    public final LinkedHashMap a;

    public lhn(Map map) {
        this.a = new LinkedHashMap();
        zv91.b(map, new l131(0, this));
    }

    public lhn a(lhn lhnVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            Object value = entry.getValue();
            linkedHashMap.put((String) entry.getKey(), (y3x) value);
        }
        for (Map.Entry entry2 : lhnVar.a.entrySet()) {
            Object value2 = entry2.getValue();
            linkedHashMap.put((String) entry2.getKey(), (y3x) value2);
        }
        return new lhn((Map) linkedHashMap);
    }

    public void b(long j, String str) {
        this.a.put(str, new t6w(j, true));
    }

    public void c(String str, String str2) {
        this.a.put(str, new ktu0(str2));
    }

    public /* synthetic */ lhn(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }
}
