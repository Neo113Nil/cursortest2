package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class bx30 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public bx30(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx30)) {
            return false;
        }
        bx30 bx30Var = (bx30) obj;
        return jl40.l(this.a, bx30Var.a) && jl40.l(this.b, bx30Var.b) && jl40.l(this.c, bx30Var.c) && jl40.l(this.d, bx30Var.d);
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
        return g8e.r(b64.v("VehicleParams(type=", this.a, ", startingStopId=", this.b, ", destinationStopId="), this.c, ", lineId=", this.d, Extension.C_BRAKE);
    }
}
