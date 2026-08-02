package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class nbu0 {
    public final List a;
    public final List b;
    public final List c;
    public final q47 d;

    public nbu0(List list, List list2, List list3, q47 q47Var) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = q47Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbu0)) {
            return false;
        }
        nbu0 nbu0Var = (nbu0) obj;
        return jl40.l(this.a, nbu0Var.a) && jl40.l(this.b, nbu0Var.b) && this.c.equals(nbu0Var.c) && jl40.l(this.d, nbu0Var.d);
    }

    public final int hashCode() {
        int c = unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        q47 q47Var = this.d;
        return c + (q47Var == null ? 0 : q47Var.hashCode());
    }

    public final String toString() {
        StringBuilder v = qv10.v("StepsInstructionsState(title=", this.a, ", steps=", this.b, ", contentButtons=");
        v.append(this.c);
        v.append(", stickyButtonsState=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
