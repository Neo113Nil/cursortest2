package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class iyz0 {
    public static final hyz0 Companion = new hyz0();
    public final String a;
    public final String b;
    public final fyz0 c;

    public /* synthetic */ iyz0(int i, String str, String str2, fyz0 fyz0Var) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, gyz0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = fyz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyz0)) {
            return false;
        }
        iyz0 iyz0Var = (iyz0) obj;
        return jl40.l(this.a, iyz0Var.a) && jl40.l(this.b, iyz0Var.b) && jl40.l(this.c, iyz0Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        fyz0 fyz0Var = this.c;
        return b + (fyz0Var == null ? 0 : fyz0Var.hashCode());
    }

    public final String toString() {
        return "WidgetUrl(light=" + this.a + ", dark=" + this.b + ", timeoutParams=" + this.c + ')';
    }
}
