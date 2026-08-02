package xsna;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class odz0 {
    public static String a(jl20 jl20Var) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", jl20Var.a);
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<String, String> entry : jl20Var.b.entrySet()) {
            jSONObject2.put(entry.getKey(), entry.getValue());
        }
        jSONObject.put("data", jSONObject2);
        jSONObject.put("time", jl20Var.c);
        return jSONObject.toString(0);
    }
}
