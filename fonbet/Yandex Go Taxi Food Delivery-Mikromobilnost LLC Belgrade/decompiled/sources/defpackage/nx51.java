package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class nx51 {
    public static final nx51 e = new nx51(false, false, "", "");
    public static final nx51 f = new nx51(true, false, "", "");
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;

    public nx51(boolean z, boolean z2, String str, String str2) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx51)) {
            return false;
        }
        nx51 nx51Var = (nx51) obj;
        return this.a == nx51Var.a && this.b == nx51Var.b && jl40.l(this.c, nx51Var.c) && jl40.l(this.d, nx51Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(qv10.u("YbState(enabled=", ", hasCard=", ", cardBalance=", this.a, this.b), this.c, ", cardCurrencySign=", this.d, Extension.C_BRAKE);
    }
}
