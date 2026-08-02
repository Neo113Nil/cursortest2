package defpackage;

/* loaded from: classes2.dex */
public final class keg {
    public final String a;
    public final peg b;

    public keg(String str, peg pegVar) {
        this.a = str;
        this.b = pegVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof keg)) {
            return false;
        }
        keg kegVar = (keg) obj;
        return this.a.equals(kegVar.a) && this.b.equals(kegVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Action(__typename=" + this.a + ", onAction=" + this.b + ')';
    }
}
