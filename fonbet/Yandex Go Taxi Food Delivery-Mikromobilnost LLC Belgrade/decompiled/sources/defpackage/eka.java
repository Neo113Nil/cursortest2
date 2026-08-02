package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class eka implements fka {
    public final FormattedText a;
    public final List b;
    public final List c;

    public eka(FormattedText formattedText, List list, List list2) {
        this.a = formattedText;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eka)) {
            return false;
        }
        eka ekaVar = (eka) obj;
        return jl40.l(this.a, ekaVar.a) && jl40.l(this.b, ekaVar.b) && jl40.l(this.c, ekaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PurchasedPasses(title=");
        sb.append(this.a);
        sb.append(", passes=");
        sb.append(this.b);
        sb.append(", bottomButtons=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }
}
