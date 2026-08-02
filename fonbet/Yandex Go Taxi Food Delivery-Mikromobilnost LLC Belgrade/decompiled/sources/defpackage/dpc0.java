package defpackage;

/* loaded from: classes2.dex */
public final class dpc0 {
    public final int a;

    public dpc0(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dpc0) && this.a == ((dpc0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.s(new StringBuilder("NotPredicate(nodeId="), this.a, ')');
    }
}
