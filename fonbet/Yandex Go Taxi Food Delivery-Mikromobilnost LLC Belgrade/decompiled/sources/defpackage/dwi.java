package defpackage;

/* loaded from: classes.dex */
public final class dwi {
    public int a;

    public dwi(int i) {
        this.a = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dwi) && this.a == ((dwi) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.s(new StringBuilder("DeltaCounter(count="), this.a, ')');
    }

    public dwi() {
        this(0);
    }
}
