package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gsi0 {
    public final Text.Constant a;
    public final Text b;

    public gsi0(Text.Constant constant, Text.Constant constant2) {
        this.a = constant;
        this.b = constant2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsi0)) {
            return false;
        }
        gsi0 gsi0Var = (gsi0) obj;
        return this.a.equals(gsi0Var.a) && jl40.l(this.b, gsi0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Text text = this.b;
        return hashCode + (text == null ? 0 : text.hashCode());
    }

    public final String toString() {
        return "ValidationError(title=" + this.a + ", message=" + this.b + Extension.C_BRAKE;
    }
}
