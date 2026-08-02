package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class hdl implements d4x {
    public final int a;

    public hdl(JSONObject jSONObject) {
        Integer num;
        try {
            num = b4x.c("color", jSONObject);
        } catch (JSONException e) {
            if (ydz.a.a()) {
                ydz.c("ParsingErrorLogger", "An error occurred during parsing process", e);
            }
            num = null;
        }
        if (num == null) {
            this.a = mob1.d("#14000000");
        } else {
            this.a = num.intValue();
        }
    }

    public final String toString() {
        tjz0 tjz0Var = new tjz0();
        tjz0Var.a(Integer.valueOf(this.a), "color");
        return tjz0Var.a.toString();
    }
}
