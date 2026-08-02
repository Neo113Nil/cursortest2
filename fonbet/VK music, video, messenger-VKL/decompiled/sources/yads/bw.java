package yads;

import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class bw implements q0 {
    @Override // yads.q0
    public final m0 a(JSONObject jSONObject) {
        String optString = jSONObject.optString("type");
        if (optString == null || optString.length() == 0 || optString.equals("null")) {
            throw new a22("Native Ad json has not required attributes");
        }
        return new zv(optString);
    }
}
