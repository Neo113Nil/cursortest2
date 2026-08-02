package defpackage;

import defpackage.khp;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class mhp {
    public final ffp a;
    public final khp.a b;

    public mhp(ffp ffpVar, khp.a aVar) {
        this.a = ffpVar;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhp)) {
            return false;
        }
        mhp mhpVar = (mhp) obj;
        return this.a.equals(mhpVar.a) && jl40.l(this.b, mhpVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        khp.a aVar = this.b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "FavoriteRidesAndAddressesResult(addresses=" + this.a + ", rides=" + this.b + Extension.C_BRAKE;
    }
}
