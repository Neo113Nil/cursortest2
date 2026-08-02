package defpackage;

/* loaded from: classes2.dex */
public final class iyt {
    public final jyt a;
    public final double b;

    public iyt(jyt jytVar, double d) {
        this.a = jytVar;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyt)) {
            return false;
        }
        iyt iytVar = (iyt) obj;
        return this.a.equals(iytVar.a) && Double.compare(this.b, iytVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Color(hexColor=");
        sb.append(this.a);
        sb.append(", location=");
        return unr0.q(sb, this.b, ')');
    }
}
