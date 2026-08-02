package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class dth extends lth {
    public final String a;
    public final String b;
    public final String c;

    public dth(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dth)) {
            return false;
        }
        dth dthVar = (dth) obj;
        return jl40.l(this.a, dthVar.a) && jl40.l(this.b, dthVar.b) && jl40.l(this.c, dthVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("OrderEditSucceeded(type=", this.a, ", requestId=", this.b, ", deliveryId="), this.c, Extension.C_BRAKE);
    }
}
