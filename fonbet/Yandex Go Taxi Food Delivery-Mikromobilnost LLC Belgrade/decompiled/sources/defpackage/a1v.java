package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class a1v extends c1v {
    public final m1a0 a;
    public final lv90 b;

    public a1v(m1a0 m1a0Var, lv90 lv90Var) {
        this.a = m1a0Var;
        this.b = lv90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1v)) {
            return false;
        }
        a1v a1vVar = (a1v) obj;
        return jl40.l(this.a, a1vVar.a) && jl40.l(this.b, a1vVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TaxiPaymentInfo(paymentInfo=" + this.a + ", paymentDto=" + this.b + Extension.C_BRAKE;
    }
}
