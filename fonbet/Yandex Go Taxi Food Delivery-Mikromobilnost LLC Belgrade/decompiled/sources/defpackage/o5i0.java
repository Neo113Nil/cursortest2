package defpackage;

/* loaded from: classes11.dex */
public final class o5i0 extends q5i0 {
    public final float a;

    public o5i0(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o5i0) && Float.compare(this.a, ((o5i0) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return n.n(new StringBuilder("Fixed(value="), this.a, ')');
    }
}
