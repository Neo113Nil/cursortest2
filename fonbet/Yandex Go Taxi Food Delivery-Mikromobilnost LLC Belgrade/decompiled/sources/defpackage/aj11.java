package defpackage;

import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class aj11 {
    public final Text a;
    public final String b;
    public final rbv c;
    public final fj11 d;
    public final ThemedParameter e;

    public aj11(Text text, String str, rbv rbvVar, fj11 fj11Var, ThemedParameter themedParameter) {
        this.a = text;
        this.b = str;
        this.c = rbvVar;
        this.d = fj11Var;
        this.e = themedParameter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj11)) {
            return false;
        }
        aj11 aj11Var = (aj11) obj;
        return jl40.l(this.a, aj11Var.a) && jl40.l(this.b, aj11Var.b) && this.c.equals(aj11Var.c) && jl40.l(this.d, aj11Var.d) && jl40.l(this.e, aj11Var.e);
    }

    public final int hashCode() {
        int c = ly3.c(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31);
        fj11 fj11Var = this.d;
        int hashCode = (c + (fj11Var == null ? 0 : fj11Var.hashCode())) * 31;
        ThemedParameter themedParameter = this.e;
        return hashCode + (themedParameter != null ? themedParameter.hashCode() : 0);
    }

    public final String toString() {
        return "TsarButtonContentEntityV2(text=" + this.a + ", action=" + this.b + ", icon=" + this.c + ", gradientParameters=" + this.d + ", backgroundColor=" + this.e + Extension.C_BRAKE;
    }
}
