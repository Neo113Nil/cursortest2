package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class hm90 {
    public final rr51 a;
    public final boolean b;

    public hm90(rr51 rr51Var, boolean z) {
        this.a = rr51Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm90)) {
            return false;
        }
        hm90 hm90Var = (hm90) obj;
        return jl40.l(this.a, hm90Var.a) && this.b == hm90Var.b;
    }

    public final int hashCode() {
        rr51 rr51Var = this.a;
        return Boolean.hashCode(this.b) + ((rr51Var == null ? 0 : rr51Var.hashCode()) * 31);
    }

    public final String toString() {
        return "PassesWidgetEntity(widget=" + this.a + ", isAgreementAccepted=" + this.b + Extension.C_BRAKE;
    }
}
