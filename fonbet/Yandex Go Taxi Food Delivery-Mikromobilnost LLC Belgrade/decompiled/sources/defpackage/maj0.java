package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class maj0 {
    public final r0 a = bvf0.c(b.f());

    public final void a(String str) {
        b(str, "removed");
    }

    public final void b(String str, String str2) {
        r0 r0Var;
        Object value;
        LinkedHashMap linkedHashMap;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
            linkedHashMap = new LinkedHashMap((Map) value);
            if (str2 == null) {
                linkedHashMap.remove(str);
            } else {
                linkedHashMap.put(str, str2);
            }
        } while (!r0Var.k(value, linkedHashMap));
    }

    public final String c(String str) {
        return (String) ((Map) this.a.getValue()).get(str);
    }
}
