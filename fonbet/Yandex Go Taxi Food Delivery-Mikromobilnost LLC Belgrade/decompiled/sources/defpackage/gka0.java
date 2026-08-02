package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gka0 {
    public final rr51 a;
    public final rr51 b;

    public gka0(rr51 rr51Var, rr51 rr51Var2) {
        this.a = rr51Var;
        this.b = rr51Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gka0)) {
            return false;
        }
        gka0 gka0Var = (gka0) obj;
        return jl40.l(this.a, gka0Var.a) && jl40.l(this.b, gka0Var.b);
    }

    public final int hashCode() {
        rr51 rr51Var = this.a;
        int hashCode = (rr51Var == null ? 0 : rr51Var.hashCode()) * 31;
        rr51 rr51Var2 = this.b;
        return hashCode + (rr51Var2 != null ? rr51Var2.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentStatusYbDivData(pending=" + this.a + ", timeout=" + this.b + Extension.C_BRAKE;
    }
}
