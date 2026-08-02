package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class dj11 {
    public final ColorModel a;
    public final float b;

    public dj11(float f, ColorModel colorModel) {
        this.a = colorModel;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj11)) {
            return false;
        }
        dj11 dj11Var = (dj11) obj;
        return jl40.l(this.a, dj11Var.a) && Float.compare(this.b, dj11Var.b) == 0;
    }

    public final int hashCode() {
        ColorModel colorModel = this.a;
        return Float.hashCode(this.b) + ((colorModel == null ? 0 : colorModel.hashCode()) * 31);
    }

    public final String toString() {
        return "TsarButtonGradientComponent(color=" + this.a + ", location=" + this.b + Extension.C_BRAKE;
    }
}
