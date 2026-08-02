package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class php implements rhp {
    public final String a;
    public final xss0 b;

    public php(String str, xss0 xss0Var) {
        this.a = str;
        this.b = xss0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof php)) {
            return false;
        }
        php phpVar = (php) obj;
        return jl40.l(this.a, phpVar.a) && this.b.equals(phpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SavedRide(rideId=" + this.a + ", slot=" + this.b + Extension.C_BRAKE;
    }
}
