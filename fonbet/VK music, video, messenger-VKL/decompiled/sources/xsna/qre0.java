package xsna;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: QueueStorageManager.kt */
/* loaded from: classes.dex */
public final class qre0 {
    public final HashMap<String, xqe0> a = new HashMap<>();

    public final synchronized LinkedHashMap a(HashSet hashSet) {
        LinkedHashMap linkedHashMap;
        HashMap<String, xqe0> hashMap = this.a;
        linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, xqe0> entry : hashMap.entrySet()) {
            if (hashSet.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public final synchronized void b(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.a.remove((String) it.next());
        }
    }
}
