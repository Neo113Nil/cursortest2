package defpackage;

/* loaded from: classes12.dex */
public final class o7z0 {
    public final Integer a;
    public final Integer b;

    public o7z0(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7z0)) {
            return false;
        }
        o7z0 o7z0Var = (o7z0) obj;
        return jl40.l(this.a, o7z0Var.a) && jl40.l(this.b, o7z0Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }
}
