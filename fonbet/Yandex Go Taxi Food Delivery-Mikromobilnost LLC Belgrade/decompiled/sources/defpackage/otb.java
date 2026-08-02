package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class otb {
    public final String a;
    public final rbv b;
    public final Text.Constant c;
    public final boolean d;
    public final Text.Constant e;
    public final ColorModel f;
    public final ColorModel g;

    public otb(String str, rbv rbvVar, Text.Constant constant, boolean z, Text.Constant constant2) {
        ColorModel.Attr attr = new ColorModel.Attr(ung0.ybColor_button_secondaryNormal);
        ColorModel.Attr attr2 = new ColorModel.Attr(ung0.ybColor_textIcon_primary);
        this.a = str;
        this.b = rbvVar;
        this.c = constant;
        this.d = z;
        this.e = constant2;
        this.f = attr;
        this.g = attr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof otb)) {
            return false;
        }
        otb otbVar = (otb) obj;
        return jl40.l(this.a, otbVar.a) && jl40.l(this.b, otbVar.b) && jl40.l(this.c, otbVar.c) && this.d == otbVar.d && jl40.l(this.e, otbVar.e) && jl40.l(this.f, otbVar.f) && jl40.l(this.g, otbVar.g);
    }

    public final int hashCode() {
        int e = unr0.e(xvz.d(this.c, ly3.c(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
        Text.Constant constant = this.e;
        return this.g.hashCode() + vfc.d(this.f, (e + (constant == null ? 0 : constant.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(id=");
        sb.append(this.a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", buttonTitle=");
        sb.append(this.c);
        sb.append(", enabled=");
        sb.append(this.d);
        sb.append(", textLabelText=");
        sb.append(this.e);
        sb.append(", backgroundColor=");
        sb.append(this.f);
        sb.append(", textColor=");
        return n.o(sb, this.g, Extension.C_BRAKE);
    }
}
