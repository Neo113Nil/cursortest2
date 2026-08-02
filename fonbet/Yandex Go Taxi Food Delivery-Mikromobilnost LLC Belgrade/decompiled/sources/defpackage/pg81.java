package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
public final class pg81 {
    public static final Set a = Collections.singleton("test_environment");

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r2.isEmpty() == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static sd81 a(nl61 nl61Var) {
        LinkedHashMap linkedHashMap;
        Map map = nl61Var.b;
        if (map != null) {
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (!a.contains((String) entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        linkedHashMap = null;
        return new sd81(nl61Var.a, null, linkedHashMap);
    }
}
