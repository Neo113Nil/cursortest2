package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.savings.internal.entities.CellType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class jdm0 extends gc5 {
    public final rbv c;
    public final Text.Constant d;
    public final Text e;
    public final Text.Constant f;
    public final String g;
    public final CellType h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdm0(rbv rbvVar, Text.Constant constant, Text text, Text.Constant constant2, String str) {
        super("", "");
        CellType cellType = CellType.SUGGEST_TO_CREATE;
        this.c = rbvVar;
        this.d = constant;
        this.e = text;
        this.f = constant2;
        this.g = str;
        this.h = cellType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdm0)) {
            return false;
        }
        jdm0 jdm0Var = (jdm0) obj;
        return jl40.l(this.c, jdm0Var.c) && jl40.l(this.d, jdm0Var.d) && jl40.l(this.e, jdm0Var.e) && jl40.l(this.f, jdm0Var.f) && jl40.l(this.g, jdm0Var.g) && this.h == jdm0Var.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + unr0.b(xvz.d(this.f, n.c(this.e, xvz.d(this.d, this.c.hashCode() * 31, 31), 31), 31), 31, this.g);
    }

    public final String toString() {
        return "SavingsNoAccountEntity(image=" + this.c + ", title=" + this.d + ", subtitle=" + this.e + ", buttonTitle=" + this.f + ", action=" + jr.a(this.g) + ", cellType=" + this.h + Extension.C_BRAKE;
    }
}
