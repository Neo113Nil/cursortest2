package defpackage;

import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class e33 {
    public final lea0 a;
    public final d33 b;

    public e33(lea0 lea0Var, d33 d33Var) {
        this.a = lea0Var;
        this.b = d33Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!e33.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        e33 e33Var = (e33) obj;
        lea0 lea0Var = e33Var.a;
        if (!jl40.l(this.b, e33Var.b)) {
            return false;
        }
        lea0 lea0Var2 = this.a;
        if (jl40.l(lea0Var2 != null ? lea0Var2.getId() : null, lea0Var != null ? lea0Var.getId() : null)) {
            return (lea0Var2 != null ? lea0Var2.c() : null) == (lea0Var != null ? lea0Var.c() : null);
        }
        return false;
    }

    public final int hashCode() {
        lea0 lea0Var = this.a;
        String id = lea0Var != null ? lea0Var.getId() : null;
        int hashCode = (id != null ? id.hashCode() : 0) * 31;
        PaymentMethod$Type c = lea0Var != null ? lea0Var.c() : null;
        int hashCode2 = (hashCode + (c != null ? c.hashCode() : 0)) * 31;
        d33 d33Var = this.b;
        return hashCode2 + (d33Var != null ? d33Var.hashCode() : 0);
    }

    public e33() {
        this(null, null);
    }
}
