package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class hpx0 implements pk60 {
    public static final hpx0 e = new hpx0("", null, null, null);
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public hpx0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpx0)) {
            return false;
        }
        hpx0 hpx0Var = (hpx0) obj;
        return jl40.l(this.a, hpx0Var.a) && jl40.l(this.b, hpx0Var.b) && jl40.l(this.c, hpx0Var.c) && jl40.l(this.d, hpx0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return g8e.r(b64.v("TariffUnavailableNotificationModel(title=", this.a, ", subtitle=", this.b, ", iconTag="), this.c, ", deeplink=", this.d, Extension.C_BRAKE);
    }
}
