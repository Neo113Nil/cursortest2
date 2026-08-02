package xsna;

import org.json.JSONObject;

/* compiled from: ClipsViewerTopBarButtonsConfig.kt */
/* loaded from: classes16.dex */
public final class xof {
    public static final xof c = new xof(false, false);
    public final boolean a;
    public final boolean b;

    /* compiled from: ClipsViewerTopBarButtonsConfig.kt */
    public static final class a {
        public static xof a(JSONObject jSONObject) {
            return jSONObject != null ? new xof(jSONObject.optBoolean("plus", false), jSONObject.optBoolean("search", false)) : xof.c;
        }
    }

    public xof(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xof)) {
            return false;
        }
        xof xofVar = (xof) obj;
        return this.a == xofVar.a && this.b == xofVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsViewerTopBarButtonsConfig(isCreateButtonHidden=");
        sb.append(this.a);
        sb.append(", isSearchButtonHidden=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
