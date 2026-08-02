package defpackage;

import yads.t32;

/* loaded from: classes7.dex */
public final class g271 {
    public final nl61 a;
    public final t32 b;
    public final gh61 c;

    public g271(nl61 nl61Var, t32 t32Var, gh61 gh61Var) {
        this.a = nl61Var;
        this.b = t32Var;
        this.c = gh61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g271) {
            g271 g271Var = (g271) obj;
            return jl40.l(this.a, g271Var.a) && this.b == g271Var.b && this.c == g271Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(1) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "NativeAdRequestData(adRequestData=" + this.a + ", nativeResponseType=" + this.b + ", requestPolicy=" + this.c + ", adsCount=1)";
    }
}
