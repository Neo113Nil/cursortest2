package xsna;

import org.json.JSONObject;

/* compiled from: ClipsShopsGridBlockConfig.kt */
/* loaded from: classes17.dex */
public final class h4f {
    public static final h4f c = new h4f(false, false);
    public final boolean a;
    public final boolean b;

    /* compiled from: ClipsShopsGridBlockConfig.kt */
    public static final class a {
        public static h4f a(JSONObject jSONObject, boolean z) {
            return new h4f(z, jSONObject.optBoolean("is_product_badge_enabled", false));
        }
    }

    public h4f(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
