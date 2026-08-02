package defpackage;

import com.yandex.go.taxi.order.experiments.OnlyV2RideCardExperiment;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class hck0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final OnlyV2RideCardExperiment d;

    public hck0(boolean z, boolean z2, boolean z3, OnlyV2RideCardExperiment onlyV2RideCardExperiment) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = onlyV2RideCardExperiment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hck0)) {
            return false;
        }
        hck0 hck0Var = (hck0) obj;
        return this.a == hck0Var.a && this.b == hck0Var.b && this.c == hck0Var.c && jl40.l(this.d, hck0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder u = qv10.u("ConfigurationsState(isTouchExplorationEnabled=", ", isDefaultsExperimentEnabled=", ", isA11yExperimentEnabled=", this.a, this.b);
        u.append(this.c);
        u.append(", onlyV2RideCardExperiment=");
        u.append(this.d);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
