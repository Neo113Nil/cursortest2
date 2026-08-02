package xsna;

import com.vk.log.L;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Result;
import org.json.JSONObject;

/* compiled from: PerformanceMetricsConfigParser.kt */
/* loaded from: classes.dex */
public final class mw90 {
    public static final mw90 a = new mw90();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [xsna.jgp] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.HashMap] */
    public static com.vk.im.engine.models.d a(String str) {
        Object failure;
        ?? r4;
        Double d;
        Number number;
        try {
            JSONObject jSONObject = new JSONObject(str);
            double d2 = jSONObject.getDouble("default_sample_rate");
            JSONObject optJSONObject = jSONObject.optJSONObject("sample_rate_overrides");
            if (optJSONObject != null) {
                r4 = new HashMap();
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        Object obj = optJSONObject.get(next);
                        number = obj instanceof Number ? (Number) obj : null;
                    } catch (Throwable unused) {
                    }
                    if (number != null) {
                        d = Double.valueOf(number.doubleValue());
                        if (next != null && d != null) {
                            r4.put(next, d);
                        }
                    }
                    d = null;
                    if (next != null) {
                        r4.put(next, d);
                    }
                }
            } else {
                r4 = jgp.b;
            }
            failure = new com.vk.im.engine.models.d(d2, r4, true);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            L.j(a2, "failed to parse config: ".concat(str));
        }
        return (com.vk.im.engine.models.d) (failure instanceof Result.Failure ? null : failure);
    }
}
