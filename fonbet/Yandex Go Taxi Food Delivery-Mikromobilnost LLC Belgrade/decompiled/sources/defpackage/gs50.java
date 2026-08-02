package defpackage;

/* loaded from: classes2.dex */
public final class gs50 {
    public final String a;
    public final String b;

    public gs50(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs50)) {
            return false;
        }
        gs50 gs50Var = (gs50) obj;
        return this.a.equals(gs50Var.a) && this.b.equals(gs50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkEndPoint(scheme=");
        sb.append(this.a);
        sb.append(", host=");
        return b64.p(sb, this.b, ')');
    }
}
