package defpackage;

/* loaded from: classes10.dex */
public final class bhd {
    public final int a;
    public final zf0 b;
    public final Integer c;

    public bhd(int i, zf0 zf0Var, Integer num) {
        this.a = i;
        this.b = zf0Var;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhd)) {
            return false;
        }
        bhd bhdVar = (bhd) obj;
        return this.a == bhdVar.a && jl40.l(this.b, bhdVar.b) && jl40.l(this.c, bhdVar.c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        zf0 zf0Var = this.b;
        int hashCode2 = (hashCode + (zf0Var == null ? 0 : zf0Var.hashCode())) * 31;
        Integer num = this.c;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ComposeStackTraceFrame(groupKey=");
        sb.append(this.a);
        sb.append(", sourceInfo=");
        sb.append(this.b);
        sb.append(", groupOffset=");
        return vfc.o(sb, this.c, ')');
    }
}
