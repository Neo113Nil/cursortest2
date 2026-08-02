package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class lpt0 {
    public final String a;
    public final String b;
    public final boolean c;

    public lpt0(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpt0)) {
            return false;
        }
        lpt0 lpt0Var = (lpt0) obj;
        return jl40.l(this.a, lpt0Var.a) && jl40.l(this.b, lpt0Var.b) && this.c == lpt0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(b64.v("SpeedGroupUiState(speed=", this.a, ", speedLimit=", this.b, ", speedLimitExceeded="), this.c, Extension.C_BRAKE);
    }
}
