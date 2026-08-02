package xsna;

import org.json.JSONObject;

/* compiled from: ClipsRecomEventsConfig.kt */
/* loaded from: classes17.dex */
public final class f0f {
    public static final f0f d = new f0f(false, 20, 20);
    public final boolean a;
    public final long b;
    public final int c;

    /* compiled from: ClipsRecomEventsConfig.kt */
    public static final class a {
        public static f0f a(JSONObject jSONObject, boolean z) {
            return new f0f(z, jSONObject != null ? jSONObject.optLong("time", 20L) : 20L, jSONObject != null ? jSONObject.optInt("count", 20) : 20);
        }
    }

    public f0f(boolean z, long j, int i) {
        this.a = z;
        this.b = j;
        this.c = i;
    }
}
