package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class fth extends lth {
    public final String a;
    public final String b;
    public final String c;

    public fth(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fth)) {
            return false;
        }
        fth fthVar = (fth) obj;
        return jl40.l(this.a, fthVar.a) && jl40.l(this.b, fthVar.b) && jl40.l(this.c, fthVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("OrderPayNowRequested(type=", this.a, ", deliveryId=", this.b, ", requestId="), this.c, Extension.C_BRAKE);
    }
}
