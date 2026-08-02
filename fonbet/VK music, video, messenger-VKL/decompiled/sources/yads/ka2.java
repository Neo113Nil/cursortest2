package yads;

import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class ka2 implements bj {
    public final mr2 a;

    public ka2(mr2 mr2Var) {
        this.a = mr2Var;
    }

    @Override // yads.bj
    public final Object a(JSONObject jSONObject) {
        String optString = jSONObject.optString("name");
        if (optString == null || optString.length() == 0 || optString.equals("null")) {
            throw new a22("Native Ad json has not required attributes");
        }
        String optString2 = jSONObject.optString("value");
        if (optString2 == null || optString2.length() == 0 || optString2.equals("null")) {
            throw new a22("Native Ad json has not required attributes");
        }
        return "review_count".equals(optString) ? this.a.a(optString2) : optString2;
    }
}
