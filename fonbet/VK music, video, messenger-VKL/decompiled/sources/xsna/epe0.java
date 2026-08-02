package xsna;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.dpe0;

/* compiled from: QualityNamePlates.kt */
/* loaded from: classes18.dex */
public final class epe0 {
    public static final dpe0 a(Map<Integer, ? extends List<String>> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), new dpe0.a((List) entry.getValue()));
        }
        return new dpe0(linkedHashMap);
    }
}
