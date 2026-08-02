package defpackage;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class o4w {
    public final JSONObject a;
    public final String b;
    public final JSONObject c;
    public final JSONArray d;
    public final JSONArray e;
    public int f;
    public int g;
    public long h;

    public o4w(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        this.a = jSONObject2;
        this.b = str;
        JSONObject jSONObject3 = new JSONObject(jSONObject.toString());
        this.c = jSONObject3;
        this.d = jSONObject.optJSONArray("liveness_action");
        this.e = jSONObject3.optJSONArray("liveness_action");
    }

    public final y3w a() {
        JSONObject optJSONObject;
        JSONArray jSONArray = this.d;
        if (jSONArray == null || (optJSONObject = jSONArray.optJSONObject(this.f)) == null) {
            return null;
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("actions");
        JSONObject optJSONObject2 = optJSONArray != null ? optJSONArray.optJSONObject(this.g) : null;
        if (optJSONObject2 == null) {
            this.f++;
            this.g = 0;
            return a();
        }
        this.h = System.currentTimeMillis();
        JSONObject put = new JSONObject(optJSONObject.toString()).put("actions", optJSONObject2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("instruction", put);
        jSONObject.put("customization", this.a);
        return new y3w(jSONObject, optJSONObject2.getLong("duration"));
    }
}
