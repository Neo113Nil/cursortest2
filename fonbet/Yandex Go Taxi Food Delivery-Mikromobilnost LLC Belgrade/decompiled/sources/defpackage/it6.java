package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class it6 {
    public final Text a;
    public final ColorModel b;
    public final Text c;
    public final ColorModel d;
    public final rbv e;

    public it6(Text.Constant constant, ColorModel colorModel, Text.Constant constant2, ColorModel colorModel2, rbv rbvVar) {
        this.a = constant;
        this.b = colorModel;
        this.c = constant2;
        this.d = colorModel2;
        this.e = rbvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it6)) {
            return false;
        }
        it6 it6Var = (it6) obj;
        return jl40.l(this.a, it6Var.a) && jl40.l(this.b, it6Var.b) && jl40.l(this.c, it6Var.c) && jl40.l(this.d, it6Var.d) && this.e.equals(it6Var.e);
    }

    public final int hashCode() {
        Text text = this.a;
        int hashCode = (text == null ? 0 : text.hashCode()) * 31;
        ColorModel colorModel = this.b;
        int hashCode2 = (hashCode + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
        Text text2 = this.c;
        int hashCode3 = (hashCode2 + (text2 == null ? 0 : text2.hashCode())) * 31;
        ColorModel colorModel2 = this.d;
        return this.e.hashCode() + ((hashCode3 + (colorModel2 != null ? colorModel2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "BulletEntity(title=" + this.a + ", titleColor=" + this.b + ", subtitle=" + this.c + ", subtitleColor=" + this.d + ", image=" + this.e + Extension.C_BRAKE;
    }
}
