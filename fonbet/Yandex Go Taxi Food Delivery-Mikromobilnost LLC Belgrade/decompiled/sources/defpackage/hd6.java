package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class hd6 {
    public final List a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public hd6(String str, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = list;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd6)) {
            return false;
        }
        hd6 hd6Var = (hd6) obj;
        return jl40.l(this.a, hd6Var.a) && jl40.l(this.b, hd6Var.b) && this.c == hd6Var.c && this.d == hd6Var.d && this.e == hd6Var.e && this.f == hd6Var.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.f) + unr0.e(unr0.e(unr0.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder s = xvz.s("BottomModalUiState(content=", this.a, ", buttonText=", this.b, ", withBackButton=");
        nnm.v(", withCloseButton=", ", dismissible=", s, this.c, this.d);
        return smw0.k(", swipable=", Extension.C_BRAKE, s, this.e, this.f);
    }
}
