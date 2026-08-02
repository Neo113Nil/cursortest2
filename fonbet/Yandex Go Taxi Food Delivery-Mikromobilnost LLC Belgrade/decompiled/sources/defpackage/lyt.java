package defpackage;

/* loaded from: classes2.dex */
public final class lyt {
    public final myt a;
    public final nyt b;

    public lyt(myt mytVar, nyt nytVar) {
        this.a = mytVar;
        this.b = nytVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyt)) {
            return false;
        }
        lyt lytVar = (lyt) obj;
        return this.a.equals(lytVar.a) && this.b.equals(lytVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnRadialGradient(relativeCenter=" + this.a + ", relativeRadius=" + this.b + ')';
    }
}
