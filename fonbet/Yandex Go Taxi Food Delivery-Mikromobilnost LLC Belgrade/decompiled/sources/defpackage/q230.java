package defpackage;

/* loaded from: classes2.dex */
public final class q230 {
    public final int a;
    public final int b;
    public final r130 c;
    public final Integer d;
    public final Boolean e;

    public q230(int i, int i2, r130 r130Var, Integer num, Boolean bool) {
        this.a = i;
        this.b = i2;
        this.c = r130Var;
        this.d = num;
        this.e = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q230)) {
            return false;
        }
        q230 q230Var = (q230) obj;
        return this.a == q230Var.a && this.b == q230Var.b && jl40.l(this.c, q230Var.c) && jl40.l(this.d, q230Var.d) && jl40.l(this.e, q230Var.e);
    }

    public final int hashCode() {
        int b = oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
        r130 r130Var = this.c;
        int hashCode = (b + (r130Var == null ? 0 : r130Var.hashCode())) * 31;
        Integer num = this.d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.e;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModalViewOptions(hideThreshold=");
        sb.append(this.a);
        sb.append(", downwardScrollFriction=");
        sb.append(this.b);
        sb.append(", modalHeight=");
        sb.append(this.c);
        sb.append(", shadowAlpha=");
        sb.append(this.d);
        sb.append(", disableClose=");
        return oo31.i(sb, this.e, ')');
    }
}
