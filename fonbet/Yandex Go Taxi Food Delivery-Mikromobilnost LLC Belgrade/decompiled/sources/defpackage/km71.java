package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.b;
import kotlin.sequences.a;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class km71 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.LinkedHashMap, java.util.Map] */
    public static Map a(String str) {
        ?? failure;
        try {
            JSONObject jSONObject = new JSONObject(str);
            qrq0 b = a.b(jSONObject.keys());
            failure = new LinkedHashMap();
            Iterator it = ((a7e) b).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                failure.put(next, jSONObject.get((String) next));
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        boolean z = failure instanceof Result.Failure;
        Map map = failure;
        if (z) {
            map = null;
        }
        Map map2 = map;
        return map2 == null ? b.f() : map2;
    }
}
