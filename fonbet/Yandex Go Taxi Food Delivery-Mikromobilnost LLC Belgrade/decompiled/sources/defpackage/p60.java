package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class p60 {
    public final String a;
    public final String b;
    public final rbv c;
    public final ColorModel d;
    public final ColorModel e;

    public p60(String str, String str2, rbv rbvVar, ColorModel colorModel, ColorModel colorModel2) {
        this.a = str;
        this.b = str2;
        this.c = rbvVar;
        this.d = colorModel;
        this.e = colorModel2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p60)) {
            return false;
        }
        p60 p60Var = (p60) obj;
        return jl40.l(this.a, p60Var.a) && jl40.l(this.b, p60Var.b) && jl40.l(this.c, p60Var.c) && jl40.l(this.d, p60Var.d) && jl40.l(this.e, p60Var.e);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        rbv rbvVar = this.c;
        int hashCode = (b + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31;
        ColorModel colorModel = this.d;
        int hashCode2 = (hashCode + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
        ColorModel colorModel2 = this.e;
        return hashCode2 + (colorModel2 != null ? colorModel2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("State(text=", this.a, ", action=", this.b, ", trailingIcon=");
        v.append(this.c);
        v.append(", contentColor=");
        v.append(this.d);
        v.append(", backgroundColor=");
        return n.o(v, this.e, Extension.C_BRAKE);
    }
}
