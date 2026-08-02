package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes5.dex */
public final class lrq0 implements ap0 {
    public final FormattedText a;

    public lrq0(FormattedText formattedText) {
        this.a = formattedText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lrq0) && jl40.l(this.a, ((lrq0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return ly3.p("Separator(text=", Extension.C_BRAKE, this.a);
    }
}
