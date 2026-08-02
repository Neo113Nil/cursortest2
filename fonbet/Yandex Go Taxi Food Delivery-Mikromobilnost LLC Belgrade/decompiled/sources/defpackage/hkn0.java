package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class hkn0 implements ikn0 {
    public final FormattedText a;

    public final boolean equals(Object obj) {
        if (obj instanceof hkn0) {
            return jl40.l(this.a, ((hkn0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return ly3.p("TextSourceFormattedText(text=", Extension.C_BRAKE, this.a);
    }
}
