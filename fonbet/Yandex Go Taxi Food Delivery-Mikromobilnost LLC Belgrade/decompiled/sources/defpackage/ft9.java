package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ft9 implements it9 {
    public final CharSequence a;
    public final List b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public ft9(CharSequence charSequence, List list, boolean z, boolean z2, boolean z3) {
        this.a = charSequence;
        this.b = list;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ft9)) {
            return false;
        }
        ft9 ft9Var = (ft9) obj;
        return jl40.l(this.a, ft9Var.a) && jl40.l(this.b, ft9Var.b) && this.c == ft9Var.c && this.d == ft9Var.d && this.e == ft9Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + unr0.e(unr0.e(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(header=");
        sb.append((Object) this.a);
        sb.append(", stations=");
        sb.append(this.b);
        sb.append(", hasMore=");
        nnm.v(", showLoadingError=", ", isLoadingMore=", sb, this.c, this.d);
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
