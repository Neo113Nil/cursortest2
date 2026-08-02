package xsna;

import org.json.JSONObject;

/* compiled from: ClipsTopbarTabsScrollConfig.kt */
/* loaded from: classes16.dex */
public final class iaf {
    public static final iaf c = new iaf(false, 4);
    public final boolean a;
    public final int b;

    /* compiled from: ClipsTopbarTabsScrollConfig.kt */
    public static final class a {
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
        
            if (r3.optBoolean("enabled", false) != false) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static iaf a(JSONObject jSONObject, boolean z) {
            if (jSONObject == null) {
                return new iaf(z, 4);
            }
            boolean z2 = z;
            return new iaf(z2, jSONObject.optInt("hide_after_position", 4));
        }
    }

    public iaf(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iaf)) {
            return false;
        }
        iaf iafVar = (iaf) obj;
        return this.a == iafVar.a && this.b == iafVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsTopbarTabsScrollConfig(isEnabled=");
        sb.append(this.a);
        sb.append(", hideAfterPosition=");
        return vu5.b(sb, this.b, ')');
    }
}
