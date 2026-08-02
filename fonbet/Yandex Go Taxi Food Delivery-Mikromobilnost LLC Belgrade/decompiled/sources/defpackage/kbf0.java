package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class kbf0 {
    public final float a;
    public final float b;
    public final lbf0 c;
    public final ArrayList d;
    public final Long e;
    public final jbf0 f;

    public kbf0(float f, float f2, lbf0 lbf0Var, ArrayList arrayList, Long l, jbf0 jbf0Var) {
        this.a = f;
        this.b = f2;
        this.c = lbf0Var;
        this.d = arrayList;
        this.e = l;
        this.f = jbf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbf0)) {
            return false;
        }
        kbf0 kbf0Var = (kbf0) obj;
        return Float.compare(this.a, kbf0Var.a) == 0 && Float.compare(this.b, kbf0Var.b) == 0 && jl40.l(this.c, kbf0Var.c) && this.d.equals(kbf0Var.d) && jl40.l(this.e, kbf0Var.e) && this.f.equals(kbf0Var.f);
    }

    public final int hashCode() {
        int b = ly3.b((this.c.hashCode() + g8e.c(this.b, Float.hashCode(this.a) * 31, 31)) * 31, 31, this.d);
        Long l = this.e;
        return this.f.hashCode() + ((b + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder k = oo31.k("Gradient(blurRadius=", this.a, ", translationYFraction=", this.b, ", mainGradient=");
        k.append(this.c);
        k.append(", overlayGradients=");
        k.append(this.d);
        k.append(", animationDurationMs=");
        k.append(this.e);
        k.append(", fallbackGradientImage=");
        k.append(this.f);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
