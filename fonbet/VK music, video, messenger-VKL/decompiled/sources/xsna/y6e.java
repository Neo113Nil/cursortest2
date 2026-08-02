package xsna;

import org.json.JSONObject;

/* compiled from: ClipsFeedInitialChunkSettings.kt */
/* loaded from: classes17.dex */
public final class y6e {
    public static final y6e c = new y6e(false, 10);
    public final boolean a;
    public final int b;

    /* compiled from: ClipsFeedInitialChunkSettings.kt */
    public static final class a {
        public static y6e a(JSONObject jSONObject) {
            return new y6e(true, jSONObject.optInt("chunk_size", 10));
        }
    }

    public y6e(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6e)) {
            return false;
        }
        y6e y6eVar = (y6e) obj;
        return this.a == y6eVar.a && this.b == y6eVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsFeedInitialChunkSettings(isEnabled=");
        sb.append(this.a);
        sb.append(", chunkSize=");
        return vu5.b(sb, this.b, ')');
    }
}
