package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class nhk implements phk {
    public final Text a;
    public final Text b;
    public final rbv c;
    public final lzz0 d;

    public nhk(Text text, Text text2, rbv rbvVar, lzz0 lzz0Var) {
        this.a = text;
        this.b = text2;
        this.c = rbvVar;
        this.d = lzz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhk)) {
            return false;
        }
        nhk nhkVar = (nhk) obj;
        return jl40.l(this.a, nhkVar.a) && jl40.l(this.b, nhkVar.b) && this.c.equals(nhkVar.c) && jl40.l(this.d, nhkVar.d);
    }

    public final int hashCode() {
        Text text = this.a;
        int hashCode = (text == null ? 0 : text.hashCode()) * 31;
        Text text2 = this.b;
        int c = ly3.c(this.c, (hashCode + (text2 == null ? 0 : text2.hashCode())) * 31, 31);
        lzz0 lzz0Var = this.d;
        return c + (lzz0Var != null ? lzz0Var.a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder p = n.p("Error(title=", this.a, ", subtitle=", this.b, ", imageModel=");
        p.append(this.c);
        p.append(", traceIdState=");
        p.append(this.d);
        p.append(Extension.C_BRAKE);
        return p.toString();
    }
}
