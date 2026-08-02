package yads;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class gr0 {
    public final jr0 a;
    public final d b;

    public /* synthetic */ gr0() {
        this(new jr0(), new d());
    }

    public static HashMap a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("report_data");
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject2.get(next));
            }
            s3q0 s3q0Var = s3q0.a;
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    public gr0(jr0 jr0Var, d dVar) {
        this.a = jr0Var;
        this.b = dVar;
    }
}
