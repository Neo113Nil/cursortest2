package defpackage;

/* loaded from: classes10.dex */
public final class hdt0 {
    public final Object a;
    public final int b;

    public hdt0(int i, Object obj) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdt0)) {
            return false;
        }
        hdt0 hdt0Var = (hdt0) obj;
        return jl40.l(this.a, hdt0Var.a) && this.b == hdt0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SourceInformationSlotTableGroupIdentity(parentIdentity=");
        sb.append(this.a);
        sb.append(", index=");
        return oyr.s(sb, this.b, ')');
    }
}
