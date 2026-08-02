package xsna;

/* compiled from: ComposeStackTrace.kt */
/* loaded from: classes11.dex */
public final class vqi {
    public final int a;
    public final pgk0 b;
    public final Integer c;

    public vqi(int i, pgk0 pgk0Var, Integer num) {
        this.a = i;
        this.b = pgk0Var;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqi)) {
            return false;
        }
        vqi vqiVar = (vqi) obj;
        return this.a == vqiVar.a && epx.f(this.b, vqiVar.b) && epx.f(this.c, vqiVar.c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        pgk0 pgk0Var = this.b;
        int hashCode2 = (hashCode + (pgk0Var == null ? 0 : pgk0Var.hashCode())) * 31;
        Integer num = this.c;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ComposeStackTraceFrame(groupKey=");
        sb.append(this.a);
        sb.append(", sourceInfo=");
        sb.append(this.b);
        sb.append(", groupOffset=");
        return uqi.b(sb, this.c, ')');
    }
}
