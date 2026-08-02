package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class arb0 {
    public final e0l0 a;
    public final boolean b;

    public arb0(e0l0 e0l0Var, boolean z) {
        this.a = e0l0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arb0)) {
            return false;
        }
        arb0 arb0Var = (arb0) obj;
        return this.a.equals(arb0Var.a) && this.b == arb0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "PickupPointsRouteModel(route=" + this.a + ", isCleared=" + this.b + Extension.C_BRAKE;
    }
}
