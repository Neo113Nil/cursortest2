package defpackage;

/* loaded from: classes10.dex */
public final class pkf0 {
    public final int a;
    public final boolean b;

    public pkf0(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pkf0.class != obj.getClass()) {
            return false;
        }
        pkf0 pkf0Var = (pkf0) obj;
        return this.a == pkf0Var.a && this.b == pkf0Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
