package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class jy3 {
    public final Text a;
    public final Text b;
    public final Text c;
    public final ColorModel.Attr d;
    public final rbv e;
    public final rbv f;

    public jy3(Text.Resource resource, Text text, Text.Constant constant, ColorModel.Attr attr, pbv pbvVar, rbv rbvVar) {
        this.a = resource;
        this.b = text;
        this.c = constant;
        this.d = attr;
        this.e = pbvVar;
        this.f = rbvVar;
    }

    public final ColorModel a() {
        return this.d;
    }

    public final rbv b() {
        return this.e;
    }

    public final rbv c() {
        return this.f;
    }

    public final Text d() {
        return this.c;
    }

    public final Text e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy3)) {
            return false;
        }
        jy3 jy3Var = (jy3) obj;
        return jl40.l(this.a, jy3Var.a) && this.b.equals(jy3Var.b) && jl40.l(this.c, jy3Var.c) && this.d.equals(jy3Var.d) && jl40.l(this.e, jy3Var.e) && this.f.equals(jy3Var.f);
    }

    public final Text f() {
        return this.b;
    }

    public final int hashCode() {
        Text text = this.a;
        int c = n.c(this.b, (text == null ? 0 : text.hashCode()) * 31, 31);
        Text text2 = this.c;
        int hashCode = (this.d.hashCode() + ((c + (text2 == null ? 0 : text2.hashCode())) * 31)) * 31;
        rbv rbvVar = this.e;
        return this.f.hashCode() + ((hashCode + (rbvVar != null ? rbvVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder p = n.p("SourceButtonState(textHint=", this.a, ", textTitle=", this.b, ", textError=");
        p.append(this.c);
        p.append(", colorTitle=");
        p.append(this.d);
        p.append(", imageError=");
        p.append(this.e);
        p.append(", imageSource=");
        p.append(this.f);
        p.append(Extension.C_BRAKE);
        return p.toString();
    }
}
