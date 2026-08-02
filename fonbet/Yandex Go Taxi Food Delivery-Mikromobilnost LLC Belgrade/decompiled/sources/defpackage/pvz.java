package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class pvz implements ovz {
    public final FormattedText a;

    public pvz(FormattedText formattedText) {
        this.a = formattedText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pvz) && jl40.l(this.a, ((pvz) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return ly3.p("LoyaltyProgramSelectorStateBadge(text=", Extension.C_BRAKE, this.a);
    }
}
