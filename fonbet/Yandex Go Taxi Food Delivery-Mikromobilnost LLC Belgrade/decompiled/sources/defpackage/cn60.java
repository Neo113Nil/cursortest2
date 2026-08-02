package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class cn60 {
    public final int a;
    public final Text b;

    public cn60(int i, Text.Constant constant) {
        this.a = i;
        this.b = constant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn60)) {
            return false;
        }
        cn60 cn60Var = (cn60) obj;
        return this.a == cn60Var.a && jl40.l(this.b, cn60Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Text text = this.b;
        return hashCode + (text == null ? 0 : text.hashCode());
    }

    public final String toString() {
        return "State(number=" + this.a + ", content=" + this.b + Extension.C_BRAKE;
    }
}
