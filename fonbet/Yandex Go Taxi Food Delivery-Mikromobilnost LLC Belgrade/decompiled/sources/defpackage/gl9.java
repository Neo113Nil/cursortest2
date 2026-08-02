package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class gl9 {
    public final xk9 a;
    public final List b;
    public final boolean c;
    public final Integer d;
    public final fl9 e;
    public final List f;

    public gl9(xk9 xk9Var, List list, boolean z, Integer num, fl9 fl9Var, List list2) {
        this.a = xk9Var;
        this.b = list;
        this.c = z;
        this.d = num;
        this.e = fl9Var;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl9)) {
            return false;
        }
        gl9 gl9Var = (gl9) obj;
        return jl40.l(this.a, gl9Var.a) && jl40.l(this.b, gl9Var.b) && this.c == gl9Var.c && jl40.l(this.d, gl9Var.d) && jl40.l(this.e, gl9Var.e) && jl40.l(this.f, gl9Var.f);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        int hashCode = (e + (num == null ? 0 : num.hashCode())) * 31;
        fl9 fl9Var = this.e;
        int hashCode2 = (hashCode + (fl9Var == null ? 0 : fl9Var.hashCode())) * 31;
        List list = this.f;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ChargersActiveOrderUiState(header=" + this.a + ", items=" + this.b + ", hasMultiOrder=" + this.c + ", freeSecondsRemaining=" + this.d + ", tabsConfig=" + this.e + ", popups=" + this.f + Extension.C_BRAKE;
    }
}
