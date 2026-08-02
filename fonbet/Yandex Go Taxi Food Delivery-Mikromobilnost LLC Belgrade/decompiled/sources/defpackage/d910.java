package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class d910 {
    public final String a;
    public final ArrayList b;

    public d910(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d910)) {
            return false;
        }
        d910 d910Var = (d910) obj;
        return jl40.l(this.a, d910Var.a) && this.b.equals(d910Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return n.k("Me2MeDebitAutoPullScreenStatusSuccessEntity(agreementsSheetTitle=", this.a, ", agreements=", Extension.C_BRAKE, this.b);
    }
}
