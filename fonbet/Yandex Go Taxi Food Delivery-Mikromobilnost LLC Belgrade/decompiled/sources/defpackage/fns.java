package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class fns {
    public final Text a;
    public final Text b;

    public fns(Text.Constant constant, Text text) {
        this.a = constant;
        this.b = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fns)) {
            return false;
        }
        fns fnsVar = (fns) obj;
        return jl40.l(this.a, fnsVar.a) && jl40.l(this.b, fnsVar.b);
    }

    public final int hashCode() {
        Text text = this.a;
        int hashCode = (text == null ? 0 : text.hashCode()) * 31;
        Text text2 = this.b;
        return hashCode + (text2 != null ? text2.hashCode() : 0);
    }

    public final String toString() {
        return "Loading(title=" + this.a + ", subtitle=" + this.b + Extension.C_BRAKE;
    }
}
