package defpackage;

/* loaded from: classes10.dex */
public final class op60 {
    public final int a;
    public final Integer b;

    public op60(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof op60)) {
            return false;
        }
        op60 op60Var = (op60) obj;
        return this.a == op60Var.a && jl40.l(this.b, op60Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ObjectLocation(group=");
        sb.append(this.a);
        sb.append(", dataOffset=");
        return vfc.o(sb, this.b, ')');
    }
}
