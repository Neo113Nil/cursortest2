package xsna;

import org.json.JSONObject;

/* compiled from: ClipsFeedCacheSettings.kt */
/* loaded from: classes17.dex */
public final class a6e {
    public static final a6e d = new a6e(1, 3, false);
    public final int a;
    public final int b;
    public final boolean c;

    /* compiled from: ClipsFeedCacheSettings.kt */
    public static final class a {
        public static a6e a(JSONObject jSONObject) {
            return new a6e(jSONObject.optInt("insertion_size", 1), jSONObject.optInt("total_cache_size", 3), jSONObject.optBoolean("prefetch_disabled", false));
        }
    }

    public a6e(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6e)) {
            return false;
        }
        a6e a6eVar = (a6e) obj;
        return this.a == a6eVar.a && this.b == a6eVar.b && this.c == a6eVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsFeedCacheSettings(insertionSize=");
        sb.append(this.a);
        sb.append(", cacheSize=");
        sb.append(this.b);
        sb.append(", isPrefetchDisabled=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
