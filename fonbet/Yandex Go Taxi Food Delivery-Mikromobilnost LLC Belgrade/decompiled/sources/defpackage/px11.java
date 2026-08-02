package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class px11 {
    public final Text.Constant a;
    public final rbv b;
    public final ColorModel c;
    public final ColorModel d;
    public final String e;

    public px11(Text.Constant constant, rbv rbvVar, ColorModel colorModel, ColorModel colorModel2, String str) {
        this.a = constant;
        this.b = rbvVar;
        this.c = colorModel;
        this.d = colorModel2;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px11)) {
            return false;
        }
        px11 px11Var = (px11) obj;
        return this.a.equals(px11Var.a) && jl40.l(this.b, px11Var.b) && this.c.equals(px11Var.c) && this.d.equals(px11Var.d) && jl40.l(this.e, px11Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        rbv rbvVar = this.b;
        int d = vfc.d(this.d, vfc.d(this.c, (hashCode + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31, 31), 31);
        String str = this.e;
        return d + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(description=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        smw0.z(sb, this.c, ", descriptionTextColor=", this.d, ", action=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
