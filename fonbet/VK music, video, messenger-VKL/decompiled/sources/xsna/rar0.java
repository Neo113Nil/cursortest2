package xsna;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: VKKeyValueStorage.kt */
/* loaded from: classes.dex */
public final class rar0 {
    public static final String c = new String();
    public final wqu0 a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public rar0(wqu0 wqu0Var) {
        this.a = wqu0Var;
    }

    public final String a(String str) {
        ConcurrentHashMap concurrentHashMap = this.b;
        String str2 = (String) concurrentHashMap.get(str);
        String str3 = c;
        if (str2 == str3) {
            return null;
        }
        if (str2 == null) {
            wqu0 wqu0Var = this.a;
            wqu0Var.c.getValue();
            str2 = wqu0Var.b.getString(str, null);
            if (str2 != null) {
                str3 = str2;
            }
            concurrentHashMap.put(str, str3);
        }
        return str2;
    }
}
