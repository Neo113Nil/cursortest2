package yads;

import org.json.JSONObject;
import ru.ok.android.utils.Logger;

/* loaded from: classes10.dex */
public final class o41 {
    public final wb3 a;
    public final t23 b;

    public /* synthetic */ o41() {
        this(new wb3(), new t23());
    }

    public final x41 a(JSONObject jSONObject) {
        int i = jSONObject.getInt(Logger.METHOD_W);
        int i2 = jSONObject.getInt("h");
        this.a.getClass();
        String a = wb3.a("url", jSONObject);
        s23 a2 = jSONObject.has("smartCenterSettings") ? this.b.a(jSONObject.getJSONObject("smartCenterSettings")) : null;
        String optString = jSONObject.optString("sizeType");
        if (optString.length() <= 0) {
            optString = null;
        }
        boolean optBoolean = jSONObject.optBoolean("preload", true);
        String optString2 = jSONObject.optString("preview");
        return new x41(i, i2, a, optString, a2, optBoolean, optString2.length() > 0 ? optString2 : null);
    }

    public o41(wb3 wb3Var, t23 t23Var) {
        this.a = wb3Var;
        this.b = t23Var;
    }
}
