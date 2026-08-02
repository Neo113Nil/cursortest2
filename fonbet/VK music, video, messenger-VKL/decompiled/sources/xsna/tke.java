package xsna;

import org.json.JSONObject;

/* compiled from: ClipsLivesChatConfig.kt */
/* loaded from: classes16.dex */
public final class tke {
    public static final tke d = new tke(false, false, false);
    public final boolean a;
    public final boolean b;
    public final boolean c;

    /* compiled from: ClipsLivesChatConfig.kt */
    public static final class a {
        public static tke a(JSONObject jSONObject) {
            return new tke(true, jSONObject.optBoolean("visible_on_init"), jSONObject.optBoolean("keep_visibility_state"));
        }
    }

    public tke(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean a() {
        return this.c;
    }

    public final boolean b() {
        return this.a;
    }

    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tke)) {
            return false;
        }
        tke tkeVar = (tke) obj;
        return this.a == tkeVar.a && this.b == tkeVar.b && this.c == tkeVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsLivesChatConfig(isOn=");
        sb.append(this.a);
        sb.append(", isVisibleOnInit=");
        sb.append(this.b);
        sb.append(", keepVisibilityStateForSession=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
