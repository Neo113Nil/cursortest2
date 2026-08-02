package defpackage;

import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class d33 {
    public final boolean a;
    public final h8b0 b;

    public d33(h8b0 h8b0Var, boolean z) {
        this.a = z;
        this.b = h8b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d33.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        d33 d33Var = (d33) obj;
        h8b0 h8b0Var = d33Var.b;
        if (this.a != d33Var.a) {
            return false;
        }
        h8b0 h8b0Var2 = this.b;
        if (!jl40.l(h8b0Var2.a, h8b0Var.a)) {
            return false;
        }
        h8b0Var2.getClass();
        b4a0 b4a0Var = PaymentMethod$Type.Companion;
        h8b0Var.getClass();
        return true;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        h8b0 h8b0Var = this.b;
        int hashCode2 = (h8b0Var.a.hashCode() + hashCode) * 31;
        h8b0Var.getClass();
        return PaymentMethod$Type.PERSONAL_WALLET.hashCode() + hashCode2;
    }
}
