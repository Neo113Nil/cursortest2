package defpackage;

import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class hs5 {
    public final String a;

    public hs5(String str) {
        this.a = new JSONObject(str).optString("countryCode");
    }

    public final String a() {
        return this.a;
    }
}
