package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ldm0 {
    public final String a;
    public final ArrayList b;

    public ldm0(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldm0)) {
            return false;
        }
        ldm0 ldm0Var = (ldm0) obj;
        return jl40.l(this.a, ldm0Var.a) && this.b.equals(ldm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return n.k("SavingsProductShelfOrderEntity(shelfId=", this.a, ", agreementsList=", Extension.C_BRAKE, this.b);
    }
}
