package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class gp7 implements ip7 {
    public final FormattedText a;
    public final FormattedText b;

    static {
        FormattedText formattedText = FormattedText.b;
    }

    public gp7(FormattedText formattedText, FormattedText formattedText2) {
        this.a = formattedText;
        this.b = formattedText2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp7)) {
            return false;
        }
        gp7 gp7Var = (gp7) obj;
        return this.a.equals(gp7Var.a) && jl40.l(this.b, gp7Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        return hashCode + (formattedText == null ? 0 : formattedText.a.hashCode());
    }

    public final String toString() {
        return "AiCameraConfig(title=" + this.a + ", hintText=" + this.b + Extension.C_BRAKE;
    }
}
