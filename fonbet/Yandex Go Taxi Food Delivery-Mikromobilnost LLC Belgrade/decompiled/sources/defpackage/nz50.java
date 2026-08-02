package defpackage;

import com.adjust.sdk.Constants;

/* loaded from: classes2.dex */
public final class nz50 {
    public static final d6w g = new d6w(Constants.MINIMAL_ERROR_STATUS_CODE, 599, 1);
    public final gz50 a;
    public final lz50 b;
    public final int c;
    public final String d;
    public final xu50 e;
    public final Object f;

    public nz50(gz50 gz50Var, lz50 lz50Var, int i, String str, xu50 xu50Var, rvj0 rvj0Var) {
        this.a = gz50Var;
        this.b = lz50Var;
        this.c = i;
        this.d = str;
        this.e = xu50Var;
        this.f = rvj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nz50) {
            nz50 nz50Var = (nz50) obj;
            if (this.a.equals(nz50Var.a) && this.b.equals(nz50Var.b) && this.c == nz50Var.c && jl40.l(this.d, nz50Var.d) && this.e == nz50Var.e && jl40.l(this.f, nz50Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + unr0.b(oyr.b(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b.a), 31), 31, this.d)) * 31;
        Object obj = this.f;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return vuu0.c("\n            Response status: " + this.c + "\n            \n            Headers:\n            " + this.e + "\n        ");
    }
}
