package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public final class oq80 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final String a() {
        LinkedHashMap linkedHashMap = this.a;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            arrayList.add(((String) key) + '=' + ((String) entry.getValue()));
        }
        return a.X(arrayList, "&", null, null, null, 62);
    }
}
