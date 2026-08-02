package xsna;

/* compiled from: MutableCounter.kt */
/* loaded from: classes8.dex */
public final class yyl {
    public int a;

    public yyl() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yyl) && this.a == ((yyl) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("DeltaCounter(count="), this.a, ')');
    }

    public yyl(int i) {
        this.a = 0;
    }
}
