package xsna;

import org.json.JSONObject;

/* compiled from: MessagesCounterSettings.kt */
/* loaded from: classes.dex */
public final class md20 implements bxx {
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public static final a e = new a();
    private static final md20 STUB = new md20(false, false, false);

    /* compiled from: MessagesCounterSettings.kt */
    public static final class a {
        public final md20 getSTUB() {
            return md20.STUB;
        }
    }

    public md20(boolean z, boolean z2, boolean z3) {
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public static md20 b(md20 md20Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = md20Var.b;
        }
        boolean z3 = md20Var.c;
        if ((i & 4) != 0) {
            z2 = md20Var.d;
        }
        md20Var.getClass();
        return new md20(z, z3, z2);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("include_muted", this.b);
        jSONObject.put("include_group_dialogs", this.c);
        jSONObject.put("include_channels", this.d);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md20)) {
            return false;
        }
        md20 md20Var = (md20) obj;
        return this.b == md20Var.b && this.c == md20Var.c && this.d == md20Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesCounterSettings(isMutedIncluded=");
        sb.append(this.b);
        sb.append(", isGroupDialogsIncluded=");
        sb.append(this.c);
        sb.append(", isChannelsIncluded=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
