package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class edl implements d4x {
    public final d4x a;
    public final String b;

    public edl(JSONObject jSONObject) {
        String j = b4x.j("type", jSONObject);
        if (j.equals("separator_element")) {
            this.a = new hdl(jSONObject);
            this.b = "separator_element";
        } else {
            if (!j.equals("row_element")) {
                throw new JSONException(oyr.p("Unknown object type ", j, " passed to Row"));
            }
            this.a = new gdl(jSONObject);
            this.b = "row_element";
        }
    }

    public final String toString() {
        tjz0 tjz0Var = new tjz0();
        tjz0Var.a(this.b, "type");
        tjz0Var.a(this.a, "value");
        return tjz0Var.a.toString();
    }
}
