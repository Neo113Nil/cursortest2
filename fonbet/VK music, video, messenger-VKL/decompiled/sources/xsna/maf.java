package xsna;

import org.json.JSONObject;

/* compiled from: ClipsTrendEngagementGrowthConfig.kt */
/* loaded from: classes17.dex */
public final class maf {
    public static final maf d = new maf(0, false, false);
    public final boolean a;
    public final boolean b;
    public final long c;

    /* compiled from: ClipsTrendEngagementGrowthConfig.kt */
    public static final class a {
        public static maf a(JSONObject jSONObject, boolean z) {
            return new maf(jSONObject != null ? jSONObject.optLong("show_action_button_delay", 0L) : 0L, z, jSONObject != null ? jSONObject.optBoolean("show_once_in_session", false) : false);
        }
    }

    public maf(long j, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof maf)) {
            return false;
        }
        maf mafVar = (maf) obj;
        return this.a == mafVar.a && this.b == mafVar.b && this.c == mafVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsTrendEngagementGrowthConfig(isEnabled=");
        sb.append(this.a);
        sb.append(", showOnFirstTrendOnly=");
        sb.append(this.b);
        sb.append(", showAnimationDelay=");
        return vu5.a(')', this.c, sb);
    }
}
