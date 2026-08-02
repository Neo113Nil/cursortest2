package defpackage;

/* loaded from: classes13.dex */
public final class kq implements fr {
    public final ti80 a;
    public final lg80 b;
    public final String c;
    public final String d;
    public final boolean e;

    public kq(ti80 ti80Var, lg80 lg80Var, String str, String str2, boolean z, int i) {
        z = (i & 16) != 0 ? false : z;
        this.a = ti80Var;
        this.b = lg80Var;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kq)) {
            return false;
        }
        kq kqVar = (kq) obj;
        return jl40.l(this.a, kqVar.a) && jl40.l(this.b, kqVar.b) && jl40.l(this.c, kqVar.c) && jl40.l(this.d, kqVar.d) && this.e == kqVar.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        lg80 lg80Var = this.b;
        int hashCode2 = (hashCode + (lg80Var == null ? 0 : lg80Var.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return unr0.e((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrganizationCardAction(id=");
        sb.append(this.a);
        sb.append(", mode=");
        sb.append(this.b);
        sb.append(", yclid=");
        g8e.D(sb, this.c, ", bannerId=", this.d, ", openOrgCardWithSlider=");
        return x4e.i(sb, this.e, ", sliderPinDisplayStrategy=null)");
    }
}
