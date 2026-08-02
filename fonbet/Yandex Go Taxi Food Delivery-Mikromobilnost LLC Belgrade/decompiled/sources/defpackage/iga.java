package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class iga {
    public final CharSequence a;
    public final List b;
    public final List c;

    public iga(CharSequence charSequence, List list, List list2) {
        this.a = charSequence;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iga)) {
            return false;
        }
        iga igaVar = (iga) obj;
        return jl40.l(this.a, igaVar.a) && jl40.l(this.b, igaVar.b) && jl40.l(this.c, igaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChargersPassesCancelConfirmationUiState(title=");
        sb.append((Object) this.a);
        sb.append(", instructions=");
        sb.append(this.b);
        sb.append(", buttons=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }
}
