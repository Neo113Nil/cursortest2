package yads;

import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class kv implements bj {
    public final wb3 a;

    public kv(wb3 wb3Var) {
        this.a = wb3Var;
    }

    @Override // yads.bj
    public final Object a(JSONObject jSONObject) {
        String str = new String[]{"value"}[0];
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            throw new a22("Native Ad json has not required attributes");
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("value");
        String[] strArr = {"url", "size"};
        for (int i = 0; i < 2; i++) {
            String str2 = strArr[i];
            if (!jSONObject2.has(str2) || jSONObject2.isNull(str2)) {
                throw new a22("Native Ad json has not required attributes");
            }
        }
        this.a.getClass();
        return new jv(jSONObject2.optInt("size"), wb3.a("url", jSONObject2));
    }
}
