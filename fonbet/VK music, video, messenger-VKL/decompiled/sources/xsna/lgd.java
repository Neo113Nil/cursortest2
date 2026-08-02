package xsna;

import org.json.JSONObject;

/* compiled from: ClipsArgumentsPrefetchSettings.kt */
/* loaded from: classes17.dex */
public final class lgd {
    public static final lgd e = new lgd(false, 6, 0, 0);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;

    /* compiled from: ClipsArgumentsPrefetchSettings.kt */
    public static final class a {
        public static lgd a(JSONObject jSONObject) {
            return new lgd(true, jSONObject.optInt("clip_count", 6), jSONObject.optInt("ads_count", 0), jSONObject.optInt("loader_count", 0));
        }
    }

    public lgd(boolean z, int i, int i2, int i3) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgd)) {
            return false;
        }
        lgd lgdVar = (lgd) obj;
        return this.a == lgdVar.a && this.b == lgdVar.b && this.c == lgdVar.c && this.d == lgdVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, shy.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsArgumentsPrefetchSettings(isEnabled=");
        sb.append(this.a);
        sb.append(", prefetchClipsCount=");
        sb.append(this.b);
        sb.append(", prefetchAdsCount=");
        sb.append(this.c);
        sb.append(", prefetchLoaderCount=");
        return vu5.b(sb, this.d, ')');
    }
}
