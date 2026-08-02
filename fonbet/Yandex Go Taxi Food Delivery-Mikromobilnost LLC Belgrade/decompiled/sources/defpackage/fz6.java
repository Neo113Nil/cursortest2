package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class fz6 {
    public final boolean a;
    public final List b;
    public final LinkedHashMap c;

    public fz6(boolean z, List list, LinkedHashMap linkedHashMap) {
        this.a = z;
        this.b = list;
        this.c = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz6)) {
            return false;
        }
        fz6 fz6Var = (fz6) obj;
        return this.a == fz6Var.a && jl40.l(this.b, fz6Var.b) && this.c.equals(fz6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "ButtonClickPayload(isAvailablePaymentChosen=" + this.a + ", availablePaymentTypes=" + this.b + ", meta=" + this.c + Extension.C_BRAKE;
    }
}
