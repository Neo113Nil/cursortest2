package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class bif0 {
    public final FormattedText a;
    public final double b;
    public final String c;
    public final g8a1 d;
    public final o690 e;

    public bif0(FormattedText formattedText, double d, String str, g8a1 g8a1Var, o690 o690Var) {
        this.a = formattedText;
        this.b = d;
        this.c = str;
        this.d = g8a1Var;
        this.e = o690Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bif0)) {
            return false;
        }
        bif0 bif0Var = (bif0) obj;
        return jl40.l(this.a, bif0Var.a) && Double.compare(this.b, bif0Var.b) == 0 && jl40.l(this.c, bif0Var.c) && this.d.equals(bif0Var.d) && jl40.l(this.e, bif0Var.e);
    }

    public final int hashCode() {
        FormattedText formattedText = this.a;
        int a = unr0.a((formattedText == null ? 0 : formattedText.a.hashCode()) * 31, 31, this.b);
        String str = this.c;
        int hashCode = (this.d.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        o690 o690Var = this.e;
        return hashCode + (o690Var != null ? o690Var.hashCode() : 0);
    }

    public final String toString() {
        return "ProgressBarModel(text=" + this.a + ", progress=" + this.b + ", accessibilityLabel=" + this.c + ", style=" + this.d + ", paddings=" + this.e + Extension.C_BRAKE;
    }
}
