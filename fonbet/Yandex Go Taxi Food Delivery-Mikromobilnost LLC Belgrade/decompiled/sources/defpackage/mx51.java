package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class mx51 {
    public static final mx51 h = new mx51("", "", "", "", false, false, false);
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public mx51(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx51)) {
            return false;
        }
        mx51 mx51Var = (mx51) obj;
        return this.a == mx51Var.a && jl40.l(this.b, mx51Var.b) && jl40.l(this.c, mx51Var.c) && jl40.l(this.d, mx51Var.d) && this.e.equals(mx51Var.e) && this.f == mx51Var.f && this.g == mx51Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + unr0.e(unr0.b(unr0.b(unr0.b(unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder v = ly3.v("YbSplitWidgetsState(splitAvailable=", ", baseLimit=", this.b, ", remainingLimit=", this.a);
        g8e.D(v, this.c, ", currencySign=", this.d, ", totalDebt=");
        tse0.y(this.e, ", splitUpgraded=", ", hasActiveSplit=", v, this.f);
        return x4e.i(v, this.g, Extension.C_BRAKE);
    }
}
