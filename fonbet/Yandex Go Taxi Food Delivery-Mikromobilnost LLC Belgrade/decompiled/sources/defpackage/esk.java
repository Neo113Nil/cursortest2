package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class esk implements d4x {
    public final int a;
    public final int b;

    public esk(JSONObject jSONObject) {
        this.a = b4x.g("end_color", jSONObject);
        this.b = b4x.g("start_color", jSONObject);
    }

    public final String toString() {
        tjz0 tjz0Var = new tjz0();
        tjz0Var.a(Integer.valueOf(this.a), "endColor");
        tjz0Var.a(Integer.valueOf(this.b), "startColor");
        return tjz0Var.a.toString();
    }
}
