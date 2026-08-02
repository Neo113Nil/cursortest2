package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class le9 implements ne9 {
    public final Text a;
    public final Text b;
    public final String c;

    public le9(Text text, Text text2, String str) {
        this.a = text;
        this.b = text2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le9)) {
            return false;
        }
        le9 le9Var = (le9) obj;
        return jl40.l(this.a, le9Var.a) && jl40.l(this.b, le9Var.b) && jl40.l(this.c, le9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + n.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return oyr.t(n.p("FailedToLinkNumber(title=", this.a, ", description=", this.b, ", supportUrl="), this.c, Extension.C_BRAKE);
    }
}
