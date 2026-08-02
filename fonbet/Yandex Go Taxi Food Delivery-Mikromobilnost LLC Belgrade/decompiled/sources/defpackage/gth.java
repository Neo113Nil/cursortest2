package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class gth extends lth {
    public final String a;
    public final String b;
    public final String c;

    public gth(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gth)) {
            return false;
        }
        gth gthVar = (gth) obj;
        return jl40.l(this.a, gthVar.a) && jl40.l(this.b, gthVar.b) && jl40.l(this.c, gthVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("OrderPayNowSucceeded(type=", this.a, ", requestId=", this.b, ", deliveryId="), this.c, Extension.C_BRAKE);
    }
}
