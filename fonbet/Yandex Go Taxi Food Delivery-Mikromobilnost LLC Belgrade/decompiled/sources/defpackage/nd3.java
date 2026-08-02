package defpackage;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class nd3 {
    public final LinkedHashMap a = new LinkedHashMap();

    /* loaded from: classes13.dex */
    public static final class a extends nd3 {
    }

    public final void a(double d, String str) {
        this.a.put(str, String.valueOf(d));
    }

    public final void b(int i, String str) {
        this.a.put(str, Integer.valueOf(i));
    }

    public final void c(long j, String str) {
        this.a.put(str, Long.valueOf(j));
    }

    public final void d(String str, String str2) {
        this.a.put(str, str2);
    }

    public final void e(String str, Collection collection) {
        this.a.put(str, collection);
    }

    public final void f(String str, Map map) {
        this.a.put(str, map);
    }

    public final void g(String str, boolean z) {
        this.a.put(str, Boolean.valueOf(z));
    }

    public final void h(Map map) {
        this.a.putAll(map);
    }

    public final void i() {
        this.a.keySet().removeIf(new md3(0, new d8(5, this)));
    }

    public final String toString() {
        return "Attrs{map=" + this.a + "}";
    }
}
