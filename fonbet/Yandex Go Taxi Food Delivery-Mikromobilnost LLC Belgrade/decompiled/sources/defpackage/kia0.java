package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class kia0 {
    public static final gia0 Companion = new gia0();
    public final String a;
    public final jia0 b;

    public /* synthetic */ kia0(int i, String str, jia0 jia0Var) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, fia0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = jia0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kia0)) {
            return false;
        }
        kia0 kia0Var = (kia0) obj;
        return jl40.l(this.a, kia0Var.a) && jl40.l(this.b, kia0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PaymentScreenDto(screenName=" + this.a + ", screenContent=" + this.b + ')';
    }
}
