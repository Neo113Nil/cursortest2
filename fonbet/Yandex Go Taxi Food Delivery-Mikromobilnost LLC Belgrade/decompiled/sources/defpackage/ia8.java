package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.card.internal.presentation.cardactivation.CardActivationInputState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ia8 implements pa8 {
    public final ea8 a;
    public final CardActivationInputState b;
    public final Text.Resource c;
    public final Integer d;
    public final Text e;
    public final String f;
    public final Text.Constant g;
    public final rbv h;
    public final ColorModel i;
    public final ColorModel j;
    public final ColorModel k;
    public final ColorModel l;
    public final ColorModel m;

    public ia8(ea8 ea8Var, CardActivationInputState cardActivationInputState, Text.Resource resource, Integer num, Text text, String str, Text.Constant constant, rbv rbvVar, ColorModel colorModel, ColorModel colorModel2, ColorModel colorModel3, ColorModel colorModel4, ColorModel colorModel5) {
        this.a = ea8Var;
        this.b = cardActivationInputState;
        this.c = resource;
        this.d = num;
        this.e = text;
        this.f = str;
        this.g = constant;
        this.h = rbvVar;
        this.i = colorModel;
        this.j = colorModel2;
        this.k = colorModel3;
        this.l = colorModel4;
        this.m = colorModel5;
    }

    public final rbv a() {
        return this.h;
    }

    public final ColorModel b() {
        return this.m;
    }

    public final Text c() {
        return this.e;
    }

    public final String d() {
        return this.f;
    }

    public final Text e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia8)) {
            return false;
        }
        ia8 ia8Var = (ia8) obj;
        return this.a.equals(ia8Var.a) && this.b == ia8Var.b && this.c.equals(ia8Var.c) && jl40.l(this.d, ia8Var.d) && jl40.l(this.e, ia8Var.e) && this.f.equals(ia8Var.f) && this.g.equals(ia8Var.g) && jl40.l(this.h, ia8Var.h) && jl40.l(this.i, ia8Var.i) && jl40.l(this.j, ia8Var.j) && jl40.l(this.k, ia8Var.k) && jl40.l(this.l, ia8Var.l) && jl40.l(this.m, ia8Var.m);
    }

    public final Text f() {
        return this.c;
    }

    public final ColorModel g() {
        return this.l;
    }

    public final Integer h() {
        return this.d;
    }

    public final int hashCode() {
        int b = uw51.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        Integer num = this.d;
        int d = xvz.d(this.g, unr0.b(n.c(this.e, (b + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.f), 31);
        rbv rbvVar = this.h;
        int hashCode = (d + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31;
        ColorModel colorModel = this.i;
        int hashCode2 = (hashCode + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
        ColorModel colorModel2 = this.j;
        int hashCode3 = (hashCode2 + (colorModel2 == null ? 0 : colorModel2.hashCode())) * 31;
        ColorModel colorModel3 = this.k;
        int hashCode4 = (hashCode3 + (colorModel3 == null ? 0 : colorModel3.hashCode())) * 31;
        ColorModel colorModel4 = this.l;
        int hashCode5 = (hashCode4 + (colorModel4 == null ? 0 : colorModel4.hashCode())) * 31;
        ColorModel colorModel5 = this.m;
        return hashCode5 + (colorModel5 != null ? colorModel5.hashCode() : 0);
    }

    public final CardActivationInputState i() {
        return this.b;
    }

    public final ColorModel j() {
        return this.j;
    }

    public final ColorModel k() {
        return this.k;
    }

    public final ea8 l() {
        return this.a;
    }

    public final ColorModel m() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(status=");
        sb.append(this.a);
        sb.append(", inputState=");
        sb.append(this.b);
        sb.append(", inputHint=");
        sb.append(this.c);
        sb.append(", inputMaxLength=");
        sb.append(this.d);
        sb.append(", cardNumber=");
        sb.append(this.e);
        sb.append(", cardPanPrefix=");
        sb.append(this.f);
        sb.append(", currentInputText=");
        sb.append(this.g);
        sb.append(", cardBackground=");
        sb.append(this.h);
        sb.append(", textOnCardColor=");
        smw0.z(sb, this.i, ", inputTextColor=", this.j, ", placeholderColor=");
        smw0.z(sb, this.k, ", inputLabelColor=", this.l, ", cardInputBackgroundTint=");
        return n.o(sb, this.m, Extension.C_BRAKE);
    }
}
