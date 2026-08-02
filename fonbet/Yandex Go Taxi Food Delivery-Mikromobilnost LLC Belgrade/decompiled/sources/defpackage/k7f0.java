package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class k7f0 {
    public final ColorModel a;
    public final Integer b;
    public final Integer c;

    public k7f0() {
        this(new ColorModel.Attr(ung0.ybColor_fill_default_300), null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7f0)) {
            return false;
        }
        k7f0 k7f0Var = (k7f0) obj;
        return jl40.l(this.a, k7f0Var.a) && jl40.l(this.b, k7f0Var.b) && jl40.l(this.c, k7f0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpoilerViewState(particleColor=");
        sb.append(this.a);
        sb.append(", height=");
        sb.append(this.b);
        sb.append(", width=");
        return oo31.j(sb, this.c, Extension.C_BRAKE);
    }

    public k7f0(ColorModel colorModel, Integer num, Integer num2) {
        this.a = colorModel;
        this.b = num;
        this.c = num2;
    }
}
