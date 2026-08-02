package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class b5l implements d4x {
    public final String a;

    public b5l(JSONObject jSONObject) {
        String j = b4x.j("value", jSONObject);
        if ("wrap_content".equals(j)) {
            this.a = "wrap_content";
        } else {
            if (!"match_parent".equals(j)) {
                throw new JSONException(j.concat(" is not a valid value of value"));
            }
            this.a = "match_parent";
        }
    }

    public final String toString() {
        tjz0 tjz0Var = new tjz0();
        tjz0Var.a(this.a, "value");
        return tjz0Var.a.toString();
    }
}
