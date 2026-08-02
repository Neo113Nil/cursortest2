package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public final class lci {
    public final r0 a = bvf0.c(b.f());

    public final void a(String str, String str2) {
        r0 r0Var;
        Object value;
        LinkedHashMap linkedHashMap;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
            linkedHashMap = new LinkedHashMap((Map) value);
            if (str == null) {
                linkedHashMap.remove(str2);
            } else {
                linkedHashMap.put(str2, str);
            }
        } while (!r0Var.k(value, linkedHashMap));
    }
}
