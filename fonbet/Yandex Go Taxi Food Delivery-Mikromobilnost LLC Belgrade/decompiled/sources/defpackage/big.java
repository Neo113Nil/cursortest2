package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class big implements cig {
    public final ColorModel a;
    public final Text.Constant b;
    public final ColorModel c;
    public final Text.Constant d;
    public final ColorModel e;
    public final rbv f;
    public final rbv g;
    public final String h;

    public big(ColorModel colorModel, Text.Constant constant, ColorModel colorModel2, Text.Constant constant2, ColorModel colorModel3, rbv rbvVar, rbv rbvVar2, String str) {
        this.a = colorModel;
        this.b = constant;
        this.c = colorModel2;
        this.d = constant2;
        this.e = colorModel3;
        this.f = rbvVar;
        this.g = rbvVar2;
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof big)) {
            return false;
        }
        big bigVar = (big) obj;
        return this.a.equals(bigVar.a) && this.b.equals(bigVar.b) && jl40.l(this.c, bigVar.c) && this.d.equals(bigVar.d) && jl40.l(this.e, bigVar.e) && jl40.l(this.f, bigVar.f) && jl40.l(this.g, bigVar.g) && jl40.l(this.h, bigVar.h);
    }

    public final int hashCode() {
        int d = vfc.d(this.e, xvz.d(this.d, vfc.d(this.c, xvz.d(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
        rbv rbvVar = this.f;
        int hashCode = (d + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31;
        rbv rbvVar2 = this.g;
        int hashCode2 = (hashCode + (rbvVar2 == null ? 0 : rbvVar2.hashCode())) * 31;
        String str = this.h;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "View(backgroundColor=" + this.a + ", amount=" + this.b + ", amountColor=" + this.c + ", description=" + this.d + ", descriptionColor=" + this.e + ", actionImage=" + this.f + ", image=" + this.g + ", action=" + this.h + Extension.C_BRAKE;
    }
}
