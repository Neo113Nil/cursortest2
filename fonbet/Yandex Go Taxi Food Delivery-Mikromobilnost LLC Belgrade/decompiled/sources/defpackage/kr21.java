package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class kr21 {
    public final FormattedText a;

    public kr21(FormattedText formattedText) {
        this.a = formattedText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kr21) && jl40.l(this.a, ((kr21) obj).a);
    }

    public final int hashCode() {
        FormattedText formattedText = this.a;
        if (formattedText == null) {
            return 0;
        }
        return formattedText.a.hashCode();
    }

    public final String toString() {
        return ly3.p("Bdui(status=", Extension.C_BRAKE, this.a);
    }
}
