package xsna;

/* compiled from: ModifierExt.kt */
/* loaded from: classes17.dex */
public final class s2u0 {
    public final long a;
    public final long b;

    public s2u0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final long a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2u0)) {
            return false;
        }
        s2u0 s2u0Var = (s2u0) obj;
        return this.a == s2u0Var.a && this.b == s2u0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewedTimeStamp(startViewMs=");
        sb.append(this.a);
        sb.append(", endViewMs=");
        return vu5.a(')', this.b, sb);
    }
}
