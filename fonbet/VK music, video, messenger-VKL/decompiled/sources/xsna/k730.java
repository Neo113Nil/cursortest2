package xsna;

import org.json.JSONObject;

/* compiled from: MoneyGetAuthData.kt */
/* loaded from: classes6.dex */
public final class k730 extends rdx0<w2c> {
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        String str;
        String optString;
        JSONObject optJSONObject = jSONObject.optJSONObject("response");
        String str2 = "";
        if (optJSONObject == null || (str = optJSONObject.optString("auth_data")) == null) {
            str = "";
        }
        if (optJSONObject != null && (optString = optJSONObject.optString("auth_sign")) != null) {
            str2 = optString;
        }
        return new w2c(str, str2);
    }
}
