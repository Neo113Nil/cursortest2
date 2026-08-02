package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class fu5 {
    public final Text a;
    public final Text b;
    public final Text c;
    public final Text d;
    public final String e;

    public fu5(Text text, Text text2, Text text3, Text.Constant constant, String str) {
        this.a = text;
        this.b = text2;
        this.c = text3;
        this.d = constant;
        this.e = str;
    }

    public final String a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu5)) {
            return false;
        }
        fu5 fu5Var = (fu5) obj;
        return jl40.l(this.a, fu5Var.a) && jl40.l(this.b, fu5Var.b) && jl40.l(this.c, fu5Var.c) && jl40.l(this.d, fu5Var.d) && jl40.l(this.e, fu5Var.e);
    }

    public final int hashCode() {
        int c = n.c(this.c, n.c(this.b, this.a.hashCode() * 31, 31), 31);
        Text text = this.d;
        int hashCode = (c + (text == null ? 0 : text.hashCode())) * 31;
        String str = this.e;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder p = n.p("BindAccountSheetItem(title=", this.a, ", subtitle=", this.b, ", primaryButton=");
        ly3.C(p, this.c, ", legalText=", this.d, ", deeplink=");
        return oyr.t(p, this.e, Extension.C_BRAKE);
    }
}
