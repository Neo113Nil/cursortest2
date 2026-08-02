package xsna;

import org.json.JSONObject;

/* compiled from: ClipsMoreShopsPreloadConfig.kt */
/* loaded from: classes17.dex */
public final class mle {
    public static final mle e = new mle(1, 1000, false, false);
    public final boolean a;
    public final int b;
    public final int c;
    public final boolean d;

    /* compiled from: ClipsMoreShopsPreloadConfig.kt */
    public static final class a {
        public static mle a(JSONObject jSONObject, boolean z) {
            return new mle(swe0.g(jSONObject.optInt("preload_count", 1), 1, 5), swe0.g(jSONObject.optInt("preload_threshold_ms", 1000), 0, 10000), z, jSONObject.optBoolean("prefetch_video_enabled", false));
        }
    }

    public mle(int i, int i2, boolean z, boolean z2) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = z2;
    }
}
