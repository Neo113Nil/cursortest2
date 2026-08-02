package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class coe0 {
    public final zzs a;
    public final String b;

    public coe0(zzs zzsVar, String str) {
        this.a = zzsVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof coe0)) {
            return false;
        }
        coe0 coe0Var = (coe0) obj;
        return this.a.equals(coe0Var.a) && jl40.l(this.b, coe0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DestinationInfo(position=" + this.a + ", log=" + this.b + Extension.C_BRAKE;
    }
}
