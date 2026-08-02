package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes2.dex */
public final class eu01 extends gu01 {
    public final Text a;
    public final boolean b;
    public final rbv c;
    public final Text d;
    public final Text e;
    public final rtz0 f;
    public final rbv g;

    public /* synthetic */ eu01(Text.Constant constant, boolean z, rbv rbvVar, Text.Constant constant2, Text text, rtz0 rtz0Var, int i) {
        this((i & 1) != 0 ? null : constant, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : rbvVar, (i & 8) != 0 ? null : constant2, (i & 16) != 0 ? null : text, (i & 32) != 0 ? null : rtz0Var, (rbv) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu01)) {
            return false;
        }
        eu01 eu01Var = (eu01) obj;
        return jl40.l(this.a, eu01Var.a) && this.b == eu01Var.b && jl40.l(this.c, eu01Var.c) && jl40.l(this.d, eu01Var.d) && jl40.l(this.e, eu01Var.e) && jl40.l(this.f, eu01Var.f) && jl40.l(this.g, eu01Var.g);
    }

    public final int hashCode() {
        Text text = this.a;
        int e = unr0.e((text == null ? 0 : text.hashCode()) * 31, 31, this.b);
        rbv rbvVar = this.c;
        int hashCode = (e + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31;
        Text text2 = this.d;
        int hashCode2 = (hashCode + (text2 == null ? 0 : text2.hashCode())) * 31;
        Text text3 = this.e;
        int hashCode3 = (hashCode2 + (text3 == null ? 0 : text3.hashCode())) * 31;
        rtz0 rtz0Var = this.f;
        int hashCode4 = (hashCode3 + (rtz0Var == null ? 0 : rtz0Var.hashCode())) * 31;
        rbv rbvVar2 = this.g;
        return hashCode4 + (rbvVar2 != null ? rbvVar2.hashCode() : 0);
    }

    public final String toString() {
        return "Account(accountTitle=" + this.a + ", showOpenMarker=" + this.b + ", accountImage=" + this.c + ", subtitleAccountText=" + this.d + ", subtitleAmount=" + this.e + ", rightPart=" + this.f + ", leftImage=" + this.g + Extension.C_BRAKE;
    }

    public eu01(Text text, boolean z, rbv rbvVar, Text text2, Text text3, rtz0 rtz0Var, rbv rbvVar2) {
        this.a = text;
        this.b = z;
        this.c = rbvVar;
        this.d = text2;
        this.e = text3;
        this.f = rtz0Var;
        this.g = rbvVar2;
    }

    public eu01() {
        this((Text.Constant) null, false, (rbv) null, (Text.Constant) null, (Text) null, (rtz0) null, HProv.PP_VERSION_TIMESTAMP);
    }
}
