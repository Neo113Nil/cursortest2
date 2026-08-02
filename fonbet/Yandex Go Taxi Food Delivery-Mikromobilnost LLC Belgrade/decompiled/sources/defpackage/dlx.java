package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class dlx {
    public final HashMap a = new HashMap();
    public final int b = 64;
    public final int c;

    public dlx(int i) {
        this.c = i;
    }

    public static String a(int i, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i) {
                return str.substring(0, i);
            }
        }
        return str;
    }

    public final synchronized boolean b(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Custom attribute key must not be null.");
        }
        String a = a(this.c, str);
        if (this.a.size() >= this.b && !this.a.containsKey(a)) {
            return false;
        }
        String a2 = a(this.c, str2);
        String str3 = (String) this.a.get(a);
        if (str3 == null ? a2 == null : str3.equals(a2)) {
            return false;
        }
        HashMap hashMap = this.a;
        if (str2 == null) {
            a2 = "";
        }
        hashMap.put(a, a2);
        return true;
    }

    public final synchronized void c(Map map) {
        try {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String a = a(this.c, str);
                if (this.a.size() >= this.b && !this.a.containsKey(a)) {
                }
                String str2 = (String) entry.getValue();
                this.a.put(a, str2 == null ? "" : a(this.c, str2));
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
