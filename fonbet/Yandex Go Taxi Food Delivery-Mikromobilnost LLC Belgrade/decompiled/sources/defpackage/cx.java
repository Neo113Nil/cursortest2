package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class cx extends nr {
    public final List a;
    public final ea91 b;
    public final m07 c;
    public final m07 d;

    public cx(List list, ea91 ea91Var, m07 m07Var, m07 m07Var2) {
        this.a = list;
        this.b = ea91Var;
        this.c = m07Var;
        this.d = m07Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx)) {
            return false;
        }
        cx cxVar = (cx) obj;
        return jl40.l(this.a, cxVar.a) && this.b.equals(cxVar.b) && this.c.equals(cxVar.c) && this.d.equals(cxVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ActionPayNow(availablePaymentTypes=" + this.a + ", paymentItem=" + this.b + ", paymentChosenButton=" + this.c + ", aboutToChooseButton=" + this.d + Extension.C_BRAKE;
    }
}
