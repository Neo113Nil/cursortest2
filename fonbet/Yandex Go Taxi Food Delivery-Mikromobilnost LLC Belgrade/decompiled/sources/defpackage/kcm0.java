package defpackage;

import com.ybsdk.core.utils.ColorModel;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class kcm0 implements lcm0 {
    public final jcm0 a;
    public final List b;
    public final ColorModel c;

    public kcm0(jcm0 jcm0Var, List list, ColorModel colorModel) {
        this.a = jcm0Var;
        this.b = list;
        this.c = colorModel;
    }

    public final jcm0 a() {
        return this.a;
    }

    public final List b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcm0)) {
            return false;
        }
        kcm0 kcm0Var = (kcm0) obj;
        return this.a.equals(kcm0Var.a) && jl40.l(this.b, kcm0Var.b) && this.c.equals(kcm0Var.c);
    }

    @Override // defpackage.lcm0
    public final ColorModel getBackgroundColor() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Promo(header=");
        sb.append(this.a);
        sb.append(", items=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        return n.o(sb, this.c, Extension.C_BRAKE);
    }
}
