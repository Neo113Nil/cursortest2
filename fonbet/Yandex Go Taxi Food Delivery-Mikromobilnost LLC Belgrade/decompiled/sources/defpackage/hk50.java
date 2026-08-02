package defpackage;

import java.util.Set;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.requirements.models.net.RequirementsParam;

/* loaded from: classes6.dex */
public final class hk50 {
    public final Set a;
    public final String b;
    public final RequirementsParam c;
    public final rfa0 d;
    public final boolean e;

    public hk50(Set set, String str, RequirementsParam requirementsParam, rfa0 rfa0Var, boolean z) {
        this.a = set;
        this.b = str;
        this.c = requirementsParam;
        this.d = rfa0Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!hk50.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        hk50 hk50Var = (hk50) obj;
        if (!jl40.l(this.a, hk50Var.a) || !jl40.l(this.b, hk50Var.b) || !jl40.l(this.c, hk50Var.c)) {
            return false;
        }
        rfa0 rfa0Var = this.d;
        PaymentMethod$Type paymentMethod$Type = rfa0Var != null ? rfa0Var.a : null;
        rfa0 rfa0Var2 = hk50Var.d;
        return paymentMethod$Type == (rfa0Var2 != null ? rfa0Var2.a : null) && this.e == hk50Var.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        RequirementsParam requirementsParam = this.c;
        int hashCode3 = (hashCode2 + (requirementsParam != null ? requirementsParam.hashCode() : 0)) * 31;
        rfa0 rfa0Var = this.d;
        PaymentMethod$Type paymentMethod$Type = rfa0Var != null ? rfa0Var.a : null;
        return Boolean.hashCode(this.e) + ((hashCode3 + (paymentMethod$Type != null ? paymentMethod$Type.hashCode() : 0)) * 31);
    }
}
