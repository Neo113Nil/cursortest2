package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class glb implements snb {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public glb(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // defpackage.snb
    public final String a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof glb)) {
            return false;
        }
        glb glbVar = (glb) obj;
        return jl40.l(this.a, glbVar.a) && jl40.l(this.b, glbVar.b) && jl40.l(this.c, glbVar.c) && this.d.equals(glbVar.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return g8e.r(b64.v("CheckoutPaymentSucceedAnalytics(tripId=", this.a, ", orderId=", this.b, ", requestId="), this.c, ", eventKey=", this.d, Extension.C_BRAKE);
    }
}
