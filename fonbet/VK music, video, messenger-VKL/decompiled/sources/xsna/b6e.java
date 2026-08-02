package xsna;

import org.json.JSONObject;

/* compiled from: ClipsFeedChunksSettings.kt */
/* loaded from: classes17.dex */
public final class b6e {
    public static final b6e c = new b6e(10, 3);
    public final int a;
    public final int b;

    /* compiled from: ClipsFeedChunksSettings.kt */
    public static final class a {
        public static b6e a(JSONObject jSONObject) {
            return new b6e(jSONObject.optInt("chunk_size", 10), jSONObject.optInt("chunk_offset_to_load", 3));
        }
    }

    public b6e(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6e)) {
            return false;
        }
        b6e b6eVar = (b6e) obj;
        return this.a == b6eVar.a && this.b == b6eVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsFeedChunksSettings(chunkSize=");
        sb.append(this.a);
        sb.append(", chunkOffsetToLoad=");
        return vu5.b(sb, this.b, ')');
    }
}
