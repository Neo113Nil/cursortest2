package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.c;

/* loaded from: classes14.dex */
public final class pmk0 {
    public final c a;
    public final pav b;
    public final k7x0 c;
    public final qmp d;

    public pmk0(c cVar, pav pavVar, k7x0 k7x0Var, qmp qmpVar) {
        this.a = cVar;
        this.b = pavVar;
        this.c = k7x0Var;
        this.d = qmpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pmk0)) {
            return false;
        }
        pmk0 pmk0Var = (pmk0) obj;
        return jl40.l(this.a, pmk0Var.a) && jl40.l(this.b, pmk0Var.b) && jl40.l(this.c, pmk0Var.c) && jl40.l(this.d, pmk0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Dependencies(getImageHelper=" + this.a + ", imageLoader=" + this.b + ", tagUrlFormatter=" + this.c + ", featureToggleDelegate=" + this.d + Extension.C_BRAKE;
    }
}
