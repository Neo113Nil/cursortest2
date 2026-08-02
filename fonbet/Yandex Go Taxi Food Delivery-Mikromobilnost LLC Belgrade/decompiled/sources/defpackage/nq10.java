package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class nq10 {
    public final List a;
    public final rp10 b;
    public final Throwable c;
    public final pp10 d;

    public nq10(List list, rp10 rp10Var, Throwable th, pp10 pp10Var) {
        this.a = list;
        this.b = rp10Var;
        this.c = th;
        this.d = pp10Var;
    }

    public static nq10 a(nq10 nq10Var, rp10 rp10Var, Throwable th, pp10 pp10Var, int i) {
        List list = nq10Var.a;
        if ((i & 2) != 0) {
            rp10Var = nq10Var.b;
        }
        if ((i & 4) != 0) {
            th = nq10Var.c;
        }
        if ((i & 8) != 0) {
            pp10Var = nq10Var.d;
        }
        nq10Var.getClass();
        return new nq10(list, rp10Var, th, pp10Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq10)) {
            return false;
        }
        nq10 nq10Var = (nq10) obj;
        return this.a.equals(nq10Var.a) && jl40.l(this.b, nq10Var.b) && jl40.l(this.c, nq10Var.c) && jl40.l(this.d, nq10Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        rp10 rp10Var = this.b;
        int hashCode2 = (hashCode + (rp10Var == null ? 0 : rp10Var.hashCode())) * 31;
        Throwable th = this.c;
        return this.d.hashCode() + ((hashCode2 + (th != null ? th.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "MerchantOffersState(bottomBarItems=" + this.a + ", screenState=" + this.b + ", screenError=" + this.c + ", pagingState=" + this.d + Extension.C_BRAKE;
    }
}
