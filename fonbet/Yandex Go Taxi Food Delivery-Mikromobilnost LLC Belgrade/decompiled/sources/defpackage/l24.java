package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class l24 {
    public final pbv a;
    public final ArrayList b;
    public final Text c;
    public final Text.Constant d;
    public final Text e;
    public final Text.Constant f;
    public final ColorModel g;
    public final ColorModel h;

    public l24(pbv pbvVar, ArrayList arrayList, Text text, Text.Constant constant, Text.Constant constant2, Text.Constant constant3, ColorModel colorModel, ColorModel colorModel2) {
        this.a = pbvVar;
        this.b = arrayList;
        this.c = text;
        this.d = constant;
        this.e = constant2;
        this.f = constant3;
        this.g = colorModel;
        this.h = colorModel2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l24)) {
            return false;
        }
        l24 l24Var = (l24) obj;
        return this.a.equals(l24Var.a) && this.b.equals(l24Var.b) && jl40.l(this.c, l24Var.c) && this.d.equals(l24Var.d) && jl40.l(this.e, l24Var.e) && this.f.equals(l24Var.f) && this.g.equals(l24Var.g) && this.h.equals(l24Var.h);
    }

    public final int hashCode() {
        int d = xvz.d(this.d, n.c(this.c, ly3.b(this.a.hashCode() * 31, 31, this.b), 31), 31);
        Text text = this.e;
        return this.h.hashCode() + vfc.d(this.g, xvz.d(this.f, (d + (text == null ? 0 : text.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        return "State(icon=" + this.a + ", months=" + this.b + ", textInfo=" + this.c + ", textAmount=" + this.d + ", textTooltip=" + this.e + ", textDescription=" + this.f + ", backgroundColorInfo=" + this.g + ", backgroundColorDropdown=" + this.h + Extension.C_BRAKE;
    }
}
