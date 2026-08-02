package yads;

import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class je2 implements yc3 {
    @Override // yads.yc3
    public final String a(String str, JSONObject jSONObject) {
        String optString = jSONObject.optString(str);
        if (optString == null || optString.length() == 0 || optString.equals("null")) {
            throw new a22("Native Ad json has not required attributes");
        }
        return optString;
    }
}
