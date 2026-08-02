package defpackage;

/* loaded from: classes9.dex */
public final class g5x {
    public final String a;
    public final Object b;

    public g5x(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5x)) {
            return false;
        }
        g5x g5xVar = (g5x) obj;
        return this.a.equals(g5xVar.a) && this.b.equals(g5xVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JasonEvent(name=");
        sb.append(this.a);
        sb.append(", data=");
        return qv10.r(sb, this.b, ')');
    }
}
