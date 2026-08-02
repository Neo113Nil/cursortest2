package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class igl0 implements e040 {
    public final ArrayList a;
    public final CharSequence b;
    public final uu30 c;
    public final cx30 d;

    public igl0(ArrayList arrayList, CharSequence charSequence, uu30 uu30Var, cx30 cx30Var) {
        this.a = arrayList;
        this.b = charSequence;
        this.c = uu30Var;
        this.d = cx30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igl0)) {
            return false;
        }
        igl0 igl0Var = (igl0) obj;
        return this.a.equals(igl0Var.a) && jl40.l(this.b, igl0Var.b) && jl40.l(this.c, igl0Var.c) && this.d.equals(igl0Var.d);
    }

    public final int hashCode() {
        int b = smw0.b(this.a.hashCode() * 31, 31, this.b);
        uu30 uu30Var = this.c;
        return this.d.a.hashCode() + ((b + (uu30Var == null ? 0 : uu30Var.hashCode())) * 31);
    }

    public final String toString() {
        return "Routes(routes=" + this.a + ", walkingInfo=" + ((Object) this.b) + ", addresses=" + this.c + ", routesCommunicationsParams=" + this.d + Extension.C_BRAKE;
    }
}
