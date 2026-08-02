package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class h360 {
    public final e360 a;
    public final FormattedText b;

    static {
        FormattedText formattedText = FormattedText.b;
    }

    public h360(e360 e360Var, FormattedText formattedText) {
        this.a = e360Var;
        this.b = formattedText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h360)) {
            return false;
        }
        h360 h360Var = (h360) obj;
        return jl40.l(this.a, h360Var.a) && jl40.l(this.b, h360Var.b);
    }

    public final int hashCode() {
        e360 e360Var = this.a;
        int hashCode = (e360Var == null ? 0 : e360Var.hashCode()) * 31;
        FormattedText formattedText = this.b;
        return hashCode + (formattedText != null ? formattedText.a.hashCode() : 0);
    }

    public final String toString() {
        return "NeuroPostcardLabels(watermark=" + this.a + ", sign=" + this.b + Extension.C_BRAKE;
    }
}
