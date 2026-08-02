package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class clq0 {
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;

    public clq0(String str, boolean z, String str2, String str3) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clq0)) {
            return false;
        }
        clq0 clq0Var = (clq0) obj;
        return jl40.l(this.a, clq0Var.a) && this.b == clq0Var.b && jl40.l(this.c, clq0Var.c) && jl40.l(this.d, clq0Var.d);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return g8e.r(oo31.l("SelectorAnalyticsContext(property=", this.a, ", byUser=", ", tripId=", this.b), this.c, ", requestId=", this.d, Extension.C_BRAKE);
    }
}
