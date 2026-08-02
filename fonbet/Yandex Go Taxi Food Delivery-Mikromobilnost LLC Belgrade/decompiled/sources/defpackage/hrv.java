package defpackage;

/* loaded from: classes9.dex */
public final class hrv {
    public final int a;
    public final Object b;

    public hrv(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hrv)) {
            return false;
        }
        hrv hrvVar = (hrv) obj;
        return this.a == hrvVar.a && jl40.l(this.b, hrvVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Object obj = this.b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndexedValue(index=");
        sb.append(this.a);
        sb.append(", value=");
        return qv10.r(sb, this.b, ')');
    }
}
