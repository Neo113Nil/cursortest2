package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class lk51 {
    public static final lk51 e = new lk51("", "", null, null);
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public lk51(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk51)) {
            return false;
        }
        lk51 lk51Var = (lk51) obj;
        return jl40.l(this.a, lk51Var.a) && jl40.l(this.b, lk51Var.b) && jl40.l(this.c, lk51Var.c) && jl40.l(this.d, lk51Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return g8e.r(b64.v("YaPlusInfo(iconUrl=", this.a, ", badgeIconUrl=", this.b, ", title="), this.c, ", description=", this.d, Extension.C_BRAKE);
    }
}
