package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class pws0 {
    public final List a;
    public final boolean b;

    public pws0(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pws0)) {
            return false;
        }
        pws0 pws0Var = (pws0) obj;
        return this.a.equals(pws0Var.a) && this.b == pws0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.o(this.a, "SlotsModel(slots=", ", isLoading=", Extension.C_BRAKE, this.b);
    }
}
