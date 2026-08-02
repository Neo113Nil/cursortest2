package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class fig {
    public final ColorModel a;
    public final boolean b;

    public fig(ColorModel colorModel, boolean z) {
        this.a = colorModel;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fig)) {
            return false;
        }
        fig figVar = (fig) obj;
        return jl40.l(this.a, figVar.a) && this.b == figVar.b;
    }

    public final int hashCode() {
        ColorModel colorModel = this.a;
        return Boolean.hashCode(this.b) + ((colorModel == null ? 0 : colorModel.hashCode()) * 31);
    }

    public final String toString() {
        return "ShimmerState(color=" + this.a + ", visible=" + this.b + Extension.C_BRAKE;
    }
}
