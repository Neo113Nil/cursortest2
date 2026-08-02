package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class mjb0 implements njb0 {
    public final String a;
    public final FormattedText b;

    public mjb0(String str, FormattedText formattedText) {
        this.a = str;
        this.b = formattedText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjb0)) {
            return false;
        }
        mjb0 mjb0Var = (mjb0) obj;
        return jl40.l(this.a, mjb0Var.a) && jl40.l(this.b, mjb0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        return hashCode + (formattedText == null ? 0 : formattedText.a.hashCode());
    }

    public final String toString() {
        return "ValidationFail(statusId=" + this.a + ", reason=" + this.b + Extension.C_BRAKE;
    }
}
