package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class n0l implements d4x {
    public final String a;
    public final int b;

    public n0l(JSONObject jSONObject) {
        String str;
        try {
            str = b4x.m("unit", jSONObject);
        } catch (JSONException e) {
            if (ydz.a.a()) {
                ydz.c("ParsingErrorLogger", "An error occurred during parsing process", e);
            }
            str = null;
        }
        if ("sp".equals(str)) {
            this.a = "sp";
        } else if ("dp".equals(str)) {
            this.a = "dp";
        } else {
            this.a = "dp";
        }
        int intValue = b4x.h("value", jSONObject).intValue();
        this.b = intValue;
        if (intValue >= 0) {
            return;
        }
        z3k.c("value does not meet condition value >= 0");
        throw null;
    }

    public final String toString() {
        tjz0 tjz0Var = new tjz0();
        tjz0Var.a(this.a, "unit");
        tjz0Var.a(Integer.valueOf(this.b), "value");
        return tjz0Var.a.toString();
    }
}
