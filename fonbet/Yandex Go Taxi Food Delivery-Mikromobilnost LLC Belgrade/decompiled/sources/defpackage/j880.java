package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class j880 {
    public final String a;
    public final String b;
    public final String c;

    public j880(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j880)) {
            return false;
        }
        j880 j880Var = (j880) obj;
        return jl40.l(this.a, j880Var.a) && jl40.l(this.b, j880Var.b) && jl40.l(this.c, j880Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(b64.v("OrderStatusNotification(title=", this.a, ", text=", this.b, ", backToSummaryButtonText="), this.c, Extension.C_BRAKE);
    }
}
