package defpackage;

import java.util.AbstractList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class esi {
    public final List a;

    public esi(AbstractList abstractList) {
        this.a = abstractList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof esi) && jl40.l(this.a, ((esi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("DeliveryStateSection(items=", Extension.C_BRAKE, this.a);
    }
}
