package xsna;

import org.json.JSONObject;

/* compiled from: ClipsMoreShopsConfig.kt */
/* loaded from: classes17.dex */
public final class lle {
    public static final lle c = new lle(false, 50);
    public final boolean a;
    public final int b;

    /* compiled from: ClipsMoreShopsConfig.kt */
    public static final class a {
        public static lle a(JSONObject jSONObject, boolean z) {
            return new lle(z, swe0.g(jSONObject.optInt("shops_more_button_delay_percent", 50), 0, 100));
        }
    }

    public lle(boolean z, int i) {
        this.a = z;
        this.b = i;
    }
}
