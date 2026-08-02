package yads;

import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class in implements yc3 {
    public final hn a;

    public in(hn hnVar) {
        this.a = hnVar;
    }

    @Override // yads.yc3
    public final String a(String str, JSONObject jSONObject) {
        String optString = jSONObject.optString(str);
        if (optString == null || optString.length() == 0 || optString.equals("null")) {
            throw new a22("Native Ad json has not required attributes");
        }
        this.a.getClass();
        String b = hn.b(optString);
        if (b == null || b.length() == 0) {
            throw new a22("Native Ad json has attribute with broken base64 encoding");
        }
        return b;
    }
}
