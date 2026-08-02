package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class m8m0 extends n8m0 {
    public final ColorModel b;
    public final lur0 c;

    public m8m0(ColorModel colorModel, lur0 lur0Var) {
        super(lur0Var);
        this.b = colorModel;
        this.c = lur0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8m0)) {
            return false;
        }
        m8m0 m8m0Var = (m8m0) obj;
        return jl40.l(this.b, m8m0Var.b) && this.c.equals(m8m0Var.c);
    }

    public final int hashCode() {
        ColorModel colorModel = this.b;
        return this.c.hashCode() + ((colorModel == null ? 0 : colorModel.hashCode()) * 31);
    }

    public final String toString() {
        return "Loading(backgroundColor=" + this.b + ", shimmerTimeStatus=" + this.c + Extension.C_BRAKE;
    }
}
