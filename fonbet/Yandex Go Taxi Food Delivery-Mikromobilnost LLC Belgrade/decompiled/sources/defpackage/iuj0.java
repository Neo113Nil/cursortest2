package defpackage;

/* loaded from: classes5.dex */
public final class iuj0 extends ztz {
    public final Integer a;
    public final Boolean b;

    public iuj0(int i, Integer num) {
        num = (i & 1) != 0 ? null : num;
        Boolean bool = Boolean.FALSE;
        this.a = num;
        this.b = bool;
    }

    @Override // defpackage.v4v
    public final String a() {
        return null;
    }

    @Override // defpackage.v4v
    public final Boolean b() {
        return this.b;
    }

    @Override // defpackage.v4v
    public final bfz0 c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iuj0)) {
            return false;
        }
        iuj0 iuj0Var = (iuj0) obj;
        return jl40.l(this.a, iuj0Var.a) && jl40.l(this.b, iuj0Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 961;
        Boolean bool = this.b;
        return (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "ResourceLottieModel(resId=" + this.a + ", contentDescription=null, monochrome=" + this.b + ", tintColor=null)";
    }

    public iuj0() {
        this(15, null);
    }
}
