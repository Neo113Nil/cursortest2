package yads;

import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class hw implements bj {
    @Override // yads.bj
    public final Object a(JSONObject jSONObject) {
        if (jSONObject.has("value") && jSONObject.isNull("value")) {
            return new gw(fw.c, null);
        }
        fw fwVar = fw.b;
        String optString = jSONObject.optString("value");
        if (optString == null || optString.length() == 0 || optString.equals("null")) {
            throw new a22("Native Ad json has not required attributes");
        }
        return new gw(fwVar, optString);
    }
}
