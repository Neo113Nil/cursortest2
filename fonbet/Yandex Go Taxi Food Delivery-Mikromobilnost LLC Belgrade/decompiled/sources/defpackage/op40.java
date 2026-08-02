package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class op40 {
    public final boolean a;
    public final String b;
    public final String c;

    public op40(boolean z, String str, String str2) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof op40)) {
            return false;
        }
        op40 op40Var = (op40) obj;
        return this.a == op40Var.a && jl40.l(this.b, op40Var.b) && this.c.equals(op40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(ly3.v("MulticlassOverrideSummaryButton(needExpandDetails=", ", text=", this.b, ", verticalId=", this.a), this.c, Extension.C_BRAKE);
    }
}
