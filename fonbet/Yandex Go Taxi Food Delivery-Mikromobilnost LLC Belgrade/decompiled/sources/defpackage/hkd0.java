package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class hkd0 {
    public final zzs a;
    public final String b;

    public hkd0(zzs zzsVar, String str) {
        this.a = zzsVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hkd0)) {
            return false;
        }
        hkd0 hkd0Var = (hkd0) obj;
        return jl40.l(this.a, hkd0Var.a) && jl40.l(this.b, hkd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Address(geoPoint=" + this.a + ", zoneName=" + this.b + Extension.C_BRAKE;
    }
}
