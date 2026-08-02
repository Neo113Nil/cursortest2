package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class j8d0 {
    public static final c8d0 Companion = new c8d0();
    public final f8d0 a;
    public final a8d0 b;

    public /* synthetic */ j8d0(int i, f8d0 f8d0Var, a8d0 a8d0Var) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, b8d0.a.getDescriptor());
            throw null;
        }
        this.a = f8d0Var;
        this.b = a8d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8d0)) {
            return false;
        }
        j8d0 j8d0Var = (j8d0) obj;
        return jl40.l(this.a, j8d0Var.a) && jl40.l(this.b, j8d0Var.b);
    }

    public final int hashCode() {
        f8d0 f8d0Var = this.a;
        int hashCode = (f8d0Var == null ? 0 : f8d0Var.hashCode()) * 31;
        a8d0 a8d0Var = this.b;
        return hashCode + (a8d0Var != null ? a8d0Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlusPayAcquisitionGetSmartOffersRequestDto(context=" + this.a + ", geoLocation=" + this.b + ')';
    }

    public j8d0(f8d0 f8d0Var, a8d0 a8d0Var) {
        this.a = f8d0Var;
        this.b = a8d0Var;
    }
}
