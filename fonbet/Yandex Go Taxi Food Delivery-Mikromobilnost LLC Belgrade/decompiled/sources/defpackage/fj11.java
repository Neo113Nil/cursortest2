package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class fj11 {
    public final ej11 a;
    public final ArrayList b;
    public final cj11 c;

    public fj11(ej11 ej11Var, ArrayList arrayList, cj11 cj11Var) {
        this.a = ej11Var;
        this.b = arrayList;
        this.c = cj11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj11)) {
            return false;
        }
        fj11 fj11Var = (fj11) obj;
        return jl40.l(this.a, fj11Var.a) && this.b.equals(fj11Var.b) && jl40.l(this.c, fj11Var.c);
    }

    public final int hashCode() {
        int b = ly3.b(this.a.hashCode() * 31, 31, this.b);
        cj11 cj11Var = this.c;
        return b + (cj11Var == null ? 0 : cj11Var.hashCode());
    }

    public final String toString() {
        return "TsarButtonGradientParameters(gradientOffsetPosition=" + this.a + ", components=" + this.b + ", animationSettings=" + this.c + Extension.C_BRAKE;
    }
}
