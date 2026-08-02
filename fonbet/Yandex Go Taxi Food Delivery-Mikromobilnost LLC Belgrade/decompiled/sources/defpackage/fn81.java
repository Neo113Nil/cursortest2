package defpackage;

import org.json.JSONObject;
import yads.tv;

/* loaded from: classes7.dex */
public final class fn81 implements s191 {
    @Override // defpackage.s191
    public final Object a(JSONObject jSONObject) {
        if (jSONObject.has("value") && jSONObject.isNull("value")) {
            return new zj81(tv.c, null);
        }
        tv tvVar = tv.b;
        String optString = jSONObject.optString("value");
        if (optString != null && optString.length() != 0 && !optString.equals("null")) {
            return new zj81(tvVar, optString);
        }
        yx61.e("Native Ad json has not required attributes");
        return null;
    }
}
