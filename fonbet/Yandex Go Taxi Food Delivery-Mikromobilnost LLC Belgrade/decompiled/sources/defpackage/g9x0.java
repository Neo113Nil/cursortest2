package defpackage;

import com.yandex.delivery.mapper.model.CardsRevealing;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class g9x0 implements r9x0 {
    public final String a;
    public final int b;
    public final CardsRevealing c;

    public g9x0(String str, int i, CardsRevealing cardsRevealing) {
        this.a = str;
        this.b = i;
        this.c = cardsRevealing;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9x0)) {
            return false;
        }
        g9x0 g9x0Var = (g9x0) obj;
        return jl40.l(this.a, g9x0Var.a) && this.b == g9x0Var.b && this.c == g9x0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "OpenPlacesSuggest(mode=", this.a, ", index=", ", cardsRevealing=");
        u.append(this.c);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
