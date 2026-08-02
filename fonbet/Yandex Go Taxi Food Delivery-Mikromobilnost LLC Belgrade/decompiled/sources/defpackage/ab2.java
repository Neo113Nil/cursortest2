package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.locationsdk.locationprovider.android.AndroidMobileServicesClientAdapter$Request$Priority;

/* loaded from: classes5.dex */
public final class ab2 {
    public final long a;
    public final e3n b;
    public final double c;
    public final AndroidMobileServicesClientAdapter$Request$Priority d;

    public ab2(long j, e3n e3nVar, double d, AndroidMobileServicesClientAdapter$Request$Priority androidMobileServicesClientAdapter$Request$Priority) {
        this.a = j;
        this.b = e3nVar;
        this.c = d;
        this.d = androidMobileServicesClientAdapter$Request$Priority;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ab2) {
            ab2 ab2Var = (ab2) obj;
            if (e3n.d(this.a, ab2Var.a) && jl40.l(this.b, ab2Var.b) && Double.compare(this.c, ab2Var.c) == 0 && this.d == ab2Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        o430 o430Var = e3n.b;
        int hashCode = Long.hashCode(this.a) * 31;
        e3n e3nVar = this.b;
        return this.d.hashCode() + unr0.a((hashCode + (e3nVar == null ? 0 : Long.hashCode(e3nVar.a))) * 31, 31, this.c);
    }

    public final String toString() {
        return "Request(interval=" + e3n.p(this.a) + ", minInterval=" + this.b + ", minDistance=" + u1k.a(this.c) + ", priority=" + this.d + Extension.C_BRAKE;
    }
}
