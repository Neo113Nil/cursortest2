package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class jbs0 {
    public final Text a;
    public final int b;
    public final int c;
    public final int d;
    public final rbv e;

    public jbs0(Text text, int i, int i2, int i3, rbv rbvVar) {
        this.a = text;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = rbvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbs0)) {
            return false;
        }
        jbs0 jbs0Var = (jbs0) obj;
        return jl40.l(this.a, jbs0Var.a) && this.b == jbs0Var.b && this.c == jbs0Var.c && this.d == jbs0Var.d && jl40.l(this.e, jbs0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + oyr.b(this.d, oyr.b(this.c, oyr.b(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountState(name=");
        sb.append(this.a);
        sb.append(", textMargin=");
        sb.append(this.b);
        sb.append(", textStyle=");
        vfc.u(this.c, this.d, ", imageSize=", ", avatar=", sb);
        sb.append(this.e);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
