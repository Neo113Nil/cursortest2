package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class bdb0 implements cdb0 {
    public final ColorModel a;
    public final Text b;

    public bdb0(ColorModel colorModel, Text text) {
        this.a = colorModel;
        this.b = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdb0)) {
            return false;
        }
        bdb0 bdb0Var = (bdb0) obj;
        return jl40.l(this.a, bdb0Var.a) && jl40.l(this.b, bdb0Var.b);
    }

    public final int hashCode() {
        ColorModel colorModel = this.a;
        int hashCode = (colorModel == null ? 0 : colorModel.hashCode()) * 31;
        Text text = this.b;
        return hashCode + (text != null ? text.hashCode() : 0);
    }

    public final String toString() {
        return "Plain(textColor=" + this.a + ", text=" + this.b + Extension.C_BRAKE;
    }
}
