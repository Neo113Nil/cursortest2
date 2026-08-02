package defpackage;

/* loaded from: classes9.dex */
public final class p5x implements o5x {
    public final int a;

    public p5x(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p5x) && this.a == ((p5x) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.s(new StringBuilder("Index(index="), this.a, ')');
    }
}
