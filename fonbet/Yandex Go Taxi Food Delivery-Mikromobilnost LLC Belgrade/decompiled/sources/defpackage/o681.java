package defpackage;

import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class o681 implements gu71 {
    @Override // defpackage.gu71
    public final xh71 a(JSONObject jSONObject) {
        String optString = jSONObject.optString("type");
        if (optString != null && optString.length() != 0 && !optString.equals("null")) {
            return new e081(optString);
        }
        yx61.e("Native Ad json has not required attributes");
        return null;
    }
}
