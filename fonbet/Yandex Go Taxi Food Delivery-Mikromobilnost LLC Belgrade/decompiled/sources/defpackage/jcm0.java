package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class jcm0 {
    public final Text a;
    public final rbv b;
    public final ColorModel c;
    public final rr51 d;

    public jcm0(Text text, rbv rbvVar, ColorModel colorModel, rr51 rr51Var) {
        this.a = text;
        this.b = rbvVar;
        this.c = colorModel;
        this.d = rr51Var;
    }

    public final ColorModel a() {
        return this.c;
    }

    public final rr51 b() {
        return this.d;
    }

    public final Text c() {
        return this.a;
    }

    public final rbv d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcm0)) {
            return false;
        }
        jcm0 jcm0Var = (jcm0) obj;
        return jl40.l(this.a, jcm0Var.a) && jl40.l(this.b, jcm0Var.b) && jl40.l(this.c, jcm0Var.c) && this.d.equals(jcm0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + vfc.d(this.c, ly3.c(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "Header(title=" + this.a + ", titleIcon=" + this.b + ", backgroundGradient=" + this.c + ", bottomDivData=" + this.d + Extension.C_BRAKE;
    }
}
