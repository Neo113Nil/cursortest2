package defpackage;

/* loaded from: classes10.dex */
public final class hyv {
    public final fyv a;

    public hyv(fyv fyvVar) {
        this.a = fyvVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hyv)) {
            return false;
        }
        return this.a.equals(((hyv) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
