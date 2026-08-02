package defpackage;

import com.yandex.mapkit.geometry.PolylinePosition;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class e6c {
    public final PolylinePosition a;
    public final double b;
    public final double c;

    public e6c(PolylinePosition polylinePosition, double d, double d2) {
        this.a = polylinePosition;
        this.b = d;
        this.c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6c)) {
            return false;
        }
        e6c e6cVar = (e6c) obj;
        return jl40.l(this.a, e6cVar.a) && Double.compare(this.b, e6cVar.b) == 0 && Double.compare(this.c, e6cVar.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + unr0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "BestCandidate(polylinePosition=" + this.a + ", minSquaredDistance=" + this.b + ", indexDifferenceToReference=" + this.c + Extension.C_BRAKE;
    }
}
