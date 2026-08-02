package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class a210 {
    public final String a;
    public final d210 b;

    public a210(String str, d210 d210Var) {
        this.a = str;
        this.b = d210Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a210)) {
            return false;
        }
        a210 a210Var = (a210) obj;
        return jl40.l(this.a, a210Var.a) && jl40.l(this.b, a210Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        d210 d210Var = this.b;
        return hashCode + (d210Var != null ? d210Var.hashCode() : 0);
    }

    public final String toString() {
        return "BleSection(title=" + this.a + ", bleScanSettings=" + this.b + Extension.C_BRAKE;
    }
}
