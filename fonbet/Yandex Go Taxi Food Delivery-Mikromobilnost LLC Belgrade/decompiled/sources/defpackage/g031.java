package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class g031 {
    public final Text a;
    public final Text.Constant b;
    public final txz0 c;

    public g031(Text.Constant constant, Text.Constant constant2, txz0 txz0Var) {
        this.a = constant;
        this.b = constant2;
        this.c = txz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g031)) {
            return false;
        }
        g031 g031Var = (g031) obj;
        return jl40.l(this.a, g031Var.a) && this.b.equals(g031Var.b) && jl40.l(this.c, g031Var.c);
    }

    public final int hashCode() {
        Text text = this.a;
        return this.c.hashCode() + xvz.d(this.b, (text == null ? 0 : text.hashCode()) * 31, 31);
    }

    public final String toString() {
        return "Error(title=" + this.a + ", message=" + this.b + ", type=" + this.c + Extension.C_BRAKE;
    }
}
