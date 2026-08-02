package defpackage;

import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class ir71 implements s191 {
    @Override // defpackage.s191
    public final Object a(JSONObject jSONObject) {
        String optString = jSONObject.optString("value");
        if (optString != null && optString.length() != 0 && !optString.equals("null")) {
            return optString;
        }
        yx61.e("Native Ad json has not required attributes");
        return null;
    }
}
