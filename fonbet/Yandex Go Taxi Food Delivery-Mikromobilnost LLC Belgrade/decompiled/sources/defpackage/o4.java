package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class o4 {
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;

    public o4(String str, String str2, String str3, String str4, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4)) {
            return false;
        }
        o4 o4Var = (o4) obj;
        return this.a.equals(o4Var.a) && this.b.equals(o4Var.b) && this.c == o4Var.c && jl40.l(this.d, o4Var.d) && jl40.l(this.e, o4Var.e);
    }

    public final int hashCode() {
        int c = qv10.c(unr0.b(unr0.b(-1140783647, 31, this.a), 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("AbandonedCartNotificationParams(id=abandoned_cart_notification, title=", this.a, ", body=", this.b, ", delayMillis=");
        uw51.v(this.c, ", deeplink=", this.d, v);
        return unr0.r(v, ", metricaContext=", this.e, Extension.C_BRAKE);
    }
}
