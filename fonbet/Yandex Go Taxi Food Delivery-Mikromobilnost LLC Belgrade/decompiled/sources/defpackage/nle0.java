package defpackage;

/* loaded from: classes.dex */
public final class nle0 {
    public final String a;
    public final Long b;

    public nle0(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nle0)) {
            return false;
        }
        nle0 nle0Var = (nle0) obj;
        return this.a.equals(nle0Var.a) && this.b.equals(nle0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Preference(key=");
        sb.append(this.a);
        sb.append(", value=");
        return qv10.q(sb, this.b, ')');
    }
}
