package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.locationsdk.locationprovider.android.AndroidLocationProviderType;
import ru.yandex.taxi.locationsdk.locationprovider.android.impl.LocationManagerAdapter$Request$Quality;

/* loaded from: classes9.dex */
public final class p9z {
    public final AndroidLocationProviderType a;
    public final e3n b;
    public final e3n c;
    public final double d;
    public final LocationManagerAdapter$Request$Quality e;

    public p9z(AndroidLocationProviderType androidLocationProviderType, e3n e3nVar, e3n e3nVar2, double d, LocationManagerAdapter$Request$Quality locationManagerAdapter$Request$Quality) {
        this.a = androidLocationProviderType;
        this.b = e3nVar;
        this.c = e3nVar2;
        this.d = d;
        this.e = locationManagerAdapter$Request$Quality;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p9z) {
            p9z p9zVar = (p9z) obj;
            if (this.a == p9zVar.a && jl40.l(this.b, p9zVar.b) && jl40.l(this.c, p9zVar.c) && Double.compare(this.d, p9zVar.d) == 0 && this.e == p9zVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        e3n e3nVar = this.b;
        int hashCode2 = (hashCode + (e3nVar == null ? 0 : Long.hashCode(e3nVar.a))) * 31;
        e3n e3nVar2 = this.c;
        return this.e.hashCode() + unr0.a((hashCode2 + (e3nVar2 != null ? Long.hashCode(e3nVar2.a) : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        return "Request(providerType=" + this.a + ", interval=" + this.b + ", minInterval=" + this.c + ", minDistance=" + u1k.a(this.d) + ", quality=" + this.e + Extension.C_BRAKE;
    }
}
