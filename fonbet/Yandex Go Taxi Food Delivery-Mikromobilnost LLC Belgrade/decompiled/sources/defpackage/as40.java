package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class as40 {
    public final zzs a;
    public final zzs b;

    public as40(zzs zzsVar, zzs zzsVar2) {
        this.a = zzsVar;
        this.b = zzsVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as40)) {
            return false;
        }
        as40 as40Var = (as40) obj;
        return jl40.l(this.a, as40Var.a) && jl40.l(this.b, as40Var.b);
    }

    public final int hashCode() {
        zzs zzsVar = this.a;
        int hashCode = (zzsVar == null ? 0 : zzsVar.hashCode()) * 31;
        zzs zzsVar2 = this.b;
        return hashCode + (zzsVar2 != null ? zzsVar2.hashCode() : 0);
    }

    public final String toString() {
        return "MultimodalPoints(pickupPoint=" + this.a + ", dropoffPoint=" + this.b + Extension.C_BRAKE;
    }
}
