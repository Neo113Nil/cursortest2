package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class o130 {
    public final mvi0 a;
    public final FormattedText b;
    public final qfc c;
    public final cy20 d;

    public o130(mvi0 mvi0Var, FormattedText formattedText, qfc qfcVar, cy20 cy20Var) {
        this.a = mvi0Var;
        this.b = formattedText;
        this.c = qfcVar;
        this.d = cy20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o130)) {
            return false;
        }
        o130 o130Var = (o130) obj;
        return this.a.equals(o130Var.a) && jl40.l(this.b, o130Var.b) && this.c.equals(o130Var.c) && this.d.equals(o130Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "ModalViewHeader(icon=" + this.a + ", iconText=" + this.b + ", backgroundColor=" + this.c + ", contentItem=" + this.d + Extension.C_BRAKE;
    }
}
