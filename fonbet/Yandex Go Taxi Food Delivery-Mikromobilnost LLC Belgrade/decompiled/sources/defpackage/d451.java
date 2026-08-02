package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.WidgetView$State$Type;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class d451 {
    public final Text.Constant a;
    public final Text b;
    public final Text c;
    public final ColorModel d;
    public final ColorModel e;
    public final ColorModel f;
    public final ColorModel g;
    public final ColorModel h;
    public final ColorModel i;
    public final String j;
    public final WidgetView$State$Type k;

    public d451(Text.Constant constant, Text.Constant constant2, Text.Constant constant3, ColorModel colorModel, ColorModel colorModel2, ColorModel colorModel3, ColorModel colorModel4, ColorModel colorModel5, ColorModel colorModel6, String str, WidgetView$State$Type widgetView$State$Type) {
        this.a = constant;
        this.b = constant2;
        this.c = constant3;
        this.d = colorModel;
        this.e = colorModel2;
        this.f = colorModel3;
        this.g = colorModel4;
        this.h = colorModel5;
        this.i = colorModel6;
        this.j = str;
        this.k = widgetView$State$Type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d451)) {
            return false;
        }
        d451 d451Var = (d451) obj;
        return this.a.equals(d451Var.a) && jl40.l(this.b, d451Var.b) && jl40.l(this.c, d451Var.c) && this.d.equals(d451Var.d) && this.e.equals(d451Var.e) && jl40.l(this.f, d451Var.f) && jl40.l(this.g, d451Var.g) && jl40.l(this.h, d451Var.h) && jl40.l(this.i, d451Var.i) && jl40.l(this.j, d451Var.j) && this.k == d451Var.k;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Text text = this.b;
        int hashCode2 = (hashCode + (text == null ? 0 : text.hashCode())) * 31;
        Text text2 = this.c;
        int d = vfc.d(this.e, vfc.d(this.d, (hashCode2 + (text2 == null ? 0 : text2.hashCode())) * 29791, 31), 31);
        ColorModel colorModel = this.f;
        int hashCode3 = (d + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
        ColorModel colorModel2 = this.g;
        int hashCode4 = (hashCode3 + (colorModel2 == null ? 0 : colorModel2.hashCode())) * 31;
        ColorModel colorModel3 = this.h;
        int hashCode5 = (hashCode4 + (colorModel3 == null ? 0 : colorModel3.hashCode())) * 31;
        ColorModel colorModel4 = this.i;
        int hashCode6 = (hashCode5 + (colorModel4 == null ? 0 : colorModel4.hashCode())) * 31;
        String str = this.j;
        return this.k.hashCode() + ((hashCode6 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", buttonText=");
        sb.append(this.c);
        sb.append(", image=null, icon=null, backgroundColor=");
        sb.append(this.d);
        sb.append(", titleTextColor=");
        smw0.z(sb, this.e, ", descriptionTextColor=", this.f, ", delimiterColor=");
        smw0.z(sb, this.g, ", buttonTextColor=", this.h, ", buttonBackgroundColor=");
        sb.append(this.i);
        sb.append(", action=");
        sb.append(this.j);
        sb.append(", type=");
        sb.append(this.k);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
