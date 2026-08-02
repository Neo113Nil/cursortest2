package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class hsg {
    public final Text a;
    public final Text.Constant b;
    public final ColorModel.Attr c;

    public hsg(Text.Constant constant, Text.Constant constant2, ColorModel.Attr attr) {
        this.a = constant;
        this.b = constant2;
        this.c = attr;
    }

    public final Text a() {
        return this.a;
    }

    public final Text b() {
        return this.b;
    }

    public final ColorModel c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hsg)) {
            return false;
        }
        hsg hsgVar = (hsg) obj;
        return jl40.l(this.a, hsgVar.a) && this.b.equals(hsgVar.b) && this.c.equals(hsgVar.c);
    }

    public final int hashCode() {
        Text text = this.a;
        return this.c.hashCode() + xvz.d(this.b, (text == null ? 0 : text.hashCode()) * 31, 31);
    }

    public final String toString() {
        return "DayButtonViewItem(hint=" + this.a + ", title=" + this.b + ", titleColor=" + this.c + Extension.C_BRAKE;
    }
}
