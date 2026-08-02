package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class c9m0 {
    public final Text.Constant a;
    public final Text.Constant b;
    public final ColorModel c;
    public final ColorModel d;
    public final ColorModel e;

    public c9m0(Text.Constant constant, Text.Constant constant2, ColorModel colorModel, ColorModel colorModel2, ColorModel colorModel3) {
        this.a = constant;
        this.b = constant2;
        this.c = colorModel;
        this.d = colorModel2;
        this.e = colorModel3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9m0)) {
            return false;
        }
        c9m0 c9m0Var = (c9m0) obj;
        return this.a.equals(c9m0Var.a) && this.b.equals(c9m0Var.b) && jl40.l(this.c, c9m0Var.c) && jl40.l(this.d, c9m0Var.d) && jl40.l(this.e, c9m0Var.e);
    }

    public final int hashCode() {
        int d = xvz.d(this.b, this.a.hashCode() * 31, 31);
        ColorModel colorModel = this.c;
        int hashCode = (d + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
        ColorModel colorModel2 = this.d;
        int hashCode2 = (hashCode + (colorModel2 == null ? 0 : colorModel2.hashCode())) * 31;
        ColorModel colorModel3 = this.e;
        return hashCode2 + (colorModel3 != null ? colorModel3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u = ly3.u("MonthDetails(text=", this.a, ", label=", this.b, ", textColor=");
        smw0.z(u, this.c, ", amountColor=", this.d, ", backgroundColor=");
        return n.o(u, this.e, Extension.C_BRAKE);
    }
}
