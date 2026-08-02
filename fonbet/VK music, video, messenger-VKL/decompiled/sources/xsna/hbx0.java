package xsna;

import org.json.JSONObject;

/* compiled from: WarningNotification.kt */
/* loaded from: classes18.dex */
public final class hbx0 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;

    public hbx0(JSONObject jSONObject) {
        this.a = jSONObject.optInt("id", 0);
        this.b = jSONObject.optString("title", null);
        this.c = jSONObject.optString("text", null);
        this.d = jSONObject.optString("back_button", null);
        this.e = jSONObject.optString("ok_button", null);
        this.f = jSONObject.optString("icon", null);
        this.g = jSONObject.optBoolean("can_close", false);
    }
}
