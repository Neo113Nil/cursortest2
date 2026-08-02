package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class adb0 implements cdb0 {
    public final ColorModel a;
    public final rbv b;
    public final Text c;
    public final ColorModel d;

    public adb0(ColorModel colorModel, rbv rbvVar, Text text, ColorModel colorModel2) {
        this.a = colorModel;
        this.b = rbvVar;
        this.c = text;
        this.d = colorModel2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adb0)) {
            return false;
        }
        adb0 adb0Var = (adb0) obj;
        return jl40.l(this.a, adb0Var.a) && jl40.l(this.b, adb0Var.b) && this.c.equals(adb0Var.c) && jl40.l(this.d, adb0Var.d);
    }

    public final int hashCode() {
        ColorModel colorModel = this.a;
        int hashCode = (colorModel == null ? 0 : colorModel.hashCode()) * 31;
        rbv rbvVar = this.b;
        int c = n.c(this.c, (hashCode + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31, 31);
        ColorModel colorModel2 = this.d;
        return c + (colorModel2 != null ? colorModel2.hashCode() : 0);
    }

    public final String toString() {
        return "Amount(textColor=" + this.a + ", icon=" + this.b + ", amountWithCurrency=" + this.c + ", spoilerColor=" + this.d + Extension.C_BRAKE;
    }
}
