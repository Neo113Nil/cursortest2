package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ith extends lth {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public ith(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ith)) {
            return false;
        }
        ith ithVar = (ith) obj;
        return jl40.l(this.a, ithVar.a) && jl40.l(this.b, ithVar.b) && jl40.l(this.c, ithVar.c) && jl40.l(this.d, ithVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("RoverActionRequested(type=", this.a, ", deliveryId=", this.b, ", requestId="), this.c, ", action=", this.d, Extension.C_BRAKE);
    }
}
