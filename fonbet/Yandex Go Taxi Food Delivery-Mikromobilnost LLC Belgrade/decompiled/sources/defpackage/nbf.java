package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class nbf {
    public final ArrayList a;
    public final List b;
    public final int c;

    public nbf(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList.size() + (arrayList2 != null ? arrayList2.size() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbf)) {
            return false;
        }
        nbf nbfVar = (nbf) obj;
        return this.a.equals(nbfVar.a) && jl40.l(this.b, nbfVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "CreditPaymentMethodListEntity(paymentMethods=" + this.a + ", additionalButtons=" + this.b + Extension.C_BRAKE;
    }
}
