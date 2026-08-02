package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class dig {
    public final Text.Constant a;
    public final ColorModel b;
    public final rbv c;
    public final y5i0 d;

    public dig(Text.Constant constant, ColorModel colorModel, rbv rbvVar, y5i0 y5i0Var) {
        this.a = constant;
        this.b = colorModel;
        this.c = rbvVar;
        this.d = y5i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dig)) {
            return false;
        }
        dig digVar = (dig) obj;
        return this.a.equals(digVar.a) && this.b.equals(digVar.b) && jl40.l(this.c, digVar.c) && jl40.l(this.d, digVar.d);
    }

    public final int hashCode() {
        int d = vfc.d(this.b, this.a.hashCode() * 31, 31);
        rbv rbvVar = this.c;
        int hashCode = (d + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31;
        y5i0 y5i0Var = this.d;
        return hashCode + (y5i0Var != null ? y5i0Var.hashCode() : 0);
    }

    public final String toString() {
        return "BalanceState(text=" + this.a + ", color=" + this.b + ", icon=" + this.c + ", radialGradient=" + this.d + Extension.C_BRAKE;
    }
}
