package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class i8f0 {
    public static final x7f0 Companion = new x7f0();
    public final boolean a;
    public final h8f0 b;

    public /* synthetic */ i8f0(int i, boolean z, h8f0 h8f0Var) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, w7f0.a.getDescriptor());
            throw null;
        }
        this.a = z;
        this.b = h8f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8f0)) {
            return false;
        }
        i8f0 i8f0Var = (i8f0) obj;
        return this.a == i8f0Var.a && jl40.l(this.b, i8f0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ProductDto(available=" + this.a + ", productDetails=" + this.b + ')';
    }
}
