package defpackage;

/* loaded from: classes2.dex */
public final class g1e {
    public final String a;
    public final String b;

    public g1e(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1e)) {
            return false;
        }
        g1e g1eVar = (g1e) obj;
        return this.a.equals(g1eVar.a) && this.b.equals(g1eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnTextProperties(name=");
        sb.append(this.a);
        sb.append(", text=");
        return b64.p(sb, this.b, ')');
    }
}
