package defpackage;

/* loaded from: classes7.dex */
public final class mo81 {
    public final long a;
    public final long b;

    public mo81(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mo81)) {
            return false;
        }
        mo81 mo81Var = (mo81) obj;
        return this.a == mo81Var.a && this.b == mo81Var.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
