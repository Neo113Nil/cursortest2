package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class lw3 {
    public final ColorModel a;
    public final ColorModel b;
    public final ColorModel c;
    public final rbv d;
    public final ColorModel e;
    public final ColorModel f;

    public lw3(ColorModel colorModel, ColorModel colorModel2, ColorModel colorModel3, rbv rbvVar, ColorModel colorModel4, ColorModel colorModel5) {
        this.a = colorModel;
        this.b = colorModel2;
        this.c = colorModel3;
        this.d = rbvVar;
        this.e = colorModel4;
        this.f = colorModel5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lw3)) {
            return false;
        }
        lw3 lw3Var = (lw3) obj;
        return jl40.l(this.a, lw3Var.a) && jl40.l(this.b, lw3Var.b) && jl40.l(this.c, lw3Var.c) && jl40.l(this.d, lw3Var.d) && jl40.l(this.e, lw3Var.e) && jl40.l(this.f, lw3Var.f);
    }

    public final int hashCode() {
        ColorModel colorModel = this.a;
        int hashCode = (colorModel == null ? 0 : colorModel.hashCode()) * 31;
        ColorModel colorModel2 = this.b;
        int hashCode2 = (hashCode + (colorModel2 == null ? 0 : colorModel2.hashCode())) * 31;
        ColorModel colorModel3 = this.c;
        int hashCode3 = (hashCode2 + (colorModel3 == null ? 0 : colorModel3.hashCode())) * 31;
        rbv rbvVar = this.d;
        int hashCode4 = (hashCode3 + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31;
        ColorModel colorModel4 = this.e;
        int hashCode5 = (hashCode4 + (colorModel4 == null ? 0 : colorModel4.hashCode())) * 31;
        ColorModel colorModel5 = this.f;
        return hashCode5 + (colorModel5 != null ? colorModel5.hashCode() : 0);
    }

    public final String toString() {
        return "Style(titleColor=" + this.a + ", descriptionColor=" + this.b + ", background=" + this.c + ", image=" + this.d + ", buttonBackground=" + this.e + ", buttonTextColor=" + this.f + Extension.C_BRAKE;
    }
}
