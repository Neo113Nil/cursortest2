package xsna;

import org.json.JSONObject;

/* compiled from: ClipsNewsMonothemeConfig.kt */
/* loaded from: classes17.dex */
public final class wme {
    public static final wme c = new wme(false, 3);
    public final boolean a;
    public final int b;

    /* compiled from: ClipsNewsMonothemeConfig.kt */
    public static final class a {
        public static wme a(JSONObject jSONObject, boolean z) {
            return new wme(z, jSONObject.optInt("fill_animation_delay_sec", 3));
        }
    }

    public wme(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wme)) {
            return false;
        }
        wme wmeVar = (wme) obj;
        return this.a == wmeVar.a && this.b == wmeVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsNewsMonothemeConfig(isEnabled=");
        sb.append(this.a);
        sb.append(", fillAnimationDelaySec=");
        return vu5.b(sb, this.b, ')');
    }
}
