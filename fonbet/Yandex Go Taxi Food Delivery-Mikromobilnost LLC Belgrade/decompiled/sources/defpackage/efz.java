package defpackage;

/* loaded from: classes2.dex */
public final class efz {
    public final int a;
    public final Object b;

    public efz(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efz)) {
            return false;
        }
        efz efzVar = (efz) obj;
        return this.a == efzVar.a && jl40.l(this.b, efzVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Object obj = this.b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogField(title=");
        sb.append(this.a);
        sb.append(", value=");
        return qv10.r(sb, this.b, ')');
    }
}
