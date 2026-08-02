package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class oe9 implements qe9 {
    public final Text a;
    public final Text b;
    public final String c;

    public oe9(Text text, Text text2, String str) {
        this.a = text;
        this.b = text2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe9)) {
            return false;
        }
        oe9 oe9Var = (oe9) obj;
        return jl40.l(this.a, oe9Var.a) && jl40.l(this.b, oe9Var.b) && jl40.l(this.c, oe9Var.c);
    }

    public final int hashCode() {
        Text text = this.a;
        int hashCode = (text == null ? 0 : text.hashCode()) * 31;
        Text text2 = this.b;
        int hashCode2 = (hashCode + (text2 == null ? 0 : text2.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(n.p("Default(title=", this.a, ", description=", this.b, ", supportUrl="), this.c, Extension.C_BRAKE);
    }

    public oe9() {
        this(null, null, null);
    }
}
