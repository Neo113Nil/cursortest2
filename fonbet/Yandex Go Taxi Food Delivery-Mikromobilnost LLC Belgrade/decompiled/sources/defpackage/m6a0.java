package defpackage;

import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes9.dex */
public final class m6a0 {
    public final PaymentMethod$Type a;
    public final String b;
    public final m6a0 c;

    public m6a0(PaymentMethod$Type paymentMethod$Type, String str, m6a0 m6a0Var) {
        this.a = paymentMethod$Type;
        this.b = str;
        this.c = m6a0Var;
    }

    public final boolean a() {
        return this.c != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m6a0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        m6a0 m6a0Var = (m6a0) obj;
        return this.a == m6a0Var.a && jl40.l(this.b, m6a0Var.b) && jl40.l(this.c, m6a0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        m6a0 m6a0Var = this.c;
        return hashCode2 + (m6a0Var != null ? m6a0Var.hashCode() : 0);
    }
}
