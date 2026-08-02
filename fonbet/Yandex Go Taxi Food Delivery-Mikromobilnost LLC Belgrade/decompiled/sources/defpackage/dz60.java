package defpackage;

/* loaded from: classes5.dex */
public final class dz60 {
    public final iz60 a;

    public dz60(iz60 iz60Var) {
        this.a = iz60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dz60) && this.a.equals(((dz60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "ReferenceParams(timeout=" + this.a + ", jump=null)";
    }
}
