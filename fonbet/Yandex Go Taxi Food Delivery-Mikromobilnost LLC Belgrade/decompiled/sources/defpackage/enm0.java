package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final class enm0 {
    public final FormattedText a;

    public enm0(FormattedText formattedText) {
        this.a = formattedText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof enm0) && jl40.l(this.a, ((enm0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return ly3.p("ScheduleButton(title=", Extension.C_BRAKE, this.a);
    }
}
