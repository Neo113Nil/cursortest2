package defpackage;

/* loaded from: classes2.dex */
public final class ft50 implements jt50 {
    public final nz50 a;

    public ft50(nz50 nz50Var) {
        this.a = nz50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ft50) && this.a.equals(((ft50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response error; code = ");
        nz50 nz50Var = this.a;
        sb.append(nz50Var.c);
        sb.append(", message = ");
        sb.append(nz50Var.d);
        return sb.toString();
    }
}
