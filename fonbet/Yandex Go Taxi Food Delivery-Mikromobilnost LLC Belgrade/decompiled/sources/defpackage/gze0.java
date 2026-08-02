package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class gze0 {
    public final String a;
    public final List b;
    public final q47 c;
    public final fze0 d;

    public gze0(String str, List list, q47 q47Var, fze0 fze0Var) {
        this.a = str;
        this.b = list;
        this.c = q47Var;
        this.d = fze0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gze0)) {
            return false;
        }
        gze0 gze0Var = (gze0) obj;
        return jl40.l(this.a, gze0Var.a) && jl40.l(this.b, gze0Var.b) && jl40.l(this.c, gze0Var.c) && this.d.equals(gze0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int c = unr0.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        q47 q47Var = this.c;
        return this.d.hashCode() + ((c + (q47Var != null ? q47Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder r = xvz.r("PriceComplainUiState(title=", this.a, ", feedbackOptions=", this.b, ", actionButtons=");
        r.append(this.c);
        r.append(", commentItemUiState=");
        r.append(this.d);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
