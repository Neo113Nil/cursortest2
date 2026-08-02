package yads;

import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class a51 implements bj {
    public final o41 a;

    public /* synthetic */ a51() {
        this(new o41());
    }

    @Override // yads.bj
    public final Object a(JSONObject jSONObject) {
        if (!jSONObject.has("value") || jSONObject.isNull("value")) {
            throw new a22("Native Ad json has not required attributes");
        }
        return this.a.a(jSONObject.getJSONObject("value"));
    }

    public a51(o41 o41Var) {
        this.a = o41Var;
    }
}
