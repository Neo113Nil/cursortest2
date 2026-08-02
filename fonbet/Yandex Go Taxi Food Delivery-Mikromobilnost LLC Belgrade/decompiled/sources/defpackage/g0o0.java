package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.scooters.presentation.detailed_order.d;

/* loaded from: classes6.dex */
public final class g0o0 {
    public final tpr a;

    public g0o0(d dVar) {
        this.a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0o0) && jl40.l(this.a, ((g0o0) obj).a);
    }

    public final int hashCode() {
        tpr tprVar = this.a;
        if (tprVar == null) {
            return 0;
        }
        return tprVar.hashCode();
    }

    public final String toString() {
        return "ScootersMtRouteOverlayPayload(selectedSessionIdFlow=" + this.a + Extension.C_BRAKE;
    }

    public g0o0() {
        this(null);
    }
}
