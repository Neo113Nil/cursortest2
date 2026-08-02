package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gu5 {
    public final Text a;
    public final Text b;
    public final Text c;
    public final Text d;

    public gu5(Text.Constant constant, Text.Constant constant2, Text.Constant constant3, Text.Constant constant4) {
        this.a = constant;
        this.b = constant2;
        this.c = constant3;
        this.d = constant4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu5)) {
            return false;
        }
        gu5 gu5Var = (gu5) obj;
        return jl40.l(this.a, gu5Var.a) && jl40.l(this.b, gu5Var.b) && jl40.l(this.c, gu5Var.c) && jl40.l(this.d, gu5Var.d);
    }

    public final int hashCode() {
        Text text = this.a;
        int hashCode = (text == null ? 0 : text.hashCode()) * 31;
        Text text2 = this.b;
        int hashCode2 = (hashCode + (text2 == null ? 0 : text2.hashCode())) * 31;
        Text text3 = this.c;
        int hashCode3 = (hashCode2 + (text3 == null ? 0 : text3.hashCode())) * 31;
        Text text4 = this.d;
        return hashCode3 + (text4 != null ? text4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder p = n.p("BindAccountSheetOverrideItem(title=", this.a, ", subtitle=", this.b, ", primaryButtonText=");
        p.append(this.c);
        p.append(", legalText=");
        p.append(this.d);
        p.append(Extension.C_BRAKE);
        return p.toString();
    }
}
