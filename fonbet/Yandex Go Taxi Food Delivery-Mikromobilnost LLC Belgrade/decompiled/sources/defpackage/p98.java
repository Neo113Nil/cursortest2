package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class p98 {
    public final String a;
    public final String b;
    public final String c;
    public final lc8 d;
    public final wk8 e;
    public final String f;
    public final String g;
    public final ColorModel h;
    public final ColorModel i;
    public final ColorModel j;
    public final ColorModel k;
    public final ColorModel l;

    public p98(String str, String str2, String str3, lc8 lc8Var, wk8 wk8Var, String str4, String str5, ColorModel colorModel, ColorModel colorModel2, ColorModel colorModel3, ColorModel colorModel4, ColorModel colorModel5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = lc8Var;
        this.e = wk8Var;
        this.f = str4;
        this.g = str5;
        this.h = colorModel;
        this.i = colorModel2;
        this.j = colorModel3;
        this.k = colorModel4;
        this.l = colorModel5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p98)) {
            return false;
        }
        p98 p98Var = (p98) obj;
        return jl40.l(this.a, p98Var.a) && jl40.l(this.b, p98Var.b) && jl40.l(this.c, p98Var.c) && this.d.equals(p98Var.d) && this.e.equals(p98Var.e) && jl40.l(this.f, p98Var.f) && jl40.l(this.g, p98Var.g) && jl40.l(this.h, p98Var.h) && jl40.l(this.i, p98Var.i) && jl40.l(this.j, p98Var.j) && jl40.l(this.k, p98Var.k) && jl40.l(this.l, p98Var.l);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (this.e.hashCode() + ((this.d.hashCode() + ((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31)) * 31;
        String str4 = this.f;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ColorModel colorModel = this.h;
        int hashCode6 = (hashCode5 + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
        ColorModel colorModel2 = this.i;
        int hashCode7 = (hashCode6 + (colorModel2 == null ? 0 : colorModel2.hashCode())) * 31;
        ColorModel colorModel3 = this.j;
        int hashCode8 = (hashCode7 + (colorModel3 == null ? 0 : colorModel3.hashCode())) * 31;
        ColorModel colorModel4 = this.k;
        int hashCode9 = (hashCode8 + (colorModel4 == null ? 0 : colorModel4.hashCode())) * 31;
        ColorModel colorModel5 = this.l;
        return hashCode9 + (colorModel5 != null ? colorModel5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("CardActivationInfoEntity(cardCvvHint=", this.a, ", cardNumberHint=", this.b, ", cardNumberPrefix=");
        v.append(this.c);
        v.append(", cvvValidationInfo=");
        v.append(this.d);
        v.append(", numberValidationInfo=");
        v.append(this.e);
        v.append(", lightSkin=");
        v.append(this.f);
        v.append(", darkSkin=");
        v.append(this.g);
        v.append(", textColorFocusColor=");
        v.append(this.h);
        v.append(", textColorUnfocusColor=");
        smw0.z(v, this.i, ", textColorPlaceholderColor=", this.j, ", inputHeaderColor=");
        v.append(this.k);
        v.append(", textInputBackgroundColor=");
        v.append(this.l);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
