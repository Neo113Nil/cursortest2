package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class egk0 {
    public final String a;
    public final ibk0 b;

    public egk0(String str, ibk0 ibk0Var) {
        this.a = str;
        this.b = ibk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egk0)) {
            return false;
        }
        egk0 egk0Var = (egk0) obj;
        return this.a.equals(egk0Var.a) && jl40.l(this.b, egk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RideCardDriverA11yFieldUiState(driverDescription=" + this.a + ", driverClickAction=" + this.b + Extension.C_BRAKE;
    }
}
