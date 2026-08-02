package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class g080 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public g080(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g080)) {
            return false;
        }
        g080 g080Var = (g080) obj;
        return this.a == g080Var.a && this.b == g080Var.b && this.c == g080Var.c && this.d == g080Var.d && this.e == g080Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + unr0.e(unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder u = qv10.u("OrderMapObjectsOverride(showingSource=", ", showingDest=", ", showUserLocation=", this.a, this.b);
        nnm.v(", showingPoolPoints=", ", showingIntermediateStops=", u, this.c, this.d);
        return x4e.i(u, this.e, Extension.C_BRAKE);
    }
}
