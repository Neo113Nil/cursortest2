package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class dx11 {
    public final Text.Constant a;
    public final Text b;

    public dx11(Text.Constant constant, Text text) {
        this.a = constant;
        this.b = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx11)) {
            return false;
        }
        dx11 dx11Var = (dx11) obj;
        return this.a.equals(dx11Var.a) && jl40.l(this.b, dx11Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UnbindAccountSnackbarEntity(title=" + this.a + ", subtitle=" + this.b + Extension.C_BRAKE;
    }
}
