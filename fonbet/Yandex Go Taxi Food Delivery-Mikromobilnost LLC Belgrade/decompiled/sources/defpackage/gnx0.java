package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class gnx0 {
    public final fnx0 a;
    public final boolean b;

    public gnx0(fnx0 fnx0Var, boolean z) {
        this.a = fnx0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gnx0)) {
            return false;
        }
        gnx0 gnx0Var = (gnx0) obj;
        return this.a.equals(gnx0Var.a) && this.b == gnx0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TariffSelectionChange(selection=" + this.a + ", forceNewVertical=" + this.b + Extension.C_BRAKE;
    }
}
