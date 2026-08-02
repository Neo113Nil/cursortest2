package yads;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class om2 {
    public final Map a;

    public om2(Map map) {
        this.a = new LinkedHashMap(map);
    }

    public final void a(String str, String str2) {
        if (str2 == null || str2.length() <= 0) {
            return;
        }
        this.a.put(str, str2);
    }
}
