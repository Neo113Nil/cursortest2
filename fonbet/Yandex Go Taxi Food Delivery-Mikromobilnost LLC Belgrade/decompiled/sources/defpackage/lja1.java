package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class lja1 {
    public final Context a;
    public final rhw0 b;

    public lja1(Context context, rhw0 rhw0Var) {
        this.a = context;
        this.b = rhw0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lja1)) {
            return false;
        }
        lja1 lja1Var = (lja1) obj;
        if (!this.a.equals(lja1Var.a)) {
            return false;
        }
        rhw0 rhw0Var = lja1Var.b;
        rhw0 rhw0Var2 = this.b;
        return rhw0Var2 == null ? rhw0Var == null : rhw0Var2.equals(rhw0Var);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        rhw0 rhw0Var = this.b;
        return (rhw0Var == null ? 0 : rhw0Var.hashCode()) ^ (hashCode * 1000003);
    }

    public final String toString() {
        String obj = this.a.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(length + 45 + valueOf.length() + 1);
        g8e.D(sb, "FlagsContext{context=", obj, ", hermeticFileOverrides=", valueOf);
        sb.append("}");
        return sb.toString();
    }
}
