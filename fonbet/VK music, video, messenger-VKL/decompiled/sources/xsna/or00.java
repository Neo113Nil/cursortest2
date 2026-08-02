package xsna;

import org.json.JSONObject;

/* compiled from: MarketAdultConfig.kt */
/* loaded from: classes.dex */
public final class or00 implements bxx {
    public final boolean b;
    public final boolean c;

    /* compiled from: MarketAdultConfig.kt */
    /* loaded from: classes18.dex */
    public static final class a {
        public static or00 a(JSONObject jSONObject) {
            return new or00(jSONObject.optBoolean("is_adult_by_profile"), jSONObject.optBoolean("is_adult_confirm"));
        }
    }

    public or00(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_adult_by_profile", this.b);
        jSONObject.put("is_adult_confirm", this.c);
        return jSONObject;
    }
}
