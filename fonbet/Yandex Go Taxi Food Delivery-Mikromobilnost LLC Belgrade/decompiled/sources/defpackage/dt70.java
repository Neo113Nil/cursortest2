package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class dt70 implements ft70 {
    public final String a;
    public final String b;
    public final String c;

    public dt70(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt70)) {
            return false;
        }
        dt70 dt70Var = (dt70) obj;
        return jl40.l(this.a, dt70Var.a) && jl40.l(this.b, dt70Var.b) && jl40.l(this.c, dt70Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("Scooters(sessionId=", this.a, ", scooterNumber=", this.b, ", offerId="), this.c, Extension.C_BRAKE);
    }
}
