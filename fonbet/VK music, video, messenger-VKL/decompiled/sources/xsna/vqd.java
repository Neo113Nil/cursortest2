package xsna;

import org.json.JSONObject;

/* compiled from: ClipsDiscoverPreloadSettings.kt */
/* loaded from: classes16.dex */
public final class vqd {
    public static final vqd c = new vqd(false, false);
    public final boolean a;
    public final boolean b;

    /* compiled from: ClipsDiscoverPreloadSettings.kt */
    public static final class a {
        public static vqd a(JSONObject jSONObject) {
            return new vqd(jSONObject.optBoolean("preload_on_init", false), jSONObject.optBoolean("preload_from_persistent", false));
        }
    }

    public vqd(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
