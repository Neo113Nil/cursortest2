package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class p2e0 extends s2e0 {
    public final Text a;
    public final Text b;
    public final String c;
    public final boolean d;

    public p2e0(String str, int i, Text text, Text text2) {
        text = (i & 1) != 0 ? null : text;
        text2 = (i & 2) != 0 ? null : text2;
        str = (i & 4) != 0 ? null : str;
        boolean z = (i & 8) == 0;
        this.a = text;
        this.b = text2;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2e0)) {
            return false;
        }
        p2e0 p2e0Var = (p2e0) obj;
        return jl40.l(this.a, p2e0Var.a) && jl40.l(this.b, p2e0Var.b) && jl40.l(this.c, p2e0Var.c) && this.d == p2e0Var.d;
    }

    public final int hashCode() {
        Text text = this.a;
        int hashCode = (text == null ? 0 : text.hashCode()) * 31;
        Text text2 = this.b;
        int hashCode2 = (hashCode + (text2 == null ? 0 : text2.hashCode())) * 31;
        String str = this.c;
        return Boolean.hashCode(this.d) + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return nnm.i(this.c, ", takesTooLong=", Extension.C_BRAKE, n.p("Processing(title=", this.a, ", description=", this.b, ", supportUrl="), this.d);
    }

    public p2e0() {
        this(null, 15, null, null);
    }
}
