package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final class g4z0 {
    public final FormattedText a;
    public final String b;

    public g4z0(String str, FormattedText formattedText) {
        this.a = formattedText;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4z0)) {
            return false;
        }
        g4z0 g4z0Var = (g4z0) obj;
        return jl40.l(this.a, g4z0Var.a) && jl40.l(this.b, g4z0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "TicketsButton(title=" + this.a + ", historyUrl=" + this.b + Extension.C_BRAKE;
    }
}
