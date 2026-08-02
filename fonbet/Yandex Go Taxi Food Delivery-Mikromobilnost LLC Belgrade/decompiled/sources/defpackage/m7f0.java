package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.main.internal.widgets.ProductCardView$State$SubtitleType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class m7f0 {
    public final Text a;
    public final ColorModel b;
    public final int c;
    public final boolean d;
    public final ColorModel e;
    public final rbv f;
    public final y5i0 g;
    public final ProductCardView$State$SubtitleType h;

    public m7f0(Text text, ColorModel colorModel, int i, boolean z, ColorModel colorModel2, rbv rbvVar, y5i0 y5i0Var, ProductCardView$State$SubtitleType productCardView$State$SubtitleType) {
        this.a = text;
        this.b = colorModel;
        this.c = i;
        this.d = z;
        this.e = colorModel2;
        this.f = rbvVar;
        this.g = y5i0Var;
        this.h = productCardView$State$SubtitleType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7f0)) {
            return false;
        }
        m7f0 m7f0Var = (m7f0) obj;
        return this.a.equals(m7f0Var.a) && this.b.equals(m7f0Var.b) && this.c == m7f0Var.c && this.d == m7f0Var.d && jl40.l(this.e, m7f0Var.e) && jl40.l(this.f, m7f0Var.f) && jl40.l(this.g, m7f0Var.g) && this.h == m7f0Var.h;
    }

    public final int hashCode() {
        int d = vfc.d(this.e, unr0.e(oyr.b(this.c, vfc.d(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31);
        rbv rbvVar = this.f;
        int hashCode = (d + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31;
        y5i0 y5i0Var = this.g;
        return this.h.hashCode() + ((hashCode + (y5i0Var != null ? y5i0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubtitleText(subtitle=");
        sb.append(this.a);
        sb.append(", subtitleColor=");
        sb.append(this.b);
        sb.append(", subtitleStyle=");
        tse0.z(sb, this.c, ", shouldAnimateSubtitle=", this.d, ", subtitleShimmerColor=");
        sb.append(this.e);
        sb.append(", icon=");
        sb.append(this.f);
        sb.append(", radialGradient=");
        sb.append(this.g);
        sb.append(", type=");
        sb.append(this.h);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
