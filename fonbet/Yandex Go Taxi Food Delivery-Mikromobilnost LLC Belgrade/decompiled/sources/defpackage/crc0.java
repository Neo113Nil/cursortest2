package defpackage;

/* loaded from: classes8.dex */
public final class crc0 {
    public final String a;
    public final Object b;

    public crc0(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crc0)) {
            return false;
        }
        crc0 crc0Var = (crc0) obj;
        return jl40.l(this.a, crc0Var.a) && jl40.l(this.b, crc0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaqueState(plaqueId=");
        sb.append(this.a);
        sb.append(", payload=");
        return qv10.r(sb, this.b, ')');
    }
}
