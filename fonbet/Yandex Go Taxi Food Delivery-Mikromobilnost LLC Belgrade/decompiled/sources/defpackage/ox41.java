package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ox41 {
    public final ix41 a;
    public final hx41 b;

    public ox41(ix41 ix41Var, hx41 hx41Var) {
        this.a = ix41Var;
        this.b = hx41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox41)) {
            return false;
        }
        ox41 ox41Var = (ox41) obj;
        return jl40.l(this.a, ox41Var.a) && this.b.equals(ox41Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Payload(wheelDatePickerData=" + this.a + ", analyticModel=" + this.b + Extension.C_BRAKE;
    }
}
