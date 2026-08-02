package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class q00 {
    public final st9 a;
    public final yj9 b;

    public /* synthetic */ q00(yj9 yj9Var, int i) {
        this(qt9.a, (i & 2) != 0 ? new yj9(null, "", null) : yj9Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q00)) {
            return false;
        }
        q00 q00Var = (q00) obj;
        return jl40.l(this.a, q00Var.a) && jl40.l(this.b, q00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ActivateDiscountState(activateResult=" + this.a + ", chargersActivateDiscount=" + this.b + Extension.C_BRAKE;
    }

    public q00(st9 st9Var, yj9 yj9Var) {
        this.a = st9Var;
        this.b = yj9Var;
    }

    public q00() {
        this((yj9) null, 3);
    }
}
