package defpackage;

/* loaded from: classes8.dex */
public final class hqr {
    public final Object a;
    public final Object b;

    public hqr(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqr)) {
            return false;
        }
        hqr hqrVar = (hqr) obj;
        return jl40.l(this.a, hqrVar.a) && jl40.l(this.b, hqrVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlowHistory(previous=");
        sb.append(this.a);
        sb.append(", current=");
        return qv10.r(sb, this.b, ')');
    }
}
