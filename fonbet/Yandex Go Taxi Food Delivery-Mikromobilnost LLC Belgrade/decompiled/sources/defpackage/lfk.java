package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class lfk implements d4x {
    public final d4x a;
    public final String b;

    public lfk(JSONObject jSONObject) {
        String j;
        j = b4x.j("type", jSONObject);
        switch (j) {
            case "div-image-background":
                this.a = new ssk(jSONObject);
                this.b = "div-image-background";
                return;
            case "div-solid-background":
                this.a = new xal(jSONObject);
                this.b = "div-solid-background";
                return;
            case "div-gradient-background":
                this.a = new esk(jSONObject);
                this.b = "div-gradient-background";
                return;
            default:
                throw new JSONException(oyr.p("Unknown object type ", j, " passed to DivBackground"));
        }
    }

    public static ArrayList a(JSONArray jSONArray) {
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            try {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new lfk(optJSONObject));
                }
            } catch (JSONException e) {
                if (ydz.a.a()) {
                    ydz.c("ParsingErrorLogger", "An error occurred during parsing process", e);
                }
            }
        }
        return arrayList;
    }

    public final String toString() {
        tjz0 tjz0Var = new tjz0();
        tjz0Var.a(this.b, "type");
        tjz0Var.a(this.a, "value");
        return tjz0Var.a.toString();
    }
}
