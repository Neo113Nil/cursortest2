package defpackage;

import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class f581 implements vh81 {
    @Override // defpackage.vh81
    public final String a(String str, JSONObject jSONObject) {
        String optString = jSONObject.optString(str);
        if (optString != null && optString.length() != 0 && !optString.equals("null")) {
            return optString;
        }
        yx61.e("Native Ad json has not required attributes");
        return null;
    }
}
