package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class fj90 {
    public final List a;
    public final String b;
    public final String c;

    public fj90(List list, String str, String str2) {
        this.a = list;
        this.b = str;
        this.c = str2;
    }

    public static fj90 a(fj90 fj90Var, List list, String str, int i) {
        if ((i & 1) != 0) {
            list = fj90Var.a;
        }
        String str2 = fj90Var.b;
        if ((i & 4) != 0) {
            str = fj90Var.c;
        }
        fj90Var.getClass();
        return new fj90(list, str2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj90)) {
            return false;
        }
        fj90 fj90Var = (fj90) obj;
        return this.a.equals(fj90Var.a) && jl40.l(this.b, fj90Var.b) && this.c.equals(fj90Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return oyr.t(xvz.s("PartnersSuccessState(partners=", this.a, ", transferId=", this.b, ", filterText="), this.c, Extension.C_BRAKE);
    }
}
