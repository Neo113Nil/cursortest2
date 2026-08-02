package defpackage;

/* loaded from: classes9.dex */
public final class i5x implements j5x {
    public final long a;

    public i5x(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i5x) && this.a == ((i5x) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return b64.o(new StringBuilder("JasonInt64(content="), this.a, ')');
    }
}
