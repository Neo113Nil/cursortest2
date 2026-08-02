package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class egs0 {
    public final double a;
    public final boolean b;
    public final boolean c;

    public egs0(double d, boolean z, boolean z2) {
        this.a = d;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egs0)) {
            return false;
        }
        egs0 egs0Var = (egs0) obj;
        return Double.compare(this.a, egs0Var.a) == 0 && this.b == egs0Var.b && this.c == egs0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(Double.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimulationSettingsUiState(speedKph=");
        sb.append(this.a);
        sb.append(", isSimulationEnabled=");
        sb.append(this.b);
        return xra1.a(sb, ", isSimulationActive=", this.c, Extension.C_BRAKE);
    }
}
