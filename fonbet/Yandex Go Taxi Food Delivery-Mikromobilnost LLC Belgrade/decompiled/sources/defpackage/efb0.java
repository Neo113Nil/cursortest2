package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class efb0 {
    public final String a;
    public final int b;

    public efb0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efb0)) {
            return false;
        }
        efb0 efb0Var = (efb0) obj;
        return jl40.l(this.a, efb0Var.a) && this.b == efb0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return qv10.i(this.b, "PhoneInputValue(text=", this.a, ", selection=", Extension.C_BRAKE);
    }
}
