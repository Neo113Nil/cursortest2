package yads;

import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class tu0 implements bj {
    public final a51 a;

    public tu0(a51 a51Var) {
        this.a = a51Var;
    }

    @Override // yads.bj
    public final Object a(JSONObject jSONObject) {
        x41 x41Var;
        if (!jSONObject.has("value")) {
            throw new a22("Native Ad json has not required attributes");
        }
        if (jSONObject.isNull("value")) {
            x41Var = null;
        } else {
            a51 a51Var = this.a;
            a51Var.getClass();
            if (!jSONObject.has("value") || jSONObject.isNull("value")) {
                throw new a22("Native Ad json has not required attributes");
            }
            x41Var = a51Var.a.a(jSONObject.getJSONObject("value"));
        }
        return new ru0(x41Var);
    }
}
