package xsna;

/* compiled from: Preference.kt */
/* loaded from: classes.dex */
public final class txc0 {
    public final String a;
    public final Long b;

    public txc0(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txc0)) {
            return false;
        }
        txc0 txc0Var = (txc0) obj;
        return epx.f(this.a, txc0Var.a) && epx.f(this.b, txc0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Preference(key=");
        sb.append(this.a);
        sb.append(", value=");
        return iq.b(sb, this.b, ')');
    }
}
