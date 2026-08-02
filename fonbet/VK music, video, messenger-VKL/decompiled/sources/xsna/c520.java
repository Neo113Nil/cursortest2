package xsna;

import org.json.JSONObject;

/* compiled from: MenuAdsEasyPromote.kt */
/* loaded from: classes18.dex */
public final class c520 implements bxx {
    public final String b;
    public final String c;
    public final boolean d;

    public c520() {
        this(0);
    }

    public final String a() {
        return this.c;
    }

    public final boolean b() {
        return this.b.length() > 0 && this.c.length() > 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("item_text", this.b);
        jSONObject.put("item_url", this.c);
        jSONObject.put("show_badge", this.d);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c520)) {
            return false;
        }
        c520 c520Var = (c520) obj;
        return epx.f(this.b, c520Var.b) && epx.f(this.c, c520Var.c) && this.d == c520Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + urd0.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MenuAdsEasyPromote(text=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.c);
        sb.append(", showBadge=");
        return defpackage.q0.a(sb, this.d, ')');
    }

    public /* synthetic */ c520(int i) {
        this("", "", false);
    }

    public c520(String str, String str2, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public c520(JSONObject jSONObject) {
        this(jSONObject.optString("item_text"), jSONObject.optString("item_url"), jSONObject.optBoolean("show_badge"));
    }
}
