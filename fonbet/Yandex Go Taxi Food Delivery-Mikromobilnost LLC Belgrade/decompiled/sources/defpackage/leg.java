package defpackage;

/* loaded from: classes2.dex */
public final class leg {
    public final String a;
    public final neg b;

    public leg(String str, neg negVar) {
        this.a = str;
        this.b = negVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof leg)) {
            return false;
        }
        leg legVar = (leg) obj;
        return this.a.equals(legVar.a) && this.b.equals(legVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Background(color=" + this.a + ", colors=" + this.b + ')';
    }
}
