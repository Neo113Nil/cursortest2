package xsna;

/* compiled from: MutableCounter.kt */
/* loaded from: classes11.dex */
public final class zyl {
    public int a;

    public zyl() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zyl) && this.a == ((zyl) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("DeltaCounter(count="), this.a, ')');
    }

    public zyl(int i) {
        this.a = 0;
    }
}
