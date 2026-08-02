package defpackage;

import com.ybsdk.core.design.design.DesignTextStyle;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class lrc {
    public final Text a;
    public final ColorModel b;
    public final DesignTextStyle c;
    public final Text d;
    public final ColorModel e;
    public final DesignTextStyle f;
    public final List g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final boolean l;

    public lrc(Text text, ColorModel colorModel, DesignTextStyle designTextStyle, Text text2, ColorModel colorModel2, DesignTextStyle designTextStyle2, List list, int i, int i2, int i3, boolean z, boolean z2) {
        this.a = text;
        this.b = colorModel;
        this.c = designTextStyle;
        this.d = text2;
        this.e = colorModel2;
        this.f = designTextStyle2;
        this.g = list;
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = z;
        this.l = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lrc)) {
            return false;
        }
        lrc lrcVar = (lrc) obj;
        return jl40.l(this.a, lrcVar.a) && jl40.l(this.b, lrcVar.b) && this.c == lrcVar.c && jl40.l(this.d, lrcVar.d) && jl40.l(this.e, lrcVar.e) && this.f == lrcVar.f && jl40.l(this.g, lrcVar.g) && this.h == lrcVar.h && this.i == lrcVar.i && this.j == lrcVar.j && this.k == lrcVar.k && this.l == lrcVar.l;
    }

    public final int hashCode() {
        Text text = this.a;
        int hashCode = (text == null ? 0 : text.hashCode()) * 31;
        ColorModel colorModel = this.b;
        int hashCode2 = (hashCode + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
        DesignTextStyle designTextStyle = this.c;
        int hashCode3 = (hashCode2 + (designTextStyle == null ? 0 : designTextStyle.hashCode())) * 31;
        Text text2 = this.d;
        int hashCode4 = (hashCode3 + (text2 == null ? 0 : text2.hashCode())) * 31;
        ColorModel colorModel2 = this.e;
        int hashCode5 = (hashCode4 + (colorModel2 == null ? 0 : colorModel2.hashCode())) * 31;
        DesignTextStyle designTextStyle2 = this.f;
        int hashCode6 = (hashCode5 + (designTextStyle2 == null ? 0 : designTextStyle2.hashCode())) * 31;
        List list = this.g;
        return Boolean.hashCode(this.l) + unr0.e(oyr.b(this.j, oyr.b(this.i, oyr.b(this.h, (hashCode6 + (list != null ? list.hashCode() : 0)) * 961, 31), 31), 31), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(title=");
        sb.append(this.a);
        sb.append(", titleColor=");
        sb.append(this.b);
        sb.append(", titleStyle=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", subtitleColor=");
        sb.append(this.e);
        sb.append(", subtitleStyle=");
        sb.append(this.f);
        sb.append(", infoList=");
        sb.append(this.g);
        sb.append(", onLinkClickListener=null, titleLayoutGravity=");
        sb.append(this.h);
        sb.append(", subtitleGravity=");
        vfc.u(this.i, this.j, ", titlePaddingTopDp=", ", isScrollable=", sb);
        return smw0.k(", isFocused=", Extension.C_BRAKE, sb, this.k, this.l);
    }
}
