package defpackage;

import android.net.Uri;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class dil implements d4x {
    public final String a;
    public final Uri b;

    public dil(JSONObject jSONObject) {
        String j = b4x.j("text", jSONObject);
        this.a = j;
        if (j.length() >= 1) {
            this.b = b4x.k("url", jSONObject);
        } else {
            z3k.c("text does not meet condition text.length() >= 1");
            throw null;
        }
    }

    public final String toString() {
        tjz0 tjz0Var = new tjz0();
        tjz0Var.a(this.a, "text");
        tjz0Var.a(this.b, "url");
        return tjz0Var.a.toString();
    }
}
