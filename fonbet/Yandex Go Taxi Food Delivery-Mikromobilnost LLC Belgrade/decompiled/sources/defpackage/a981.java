package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class a981 {
    public final LinkedHashMap a;

    public a981(Map map) {
        this.a = new LinkedHashMap(map);
    }

    public final void a(String str, String str2) {
        if (str2 == null || str2.length() <= 0) {
            return;
        }
        this.a.put(str, str2);
    }
}
