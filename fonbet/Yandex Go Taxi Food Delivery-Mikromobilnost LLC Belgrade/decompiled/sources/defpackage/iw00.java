package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public class iw00 extends hw00 {
    public static h73 w(Map map) {
        return new h73(1, map.entrySet());
    }

    public static List x(Map map) {
        int size = map.size();
        EmptyList emptyList = EmptyList.a;
        if (size == 0) {
            return emptyList;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return emptyList;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return Collections.singletonList(new Pair(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new Pair(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
