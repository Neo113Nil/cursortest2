package xsna;

import org.json.JSONObject;

/* compiled from: ClipsTopbarTabsBlocksConfig.kt */
/* loaded from: classes16.dex */
public final class gaf {
    public static final gaf d = new gaf(false, false, false);
    public final boolean a;
    public final boolean b;
    public final boolean c;

    /* compiled from: ClipsTopbarTabsBlocksConfig.kt */
    public static final class a {
        public static gaf a(JSONObject jSONObject, boolean z) {
            if (jSONObject == null) {
                return new gaf(z, false, false);
            }
            return new gaf(z || jSONObject.optBoolean("enabled", false), jSONObject.optBoolean("shops", false), jSONObject.optBoolean("trends", false));
        }
    }

    public gaf(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gaf)) {
            return false;
        }
        gaf gafVar = (gaf) obj;
        return this.a == gafVar.a && this.b == gafVar.b && this.c == gafVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsTopbarTabsBlocksConfig(isEnabled=");
        sb.append(this.a);
        sb.append(", shopsEnabled=");
        sb.append(this.b);
        sb.append(", trendsEnabled=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
