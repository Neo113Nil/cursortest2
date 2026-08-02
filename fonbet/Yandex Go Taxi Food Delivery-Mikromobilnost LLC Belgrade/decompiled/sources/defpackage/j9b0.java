package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class j9b0 {
    public final ColorModel a;
    public final rbv b;

    public j9b0(rbv rbvVar, ColorModel colorModel) {
        this.a = colorModel;
        this.b = rbvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9b0)) {
            return false;
        }
        j9b0 j9b0Var = (j9b0) obj;
        return jl40.l(this.a, j9b0Var.a) && jl40.l(this.b, j9b0Var.b);
    }

    public final int hashCode() {
        ColorModel colorModel = this.a;
        int hashCode = (colorModel == null ? 0 : colorModel.hashCode()) * 31;
        rbv rbvVar = this.b;
        return hashCode + (rbvVar != null ? rbvVar.hashCode() : 0);
    }

    public final String toString() {
        return "Background(backgroundColor=" + this.a + ", backgroundImageModel=" + this.b + Extension.C_BRAKE;
    }
}
