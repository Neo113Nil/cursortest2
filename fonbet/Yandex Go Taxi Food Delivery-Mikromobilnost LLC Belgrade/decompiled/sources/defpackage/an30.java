package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class an30 implements bn30 {
    public final String a;
    public final String b;
    public final pj40 c;

    public an30(String str, String str2, pj40 pj40Var) {
        this.a = str;
        this.b = str2;
        this.c = pj40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an30)) {
            return false;
        }
        an30 an30Var = (an30) obj;
        return jl40.l(this.a, an30Var.a) && jl40.l(this.b, an30Var.b) && this.c.equals(an30Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("VehicleModal(vehicleId=", this.a, ", lineId=", this.b, ", utmParams=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
